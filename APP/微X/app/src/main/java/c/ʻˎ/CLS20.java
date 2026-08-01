// Decompiled by JEB v5.42.0.202606242140

package c.ʻˎ;

import c.ˎʼ.CLS113;
import c.ˎʼ.CLS114;
import c.ˎˊ.CLS117;
import c.ˎˊ.CLS122;
import c.ˎˊ.CLS123;
import c.ﾞﹶ.CLS380;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class CLS20 {
    public static final class CLS17 {
        public final CLS380 FLD92;
        public final CLS380 FLD93;
        public final int FLD94;

        public CLS17(CLS380 ٴⁱ0, CLS380 ٴⁱ1, int v) {
            this.FLD93 = ٴⁱ0;
            this.FLD92 = ٴⁱ1;
            this.FLD94 = v;
        }

        public CLS17(CLS380 ٴⁱ0, CLS380 ٴⁱ1, int v, CLS18 ˆٴ$ˆٴ0) {
            this(ٴⁱ0, ٴⁱ1, v);
        }

        @Override
        public String toString() {
            return this.FLD93 + "/" + this.FLD92 + '/' + this.FLD94;
        }

        public CLS380 MTH740() {
            return this.FLD92;
        }

        public CLS380 MTH741() {
            return this.FLD93;
        }

        public int MTH742() {
            return this.FLD94;
        }
    }

    public static class CLS18 {
    }

    public static final class CLS19 implements Serializable, Comparator {
        public CLS19() {
        }

        public CLS19(CLS18 ˆٴ$ˆٴ0) {
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.MTH746(((CLS17)object0), ((CLS17)object1));
        }

        public int MTH746(CLS17 ˆٴ$ʻᵢ0, CLS17 ˆٴ$ʻᵢ1) {
            return ˆٴ$ʻᵢ0.MTH742() - ˆٴ$ʻᵢ1.MTH742();
        }
    }

    public final CLS113 FLD95;
    public final CLS117 FLD96;

    public CLS20(CLS117 ʻᵢ0) {
        this.FLD96 = ʻᵢ0;
        this.FLD95 = new CLS113(ʻᵢ0);
    }

    public final CLS380 MTH748(CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, CLS380 ٴⁱ3, int v, int v1) {
        float f = ((float)CLS20.MTH755(ٴⁱ0, ٴⁱ1)) / ((float)v);
        float f1 = (float)CLS20.MTH755(ٴⁱ2, ٴⁱ3);
        CLS380 ٴⁱ4 = new CLS380(ٴⁱ3.MTH5130() + (ٴⁱ3.MTH5130() - ٴⁱ2.MTH5130()) / f1 * f, ٴⁱ3.MTH5131() + f * ((ٴⁱ3.MTH5131() - ٴⁱ2.MTH5131()) / f1));
        float f2 = ((float)CLS20.MTH755(ٴⁱ0, ٴⁱ2)) / ((float)v1);
        float f3 = (float)CLS20.MTH755(ٴⁱ1, ٴⁱ3);
        CLS380 ٴⁱ5 = new CLS380(ٴⁱ3.MTH5130() + (ٴⁱ3.MTH5130() - ٴⁱ1.MTH5130()) / f3 * f2, ٴⁱ3.MTH5131() + f2 * ((ٴⁱ3.MTH5131() - ٴⁱ1.MTH5131()) / f3));
        if(!this.MTH754(ٴⁱ4)) {
            return this.MTH754(ٴⁱ5) ? ٴⁱ5 : null;
        }
        if(!this.MTH754(ٴⁱ5)) {
            return ٴⁱ4;
        }
        return Math.abs(v - this.MTH753(ٴⁱ2, ٴⁱ4).MTH742()) + Math.abs(v1 - this.MTH753(ٴⁱ1, ٴⁱ4).MTH742()) > Math.abs(v - this.MTH753(ٴⁱ2, ٴⁱ5).MTH742()) + Math.abs(v1 - this.MTH753(ٴⁱ1, ٴⁱ5).MTH742()) ? ٴⁱ5 : ٴⁱ4;
    }

    public static void MTH749(Map map0, CLS380 ٴⁱ0) {
        Integer integer0 = (Integer)map0.get(ٴⁱ0);
        map0.put(ٴⁱ0, ((int)(integer0 == null ? 1 : ((int)integer0) + 1)));
    }

    public final CLS380 MTH750(CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, CLS380 ٴⁱ3, int v) {
        float f = ((float)CLS20.MTH755(ٴⁱ0, ٴⁱ1)) / ((float)v);
        float f1 = (float)CLS20.MTH755(ٴⁱ2, ٴⁱ3);
        CLS380 ٴⁱ4 = new CLS380(ٴⁱ3.MTH5130() + (ٴⁱ3.MTH5130() - ٴⁱ2.MTH5130()) / f1 * f, ٴⁱ3.MTH5131() + f * ((ٴⁱ3.MTH5131() - ٴⁱ2.MTH5131()) / f1));
        float f2 = ((float)CLS20.MTH755(ٴⁱ0, ٴⁱ2)) / ((float)v);
        float f3 = (float)CLS20.MTH755(ٴⁱ1, ٴⁱ3);
        CLS380 ٴⁱ5 = new CLS380(ٴⁱ3.MTH5130() + (ٴⁱ3.MTH5130() - ٴⁱ1.MTH5130()) / f3 * f2, ٴⁱ3.MTH5131() + f2 * ((ٴⁱ3.MTH5131() - ٴⁱ1.MTH5131()) / f3));
        if(!this.MTH754(ٴⁱ4)) {
            return this.MTH754(ٴⁱ5) ? ٴⁱ5 : null;
        }
        if(!this.MTH754(ٴⁱ5)) {
            return ٴⁱ4;
        }
        return Math.abs(this.MTH753(ٴⁱ2, ٴⁱ4).MTH742() - this.MTH753(ٴⁱ1, ٴⁱ4).MTH742()) > Math.abs(this.MTH753(ٴⁱ2, ٴⁱ5).MTH742() - this.MTH753(ٴⁱ1, ٴⁱ5).MTH742()) ? ٴⁱ5 : ٴⁱ4;
    }

    public CLS123 MTH751() {
        CLS380 ٴⁱ11;
        CLS380[] arr_ٴⁱ = this.FLD95.MTH2293();
        CLS380 ٴⁱ0 = arr_ٴⁱ[0];
        CLS380 ٴⁱ1 = arr_ٴⁱ[1];
        CLS380 ٴⁱ2 = arr_ٴⁱ[2];
        CLS380 ٴⁱ3 = arr_ٴⁱ[3];
        ArrayList arrayList0 = new ArrayList(4);
        arrayList0.add(this.MTH753(ٴⁱ0, ٴⁱ1));
        arrayList0.add(this.MTH753(ٴⁱ0, ٴⁱ2));
        arrayList0.add(this.MTH753(ٴⁱ1, ٴⁱ3));
        arrayList0.add(this.MTH753(ٴⁱ2, ٴⁱ3));
        CLS380 ٴⁱ4 = null;
        Collections.sort(arrayList0, new CLS19(null));
        CLS17 ˆٴ$ʻᵢ0 = (CLS17)arrayList0.get(0);
        CLS17 ˆٴ$ʻᵢ1 = (CLS17)arrayList0.get(1);
        HashMap hashMap0 = new HashMap();
        CLS20.MTH749(hashMap0, ˆٴ$ʻᵢ0.MTH741());
        CLS20.MTH749(hashMap0, ˆٴ$ʻᵢ0.MTH740());
        CLS20.MTH749(hashMap0, ˆٴ$ʻᵢ1.MTH741());
        CLS20.MTH749(hashMap0, ˆٴ$ʻᵢ1.MTH740());
        CLS380 ٴⁱ5 = null;
        CLS380 ٴⁱ6 = null;
        for(Object object0: hashMap0.entrySet()) {
            CLS380 ٴⁱ7 = (CLS380)((Map.Entry)object0).getKey();
            if(((int)(((Integer)((Map.Entry)object0).getValue()))) == 2) {
                ٴⁱ5 = ٴⁱ7;
            }
            else if(ٴⁱ4 == null) {
                ٴⁱ4 = ٴⁱ7;
            }
            else {
                ٴⁱ6 = ٴⁱ7;
            }
        }
        if(ٴⁱ4 == null || ٴⁱ5 == null || ٴⁱ6 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        CLS380[] arr_ٴⁱ1 = {ٴⁱ4, ٴⁱ5, ٴⁱ6};
        CLS380.MTH5128(arr_ٴⁱ1);
        CLS380 ٴⁱ8 = arr_ٴⁱ1[0];
        CLS380 ٴⁱ9 = arr_ٴⁱ1[1];
        CLS380 ٴⁱ10 = arr_ٴⁱ1[2];
        if(!hashMap0.containsKey(ٴⁱ0)) {
            ٴⁱ11 = ٴⁱ0;
        }
        else if(hashMap0.containsKey(ٴⁱ1)) {
            ٴⁱ11 = hashMap0.containsKey(ٴⁱ2) ? ٴⁱ3 : ٴⁱ2;
        }
        else {
            ٴⁱ11 = ٴⁱ1;
        }
        int v = this.MTH753(ٴⁱ10, ٴⁱ11).MTH742();
        int v1 = this.MTH753(ٴⁱ8, ٴⁱ11).MTH742();
        if((v & 1) == 1) {
            ++v;
        }
        if((v1 & 1) == 1) {
            ++v1;
        }
        if((v + 2) * 4 < (v1 + 2) * 7 && (v1 + 2) * 4 < (v + 2) * 7) {
            CLS380 ٴⁱ12 = this.MTH750(ٴⁱ9, ٴⁱ8, ٴⁱ10, ٴⁱ11, Math.min(v1 + 2, v + 2));
            if(ٴⁱ12 != null) {
                ٴⁱ11 = ٴⁱ12;
            }
            int v2 = Math.max(this.MTH753(ٴⁱ10, ٴⁱ11).MTH742(), this.MTH753(ٴⁱ8, ٴⁱ11).MTH742()) + 1;
            if((v2 & 1) == 1) {
                ++v2;
            }
            return new CLS123(CLS20.MTH752(this.FLD96, ٴⁱ10, ٴⁱ9, ٴⁱ8, ٴⁱ11, v2, v2), new CLS380[]{ٴⁱ10, ٴⁱ9, ٴⁱ8, ٴⁱ11});
        }
        CLS380 ٴⁱ13 = this.MTH748(ٴⁱ9, ٴⁱ8, ٴⁱ10, ٴⁱ11, v + 2, v1 + 2);
        if(ٴⁱ13 != null) {
            ٴⁱ11 = ٴⁱ13;
        }
        int v3 = this.MTH753(ٴⁱ10, ٴⁱ11).MTH742();
        int v4 = this.MTH753(ٴⁱ8, ٴⁱ11).MTH742();
        if((v3 & 1) == 1) {
            ++v3;
        }
        if((v4 & 1) == 1) {
            ++v4;
        }
        return new CLS123(CLS20.MTH752(this.FLD96, ٴⁱ10, ٴⁱ9, ٴⁱ8, ٴⁱ11, v3, v4), new CLS380[]{ٴⁱ10, ٴⁱ9, ٴⁱ8, ٴⁱ11});
    }

    public static CLS117 MTH752(CLS117 ʻᵢ0, CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, CLS380 ٴⁱ3, int v, int v1) {
        return CLS122.MTH2390().MTH2392(ʻᵢ0, v, v1, 0.5f, 0.5f, ((float)v) - 0.5f, 0.5f, ((float)v) - 0.5f, ((float)v1) - 0.5f, 0.5f, ((float)v1) - 0.5f, ٴⁱ0.MTH5130(), ٴⁱ0.MTH5131(), ٴⁱ3.MTH5130(), ٴⁱ3.MTH5131(), ٴⁱ2.MTH5130(), ٴⁱ2.MTH5131(), ٴⁱ1.MTH5130(), ٴⁱ1.MTH5131());
    }

    public final CLS17 MTH753(CLS380 ٴⁱ0, CLS380 ٴⁱ1) {
        int v = (int)ٴⁱ0.MTH5130();
        int v1 = (int)ٴⁱ0.MTH5131();
        int v2 = (int)ٴⁱ1.MTH5130();
        int v3 = (int)ٴⁱ1.MTH5131();
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
        boolean z1 = this.FLD96.MTH2331((z ? v1 : v), (z ? v : v1));
        while(v != v2) {
            boolean z2 = this.FLD96.MTH2331((z ? v1 : v), (z ? v : v1));
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
        return new CLS17(ٴⁱ0, ٴⁱ1, v4, null);
    }

    public final boolean MTH754(CLS380 ٴⁱ0) {
        return ٴⁱ0.MTH5130() >= 0.0f && ٴⁱ0.MTH5130() < ((float)this.FLD96.MTH2325()) && ٴⁱ0.MTH5131() > 0.0f && ٴⁱ0.MTH5131() < ((float)this.FLD96.MTH2328());
    }

    public static int MTH755(CLS380 ٴⁱ0, CLS380 ٴⁱ1) {
        return CLS114.MTH2297(CLS380.MTH5127(ٴⁱ0, ٴⁱ1));
    }
}

