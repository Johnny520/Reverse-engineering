// Decompiled by JEB v5.42.0.202606242140

package c.ˊﹳ;

import c.ˆᵢ.CLS80;
import c.ˆᵢ.CLS81;
import c.ˎʼ.CLS113;
import c.ˎʼ.CLS114;
import c.ˎˊ.CLS117;
import c.ˎˊ.CLS122;
import c.ٴʻ.CLS788;
import c.ﾞﹶ.CLS380;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class CLS97 {
    public static final class CLS96 {
        public final int FLD496;
        public final int FLD497;

        public CLS96(int v, int v1) {
            this.FLD497 = v;
            this.FLD496 = v1;
        }

        @Override
        public String toString() {
            return "<" + this.FLD497 + ' ' + this.FLD496 + '>';
        }

        public int MTH2052() {
            return this.FLD496;
        }

        public int MTH2053() {
            return this.FLD497;
        }

        public CLS380 MTH2054() {
            return new CLS380(((float)this.MTH2053()), ((float)this.MTH2052()));
        }
    }

    public boolean FLD498;
    public int FLD499;
    public final CLS117 FLD500;
    public int FLD501;
    public static final int[] FLD502;
    public int FLD503;
    public int FLD504;

    static {
        CLS97.FLD502 = new int[]{0xEE0, 476, 2107, 0x707};
    }

    public CLS97(CLS117 ʻᵢ0) {
        this.FLD500 = ʻᵢ0;
    }

    public static float MTH2057(CLS96 ˆٴ$ˆٴ0, CLS96 ˆٴ$ˆٴ1) {
        return CLS114.MTH2295(ˆٴ$ˆٴ0.MTH2053(), ˆٴ$ˆٴ0.MTH2052(), ˆٴ$ˆٴ1.MTH2053(), ˆٴ$ˆٴ1.MTH2052());
    }

    public final CLS380[] MTH2058(CLS380[] arr_ٴⁱ) {
        return CLS97.MTH2074(arr_ٴⁱ, ((float)(this.FLD499 * 2)), ((float)this.MTH2064()));
    }

    public final void MTH2059(CLS380[] arr_ٴⁱ) {
        int v7;
        long v5;
        long v4;
        if(!this.MTH2060(arr_ٴⁱ[0]) || !this.MTH2060(arr_ٴⁱ[1]) || !this.MTH2060(arr_ٴⁱ[2]) || !this.MTH2060(arr_ٴⁱ[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v1 = this.FLD499 * 2;
        int[] arr_v = {this.MTH2070(arr_ٴⁱ[0], arr_ٴⁱ[1], v1), this.MTH2070(arr_ٴⁱ[1], arr_ٴⁱ[2], v1), this.MTH2070(arr_ٴⁱ[2], arr_ٴⁱ[3], v1), this.MTH2070(arr_ٴⁱ[3], arr_ٴⁱ[0], v1)};
        this.FLD503 = CLS97.MTH2068(arr_v, v1);
        long v2 = 0L;
        for(int v = 0; v < 4; ++v) {
            int v3 = arr_v[(this.FLD503 + v) % 4];
            if(this.FLD498) {
                v4 = v2 << 7;
                v5 = (long)(v3 >> 1 & 0x7F);
            }
            else {
                v4 = v2 << 10;
                v5 = (long)((v3 >> 2 & 0x3E0) + (v3 >> 1 & 0x1F));
            }
            v2 = v4 + v5;
        }
        int v6 = CLS97.MTH2072(v2, this.FLD498);
        if(this.FLD498) {
            this.FLD501 = (v6 >> 6) + 1;
            v7 = v6 & 0x3F;
        }
        else {
            this.FLD501 = (v6 >> 11) + 1;
            v7 = v6 & 0x7FF;
        }
        this.FLD504 = v7 + 1;
    }

    public final boolean MTH2060(CLS380 ٴⁱ0) {
        return this.MTH2063(CLS114.MTH2297(ٴⁱ0.MTH5130()), CLS114.MTH2297(ٴⁱ0.MTH5131()));
    }

    public CLS788 MTH2061(boolean z) {
        CLS380[] arr_ٴⁱ = this.MTH2073(this.MTH2062());
        if(z) {
            CLS380 ٴⁱ0 = arr_ٴⁱ[0];
            arr_ٴⁱ[0] = arr_ٴⁱ[2];
            arr_ٴⁱ[2] = ٴⁱ0;
        }
        this.MTH2059(arr_ٴⁱ);
        return new CLS788(this.MTH2066(this.FLD500, arr_ٴⁱ[this.FLD503 % 4], arr_ٴⁱ[(this.FLD503 + 1) % 4], arr_ٴⁱ[(this.FLD503 + 2) % 4], arr_ٴⁱ[(this.FLD503 + 3) % 4]), this.MTH2058(arr_ٴⁱ), this.FLD498, this.FLD504, this.FLD501);
    }

    public final CLS96 MTH2062() {
        CLS380 ٴⁱ10;
        CLS380 ٴⁱ9;
        CLS380 ٴⁱ8;
        CLS380 ٴⁱ7;
        CLS380 ٴⁱ3;
        CLS380 ٴⁱ2;
        CLS380 ٴⁱ1;
        CLS380 ٴⁱ0;
        try {
            CLS380[] arr_ٴⁱ = new CLS113(this.FLD500).MTH2293();
            ٴⁱ0 = arr_ٴⁱ[0];
            ٴⁱ1 = arr_ٴⁱ[1];
            ٴⁱ2 = arr_ٴⁱ[2];
            ٴⁱ3 = arr_ٴⁱ[3];
        }
        catch(NotFoundException unused_ex) {
            int v = this.FLD500.MTH2325();
            int v1 = this.FLD500.MTH2328();
            int v2 = v / 2 + 7;
            int v3 = v1 / 2 - 7;
            CLS380 ٴⁱ4 = this.MTH2067(new CLS96(v2, v3), false, 1, -1).MTH2054();
            int v4 = v1 / 2 + 7;
            CLS380 ٴⁱ5 = this.MTH2067(new CLS96(v2, v4), false, 1, 1).MTH2054();
            int v5 = v / 2 - 7;
            CLS380 ٴⁱ6 = this.MTH2067(new CLS96(v5, v4), false, -1, 1).MTH2054();
            ٴⁱ3 = this.MTH2067(new CLS96(v5, v3), false, -1, -1).MTH2054();
            ٴⁱ2 = ٴⁱ6;
            ٴⁱ0 = ٴⁱ4;
            ٴⁱ1 = ٴⁱ5;
        }
        int v6 = CLS114.MTH2297((ٴⁱ0.MTH5130() + ٴⁱ3.MTH5130() + ٴⁱ1.MTH5130() + ٴⁱ2.MTH5130()) / 4.0f);
        int v7 = CLS114.MTH2297((ٴⁱ0.MTH5131() + ٴⁱ3.MTH5131() + ٴⁱ1.MTH5131() + ٴⁱ2.MTH5131()) / 4.0f);
        try {
            CLS380[] arr_ٴⁱ1 = new CLS113(this.FLD500, 15, v6, v7).MTH2293();
            ٴⁱ7 = arr_ٴⁱ1[0];
            ٴⁱ8 = arr_ٴⁱ1[1];
            ٴⁱ9 = arr_ٴⁱ1[2];
            ٴⁱ10 = arr_ٴⁱ1[3];
            return new CLS96(CLS114.MTH2297((ٴⁱ7.MTH5130() + ٴⁱ10.MTH5130() + ٴⁱ8.MTH5130() + ٴⁱ9.MTH5130()) / 4.0f), CLS114.MTH2297((ٴⁱ7.MTH5131() + ٴⁱ10.MTH5131() + ٴⁱ8.MTH5131() + ٴⁱ9.MTH5131()) / 4.0f));
        }
        catch(NotFoundException unused_ex) {
            ٴⁱ7 = this.MTH2067(new CLS96(v6 + 7, v7 - 7), false, 1, -1).MTH2054();
            ٴⁱ8 = this.MTH2067(new CLS96(v6 + 7, v7 + 7), false, 1, 1).MTH2054();
            ٴⁱ9 = this.MTH2067(new CLS96(v6 - 7, v7 + 7), false, -1, 1).MTH2054();
            ٴⁱ10 = this.MTH2067(new CLS96(v6 - 7, v7 - 7), false, -1, -1).MTH2054();
            return new CLS96(CLS114.MTH2297((ٴⁱ7.MTH5130() + ٴⁱ10.MTH5130() + ٴⁱ8.MTH5130() + ٴⁱ9.MTH5130()) / 4.0f), CLS114.MTH2297((ٴⁱ7.MTH5131() + ٴⁱ10.MTH5131() + ٴⁱ8.MTH5131() + ٴⁱ9.MTH5131()) / 4.0f));
        }
    }

    public final boolean MTH2063(int v, int v1) {
        return v >= 0 && v < this.FLD500.MTH2325() && v1 > 0 && v1 < this.FLD500.MTH2328();
    }

    public final int MTH2064() {
        if(this.FLD498) {
            return this.FLD501 * 4 + 11;
        }
        return this.FLD501 > 4 ? (this.FLD501 - 4) / 8 * 2 + this.FLD501 * 4 + 17 : this.FLD501 * 4 + 15;
    }

    public final boolean MTH2065(CLS96 ˆٴ$ˆٴ0, CLS96 ˆٴ$ˆٴ1, CLS96 ˆٴ$ˆٴ2, CLS96 ˆٴ$ˆٴ3) {
        CLS96 ˆٴ$ˆٴ4 = new CLS96(ˆٴ$ˆٴ0.MTH2053() - 3, ˆٴ$ˆٴ0.MTH2052() + 3);
        CLS96 ˆٴ$ˆٴ5 = new CLS96(ˆٴ$ˆٴ1.MTH2053() - 3, ˆٴ$ˆٴ1.MTH2052() - 3);
        CLS96 ˆٴ$ˆٴ6 = new CLS96(ˆٴ$ˆٴ2.MTH2053() + 3, ˆٴ$ˆٴ2.MTH2052() - 3);
        CLS96 ˆٴ$ˆٴ7 = new CLS96(ˆٴ$ˆٴ3.MTH2053() + 3, ˆٴ$ˆٴ3.MTH2052() + 3);
        int v = this.MTH2071(ˆٴ$ˆٴ7, ˆٴ$ˆٴ4);
        if(v == 0) {
            return false;
        }
        if(this.MTH2071(ˆٴ$ˆٴ4, ˆٴ$ˆٴ5) != v) {
            return false;
        }
        return this.MTH2071(ˆٴ$ˆٴ5, ˆٴ$ˆٴ6) == v ? this.MTH2071(ˆٴ$ˆٴ6, ˆٴ$ˆٴ7) == v : false;
    }

    public final CLS117 MTH2066(CLS117 ʻᵢ0, CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, CLS380 ٴⁱ3) {
        int v = this.MTH2064();
        float f = ((float)v) / 2.0f - ((float)this.FLD499);
        float f1 = ((float)v) / 2.0f + ((float)this.FLD499);
        return CLS122.MTH2390().MTH2392(ʻᵢ0, v, v, f, f, f1, f, f1, f1, f, f1, ٴⁱ0.MTH5130(), ٴⁱ0.MTH5131(), ٴⁱ1.MTH5130(), ٴⁱ1.MTH5131(), ٴⁱ2.MTH5130(), ٴⁱ2.MTH5131(), ٴⁱ3.MTH5130(), ٴⁱ3.MTH5131());
    }

    public final CLS96 MTH2067(CLS96 ˆٴ$ˆٴ0, boolean z, int v, int v1) {
        int v2 = ˆٴ$ˆٴ0.MTH2053() + v;
        int v3 = ˆٴ$ˆٴ0.MTH2052();
        while(true) {
            v3 += v1;
            if(!this.MTH2063(v2, v3) || this.FLD500.MTH2331(v2, v3) != z) {
                break;
            }
            v2 += v;
        }
        int v4 = v2 - v;
        int v5 = v3 - v1;
        while(this.MTH2063(v4, v5) && this.FLD500.MTH2331(v4, v5) == z) {
            v4 += v;
        }
        int v6 = v4 - v;
        while(this.MTH2063(v6, v5) && this.FLD500.MTH2331(v6, v5) == z) {
            v5 += v1;
        }
        return new CLS96(v6, v5 - v1);
    }

    public static int MTH2068(int[] arr_v, int v) {
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v4 = arr_v[v2];
            v3 = (v3 << 3) + ((v4 >> v - 2 << 1) + (v4 & 1));
        }
        for(int v1 = 0; v1 < 4; ++v1) {
            if(Integer.bitCount(CLS97.FLD502[v1] ^ ((v3 & 1) << 11) + (v3 >> 1)) <= 2) {
                return v1;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static float MTH2069(CLS380 ٴⁱ0, CLS380 ٴⁱ1) {
        return CLS114.MTH2296(ٴⁱ0.MTH5130(), ٴⁱ0.MTH5131(), ٴⁱ1.MTH5130(), ٴⁱ1.MTH5131());
    }

    public final int MTH2070(CLS380 ٴⁱ0, CLS380 ٴⁱ1, int v) {
        float f = CLS97.MTH2069(ٴⁱ0, ٴⁱ1);
        float f1 = f / ((float)v);
        float f2 = ٴⁱ0.MTH5130();
        float f3 = ٴⁱ0.MTH5131();
        float f4 = ٴⁱ1.MTH5130();
        float f5 = ٴⁱ0.MTH5130();
        float f6 = ٴⁱ1.MTH5131();
        float f7 = ٴⁱ0.MTH5131();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.FLD500.MTH2331(CLS114.MTH2297(((float)v1) * ((f4 - f5) * f1 / f) + f2), CLS114.MTH2297(((float)v1) * (f1 * (f6 - f7) / f) + f3))) {
                v2 |= 1 << v - v1 - 1;
            }
        }
        return v2;
    }

    public final int MTH2071(CLS96 ˆٴ$ˆٴ0, CLS96 ˆٴ$ˆٴ1) {
        float f = CLS97.MTH2057(ˆٴ$ˆٴ0, ˆٴ$ˆٴ1);
        int v = ˆٴ$ˆٴ1.MTH2053();
        int v1 = ˆٴ$ˆٴ0.MTH2053();
        int v2 = ˆٴ$ˆٴ1.MTH2052();
        int v3 = ˆٴ$ˆٴ0.MTH2052();
        float f1 = (float)ˆٴ$ˆٴ0.MTH2053();
        float f2 = (float)ˆٴ$ˆٴ0.MTH2052();
        boolean z = this.FLD500.MTH2331(ˆٴ$ˆٴ0.MTH2053(), ˆٴ$ˆٴ0.MTH2052());
        int v4 = (int)Math.ceil(f);
        boolean z1 = false;
        int v6 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            f1 += ((float)(v - v1)) / f;
            f2 += ((float)(v2 - v3)) / f;
            if(this.FLD500.MTH2331(CLS114.MTH2297(f1), CLS114.MTH2297(f2)) != z) {
                ++v6;
            }
        }
        float f3 = ((float)v6) / f;
        if(f3 > 0.1f && f3 < 0.9f) {
            return 0;
        }
        if(f3 <= 0.1f) {
            z1 = true;
        }
        return z1 == z ? 1 : -1;
    }

    public static int MTH2072(long v, boolean z) {
        int v5;
        int v2;
        int v1;
        if(z) {
            v1 = 7;
            v2 = 2;
        }
        else {
            v1 = 10;
            v2 = 4;
        }
        int[] arr_v = new int[v1];
        for(int v3 = v1 - 1; v3 >= 0; --v3) {
            arr_v[v3] = ((int)v) & 15;
            v >>= 4;
        }
        try {
            new CLS81(CLS80.FLD427).MTH1902(arr_v, v1 - v2);
            v5 = 0;
        }
        catch(ReedSolomonException unused_ex) {
            throw NotFoundException.getNotFoundInstance();
        }
        for(int v4 = 0; v4 < v2; ++v4) {
            v5 = (v5 << 4) + arr_v[v4];
        }
        return v5;
    }

    public final CLS380[] MTH2073(CLS96 ˆٴ$ˆٴ0) {
        this.FLD499 = 1;
        CLS96 ˆٴ$ˆٴ1 = ˆٴ$ˆٴ0;
        CLS96 ˆٴ$ˆٴ2 = ˆٴ$ˆٴ1;
        CLS96 ˆٴ$ˆٴ3 = ˆٴ$ˆٴ2;
        CLS96 ˆٴ$ˆٴ4 = ˆٴ$ˆٴ3;
        boolean z = true;
        while(this.FLD499 < 9) {
            CLS96 ˆٴ$ˆٴ5 = this.MTH2067(ˆٴ$ˆٴ1, z, 1, -1);
            CLS96 ˆٴ$ˆٴ6 = this.MTH2067(ˆٴ$ˆٴ2, z, 1, 1);
            CLS96 ˆٴ$ˆٴ7 = this.MTH2067(ˆٴ$ˆٴ3, z, -1, 1);
            CLS96 ˆٴ$ˆٴ8 = this.MTH2067(ˆٴ$ˆٴ4, z, -1, -1);
            if(this.FLD499 > 2) {
                double f = (double)(CLS97.MTH2057(ˆٴ$ˆٴ8, ˆٴ$ˆٴ5) * ((float)this.FLD499) / (CLS97.MTH2057(ˆٴ$ˆٴ4, ˆٴ$ˆٴ1) * ((float)(this.FLD499 + 2))));
                if(f >= 0.75 && f <= 1.25 && this.MTH2065(ˆٴ$ˆٴ5, ˆٴ$ˆٴ6, ˆٴ$ˆٴ7, ˆٴ$ˆٴ8)) {
                    goto label_14;
                }
                break;
            }
        label_14:
            z = !z;
            ++this.FLD499;
            ˆٴ$ˆٴ4 = ˆٴ$ˆٴ8;
            ˆٴ$ˆٴ1 = ˆٴ$ˆٴ5;
            ˆٴ$ˆٴ2 = ˆٴ$ˆٴ6;
            ˆٴ$ˆٴ3 = ˆٴ$ˆٴ7;
        }
        int v = this.FLD499;
        if(v != 5 && v != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.FLD498 = v == 5;
        return CLS97.MTH2074(new CLS380[]{new CLS380(((float)ˆٴ$ˆٴ1.MTH2053()) + 0.5f, ((float)ˆٴ$ˆٴ1.MTH2052()) - 0.5f), new CLS380(((float)ˆٴ$ˆٴ2.MTH2053()) + 0.5f, ((float)ˆٴ$ˆٴ2.MTH2052()) + 0.5f), new CLS380(((float)ˆٴ$ˆٴ3.MTH2053()) - 0.5f, ((float)ˆٴ$ˆٴ3.MTH2052()) + 0.5f), new CLS380(((float)ˆٴ$ˆٴ4.MTH2053()) - 0.5f, ((float)ˆٴ$ˆٴ4.MTH2052()) - 0.5f)}, ((float)(this.FLD499 * 2 - 3)), ((float)(this.FLD499 * 2)));
    }

    public static CLS380[] MTH2074(CLS380[] arr_ٴⁱ, float f, float f1) {
        float f2 = f1 / (f * 2.0f);
        float f3 = arr_ٴⁱ[0].MTH5130();
        float f4 = arr_ٴⁱ[2].MTH5130();
        float f5 = arr_ٴⁱ[0].MTH5131();
        float f6 = arr_ٴⁱ[2].MTH5131();
        float f7 = (arr_ٴⁱ[0].MTH5130() + arr_ٴⁱ[2].MTH5130()) / 2.0f;
        float f8 = (arr_ٴⁱ[0].MTH5131() + arr_ٴⁱ[2].MTH5131()) / 2.0f;
        float f9 = (f3 - f4) * f2;
        float f10 = (f5 - f6) * f2;
        CLS380 ٴⁱ0 = new CLS380(f7 + f9, f8 + f10);
        CLS380 ٴⁱ1 = new CLS380(f7 - f9, f8 - f10);
        float f11 = arr_ٴⁱ[1].MTH5130();
        float f12 = arr_ٴⁱ[3].MTH5130();
        float f13 = arr_ٴⁱ[1].MTH5131();
        float f14 = arr_ٴⁱ[3].MTH5131();
        float f15 = (arr_ٴⁱ[1].MTH5130() + arr_ٴⁱ[3].MTH5130()) / 2.0f;
        float f16 = (arr_ٴⁱ[1].MTH5131() + arr_ٴⁱ[3].MTH5131()) / 2.0f;
        float f17 = (f11 - f12) * f2;
        float f18 = f2 * (f13 - f14);
        return new CLS380[]{ٴⁱ0, new CLS380(f15 + f17, f16 + f18), ٴⁱ1, new CLS380(f15 - f17, f16 - f18)};
    }
}

