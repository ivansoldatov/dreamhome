package model;

public class Branch {
    private int bNum;
    private String bName;

    public Branch(int bNum, String bName) {
        this.bNum = bNum;
        this.bName = bName;
    }

    public int getBNum() {
        return bNum;
    }
    public void setBNum(int bNum) {
        this.bNum = bNum;
    }

    public String getBName() {
        return bName;
    }
    public void setBName(String bName) {
        this.bName = bName;
    }

    @Override
    public String toString() {
        return bName + " номер " + bNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        if (bNum != branch.bNum) return false;
        return bName.equals(branch.bName);
    }
    @Override
    public int hashCode() {
        int result = bNum;
        result = 31 * result + bName.hashCode();
        return result;
    }
}
