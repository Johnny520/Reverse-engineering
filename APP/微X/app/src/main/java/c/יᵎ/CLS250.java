// Decompiled by JEB v5.42.0.202606242140

package c.יᵎ;

import c.ᐧᵎ.CLS266;
import c.ᐧᵎ.CLS268;
import c.ﾞʾ.CLS366;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class CLS250 {
    public static final class CLS247 implements Serializable, Comparator {
        public final float FLD974;

        public CLS247(float f) {
            this.FLD974 = f;
        }

        public CLS247(float f, CLS248 ˈᴵ$ⁱˋ0) {
            this(f);
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.MTH3269(((CLS571)object0), ((CLS571)object1));
        }

        public int MTH3269(CLS571 ˉˎ0, CLS571 ˉˎ1) {
            float f = Math.abs(ˉˎ1.MTH3288() - this.FLD974);
            float f1 = Math.abs(ˉˎ0.MTH3288() - this.FLD974);
            if(f < f1) {
                return -1;
            }
            return f == f1 ? 0 : 1;
        }
    }

    public static class CLS248 {
    }

    public static final class CLS249 implements Serializable, Comparator {
        public final float FLD975;

        public CLS249(float f) {
            this.FLD975 = f;
        }

        public CLS249(float f, CLS248 ˈᴵ$ⁱˋ0) {
            this(f);
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.MTH3273(((CLS571)object0), ((CLS571)object1));
        }

        public int MTH3273(CLS571 ˉˎ0, CLS571 ˉˎ1) {
            if(ˉˎ1.MTH3290() == ˉˎ0.MTH3290()) {
                float f = Math.abs(ˉˎ1.MTH3288() - this.FLD975);
                float f1 = Math.abs(ˉˎ0.MTH3288() - this.FLD975);
                if(f < f1) {
                    return 1;
                }
                return f == f1 ? 0 : -1;
            }
            return ˉˎ1.MTH3290() - ˉˎ0.MTH3290();
        }
    }

    public boolean FLD976;
    public final CLS266 FLD977;
    public final int[] FLD978;
    public final CLS366 FLD979;
    public final List FLD980;

    public CLS250(CLS366 ﾞⁱ0, CLS266 ʾᐧ0) {
        this.FLD979 = ﾞⁱ0;
        this.FLD980 = new ArrayList();
        this.FLD978 = new int[5];
        this.FLD977 = ʾᐧ0;
    }

    public final float MTH3275(int v, int v1, int v2, int v3) {
        CLS366 ﾞⁱ0 = this.FLD979;
        int v4 = ﾞⁱ0.MTH5044();
        int[] arr_v = this.MTH3281();
        int v5;
        for(v5 = v; v5 >= 0 && ﾞⁱ0.MTH5038(v5, v1); --v5) {
            ++arr_v[2];
        }
        if(v5 < 0) {
            return NaNf;
        }
        while(v5 >= 0 && !ﾞⁱ0.MTH5038(v5, v1)) {
            int v6 = arr_v[1];
            if(v6 > v2) {
                break;
            }
            arr_v[1] = v6 + 1;
            --v5;
        }
        if(v5 >= 0 && arr_v[1] <= v2) {
            while(v5 >= 0 && ﾞⁱ0.MTH5038(v5, v1)) {
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
            for(v8 = v + 1; v8 < v4 && ﾞⁱ0.MTH5038(v8, v1); ++v8) {
                ++arr_v[2];
            }
            if(v8 == v4) {
                return NaNf;
            }
            while(v8 < v4 && !ﾞⁱ0.MTH5038(v8, v1)) {
                int v9 = arr_v[3];
                if(v9 >= v2) {
                    break;
                }
                arr_v[3] = v9 + 1;
                ++v8;
            }
            if(v8 != v4 && arr_v[3] < v2) {
                while(v8 < v4 && ﾞⁱ0.MTH5038(v8, v1)) {
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
                return CLS250.MTH3284(arr_v) ? CLS250.MTH3283(arr_v, v8) : NaNf;
            }
        }
        return NaNf;
    }

    public final boolean MTH3276(int[] arr_v, int v, int v1, boolean z) {
        boolean z1 = false;
        int v2 = arr_v[0] + arr_v[1] + arr_v[2] + arr_v[3] + arr_v[4];
        int v3 = (int)CLS250.MTH3283(arr_v, v1);
        float f = this.MTH3278(v, v3, arr_v[2], v2);
        if(!Float.isNaN(f)) {
            float f1 = this.MTH3275(v3, ((int)f), arr_v[2], v2);
            if(!Float.isNaN(f1) && (!z || this.MTH3285(((int)f), ((int)f1), arr_v[2], v2))) {
                for(int v4 = 0; v4 < this.FLD980.size(); ++v4) {
                    CLS571 ˉˎ0 = (CLS571)this.FLD980.get(v4);
                    if(ˉˎ0.MTH3289(((float)v2) / 7.0f, f, f1)) {
                        CLS571 ˉˎ1 = ˉˎ0.MTH3291(f, f1, ((float)v2) / 7.0f);
                        this.FLD980.set(v4, ˉˎ1);
                        z1 = true;
                        break;
                    }
                }
                if(!z1) {
                    CLS571 ˉˎ2 = new CLS571(f1, f, ((float)v2) / 7.0f);
                    this.FLD980.add(ˉˎ2);
                    CLS266 ʾᐧ0 = this.FLD977;
                    if(ʾᐧ0 != null) {
                        ʾᐧ0.MTH3454(((CLS268)ˉˎ2));
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final CLS251 MTH3277(Map map0) {
        boolean z = map0 != null && map0.containsKey(DecodeHintType.TRY_HARDER);
        boolean z1 = map0 != null && map0.containsKey(DecodeHintType.PURE_BARCODE);
        int v = this.FLD979.MTH5046();
        int v1 = this.FLD979.MTH5044();
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
                if(this.FLD979.MTH5038(v4, v3)) {
                    if((v5 & 1) == 1) {
                        ++v5;
                    }
                    ++arr_v[v5];
                }
                else if((v5 & 1) != 0) {
                    ++arr_v[v5];
                }
                else if(v5 == 4) {
                    if(CLS250.MTH3284(arr_v)) {
                        if(this.MTH3276(arr_v, v3, v4, z1)) {
                            if(this.FLD976) {
                                z2 = this.MTH3282();
                            }
                            else {
                                int v6 = this.MTH3280();
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
            if(CLS250.MTH3284(arr_v) && this.MTH3276(arr_v, v3, v1, z1)) {
                v2 = arr_v[0];
                if(this.FLD976) {
                    z2 = this.MTH3282();
                }
            }
            v3 += v2;
        }
        CLS571[] arr_ˉˎ = this.MTH3279();
        CLS268.MTH3469(((CLS268[])arr_ˉˎ));
        return new CLS251(arr_ˉˎ);
    }

    public final float MTH3278(int v, int v1, int v2, int v3) {
        CLS366 ﾞⁱ0 = this.FLD979;
        int v4 = ﾞⁱ0.MTH5046();
        int[] arr_v = this.MTH3281();
        int v5;
        for(v5 = v; v5 >= 0 && ﾞⁱ0.MTH5038(v1, v5); --v5) {
            ++arr_v[2];
        }
        if(v5 < 0) {
            return NaNf;
        }
        while(v5 >= 0 && !ﾞⁱ0.MTH5038(v1, v5)) {
            int v6 = arr_v[1];
            if(v6 > v2) {
                break;
            }
            arr_v[1] = v6 + 1;
            --v5;
        }
        if(v5 >= 0 && arr_v[1] <= v2) {
            while(v5 >= 0 && ﾞⁱ0.MTH5038(v1, v5)) {
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
            for(v8 = v + 1; v8 < v4 && ﾞⁱ0.MTH5038(v1, v8); ++v8) {
                ++arr_v[2];
            }
            if(v8 == v4) {
                return NaNf;
            }
            while(v8 < v4 && !ﾞⁱ0.MTH5038(v1, v8)) {
                int v9 = arr_v[3];
                if(v9 >= v2) {
                    break;
                }
                arr_v[3] = v9 + 1;
                ++v8;
            }
            if(v8 != v4 && arr_v[3] < v2) {
                while(v8 < v4 && ﾞⁱ0.MTH5038(v1, v8)) {
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
                return CLS250.MTH3284(arr_v) ? CLS250.MTH3283(arr_v, v8) : NaNf;
            }
        }
        return NaNf;
    }

    public final CLS571[] MTH3279() {
        float f = 0.0f;
        int v = this.FLD980.size();
        if(v < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if(v > 3) {
            float f1 = 0.0f;
            float f2 = 0.0f;
            for(Object object0: this.FLD980) {
                float f3 = ((CLS571)object0).MTH3288();
                f1 += f3;
                f2 += f3 * f3;
            }
            float f4 = f1 / ((float)v);
            CLS247 ˈᴵ$ʾʻ0 = new CLS247(f4, null);
            Collections.sort(this.FLD980, ˈᴵ$ʾʻ0);
            float f5 = Math.max(0.2f * f4, ((float)Math.sqrt(f2 / ((float)v) - f4 * f4)));
            for(int v1 = 0; v1 < this.FLD980.size() && this.FLD980.size() > 3; ++v1) {
                if(Math.abs(((CLS571)this.FLD980.get(v1)).MTH3288() - f4) > f5) {
                    this.FLD980.remove(v1);
                    --v1;
                }
            }
        }
        if(this.FLD980.size() > 3) {
            for(Object object1: this.FLD980) {
                f += ((CLS571)object1).MTH3288();
            }
            CLS249 ˈᴵ$ﾞⁱ0 = new CLS249(f / ((float)this.FLD980.size()), null);
            Collections.sort(this.FLD980, ˈᴵ$ﾞⁱ0);
            this.FLD980.subList(3, this.FLD980.size()).clear();
        }
        return new CLS571[]{((CLS571)this.FLD980.get(0)), ((CLS571)this.FLD980.get(1)), ((CLS571)this.FLD980.get(2))};
    }

    public final int MTH3280() {
        if(this.FLD980.size() <= 1) {
            return 0;
        }
        CLS571 ˉˎ0 = null;
        for(Object object0: this.FLD980) {
            CLS571 ˉˎ1 = (CLS571)object0;
            if(ˉˎ1.MTH3290() < 2) {
                continue;
            }
            if(ˉˎ0 == null) {
                ˉˎ0 = ˉˎ1;
                continue;
            }
            this.FLD976 = true;
            return ((int)(Math.abs(((CLS268)ˉˎ0).MTH3468() - ((CLS268)ˉˎ1).MTH3468()) - Math.abs(((CLS268)ˉˎ0).MTH3470() - ((CLS268)ˉˎ1).MTH3470()))) / 2;
        }
        return 0;
    }

    public final int[] MTH3281() {
        this.FLD978[0] = 0;
        this.FLD978[1] = 0;
        this.FLD978[2] = 0;
        this.FLD978[3] = 0;
        this.FLD978[4] = 0;
        return this.FLD978;
    }

    public final boolean MTH3282() {
        int v = this.FLD980.size();
        float f = 0.0f;
        int v1 = 0;
        float f1 = 0.0f;
        for(Object object0: this.FLD980) {
            CLS571 ˉˎ0 = (CLS571)object0;
            if(ˉˎ0.MTH3290() >= 2) {
                ++v1;
                f1 += ˉˎ0.MTH3288();
            }
        }
        if(v1 < 3) {
            return false;
        }
        for(Object object1: this.FLD980) {
            f += Math.abs(((CLS571)object1).MTH3288() - f1 / ((float)v));
        }
        return f <= f1 * 0.05f;
    }

    public static float MTH3283(int[] arr_v, int v) {
        return ((float)(v - arr_v[4] - arr_v[3])) - ((float)arr_v[2]) / 2.0f;
    }

    public static boolean MTH3284(int[] arr_v) {
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

    public final boolean MTH3285(int v, int v1, int v2, int v3) {
        int[] arr_v = this.MTH3281();
        int v4;
        for(v4 = 0; v >= v4 && v1 >= v4 && this.FLD979.MTH5038(v1 - v4, v - v4); ++v4) {
            ++arr_v[2];
        }
        if(v >= v4 && v1 >= v4) {
            while(v >= v4 && v1 >= v4 && !this.FLD979.MTH5038(v1 - v4, v - v4)) {
                int v5 = arr_v[1];
                if(v5 > v2) {
                    break;
                }
                arr_v[1] = v5 + 1;
                ++v4;
            }
            if(v >= v4 && v1 >= v4 && arr_v[1] <= v2) {
                while(v >= v4 && v1 >= v4 && this.FLD979.MTH5038(v1 - v4, v - v4)) {
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
                int v7 = this.FLD979.MTH5046();
                int v8 = this.FLD979.MTH5044();
                int v9;
                for(v9 = 1; true; ++v9) {
                    int v10 = v + v9;
                    if(v10 >= v7 || (v1 + v9 >= v8 || !this.FLD979.MTH5038(v1 + v9, v10))) {
                        break;
                    }
                    ++arr_v[2];
                }
                if(v10 < v7 && v1 + v9 < v8) {
                    while(true) {
                        int v11 = v + v9;
                        if(v11 >= v7 || (v1 + v9 >= v8 || this.FLD979.MTH5038(v1 + v9, v11))) {
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
                        while(v + v9 < v7 && (v1 + v9 < v8 && this.FLD979.MTH5038(v1 + v9, v + v9))) {
                            int v13 = arr_v[4];
                            if(v13 >= v2) {
                                break;
                            }
                            arr_v[4] = v13 + 1;
                            ++v9;
                        }
                        int v14 = arr_v[4];
                        return v14 < v2 ? Math.abs(arr_v[0] + arr_v[1] + arr_v[2] + arr_v[3] + v14 - v3) < v3 * 2 && CLS250.MTH3284(arr_v) : false;
                    }
                }
            }
        }
        return false;
    }
}

