package com.contest.service;

import com.contest.domain.TreasureChest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OpenTreasureChestTest{
    OpenTreasureChestService openTreasureChest = new OpenTreasureChestService();
    private TreasureChest treasureChest;

    @Test
    public void testOpenTreasureChest() {
        treasureChest = new TreasureChest("1","0");
        openTreasureChest.openTreasureChest(treasureChest);
        assertEquals("00000",treasureChest.getHash().substring(0,5));
    }
}