package com.contest.main;

import com.contest.domain.TreasureChest;
import com.contest.service.OpenTreasureChestService;

import java.util.*;

/**
 * @program: contest
 * @description: 主函数
 * @author: guoyunhao
 * @create: 2020-12-31 16:04
 */
public class Contest {
    public static void main(String[] args) {
        List<TreasureChest> list = new ArrayList<>();
        String preHash = "0";
        OpenTreasureChestService openTreasureChestService = new OpenTreasureChestService();
        for(int i=1;i<=10;i++){
            preHash = i==1?"0":list.get(i-2).getHash();
            TreasureChest treasureChest = new TreasureChest(String.valueOf(i),preHash);

            openTreasureChestService.openTreasureChest(treasureChest);
            list.add(treasureChest);
        }

        for (TreasureChest t:
             list) {
            System.out.println(t.toString());
        }
    }
}
