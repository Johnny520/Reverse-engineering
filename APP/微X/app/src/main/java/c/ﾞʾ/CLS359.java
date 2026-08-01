// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

public final class CLS359 {
    public int FLD1621;
    public final byte[] FLD1622;
    public int FLD1623;

    public CLS359(byte[] arr_b) {
        this.FLD1622 = arr_b;
    }

    public int MTH4947() {
        return this.FLD1623;
    }

    public int MTH4948(int v) {
        if(v <= 0 || v > 0x20 || v > this.MTH4949()) {
            throw new IllegalArgumentException(String.valueOf(v));
        }
        int v1 = this.FLD1621;
        int v2 = 0;
        if(v1 > 0) {
            int v3 = v >= 8 - v1 ? 8 - v1 : v;
            int v4 = 8 - v1 - v3;
            int v5 = this.FLD1623;
            int v6 = (0xFF >> 8 - v3 << v4 & this.FLD1622[v5]) >> v4;
            v -= v3;
            int v7 = v1 + v3;
            this.FLD1621 = v7;
            if(v7 == 8) {
                this.FLD1621 = 0;
                this.FLD1623 = v5 + 1;
            }
            v2 = v6;
        }
        if(v > 0) {
            while(v >= 8) {
                int v8 = this.FLD1623;
                v2 = this.FLD1622[v8] & 0xFF | v2 << 8;
                this.FLD1623 = v8 + 1;
                v -= 8;
            }
            if(v > 0) {
                v2 = v2 << v | (0xFF >> 8 - v << 8 - v & this.FLD1622[this.FLD1623]) >> 8 - v;
                this.FLD1621 += v;
            }
        }
        return v2;
    }

    public int MTH4949() {
        return (this.FLD1622.length - this.FLD1623) * 8 - this.FLD1621;
    }

    public int MTH4950() {
        return this.FLD1621;
    }
}

