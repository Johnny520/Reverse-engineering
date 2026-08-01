// Decompiled by JEB v5.42.0.202606242140

package c.ⁱי;

public final class CLS339 {
    public static int MTH4803(int v, int v1) {
        int v2 = v - v1;
        if(v2 > v1) {
            int v3 = v2;
            v2 = v1;
            v1 = v3;
        }
        int v4 = 1;
        int v5 = 1;
        while(v > v1) {
            v4 *= v;
            if(v5 <= v2) {
                v4 /= v5;
                ++v5;
            }
            --v;
        }
        while(v5 <= v2) {
            v4 /= v5;
            ++v5;
        }
        return v4;
    }

    public static int MTH4804(int[] arr_v, int v, boolean z) {
        int v2 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v2 += arr_v[v1];
        }
        int v4 = 0;
        int v5 = 0;
        for(int v3 = 0; true; ++v3) {
            int v6 = arr_v.length - 1;
            if(v3 >= v6) {
                break;
            }
            int v7 = 1 << v3;
            v5 |= v7;
            int v8 = 1;
            while(v8 < arr_v[v3]) {
                int v9 = v2 - v8;
                int v10 = arr_v.length - v3;
                int v11 = v10 - 2;
                int v12 = CLS339.MTH4803(v9 - 1, v11);
                if(z && v5 == 0 && v9 - (v10 - 1) >= v10 - 1) {
                    v12 -= CLS339.MTH4803(v9 - v10, v11);
                }
                if(v10 - 1 > 1) {
                    int v13 = v9 - v11;
                    int v14 = 0;
                    while(v13 > v) {
                        v14 += CLS339.MTH4803(v9 - v13 - 1, v10 - 3);
                        --v13;
                    }
                    v12 -= v14 * (v6 - v3);
                }
                else if(v9 > v) {
                    --v12;
                }
                v4 += v12;
                ++v8;
                v5 &= ~v7;
            }
            v2 -= v8;
        }
        return v4;
    }
}

