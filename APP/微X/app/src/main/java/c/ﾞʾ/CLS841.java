// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import c.ᐧᵎ.CLS265;
import c.ᐧᵎ.CLS270;

public final class CLS841 extends CLS819 {
    public CLS366 FLD1624;

    public CLS841(CLS265 ʾʻ0) {
        super(ʾʻ0);
    }

    public static int[][] MTH4952(byte[] arr_b, int v, int v1, int v2, int v3) {
        int[][] arr2_v = new int[v1][v];
        for(int v4 = 0; v4 < v1; ++v4) {
            int v5 = v4 << 3 <= v3 - 8 ? v4 << 3 : v3 - 8;
            for(int v6 = 0; v6 < v; ++v6) {
                int v7 = v5 * v2 + (v6 << 3 <= v2 - 8 ? v6 << 3 : v2 - 8);
                int v8 = 0;
                int v9 = 0;
                int v10 = 0xFF;
                int v11 = 0;
                while(v11 < 8) {
                    for(int v12 = 0; v12 < 8; ++v12) {
                        int v13 = arr_b[v7 + v12] & 0xFF;
                        v8 += v13;
                        if(v13 < v10) {
                            v10 = v13;
                        }
                        if(v13 > v9) {
                            v9 = v13;
                        }
                    }
                    if(v9 - v10 > 24) {
                        while(true) {
                            ++v11;
                            v7 += v2;
                            if(v11 >= 8) {
                                break;
                            }
                            for(int v14 = 0; v14 < 8; ++v14) {
                                v8 += arr_b[v7 + v14] & 0xFF;
                            }
                        }
                    }
                    ++v11;
                    v7 += v2;
                }
                int v15 = v8 >> 6;
                if(v9 - v10 <= 24) {
                    v15 = v10 / 2;
                    if(v4 > 0 && v6 > 0) {
                        int[] arr_v = arr2_v[v4 - 1];
                        int v16 = (arr_v[v6] + arr2_v[v4][v6 - 1] * 2 + arr_v[v6 - 1]) / 4;
                        if(v10 < v16) {
                            v15 = v16;
                        }
                    }
                }
                arr2_v[v4][v6] = v15;
            }
        }
        return arr2_v;
    }

    public static void MTH4953(byte[] arr_b, int v, int v1, int v2, int v3, CLS366 ﾞⁱ0) {
        int v4 = v1 * v3 + v;
        int v5 = 0;
        while(v5 < 8) {
            for(int v6 = 0; v6 < 8; ++v6) {
                if((arr_b[v4 + v6] & 0xFF) <= v2) {
                    ﾞⁱ0.MTH5035(v + v6, v1 + v5);
                }
            }
            ++v5;
            v4 += v3;
        }
    }

    public static int MTH4954(int v, int v1, int v2) {
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    public static void MTH4955(byte[] arr_b, int v, int v1, int v2, int v3, int[][] arr2_v, CLS366 ﾞⁱ0) {
        for(int v4 = 0; v4 < v1; ++v4) {
            int v5 = v4 << 3 <= v3 - 8 ? v4 << 3 : v3 - 8;
            for(int v6 = 0; v6 < v; ++v6) {
                int v7 = CLS841.MTH4954(v6, 2, v - 3);
                int v8 = CLS841.MTH4954(v4, 2, v1 - 3);
                int v9 = 0;
                for(int v10 = -2; v10 <= 2; ++v10) {
                    int[] arr_v = arr2_v[v8 + v10];
                    v9 += arr_v[v7 - 2] + arr_v[v7 - 1] + arr_v[v7] + arr_v[v7 + 1] + arr_v[v7 + 2];
                }
                CLS841.MTH4953(arr_b, (v6 << 3 > v2 - 8 ? v2 - 8 : v6 << 3), v5, v9 / 25, v2, ﾞⁱ0);
            }
        }
    }

    @Override  // c.ᐧᵎ.CLS270
    public CLS270 MTH3479(CLS265 ʾʻ0) {
        return new CLS841(ʾʻ0);
    }

    @Override  // c.ﾞʾ.CLS819
    public CLS366 MTH3480() {
        CLS366 ﾞⁱ1;
        CLS366 ﾞⁱ0 = this.FLD1624;
        if(ﾞⁱ0 != null) {
            return ﾞⁱ0;
        }
        CLS265 ʾʻ0 = ((CLS270)this).MTH3476();
        int v = ʾʻ0.MTH3450();
        int v1 = ʾʻ0.MTH3452();
        if(v < 40 || v1 < 40) {
            ﾞⁱ1 = ((CLS819)this).super.MTH3480();
        }
        else {
            byte[] arr_b = ʾʻ0.MTH3453();
            int v2 = (v & 7) == 0 ? v >> 3 : (v >> 3) + 1;
            int v3 = (v1 & 7) == 0 ? v1 >> 3 : (v1 >> 3) + 1;
            int[][] arr2_v = CLS841.MTH4952(arr_b, v2, v3, v, v1);
            ﾞⁱ1 = new CLS366(v, v1);
            CLS841.MTH4955(arr_b, v2, v3, v, v1, arr2_v, ﾞⁱ1);
        }
        this.FLD1624 = ﾞⁱ1;
        return this.FLD1624;
    }
}

