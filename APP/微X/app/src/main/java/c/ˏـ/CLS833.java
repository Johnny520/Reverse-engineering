// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS266;
import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

public abstract class CLS833 extends CLS439 {
    public final CLS117 FLD456;
    public static final int[] FLD457;
    public static final int[] FLD458;
    public static final int[] FLD459;
    public static final int[][] FLD460;
    public final StringBuilder FLD461;
    public static final int[][] FLD462;
    public final CLS116 FLD463;

    static {
        CLS833.FLD458 = new int[]{1, 1, 1};
        CLS833.FLD457 = new int[]{1, 1, 1, 1, 1};
        CLS833.FLD459 = new int[]{1, 1, 1, 1, 1, 1};
        int[][] arr2_v = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        CLS833.FLD462 = arr2_v;
        int[][] arr2_v1 = new int[20][];
        CLS833.FLD460 = arr2_v1;
        System.arraycopy(arr2_v, 0, arr2_v1, 0, 10);
        for(int v = 10; v < 20; ++v) {
            int[] arr_v = CLS833.FLD462[v - 10];
            int[] arr_v1 = new int[arr_v.length];
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                arr_v1[v1] = arr_v[arr_v.length - v1 - 1];
            }
            CLS833.FLD460[v] = arr_v1;
        }
    }

    public CLS833() {
        this.FLD461 = new StringBuilder(20);
        this.FLD463 = new CLS116();
        this.FLD456 = new CLS117();
    }

    public static int MTH1728(CLS365 ⁱˋ0, int[] arr_v, int v, int[][] arr2_v) {
        CLS439.MTH1678(ⁱˋ0, v, arr_v);
        float f = 0.48f;
        int v1 = -1;
        for(int v2 = 0; v2 < arr2_v.length; ++v2) {
            float f1 = CLS439.MTH1679(arr_v, arr2_v[v2], 0.7f);
            if(f1 < f) {
                v1 = v2;
                f = f1;
            }
        }
        if(v1 < 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v1;
    }

    public CLS271 MTH1729(int v, CLS365 ⁱˋ0, int[] arr_v, Map map0) {
        int[] arr_v1 = null;
        CLS266 ʾᐧ0 = map0 == null ? null : ((CLS266)map0.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK));
        boolean z = true;
        if(ʾᐧ0 != null) {
            ʾᐧ0.MTH3454(new CLS268(((float)(arr_v[0] + arr_v[1])) / 2.0f, ((float)v)));
        }
        StringBuilder stringBuilder0 = this.FLD461;
        stringBuilder0.setLength(0);
        int v1 = this.MTH1731(ⁱˋ0, arr_v, stringBuilder0);
        if(ʾᐧ0 != null) {
            ʾᐧ0.MTH3454(new CLS268(((float)v1), ((float)v)));
        }
        int[] arr_v2 = this.MTH1735(ⁱˋ0, v1);
        if(ʾᐧ0 != null) {
            ʾᐧ0.MTH3454(new CLS268(((float)(arr_v2[0] + arr_v2[1])) / 2.0f, ((float)v)));
        }
        int v2 = arr_v2[1];
        int v3 = v2 - arr_v2[0] + v2;
        if(v3 >= ⁱˋ0.MTH5007() || !ⁱˋ0.MTH5005(v2, v3, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String s = stringBuilder0.toString();
        if(s.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if(!this.MTH1737(s)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f = ((float)(arr_v[1] + arr_v[0])) / 2.0f;
        float f1 = ((float)(arr_v2[1] + arr_v2[0])) / 2.0f;
        BarcodeFormat barcodeFormat0 = this.MTH1736();
        CLS271 ﾞʿ0 = new CLS271(s, null, new CLS268[]{new CLS268(f, ((float)v)), new CLS268(f1, ((float)v))}, barcodeFormat0);
        try {
            CLS271 ﾞʿ1 = this.FLD463.MTH1704(v, ⁱˋ0, arr_v2[1]);
            ﾞʿ0.MTH3489(ResultMetadataType.UPC_EAN_EXTENSION, ﾞʿ1.MTH3488());
            ﾞʿ0.MTH3491(ﾞʿ1.MTH3487());
            ﾞʿ0.MTH3490(ﾞʿ1.MTH3486());
            int v4 = 0;
            v4 = ﾞʿ1.MTH3488().length();
        }
        catch(ReaderException unused_ex) {
        }
        if(map0 != null) {
            arr_v1 = (int[])map0.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS);
        }
        if(arr_v1 != null) {
            for(int v5 = 0; true; ++v5) {
                if(v5 >= arr_v1.length) {
                    z = false;
                    break;
                }
                if(v4 == arr_v1[v5]) {
                    break;
                }
            }
            if(!z) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if(barcodeFormat0 == BarcodeFormat.EAN_13 || barcodeFormat0 == BarcodeFormat.UPC_A) {
            String s1 = this.FLD456.MTH1740(s);
            if(s1 != null) {
                ﾞʿ0.MTH3489(ResultMetadataType.POSSIBLE_COUNTRY, s1);
            }
        }
        return ﾞʿ0;
    }

    public static int[] MTH1730(CLS365 ⁱˋ0, int v, boolean z, int[] arr_v) {
        return CLS833.MTH1732(ⁱˋ0, v, z, arr_v, new int[arr_v.length]);
    }

    public abstract int MTH1731(CLS365 arg1, int[] arg2, StringBuilder arg3);

    public static int[] MTH1732(CLS365 ⁱˋ0, int v, boolean z, int[] arr_v, int[] arr_v1) {
        int v1 = ⁱˋ0.MTH5007();
        int v2 = z ? ⁱˋ0.MTH5015(v) : ⁱˋ0.MTH5002(v);
        boolean z1 = z;
        int v3 = 0;
        int v4 = v2;
        while(v2 < v1) {
            if((ⁱˋ0.MTH5018(v2) ^ z1) == 0) {
                int v5 = arr_v.length - 1;
                if(v3 == v5) {
                    if(CLS439.MTH1679(arr_v1, arr_v, 0.7f) < 0.48f) {
                        return new int[]{v4, v2};
                    }
                    v4 += arr_v1[0] + arr_v1[1];
                    System.arraycopy(arr_v1, 2, arr_v1, 0, arr_v.length - 2);
                    arr_v1[arr_v.length - 2] = 0;
                    arr_v1[v5] = 0;
                    --v3;
                }
                else {
                    ++v3;
                }
                arr_v1[v3] = 1;
                z1 = !z1;
            }
            else {
                ++arr_v1[v3];
            }
            ++v2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] MTH1733(CLS365 ⁱˋ0) {
        int[] arr_v = new int[CLS833.FLD458.length];
        int[] arr_v1 = null;
        boolean z = false;
        for(int v = 0; !z; v = v2) {
            Arrays.fill(arr_v, 0, CLS833.FLD458.length, 0);
            arr_v1 = CLS833.MTH1732(ⁱˋ0, v, false, CLS833.FLD458, arr_v);
            int v1 = arr_v1[0];
            int v2 = arr_v1[1];
            int v3 = v1 * 2 - v2;
            if(v3 >= 0) {
                z = ⁱˋ0.MTH5005(v3, v1, false);
            }
        }
        return arr_v1;
    }

    public static boolean MTH1734(CharSequence charSequence0) {
        int v = charSequence0.length();
        if(v == 0) {
            return false;
        }
        int v1 = v - 2;
        int v2 = 0;
        while(v1 >= 0) {
            int v3 = charSequence0.charAt(v1);
            if(v3 - 0x30 < 0 || v3 - 0x30 > 9) {
                throw FormatException.getFormatInstance();
            }
            v2 += v3 - 0x30;
            v1 -= 2;
        }
        int v4 = v2 * 3;
        for(int v5 = v - 1; v5 >= 0; v5 -= 2) {
            int v6 = charSequence0.charAt(v5);
            if(v6 - 0x30 < 0 || v6 - 0x30 > 9) {
                throw FormatException.getFormatInstance();
            }
            v4 += v6 - 0x30;
        }
        return v4 % 10 == 0;
    }

    public int[] MTH1735(CLS365 ⁱˋ0, int v) {
        return CLS833.MTH1730(ⁱˋ0, v, false, CLS833.FLD458);
    }

    public abstract BarcodeFormat MTH1736();

    public boolean MTH1737(String s) {
        return CLS833.MTH1734(s);
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        return this.MTH1729(v, ⁱˋ0, CLS833.MTH1733(ⁱˋ0), map0);
    }
}

