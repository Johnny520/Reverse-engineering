// Decompiled by JEB v5.42.0.202606242140

package c.ᵢˎ;

import c.ﾞʾ.CLS366;
import com.google.zxing.FormatException;

public final class CLS328 {
    public CLS324 FLD1544;
    public boolean FLD1545;
    public final CLS366 FLD1546;
    public CLS327 FLD1547;

    public CLS328(CLS366 ﾞⁱ0) {
        int v = ﾞⁱ0.MTH5046();
        if(v < 21 || (v & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.FLD1546 = ﾞⁱ0;
    }

    public byte[] MTH4751() {
        CLS324 ˋʼ0 = this.MTH4753();
        CLS327 ᵔʼ0 = this.MTH4752();
        CLS321 ʾʻ0 = CLS321.values()[ˋʼ0.MTH4724()];
        int v = this.FLD1546.MTH5046();
        ʾʻ0.MTH4706(this.FLD1546, v);
        CLS366 ﾞⁱ0 = ᵔʼ0.MTH4747();
        byte[] arr_b = new byte[ᵔʼ0.MTH4745()];
        int v1 = 1;
        int v2 = v - 1;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(v2 > 0) {
            if(v2 == 6) {
                v2 = 5;
            }
            for(int v6 = 0; v6 < v; ++v6) {
                int v7 = v1 == 0 ? v6 : v - 1 - v6;
                for(int v8 = 0; v8 < 2; ++v8) {
                    int v9 = v2 - v8;
                    if(!ﾞⁱ0.MTH5038(v9, v7)) {
                        ++v4;
                        v5 <<= 1;
                        v5 = this.FLD1546.MTH5038(v9, v7) ? v5 | 1 : v5 << 1;
                        if(v4 == 8) {
                            arr_b[v3] = (byte)v5;
                            ++v3;
                            v4 = 0;
                            v5 = 0;
                        }
                    }
                }
            }
            v1 ^= 1;
            v2 -= 2;
        }
        if(v3 != ᵔʼ0.MTH4745()) {
            throw FormatException.getFormatInstance();
        }
        return arr_b;
    }

    public CLS327 MTH4752() {
        CLS327 ᵔʼ0 = this.FLD1547;
        if(ᵔʼ0 != null) {
            return ᵔʼ0;
        }
        int v = this.FLD1546.MTH5046();
        int v1 = (v - 17) / 4;
        if(v1 <= 6) {
            return CLS327.MTH4741(v1);
        }
        int v3 = 0;
        int v4 = 0;
        for(int v5 = 5; v5 >= 0; --v5) {
            for(int v6 = v - 9; v6 >= v - 11; --v6) {
                v4 = this.MTH4755(v6, v5, v4);
            }
        }
        CLS327 ᵔʼ1 = CLS327.MTH4740(v4);
        if(ᵔʼ1 != null && ᵔʼ1.MTH4742() == v) {
            this.FLD1547 = ᵔʼ1;
            return ᵔʼ1;
        }
        for(int v2 = 5; v2 >= 0; --v2) {
            for(int v7 = v - 9; v7 >= v - 11; --v7) {
                v3 = this.MTH4755(v2, v7, v3);
            }
        }
        CLS327 ᵔʼ2 = CLS327.MTH4740(v3);
        if(ᵔʼ2 == null || ᵔʼ2.MTH4742() != v) {
            throw FormatException.getFormatInstance();
        }
        this.FLD1547 = ᵔʼ2;
        return ᵔʼ2;
    }

    public CLS324 MTH4753() {
        CLS324 ˋʼ0 = this.FLD1544;
        if(ˋʼ0 != null) {
            return ˋʼ0;
        }
        int v = 0;
        int v1 = 0;
        for(int v2 = 0; v2 < 6; ++v2) {
            v1 = this.MTH4755(v2, 8, v1);
        }
        int v3 = this.MTH4755(8, 7, this.MTH4755(8, 8, this.MTH4755(7, 8, v1)));
        for(int v4 = 5; v4 >= 0; --v4) {
            v3 = this.MTH4755(8, v4, v3);
        }
        int v5 = this.FLD1546.MTH5046();
        for(int v6 = v5 - 1; v6 >= v5 - 7; --v6) {
            v = this.MTH4755(8, v6, v);
        }
        for(int v7 = v5 - 8; v7 < v5; ++v7) {
            v = this.MTH4755(v7, 8, v);
        }
        CLS324 ˋʼ1 = CLS324.MTH4727(v3, v);
        this.FLD1544 = ˋʼ1;
        if(ˋʼ1 == null) {
            throw FormatException.getFormatInstance();
        }
        return ˋʼ1;
    }

    public void MTH4754() {
        if(this.FLD1544 == null) {
            return;
        }
        CLS321[] arr_ʾʻ = CLS321.values();
        arr_ʾʻ[this.FLD1544.MTH4724()].MTH4706(this.FLD1546, this.FLD1546.MTH5046());
    }

    // 去混淆评级： 低(40)
    public final int MTH4755(int v, int v1, int v2) {
        return (this.FLD1545 ? this.FLD1546.MTH5038(v1, v) : this.FLD1546.MTH5038(v, v1)) ? v2 << 1 | 1 : v2 << 1;
    }

    public void MTH4756(boolean z) {
        this.FLD1547 = null;
        this.FLD1544 = null;
        this.FLD1545 = z;
    }

    public void MTH4757() {
        for(int v = 0; v < this.FLD1546.MTH5044(); ++v) {
            for(int v1 = v + 1; v1 < this.FLD1546.MTH5046(); ++v1) {
                if(this.FLD1546.MTH5038(v, v1) != this.FLD1546.MTH5038(v1, v)) {
                    this.FLD1546.MTH5033(v1, v);
                    this.FLD1546.MTH5033(v, v1);
                }
            }
        }
    }
}

