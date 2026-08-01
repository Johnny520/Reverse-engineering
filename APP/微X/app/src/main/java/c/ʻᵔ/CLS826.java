// Decompiled by JEB v5.42.0.202606242140

package c.ʻᵔ;

import c.ᐧـ.CLS807;
import com.google.zxing.NotFoundException;

public abstract class CLS826 extends CLS807 {
    public final int[] FLD108;
    public final int[] FLD109;
    public final int[] FLD110;
    public final float[] FLD111;
    public final int[] FLD112;
    public final float[] FLD113;

    public CLS826() {
        this.FLD110 = new int[4];
        this.FLD108 = new int[8];
        this.FLD111 = new float[4];
        this.FLD113 = new float[4];
        this.FLD109 = new int[4];
        this.FLD112 = new int[4];
    }

    public final int[] MTH774() {
        return this.FLD109;
    }

    public static boolean MTH775(int[] arr_v) {
        int v = arr_v[0] + arr_v[1];
        float f = ((float)v) / ((float)(arr_v[2] + v + arr_v[3]));
        if(f >= 0.791667f && f <= 0.892857f) {
            int v1 = 0x7FFFFFFF;
            int v2 = 0x80000000;
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                int v4 = arr_v[v3];
                if(v4 > v2) {
                    v2 = v4;
                }
                if(v4 < v1) {
                    v1 = v4;
                }
            }
            return v2 < v1 * 10;
        }
        return false;
    }

    public final float[] MTH776() {
        return this.FLD113;
    }

    public static void MTH777(int[] arr_v, float[] arr_f) {
        int v = 0;
        float f = arr_f[0];
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            float f1 = arr_f[v1];
            if(f1 > f) {
                v = v1;
                f = f1;
            }
        }
        ++arr_v[v];
    }

    public final int[] MTH778() {
        return this.FLD110;
    }

    public static int MTH779(int[] arr_v, int[][] arr2_v) {
        for(int v = 0; v < arr2_v.length; ++v) {
            if(CLS807.MTH4616(arr_v, arr2_v[v], 0.45f) < 0.2f) {
                return v;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] MTH780() {
        return this.FLD112;
    }

    public final float[] MTH781() {
        return this.FLD111;
    }

    public static void MTH782(int[] arr_v, float[] arr_f) {
        int v = 0;
        float f = arr_f[0];
        for(int v1 = 1; v1 < arr_v.length; ++v1) {
            float f1 = arr_f[v1];
            if(f1 < f) {
                v = v1;
                f = f1;
            }
        }
        --arr_v[v];
    }

    public final int[] MTH783() {
        return this.FLD108;
    }
}

