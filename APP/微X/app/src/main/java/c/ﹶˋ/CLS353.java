// Decompiled by JEB v5.42.0.202606242140

package c.ﹶˋ;

public final class CLS353 {
    public final int FLD1602;
    public int FLD1603;
    public final int FLD1604;
    public final int FLD1605;
    public final int FLD1606;

    public CLS353(int v, int v1, int v2, int v3) {
        this.FLD1603 = -1;
        this.FLD1605 = v;
        this.FLD1606 = v1;
        this.FLD1602 = v2;
        this.FLD1604 = v3;
    }

    @Override
    public String toString() {
        return this.FLD1603 + "|" + this.FLD1604;
    }

    public int MTH4867() {
        return this.FLD1603;
    }

    public void MTH4868(int v) {
        this.FLD1603 = v;
    }

    public int MTH4869() {
        return this.FLD1604;
    }

    public int MTH4870() {
        return this.FLD1605;
    }

    public int MTH4871() {
        return this.FLD1606 - this.FLD1605;
    }

    public boolean MTH4872(int v) {
        return v != -1 && this.FLD1602 == v % 3 * 3;
    }

    public void MTH4873() {
        this.FLD1603 = this.FLD1604 / 30 * 3 + this.FLD1602 / 3;
    }

    public int MTH4874() {
        return this.FLD1602;
    }

    public boolean MTH4875() {
        return this.MTH4872(this.FLD1603);
    }

    public int MTH4876() {
        return this.FLD1606;
    }
}

