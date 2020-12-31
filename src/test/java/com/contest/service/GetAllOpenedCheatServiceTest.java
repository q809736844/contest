package com.contest.service;

import com.contest.domain.TreasureChest;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GetAllOpenedCheatServiceTest {
    GetAllOpenedCheatService getAllOpenedCheatService = new GetAllOpenedCheatService();
    @Test
    public void should_return_true_prehash() {
        String preHash = getAllOpenedCheatService.getPreHash(1);
        assertEquals("0",preHash);
    }

    @Test
    public void should_return_true_listArray(){
        List<TreasureChest> allCheat = getAllOpenedCheatService.getAllCheat();
        assertEquals(10,allCheat.size());
        assertEquals(3229170,allCheat.get(0).getMysteriousNumber());
        assertEquals(1135497,allCheat.get(1).getMysteriousNumber());
        assertEquals(2125891,allCheat.get(2).getMysteriousNumber());
        assertEquals(3041721,allCheat.get(3).getMysteriousNumber());
        assertEquals(179272,allCheat.get(4).getMysteriousNumber());
        assertEquals(1295904,allCheat.get(5).getMysteriousNumber());
    }
}