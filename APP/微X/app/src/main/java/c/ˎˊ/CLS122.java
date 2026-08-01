// Decompiled by JEB v5.42.0.202606242140

package c.ˎˊ;

import com.google.zxing.NotFoundException;

public abstract class CLS122 {
    public static CLS122 FLD588;

    static {
        CLS122.FLD588 = new CLS627();
    }

    public static CLS122 MTH2390() {
        return CLS122.FLD588;
    }

    public static void MTH2391(CLS117 ʻᵢ0, float[] arr_f) {
        int v = ʻᵢ0.MTH2325();
        int v1 = ʻᵢ0.MTH2328();
        boolean z = true;
        for(int v2 = 0; v2 < arr_f.length && z; v2 += 2) {
            int v3 = (int)arr_f[v2];
            int v4 = (int)arr_f[v2 + 1];
            if(v3 < -1 || v3 > v || v4 < -1 || v4 > v1) {
                throw NotFoundException.getNotFoundInstance();
            }
            if(v3 == -1) {
                arr_f[v2] = 0.0f;
                z = true;
            }
            else if(v3 == v) {
                arr_f[v2] = (float)(v - 1);
                z = true;
            }
            else {
                z = false;
            }
            if(v4 == -1) {
                arr_f[v2 + 1] = 0.0f;
                z = true;
            }
            else if(v4 == v1) {
                arr_f[v2 + 1] = (float)(v1 - 1);
                z = true;
            }
        }
        int v5 = arr_f.length - 2;
        boolean z1 = true;
        while(v5 >= 0 && z1) {
            int v6 = (int)arr_f[v5];
            int v7 = (int)arr_f[v5 + 1];
            if(v6 < -1 || v6 > v || v7 < -1 || v7 > v1) {
                throw NotFoundException.getNotFoundInstance();
            }
            if(v6 == -1) {
                arr_f[v5] = 0.0f;
                z1 = true;
            }
            else if(v6 == v) {
                arr_f[v5] = (float)(v - 1);
                z1 = true;
            }
            else {
                z1 = false;
            }
            if(v7 == -1) {
                arr_f[v5 + 1] = 0.0f;
                z1 = true;
            }
            else if(v7 == v1) {
                arr_f[v5 + 1] = (float)(v1 - 1);
                z1 = true;
            }
            v5 -= 2;
        }
    }

    public abstract CLS117 MTH2392(CLS117 arg1, int arg2, int arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19);

    public abstract CLS117 MTH2393(CLS117 arg1, int arg2, int arg3, CLS120 arg4);
}

