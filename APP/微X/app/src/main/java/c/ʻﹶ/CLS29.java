// Decompiled by JEB v5.42.0.202606242140

package c.ʻﹶ;

public final class CLS29 {
    public final int[] FLD121;
    public final int FLD122;
    public final int[] FLD123;
    public final CLS31 FLD124;
    public static final CLS29 FLD125;
    public final CLS31 FLD126;

    static {
        CLS29.FLD125 = new CLS29(929, 3);
    }

    public CLS29(int v, int v1) {
        this.FLD122 = v;
        this.FLD123 = new int[v];
        this.FLD121 = new int[v];
        int v3 = 1;
        for(int v2 = 0; v2 < v; ++v2) {
            this.FLD123[v2] = v3;
            v3 = v3 * v1 % v;
        }
        for(int v4 = 0; v4 < v - 1; ++v4) {
            this.FLD121[this.FLD123[v4]] = v4;
        }
        this.FLD124 = new CLS31(this, new int[]{0});
        this.FLD126 = new CLS31(this, new int[]{1});
    }

    public CLS31 MTH804(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.FLD124;
        }
        int[] arr_v = new int[v + 1];
        arr_v[0] = v1;
        return new CLS31(this, arr_v);
    }

    public int MTH805() {
        return this.FLD122;
    }

    public int MTH806(int v, int v1) {
        return (v + v1) % this.FLD122;
    }

    public int MTH807(int v, int v1) {
        return v == 0 || v1 == 0 ? 0 : this.FLD123[(this.FLD121[v] + this.FLD121[v1]) % (this.FLD122 - 1)];
    }

    public int MTH808(int v, int v1) {
        return (v + this.FLD122 - v1) % this.FLD122;
    }

    public int MTH809(int v) {
        return this.FLD123[v];
    }

    public int MTH810(int v) {
        if(v == 0) {
            throw new ArithmeticException();
        }
        return this.FLD123[this.FLD122 - this.FLD121[v] - 1];
    }

    public int MTH811(int v) {
        if(v == 0) {
            throw new IllegalArgumentException();
        }
        return this.FLD121[v];
    }

    public CLS31 MTH812() {
        return this.FLD124;
    }

    public CLS31 MTH813() {
        return this.FLD126;
    }
}

