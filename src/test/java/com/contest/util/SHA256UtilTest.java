package com.contest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class SHA256UtilTest {

    @Test
    public void should_return_true_hash() {
        String hash = SHA256Util.getSHA256StrJava("103229170");
        assertEquals("0000079dda0cef8b640efd9d6a475fb179f29e52f9f0800f47f58d3998a20b15",hash);
    }
}