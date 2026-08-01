// Decompiled by JEB v5.42.0.202606242140

package c.ˉᵎ;

import c.ʼˊ.CLS407;
import c.ˋﾞ.CLS103;
import c.ˋﾞ.CLS105;
import c.ٴʽ.CLS258;
import c.ٴʽ.CLS259;
import c.ᐧᵎ.CLS268;
import c.ﾞʾ.CLS363;
import c.ﾞʾ.CLS366;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class CLS95 {
    public static final class CLS94 {
        public final int FLD294;
        public final int FLD295;

        public CLS94(int v, int v1) {
            this.FLD294 = v;
            this.FLD295 = v1;
        }

        @Override
        public String toString() {
            return "<" + this.FLD294 + ' ' + this.FLD295 + '>';
        }

        public CLS268 MTH1235() {
            return new CLS268(((float)this.MTH1236()), ((float)this.MTH1237()));
        }

        public int MTH1236() {
            return this.FLD294;
        }

        public int MTH1237() {
            return this.FLD295;
        }
    }

    public int FLD296;
    public int FLD297;
    public int FLD298;
    public int FLD299;
    public final CLS366 FLD300;
    public static final int[] FLD301;
    public boolean FLD302;

    static {
        CLS95.FLD301 = new int[]{0xEE0, 476, 2107, 0x707};
    }

    public CLS95(CLS366 ﾞⁱ0) {
        this.FLD300 = ﾞⁱ0;
    }

    public static float MTH1240(CLS268 ᵔʼ0, CLS268 ᵔʼ1) {
        return CLS258.MTH3385(ᵔʼ0.MTH3468(), ᵔʼ0.MTH3470(), ᵔʼ1.MTH3468(), ᵔʼ1.MTH3470());
    }

    public final int MTH1241() {
        if(this.FLD302) {
            return this.FLD296 * 4 + 11;
        }
        return this.FLD296 > 4 ? (this.FLD296 - 4) / 8 * 2 + this.FLD296 * 4 + 17 : this.FLD296 * 4 + 15;
    }

    public final CLS268[] MTH1242(CLS268[] arr_ᵔʼ) {
        return CLS95.MTH1245(arr_ᵔʼ, ((float)(this.FLD297 * 2)), ((float)this.MTH1241()));
    }

    public final void MTH1243(CLS268[] arr_ᵔʼ) {
        int v7;
        long v5;
        long v4;
        if(!this.MTH1251(arr_ᵔʼ[0]) || !this.MTH1251(arr_ᵔʼ[1]) || !this.MTH1251(arr_ᵔʼ[2]) || !this.MTH1251(arr_ᵔʼ[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v1 = this.FLD297 * 2;
        int[] arr_v = {this.MTH1250(arr_ᵔʼ[0], arr_ᵔʼ[1], v1), this.MTH1250(arr_ᵔʼ[1], arr_ᵔʼ[2], v1), this.MTH1250(arr_ᵔʼ[2], arr_ᵔʼ[3], v1), this.MTH1250(arr_ᵔʼ[3], arr_ᵔʼ[0], v1)};
        this.FLD299 = CLS95.MTH1244(arr_v, v1);
        long v2 = 0L;
        for(int v = 0; v < 4; ++v) {
            int v3 = arr_v[(this.FLD299 + v) % 4];
            if(this.FLD302) {
                v4 = v2 << 7;
                v5 = (long)(v3 >> 1 & 0x7F);
            }
            else {
                v4 = v2 << 10;
                v5 = (long)((v3 >> 2 & 0x3E0) + (v3 >> 1 & 0x1F));
            }
            v2 = v4 + v5;
        }
        int v6 = CLS95.MTH1252(v2, this.FLD302);
        if(this.FLD302) {
            this.FLD296 = (v6 >> 6) + 1;
            v7 = v6 & 0x3F;
        }
        else {
            this.FLD296 = (v6 >> 11) + 1;
            v7 = v6 & 0x7FF;
        }
        this.FLD298 = v7 + 1;
    }

    public static int MTH1244(int[] arr_v, int v) {
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v4 = arr_v[v2];
            v3 = (v3 << 3) + ((v4 >> v - 2 << 1) + (v4 & 1));
        }
        for(int v1 = 0; v1 < 4; ++v1) {
            if(Integer.bitCount(CLS95.FLD301[v1] ^ ((v3 & 1) << 11) + (v3 >> 1)) <= 2) {
                return v1;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static CLS268[] MTH1245(CLS268[] arr_ᵔʼ, float f, float f1) {
        float f2 = f1 / (f * 2.0f);
        float f3 = arr_ᵔʼ[0].MTH3468();
        float f4 = arr_ᵔʼ[2].MTH3468();
        float f5 = arr_ᵔʼ[0].MTH3470();
        float f6 = arr_ᵔʼ[2].MTH3470();
        float f7 = (arr_ᵔʼ[0].MTH3468() + arr_ᵔʼ[2].MTH3468()) / 2.0f;
        float f8 = (arr_ᵔʼ[0].MTH3470() + arr_ᵔʼ[2].MTH3470()) / 2.0f;
        float f9 = (f3 - f4) * f2;
        float f10 = (f5 - f6) * f2;
        CLS268 ᵔʼ0 = new CLS268(f7 + f9, f8 + f10);
        CLS268 ᵔʼ1 = new CLS268(f7 - f9, f8 - f10);
        float f11 = arr_ᵔʼ[1].MTH3468();
        float f12 = arr_ᵔʼ[3].MTH3468();
        float f13 = arr_ᵔʼ[1].MTH3470();
        float f14 = arr_ᵔʼ[3].MTH3470();
        float f15 = (arr_ᵔʼ[1].MTH3468() + arr_ᵔʼ[3].MTH3468()) / 2.0f;
        float f16 = (arr_ᵔʼ[1].MTH3470() + arr_ᵔʼ[3].MTH3470()) / 2.0f;
        float f17 = (f11 - f12) * f2;
        float f18 = f2 * (f13 - f14);
        return new CLS268[]{ᵔʼ0, new CLS268(f15 + f17, f16 + f18), ᵔʼ1, new CLS268(f15 - f17, f16 - f18)};
    }

    public final CLS94 MTH1246() {
        CLS268 ᵔʼ10;
        CLS268 ᵔʼ9;
        CLS268 ᵔʼ8;
        CLS268 ᵔʼ7;
        CLS268 ᵔʼ3;
        CLS268 ᵔʼ2;
        CLS268 ᵔʼ1;
        CLS268 ᵔʼ0;
        try {
            CLS268[] arr_ᵔʼ = new CLS259(this.FLD300).MTH3389();
            ᵔʼ0 = arr_ᵔʼ[0];
            ᵔʼ1 = arr_ᵔʼ[1];
            ᵔʼ2 = arr_ᵔʼ[2];
            ᵔʼ3 = arr_ᵔʼ[3];
        }
        catch(NotFoundException unused_ex) {
            int v = this.FLD300.MTH5044();
            int v1 = this.FLD300.MTH5046();
            int v2 = v / 2 + 7;
            int v3 = v1 / 2 - 7;
            CLS268 ᵔʼ4 = this.MTH1253(new CLS94(v2, v3), false, 1, -1).MTH1235();
            int v4 = v1 / 2 + 7;
            CLS268 ᵔʼ5 = this.MTH1253(new CLS94(v2, v4), false, 1, 1).MTH1235();
            int v5 = v / 2 - 7;
            CLS268 ᵔʼ6 = this.MTH1253(new CLS94(v5, v4), false, -1, 1).MTH1235();
            ᵔʼ3 = this.MTH1253(new CLS94(v5, v3), false, -1, -1).MTH1235();
            ᵔʼ2 = ᵔʼ6;
            ᵔʼ0 = ᵔʼ4;
            ᵔʼ1 = ᵔʼ5;
        }
        int v6 = CLS258.MTH3383((ᵔʼ0.MTH3468() + ᵔʼ3.MTH3468() + ᵔʼ1.MTH3468() + ᵔʼ2.MTH3468()) / 4.0f);
        int v7 = CLS258.MTH3383((ᵔʼ0.MTH3470() + ᵔʼ3.MTH3470() + ᵔʼ1.MTH3470() + ᵔʼ2.MTH3470()) / 4.0f);
        try {
            CLS268[] arr_ᵔʼ1 = new CLS259(this.FLD300, 15, v6, v7).MTH3389();
            ᵔʼ7 = arr_ᵔʼ1[0];
            ᵔʼ8 = arr_ᵔʼ1[1];
            ᵔʼ9 = arr_ᵔʼ1[2];
            ᵔʼ10 = arr_ᵔʼ1[3];
            return new CLS94(CLS258.MTH3383((ᵔʼ7.MTH3468() + ᵔʼ10.MTH3468() + ᵔʼ8.MTH3468() + ᵔʼ9.MTH3468()) / 4.0f), CLS258.MTH3383((ᵔʼ7.MTH3470() + ᵔʼ10.MTH3470() + ᵔʼ8.MTH3470() + ᵔʼ9.MTH3470()) / 4.0f));
        }
        catch(NotFoundException unused_ex) {
            ᵔʼ7 = this.MTH1253(new CLS94(v6 + 7, v7 - 7), false, 1, -1).MTH1235();
            ᵔʼ8 = this.MTH1253(new CLS94(v6 + 7, v7 + 7), false, 1, 1).MTH1235();
            ᵔʼ9 = this.MTH1253(new CLS94(v6 - 7, v7 + 7), false, -1, 1).MTH1235();
            ᵔʼ10 = this.MTH1253(new CLS94(v6 - 7, v7 - 7), false, -1, -1).MTH1235();
            return new CLS94(CLS258.MTH3383((ᵔʼ7.MTH3468() + ᵔʼ10.MTH3468() + ᵔʼ8.MTH3468() + ᵔʼ9.MTH3468()) / 4.0f), CLS258.MTH3383((ᵔʼ7.MTH3470() + ᵔʼ10.MTH3470() + ᵔʼ8.MTH3470() + ᵔʼ9.MTH3470()) / 4.0f));
        }
    }

    public final CLS268[] MTH1247(CLS94 ⁱˋ$ⁱˋ0) {
        this.FLD297 = 1;
        CLS94 ⁱˋ$ⁱˋ1 = ⁱˋ$ⁱˋ0;
        CLS94 ⁱˋ$ⁱˋ2 = ⁱˋ$ⁱˋ1;
        CLS94 ⁱˋ$ⁱˋ3 = ⁱˋ$ⁱˋ2;
        CLS94 ⁱˋ$ⁱˋ4 = ⁱˋ$ⁱˋ3;
        boolean z = true;
        while(this.FLD297 < 9) {
            CLS94 ⁱˋ$ⁱˋ5 = this.MTH1253(ⁱˋ$ⁱˋ1, z, 1, -1);
            CLS94 ⁱˋ$ⁱˋ6 = this.MTH1253(ⁱˋ$ⁱˋ2, z, 1, 1);
            CLS94 ⁱˋ$ⁱˋ7 = this.MTH1253(ⁱˋ$ⁱˋ3, z, -1, 1);
            CLS94 ⁱˋ$ⁱˋ8 = this.MTH1253(ⁱˋ$ⁱˋ4, z, -1, -1);
            if(this.FLD297 > 2) {
                double f = (double)(CLS95.MTH1257(ⁱˋ$ⁱˋ8, ⁱˋ$ⁱˋ5) * ((float)this.FLD297) / (CLS95.MTH1257(ⁱˋ$ⁱˋ4, ⁱˋ$ⁱˋ1) * ((float)(this.FLD297 + 2))));
                if(f >= 0.75 && f <= 1.25 && this.MTH1255(ⁱˋ$ⁱˋ5, ⁱˋ$ⁱˋ6, ⁱˋ$ⁱˋ7, ⁱˋ$ⁱˋ8)) {
                    goto label_14;
                }
                break;
            }
        label_14:
            z = !z;
            ++this.FLD297;
            ⁱˋ$ⁱˋ4 = ⁱˋ$ⁱˋ8;
            ⁱˋ$ⁱˋ1 = ⁱˋ$ⁱˋ5;
            ⁱˋ$ⁱˋ2 = ⁱˋ$ⁱˋ6;
            ⁱˋ$ⁱˋ3 = ⁱˋ$ⁱˋ7;
        }
        int v = this.FLD297;
        if(v != 5 && v != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.FLD302 = v == 5;
        return CLS95.MTH1245(new CLS268[]{new CLS268(((float)ⁱˋ$ⁱˋ1.MTH1236()) + 0.5f, ((float)ⁱˋ$ⁱˋ1.MTH1237()) - 0.5f), new CLS268(((float)ⁱˋ$ⁱˋ2.MTH1236()) + 0.5f, ((float)ⁱˋ$ⁱˋ2.MTH1237()) + 0.5f), new CLS268(((float)ⁱˋ$ⁱˋ3.MTH1236()) - 0.5f, ((float)ⁱˋ$ⁱˋ3.MTH1237()) + 0.5f), new CLS268(((float)ⁱˋ$ⁱˋ4.MTH1236()) - 0.5f, ((float)ⁱˋ$ⁱˋ4.MTH1237()) - 0.5f)}, ((float)(this.FLD297 * 2 - 3)), ((float)(this.FLD297 * 2)));
    }

    public final boolean MTH1248(int v, int v1) {
        return v >= 0 && v < this.FLD300.MTH5044() && v1 > 0 && v1 < this.FLD300.MTH5046();
    }

    public final CLS366 MTH1249(CLS366 ﾞⁱ0, CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, CLS268 ᵔʼ3) {
        int v = this.MTH1241();
        float f = ((float)v) / 2.0f - ((float)this.FLD297);
        float f1 = ((float)v) / 2.0f + ((float)this.FLD297);
        return CLS363.MTH4986().MTH4983(ﾞⁱ0, v, v, f, f, f1, f, f1, f1, f, f1, ᵔʼ0.MTH3468(), ᵔʼ0.MTH3470(), ᵔʼ1.MTH3468(), ᵔʼ1.MTH3470(), ᵔʼ2.MTH3468(), ᵔʼ2.MTH3470(), ᵔʼ3.MTH3468(), ᵔʼ3.MTH3470());
    }

    public final int MTH1250(CLS268 ᵔʼ0, CLS268 ᵔʼ1, int v) {
        float f = CLS95.MTH1240(ᵔʼ0, ᵔʼ1);
        float f1 = f / ((float)v);
        float f2 = ᵔʼ0.MTH3468();
        float f3 = ᵔʼ0.MTH3470();
        float f4 = ᵔʼ1.MTH3468();
        float f5 = ᵔʼ0.MTH3468();
        float f6 = ᵔʼ1.MTH3470();
        float f7 = ᵔʼ0.MTH3470();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.FLD300.MTH5038(CLS258.MTH3383(((float)v1) * ((f4 - f5) * f1 / f) + f2), CLS258.MTH3383(((float)v1) * (f1 * (f6 - f7) / f) + f3))) {
                v2 |= 1 << v - v1 - 1;
            }
        }
        return v2;
    }

    public final boolean MTH1251(CLS268 ᵔʼ0) {
        return this.MTH1248(CLS258.MTH3383(ᵔʼ0.MTH3468()), CLS258.MTH3383(ᵔʼ0.MTH3470()));
    }

    public static int MTH1252(long v, boolean z) {
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
            new CLS103(CLS105.FLD358).MTH1406(arr_v, v1 - v2);
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

    public final CLS94 MTH1253(CLS94 ⁱˋ$ⁱˋ0, boolean z, int v, int v1) {
        int v2 = ⁱˋ$ⁱˋ0.MTH1236() + v;
        int v3 = ⁱˋ$ⁱˋ0.MTH1237();
        while(true) {
            v3 += v1;
            if(!this.MTH1248(v2, v3) || this.FLD300.MTH5038(v2, v3) != z) {
                break;
            }
            v2 += v;
        }
        int v4 = v2 - v;
        int v5 = v3 - v1;
        while(this.MTH1248(v4, v5) && this.FLD300.MTH5038(v4, v5) == z) {
            v4 += v;
        }
        int v6 = v4 - v;
        while(this.MTH1248(v6, v5) && this.FLD300.MTH5038(v6, v5) == z) {
            v5 += v1;
        }
        return new CLS94(v6, v5 - v1);
    }

    public CLS407 MTH1254(boolean z) {
        CLS268[] arr_ᵔʼ = this.MTH1247(this.MTH1246());
        if(z) {
            CLS268 ᵔʼ0 = arr_ᵔʼ[0];
            arr_ᵔʼ[0] = arr_ᵔʼ[2];
            arr_ᵔʼ[2] = ᵔʼ0;
        }
        this.MTH1243(arr_ᵔʼ);
        return new CLS407(this.MTH1249(this.FLD300, arr_ᵔʼ[this.FLD299 % 4], arr_ᵔʼ[(this.FLD299 + 1) % 4], arr_ᵔʼ[(this.FLD299 + 2) % 4], arr_ᵔʼ[(this.FLD299 + 3) % 4]), this.MTH1242(arr_ᵔʼ), this.FLD302, this.FLD298, this.FLD296);
    }

    public final boolean MTH1255(CLS94 ⁱˋ$ⁱˋ0, CLS94 ⁱˋ$ⁱˋ1, CLS94 ⁱˋ$ⁱˋ2, CLS94 ⁱˋ$ⁱˋ3) {
        CLS94 ⁱˋ$ⁱˋ4 = new CLS94(ⁱˋ$ⁱˋ0.MTH1236() - 3, ⁱˋ$ⁱˋ0.MTH1237() + 3);
        CLS94 ⁱˋ$ⁱˋ5 = new CLS94(ⁱˋ$ⁱˋ1.MTH1236() - 3, ⁱˋ$ⁱˋ1.MTH1237() - 3);
        CLS94 ⁱˋ$ⁱˋ6 = new CLS94(ⁱˋ$ⁱˋ2.MTH1236() + 3, ⁱˋ$ⁱˋ2.MTH1237() - 3);
        CLS94 ⁱˋ$ⁱˋ7 = new CLS94(ⁱˋ$ⁱˋ3.MTH1236() + 3, ⁱˋ$ⁱˋ3.MTH1237() + 3);
        int v = this.MTH1256(ⁱˋ$ⁱˋ7, ⁱˋ$ⁱˋ4);
        if(v == 0) {
            return false;
        }
        if(this.MTH1256(ⁱˋ$ⁱˋ4, ⁱˋ$ⁱˋ5) != v) {
            return false;
        }
        return this.MTH1256(ⁱˋ$ⁱˋ5, ⁱˋ$ⁱˋ6) == v ? this.MTH1256(ⁱˋ$ⁱˋ6, ⁱˋ$ⁱˋ7) == v : false;
    }

    public final int MTH1256(CLS94 ⁱˋ$ⁱˋ0, CLS94 ⁱˋ$ⁱˋ1) {
        float f = CLS95.MTH1257(ⁱˋ$ⁱˋ0, ⁱˋ$ⁱˋ1);
        int v = ⁱˋ$ⁱˋ1.MTH1236();
        int v1 = ⁱˋ$ⁱˋ0.MTH1236();
        int v2 = ⁱˋ$ⁱˋ1.MTH1237();
        int v3 = ⁱˋ$ⁱˋ0.MTH1237();
        float f1 = (float)ⁱˋ$ⁱˋ0.MTH1236();
        float f2 = (float)ⁱˋ$ⁱˋ0.MTH1237();
        boolean z = this.FLD300.MTH5038(ⁱˋ$ⁱˋ0.MTH1236(), ⁱˋ$ⁱˋ0.MTH1237());
        int v4 = (int)Math.ceil(f);
        boolean z1 = false;
        int v6 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            f1 += ((float)(v - v1)) / f;
            f2 += ((float)(v2 - v3)) / f;
            if(this.FLD300.MTH5038(CLS258.MTH3383(f1), CLS258.MTH3383(f2)) != z) {
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

    public static float MTH1257(CLS94 ⁱˋ$ⁱˋ0, CLS94 ⁱˋ$ⁱˋ1) {
        return CLS258.MTH3386(ⁱˋ$ⁱˋ0.MTH1236(), ⁱˋ$ⁱˋ0.MTH1237(), ⁱˋ$ⁱˋ1.MTH1236(), ⁱˋ$ⁱˋ1.MTH1237());
    }
}

