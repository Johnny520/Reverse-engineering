// Decompiled by JEB v5.42.0.202606242140

package c.ʿᵢ;

import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS272;
import c.ﾞʾ.CLS366;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class CLS44 {
    public static final int[] FLD132;
    public static final int[] FLD133;
    public static final int[] FLD134;
    public static final int[] FLD135;

    static {
        CLS44.FLD134 = new int[]{0, 4, 1, 5};
        CLS44.FLD135 = new int[]{6, 2, 7, 3};
        CLS44.FLD132 = new int[]{8, 1, 1, 1, 1, 1, 1, 3};
        CLS44.FLD133 = new int[]{7, 1, 1, 3, 1, 1, 1, 2, 1};
    }

    public static List MTH867(boolean z, CLS366 ﾞⁱ0) {
        CLS268 ᵔʼ3;
        int v2;
        List list0 = new ArrayList();
        int v = 0;
        while(true) {
            int v1 = 0;
            boolean z1 = false;
        label_4:
            if(v >= ﾞⁱ0.MTH5046()) {
                break;
            }
            CLS268[] arr_ᵔʼ = CLS44.MTH870(ﾞⁱ0, v, v1);
            if(arr_ᵔʼ[0] != null || arr_ᵔʼ[3] != null) {
                list0.add(arr_ᵔʼ);
                if(z) {
                    CLS268 ᵔʼ2 = arr_ᵔʼ[2];
                    if(ᵔʼ2 == null) {
                        v2 = (int)arr_ᵔʼ[4].MTH3468();
                        ᵔʼ3 = arr_ᵔʼ[4];
                    }
                    else {
                        v2 = (int)ᵔʼ2.MTH3468();
                        ᵔʼ3 = arr_ᵔʼ[2];
                    }
                    v = (int)ᵔʼ3.MTH3470();
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
                CLS268 ᵔʼ0 = ((CLS268[])object0)[1];
                if(ᵔʼ0 != null) {
                    v = (int)Math.max(v, ᵔʼ0.MTH3470());
                }
                CLS268 ᵔʼ1 = ((CLS268[])object0)[3];
                if(ᵔʼ1 != null) {
                    v = Math.max(v, ((int)ᵔʼ1.MTH3470()));
                }
            }
            v += 5;
        }
        return list0;
    }

    public static CLS268[] MTH868(CLS366 ﾞⁱ0, int v, int v1, int v2, int v3, int[] arr_v) {
        int v12;
        int v11;
        int v7;
        CLS268[] arr_ᵔʼ = new CLS268[4];
        int[] arr_v1 = new int[arr_v.length];
        int v4 = v2;
        while(true) {
            boolean z = false;
            if(v4 >= v) {
                break;
            }
            int[] arr_v2 = CLS44.MTH869(ﾞⁱ0, v3, v4, v1, false, arr_v, arr_v1);
            if(arr_v2 != null) {
                int[] arr_v3 = arr_v2;
                int v6 = v4;
                while(v6 > 0) {
                    int[] arr_v4 = CLS44.MTH869(ﾞⁱ0, v3, v6 - 1, v1, false, arr_v, arr_v1);
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
                arr_ᵔʼ[0] = new CLS268(((float)arr_v3[0]), ((float)v7));
                arr_ᵔʼ[1] = new CLS268(((float)arr_v3[1]), ((float)v7));
                v4 = v7;
                z = true;
                break;
            }
            v4 += 5;
        }
        int v8 = v4 + 1;
        if(z) {
            int[] arr_v5 = {((int)arr_ᵔʼ[0].MTH3468()), ((int)arr_ᵔʼ[1].MTH3468())};
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
                int[] arr_v6 = CLS44.MTH869(ﾞⁱ0, arr_v5[0], v9, v1, false, arr_v, arr_v1);
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
            arr_ᵔʼ[2] = new CLS268(((float)arr_v5[0]), ((float)v8));
            arr_ᵔʼ[3] = new CLS268(((float)arr_v5[1]), ((float)v8));
        }
        if(v8 - v4 < 10) {
            for(int v5 = 0; v5 < 4; ++v5) {
                arr_ᵔʼ[v5] = null;
            }
        }
        return arr_ᵔʼ;
    }

    public static int[] MTH869(CLS366 ﾞⁱ0, int v, int v1, int v2, boolean z, int[] arr_v, int[] arr_v1) {
        Arrays.fill(arr_v1, 0, arr_v1.length, 0);
        for(int v3 = 0; ﾞⁱ0.MTH5038(v, v1) && v > 0 && v3 < 3; ++v3) {
            --v;
        }
        boolean z1 = z;
        int v4 = 0;
        int v5 = v;
        while(v < v2) {
            if((ﾞⁱ0.MTH5038(v, v1) ^ z1) == 0) {
                int v6 = arr_v.length - 1;
                if(v4 == v6) {
                    if(CLS44.MTH872(arr_v1, arr_v, 0.8f) < 0.42f) {
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
        return v4 != arr_v.length - 1 || CLS44.MTH872(arr_v1, arr_v, 0.8f) >= 0.42f ? null : new int[]{v5, v - 1};
    }

    public static CLS268[] MTH870(CLS366 ﾞⁱ0, int v, int v1) {
        int v2 = ﾞⁱ0.MTH5046();
        int v3 = ﾞⁱ0.MTH5044();
        CLS268[] arr_ᵔʼ = new CLS268[8];
        CLS44.MTH871(arr_ᵔʼ, CLS44.MTH868(ﾞⁱ0, v2, v3, v, v1, CLS44.FLD132), CLS44.FLD134);
        CLS268 ᵔʼ0 = arr_ᵔʼ[4];
        if(ᵔʼ0 != null) {
            v1 = (int)ᵔʼ0.MTH3468();
            v = (int)arr_ᵔʼ[4].MTH3470();
        }
        CLS44.MTH871(arr_ᵔʼ, CLS44.MTH868(ﾞⁱ0, v2, v3, v, v1, CLS44.FLD133), CLS44.FLD135);
        return arr_ᵔʼ;
    }

    public static void MTH871(CLS268[] arr_ᵔʼ, CLS268[] arr_ᵔʼ1, int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            arr_ᵔʼ[arr_v[v]] = arr_ᵔʼ1[v];
        }
    }

    public static float MTH872(int[] arr_v, int[] arr_v1, float f) {
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

    public static CLS45 MTH873(CLS272 ﾞⁱ0, Map map0, boolean z) {
        CLS366 ﾞⁱ1 = ﾞⁱ0.MTH3499();
        List list0 = CLS44.MTH867(z, ﾞⁱ1);
        if(list0.isEmpty()) {
            ﾞⁱ1 = ﾞⁱ1.MTH5047();
            ﾞⁱ1.MTH5039();
            list0 = CLS44.MTH867(z, ﾞⁱ1);
        }
        return new CLS45(ﾞⁱ1, list0);
    }
}

