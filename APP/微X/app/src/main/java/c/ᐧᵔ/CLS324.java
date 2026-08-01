// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵔ;

import c.ˎˊ.CLS117;
import com.google.zxing.FormatException;

public final class CLS324 {
    public CLS329 FLD1485;
    public final CLS117 FLD1486;
    public CLS330 FLD1487;
    public boolean FLD1488;

    public CLS324(CLS117 ʻᵢ0) {
        int v = ʻᵢ0.MTH2328();
        if(v < 21 || (v & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.FLD1486 = ʻᵢ0;
    }

    public void MTH4698() {
        for(int v = 0; v < this.FLD1486.MTH2325(); ++v) {
            for(int v1 = v + 1; v1 < this.FLD1486.MTH2328(); ++v1) {
                if(this.FLD1486.MTH2331(v, v1) != this.FLD1486.MTH2331(v1, v)) {
                    this.FLD1486.MTH2327(v1, v);
                    this.FLD1486.MTH2327(v, v1);
                }
            }
        }
    }

    public CLS329 MTH4699() {
        CLS329 ٴⁱ0 = this.FLD1485;
        if(ٴⁱ0 != null) {
            return ٴⁱ0;
        }
        int v = this.FLD1486.MTH2328();
        int v1 = (v - 17) / 4;
        if(v1 <= 6) {
            return CLS329.MTH4744(v1);
        }
        int v3 = 0;
        int v4 = 0;
        for(int v5 = 5; v5 >= 0; --v5) {
            for(int v6 = v - 9; v6 >= v - 11; --v6) {
                v4 = this.MTH4700(v6, v5, v4);
            }
        }
        CLS329 ٴⁱ1 = CLS329.MTH4746(v4);
        if(ٴⁱ1 != null && ٴⁱ1.MTH4742() == v) {
            this.FLD1485 = ٴⁱ1;
            return ٴⁱ1;
        }
        for(int v2 = 5; v2 >= 0; --v2) {
            for(int v7 = v - 9; v7 >= v - 11; --v7) {
                v3 = this.MTH4700(v2, v7, v3);
            }
        }
        CLS329 ٴⁱ2 = CLS329.MTH4746(v3);
        if(ٴⁱ2 == null || ٴⁱ2.MTH4742() != v) {
            throw FormatException.getFormatInstance();
        }
        this.FLD1485 = ٴⁱ2;
        return ٴⁱ2;
    }

    // 去混淆评级： 低(40)
    public final int MTH4700(int v, int v1, int v2) {
        return (this.FLD1488 ? this.FLD1486.MTH2331(v1, v) : this.FLD1486.MTH2331(v, v1)) ? v2 << 1 | 1 : v2 << 1;
    }

    public byte[] MTH4701() {
        CLS330 ᴵⁱ0 = this.MTH4704();
        CLS329 ٴⁱ0 = this.MTH4699();
        CLS325 ـᵎ0 = CLS325.values()[ᴵⁱ0.MTH4758()];
        int v = this.FLD1486.MTH2328();
        ـᵎ0.MTH4726(this.FLD1486, v);
        CLS117 ʻᵢ0 = ٴⁱ0.MTH4743();
        byte[] arr_b = new byte[ٴⁱ0.MTH4748()];
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
                    if(!ʻᵢ0.MTH2331(v9, v7)) {
                        ++v4;
                        v5 <<= 1;
                        v5 = this.FLD1486.MTH2331(v9, v7) ? v5 | 1 : v5 << 1;
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
        if(v3 != ٴⁱ0.MTH4748()) {
            throw FormatException.getFormatInstance();
        }
        return arr_b;
    }

    public void MTH4702(boolean z) {
        this.FLD1485 = null;
        this.FLD1487 = null;
        this.FLD1488 = z;
    }

    public void MTH4703() {
        if(this.FLD1487 == null) {
            return;
        }
        CLS325[] arr_ـᵎ = CLS325.values();
        arr_ـᵎ[this.FLD1487.MTH4758()].MTH4726(this.FLD1486, this.FLD1486.MTH2328());
    }

    public CLS330 MTH4704() {
        CLS330 ᴵⁱ0 = this.FLD1487;
        if(ᴵⁱ0 != null) {
            return ᴵⁱ0;
        }
        int v = 0;
        int v1 = 0;
        for(int v2 = 0; v2 < 6; ++v2) {
            v1 = this.MTH4700(v2, 8, v1);
        }
        int v3 = this.MTH4700(8, 7, this.MTH4700(8, 8, this.MTH4700(7, 8, v1)));
        for(int v4 = 5; v4 >= 0; --v4) {
            v3 = this.MTH4700(8, v4, v3);
        }
        int v5 = this.FLD1486.MTH2328();
        for(int v6 = v5 - 1; v6 >= v5 - 7; --v6) {
            v = this.MTH4700(8, v6, v);
        }
        for(int v7 = v5 - 8; v7 < v5; ++v7) {
            v = this.MTH4700(v7, 8, v);
        }
        CLS330 ᴵⁱ1 = CLS330.MTH4757(v3, v);
        this.FLD1487 = ᴵⁱ1;
        if(ᴵⁱ1 == null) {
            throw FormatException.getFormatInstance();
        }
        return ᴵⁱ1;
    }
}

