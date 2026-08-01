// Decompiled by JEB v5.42.0.202606242140

package c.ﹶˋ;

import c.ʻٴ.CLS21;
import c.ٴʽ.CLS258;
import c.ᐧᵎ.CLS268;
import c.ᵎי.CLS306;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS366;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class CLS355 {
    public static final CLS21 FLD1612;

    static {
        CLS355.FLD1612 = new CLS21();
    }

    public static void MTH4906(int[] arr_v, int v) {
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

    public static int MTH4907(CLS366 ﾞⁱ0, int v, int v1, boolean z, int v2, int v3) {
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
                if(z != ﾞⁱ0.MTH5038(v5, v3)) {
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

    public static CLS360 MTH4908(CLS366 ﾞⁱ0, CLS268 ᵔʼ0, CLS268 ᵔʼ1, CLS268 ᵔʼ2, CLS268 ᵔʼ3, int v, int v1) {
        int v10;
        CLS357 ﾞʿ0 = null;
        CLS357 ﾞʿ1 = null;
        CLS348 ʾʻ0 = new CLS348(ﾞⁱ0, ᵔʼ0, ᵔʼ1, ᵔʼ2, ᵔʼ3);
        boolean z = false;
        while(true) {
            if(ᵔʼ0 != null) {
                ﾞʿ0 = CLS355.MTH4917(ﾞⁱ0, ʾʻ0, ᵔʼ0, true, v, v1);
            }
            if(ᵔʼ2 != null) {
                ﾞʿ1 = CLS355.MTH4917(ﾞⁱ0, ʾʻ0, ᵔʼ2, false, v, v1);
            }
            CLS354 ˋʼ0 = CLS355.MTH4920(((CLS817)ﾞʿ0), ((CLS817)ﾞʿ1));
            if(ˋʼ0 == null) {
                break;
            }
            if(!z && ˋʼ0.MTH4883() != null && (ˋʼ0.MTH4883().MTH4841() < ʾʻ0.MTH4841() || ˋʼ0.MTH4883().MTH4840() > ʾʻ0.MTH4840())) {
                ʾʻ0 = ˋʼ0.MTH4883();
                z = true;
                continue;
            }
            ˋʼ0.MTH4893(ʾʻ0);
            int v2 = ˋʼ0.MTH4891();
            ˋʼ0.MTH4888(0, ﾞʿ0);
            ˋʼ0.MTH4888(v2 + 1, ﾞʿ1);
            int v3 = v;
            int v4 = v1;
            int v5 = 1;
            while(v5 <= v2 + 1) {
                int v6 = ﾞʿ0 == null ? v5 : v2 + 1 - v5;
                if(ˋʼ0.MTH4887(v6) == null) {
                    CLS817 ᵔʼ4 = v6 == 0 || v6 == v2 + 1 ? new CLS817(ʾʻ0, v6 == 0) : new CLS357(ʾʻ0);
                    ˋʼ0.MTH4888(v6, ((CLS357)ᵔʼ4));
                    int v7 = ʾʻ0.MTH4841();
                    int v8 = -1;
                    while(v7 <= ʾʻ0.MTH4840()) {
                        int v9 = CLS355.MTH4918(ˋʼ0, v6, v7, ﾞʿ0 != null);
                        if(v9 >= 0 && v9 <= ʾʻ0.MTH4837()) {
                            v10 = v9;
                        }
                        else if(v8 == -1) {
                            goto label_47;
                        }
                        else {
                            v10 = v8;
                        }
                        int v11 = v8;
                        CLS353 ˉˎ0 = CLS355.MTH4913(ﾞⁱ0, ʾʻ0.MTH4844(), ʾʻ0.MTH4837(), ﾞʿ0 != null, v10, v7, v3, v4);
                        int v12 = v7;
                        if(ˉˎ0 != null) {
                            ((CLS357)ᵔʼ4).MTH4940(v12, ˉˎ0);
                            v3 = Math.min(v3, ˉˎ0.MTH4871());
                            v4 = Math.max(v4, ˉˎ0.MTH4871());
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
            return CLS355.MTH4927(ˋʼ0);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static CLS356 MTH4909(CLS817 ᵔʼ0, CLS817 ᵔʼ1) {
        if(ᵔʼ0 != null) {
            CLS356 ⁱˋ0 = ᵔʼ0.MTH4898();
            if(ⁱˋ0 != null) {
                if(ᵔʼ1 != null) {
                    CLS356 ⁱˋ1 = ᵔʼ1.MTH4898();
                    return ⁱˋ1 == null || ⁱˋ0.MTH4933() == ⁱˋ1.MTH4933() || ⁱˋ0.MTH4934() == ⁱˋ1.MTH4934() || ⁱˋ0.MTH4930() == ⁱˋ1.MTH4930() ? ⁱˋ0 : null;
                }
                return ⁱˋ0;
            }
        }
        return ᵔʼ1 == null ? null : ᵔʼ1.MTH4898();
    }

    public static int MTH4910(int[] arr_v, int[] arr_v1, int v) {
        if(arr_v1 != null && arr_v1.length > v / 2 + 3 || v < 0 || v > 0x200) {
            throw ChecksumException.getChecksumInstance();
        }
        return CLS355.FLD1612.MTH769(arr_v, v, arr_v1);
    }

    public static int[] MTH4911(int v) {
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

    public static boolean MTH4912(int v, int v1, int v2) {
        return v1 - 2 <= v && v <= v2 + 2;
    }

    public static CLS353 MTH4913(CLS366 ﾞⁱ0, int v, int v1, boolean z, int v2, int v3, int v4, int v5) {
        int v8;
        int v6 = CLS355.MTH4907(ﾞⁱ0, v, v1, z, v2, v3);
        int[] arr_v = CLS355.MTH4919(ﾞⁱ0, v, v1, z, v6, v3);
        if(arr_v == null) {
            return null;
        }
        int v7 = CLS258.MTH3384(arr_v);
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
        if(!CLS355.MTH4912(v7, v4, v5)) {
            return null;
        }
        int v12 = CLS349.MTH4849(arr_v);
        int v13 = CLS306.MTH4522(v12);
        return v13 == -1 ? null : new CLS353(v6, v8, CLS355.MTH4915(v12), v13);
    }

    public static CLS358[][] MTH4914(CLS354 ˋʼ0) {
        int[] arr_v = {ˋʼ0.MTH4881(), ˋʼ0.MTH4891() + 2};
        CLS358[][] arr2_ﾞⁱ = (CLS358[][])Array.newInstance(CLS358.class, arr_v);
        for(int v = 0; v < arr2_ﾞⁱ.length; ++v) {
            for(int v1 = 0; true; ++v1) {
                c.ﹶˋ.ﾞⁱ[] arr_ﾞⁱ = arr2_ﾞⁱ[v];
                if(v1 >= arr_ﾞⁱ.length) {
                    break;
                }
                arr_ﾞⁱ[v1] = new CLS358();
            }
        }
        CLS357[] arr_ﾞʿ = ˋʼ0.MTH4889();
        int v3 = 0;
        for(int v2 = 0; v2 < arr_ﾞʿ.length; ++v2) {
            CLS357 ﾞʿ0 = arr_ﾞʿ[v2];
            if(ﾞʿ0 != null) {
                CLS353[] arr_ˉˎ = ﾞʿ0.MTH4939();
                for(int v4 = 0; v4 < arr_ˉˎ.length; ++v4) {
                    CLS353 ˉˎ0 = arr_ˉˎ[v4];
                    if(ˉˎ0 != null) {
                        int v5 = ˉˎ0.MTH4867();
                        if(v5 >= 0 && v5 < arr2_ﾞⁱ.length) {
                            arr2_ﾞⁱ[v5][v3].MTH4945(ˉˎ0.MTH4869());
                        }
                    }
                }
            }
            ++v3;
        }
        return arr2_ﾞⁱ;
    }

    public static int MTH4915(int v) {
        return CLS355.MTH4922(CLS355.MTH4911(v));
    }

    public static boolean MTH4916(CLS354 ˋʼ0, int v) {
        return v >= 0 && v <= ˋʼ0.MTH4891() + 1;
    }

    public static CLS817 MTH4917(CLS366 ﾞⁱ0, CLS348 ʾʻ0, CLS268 ᵔʼ0, boolean z, int v, int v1) {
        CLS817 ᵔʼ1 = new CLS817(ʾʻ0, z);
        for(int v2 = 0; v2 < 2; ++v2) {
            int v3 = v2 == 0 ? 1 : -1;
            int v4 = (int)ᵔʼ0.MTH3468();
            for(int v5 = (int)ᵔʼ0.MTH3470(); v5 <= ʾʻ0.MTH4840() && v5 >= ʾʻ0.MTH4841(); v5 += v3) {
                CLS353 ˉˎ0 = CLS355.MTH4913(ﾞⁱ0, 0, ﾞⁱ0.MTH5044(), z, v4, v5, v, v1);
                if(ˉˎ0 != null) {
                    ((CLS357)ᵔʼ1).MTH4940(v5, ˉˎ0);
                    v4 = z ? ˉˎ0.MTH4870() : ˉˎ0.MTH4876();
                }
            }
        }
        return ᵔʼ1;
    }

    public static int MTH4918(CLS354 ˋʼ0, int v, int v1, boolean z) {
        int v2 = z ? 1 : -1;
        int v3 = v - v2;
        CLS353 ˉˎ0 = CLS355.MTH4916(ˋʼ0, v3) ? ˋʼ0.MTH4887(v3).MTH4942(v1) : null;
        if(ˉˎ0 != null) {
            return z ? ˉˎ0.MTH4876() : ˉˎ0.MTH4870();
        }
        CLS353 ˉˎ1 = ˋʼ0.MTH4887(v).MTH4937(v1);
        if(ˉˎ1 != null) {
            return z ? ˉˎ1.MTH4870() : ˉˎ1.MTH4876();
        }
        if(CLS355.MTH4916(ˋʼ0, v3)) {
            ˉˎ1 = ˋʼ0.MTH4887(v3).MTH4937(v1);
        }
        if(ˉˎ1 != null) {
            return z ? ˉˎ1.MTH4876() : ˉˎ1.MTH4870();
        }
        for(int v4 = 0; true; ++v4) {
            v -= v2;
            if(!CLS355.MTH4916(ˋʼ0, v)) {
                break;
            }
            CLS353[] arr_ˉˎ = ˋʼ0.MTH4887(v).MTH4939();
            for(int v5 = 0; v5 < arr_ˉˎ.length; ++v5) {
                CLS353 ˉˎ2 = arr_ˉˎ[v5];
                if(ˉˎ2 != null) {
                    return z ? ˉˎ2.MTH4876() + v2 * v4 * (ˉˎ2.MTH4876() - ˉˎ2.MTH4870()) : ˉˎ2.MTH4870() + v2 * v4 * (ˉˎ2.MTH4876() - ˉˎ2.MTH4870());
                }
            }
        }
        CLS348 ʾʻ0 = ˋʼ0.MTH4883();
        return z ? ʾʻ0.MTH4844() : ʾʻ0.MTH4837();
    }

    public static int[] MTH4919(CLS366 ﾞⁱ0, int v, int v1, boolean z, int v2, int v3) {
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
            if(ﾞⁱ0.MTH5038(v2, v3) == z1) {
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

    public static CLS354 MTH4920(CLS817 ᵔʼ0, CLS817 ᵔʼ1) {
        if(ᵔʼ0 == null && ᵔʼ1 == null) {
            return null;
        }
        CLS356 ⁱˋ0 = CLS355.MTH4909(ᵔʼ0, ᵔʼ1);
        return ⁱˋ0 == null ? null : new CLS354(ⁱˋ0, CLS348.MTH4836(CLS355.MTH4925(ᵔʼ0), CLS355.MTH4925(ᵔʼ1)));
    }

    public static int MTH4921(int v) {
        return 2 << v;
    }

    public static int MTH4922(int[] arr_v) {
        return (arr_v[0] - arr_v[2] + arr_v[4] - arr_v[6] + 9) % 9;
    }

    public static CLS360 MTH4923(int v, int[] arr_v, int[] arr_v1, int[] arr_v2, int[][] arr2_v) {
        int[] arr_v3 = new int[arr_v2.length];
        int v1 = 100;
        while(true) {
            for(int v2 = 0; v2 < arr_v2.length; ++v2) {
                arr_v[arr_v2[v2]] = arr2_v[v2][arr_v3[v2]];
            }
            try {
                return CLS355.MTH4924(arr_v, v, arr_v1);
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

    public static CLS360 MTH4924(int[] arr_v, int v, int[] arr_v1) {
        if(arr_v.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int v1 = 1 << v + 1;
        int v2 = CLS355.MTH4910(arr_v, arr_v1, v1);
        CLS355.MTH4906(arr_v, v1);
        CLS360 ˉˎ0 = CLS352.MTH4864(arr_v, String.valueOf(v));
        ˉˎ0.MTH4969(v2);
        ˉˎ0.MTH4972(((int)arr_v1.length));
        return ˉˎ0;
    }

    public static CLS348 MTH4925(CLS817 ᵔʼ0) {
        if(ᵔʼ0 == null) {
            return null;
        }
        int[] arr_v = ᵔʼ0.MTH4903();
        if(arr_v == null) {
            return null;
        }
        int v = CLS355.MTH4926(arr_v);
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v4 = arr_v[v2];
            v3 += v - v4;
            if(v4 > 0) {
                break;
            }
        }
        CLS353[] arr_ˉˎ = ((CLS357)ᵔʼ0).MTH4939();
        for(int v5 = 0; v3 > 0 && arr_ˉˎ[v5] == null; ++v5) {
            --v3;
        }
        for(int v6 = arr_v.length - 1; v6 >= 0; --v6) {
            int v7 = arr_v[v6];
            v1 += v - v7;
            if(v7 > 0) {
                break;
            }
        }
        for(int v8 = arr_ˉˎ.length - 1; v1 > 0 && arr_ˉˎ[v8] == null; --v8) {
            --v1;
        }
        return ((CLS357)ᵔʼ0).MTH4941().MTH4843(v3, v1, ᵔʼ0.MTH4901());
    }

    public static int MTH4926(int[] arr_v) {
        int v = -1;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v = Math.max(v, arr_v[v1]);
        }
        return v;
    }

    public static CLS360 MTH4927(CLS354 ˋʼ0) {
        CLS358[][] arr2_ﾞⁱ = CLS355.MTH4914(ˋʼ0);
        CLS355.MTH4928(ˋʼ0, arr2_ﾞⁱ);
        ArrayList arrayList0 = new ArrayList();
        int[] arr_v = new int[ˋʼ0.MTH4881() * ˋʼ0.MTH4891()];
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for(int v1 = 0; v1 < ˋʼ0.MTH4881(); ++v1) {
            for(int v2 = 0; v2 < ˋʼ0.MTH4891(); ++v2) {
                int[] arr_v1 = arr2_ﾞⁱ[v1][v2 + 1].MTH4944();
                int v3 = ˋʼ0.MTH4891() * v1 + v2;
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
        return CLS355.MTH4923(ˋʼ0.MTH4885(), arr_v, CLS306.MTH4523(arrayList0), CLS306.MTH4523(arrayList2), arr2_v);
    }

    public static void MTH4928(CLS354 ˋʼ0, CLS358[][] arr2_ﾞⁱ) {
        int[] arr_v = arr2_ﾞⁱ[0][1].MTH4944();
        int v = ˋʼ0.MTH4891() * ˋʼ0.MTH4881() - CLS355.MTH4921(ˋʼ0.MTH4885());
        if(arr_v.length == 0) {
            if(v <= 0 || v > 0x3A0) {
                throw NotFoundException.getNotFoundInstance();
            }
            arr2_ﾞⁱ[0][1].MTH4945(v);
            return;
        }
        if(arr_v[0] != v) {
            arr2_ﾞⁱ[0][1].MTH4945(v);
        }
    }
}

