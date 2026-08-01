// Decompiled by JEB v5.42.0.202606242140

package c.יᵎ;

import c.ᐧᵎ.CLS266;
import c.ᐧᵎ.CLS268;
import c.ﾞʾ.CLS366;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;

public final class CLS252 {
    public final int FLD987;
    public final CLS266 FLD988;
    public final int FLD989;
    public final int FLD990;
    public final int FLD991;
    public final int[] FLD992;
    public final CLS366 FLD993;
    public final float FLD994;
    public final List FLD995;

    public CLS252(CLS366 ﾞⁱ0, int v, int v1, int v2, int v3, float f, CLS266 ʾᐧ0) {
        this.FLD993 = ﾞⁱ0;
        this.FLD995 = new ArrayList(5);
        this.FLD987 = v;
        this.FLD990 = v1;
        this.FLD989 = v2;
        this.FLD991 = v3;
        this.FLD994 = f;
        this.FLD992 = new int[3];
        this.FLD988 = ʾᐧ0;
    }

    public CLS572 MTH3300() {
        int v = this.FLD987;
        int v1 = this.FLD991;
        int v2 = this.FLD989 + v;
        int v3 = this.FLD990 + v1 / 2;
        int[] arr_v = new int[3];
        for(int v4 = 0; v4 < v1; ++v4) {
            int v5 = ((v4 & 1) == 0 ? (v4 + 1) / 2 : -((v4 + 1) / 2)) + v3;
            arr_v[0] = 0;
            arr_v[1] = 0;
            arr_v[2] = 0;
            int v6;
            for(v6 = v; v6 < v2 && !this.FLD993.MTH5038(v6, v5); ++v6) {
            }
            int v7 = 0;
            while(v6 < v2) {
                if(!this.FLD993.MTH5038(v6, v5)) {
                    if(v7 == 1) {
                        v7 = 2;
                    }
                    ++arr_v[v7];
                }
                else if(v7 == 1) {
                    ++arr_v[1];
                }
                else if(v7 == 2) {
                    if(this.MTH3302(arr_v)) {
                        CLS572 ⁱˋ0 = this.MTH3301(arr_v, v5, v6);
                        if(ⁱˋ0 != null) {
                            return ⁱˋ0;
                        }
                    }
                    arr_v[0] = arr_v[2];
                    arr_v[1] = 1;
                    arr_v[2] = 0;
                    v7 = 1;
                }
                else {
                    ++v7;
                    ++arr_v[v7];
                }
                ++v6;
            }
            if(this.MTH3302(arr_v)) {
                CLS572 ⁱˋ1 = this.MTH3301(arr_v, v5, v2);
                if(ⁱˋ1 != null) {
                    return ⁱˋ1;
                }
            }
        }
        if(this.FLD995.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (CLS572)this.FLD995.get(0);
    }

    public final CLS572 MTH3301(int[] arr_v, int v, int v1) {
        int v2 = arr_v[0] + arr_v[1] + arr_v[2];
        float f = CLS252.MTH3303(arr_v, v1);
        float f1 = this.MTH3304(v, ((int)f), arr_v[1] * 2, v2);
        if(!Float.isNaN(f1)) {
            float f2 = ((float)(arr_v[0] + arr_v[1] + arr_v[2])) / 3.0f;
            for(Object object0: this.FLD995) {
                CLS572 ⁱˋ0 = (CLS572)object0;
                if(ⁱˋ0.MTH3297(f2, f1, f)) {
                    return ⁱˋ0.MTH3298(f1, f, f2);
                }
                if(false) {
                    break;
                }
            }
            CLS572 ⁱˋ1 = new CLS572(f, f1, f2);
            this.FLD995.add(ⁱˋ1);
            CLS266 ʾᐧ0 = this.FLD988;
            if(ʾᐧ0 != null) {
                ʾᐧ0.MTH3454(((CLS268)ⁱˋ1));
            }
        }
        return null;
    }

    public final boolean MTH3302(int[] arr_v) {
        float f = this.FLD994;
        for(int v = 0; v < 3; ++v) {
            if(Math.abs(f - ((float)arr_v[v])) >= f / 2.0f) {
                return false;
            }
        }
        return true;
    }

    public static float MTH3303(int[] arr_v, int v) {
        return ((float)(v - arr_v[2])) - ((float)arr_v[1]) / 2.0f;
    }

    public final float MTH3304(int v, int v1, int v2, int v3) {
        CLS366 ﾞⁱ0 = this.FLD993;
        int v4 = ﾞⁱ0.MTH5046();
        int[] arr_v = this.FLD992;
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        int v5;
        for(v5 = v; v5 >= 0 && ﾞⁱ0.MTH5038(v1, v5); --v5) {
            int v6 = arr_v[1];
            if(v6 > v2) {
                break;
            }
            arr_v[1] = v6 + 1;
        }
        if(v5 >= 0 && arr_v[1] <= v2) {
            while(v5 >= 0 && !ﾞⁱ0.MTH5038(v1, v5)) {
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
                int v9 = arr_v[1];
                if(v9 > v2) {
                    break;
                }
                arr_v[1] = v9 + 1;
            }
            if(v8 != v4 && arr_v[1] <= v2) {
                while(v8 < v4 && !ﾞⁱ0.MTH5038(v1, v8)) {
                    int v10 = arr_v[2];
                    if(v10 > v2) {
                        break;
                    }
                    arr_v[2] = v10 + 1;
                    ++v8;
                }
                int v11 = arr_v[2];
                if(v11 > v2) {
                    return NaNf;
                }
                if(Math.abs(arr_v[0] + arr_v[1] + v11 - v3) * 5 >= v3 * 2) {
                    return NaNf;
                }
                return this.MTH3302(arr_v) ? CLS252.MTH3303(arr_v, v8) : NaNf;
            }
        }
        return NaNf;
    }
}

