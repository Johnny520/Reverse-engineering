// Decompiled by JEB v5.42.0.202606242140

package c.ٴʽ;

public final class CLS258 {
    public static int MTH3383(float f) {
        return f < 0.0f ? ((int)(f - 0.5f)) : ((int)(f + 0.5f));
    }

    public static int MTH3384(int[] arr_v) {
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += arr_v[v];
        }
        return v1;
    }

    public static float MTH3385(float f, float f1, float f2, float f3) {
        return (float)Math.sqrt((f - f2) * (f - f2) + (f1 - f3) * (f1 - f3));
    }

    public static float MTH3386(int v, int v1, int v2, int v3) {
        return (float)Math.sqrt((v - v2) * (v - v2) + (v1 - v3) * (v1 - v3));
    }
}

