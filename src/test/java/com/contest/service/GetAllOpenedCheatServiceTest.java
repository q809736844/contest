package com.contest.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetAllOpenedCheatServiceTest {
    GetAllOpenedCheatService getAllOpenedCheatService = new GetAllOpenedCheatService();
    @Test
    public void should_return_true_prehash() {
        String preHash = getAllOpenedCheatService.getPreHash(1);
        assertEquals("0",preHash);
    }
}