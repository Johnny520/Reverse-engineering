// Decompiled by JEB v5.42.0.202606242140

package c.ﹶˋ;

import c.ٴʽ.CLS258;
import c.ᵎי.CLS306;

public final class CLS349 {
    public static final float[][] FLD1589;

    static {
        CLS349.FLD1589 = new float[CLS306.FLD1453.length][8];
        for(int v = 0; true; ++v) {
            int[] arr_v = CLS306.FLD1453;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = arr_v[v];
            int v2 = v1 & 1;
            int v3 = 0;
            while(v3 < 8) {
                float f = 0.0f;
                while((v1 & 1) == v2) {
                    ++f;
                    v1 >>= 1;
                }
                CLS349.FLD1589[v][7 - v3] = f / 17.0f;
                ++v3;
                v2 = v1 & 1;
            }
        }
    }

    public static int MTH4847(int[] arr_v) {
        int v = CLS349.MTH4850(arr_v);
        return CLS306.MTH4522(v) == -1 ? -1 : v;
    }

    public static int[] MTH4848(int[] arr_v) {
        float f = (float)CLS258.MTH3384(arr_v);
        int[] arr_v1 = new int[8];
        int v = 0;
        int v1 = 0;
        for(int v2 = 0; v2 < 17; ++v2) {
            int v3 = arr_v[v1];
            if(((float)(v + v3)) <= f / 34.0f + ((float)v2) * f / 17.0f) {
                v += v3;
                ++v1;
            }
            ++arr_v1[v1];
        }
        return arr_v1;
    }

    public static int MTH4849(int[] arr_v) {
        int v = CLS349.MTH4847(CLS349.MTH4848(arr_v));
        return v == -1 ? CLS349.MTH4851(arr_v) : v;
    }

    public static int MTH4850(int[] arr_v) {
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            for(int v2 = 0; true; ++v2) {
                int v3 = 1;
                if(v2 >= arr_v[v1]) {
                    break;
                }
                if(v1 % 2 != 0) {
                    v3 = 0;
                }
                v = v << 1 | ((long)v3);
            }
        }
        return (int)v;
    }

    public static int MTH4851(int[] arr_v) {
        int v = CLS258.MTH3384(arr_v);
        float[] arr_f = new float[8];
        for(int v1 = 0; v1 < 8; ++v1) {
            arr_f[v1] = ((float)arr_v[v1]) / ((float)v);
        }
        float f = 3.402823E+38f;
        int v2 = -1;
        for(int v3 = 0; true; ++v3) {
            float[][] arr2_f = CLS349.FLD1589;
            if(v3 >= arr2_f.length) {
                break;
            }
            float[] arr_f1 = arr2_f[v3];
            float f1 = 0.0f;
            for(int v4 = 0; v4 < 8; ++v4) {
                float f2 = arr_f1[v4] - arr_f[v4];
                f1 += f2 * f2;
                if(f1 >= f) {
                    break;
                }
            }
            if(f1 < f) {
                v2 = CLS306.FLD1453[v3];
                f = f1;
            }
        }
        return v2;
    }
}

