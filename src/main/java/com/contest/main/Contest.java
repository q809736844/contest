package com.contest.main;

import com.contest.domain.TreasureChest;
import com.contest.service.GetAllOpenedCheatService;
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
        GetAllOpenedCheatService getAllOpenedCheatService = new GetAllOpenedCheatService();
        List<TreasureChest> list = getAllOpenedCheatService.getAllCheat();
        for (TreasureChest t:
             list) {
            System.out.println(t.toString());
        }
    }
}
