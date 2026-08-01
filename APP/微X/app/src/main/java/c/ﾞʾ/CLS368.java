// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import c.ˎʼ.CLS114;
import c.ˑـ.CLS130;

public final class CLS368 {
    public static final float[][] FLD1620;

    static {
        CLS368.FLD1620 = new float[CLS130.FLD625.length][8];
        for(int v = 0; true; ++v) {
            int[] arr_v = CLS130.FLD625;
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
                CLS368.FLD1620[v][7 - v3] = f / 17.0f;
                ++v3;
                v2 = v1 & 1;
            }
        }
    }

    public static int MTH4984(int[] arr_v) {
        int v = CLS114.MTH2298(arr_v);
        float[] arr_f = new float[8];
        for(int v1 = 0; v1 < 8; ++v1) {
            arr_f[v1] = ((float)arr_v[v1]) / ((float)v);
        }
        float f = 3.402823E+38f;
        int v2 = -1;
        for(int v3 = 0; true; ++v3) {
            float[][] arr2_f = CLS368.FLD1620;
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
                v2 = CLS130.FLD625[v3];
                f = f1;
            }
        }
        return v2;
    }

    public static int[] MTH4985(int[] arr_v) {
        float f = (float)CLS114.MTH2298(arr_v);
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

    public static int MTH4986(int[] arr_v) {
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

    public static int MTH4987(int[] arr_v) {
        int v = CLS368.MTH4986(arr_v);
        return CLS130.MTH2499(v) == -1 ? -1 : v;
    }

    public static int MTH4988(int[] arr_v) {
        int v = CLS368.MTH4987(CLS368.MTH4985(arr_v));
        return v == -1 ? CLS368.MTH4984(arr_v) : v;
    }
}

