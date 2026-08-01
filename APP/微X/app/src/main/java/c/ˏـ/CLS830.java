// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

public final class CLS830 extends CLS439 {
    public static final int[] FLD444;
    public static final int[][] FLD445;
    public static final int[] FLD446;
    public int FLD447;
    public static final int[] FLD448;

    static {
        CLS830.FLD448 = new int[]{6, 8, 10, 12, 14};
        CLS830.FLD444 = new int[]{1, 1, 1, 1};
        CLS830.FLD446 = new int[]{1, 1, 3};
        CLS830.FLD445 = new int[][]{new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    }

    public CLS830() {
        this.FLD447 = -1;
    }

    public static void MTH1707(CLS365 ⁱˋ0, int v, int v1, StringBuilder stringBuilder0) {
        int[] arr_v = new int[10];
        int[] arr_v1 = new int[5];
        int[] arr_v2 = new int[5];
        while(v < v1) {
            CLS439.MTH1678(ⁱˋ0, v, arr_v);
            for(int v3 = 0; v3 < 5; ++v3) {
                arr_v1[v3] = arr_v[v3 * 2];
                arr_v2[v3] = arr_v[v3 * 2 + 1];
            }
            stringBuilder0.append(((char)(CLS830.MTH1713(arr_v1) + 0x30)));
            stringBuilder0.append(((char)(CLS830.MTH1713(arr_v2) + 0x30)));
            for(int v2 = 0; v2 < 10; ++v2) {
                v += arr_v[v2];
            }
        }
    }

    public static int MTH1708(CLS365 ⁱˋ0) {
        int v = ⁱˋ0.MTH5002(0);
        if(v == ⁱˋ0.MTH5007()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v;
    }

    public final void MTH1709(CLS365 ⁱˋ0, int v) {
        int v1 = this.FLD447 * 10 < v ? this.FLD447 * 10 : v;
        for(int v2 = v - 1; v1 > 0 && v2 >= 0 && !ⁱˋ0.MTH5018(v2); --v2) {
            --v1;
        }
        if(v1 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public static int[] MTH1710(CLS365 ⁱˋ0, int v, int[] arr_v) {
        int[] arr_v1 = new int[arr_v.length];
        int v1 = ⁱˋ0.MTH5007();
        int v2 = v;
        boolean z = false;
        int v3 = 0;
        while(v < v1) {
            if((ⁱˋ0.MTH5018(v) ^ z) == 0) {
                int v4 = arr_v.length - 1;
                if(v3 == v4) {
                    if(CLS439.MTH1679(arr_v1, arr_v, 0.78f) < 0.38f) {
                        return new int[]{v2, v};
                    }
                    v2 += arr_v1[0] + arr_v1[1];
                    System.arraycopy(arr_v1, 2, arr_v1, 0, arr_v.length - 2);
                    arr_v1[arr_v.length - 2] = 0;
                    arr_v1[v4] = 0;
                    --v3;
                }
                else {
                    ++v3;
                }
                arr_v1[v3] = 1;
                z = !z;
            }
            else {
                ++arr_v1[v3];
            }
            ++v;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] MTH1711(CLS365 ⁱˋ0) {
        ⁱˋ0.MTH5013();
        try {
            int[] arr_v = CLS830.MTH1710(ⁱˋ0, CLS830.MTH1708(ⁱˋ0), CLS830.FLD446);
            this.MTH1709(ⁱˋ0, arr_v[0]);
            int v1 = arr_v[0];
            arr_v[0] = ⁱˋ0.MTH5007() - arr_v[1];
            arr_v[1] = ⁱˋ0.MTH5007() - v1;
            return arr_v;
        }
        finally {
            ⁱˋ0.MTH5013();
        }
    }

    public final int[] MTH1712(CLS365 ⁱˋ0) {
        int[] arr_v = CLS830.MTH1710(ⁱˋ0, CLS830.MTH1708(ⁱˋ0), CLS830.FLD444);
        this.FLD447 = (arr_v[1] - arr_v[0]) / 4;
        this.MTH1709(ⁱˋ0, arr_v[0]);
        return arr_v;
    }

    public static int MTH1713(int[] arr_v) {
        float f = 0.38f;
        int v = -1;
        for(int v1 = 0; v1 < CLS830.FLD445.length; ++v1) {
            float f1 = CLS439.MTH1679(arr_v, CLS830.FLD445[v1], 0.78f);
            if(f1 < f) {
                v = v1;
                f = f1;
            }
        }
        if(v < 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v;
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        boolean z;
        int[] arr_v = this.MTH1712(ⁱˋ0);
        int[] arr_v1 = this.MTH1711(ⁱˋ0);
        StringBuilder stringBuilder0 = new StringBuilder(20);
        CLS830.MTH1707(ⁱˋ0, arr_v[1], arr_v1[0], stringBuilder0);
        String s = stringBuilder0.toString();
        int[] arr_v2 = map0 == null ? null : ((int[])map0.get(DecodeHintType.ALLOWED_LENGTHS));
        if(arr_v2 == null) {
            arr_v2 = CLS830.FLD448;
        }
        int v1 = s.length();
        int v3 = 0;
        for(int v2 = 0; true; ++v2) {
            z = false;
            if(v2 >= arr_v2.length) {
                break;
            }
            int v4 = arr_v2[v2];
            if(v1 == v4) {
                z = true;
                break;
            }
            if(v4 > v3) {
                v3 = v4;
            }
        }
        if(!z && v1 > v3) {
            z = true;
        }
        if(!z) {
            throw FormatException.getFormatInstance();
        }
        return new CLS271(s, null, new CLS268[]{new CLS268(((float)arr_v[1]), ((float)v)), new CLS268(((float)arr_v1[0]), ((float)v))}, BarcodeFormat.ITF);
    }
}

