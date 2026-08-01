// Decompiled by JEB v5.42.0.202606242140

package c.ᴵـ;

import c.ٴʽ.CLS258;
import c.ٴʽ.CLS259;
import c.ᐧᵎ.CLS268;
import c.ﾞʾ.CLS362;
import c.ﾞʾ.CLS363;
import c.ﾞʾ.CLS366;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class CLS294 {
    public static final class CLS291 implements Serializable, Comparator {
        public CLS291() {
        }

        public CLS291(CLS292 ⁱˋ$ⁱˋ0) {
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.MTH3742(((CLS293)object0), ((CLS293)object1));
        }

        public int MTH3742(CLS293 ⁱˋ$ﾞⁱ0, CLS293 ⁱˋ$ﾞⁱ1) {
            return ⁱˋ$ﾞⁱ0.MTH3746() - ⁱˋ$ﾞⁱ1.MTH3746();
        }
    }

    public static class CLS292 {
    }

    public static final class CLS293 {
        public final int FLD1251;
        public final CLS268 FLD1252;
        public final CLS268 FLD1253;

        public CLS293(CLS268 ᵔʼ0, CLS268 ᵔʼ1, int v) {
            this.FLD1252 = ᵔʼ0;
            this.FLD1253 = ᵔʼ1;
            this.FLD1251 = v;
        }

        public CLS293(CLS268 ᵔʼ0, CLS268 ᵔʼ1, int v, CLS292 ⁱˋ$ⁱˋ0) {
            this(ᵔʼ0, ᵔʼ1, v);
        }

        @Override
        public String toString() {
            return this.FLD1252 + "/" + this.FLD1253 + '/' + this.FLD1251;
        }

        public int MTH3746() {
            return this.FLD1251;
        }

        public CLS268 MTH3747() {
            return this.FLD1252;
        }

        public CLS268 MTH3748() {
            return this.FLD1253;
        }
    }

    public final CLS366 FLD1254;
    public final CLS259 FLD1255;

    public CLS294(CLS366 ﾞⁱ0) {
        this.FLD1254 = ﾞⁱ0;
        this.FLD1255 = new CLS259(ﾞⁱ0);
    }

    public CLS362 MTH3750() {
        CLS268 ᵔʼ11;
        CLS268[] arr_ᵔʼ = this.FLD1255.MTH3389();
        CLS268 ᵔʼ0 = arr_ᵔʼ[0];
        CLS268 ᵔʼ1 = arr_ᵔʼ[1];
        CLS268 ᵔʼ2 = arr_ᵔʼ[2];
        CLS268 ᵔʼ3 = arr_ᵔʼ[3];
        ArrayList arrayList0 = new ArrayList(4);
        arrayList0.add(this.MTH3754(ᵔʼ0, ᵔʼ1));
        arrayList0.add(this.MTH3754(ᵔʼ0, ᵔʼ2));
        arrayList0.add(this.MTH3754(ᵔʼ1, ᵔʼ3));
        arrayList0.add(this.MTH3754(ᵔʼ2, ᵔʼ3));
        CLS268 ᵔʼ4 = null;
        Collections.sort(arrayList0, new CLS291(null));
        CLS293 ⁱˋ$ﾞⁱ0 = (CLS293)arrayList0.get(0);
        CLS293 ⁱˋ$ﾞⁱ1 = (CLS293)arrayList0.get(1);
        HashMap hashMap0 = new HashMap();
        CLS294.MTH3751(hashMap0, ⁱˋ$ﾞⁱ0.MTH3747());
        CLS294.MTH3751(hashMap0, ⁱˋ$ﾞⁱ0.MTH3748());
        CLS294.MTH3751(hashMap0, ⁱˋ$ﾞⁱ1.MTH3747());
        CLS294.MTH3751(hashMap0, ⁱˋ$ﾞⁱ1.MTH3748());
        CLS268 ᵔʼ5 = null;
        CLS268 ᵔʼ6 = null;
        for(Object object0: hashMap0.entrySet()) {
            CLS268 ᵔʼ7 = (CLS268)((Map.Entry)object0).getKey();
            if(((int)(((Integer)((Map.Entry)object0).getValue()))) == 2) {
                ᵔʼ5 = ᵔʼ7;
            }
            else if(ᵔʼ4 == null) {
                ᵔʼ4 = ᵔʼ7;
            }
            else {
                ᵔʼ6 = ᵔʼ7;
            }
        }
        if(ᵔʼ4 == null || ᵔʼ5 == null || ᵔʼ6 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS268[] arr_ᵔʼ1 = {ᵔʼ4, ᵔʼ5, ᵔʼ6};
        CLS268.MTH3469(arr_ᵔʼ1);
        CLS268 ᵔʼ8 = arr_ᵔʼ1[0];
        CLS268 ᵔʼ9 = arr_ᵔʼ1[1];
        CLS268 ᵔʼ10 = arr_ᵔʼ1[2];
        if(!hashMap0.containsKey(ᵔʼ0)) {
            ᵔʼ11 = ᵔʼ0;
        }
        else if(hashMap0.containsKey(ᵔʼ1)) {
            ᵔʼ11 = hashMap0.containsKey(ᵔʼ2) ? ᵔʼ3 : ᵔʼ2;
        }
        else {
            ᵔʼ11 = ᵔʼ1;
        }
        int v = this.MTH3754(ᵔʼ10, ᵔʼ11).MTH3746();
        int v1 = this.MTH3754(ᵔʼ8, ᵔʼ11).MTH3746();
        if((v & 1) == 1) {
            ++v;
        }
        if((v1 & 1) == 1) {
            ++v1;
        }
        if((v + 2) * 4 < (v1 + 2) * 7 && (v1 + 2) * 4 < (v + 2) * 7) {
            CLS268 ᵔʼ12 = this.MTH3755(ᵔʼ9, ᵔʼ8, ᵔʼ10, ᵔʼ11, Math.min(v1 + 2, v + 2));
            if(ᵔʼ12 != null) {
                ᵔʼ11 = ᵔʼ12;
            }
            int v2 = Math.max(this.MTH3754(ᵔʼ10, ᵔʼ11).MTH3746(), this.MTH3754(ᵔʼ8, ᵔʼ11).MTH3746()) + 1;
            if((v2 & 1) == 1) {
                ++v2;
            }
            return new CLS362(CLS294.MTH3756(this.FLD1254, ᵔʼ10, ᵔʼ9, ᵔʼ8, ᵔʼ11, v2, v2), new CLS268[]{ᵔʼ10, ᵔʼ9, ᵔʼ8, ᵔʼ11});
        }
        CLS268 ᵔʼ13 = this.MTH3757(ᵔʼ9, ᵔʼ8, ᵔʼ10, ᵔʼ11, v + 2, v1 + 2);
        if(ᵔʼ13 != null) {
            ᵔʼ11 = ᵔʼ13;
        }
        int v3 = this.MTH3754(ᵔʼ10, ᵔʼ11).MTH3746();
        int v4 = this.MTH3754(ᵔʼ8, ᵔʼ11).MTH3746();
        if((v3 & 1) == 1) {
            ++v3;
        }
        if((v4 & 1) == 1) {
            ++v4;
        }
        return new CLS362(CLS294.MTH3756(this.FLD1254, ᵔʼ10, ᵔʼ9, ᵔʼ8, ᵔʼ11, v3, v4), new CLS268[]{ᵔʼ10, ᵔʼ9, ᵔʼ8, ᵔʼ11});
    }

    public static void MTH3751(Map map0, CLS268 ᵔʼ0) {
        Integer integer0 = (Integer)map0.get(ᵔʼ0);
        map0.put(ᵔʼ0, ((int)(integer0 == null ? 1 : ((int)integer0) + 1)));
    }

    public static int MTH3752(CLS268 ᵔʼ0, CLS268 ᵔʼ1) {
        return CLS258.MTH3383(CLS268.MTH3472(ᵔʼ0, ᵔʼ1));
    }

    public final boolean MTH3753(CLS268 ᵔʼ0) {
        return ᵔʼ0.MTH3468() >= 0.0f && ᵔʼ0.MTH3468() < ((float)this.FLD1254.MTH5044()) && ᵔʼ0.MTH3470() > 0.0f && ᵔʼ0.MTH3470() < ((float)this.FLD1254.MTH5046());
    }

    public final CLS293 MTH3754(CLS268 ᵔʼ0, CLS268 ᵔʼ1) {
        int v = (int)ᵔʼ0.MTH3468();
        int v1 = (int)ᵔʼ0.MTH3470();
        int v2 = (int)ᵔʼ1.MTH3468();
        int v3 = (int)ᵔʼ1.MTH3470();
        int v4 = 0;
        int v5 = 1;
        boolean z = Math.abs(v3 - v1) > Math.abs(v2 - v);
        if(z) {
            int v6 = v1;
            v1 = v;
            v = v6;
            int v7 = v3;
            v3 = v2;
            v2 = v7;
        }
        int v8 = Math.abs(v2 - v);
        int v9 = Math.abs(v3 - v1);
        int v10 = -v8 / 2;
        int v11 = v1 >= v3 ? -1 : 1;
        if(v >= v2) {
            v5 = -1;
        }
        boolean z1 = this.FLD1254.MTH5038((z ? v1 : v), (z ? v : v1));
        while(v != v2) {
            boolean z2 = this.FLD1254.MTH5038((z ? v1 : v), (z ? v : v1));
            if(z2 != z1) {
                ++v4;
                z1 = z2;
            }
            v10 += v9;
            if(v10 > 0) {
                if(v1 == v3) {
                    break;
                }
                v1 += v11;
                v10 -= v8;
            }
            v += v5;
        }
        return new CLS293(ᵔʼ0, ᵔʼ1, v4, null);
    }

    public final CLS268 MTH3755(CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, CLS268 ᵔʼ3, int v) {
        float f = ((float)CLS294.MTH3752(ᵔʼ0, ᵔʼ1)) / ((float)v);
        float f1 = (float)CLS294.MTH3752(ᵔʼ2, ᵔʼ3);
        CLS268 ᵔʼ4 = new CLS268(ᵔʼ3.MTH3468() + (ᵔʼ3.MTH3468() - ᵔʼ2.MTH3468()) / f1 * f, ᵔʼ3.MTH3470() + f * ((ᵔʼ3.MTH3470() - ᵔʼ2.MTH3470()) / f1));
        float f2 = ((float)CLS294.MTH3752(ᵔʼ0, ᵔʼ2)) / ((float)v);
        float f3 = (float)CLS294.MTH3752(ᵔʼ1, ᵔʼ3);
        CLS268 ᵔʼ5 = new CLS268(ᵔʼ3.MTH3468() + (ᵔʼ3.MTH3468() - ᵔʼ1.MTH3468()) / f3 * f2, ᵔʼ3.MTH3470() + f2 * ((ᵔʼ3.MTH3470() - ᵔʼ1.MTH3470()) / f3));
        if(!this.MTH3753(ᵔʼ4)) {
            return this.MTH3753(ᵔʼ5) ? ᵔʼ5 : null;
        }
        if(!this.MTH3753(ᵔʼ5)) {
            return ᵔʼ4;
        }
        return Math.abs(this.MTH3754(ᵔʼ2, ᵔʼ4).MTH3746() - this.MTH3754(ᵔʼ1, ᵔʼ4).MTH3746()) > Math.abs(this.MTH3754(ᵔʼ2, ᵔʼ5).MTH3746() - this.MTH3754(ᵔʼ1, ᵔʼ5).MTH3746()) ? ᵔʼ5 : ᵔʼ4;
    }

    public static CLS366 MTH3756(CLS366 ﾞⁱ0, CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, CLS268 ᵔʼ3, int v, int v1) {
        return CLS363.MTH4986().MTH4983(ﾞⁱ0, v, v1, 0.5f, 0.5f, ((float)v) - 0.5f, 0.5f, ((float)v) - 0.5f, ((float)v1) - 0.5f, 0.5f, ((float)v1) - 0.5f, ᵔʼ0.MTH3468(), ᵔʼ0.MTH3470(), ᵔʼ3.MTH3468(), ᵔʼ3.MTH3470(), ᵔʼ2.MTH3468(), ᵔʼ2.MTH3470(), ᵔʼ1.MTH3468(), ᵔʼ1.MTH3470());
    }

    public final CLS268 MTH3757(CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, CLS268 ᵔʼ3, int v, int v1) {
        float f = ((float)CLS294.MTH3752(ᵔʼ0, ᵔʼ1)) / ((float)v);
        float f1 = (float)CLS294.MTH3752(ᵔʼ2, ᵔʼ3);
        CLS268 ᵔʼ4 = new CLS268(ᵔʼ3.MTH3468() + (ᵔʼ3.MTH3468() - ᵔʼ2.MTH3468()) / f1 * f, ᵔʼ3.MTH3470() + f * ((ᵔʼ3.MTH3470() - ᵔʼ2.MTH3470()) / f1));
        float f2 = ((float)CLS294.MTH3752(ᵔʼ0, ᵔʼ2)) / ((float)v1);
        float f3 = (float)CLS294.MTH3752(ᵔʼ1, ᵔʼ3);
        CLS268 ᵔʼ5 = new CLS268(ᵔʼ3.MTH3468() + (ᵔʼ3.MTH3468() - ᵔʼ1.MTH3468()) / f3 * f2, ᵔʼ3.MTH3470() + f2 * ((ᵔʼ3.MTH3470() - ᵔʼ1.MTH3470()) / f3));
        if(!this.MTH3753(ᵔʼ4)) {
            return this.MTH3753(ᵔʼ5) ? ᵔʼ5 : null;
        }
        if(!this.MTH3753(ᵔʼ5)) {
            return ᵔʼ4;
        }
        return Math.abs(v - this.MTH3754(ᵔʼ2, ᵔʼ4).MTH3746()) + Math.abs(v1 - this.MTH3754(ᵔʼ1, ᵔʼ4).MTH3746()) > Math.abs(v - this.MTH3754(ᵔʼ2, ᵔʼ5).MTH3746()) + Math.abs(v1 - this.MTH3754(ᵔʼ1, ᵔʼ5).MTH3746()) ? ᵔʼ5 : ᵔʼ4;
    }
}

