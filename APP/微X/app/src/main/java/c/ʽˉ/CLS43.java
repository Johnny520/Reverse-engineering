// Decompiled by JEB v5.42.0.202606242140

package c.ʽˉ;

public final class CLS43 {
    public static enum CLS42 {
        FLD160,
        FLD159,
        FLD161;

    }

    public CLS42 FLD163;
    public int FLD164;

    public CLS43() {
        this.FLD164 = 0;
        this.FLD163 = CLS42.FLD160;
    }

    public void MTH950(int v) {
        this.FLD164 += v;
    }

    public void MTH951() {
        this.FLD163 = CLS42.FLD159;
    }

    public int MTH952() {
        return this.FLD164;
    }

    public boolean MTH953() {
        return this.FLD163 == CLS42.FLD159;
    }

    public void MTH954() {
        this.FLD163 = CLS42.FLD160;
    }

    public void MTH955(int v) {
        this.FLD164 = v;
    }

    public void MTH956() {
        this.FLD163 = CLS42.FLD161;
    }

    public boolean MTH957() {
        return this.FLD163 == CLS42.FLD161;
    }
}

