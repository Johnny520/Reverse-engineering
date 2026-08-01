// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import c.ﾞﹶ.CLS376;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.Map;

public abstract class CLS836 extends CLS807 {
    public final CLS318 FLD1448;
    public static final int[] FLD1449;
    public final StringBuilder FLD1450;
    public final CLS321 FLD1451;
    public static final int[][] FLD1452;
    public static final int[][] FLD1453;
    public static final int[] FLD1454;
    public static final int[] FLD1455;

    static {
        CLS836.FLD1455 = new int[]{1, 1, 1};
        CLS836.FLD1449 = new int[]{1, 1, 1, 1, 1};
        CLS836.FLD1454 = new int[]{1, 1, 1, 1, 1, 1};
        int[][] arr2_v = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        CLS836.FLD1452 = arr2_v;
        int[][] arr2_v1 = new int[20][];
        CLS836.FLD1453 = arr2_v1;
        System.arraycopy(arr2_v, 0, arr2_v1, 0, 10);
        for(int v = 10; v < 20; ++v) {
            int[] arr_v = CLS836.FLD1452[v - 10];
            int[] arr_v1 = new int[arr_v.length];
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                arr_v1[v1] = arr_v[arr_v.length - v1 - 1];
            }
            CLS836.FLD1453[v] = arr_v1;
        }
    }

    public CLS836() {
        this.FLD1450 = new StringBuilder(20);
        this.FLD1448 = new CLS318();
        this.FLD1451 = new CLS321();
    }

    @Override  // c.ᐧـ.CLS807
    public CLS379 MTH4611(int v, CLS118 ˆٴ0, Map map0) {
        return this.MTH4630(v, ˆٴ0, CLS836.MTH4631(ˆٴ0), map0);
    }

    public CLS379 MTH4630(int v, CLS118 ˆٴ0, int[] arr_v, Map map0) {
        int[] arr_v1 = null;
        CLS376 ˋᵎ0 = map0 == null ? null : ((CLS376)map0.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK));
        boolean z = true;
        if(ˋᵎ0 != null) {
            ˋᵎ0.MTH5101(new CLS380(((float)(arr_v[0] + arr_v[1])) / 2.0f, ((float)v)));
        }
        StringBuilder stringBuilder0 = this.FLD1450;
        stringBuilder0.setLength(0);
        int v1 = this.MTH4632(ˆٴ0, arr_v, stringBuilder0);
        if(ˋᵎ0 != null) {
            ˋᵎ0.MTH5101(new CLS380(((float)v1), ((float)v)));
        }
        int[] arr_v2 = this.MTH4636(ˆٴ0, v1);
        if(ˋᵎ0 != null) {
            ˋᵎ0.MTH5101(new CLS380(((float)(arr_v2[0] + arr_v2[1])) / 2.0f, ((float)v)));
        }
        int v2 = arr_v2[1];
        int v3 = v2 - arr_v2[0] + v2;
        if(v3 >= ˆٴ0.MTH2347() || !ˆٴ0.MTH2353(v2, v3, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String s = stringBuilder0.toString();
        if(s.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if(!this.MTH4638(s)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f = ((float)(arr_v[1] + arr_v[0])) / 2.0f;
        float f1 = ((float)(arr_v2[1] + arr_v2[0])) / 2.0f;
        BarcodeFormat barcodeFormat0 = this.MTH4635();
        CLS379 ٴˑ0 = new CLS379(s, null, new CLS380[]{new CLS380(f, ((float)v)), new CLS380(f1, ((float)v))}, barcodeFormat0);
        try {
            CLS379 ٴˑ1 = this.FLD1448.MTH4600(v, ˆٴ0, arr_v2[1]);
            ٴˑ0.MTH5120(ResultMetadataType.UPC_EAN_EXTENSION, ٴˑ1.MTH5121());
            ٴˑ0.MTH5119(ٴˑ1.MTH5122());
            ٴˑ0.MTH5117(ٴˑ1.MTH5116());
            int v4 = 0;
            v4 = ٴˑ1.MTH5121().length();
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
            String s1 = this.FLD1451.MTH4666(s);
            if(s1 != null) {
                ٴˑ0.MTH5120(ResultMetadataType.POSSIBLE_COUNTRY, s1);
            }
        }
        return ٴˑ0;
    }

    public static int[] MTH4631(CLS118 ˆٴ0) {
        int[] arr_v = new int[CLS836.FLD1455.length];
        int[] arr_v1 = null;
        boolean z = false;
        for(int v = 0; !z; v = v2) {
            Arrays.fill(arr_v, 0, CLS836.FLD1455.length, 0);
            arr_v1 = CLS836.MTH4633(ˆٴ0, v, false, CLS836.FLD1455, arr_v);
            int v1 = arr_v1[0];
            int v2 = arr_v1[1];
            int v3 = v1 * 2 - v2;
            if(v3 >= 0) {
                z = ˆٴ0.MTH2353(v3, v1, false);
            }
        }
        return arr_v1;
    }

    public abstract int MTH4632(CLS118 arg1, int[] arg2, StringBuilder arg3);

    public static int[] MTH4633(CLS118 ˆٴ0, int v, boolean z, int[] arr_v, int[] arr_v1) {
        int v1 = ˆٴ0.MTH2347();
        int v2 = z ? ˆٴ0.MTH2352(v) : ˆٴ0.MTH2349(v);
        boolean z1 = z;
        int v3 = 0;
        int v4 = v2;
        while(v2 < v1) {
            if((ˆٴ0.MTH2357(v2) ^ z1) == 0) {
                int v5 = arr_v.length - 1;
                if(v3 == v5) {
                    if(CLS807.MTH4616(arr_v1, arr_v, 0.7f) < 0.48f) {
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

    public static int MTH4634(CLS118 ˆٴ0, int[] arr_v, int v, int[][] arr2_v) {
        CLS807.MTH4612(ˆٴ0, v, arr_v);
        float f = 0.48f;
        int v1 = -1;
        for(int v2 = 0; v2 < arr2_v.length; ++v2) {
            float f1 = CLS807.MTH4616(arr_v, arr2_v[v2], 0.7f);
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

    public abstract BarcodeFormat MTH4635();

    public int[] MTH4636(CLS118 ˆٴ0, int v) {
        return CLS836.MTH4637(ˆٴ0, v, false, CLS836.FLD1455);
    }

    public static int[] MTH4637(CLS118 ˆٴ0, int v, boolean z, int[] arr_v) {
        return CLS836.MTH4633(ˆٴ0, v, z, arr_v, new int[arr_v.length]);
    }

    public boolean MTH4638(String s) {
        return CLS836.MTH4639(s);
    }

    public static boolean MTH4639(CharSequence charSequence0) {
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
}

