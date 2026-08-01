// Decompiled by JEB v5.42.0.202606242140

package c.ˎˊ;

public final class CLS121 {
    public int FLD582;
    public final byte[] FLD583;
    public int FLD584;

    public CLS121(byte[] arr_b) {
        this.FLD583 = arr_b;
    }

    public int MTH2378() {
        return this.FLD584;
    }

    public int MTH2379() {
        return (this.FLD583.length - this.FLD582) * 8 - this.FLD584;
    }

    public int MTH2380() {
        return this.FLD582;
    }

    public int MTH2381(int v) {
        if(v <= 0 || v > 0x20 || v > this.MTH2379()) {
            throw new IllegalArgumentException(String.valueOf(v));
        }
        int v1 = this.FLD584;
        int v2 = 0;
        if(v1 > 0) {
            int v3 = v >= 8 - v1 ? 8 - v1 : v;
            int v4 = 8 - v1 - v3;
            int v5 = this.FLD582;
            int v6 = (0xFF >> 8 - v3 << v4 & this.FLD583[v5]) >> v4;
            v -= v3;
            int v7 = v1 + v3;
            this.FLD584 = v7;
            if(v7 == 8) {
                this.FLD584 = 0;
                this.FLD582 = v5 + 1;
            }
            v2 = v6;
        }
        if(v > 0) {
            while(v >= 8) {
                int v8 = this.FLD582;
                v2 = this.FLD583[v8] & 0xFF | v2 << 8;
                this.FLD582 = v8 + 1;
                v -= 8;
            }
            if(v > 0) {
                v2 = v2 << v | (0xFF >> 8 - v << 8 - v & this.FLD583[this.FLD582]) >> 8 - v;
                this.FLD584 += v;
            }
        }
        return v2;
    }
}

