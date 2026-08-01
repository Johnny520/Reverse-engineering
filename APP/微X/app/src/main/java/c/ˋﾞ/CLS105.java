// Decompiled by JEB v5.42.0.202606242140

package c.ˋﾞ;

public final class CLS105 {
    public final CLS106 FLD352;
    public static final CLS105 FLD353;
    public static final CLS105 FLD354;
    public final int FLD355;
    public static final CLS105 FLD356;
    public final CLS106 FLD357;
    public static final CLS105 FLD358;
    public final int FLD359;
    public static final CLS105 FLD360;
    public static final CLS105 FLD361;
    public static final CLS105 FLD362;
    public static final CLS105 FLD363;
    public final int[] FLD364;
    public final int FLD365;
    public final int[] FLD366;

    static {
        CLS105.FLD362 = new CLS105(4201, 0x1000, 1);
        CLS105.FLD353 = new CLS105(0x409, 0x400, 1);
        CLS105 ⁱˋ0 = new CLS105(67, 0x40, 1);
        CLS105.FLD363 = ⁱˋ0;
        CLS105.FLD358 = new CLS105(19, 16, 1);
        CLS105.FLD354 = new CLS105(285, 0x100, 0);
        CLS105 ⁱˋ1 = new CLS105(301, 0x100, 1);
        CLS105.FLD356 = ⁱˋ1;
        CLS105.FLD360 = ⁱˋ1;
        CLS105.FLD361 = ⁱˋ0;
    }

    public CLS105(int v, int v1, int v2) {
        this.FLD359 = v;
        this.FLD355 = v1;
        this.FLD365 = v2;
        this.FLD364 = new int[v1];
        this.FLD366 = new int[v1];
        int v4 = 1;
        for(int v3 = 0; v3 < v1; ++v3) {
            this.FLD364[v3] = v4;
            v4 <<= 1;
            v4 = v4 < v1 ? v4 << 1 : (v4 ^ v) & v1 - 1;
        }
        for(int v5 = 0; v5 < v1 - 1; ++v5) {
            this.FLD366[this.FLD364[v5]] = v5;
        }
        this.FLD352 = new CLS106(this, new int[]{0});
        this.FLD357 = new CLS106(this, new int[]{1});
    }

    @Override
    public String toString() {
        return "GF(0x" + Integer.toHexString(this.FLD359) + ',' + this.FLD355 + ')';
    }

    public int MTH1414(int v) {
        return this.FLD364[v];
    }

    public int MTH1415(int v) {
        if(v == 0) {
            throw new IllegalArgumentException();
        }
        return this.FLD366[v];
    }

    public CLS106 MTH1416() {
        return this.FLD357;
    }

    public int MTH1417() {
        return this.FLD365;
    }

    public int MTH1418() {
        return this.FLD355;
    }

    public int MTH1419(int v) {
        if(v == 0) {
            throw new ArithmeticException();
        }
        return this.FLD364[this.FLD355 - this.FLD366[v] - 1];
    }

    public int MTH1420(int v, int v1) {
        return v == 0 || v1 == 0 ? 0 : this.FLD364[(this.FLD366[v] + this.FLD366[v1]) % (this.FLD355 - 1)];
    }

    public static int MTH1421(int v, int v1) {
        return v ^ v1;
    }

    public CLS106 MTH1422() {
        return this.FLD352;
    }

    public CLS106 MTH1423(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.FLD352;
        }
        int[] arr_v = new int[v + 1];
        arr_v[0] = v1;
        return new CLS106(this, arr_v);
    }
}

