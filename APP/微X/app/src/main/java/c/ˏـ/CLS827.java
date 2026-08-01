// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

public final class CLS827 extends CLS439 {
    public final StringBuilder FLD416;
    public static final int[] FLD417;
    public final int[] FLD418;
    public static final int FLD419;
    public final boolean FLD420;
    public final boolean FLD421;

    static {
        CLS827.FLD417 = new int[]{52, 289, 97, 0x160, 49, 304, 0x70, 37, 292, 100, 0x109, 73, 328, 25, 280, 88, 13, 0x10C, 76, 28, 0x103, 67, 322, 19, 274, 82, 7, 0x106, 70, 22, 385, 0xC1, 0x1C0, 0x91, 400, 0xD0, 0x85, 388, 0xC4, 0x94, 0xA8, 0xA2, 0x8A, 42};
        CLS827.FLD419 = 0x94;
    }

    public CLS827() {
        this(false);
    }

    public CLS827(boolean z) {
        this(z, false);
    }

    public CLS827(boolean z, boolean z1) {
        this.FLD420 = z;
        this.FLD421 = z1;
        this.FLD416 = new StringBuilder(20);
        this.FLD418 = new int[9];
    }

    public static char MTH1644(int v) {
        for(int v1 = 0; true; ++v1) {
            int[] arr_v = CLS827.FLD417;
            if(v1 >= arr_v.length) {
                break;
            }
            if(arr_v[v1] == v) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(v1);
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] MTH1645(CLS365 ⁱˋ0, int[] arr_v) {
        int v = ⁱˋ0.MTH5007();
        int v1 = ⁱˋ0.MTH5002(0);
        int v2 = v1;
        boolean z = false;
        int v3 = 0;
        while(v1 < v) {
            if((ⁱˋ0.MTH5018(v1) ^ z) == 0) {
                int v4 = arr_v.length - 1;
                if(v3 == v4) {
                    if(CLS827.MTH1646(arr_v) == CLS827.FLD419 && ⁱˋ0.MTH5005(Math.max(0, v2 - (v1 - v2) / 2), v2, false)) {
                        return new int[]{v2, v1};
                    }
                    v2 += arr_v[0] + arr_v[1];
                    System.arraycopy(arr_v, 2, arr_v, 0, arr_v.length - 2);
                    arr_v[arr_v.length - 2] = 0;
                    arr_v[v4] = 0;
                    --v3;
                }
                else {
                    ++v3;
                }
                arr_v[v3] = 1;
                z = !z;
            }
            else {
                ++arr_v[v3];
            }
            ++v1;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int MTH1646(int[] arr_v) {
        for(int v1 = 0; true; v1 = v2) {
            int v2 = 0x7FFFFFFF;
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                int v4 = arr_v[v3];
                if(v4 < v2 && v4 > v1) {
                    v2 = v4;
                }
            }
            int v6 = 0;
            int v7 = 0;
            int v8 = 0;
            for(int v5 = 0; v5 < arr_v.length; ++v5) {
                int v9 = arr_v[v5];
                if(v9 > v2) {
                    v7 |= 1 << arr_v.length - 1 - v5;
                    ++v6;
                    v8 += v9;
                }
            }
            if(v6 == 3) {
                for(int v = 0; v < arr_v.length && v6 > 0; ++v) {
                    int v10 = arr_v[v];
                    if(v10 > v2) {
                        --v6;
                        if(v10 << 1 >= v8) {
                            return -1;
                        }
                    }
                }
                return v7;
            }
            if(v6 <= 3) {
                return -1;
            }
        }
    }

    public static String MTH1647(CharSequence charSequence0) {
        int v = charSequence0.length();
        StringBuilder stringBuilder0 = new StringBuilder(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = charSequence0.charAt(v1);
            if(v2 == 36 || v2 == 37 || v2 == 43 || v2 == 0x2F) {
                ++v1;
                int v3 = charSequence0.charAt(v1);
                switch(v2) {
                    case 36: {
                        if(v3 < 65 || v3 > 90) {
                            throw FormatException.getFormatInstance();
                        }
                        v2 = (char)(v3 - 0x40);
                        break;
                    }
                    case 37: {
                        if(v3 < 65 || v3 > 69) {
                            if(v3 < 70 || v3 > 87) {
                                throw FormatException.getFormatInstance();
                            }
                            v2 = (char)(v3 - 11);
                        }
                        else {
                            v2 = (char)(v3 - 38);
                        }
                        break;
                    }
                    case 43: {
                        if(v3 < 65 || v3 > 90) {
                            throw FormatException.getFormatInstance();
                        }
                        v2 = (char)(v3 + 0x20);
                        break;
                    }
                    case 0x2F: {
                        if(v3 < 65 || v3 > 0x4F) {
                            if(v3 != 90) {
                                throw FormatException.getFormatInstance();
                            }
                            v2 = 58;
                            break;
                        }
                        else {
                            v2 = (char)(v3 - 0x20);
                        }
                        break;
                    }
                    default: {
                        v2 = 0;
                    }
                }
            }
            stringBuilder0.append(((char)v2));
        }
        return stringBuilder0.toString();
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        int[] arr_v = this.FLD418;
        Arrays.fill(arr_v, 0);
        StringBuilder stringBuilder0 = this.FLD416;
        stringBuilder0.setLength(0);
        int[] arr_v1 = CLS827.MTH1645(ⁱˋ0, arr_v);
        int v1 = ⁱˋ0.MTH5002(arr_v1[1]);
        int v2 = ⁱˋ0.MTH5007();
        while(true) {
            CLS439.MTH1678(ⁱˋ0, v1, arr_v);
            int v3 = CLS827.MTH1646(arr_v);
            if(v3 < 0) {
                break;
            }
            int v4 = CLS827.MTH1644(v3);
            stringBuilder0.append(((char)v4));
            int v5 = v1;
            for(int v6 = 0; v6 < arr_v.length; ++v6) {
                v5 += arr_v[v6];
            }
            int v7 = ⁱˋ0.MTH5002(v5);
            if(v4 == 42) {
                stringBuilder0.setLength(stringBuilder0.length() - 1);
                int v9 = 0;
                for(int v8 = 0; v8 < arr_v.length; ++v8) {
                    v9 += arr_v[v8];
                }
                if(v7 != v2 && v7 - v1 - v9 << 1 < v9) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if(this.FLD420) {
                    int v10 = stringBuilder0.length();
                    int v12 = 0;
                    for(int v11 = 0; v11 < v10 - 1; ++v11) {
                        v12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.FLD416.charAt(v11));
                    }
                    if(stringBuilder0.charAt(v10 - 1) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(v12 % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    stringBuilder0.setLength(v10 - 1);
                }
                if(stringBuilder0.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                return this.FLD421 ? new CLS271(CLS827.MTH1647(stringBuilder0), null, new CLS268[]{new CLS268(((float)(arr_v1[1] + arr_v1[0])) / 2.0f, ((float)v)), new CLS268(((float)v1) + ((float)v9) / 2.0f, ((float)v))}, BarcodeFormat.CODE_39) : new CLS271(stringBuilder0.toString(), null, new CLS268[]{new CLS268(((float)(arr_v1[1] + arr_v1[0])) / 2.0f, ((float)v)), new CLS268(((float)v1) + ((float)v9) / 2.0f, ((float)v))}, BarcodeFormat.CODE_39);
            }
            v1 = v7;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

