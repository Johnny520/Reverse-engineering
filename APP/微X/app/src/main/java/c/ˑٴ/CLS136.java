// Decompiled by JEB v5.42.0.202606242140

package c.ˑٴ;

import c.ˎˊ.CLS117;
import c.ﾞﹶ.CLS376;
import c.ﾞﹶ.CLS380;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class CLS136 {
    public static final class CLS133 implements Serializable, Comparator {
        public final float FLD641;

        public CLS133(float f) {
            this.FLD641 = f;
        }

        public CLS133(float f, CLS134 ʿˊ$ˆٴ0) {
            this(f);
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.MTH2514(((CLS641)object0), ((CLS641)object1));
        }

        public int MTH2514(CLS641 ᵔﹶ0, CLS641 ᵔﹶ1) {
            if(ᵔﹶ1.MTH2554() == ᵔﹶ0.MTH2554()) {
                float f = Math.abs(ᵔﹶ1.MTH2552() - this.FLD641);
                float f1 = Math.abs(ᵔﹶ0.MTH2552() - this.FLD641);
                if(f < f1) {
                    return 1;
                }
                return f == f1 ? 0 : -1;
            }
            return ᵔﹶ1.MTH2554() - ᵔﹶ0.MTH2554();
        }
    }

    public static class CLS134 {
    }

    public static final class CLS135 implements Serializable, Comparator {
        public final float FLD642;

        public CLS135(float f) {
            this.FLD642 = f;
        }

        public CLS135(float f, CLS134 ʿˊ$ˆٴ0) {
            this(f);
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.MTH2518(((CLS641)object0), ((CLS641)object1));
        }

        public int MTH2518(CLS641 ᵔﹶ0, CLS641 ᵔﹶ1) {
            float f = Math.abs(ᵔﹶ1.MTH2552() - this.FLD642);
            float f1 = Math.abs(ᵔﹶ0.MTH2552() - this.FLD642);
            if(f < f1) {
                return -1;
            }
            return f == f1 ? 0 : 1;
        }
    }

    public final List FLD643;
    public final CLS376 FLD644;
    public final CLS117 FLD645;
    public boolean FLD646;
    public final int[] FLD647;

    public CLS136(CLS117 ʻᵢ0, CLS376 ˋᵎ0) {
        this.FLD645 = ʻᵢ0;
        this.FLD643 = new ArrayList();
        this.FLD647 = new int[5];
        this.FLD644 = ˋᵎ0;
    }

    public final boolean MTH2520(int v, int v1, int v2, int v3) {
        int[] arr_v = this.MTH2528();
        int v4;
        for(v4 = 0; v >= v4 && v1 >= v4 && this.FLD645.MTH2331(v1 - v4, v - v4); ++v4) {
            ++arr_v[2];
        }
        if(v >= v4 && v1 >= v4) {
            while(v >= v4 && v1 >= v4 && !this.FLD645.MTH2331(v1 - v4, v - v4)) {
                int v5 = arr_v[1];
                if(v5 > v2) {
                    break;
                }
                arr_v[1] = v5 + 1;
                ++v4;
            }
            if(v >= v4 && v1 >= v4 && arr_v[1] <= v2) {
                while(v >= v4 && v1 >= v4 && this.FLD645.MTH2331(v1 - v4, v - v4)) {
                    int v6 = arr_v[0];
                    if(v6 > v2) {
                        break;
                    }
                    arr_v[0] = v6 + 1;
                    ++v4;
                }
                if(arr_v[0] > v2) {
                    return false;
                }
                int v7 = this.FLD645.MTH2328();
                int v8 = this.FLD645.MTH2325();
                int v9;
                for(v9 = 1; true; ++v9) {
                    int v10 = v + v9;
                    if(v10 >= v7 || (v1 + v9 >= v8 || !this.FLD645.MTH2331(v1 + v9, v10))) {
                        break;
                    }
                    ++arr_v[2];
                }
                if(v10 < v7 && v1 + v9 < v8) {
                    while(true) {
                        int v11 = v + v9;
                        if(v11 >= v7 || (v1 + v9 >= v8 || this.FLD645.MTH2331(v1 + v9, v11))) {
                            break;
                        }
                        int v12 = arr_v[3];
                        if(v12 >= v2) {
                            break;
                        }
                        arr_v[3] = v12 + 1;
                        ++v9;
                    }
                    if(v11 < v7 && v1 + v9 < v8 && arr_v[3] < v2) {
                        while(v + v9 < v7 && (v1 + v9 < v8 && this.FLD645.MTH2331(v1 + v9, v + v9))) {
                            int v13 = arr_v[4];
                            if(v13 >= v2) {
                                break;
                            }
                            arr_v[4] = v13 + 1;
                            ++v9;
                        }
                        int v14 = arr_v[4];
                        return v14 < v2 ? Math.abs(arr_v[0] + arr_v[1] + arr_v[2] + arr_v[3] + v14 - v3) < v3 * 2 && CLS136.MTH2527(arr_v) : false;
                    }
                }
            }
        }
        return false;
    }

    public final CLS138 MTH2521(Map map0) {
        boolean z = map0 != null && map0.containsKey(DecodeHintType.TRY_HARDER);
        boolean z1 = map0 != null && map0.containsKey(DecodeHintType.PURE_BARCODE);
        int v = this.FLD645.MTH2328();
        int v1 = this.FLD645.MTH2325();
        int v2 = v * 3 / 0xE4 >= 3 && !z ? v * 3 / 0xE4 : 3;
        int[] arr_v = new int[5];
        int v3 = v2 - 1;
        boolean z2 = false;
        while(v3 < v && !z2) {
            arr_v[0] = 0;
            arr_v[1] = 0;
            arr_v[2] = 0;
            arr_v[3] = 0;
            arr_v[4] = 0;
            int v4 = 0;
            int v5 = 0;
            while(v4 < v1) {
                if(this.FLD645.MTH2331(v4, v3)) {
                    if((v5 & 1) == 1) {
                        ++v5;
                    }
                    ++arr_v[v5];
                }
                else if((v5 & 1) != 0) {
                    ++arr_v[v5];
                }
                else if(v5 == 4) {
                    if(CLS136.MTH2527(arr_v)) {
                        if(this.MTH2524(arr_v, v3, v4, z1)) {
                            if(this.FLD646) {
                                z2 = this.MTH2525();
                            }
                            else {
                                int v6 = this.MTH2529();
                                int v7 = arr_v[2];
                                if(v6 > v7) {
                                    v3 += v6 - v7 - 2;
                                    v4 = v1 - 1;
                                }
                            }
                            arr_v[0] = 0;
                            arr_v[1] = 0;
                            arr_v[2] = 0;
                            arr_v[3] = 0;
                            arr_v[4] = 0;
                            v2 = 2;
                            v5 = 0;
                            goto label_59;
                        }
                        else {
                            arr_v[0] = arr_v[2];
                            arr_v[1] = arr_v[3];
                            arr_v[2] = arr_v[4];
                            arr_v[3] = 1;
                            arr_v[4] = 0;
                            goto label_53;
                        }
                        goto label_48;
                    }
                    else {
                    label_48:
                        arr_v[0] = arr_v[2];
                        arr_v[1] = arr_v[3];
                        arr_v[2] = arr_v[4];
                        arr_v[3] = 1;
                        arr_v[4] = 0;
                    }
                label_53:
                    v5 = 3;
                }
                else {
                    ++v5;
                    ++arr_v[v5];
                }
            label_59:
                ++v4;
            }
            if(CLS136.MTH2527(arr_v) && this.MTH2524(arr_v, v3, v1, z1)) {
                v2 = arr_v[0];
                if(this.FLD646) {
                    z2 = this.MTH2525();
                }
            }
            v3 += v2;
        }
        CLS641[] arr_ᵔﹶ = this.MTH2523();
        CLS380.MTH5128(((CLS380[])arr_ᵔﹶ));
        return new CLS138(arr_ᵔﹶ);
    }

    public static float MTH2522(int[] arr_v, int v) {
        return ((float)(v - arr_v[4] - arr_v[3])) - ((float)arr_v[2]) / 2.0f;
    }

    public final CLS641[] MTH2523() {
        float f = 0.0f;
        int v = this.FLD643.size();
        if(v < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if(v > 3) {
            float f1 = 0.0f;
            float f2 = 0.0f;
            for(Object object0: this.FLD643) {
                float f3 = ((CLS641)object0).MTH2552();
                f1 += f3;
                f2 += f3 * f3;
            }
            float f4 = f1 / ((float)v);
            CLS135 ʿˊ$ـᵎ0 = new CLS135(f4, null);
            Collections.sort(this.FLD643, ʿˊ$ـᵎ0);
            float f5 = Math.max(0.2f * f4, ((float)Math.sqrt(f2 / ((float)v) - f4 * f4)));
            for(int v1 = 0; v1 < this.FLD643.size() && this.FLD643.size() > 3; ++v1) {
                if(Math.abs(((CLS641)this.FLD643.get(v1)).MTH2552() - f4) > f5) {
                    this.FLD643.remove(v1);
                    --v1;
                }
            }
        }
        if(this.FLD643.size() > 3) {
            for(Object object1: this.FLD643) {
                f += ((CLS641)object1).MTH2552();
            }
            CLS133 ʿˊ$ʻᵢ0 = new CLS133(f / ((float)this.FLD643.size()), null);
            Collections.sort(this.FLD643, ʿˊ$ʻᵢ0);
            this.FLD643.subList(3, this.FLD643.size()).clear();
        }
        return new CLS641[]{((CLS641)this.FLD643.get(0)), ((CLS641)this.FLD643.get(1)), ((CLS641)this.FLD643.get(2))};
    }

    public final boolean MTH2524(int[] arr_v, int v, int v1, boolean z) {
        boolean z1 = false;
        int v2 = arr_v[0] + arr_v[1] + arr_v[2] + arr_v[3] + arr_v[4];
        int v3 = (int)CLS136.MTH2522(arr_v, v1);
        float f = this.MTH2530(v, v3, arr_v[2], v2);
        if(!Float.isNaN(f)) {
            float f1 = this.MTH2526(v3, ((int)f), arr_v[2], v2);
            if(!Float.isNaN(f1) && (!z || this.MTH2520(((int)f), ((int)f1), arr_v[2], v2))) {
                for(int v4 = 0; v4 < this.FLD643.size(); ++v4) {
                    CLS641 ᵔﹶ0 = (CLS641)this.FLD643.get(v4);
                    if(ᵔﹶ0.MTH2555(((float)v2) / 7.0f, f, f1)) {
                        CLS641 ᵔﹶ1 = ᵔﹶ0.MTH2553(f, f1, ((float)v2) / 7.0f);
                        this.FLD643.set(v4, ᵔﹶ1);
                        z1 = true;
                        break;
                    }
                }
                if(!z1) {
                    CLS641 ᵔﹶ2 = new CLS641(f1, f, ((float)v2) / 7.0f);
                    this.FLD643.add(ᵔﹶ2);
                    CLS376 ˋᵎ0 = this.FLD644;
                    if(ˋᵎ0 != null) {
                        ˋᵎ0.MTH5101(((CLS380)ᵔﹶ2));
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean MTH2525() {
        int v = this.FLD643.size();
        float f = 0.0f;
        int v1 = 0;
        float f1 = 0.0f;
        for(Object object0: this.FLD643) {
            CLS641 ᵔﹶ0 = (CLS641)object0;
            if(ᵔﹶ0.MTH2554() >= 2) {
                ++v1;
                f1 += ᵔﹶ0.MTH2552();
            }
        }
        if(v1 < 3) {
            return false;
        }
        for(Object object1: this.FLD643) {
            f += Math.abs(((CLS641)object1).MTH2552() - f1 / ((float)v));
        }
        return f <= f1 * 0.05f;
    }

    public final float MTH2526(int v, int v1, int v2, int v3) {
        CLS117 ʻᵢ0 = this.FLD645;
        int v4 = ʻᵢ0.MTH2325();
        int[] arr_v = this.MTH2528();
        int v5;
        for(v5 = v; v5 >= 0 && ʻᵢ0.MTH2331(v5, v1); --v5) {
            ++arr_v[2];
        }
        if(v5 < 0) {
            return NaNf;
        }
        while(v5 >= 0 && !ʻᵢ0.MTH2331(v5, v1)) {
            int v6 = arr_v[1];
            if(v6 > v2) {
                break;
            }
            arr_v[1] = v6 + 1;
            --v5;
        }
        if(v5 >= 0 && arr_v[1] <= v2) {
            while(v5 >= 0 && ʻᵢ0.MTH2331(v5, v1)) {
                int v7 = arr_v[0];
                if(v7 > v2) {
                    break;
                }
                arr_v[0] = v7 + 1;
                --v5;
            }
            if(arr_v[0] > v2) {
                return NaNf;
            }
            int v8;
            for(v8 = v + 1; v8 < v4 && ʻᵢ0.MTH2331(v8, v1); ++v8) {
                ++arr_v[2];
            }
            if(v8 == v4) {
                return NaNf;
            }
            while(v8 < v4 && !ʻᵢ0.MTH2331(v8, v1)) {
                int v9 = arr_v[3];
                if(v9 >= v2) {
                    break;
                }
                arr_v[3] = v9 + 1;
                ++v8;
            }
            if(v8 != v4 && arr_v[3] < v2) {
                while(v8 < v4 && ʻᵢ0.MTH2331(v8, v1)) {
                    int v10 = arr_v[4];
                    if(v10 >= v2) {
                        break;
                    }
                    arr_v[4] = v10 + 1;
                    ++v8;
                }
                int v11 = arr_v[4];
                if(v11 >= v2) {
                    return NaNf;
                }
                if(Math.abs(arr_v[0] + arr_v[1] + arr_v[2] + arr_v[3] + v11 - v3) * 5 >= v3) {
                    return NaNf;
                }
                return CLS136.MTH2527(arr_v) ? CLS136.MTH2522(arr_v, v8) : NaNf;
            }
        }
        return NaNf;
    }

    public static boolean MTH2527(int[] arr_v) {
        int v = 0;
        for(int v1 = 0; v1 < 5; ++v1) {
            int v2 = arr_v[v1];
            if(v2 == 0) {
                return false;
            }
            v += v2;
        }
        if(v < 7) {
            return false;
        }
        float f = ((float)v) / 7.0f / 2.0f;
        return Math.abs(((float)v) / 7.0f - ((float)arr_v[0])) < f && Math.abs(((float)v) / 7.0f - ((float)arr_v[1])) < f && Math.abs(((float)v) / 7.0f * 3.0f - ((float)arr_v[2])) < 3.0f * f && Math.abs(((float)v) / 7.0f - ((float)arr_v[3])) < f && Math.abs(((float)v) / 7.0f - ((float)arr_v[4])) < f;
    }

    public final int[] MTH2528() {
        this.FLD647[0] = 0;
        this.FLD647[1] = 0;
        this.FLD647[2] = 0;
        this.FLD647[3] = 0;
        this.FLD647[4] = 0;
        return this.FLD647;
    }

    public final int MTH2529() {
        if(this.FLD643.size() <= 1) {
            return 0;
        }
        CLS641 ᵔﹶ0 = null;
        for(Object object0: this.FLD643) {
            CLS641 ᵔﹶ1 = (CLS641)object0;
            if(ᵔﹶ1.MTH2554() < 2) {
                continue;
            }
            if(ᵔﹶ0 == null) {
                ᵔﹶ0 = ᵔﹶ1;
                continue;
            }
            this.FLD646 = true;
            return ((int)(Math.abs(((CLS380)ᵔﹶ0).MTH5130() - ((CLS380)ᵔﹶ1).MTH5130()) - Math.abs(((CLS380)ᵔﹶ0).MTH5131() - ((CLS380)ᵔﹶ1).MTH5131()))) / 2;
        }
        return 0;
    }

    public final float MTH2530(int v, int v1, int v2, int v3) {
        CLS117 ʻᵢ0 = this.FLD645;
        int v4 = ʻᵢ0.MTH2328();
        int[] arr_v = this.MTH2528();
        int v5;
        for(v5 = v; v5 >= 0 && ʻᵢ0.MTH2331(v1, v5); --v5) {
            ++arr_v[2];
        }
        if(v5 < 0) {
            return NaNf;
        }
        while(v5 >= 0 && !ʻᵢ0.MTH2331(v1, v5)) {
            int v6 = arr_v[1];
            if(v6 > v2) {
                break;
            }
            arr_v[1] = v6 + 1;
            --v5;
        }
        if(v5 >= 0 && arr_v[1] <= v2) {
            while(v5 >= 0 && ʻᵢ0.MTH2331(v1, v5)) {
                int v7 = arr_v[0];
                if(v7 > v2) {
                    break;
                }
                arr_v[0] = v7 + 1;
                --v5;
            }
            if(arr_v[0] > v2) {
                return NaNf;
            }
            int v8;
            for(v8 = v + 1; v8 < v4 && ʻᵢ0.MTH2331(v1, v8); ++v8) {
                ++arr_v[2];
            }
            if(v8 == v4) {
                return NaNf;
            }
            while(v8 < v4 && !ʻᵢ0.MTH2331(v1, v8)) {
                int v9 = arr_v[3];
                if(v9 >= v2) {
                    break;
                }
                arr_v[3] = v9 + 1;
                ++v8;
            }
            if(v8 != v4 && arr_v[3] < v2) {
                while(v8 < v4 && ʻᵢ0.MTH2331(v1, v8)) {
                    int v10 = arr_v[4];
                    if(v10 >= v2) {
                        break;
                    }
                    arr_v[4] = v10 + 1;
                    ++v8;
                }
                int v11 = arr_v[4];
                if(v11 >= v2) {
                    return NaNf;
                }
                if(Math.abs(arr_v[0] + arr_v[1] + arr_v[2] + arr_v[3] + v11 - v3) * 5 >= v3 * 2) {
                    return NaNf;
                }
                return CLS136.MTH2527(arr_v) ? CLS136.MTH2522(arr_v, v8) : NaNf;
            }
        }
        return NaNf;
    }
}

