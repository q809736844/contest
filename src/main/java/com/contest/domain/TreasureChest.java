package com.contest.domain;

/**
 * @program: contest
 * @description: 宝箱
 * @author: guoyunhao
 * @create: 2020-12-31 15:07
 */
public class TreasureChest {
    /** 宝箱id */
    private String id;
    /** 宝箱hash值 */
    private String hash;
    /** 上一个宝箱hash值 */
    private String preHash;
    /** 神秘数字 */
    private int mysteriousNumber;

    @Override
    public String toString() {
        return "TreasureChest{" +
                "id='" + id + '\'' +
                ", hash='" + hash + '\'' +
                ", preHash='" + preHash + '\'' +
                ", mysteriousNumber=" + mysteriousNumber +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreHash() {
        return preHash;
    }

    public void setPreHash(String preHash) {
        this.preHash = preHash;
    }

    public int getMysteriousNumber() {
        return mysteriousNumber;
    }

    public void setMysteriousNumber(int mysteriousNumber) {
        this.mysteriousNumber = mysteriousNumber;
    }
}
