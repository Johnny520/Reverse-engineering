// Decompiled by JEB v5.42.0.202606242140

package c.ʽˑ;

import c.ˎˊ.CLS117;
import c.ﾞﹶ.CLS374;
import c.ﾞﹶ.CLS380;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class CLS47 {
    public static final int[] FLD175;
    public static final int[] FLD176;
    public static final int[] FLD177;
    public static final int[] FLD178;

    static {
        CLS47.FLD176 = new int[]{0, 4, 1, 5};
        CLS47.FLD175 = new int[]{6, 2, 7, 3};
        CLS47.FLD177 = new int[]{8, 1, 1, 1, 1, 1, 1, 3};
        CLS47.FLD178 = new int[]{7, 1, 1, 3, 1, 1, 1, 2, 1};
    }

    public static CLS46 MTH996(CLS374 ʻᵢ0, Map map0, boolean z) {
        CLS117 ʻᵢ1 = ʻᵢ0.MTH5087();
        List list0 = CLS47.MTH999(z, ʻᵢ1);
        if(list0.isEmpty()) {
            ʻᵢ1 = ʻᵢ1.MTH2317();
            ʻᵢ1.MTH2322();
            list0 = CLS47.MTH999(z, ʻᵢ1);
        }
        return new CLS46(ʻᵢ1, list0);
    }

    public static CLS380[] MTH997(CLS117 ʻᵢ0, int v, int v1, int v2, int v3, int[] arr_v) {
        int v12;
        int v11;
        int v7;
        CLS380[] arr_ٴⁱ = new CLS380[4];
        int[] arr_v1 = new int[arr_v.length];
        int v4 = v2;
        while(true) {
            boolean z = false;
            if(v4 >= v) {
                break;
            }
            int[] arr_v2 = CLS47.MTH1002(ʻᵢ0, v3, v4, v1, false, arr_v, arr_v1);
            if(arr_v2 != null) {
                int[] arr_v3 = arr_v2;
                int v6 = v4;
                while(v6 > 0) {
                    int[] arr_v4 = CLS47.MTH1002(ʻᵢ0, v3, v6 - 1, v1, false, arr_v, arr_v1);
                    if(arr_v4 != null) {
                        arr_v3 = arr_v4;
                        --v6;
                        continue;
                    }
                    v7 = v6;
                    goto label_19;
                }
                v7 = v6;
            label_19:
                arr_ٴⁱ[0] = new CLS380(((float)arr_v3[0]), ((float)v7));
                arr_ٴⁱ[1] = new CLS380(((float)arr_v3[1]), ((float)v7));
                v4 = v7;
                z = true;
                break;
            }
            v4 += 5;
        }
        int v8 = v4 + 1;
        if(z) {
            int[] arr_v5 = {((int)arr_ٴⁱ[0].MTH5130()), ((int)arr_ٴⁱ[1].MTH5130())};
            int v9 = v8;
            int v10 = 0;
            while(true) {
                if(v9 >= v) {
                    v11 = v10;
                    v12 = v9;
                    break;
                }
                v11 = v10;
                v12 = v9;
                int[] arr_v6 = CLS47.MTH1002(ʻᵢ0, arr_v5[0], v9, v1, false, arr_v, arr_v1);
                if(arr_v6 == null || Math.abs(arr_v5[0] - arr_v6[0]) >= 5 || Math.abs(arr_v5[1] - arr_v6[1]) >= 5) {
                    if(v11 > 25) {
                        break;
                    }
                    v10 = v11 + 1;
                }
                else {
                    arr_v5 = arr_v6;
                    v10 = 0;
                }
                v9 = v12 + 1;
            }
            v8 = v12 - (v11 + 1);
            arr_ٴⁱ[2] = new CLS380(((float)arr_v5[0]), ((float)v8));
            arr_ٴⁱ[3] = new CLS380(((float)arr_v5[1]), ((float)v8));
        }
        if(v8 - v4 < 10) {
            for(int v5 = 0; v5 < 4; ++v5) {
                arr_ٴⁱ[v5] = null;
            }
        }
        return arr_ٴⁱ;
    }

    public static void MTH998(CLS380[] arr_ٴⁱ, CLS380[] arr_ٴⁱ1, int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            arr_ٴⁱ[arr_v[v]] = arr_ٴⁱ1[v];
        }
    }

    public static List MTH999(boolean z, CLS117 ʻᵢ0) {
        CLS380 ٴⁱ3;
        int v2;
        List list0 = new ArrayList();
        int v = 0;
        while(true) {
            int v1 = 0;
            boolean z1 = false;
        label_4:
            if(v >= ʻᵢ0.MTH2328()) {
                break;
            }
            CLS380[] arr_ٴⁱ = CLS47.MTH1001(ʻᵢ0, v, v1);
            if(arr_ٴⁱ[0] != null || arr_ٴⁱ[3] != null) {
                list0.add(arr_ٴⁱ);
                if(z) {
                    CLS380 ٴⁱ2 = arr_ٴⁱ[2];
                    if(ٴⁱ2 == null) {
                        v2 = (int)arr_ٴⁱ[4].MTH5130();
                        ٴⁱ3 = arr_ٴⁱ[4];
                    }
                    else {
                        v2 = (int)ٴⁱ2.MTH5130();
                        ٴⁱ3 = arr_ٴⁱ[2];
                    }
                    v = (int)ٴⁱ3.MTH5131();
                    v1 = v2;
                    z1 = true;
                    goto label_4;
                }
                break;
            }
            if(!z1) {
                break;
            }
            for(Object object0: list0) {
                CLS380 ٴⁱ0 = ((CLS380[])object0)[1];
                if(ٴⁱ0 != null) {
                    v = (int)Math.max(v, ٴⁱ0.MTH5131());
                }
                CLS380 ٴⁱ1 = ((CLS380[])object0)[3];
                if(ٴⁱ1 != null) {
                    v = Math.max(v, ((int)ٴⁱ1.MTH5131()));
                }
            }
            v += 5;
        }
        return list0;
    }

    public static float MTH1000(int[] arr_v, int[] arr_v1, float f) {
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v2 += arr_v[v1];
            v3 += arr_v1[v1];
        }
        if(v2 < v3) {
            return Infinityf;
        }
        float f1 = ((float)v2) / ((float)v3);
        float f2 = 0.0f;
        for(int v = 0; v < arr_v.length; ++v) {
            int v4 = arr_v[v];
            float f3 = ((float)arr_v1[v]) * f1;
            float f4 = (float)v4;
            float f5 = f4 > f3 ? f4 - f3 : f3 - f4;
            if(f5 > f * f1) {
                return Infinityf;
            }
            f2 += f5;
        }
        return f2 / ((float)v2);
    }

    public static CLS380[] MTH1001(CLS117 ʻᵢ0, int v, int v1) {
        int v2 = ʻᵢ0.MTH2328();
        int v3 = ʻᵢ0.MTH2325();
        CLS380[] arr_ٴⁱ = new CLS380[8];
        CLS47.MTH998(arr_ٴⁱ, CLS47.MTH997(ʻᵢ0, v2, v3, v, v1, CLS47.FLD177), CLS47.FLD176);
        CLS380 ٴⁱ0 = arr_ٴⁱ[4];
        if(ٴⁱ0 != null) {
            v1 = (int)ٴⁱ0.MTH5130();
            v = (int)arr_ٴⁱ[4].MTH5131();
        }
        CLS47.MTH998(arr_ٴⁱ, CLS47.MTH997(ʻᵢ0, v2, v3, v, v1, CLS47.FLD178), CLS47.FLD175);
        return arr_ٴⁱ;
    }

    public static int[] MTH1002(CLS117 ʻᵢ0, int v, int v1, int v2, boolean z, int[] arr_v, int[] arr_v1) {
        Arrays.fill(arr_v1, 0, arr_v1.length, 0);
        for(int v3 = 0; ʻᵢ0.MTH2331(v, v1) && v > 0 && v3 < 3; ++v3) {
            --v;
        }
        boolean z1 = z;
        int v4 = 0;
        int v5 = v;
        while(v < v2) {
            if((ʻᵢ0.MTH2331(v, v1) ^ z1) == 0) {
                int v6 = arr_v.length - 1;
                if(v4 == v6) {
                    if(CLS47.MTH1000(arr_v1, arr_v, 0.8f) < 0.42f) {
                        return new int[]{v5, v};
                    }
                    v5 += arr_v1[0] + arr_v1[1];
                    System.arraycopy(arr_v1, 2, arr_v1, 0, arr_v.length - 2);
                    arr_v1[arr_v.length - 2] = 0;
                    arr_v1[v6] = 0;
                    --v4;
                }
                else {
                    ++v4;
                }
                arr_v1[v4] = 1;
                z1 = !z1;
            }
            else {
                ++arr_v1[v4];
            }
            ++v;
        }
        return v4 != arr_v.length - 1 || CLS47.MTH1000(arr_v1, arr_v, 0.8f) >= 0.42f ? null : new int[]{v5, v - 1};
    }
}

