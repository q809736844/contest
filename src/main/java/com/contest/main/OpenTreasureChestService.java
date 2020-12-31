package com.contest.main;

import com.contest.domain.TreasureChest;

/**
 * @program: contest
 * @description: 打开宝箱
 * @author: guoyunhao
 * @create: 2020-12-31 15:19
 */
public class OpenTreasureChestService {
    public void openTreasureChest(TreasureChest treasureChest) {
        treasureChest.setHash("00000");
    }
}
