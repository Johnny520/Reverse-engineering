// Decompiled by JEB v5.42.0.202606242140

package c.ˆᵢ;

public final class CLS80 {
    public final int[] FLD422;
    public static final CLS80 FLD423;
    public final int FLD424;
    public static final CLS80 FLD425;
    public final int[] FLD426;
    public static final CLS80 FLD427;
    public static final CLS80 FLD428;
    public static final CLS80 FLD429;
    public static final CLS80 FLD430;
    public static final CLS80 FLD431;
    public final CLS79 FLD432;
    public final int FLD433;
    public static final CLS80 FLD434;
    public final int FLD435;
    public final CLS79 FLD436;

    static {
        CLS80.FLD434 = new CLS80(4201, 0x1000, 1);
        CLS80.FLD429 = new CLS80(0x409, 0x400, 1);
        CLS80 ˆٴ0 = new CLS80(67, 0x40, 1);
        CLS80.FLD430 = ˆٴ0;
        CLS80.FLD427 = new CLS80(19, 16, 1);
        CLS80.FLD423 = new CLS80(285, 0x100, 0);
        CLS80 ˆٴ1 = new CLS80(301, 0x100, 1);
        CLS80.FLD431 = ˆٴ1;
        CLS80.FLD428 = ˆٴ1;
        CLS80.FLD425 = ˆٴ0;
    }

    public CLS80(int v, int v1, int v2) {
        this.FLD435 = v;
        this.FLD424 = v1;
        this.FLD433 = v2;
        this.FLD426 = new int[v1];
        this.FLD422 = new int[v1];
        int v4 = 1;
        for(int v3 = 0; v3 < v1; ++v3) {
            this.FLD426[v3] = v4;
            v4 <<= 1;
            v4 = v4 < v1 ? v4 << 1 : (v4 ^ v) & v1 - 1;
        }
        for(int v5 = 0; v5 < v1 - 1; ++v5) {
            this.FLD422[this.FLD426[v5]] = v5;
        }
        this.FLD432 = new CLS79(this, new int[]{0});
        this.FLD436 = new CLS79(this, new int[]{1});
    }

    @Override
    public String toString() {
        return "GF(0x" + Integer.toHexString(this.FLD435) + ',' + this.FLD424 + ')';
    }

    public CLS79 MTH1890(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.FLD432;
        }
        int[] arr_v = new int[v + 1];
        arr_v[0] = v1;
        return new CLS79(this, arr_v);
    }

    public CLS79 MTH1891() {
        return this.FLD436;
    }

    public static int MTH1892(int v, int v1) {
        return v ^ v1;
    }

    public int MTH1893(int v) {
        if(v == 0) {
            throw new IllegalArgumentException();
        }
        return this.FLD422[v];
    }

    public int MTH1894(int v, int v1) {
        return v == 0 || v1 == 0 ? 0 : this.FLD426[(this.FLD422[v] + this.FLD422[v1]) % (this.FLD424 - 1)];
    }

    public int MTH1895(int v) {
        return this.FLD426[v];
    }

    public CLS79 MTH1896() {
        return this.FLD432;
    }

    public int MTH1897(int v) {
        if(v == 0) {
            throw new ArithmeticException();
        }
        return this.FLD426[this.FLD424 - this.FLD422[v] - 1];
    }

    public int MTH1898() {
        return this.FLD424;
    }

    public int MTH1899() {
        return this.FLD433;
    }
}

