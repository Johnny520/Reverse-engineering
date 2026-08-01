// Decompiled by JEB v5.42.0.202606242140

package c.ʻٴ;

public final class CLS22 {
    public final CLS20 FLD109;
    public final int FLD110;
    public final CLS20 FLD111;
    public static final CLS22 FLD112;
    public final int[] FLD113;
    public final int[] FLD114;

    static {
        CLS22.FLD112 = new CLS22(929, 3);
    }

    public CLS22(int v, int v1) {
        this.FLD110 = v;
        this.FLD113 = new int[v];
        this.FLD114 = new int[v];
        int v3 = 1;
        for(int v2 = 0; v2 < v; ++v2) {
            this.FLD113[v2] = v3;
            v3 = v3 * v1 % v;
        }
        for(int v4 = 0; v4 < v - 1; ++v4) {
            this.FLD114[this.FLD113[v4]] = v4;
        }
        this.FLD109 = new CLS20(this, new int[]{0});
        this.FLD111 = new CLS20(this, new int[]{1});
    }

    public int MTH773(int v) {
        return this.FLD113[v];
    }

    public int MTH774(int v, int v1) {
        return v == 0 || v1 == 0 ? 0 : this.FLD113[(this.FLD114[v] + this.FLD114[v1]) % (this.FLD110 - 1)];
    }

    public int MTH775() {
        return this.FLD110;
    }

    public CLS20 MTH776() {
        return this.FLD111;
    }

    public CLS20 MTH777() {
        return this.FLD109;
    }

    public int MTH778(int v) {
        if(v == 0) {
            throw new IllegalArgumentException();
        }
        return this.FLD114[v];
    }

    public int MTH779(int v, int v1) {
        return (v + this.FLD110 - v1) % this.FLD110;
    }

    public int MTH780(int v, int v1) {
        return (v + v1) % this.FLD110;
    }

    public int MTH781(int v) {
        if(v == 0) {
            throw new ArithmeticException();
        }
        return this.FLD113[this.FLD110 - this.FLD114[v] - 1];
    }

    public CLS20 MTH782(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.FLD109;
        }
        int[] arr_v = new int[v + 1];
        arr_v[0] = v1;
        return new CLS20(this, arr_v);
    }
}

