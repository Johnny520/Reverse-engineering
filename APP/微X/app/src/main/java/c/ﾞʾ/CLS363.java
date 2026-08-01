// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import com.google.zxing.NotFoundException;

public abstract class CLS363 {
    public static CLS363 FLD1639;

    static {
        CLS363.FLD1639 = new CLS818();
    }

    public abstract CLS366 MTH4983(CLS366 arg1, int arg2, int arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19);

    public abstract CLS366 MTH4984(CLS366 arg1, int arg2, int arg3, CLS364 arg4);

    public static void MTH4985(CLS366 ﾞⁱ0, float[] arr_f) {
        int v = ﾞⁱ0.MTH5044();
        int v1 = ﾞⁱ0.MTH5046();
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

    public static CLS363 MTH4986() {
        return CLS363.FLD1639;
    }
}

