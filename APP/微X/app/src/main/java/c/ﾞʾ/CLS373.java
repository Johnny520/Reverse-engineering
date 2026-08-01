// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

public final class CLS373 {
    public final int FLD1638;
    public int FLD1639;
    public final int FLD1640;
    public final int FLD1641;
    public final int FLD1642;

    public CLS373(int v, int v1, int v2, int v3) {
        this.FLD1639 = -1;
        this.FLD1640 = v;
        this.FLD1638 = v1;
        this.FLD1641 = v2;
        this.FLD1642 = v3;
    }

    @Override
    public String toString() {
        return this.FLD1639 + "|" + this.FLD1642;
    }

    public int MTH5065() {
        return this.FLD1638;
    }

    public int MTH5066() {
        return this.FLD1642;
    }

    public int MTH5067() {
        return this.FLD1641;
    }

    public void MTH5068(int v) {
        this.FLD1639 = v;
    }

    public void MTH5069() {
        this.FLD1639 = this.FLD1642 / 30 * 3 + this.FLD1641 / 3;
    }

    public int MTH5070() {
        return this.FLD1639;
    }

    public boolean MTH5071() {
        return this.MTH5072(this.FLD1639);
    }

    public boolean MTH5072(int v) {
        return v != -1 && this.FLD1641 == v % 3 * 3;
    }

    public int MTH5073() {
        return this.FLD1638 - this.FLD1640;
    }

    public int MTH5074() {
        return this.FLD1640;
    }
}

