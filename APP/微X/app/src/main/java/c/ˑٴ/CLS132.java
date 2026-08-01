// Decompiled by JEB v5.42.0.202606242140

package c.ˑٴ;

import c.ˎˊ.CLS117;
import c.ﾞﹶ.CLS376;
import c.ﾞﹶ.CLS380;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;

public final class CLS132 {
    public final List FLD632;
    public final int FLD633;
    public final CLS117 FLD634;
    public final CLS376 FLD635;
    public final int FLD636;
    public final float FLD637;
    public final int[] FLD638;
    public final int FLD639;
    public final int FLD640;

    public CLS132(CLS117 ʻᵢ0, int v, int v1, int v2, int v3, float f, CLS376 ˋᵎ0) {
        this.FLD634 = ʻᵢ0;
        this.FLD632 = new ArrayList(5);
        this.FLD636 = v;
        this.FLD640 = v1;
        this.FLD633 = v2;
        this.FLD639 = v3;
        this.FLD637 = f;
        this.FLD638 = new int[3];
        this.FLD635 = ˋᵎ0;
    }

    public final float MTH2506(int v, int v1, int v2, int v3) {
        CLS117 ʻᵢ0 = this.FLD634;
        int v4 = ʻᵢ0.MTH2328();
        int[] arr_v = this.FLD638;
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        int v5;
        for(v5 = v; v5 >= 0 && ʻᵢ0.MTH2331(v1, v5); --v5) {
            int v6 = arr_v[1];
            if(v6 > v2) {
                break;
            }
            arr_v[1] = v6 + 1;
        }
        if(v5 >= 0 && arr_v[1] <= v2) {
            while(v5 >= 0 && !ʻᵢ0.MTH2331(v1, v5)) {
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
                int v9 = arr_v[1];
                if(v9 > v2) {
                    break;
                }
                arr_v[1] = v9 + 1;
            }
            if(v8 != v4 && arr_v[1] <= v2) {
                while(v8 < v4 && !ʻᵢ0.MTH2331(v1, v8)) {
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
                return this.MTH2510(arr_v) ? CLS132.MTH2508(arr_v, v8) : NaNf;
            }
        }
        return NaNf;
    }

    public final CLS640 MTH2507(int[] arr_v, int v, int v1) {
        int v2 = arr_v[0] + arr_v[1] + arr_v[2];
        float f = CLS132.MTH2508(arr_v, v1);
        float f1 = this.MTH2506(v, ((int)f), arr_v[1] * 2, v2);
        if(!Float.isNaN(f1)) {
            float f2 = ((float)(arr_v[0] + arr_v[1] + arr_v[2])) / 3.0f;
            for(Object object0: this.FLD632) {
                CLS640 ˆٴ0 = (CLS640)object0;
                if(ˆٴ0.MTH2533(f2, f1, f)) {
                    return ˆٴ0.MTH2532(f1, f, f2);
                }
                if(false) {
                    break;
                }
            }
            CLS640 ˆٴ1 = new CLS640(f, f1, f2);
            this.FLD632.add(ˆٴ1);
            CLS376 ˋᵎ0 = this.FLD635;
            if(ˋᵎ0 != null) {
                ˋᵎ0.MTH5101(((CLS380)ˆٴ1));
            }
        }
        return null;
    }

    public static float MTH2508(int[] arr_v, int v) {
        return ((float)(v - arr_v[2])) - ((float)arr_v[1]) / 2.0f;
    }

    public CLS640 MTH2509() {
        int v = this.FLD636;
        int v1 = this.FLD639;
        int v2 = this.FLD633 + v;
        int v3 = this.FLD640 + v1 / 2;
        int[] arr_v = new int[3];
        for(int v4 = 0; v4 < v1; ++v4) {
            int v5 = ((v4 & 1) == 0 ? (v4 + 1) / 2 : -((v4 + 1) / 2)) + v3;
            arr_v[0] = 0;
            arr_v[1] = 0;
            arr_v[2] = 0;
            int v6;
            for(v6 = v; v6 < v2 && !this.FLD634.MTH2331(v6, v5); ++v6) {
            }
            int v7 = 0;
            while(v6 < v2) {
                if(!this.FLD634.MTH2331(v6, v5)) {
                    if(v7 == 1) {
                        v7 = 2;
                    }
                    ++arr_v[v7];
                }
                else if(v7 == 1) {
                    ++arr_v[1];
                }
                else if(v7 == 2) {
                    if(this.MTH2510(arr_v)) {
                        CLS640 ˆٴ0 = this.MTH2507(arr_v, v5, v6);
                        if(ˆٴ0 != null) {
                            return ˆٴ0;
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
            if(this.MTH2510(arr_v)) {
                CLS640 ˆٴ1 = this.MTH2507(arr_v, v5, v2);
                if(ˆٴ1 != null) {
                    return ˆٴ1;
                }
            }
        }
        if(this.FLD632.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (CLS640)this.FLD632.get(0);
    }

    public final boolean MTH2510(int[] arr_v) {
        float f = this.FLD637;
        for(int v = 0; v < 3; ++v) {
            if(Math.abs(f - ((float)arr_v[v])) >= f / 2.0f) {
                return false;
            }
        }
        return true;
    }
}

