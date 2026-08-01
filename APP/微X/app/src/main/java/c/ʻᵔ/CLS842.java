// Decompiled by JEB v5.42.0.202606242140

package c.ʻᵔ;

import c.ˎʼ.CLS114;
import c.ˎˊ.CLS118;
import c.ᐧـ.CLS807;
import c.ﾞﹶ.CLS376;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class CLS842 extends CLS826 {
    public static final int[] FLD99;
    public static final int[][] FLD100;
    public static final int[] FLD101;
    public static final int[] FLD102;
    public static final int[] FLD103;
    public static final int[] FLD104;
    public static final int[] FLD105;
    public final List FLD106;
    public final List FLD107;

    static {
        CLS842.FLD103 = new int[]{1, 10, 34, 70, 0x7E};
        CLS842.FLD104 = new int[]{4, 20, 0x30, 81};
        CLS842.FLD101 = new int[]{0, 0xA1, 961, 0x7DF, 0xA9B};
        CLS842.FLD99 = new int[]{0, 0x150, 0x40C, 0x5EC};
        CLS842.FLD105 = new int[]{8, 6, 4, 3, 1};
        CLS842.FLD102 = new int[]{2, 4, 6, 8};
        CLS842.FLD100 = new int[][]{new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    }

    public CLS842() {
        this.FLD106 = new ArrayList();
        this.FLD107 = new ArrayList();
    }

    @Override  // c.ᐧـ.CLS807
    public CLS379 MTH4611(int v, CLS118 ˆٴ0, Map map0) {
        CLS407 ᵔﹶ0 = this.MTH772(ˆٴ0, false, v, map0);
        CLS842.MTH766(this.FLD106, ᵔﹶ0);
        ˆٴ0.MTH2345();
        CLS407 ᵔﹶ1 = this.MTH772(ˆٴ0, true, v, map0);
        CLS842.MTH766(this.FLD107, ᵔﹶ1);
        ˆٴ0.MTH2345();
        for(Object object0: this.FLD106) {
            CLS407 ᵔﹶ2 = (CLS407)object0;
            if(ᵔﹶ2.MTH794() > 1) {
                for(Object object1: this.FLD107) {
                    CLS407 ᵔﹶ3 = (CLS407)object1;
                    if(ᵔﹶ3.MTH794() > 1 && CLS842.MTH767(ᵔﹶ2, ᵔﹶ3)) {
                        return CLS842.MTH768(ᵔﹶ2, ᵔﹶ3);
                    }
                    if(false) {
                        break;
                    }
                }
                if(false) {
                    break;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final CLS21 MTH765(CLS118 ˆٴ0, CLS22 ـᵎ0, boolean z) {
        int[] arr_v = ((CLS826)this).MTH783();
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        arr_v[3] = 0;
        arr_v[4] = 0;
        arr_v[5] = 0;
        arr_v[6] = 0;
        arr_v[7] = 0;
        int[] arr_v1 = ـᵎ0.MTH787();
        if(z) {
            CLS807.MTH4615(ˆٴ0, arr_v1[0], arr_v);
        }
        else {
            CLS807.MTH4612(ˆٴ0, arr_v1[1] + 1, arr_v);
            int v = arr_v.length - 1;
            int v1 = 0;
            while(v1 < v) {
                int v2 = arr_v[v1];
                arr_v[v1] = arr_v[v];
                arr_v[v] = v2;
                ++v1;
                --v;
            }
        }
        float f = ((float)CLS114.MTH2298(arr_v)) / ((float)(z ? 16 : 15));
        int[] arr_v2 = ((CLS826)this).MTH774();
        int[] arr_v3 = ((CLS826)this).MTH780();
        float[] arr_f = ((CLS826)this).MTH781();
        float[] arr_f1 = ((CLS826)this).MTH776();
        for(int v3 = 0; v3 < arr_v.length; ++v3) {
            float f1 = ((float)arr_v[v3]) / f;
            int v4 = (int)(f1 + 0.5f);
            if(v4 <= 0) {
                v4 = 1;
            }
            else if(v4 > 8) {
                v4 = 8;
            }
            if((v3 & 1) == 0) {
                arr_v2[v3 / 2] = v4;
                arr_f[v3 / 2] = f1 - ((float)v4);
            }
            else {
                arr_v3[v3 / 2] = v4;
                arr_f1[v3 / 2] = f1 - ((float)v4);
            }
        }
        this.MTH770(z, (z ? 16 : 15));
        int v5 = arr_v2.length - 1;
        int v6 = 0;
        int v7 = 0;
        while(v5 >= 0) {
            int v8 = arr_v2[v5];
            v6 = v6 * 9 + v8;
            v7 += v8;
            --v5;
        }
        int v9 = arr_v3.length - 1;
        int v10 = 0;
        int v11 = 0;
        while(v9 >= 0) {
            int v12 = arr_v3[v9];
            v10 = v10 * 9 + v12;
            v11 += v12;
            --v9;
        }
        int v13 = v6 + v10 * 3;
        if(z) {
            if((v7 & 1) != 0 || v7 > 12 || v7 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int v14 = (12 - v7) / 2;
            int v15 = 9 - CLS842.FLD105[v14];
            int v16 = CLS23.MTH790(arr_v2, CLS842.FLD105[v14], false);
            int v17 = CLS23.MTH790(arr_v3, v15, true);
            return new CLS21(v16 * CLS842.FLD103[v14] + v17 + CLS842.FLD101[v14], v13);
        }
        if((v11 & 1) != 0 || v11 > 10 || v11 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v18 = (10 - v11) / 2;
        int v19 = 9 - CLS842.FLD102[v18];
        int v20 = CLS23.MTH790(arr_v2, CLS842.FLD102[v18], true);
        return new CLS21(CLS23.MTH790(arr_v3, v19, false) * CLS842.FLD104[v18] + v20 + CLS842.FLD99[v18], v13);
    }

    public static void MTH766(Collection collection0, CLS407 ᵔﹶ0) {
        if(ᵔﹶ0 == null) {
            return;
        }
        boolean z = false;
        for(Object object0: collection0) {
            CLS407 ᵔﹶ1 = (CLS407)object0;
            if(((CLS21)ᵔﹶ1).MTH760() == ((CLS21)ᵔﹶ0).MTH760()) {
                ᵔﹶ1.MTH793();
                z = true;
                break;
            }
        }
        if(!z) {
            collection0.add(ᵔﹶ0);
        }
    }

    public static boolean MTH767(CLS407 ᵔﹶ0, CLS407 ᵔﹶ1) {
        int v = ((CLS21)ᵔﹶ0).MTH761();
        int v1 = ((CLS21)ᵔﹶ1).MTH761();
        int v2 = ᵔﹶ0.MTH795().MTH789() * 9 + ᵔﹶ1.MTH795().MTH789();
        if(v2 > 72) {
            --v2;
        }
        if(v2 > 8) {
            --v2;
        }
        return (v + v1 * 16) % 0x4F == v2;
    }

    public static CLS379 MTH768(CLS407 ᵔﹶ0, CLS407 ᵔﹶ1) {
        String s = String.valueOf(((long)((CLS21)ᵔﹶ0).MTH760()) * 0x453AF5L + ((long)((CLS21)ᵔﹶ1).MTH760()));
        StringBuilder stringBuilder0 = new StringBuilder(14);
        for(int v = 13 - s.length(); v > 0; --v) {
            stringBuilder0.append('0');
        }
        stringBuilder0.append(s);
        int v1 = 0;
        for(int v2 = 0; v2 < 13; ++v2) {
            int v3 = stringBuilder0.charAt(v2) - 0x30;
            if((v2 & 1) == 0) {
                v3 *= 3;
            }
            v1 += v3;
        }
        stringBuilder0.append((10 - v1 % 10 == 10 ? 0 : 10 - v1 % 10));
        CLS380[] arr_ٴⁱ = ᵔﹶ0.MTH795().MTH788();
        CLS380[] arr_ٴⁱ1 = ᵔﹶ1.MTH795().MTH788();
        return new CLS379(stringBuilder0.toString(), null, new CLS380[]{arr_ٴⁱ[0], arr_ٴⁱ[1], arr_ٴⁱ1[0], arr_ٴⁱ1[1]}, BarcodeFormat.RSS_14);
    }

    public final int[] MTH769(CLS118 ˆٴ0, int v, boolean z) {
        int[] arr_v = ((CLS826)this).MTH778();
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        arr_v[3] = 0;
        int v1 = ˆٴ0.MTH2347();
        int v2 = 0;
        while(v < v1) {
            v2 = !ˆٴ0.MTH2357(v);
            if(z == v2) {
                break;
            }
            ++v;
        }
        int v3 = v;
        int v4 = 0;
        while(v < v1) {
            if((ˆٴ0.MTH2357(v) ^ v2) == 0) {
                if(v4 == 3) {
                    if(CLS826.MTH775(arr_v)) {
                        return new int[]{v3, v};
                    }
                    v3 += arr_v[0] + arr_v[1];
                    arr_v[0] = arr_v[2];
                    arr_v[1] = arr_v[3];
                    arr_v[2] = 0;
                    arr_v[3] = 0;
                    v4 = 2;
                }
                else {
                    ++v4;
                }
                arr_v[v4] = 1;
                v2 ^= 1;
            }
            else {
                ++arr_v[v4];
            }
            ++v;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void MTH770(boolean z, int v) {
        boolean z3;
        boolean z4;
        boolean z2;
        int v4;
        int v1 = CLS114.MTH2298(((CLS826)this).MTH774());
        int v2 = CLS114.MTH2298(((CLS826)this).MTH780());
        int v3 = 1;
        boolean z1 = false;
        if(z) {
            if(v1 > 12) {
                v4 = 0;
                z2 = true;
            }
            else {
                v4 = v1 >= 4 ? 0 : 1;
                z2 = false;
            }
            if(v2 > 12) {
                z3 = false;
                z4 = true;
            }
            else if(v2 < 4) {
                z3 = true;
                z4 = false;
            }
            else {
                z3 = false;
                z4 = false;
            }
        }
        else {
            if(v1 > 11) {
                v4 = 0;
                z2 = true;
            }
            else {
                v4 = v1 >= 5 ? 0 : 1;
                z2 = false;
            }
            if(v2 > 10) {
                z3 = false;
                z4 = true;
            }
            else {
                z3 = v2 < 4;
                z4 = false;
            }
        }
        int v5 = v1 + v2 - v;
        boolean z5 = (v1 & 1) == z;
        if((v2 & 1) == 1) {
            z1 = true;
        }
        if(v5 == 1) {
            if(z5) {
                if(z1) {
                    throw NotFoundException.getNotFoundInstance();
                }
                v3 = v4;
                z2 = true;
                goto label_68;
            }
            if(!z1) {
                throw NotFoundException.getNotFoundInstance();
            }
            v3 = v4;
            z4 = true;
        }
        else {
            switch(v5) {
                case -1: {
                    goto label_48;
                }
                case 0: {
                    goto label_56;
                }
            }
            throw NotFoundException.getNotFoundInstance();
        label_48:
            if(!z5) {
                if(!z1) {
                    throw NotFoundException.getNotFoundInstance();
                }
                v3 = v4;
                z3 = true;
                goto label_68;
            label_56:
                if(z5) {
                    if(!z1) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if(v1 >= v2) {
                        v3 = v4;
                        z3 = true;
                        z2 = true;
                        goto label_68;
                    }
                    z4 = true;
                    goto label_68;
                }
                if(z1) {
                    throw NotFoundException.getNotFoundInstance();
                }
                v3 = v4;
            }
            else if(z1) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    label_68:
        if(v3 != 0) {
            if(z2) {
                throw NotFoundException.getNotFoundInstance();
            }
            CLS826.MTH777(((CLS826)this).MTH774(), ((CLS826)this).MTH781());
        }
        if(z2) {
            CLS826.MTH782(((CLS826)this).MTH774(), ((CLS826)this).MTH781());
        }
        if(z3) {
            if(z4) {
                throw NotFoundException.getNotFoundInstance();
            }
            CLS826.MTH777(((CLS826)this).MTH780(), ((CLS826)this).MTH781());
        }
        if(z4) {
            CLS826.MTH782(((CLS826)this).MTH780(), ((CLS826)this).MTH776());
        }
    }

    public final CLS22 MTH771(CLS118 ˆٴ0, int v, boolean z, int[] arr_v) {
        boolean z1 = ˆٴ0.MTH2357(arr_v[0]);
        int v1;
        for(v1 = arr_v[0] - 1; v1 >= 0 && (ˆٴ0.MTH2357(v1) ^ z1) != 0; --v1) {
        }
        int v2 = arr_v[0] - (v1 + 1);
        int[] arr_v1 = ((CLS826)this).MTH778();
        System.arraycopy(arr_v1, 0, arr_v1, 1, arr_v1.length - 1);
        arr_v1[0] = v2;
        int v3 = CLS826.MTH779(arr_v1, CLS842.FLD100);
        int v4 = arr_v[1];
        return z ? new CLS22(v3, new int[]{v1 + 1, arr_v[1]}, ˆٴ0.MTH2347() - 1 - (v1 + 1), ˆٴ0.MTH2347() - 1 - v4, v) : new CLS22(v3, new int[]{v1 + 1, arr_v[1]}, v1 + 1, v4, v);
    }

    public final CLS407 MTH772(CLS118 ˆٴ0, boolean z, int v, Map map0) {
        try {
            int[] arr_v = this.MTH769(ˆٴ0, 0, z);
            CLS22 ـᵎ0 = this.MTH771(ˆٴ0, v, z, arr_v);
            CLS376 ˋᵎ0 = map0 == null ? null : ((CLS376)map0.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK));
            if(ˋᵎ0 != null) {
                float f = ((float)(arr_v[0] + arr_v[1])) / 2.0f;
                if(z) {
                    f = ((float)(ˆٴ0.MTH2347() - 1)) - f;
                }
                ˋᵎ0.MTH5101(new CLS380(f, ((float)v)));
            }
            CLS21 ʻᵢ0 = this.MTH765(ˆٴ0, ـᵎ0, true);
            CLS21 ʻᵢ1 = this.MTH765(ˆٴ0, ـᵎ0, false);
            return new CLS407(ʻᵢ0.MTH760() * 0x63D + ʻᵢ1.MTH760(), ʻᵢ0.MTH761() + ʻᵢ1.MTH761() * 4, ـᵎ0);
        }
        catch(NotFoundException unused_ex) {
            return null;
        }
    }
}

