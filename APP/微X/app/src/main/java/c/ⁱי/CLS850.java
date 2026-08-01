// Decompiled by JEB v5.42.0.202606242140

package c.ⁱי;

import c.ˏـ.CLS439;
import c.ٴʽ.CLS258;
import c.ᐧᵎ.CLS266;
import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class CLS850 extends CLS840 {
    public static final int[] FLD1561;
    public static final int[] FLD1562;
    public static final int[] FLD1563;
    public static final int[] FLD1564;
    public static final int[] FLD1565;
    public static final int[][] FLD1566;
    public final List FLD1567;
    public static final int[] FLD1568;
    public final List FLD1569;

    static {
        CLS850.FLD1561 = new int[]{1, 10, 34, 70, 0x7E};
        CLS850.FLD1568 = new int[]{4, 20, 0x30, 81};
        CLS850.FLD1564 = new int[]{0, 0xA1, 961, 0x7DF, 0xA9B};
        CLS850.FLD1562 = new int[]{0, 0x150, 0x40C, 0x5EC};
        CLS850.FLD1563 = new int[]{8, 6, 4, 3, 1};
        CLS850.FLD1565 = new int[]{2, 4, 6, 8};
        CLS850.FLD1566 = new int[][]{new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    }

    public CLS850() {
        this.FLD1569 = new ArrayList();
        this.FLD1567 = new ArrayList();
    }

    public final CLS338 MTH4790(CLS365 ⁱˋ0, int v, boolean z, int[] arr_v) {
        boolean z1 = ⁱˋ0.MTH5018(arr_v[0]);
        int v1;
        for(v1 = arr_v[0] - 1; v1 >= 0 && (ⁱˋ0.MTH5018(v1) ^ z1) != 0; --v1) {
        }
        int v2 = arr_v[0] - (v1 + 1);
        int[] arr_v1 = ((CLS840)this).MTH4806();
        System.arraycopy(arr_v1, 0, arr_v1, 1, arr_v1.length - 1);
        arr_v1[0] = v2;
        int v3 = CLS840.MTH4814(arr_v1, CLS850.FLD1566);
        int v4 = arr_v[1];
        return z ? new CLS338(v3, new int[]{v1 + 1, arr_v[1]}, ⁱˋ0.MTH5007() - 1 - (v1 + 1), ⁱˋ0.MTH5007() - 1 - v4, v) : new CLS338(v3, new int[]{v1 + 1, arr_v[1]}, v1 + 1, v4, v);
    }

    public final int[] MTH4791(CLS365 ⁱˋ0, int v, boolean z) {
        int[] arr_v = ((CLS840)this).MTH4806();
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        arr_v[3] = 0;
        int v1 = ⁱˋ0.MTH5007();
        int v2 = 0;
        while(v < v1) {
            v2 = !ⁱˋ0.MTH5018(v);
            if(z == v2) {
                break;
            }
            ++v;
        }
        int v3 = v;
        int v4 = 0;
        while(v < v1) {
            if((ⁱˋ0.MTH5018(v) ^ v2) == 0) {
                if(v4 == 3) {
                    if(CLS840.MTH4811(arr_v)) {
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

    public final CLS340 MTH4792(CLS365 ⁱˋ0, CLS338 ʾʻ0, boolean z) {
        int[] arr_v = ((CLS840)this).MTH4812();
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        arr_v[3] = 0;
        arr_v[4] = 0;
        arr_v[5] = 0;
        arr_v[6] = 0;
        arr_v[7] = 0;
        int[] arr_v1 = ʾʻ0.MTH4787();
        if(z) {
            CLS439.MTH1680(ⁱˋ0, arr_v1[0], arr_v);
        }
        else {
            CLS439.MTH1678(ⁱˋ0, arr_v1[1] + 1, arr_v);
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
        float f = ((float)CLS258.MTH3384(arr_v)) / ((float)(z ? 16 : 15));
        int[] arr_v2 = ((CLS840)this).MTH4807();
        int[] arr_v3 = ((CLS840)this).MTH4813();
        float[] arr_f = ((CLS840)this).MTH4808();
        float[] arr_f1 = ((CLS840)this).MTH4809();
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
        this.MTH4797(z, (z ? 16 : 15));
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
            int v15 = 9 - CLS850.FLD1563[v14];
            int v16 = CLS339.MTH4804(arr_v2, CLS850.FLD1563[v14], false);
            int v17 = CLS339.MTH4804(arr_v3, v15, true);
            return new CLS340(v16 * CLS850.FLD1561[v14] + v17 + CLS850.FLD1564[v14], v13);
        }
        if((v11 & 1) != 0 || v11 > 10 || v11 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v18 = (10 - v11) / 2;
        int v19 = 9 - CLS850.FLD1565[v18];
        int v20 = CLS339.MTH4804(arr_v2, CLS850.FLD1565[v18], true);
        return new CLS340(CLS339.MTH4804(arr_v3, v19, false) * CLS850.FLD1568[v18] + v20 + CLS850.FLD1562[v18], v13);
    }

    public static boolean MTH4793(CLS815 ˉˎ0, CLS815 ˉˎ1) {
        int v = ((CLS340)ˉˎ0).MTH4820();
        int v1 = ((CLS340)ˉˎ1).MTH4820();
        int v2 = ˉˎ0.MTH4802().MTH4785() * 9 + ˉˎ1.MTH4802().MTH4785();
        if(v2 > 72) {
            --v2;
        }
        if(v2 > 8) {
            --v2;
        }
        return (v + v1 * 16) % 0x4F == v2;
    }

    public static CLS271 MTH4794(CLS815 ˉˎ0, CLS815 ˉˎ1) {
        String s = String.valueOf(((long)((CLS340)ˉˎ0).MTH4821()) * 0x453AF5L + ((long)((CLS340)ˉˎ1).MTH4821()));
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
        CLS268[] arr_ᵔʼ = ˉˎ0.MTH4802().MTH4786();
        CLS268[] arr_ᵔʼ1 = ˉˎ1.MTH4802().MTH4786();
        return new CLS271(stringBuilder0.toString(), null, new CLS268[]{arr_ᵔʼ[0], arr_ᵔʼ[1], arr_ᵔʼ1[0], arr_ᵔʼ1[1]}, BarcodeFormat.RSS_14);
    }

    public static void MTH4795(Collection collection0, CLS815 ˉˎ0) {
        if(ˉˎ0 == null) {
            return;
        }
        boolean z = false;
        for(Object object0: collection0) {
            CLS815 ˉˎ1 = (CLS815)object0;
            if(((CLS340)ˉˎ1).MTH4821() == ((CLS340)ˉˎ0).MTH4821()) {
                ˉˎ1.MTH4801();
                z = true;
                break;
            }
        }
        if(!z) {
            collection0.add(ˉˎ0);
        }
    }

    public final CLS815 MTH4796(CLS365 ⁱˋ0, boolean z, int v, Map map0) {
        try {
            int[] arr_v = this.MTH4791(ⁱˋ0, 0, z);
            CLS338 ʾʻ0 = this.MTH4790(ⁱˋ0, v, z, arr_v);
            CLS266 ʾᐧ0 = map0 == null ? null : ((CLS266)map0.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK));
            if(ʾᐧ0 != null) {
                float f = ((float)(arr_v[0] + arr_v[1])) / 2.0f;
                if(z) {
                    f = ((float)(ⁱˋ0.MTH5007() - 1)) - f;
                }
                ʾᐧ0.MTH3454(new CLS268(f, ((float)v)));
            }
            CLS340 ﾞⁱ0 = this.MTH4792(ⁱˋ0, ʾʻ0, true);
            CLS340 ﾞⁱ1 = this.MTH4792(ⁱˋ0, ʾʻ0, false);
            return new CLS815(ﾞⁱ0.MTH4821() * 0x63D + ﾞⁱ1.MTH4821(), ﾞⁱ0.MTH4820() + ﾞⁱ1.MTH4820() * 4, ʾʻ0);
        }
        catch(NotFoundException unused_ex) {
            return null;
        }
    }

    public final void MTH4797(boolean z, int v) {
        boolean z3;
        boolean z4;
        boolean z2;
        int v4;
        int v1 = CLS258.MTH3384(((CLS840)this).MTH4807());
        int v2 = CLS258.MTH3384(((CLS840)this).MTH4813());
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
            CLS840.MTH4810(((CLS840)this).MTH4807(), ((CLS840)this).MTH4808());
        }
        if(z2) {
            CLS840.MTH4815(((CLS840)this).MTH4807(), ((CLS840)this).MTH4808());
        }
        if(z3) {
            if(z4) {
                throw NotFoundException.getNotFoundInstance();
            }
            CLS840.MTH4810(((CLS840)this).MTH4813(), ((CLS840)this).MTH4808());
        }
        if(z4) {
            CLS840.MTH4815(((CLS840)this).MTH4813(), ((CLS840)this).MTH4809());
        }
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        CLS815 ˉˎ0 = this.MTH4796(ⁱˋ0, false, v, map0);
        CLS850.MTH4795(this.FLD1569, ˉˎ0);
        ⁱˋ0.MTH5013();
        CLS815 ˉˎ1 = this.MTH4796(ⁱˋ0, true, v, map0);
        CLS850.MTH4795(this.FLD1567, ˉˎ1);
        ⁱˋ0.MTH5013();
        for(Object object0: this.FLD1569) {
            CLS815 ˉˎ2 = (CLS815)object0;
            if(ˉˎ2.MTH4800() > 1) {
                for(Object object1: this.FLD1567) {
                    CLS815 ˉˎ3 = (CLS815)object1;
                    if(ˉˎ3.MTH4800() > 1 && CLS850.MTH4793(ˉˎ2, ˉˎ3)) {
                        return CLS850.MTH4794(ˉˎ2, ˉˎ3);
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
}

