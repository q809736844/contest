package com.contest.service;

import com.contest.domain.TreasureChest;
import org.junit.Test;

import static org.junit.Assert.*;

public class OpenTreasureChestServiceTest {
    private OpenTreasureChestService openTreasureChestService = new OpenTreasureChestService();
    @Test
    public void should_return_true_cheat() {
        TreasureChest treasureChest = new TreasureChest("1","0");
        openTreasureChestService.openTreasureChest(treasureChest);
        assertEquals(3229170,treasureChest.getMysteriousNumber());
    }
    @Test
    public void should_return_error_cheat() {
        TreasureChest treasureChest = new TreasureChest("1","1");
        openTreasureChestService.openTreasureChest(treasureChest);
        assertEquals(3229170,treasureChest.getMysteriousNumber());
    }
    @Test
    public void should_return_true_hash() {
        TreasureChest treasureChest = new TreasureChest("1","0");
        String result = openTreasureChestService.getNeedHashString(treasureChest,1);
        assertEquals("101",result);
    }

    @Test
    public void should_return_error_hash() {
        TreasureChest treasureChest = new TreasureChest("1","0");
        String result = openTreasureChestService.getNeedHashString(treasureChest,1);
        assertEquals("102",result);
    }
    @Test
    public void should_return_true_boolean() {
        String resultHash = "000002sdf";
        boolean isflag = openTreasureChestService.isConformNeed(resultHash);
        assertEquals(true,isflag);
    }
    @Test
    public void should_return_error_boolean() {
        String resultHash = "0000sdf";
        boolean isflag = openTreasureChestService.isConformNeed(resultHash);
        assertEquals(false,isflag);
    }
}