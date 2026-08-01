// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import c.ʻﹶ.CLS30;
import c.ˎʼ.CLS114;
import c.ˎˊ.CLS117;
import c.ˎˊ.CLS124;
import c.ˑـ.CLS130;
import c.ﾞﹶ.CLS380;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class CLS369 {
    public static final CLS30 FLD1621;

    static {
        CLS369.FLD1621 = new CLS30();
    }

    public static void MTH4990(CLS372 ᴵⁱ0, CLS363[][] arr2_ʻᵢ) {
        int[] arr_v = arr2_ʻᵢ[0][1].MTH4963();
        int v = ᴵⁱ0.MTH5056() * ᴵⁱ0.MTH5047() - CLS369.MTH5007(ᴵⁱ0.MTH5051());
        if(arr_v.length == 0) {
            if(v <= 0 || v > 0x3A0) {
                throw NotFoundException.getNotFoundInstance();
            }
            arr2_ʻᵢ[0][1].MTH4962(v);
            return;
        }
        if(arr_v[0] != v) {
            arr2_ʻᵢ[0][1].MTH4962(v);
        }
    }

    public static CLS367 MTH4991(CLS817 ٴⁱ0, CLS817 ٴⁱ1) {
        if(ٴⁱ0 != null) {
            CLS367 ˆٴ0 = ٴⁱ0.MTH5039();
            if(ˆٴ0 != null) {
                if(ٴⁱ1 != null) {
                    CLS367 ˆٴ1 = ٴⁱ1.MTH5039();
                    return ˆٴ1 == null || ˆٴ0.MTH4980() == ˆٴ1.MTH4980() || ˆٴ0.MTH4978() == ˆٴ1.MTH4978() || ˆٴ0.MTH4981() == ˆٴ1.MTH4981() ? ˆٴ0 : null;
                }
                return ˆٴ0;
            }
        }
        return ٴⁱ1 == null ? null : ٴⁱ1.MTH5039();
    }

    public static int MTH4992(int[] arr_v, int[] arr_v1, int v) {
        if(arr_v1 != null && arr_v1.length > v / 2 + 3 || v < 0 || v > 0x200) {
            throw ChecksumException.getChecksumInstance();
        }
        return CLS369.FLD1621.MTH816(arr_v, v, arr_v1);
    }

    public static int MTH4993(int[] arr_v) {
        return (arr_v[0] - arr_v[2] + arr_v[4] - arr_v[6] + 9) % 9;
    }

    public static CLS370 MTH4994(CLS817 ٴⁱ0) {
        if(ٴⁱ0 == null) {
            return null;
        }
        int[] arr_v = ٴⁱ0.MTH5040();
        if(arr_v == null) {
            return null;
        }
        int v = CLS369.MTH4999(arr_v);
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v4 = arr_v[v2];
            v3 += v - v4;
            if(v4 > 0) {
                break;
            }
        }
        CLS373[] arr_ᵔﹶ = ((CLS371)ٴⁱ0).MTH5034();
        for(int v5 = 0; v3 > 0 && arr_ᵔﹶ[v5] == null; ++v5) {
            --v3;
        }
        for(int v6 = arr_v.length - 1; v6 >= 0; --v6) {
            int v7 = arr_v[v6];
            v1 += v - v7;
            if(v7 > 0) {
                break;
            }
        }
        for(int v8 = arr_ᵔﹶ.length - 1; v1 > 0 && arr_ᵔﹶ[v8] == null; --v8) {
            --v1;
        }
        return ((CLS371)ٴⁱ0).MTH5031().MTH5018(v3, v1, ٴⁱ0.MTH5038());
    }

    public static CLS373 MTH4995(CLS117 ʻᵢ0, int v, int v1, boolean z, int v2, int v3, int v4, int v5) {
        int v8;
        int v6 = CLS369.MTH5005(ʻᵢ0, v, v1, z, v2, v3);
        int[] arr_v = CLS369.MTH5000(ʻᵢ0, v, v1, z, v6, v3);
        if(arr_v == null) {
            return null;
        }
        int v7 = CLS114.MTH2298(arr_v);
        if(z) {
            v8 = v6 + v7;
        }
        else {
            for(int v9 = 0; v9 < arr_v.length / 2; ++v9) {
                int v10 = arr_v[v9];
                arr_v[v9] = arr_v[arr_v.length - 1 - v9];
                arr_v[arr_v.length - 1 - v9] = v10;
            }
            int v11 = v6;
            v6 -= v7;
            v8 = v11;
        }
        if(!CLS369.MTH5011(v7, v4, v5)) {
            return null;
        }
        int v12 = CLS368.MTH4988(arr_v);
        int v13 = CLS130.MTH2499(v12);
        return v13 == -1 ? null : new CLS373(v6, v8, CLS369.MTH4997(v12), v13);
    }

    public static boolean MTH4996(CLS372 ᴵⁱ0, int v) {
        return v >= 0 && v <= ᴵⁱ0.MTH5056() + 1;
    }

    public static int MTH4997(int v) {
        return CLS369.MTH4993(CLS369.MTH5002(v));
    }

    public static CLS124 MTH4998(CLS117 ʻᵢ0, CLS380 ٴⁱ0, CLS380 ٴⁱ1, CLS380 ٴⁱ2, CLS380 ٴⁱ3, int v, int v1) {
        int v10;
        CLS371 ٴˑ0 = null;
        CLS371 ٴˑ1 = null;
        CLS370 ـᵎ0 = new CLS370(ʻᵢ0, ٴⁱ0, ٴⁱ1, ٴⁱ2, ٴⁱ3);
        boolean z = false;
        while(true) {
            if(ٴⁱ0 != null) {
                ٴˑ0 = CLS369.MTH5003(ʻᵢ0, ـᵎ0, ٴⁱ0, true, v, v1);
            }
            if(ٴⁱ2 != null) {
                ٴˑ1 = CLS369.MTH5003(ʻᵢ0, ـᵎ0, ٴⁱ2, false, v, v1);
            }
            CLS372 ᴵⁱ0 = CLS369.MTH5012(((CLS817)ٴˑ0), ((CLS817)ٴˑ1));
            if(ᴵⁱ0 == null) {
                break;
            }
            if(!z && ᴵⁱ0.MTH5057() != null && (ᴵⁱ0.MTH5057().MTH5024() < ـᵎ0.MTH5024() || ᴵⁱ0.MTH5057().MTH5025() > ـᵎ0.MTH5025())) {
                ـᵎ0 = ᴵⁱ0.MTH5057();
                z = true;
                continue;
            }
            ᴵⁱ0.MTH5054(ـᵎ0);
            int v2 = ᴵⁱ0.MTH5056();
            ᴵⁱ0.MTH5055(0, ٴˑ0);
            ᴵⁱ0.MTH5055(v2 + 1, ٴˑ1);
            int v3 = v;
            int v4 = v1;
            int v5 = 1;
            while(v5 <= v2 + 1) {
                int v6 = ٴˑ0 == null ? v5 : v2 + 1 - v5;
                if(ᴵⁱ0.MTH5052(v6) == null) {
                    CLS817 ٴⁱ4 = v6 == 0 || v6 == v2 + 1 ? new CLS817(ـᵎ0, v6 == 0) : new CLS371(ـᵎ0);
                    ᴵⁱ0.MTH5055(v6, ((CLS371)ٴⁱ4));
                    int v7 = ـᵎ0.MTH5024();
                    int v8 = -1;
                    while(v7 <= ـᵎ0.MTH5025()) {
                        int v9 = CLS369.MTH5004(ᴵⁱ0, v6, v7, ٴˑ0 != null);
                        if(v9 >= 0 && v9 <= ـᵎ0.MTH5017()) {
                            v10 = v9;
                        }
                        else if(v8 == -1) {
                            goto label_47;
                        }
                        else {
                            v10 = v8;
                        }
                        int v11 = v8;
                        CLS373 ᵔﹶ0 = CLS369.MTH4995(ʻᵢ0, ـᵎ0.MTH5023(), ـᵎ0.MTH5017(), ٴˑ0 != null, v10, v7, v3, v4);
                        int v12 = v7;
                        if(ᵔﹶ0 != null) {
                            ((CLS371)ٴⁱ4).MTH5033(v12, ᵔﹶ0);
                            v3 = Math.min(v3, ᵔﹶ0.MTH5073());
                            v4 = Math.max(v4, ᵔﹶ0.MTH5073());
                            v8 = v10;
                            goto label_50;
                        label_47:
                            v11 = -1;
                            v12 = v7;
                        }
                        v8 = v11;
                    label_50:
                        v7 = v12 + 1;
                    }
                }
                ++v5;
            }
            return CLS369.MTH5008(ᴵⁱ0);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int MTH4999(int[] arr_v) {
        int v = -1;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.max(v, arr_v[v1]);
        }
        return v;
    }

    public static int[] MTH5000(CLS117 ʻᵢ0, int v, int v1, boolean z, int v2, int v3) {
        int[] arr_v = new int[8];
        int v4 = 0;
        boolean z1 = z;
        while(true) {
            if(!z) {
                if(v2 >= v) {
                    goto label_7;
                }
                break;
            }
            else if(v2 >= v1) {
                break;
            }
        label_7:
            if(v4 >= 8) {
                break;
            }
            if(ʻᵢ0.MTH2331(v2, v3) == z1) {
                ++arr_v[v4];
                v2 += (z ? 1 : -1);
            }
            else {
                ++v4;
                z1 = !z1;
            }
        }
        if(v4 != 8) {
            if(z) {
                v = v1;
            }
            return v2 == v && v4 == 7 ? arr_v : null;
        }
        return arr_v;
    }

    public static CLS124 MTH5001(int[] arr_v, int v, int[] arr_v1) {
        if(arr_v.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int v1 = 1 << v + 1;
        int v2 = CLS369.MTH4992(arr_v, arr_v1, v1);
        CLS369.MTH5006(arr_v, v1);
        CLS124 ᵔﹶ0 = CLS366.MTH4970(arr_v, String.valueOf(v));
        ᵔﹶ0.MTH2403(v2);
        ᵔﹶ0.MTH2405(((int)arr_v1.length));
        return ᵔﹶ0;
    }

    public static int[] MTH5002(int v) {
        int[] arr_v = new int[8];
        int v1 = 0;
        int v2 = 7;
        while(true) {
            if((v & 1) != v1) {
                --v2;
                if(v2 < 0) {
                    break;
                }
                v1 = v & 1;
            }
            ++arr_v[v2];
            v >>= 1;
        }
        return arr_v;
    }

    public static CLS817 MTH5003(CLS117 ʻᵢ0, CLS370 ـᵎ0, CLS380 ٴⁱ0, boolean z, int v, int v1) {
        CLS817 ٴⁱ1 = new CLS817(ـᵎ0, z);
        for(int v2 = 0; v2 < 2; ++v2) {
            int v3 = v2 == 0 ? 1 : -1;
            int v4 = (int)ٴⁱ0.MTH5130();
            for(int v5 = (int)ٴⁱ0.MTH5131(); v5 <= ـᵎ0.MTH5025() && v5 >= ـᵎ0.MTH5024(); v5 += v3) {
                CLS373 ᵔﹶ0 = CLS369.MTH4995(ʻᵢ0, 0, ʻᵢ0.MTH2325(), z, v4, v5, v, v1);
                if(ᵔﹶ0 != null) {
                    ((CLS371)ٴⁱ1).MTH5033(v5, ᵔﹶ0);
                    v4 = z ? ᵔﹶ0.MTH5074() : ᵔﹶ0.MTH5065();
                }
            }
        }
        return ٴⁱ1;
    }

    public static int MTH5004(CLS372 ᴵⁱ0, int v, int v1, boolean z) {
        int v2 = z ? 1 : -1;
        int v3 = v - v2;
        CLS373 ᵔﹶ0 = CLS369.MTH4996(ᴵⁱ0, v3) ? ᴵⁱ0.MTH5052(v3).MTH5029(v1) : null;
        if(ᵔﹶ0 != null) {
            return z ? ᵔﹶ0.MTH5065() : ᵔﹶ0.MTH5074();
        }
        CLS373 ᵔﹶ1 = ᴵⁱ0.MTH5052(v).MTH5032(v1);
        if(ᵔﹶ1 != null) {
            return z ? ᵔﹶ1.MTH5074() : ᵔﹶ1.MTH5065();
        }
        if(CLS369.MTH4996(ᴵⁱ0, v3)) {
            ᵔﹶ1 = ᴵⁱ0.MTH5052(v3).MTH5032(v1);
        }
        if(ᵔﹶ1 != null) {
            return z ? ᵔﹶ1.MTH5065() : ᵔﹶ1.MTH5074();
        }
        for(int v4 = 0; true; ++v4) {
            v -= v2;
            if(!CLS369.MTH4996(ᴵⁱ0, v)) {
                break;
            }
            CLS373[] arr_ᵔﹶ = ᴵⁱ0.MTH5052(v).MTH5034();
            for(int v5 = 0; v5 < arr_ᵔﹶ.length; ++v5) {
                CLS373 ᵔﹶ2 = arr_ᵔﹶ[v5];
                if(ᵔﹶ2 != null) {
                    return z ? ᵔﹶ2.MTH5065() + v2 * v4 * (ᵔﹶ2.MTH5065() - ᵔﹶ2.MTH5074()) : ᵔﹶ2.MTH5074() + v2 * v4 * (ᵔﹶ2.MTH5065() - ᵔﹶ2.MTH5074());
                }
            }
        }
        CLS370 ـᵎ0 = ᴵⁱ0.MTH5057();
        return z ? ـᵎ0.MTH5023() : ـᵎ0.MTH5017();
    }

    public static int MTH5005(CLS117 ʻᵢ0, int v, int v1, boolean z, int v2, int v3) {
        int v4 = z ? -1 : 1;
        int v5 = v2;
        int v6 = 0;
        while(v6 < 2) {
            while(true) {
                if(z) {
                    if(v5 >= v) {
                        goto label_8;
                    }
                    else {
                        break;
                    }
                    goto label_7;
                }
                else {
                label_7:
                    if(v5 < v1) {
                        goto label_8;
                    }
                    break;
                }
            label_8:
                if(z != ʻᵢ0.MTH2331(v5, v3)) {
                    break;
                }
                if(Math.abs(v2 - v5) > 2) {
                    return v2;
                }
                v5 += v4;
            }
            v4 = -v4;
            z = !z;
            ++v6;
        }
        return v5;
    }

    public static void MTH5006(int[] arr_v, int v) {
        if(arr_v.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int v1 = arr_v[0];
        if(v1 > arr_v.length) {
            throw FormatException.getFormatInstance();
        }
        if(v1 == 0) {
            if(v >= arr_v.length) {
                throw FormatException.getFormatInstance();
            }
            arr_v[0] = arr_v.length - v;
        }
    }

    public static int MTH5007(int v) {
        return 2 << v;
    }

    public static CLS124 MTH5008(CLS372 ᴵⁱ0) {
        CLS363[][] arr2_ʻᵢ = CLS369.MTH5010(ᴵⁱ0);
        CLS369.MTH4990(ᴵⁱ0, arr2_ʻᵢ);
        ArrayList arrayList0 = new ArrayList();
        int[] arr_v = new int[ᴵⁱ0.MTH5047() * ᴵⁱ0.MTH5056()];
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for(int v1 = 0; v1 < ᴵⁱ0.MTH5047(); ++v1) {
            for(int v2 = 0; v2 < ᴵⁱ0.MTH5056(); ++v2) {
                int[] arr_v1 = arr2_ʻᵢ[v1][v2 + 1].MTH4963();
                int v3 = ᴵⁱ0.MTH5056() * v1 + v2;
                if(arr_v1.length == 0) {
                    arrayList0.add(v3);
                }
                else if(arr_v1.length == 1) {
                    arr_v[v3] = arr_v1[0];
                }
                else {
                    arrayList2.add(v3);
                    arrayList1.add(arr_v1);
                }
            }
        }
        int v4 = arrayList1.size();
        int[][] arr2_v = new int[v4][];
        for(int v = 0; v < v4; ++v) {
            arr2_v[v] = (int[])arrayList1.get(v);
        }
        return CLS369.MTH5009(ᴵⁱ0.MTH5051(), arr_v, CLS130.MTH2498(arrayList0), CLS130.MTH2498(arrayList2), arr2_v);
    }

    public static CLS124 MTH5009(int v, int[] arr_v, int[] arr_v1, int[] arr_v2, int[][] arr2_v) {
        int[] arr_v3 = new int[arr_v2.length];
        int v1 = 100;
        while(true) {
            for(int v2 = 0; v2 < arr_v2.length; ++v2) {
                arr_v[arr_v2[v2]] = arr2_v[v2][arr_v3[v2]];
            }
            try {
                return CLS369.MTH5001(arr_v, v, arr_v1);
            }
            catch(ChecksumException unused_ex) {
            }
            if(arr_v2.length != 0) {
                int v3 = 0;
            label_10:
                if(v3 < arr_v2.length) {
                    int v4 = arr_v3[v3];
                    if(v4 < arr2_v[v3].length - 1) {
                        arr_v3[v3] = v4 + 1;
                    }
                    else {
                        goto label_16;
                    }
                }
                --v1;
                continue;
            label_16:
                arr_v3[v3] = 0;
                if(v3 == arr_v2.length - 1) {
                    throw ChecksumException.getChecksumInstance();
                }
                ++v3;
                goto label_10;
            }
            break;
        }
        throw ChecksumException.getChecksumInstance();
    }

    public static CLS363[][] MTH5010(CLS372 ᴵⁱ0) {
        int[] arr_v = {ᴵⁱ0.MTH5047(), ᴵⁱ0.MTH5056() + 2};
        CLS363[][] arr2_ʻᵢ = (CLS363[][])Array.newInstance(CLS363.class, arr_v);
        for(int v = 0; v < arr2_ʻᵢ.length; ++v) {
            for(int v1 = 0; true; ++v1) {
                c.ﾞʾ.ʻᵢ[] arr_ʻᵢ = arr2_ʻᵢ[v];
                if(v1 >= arr_ʻᵢ.length) {
                    break;
                }
                arr_ʻᵢ[v1] = new CLS363();
            }
        }
        CLS371[] arr_ٴˑ = ᴵⁱ0.MTH5049();
        int v3 = 0;
        for(int v2 = 0; v2 < arr_ٴˑ.length; ++v2) {
            CLS371 ٴˑ0 = arr_ٴˑ[v2];
            if(ٴˑ0 != null) {
                CLS373[] arr_ᵔﹶ = ٴˑ0.MTH5034();
                for(int v4 = 0; v4 < arr_ᵔﹶ.length; ++v4) {
                    CLS373 ᵔﹶ0 = arr_ᵔﹶ[v4];
                    if(ᵔﹶ0 != null) {
                        int v5 = ᵔﹶ0.MTH5070();
                        if(v5 >= 0 && v5 < arr2_ʻᵢ.length) {
                            arr2_ʻᵢ[v5][v3].MTH4962(ᵔﹶ0.MTH5066());
                        }
                    }
                }
            }
            ++v3;
        }
        return arr2_ʻᵢ;
    }

    public static boolean MTH5011(int v, int v1, int v2) {
        return v1 - 2 <= v && v <= v2 + 2;
    }

    public static CLS372 MTH5012(CLS817 ٴⁱ0, CLS817 ٴⁱ1) {
        if(ٴⁱ0 == null && ٴⁱ1 == null) {
            return null;
        }
        CLS367 ˆٴ0 = CLS369.MTH4991(ٴⁱ0, ٴⁱ1);
        return ˆٴ0 == null ? null : new CLS372(ˆٴ0, CLS370.MTH5016(CLS369.MTH4994(ٴⁱ0), CLS369.MTH4994(ٴⁱ1)));
    }
}

