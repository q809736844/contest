package com.contest.domain;

/**
 * @program: contest
 * @description: 宝箱
 * @author: guoyunhao
 * @create: 2020-12-31 15:07
 */
public class TreasureChest {
    private String id;
    private String timeStamp;
    private String hash;
    private String preHash;
    private int mysteriousNumber;

    @Override
    public String toString() {
        return "TreasureChest{" +
                "id='" + id + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
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

    public String getTimeStamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
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
