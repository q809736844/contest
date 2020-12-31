package com.contest.service;

import com.contest.domain.TreasureChest;
import com.contest.util.SHA256Util;

/**
 * @program: contest
 * @description: 打开宝箱
 * @author: guoyunhao
 * @create: 2020-12-31 15:19
 */
public class OpenTreasureChestService {
    public void openTreasureChest(TreasureChest treasureChest) {
        StringBuilder hashString = new StringBuilder();
        hashString.append(treasureChest.getId())
                .append(treasureChest.getPreHash());
        boolean isFind = false;
        int num = 1;
        while(!isFind){
            String resultString = SHA256Util.getSHA256StrJava(hashString.toString()+num);
            if(resultString.substring(0,5).equals("00000")){
                isFind = true;
                treasureChest.setHash(resultString);
                treasureChest.setMysteriousNumber(num);
            }
            num++;
        }


    }
}
