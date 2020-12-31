package com.contest.service;

import com.contest.domain.TreasureChest;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: contest
 * @description: 得到所有打开的箱子
 * @author: guoyunhao
 * @create: 2020-12-31 16:50
 */
public class GetAllOpenedCheatService {
    /** 获取service*/
    private OpenTreasureChestService openTreasureChestService = new OpenTreasureChestService();
    /** 箱子数组*/
    private List<TreasureChest> treasureChestList = new ArrayList<>();
    /** 箱子数量*/
    private static final int SIZE = 10;
    /** 第一个箱子*/
    private static final int FIRST = 1;
    public List<TreasureChest> getAllCheat(){
        addOpenedChest();
        return treasureChestList;
    }
    private static final String ZERO_HASH = "0";

    /**
     *@Description: 增加打开的宝箱
     *@Param: List<TreasureChest> treasureChestList
     *@return: List<TreasureChest>
     *@Author: guoyunhao
     *@date: 2020/12/31
     */
    public List<TreasureChest> addOpenedChest(){
        for(int i=FIRST;i<=SIZE;i++){
            String preHash = getPreHash(i);
            TreasureChest treasureChest = new TreasureChest(String.valueOf(i),preHash);
            openTreasureChestService.openTreasureChest(treasureChest);
            treasureChestList.add(treasureChest);
        }
        return treasureChestList;
    }
    /**
     *@Description: 获取上一个箱子的HASH值
     *@Param: int boxId,TreasureChest treasureChest
     *@return: String
     *@Author: guoyunhao
     *@date: 2020/12/31
     */
    public String getPreHash(int boxId){
        return boxId == FIRST ? ZERO_HASH : treasureChestList.get(boxId-2).getHash();
    }
}
