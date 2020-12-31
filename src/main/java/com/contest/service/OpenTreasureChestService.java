package com.contest.service;

import com.contest.domain.TreasureChest;
import com.contest.util.SHA256Util;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: contest
 * @description: 打开宝箱
 * @author: guoyunhao
 * @create: 2020-12-31 15:19
 */
public class OpenTreasureChestService {
    private static final String PREFIX = "00000";
    /**
    *@Description: 打开箱子
    *@Param: TreasureChest treasureChest
    *@return:
    *@Author: guoyunhao
    *@date: 2020/12/31
    */
    public void openTreasureChest(TreasureChest treasureChest) {
        boolean isFind = false;
        int num = 1;
        while(!isFind){
            String needHashString = getNeedHashString(treasureChest,num);
            String resultString = SHA256Util.getSHA256StrJava(needHashString);
            if(isConformNeed(resultString)){
                isFind = true;
                setTreasureChest(treasureChest,resultString,num);
            }
            num++;
        }
    }
    /**
    *@Description: 设置宝箱属性
    *@Param:
    *@return:
    *@Author: guoyunhao
    *@date: 2020/12/31
    */
    private void setTreasureChest(TreasureChest treasureChest, String resultString, int num) {
        treasureChest.setHash(resultString);
        treasureChest.setMysteriousNumber(num);
    }

    /**
    *@Description: 获取需要计算的hash字符串
    *@Param: 
    *@return: 
    *@Author: guoyunhao
    *@date: 2020/12/31
    */
    public String getNeedHashString(TreasureChest treasureChest,int num){
        StringBuilder needHashString = new StringBuilder();
        needHashString.append(treasureChest.getId())
                .append(treasureChest.getPreHash())
                .append(String.valueOf(num));
        return needHashString.toString();
    }
    public boolean isConformNeed(String resultHash){
        return PREFIX.equals(resultHash.substring(0,5));
    }
}
