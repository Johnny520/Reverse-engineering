// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʻ;

public final class CLS275 {
    public static enum CLS274 {
        FLD1078,
        FLD1079,
        FLD1076;

    }

    public int FLD1080;
    public CLS274 FLD1081;

    public CLS275() {
        this.FLD1080 = 0;
        this.FLD1081 = CLS274.FLD1078;
    }

    public boolean MTH3521() {
        return this.FLD1081 == CLS274.FLD1079;
    }

    public void MTH3522() {
        this.FLD1081 = CLS274.FLD1079;
    }

    public boolean MTH3523() {
        return this.FLD1081 == CLS274.FLD1076;
    }

    public void MTH3524() {
        this.FLD1081 = CLS274.FLD1076;
    }

    public void MTH3525(int v) {
        this.FLD1080 = v;
    }

    public int MTH3526() {
        return this.FLD1080;
    }

    public void MTH3527() {
        this.FLD1081 = CLS274.FLD1078;
    }

    public void MTH3528(int v) {
        this.FLD1080 += v;
    }
}

