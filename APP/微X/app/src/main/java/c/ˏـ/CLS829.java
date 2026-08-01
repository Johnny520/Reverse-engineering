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

public final class CLS829 extends CLS439 {
    public static final char[] FLD428;
    public static final int FLD429;
    public static final int[] FLD430;
    public final StringBuilder FLD431;
    public final int[] FLD432;

    static {
        CLS829.FLD428 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
        CLS829.FLD430 = new int[]{276, 328, 324, 322, 296, 292, 290, 0x150, 274, 0x10A, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        CLS829.FLD429 = 350;
    }

    public CLS829() {
        this.FLD431 = new StringBuilder(20);
        this.FLD432 = new int[6];
    }

    public static String MTH1669(CharSequence charSequence0) {
        int v = charSequence0.length();
        StringBuilder stringBuilder0 = new StringBuilder(v);
        int v1 = 0;
        while(v1 < v) {
            int v2 = charSequence0.charAt(v1);
            if(v2 >= 97 && v2 <= 100) {
                if(v1 < v - 1) {
                    ++v1;
                    int v3 = charSequence0.charAt(v1);
                    switch(v2) {
                        case 97: {
                            if(v3 < 65 || v3 > 90) {
                                throw FormatException.getFormatInstance();
                            }
                            v2 = (char)(v3 - 0x40);
                            goto label_44;
                        }
                        case 98: {
                            if(v3 >= 65 && v3 <= 69) {
                                v2 = (char)(v3 - 38);
                            }
                            else if(v3 >= 70 && v3 <= 74) {
                                v2 = (char)(v3 - 11);
                            }
                            else if(v3 >= 75 && v3 <= 0x4F) {
                                v2 = (char)(v3 + 16);
                            }
                            else if(v3 < 80 || v3 > 83) {
                                if(v3 < 84 || v3 > 90) {
                                    throw FormatException.getFormatInstance();
                                }
                                v2 = 0x7F;
                            }
                            else {
                                v2 = (char)(v3 + 43);
                            }
                            goto label_44;
                        }
                        case 99: {
                            if(v3 < 65 || v3 > 0x4F) {
                                if(v3 != 90) {
                                    throw FormatException.getFormatInstance();
                                }
                                v2 = 58;
                            }
                            else {
                                v2 = (char)(v3 - 0x20);
                            }
                            goto label_44;
                        }
                        case 100: {
                            if(v3 < 65 || v3 > 90) {
                                throw FormatException.getFormatInstance();
                            }
                            v2 = (char)(v3 + 0x20);
                            goto label_44;
                        }
                        default: {
                            v2 = 0;
                            goto label_44;
                        }
                    }
                }
                throw FormatException.getFormatInstance();
            }
        label_44:
            stringBuilder0.append(((char)v2));
            ++v1;
        }
        return stringBuilder0.toString();
    }

    public static int MTH1670(int[] arr_v) {
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += arr_v[v];
        }
        int v2 = 0;
        int v3 = 0;
        while(v2 < arr_v.length) {
            int v4 = Math.round(((float)arr_v[v2]) * 9.0f / ((float)v1));
            if(v4 > 0 && v4 <= 4) {
                if((v2 & 1) == 0) {
                    for(int v5 = 0; v5 < v4; ++v5) {
                        v3 = v3 << 1 | 1;
                    }
                }
                else {
                    v3 <<= v4;
                }
                ++v2;
                continue;
            }
            return -1;
        }
        return v3;
    }

    public static char MTH1671(int v) {
        for(int v1 = 0; true; ++v1) {
            int[] arr_v = CLS829.FLD430;
            if(v1 >= arr_v.length) {
                break;
            }
            if(arr_v[v1] == v) {
                return CLS829.FLD428[v1];
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static void MTH1672(CharSequence charSequence0, int v, int v1) {
        int v2 = v - 1;
        int v3 = 0;
        int v4 = 1;
        while(v2 >= 0) {
            v3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence0.charAt(v2)) * v4;
            ++v4;
            v4 = v4 <= v1 ? v4 + 1 : 1;
            --v2;
        }
        if(charSequence0.charAt(v) != CLS829.FLD428[v3 % 0x2F]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public final int[] MTH1673(CLS365 ⁱˋ0) {
        int v = ⁱˋ0.MTH5007();
        int v1 = ⁱˋ0.MTH5002(0);
        Arrays.fill(this.FLD432, 0);
        int[] arr_v = this.FLD432;
        int v2 = v1;
        boolean z = false;
        int v3 = 0;
        while(v1 < v) {
            if((ⁱˋ0.MTH5018(v1) ^ z) == 0) {
                int v4 = arr_v.length - 1;
                if(v3 == v4) {
                    if(CLS829.MTH1670(arr_v) == CLS829.FLD429) {
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

    public static void MTH1674(CharSequence charSequence0) {
        int v = charSequence0.length();
        CLS829.MTH1672(charSequence0, v - 2, 20);
        CLS829.MTH1672(charSequence0, v - 1, 15);
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        int[] arr_v = this.MTH1673(ⁱˋ0);
        int v1 = ⁱˋ0.MTH5002(arr_v[1]);
        int v2 = ⁱˋ0.MTH5007();
        int[] arr_v1 = this.FLD432;
        Arrays.fill(arr_v1, 0);
        StringBuilder stringBuilder0 = this.FLD431;
        stringBuilder0.setLength(0);
        while(true) {
            CLS439.MTH1678(ⁱˋ0, v1, arr_v1);
            int v3 = CLS829.MTH1670(arr_v1);
            if(v3 < 0) {
                break;
            }
            int v4 = CLS829.MTH1671(v3);
            stringBuilder0.append(((char)v4));
            int v5 = v1;
            for(int v6 = 0; v6 < arr_v1.length; ++v6) {
                v5 += arr_v1[v6];
            }
            int v7 = ⁱˋ0.MTH5002(v5);
            if(v4 == 42) {
                stringBuilder0.deleteCharAt(stringBuilder0.length() - 1);
                int v9 = 0;
                for(int v8 = 0; v8 < arr_v1.length; ++v8) {
                    v9 += arr_v1[v8];
                }
                if(v7 == v2 || !ⁱˋ0.MTH5018(v7) || stringBuilder0.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                CLS829.MTH1674(stringBuilder0);
                stringBuilder0.setLength(stringBuilder0.length() - 2);
                return new CLS271(CLS829.MTH1669(stringBuilder0), null, new CLS268[]{new CLS268(((float)(arr_v[1] + arr_v[0])) / 2.0f, ((float)v)), new CLS268(((float)v1) + ((float)v9) / 2.0f, ((float)v))}, BarcodeFormat.CODE_93);
            }
            v1 = v7;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

