// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

public final class CLS839 extends CLS807 {
    public static final int[] FLD1471;
    public static final int[][] FLD1472;
    public int FLD1473;
    public static final int[] FLD1474;
    public static final int[] FLD1475;

    static {
        CLS839.FLD1471 = new int[]{6, 8, 10, 12, 14};
        CLS839.FLD1474 = new int[]{1, 1, 1, 1};
        CLS839.FLD1475 = new int[]{1, 1, 3};
        CLS839.FLD1472 = new int[][]{new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    }

    public CLS839() {
        this.FLD1473 = -1;
    }

    @Override  // c.ᐧـ.CLS807
    public CLS379 MTH4611(int v, CLS118 ˆٴ0, Map map0) {
        boolean z;
        int[] arr_v = this.MTH4673(ˆٴ0);
        int[] arr_v1 = this.MTH4676(ˆٴ0);
        StringBuilder stringBuilder0 = new StringBuilder(20);
        CLS839.MTH4672(ˆٴ0, arr_v[1], arr_v1[0], stringBuilder0);
        String s = stringBuilder0.toString();
        int[] arr_v2 = map0 == null ? null : ((int[])map0.get(DecodeHintType.ALLOWED_LENGTHS));
        if(arr_v2 == null) {
            arr_v2 = CLS839.FLD1471;
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
        return new CLS379(s, null, new CLS380[]{new CLS380(((float)arr_v[1]), ((float)v)), new CLS380(((float)arr_v1[0]), ((float)v))}, BarcodeFormat.ITF);
    }

    public static int MTH4670(CLS118 ˆٴ0) {
        int v = ˆٴ0.MTH2349(0);
        if(v == ˆٴ0.MTH2347()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v;
    }

    public static int[] MTH4671(CLS118 ˆٴ0, int v, int[] arr_v) {
        int[] arr_v1 = new int[arr_v.length];
        int v1 = ˆٴ0.MTH2347();
        int v2 = v;
        boolean z = false;
        int v3 = 0;
        while(v < v1) {
            if((ˆٴ0.MTH2357(v) ^ z) == 0) {
                int v4 = arr_v.length - 1;
                if(v3 == v4) {
                    if(CLS807.MTH4616(arr_v1, arr_v, 0.78f) < 0.38f) {
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

    public static void MTH4672(CLS118 ˆٴ0, int v, int v1, StringBuilder stringBuilder0) {
        int[] arr_v = new int[10];
        int[] arr_v1 = new int[5];
        int[] arr_v2 = new int[5];
        while(v < v1) {
            CLS807.MTH4612(ˆٴ0, v, arr_v);
            for(int v3 = 0; v3 < 5; ++v3) {
                arr_v1[v3] = arr_v[v3 * 2];
                arr_v2[v3] = arr_v[v3 * 2 + 1];
            }
            stringBuilder0.append(((char)(CLS839.MTH4675(arr_v1) + 0x30)));
            stringBuilder0.append(((char)(CLS839.MTH4675(arr_v2) + 0x30)));
            for(int v2 = 0; v2 < 10; ++v2) {
                v += arr_v[v2];
            }
        }
    }

    public final int[] MTH4673(CLS118 ˆٴ0) {
        int[] arr_v = CLS839.MTH4671(ˆٴ0, CLS839.MTH4670(ˆٴ0), CLS839.FLD1474);
        this.FLD1473 = (arr_v[1] - arr_v[0]) / 4;
        this.MTH4674(ˆٴ0, arr_v[0]);
        return arr_v;
    }

    public final void MTH4674(CLS118 ˆٴ0, int v) {
        int v1 = this.FLD1473 * 10 < v ? this.FLD1473 * 10 : v;
        for(int v2 = v - 1; v1 > 0 && v2 >= 0 && !ˆٴ0.MTH2357(v2); --v2) {
            --v1;
        }
        if(v1 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public static int MTH4675(int[] arr_v) {
        float f = 0.38f;
        int v = -1;
        for(int v1 = 0; v1 < CLS839.FLD1472.length; ++v1) {
            float f1 = CLS807.MTH4616(arr_v, CLS839.FLD1472[v1], 0.78f);
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

    public final int[] MTH4676(CLS118 ˆٴ0) {
        ˆٴ0.MTH2345();
        try {
            int[] arr_v = CLS839.MTH4671(ˆٴ0, CLS839.MTH4670(ˆٴ0), CLS839.FLD1475);
            this.MTH4674(ˆٴ0, arr_v[0]);
            int v1 = arr_v[0];
            arr_v[0] = ˆٴ0.MTH2347() - arr_v[1];
            arr_v[1] = ˆٴ0.MTH2347() - v1;
            return arr_v;
        }
        finally {
            ˆٴ0.MTH2345();
        }
    }
}

