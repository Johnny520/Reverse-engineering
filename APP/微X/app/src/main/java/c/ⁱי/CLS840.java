// Decompiled by JEB v5.42.0.202606242140

package c.ⁱי;

import c.ˏـ.CLS439;
import com.google.zxing.NotFoundException;

public abstract class CLS840 extends CLS439 {
    public final float[] FLD1572;
    public final int[] FLD1573;
    public final float[] FLD1574;
    public final int[] FLD1575;
    public final int[] FLD1576;
    public final int[] FLD1577;

    public CLS840() {
        this.FLD1576 = new int[4];
        this.FLD1577 = new int[8];
        this.FLD1572 = new float[4];
        this.FLD1574 = new float[4];
        this.FLD1573 = new int[4];
        this.FLD1575 = new int[4];
    }

    public final int[] MTH4806() {
        return this.FLD1576;
    }

    public final int[] MTH4807() {
        return this.FLD1573;
    }

    public final float[] MTH4808() {
        return this.FLD1572;
    }

    public final float[] MTH4809() {
        return this.FLD1574;
    }

    public static void MTH4810(int[] arr_v, float[] arr_f) {
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

    public static boolean MTH4811(int[] arr_v) {
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

    public final int[] MTH4812() {
        return this.FLD1577;
    }

    public final int[] MTH4813() {
        return this.FLD1575;
    }

    public static int MTH4814(int[] arr_v, int[][] arr2_v) {
        for(int v = 0; v < arr2_v.length; ++v) {
            if(CLS439.MTH1679(arr_v, arr2_v[v], 0.45f) < 0.2f) {
                return v;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static void MTH4815(int[] arr_v, float[] arr_f) {
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
}

