// Decompiled by JEB v5.42.0.202606242140

package c.ˎˊ;

import c.ﾞﹶ.CLS375;
import c.ﾞﹶ.CLS378;

public final class CLS832 extends CLS628 {
    public CLS117 FLD572;

    public CLS832(CLS378 ـᵎ0) {
        super(ـᵎ0);
    }

    @Override  // c.ˎˊ.CLS628
    public CLS117 MTH5095() {
        CLS117 ʻᵢ1;
        CLS117 ʻᵢ0 = this.FLD572;
        if(ʻᵢ0 != null) {
            return ʻᵢ0;
        }
        CLS378 ـᵎ0 = ((CLS375)this).MTH5096();
        int v = ـᵎ0.MTH5110();
        int v1 = ـᵎ0.MTH5107();
        if(v < 40 || v1 < 40) {
            ʻᵢ1 = ((CLS628)this).super.MTH5095();
        }
        else {
            byte[] arr_b = ـᵎ0.MTH5105();
            int v2 = (v & 7) == 0 ? v >> 3 : (v >> 3) + 1;
            int v3 = (v1 & 7) == 0 ? v1 >> 3 : (v1 >> 3) + 1;
            int[][] arr2_v = CLS832.MTH2368(arr_b, v2, v3, v, v1);
            ʻᵢ1 = new CLS117(v, v1);
            CLS832.MTH2369(arr_b, v2, v3, v, v1, arr2_v, ʻᵢ1);
        }
        this.FLD572 = ʻᵢ1;
        return this.FLD572;
    }

    public static void MTH2365(byte[] arr_b, int v, int v1, int v2, int v3, CLS117 ʻᵢ0) {
        int v4 = v1 * v3 + v;
        int v5 = 0;
        while(v5 < 8) {
            for(int v6 = 0; v6 < 8; ++v6) {
                if((arr_b[v4 + v6] & 0xFF) <= v2) {
                    ʻᵢ0.MTH2318(v + v6, v1 + v5);
                }
            }
            ++v5;
            v4 += v3;
        }
    }

    @Override  // c.ﾞﹶ.CLS375
    public CLS375 MTH5097(CLS378 ـᵎ0) {
        return new CLS832(ـᵎ0);
    }

    public static int MTH2367(int v, int v1, int v2) {
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    public static int[][] MTH2368(byte[] arr_b, int v, int v1, int v2, int v3) {
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

    public static void MTH2369(byte[] arr_b, int v, int v1, int v2, int v3, int[][] arr2_v, CLS117 ʻᵢ0) {
        for(int v4 = 0; v4 < v1; ++v4) {
            int v5 = v4 << 3 <= v3 - 8 ? v4 << 3 : v3 - 8;
            for(int v6 = 0; v6 < v; ++v6) {
                int v7 = CLS832.MTH2367(v6, 2, v - 3);
                int v8 = CLS832.MTH2367(v4, 2, v1 - 3);
                int v9 = 0;
                for(int v10 = -2; v10 <= 2; ++v10) {
                    int[] arr_v = arr2_v[v8 + v10];
                    v9 += arr_v[v7 - 2] + arr_v[v7 - 1] + arr_v[v7] + arr_v[v7 + 1] + arr_v[v7 + 2];
                }
                CLS832.MTH2365(arr_b, (v6 << 3 > v2 - 8 ? v2 - 8 : v6 << 3), v5, v9 / 25, v2, ʻᵢ0);
            }
        }
    }
}

