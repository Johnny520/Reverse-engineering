// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

public final class CLS840 extends CLS807 {
    public final int[] FLD1477;
    public static final int FLD1478;
    public final StringBuilder FLD1479;
    public static final char[] FLD1480;
    public static final int[] FLD1481;

    static {
        CLS840.FLD1480 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
        CLS840.FLD1481 = new int[]{276, 328, 324, 322, 296, 292, 290, 0x150, 274, 0x10A, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        CLS840.FLD1478 = 350;
    }

    public CLS840() {
        this.FLD1479 = new StringBuilder(20);
        this.FLD1477 = new int[6];
    }

    @Override  // c.ᐧـ.CLS807
    public CLS379 MTH4611(int v, CLS118 ˆٴ0, Map map0) {
        int[] arr_v = this.MTH4686(ˆٴ0);
        int v1 = ˆٴ0.MTH2349(arr_v[1]);
        int v2 = ˆٴ0.MTH2347();
        int[] arr_v1 = this.FLD1477;
        Arrays.fill(arr_v1, 0);
        StringBuilder stringBuilder0 = this.FLD1479;
        stringBuilder0.setLength(0);
        while(true) {
            CLS807.MTH4612(ˆٴ0, v1, arr_v1);
            int v3 = CLS840.MTH4683(arr_v1);
            if(v3 < 0) {
                break;
            }
            int v4 = CLS840.MTH4684(v3);
            stringBuilder0.append(((char)v4));
            int v5 = v1;
            for(int v6 = 0; v6 < arr_v1.length; ++v6) {
                v5 += arr_v1[v6];
            }
            int v7 = ˆٴ0.MTH2349(v5);
            if(v4 == 42) {
                stringBuilder0.deleteCharAt(stringBuilder0.length() - 1);
                int v9 = 0;
                for(int v8 = 0; v8 < arr_v1.length; ++v8) {
                    v9 += arr_v1[v8];
                }
                if(v7 == v2 || !ˆٴ0.MTH2357(v7) || stringBuilder0.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                CLS840.MTH4687(stringBuilder0);
                stringBuilder0.setLength(stringBuilder0.length() - 2);
                return new CLS379(CLS840.MTH4685(stringBuilder0), null, new CLS380[]{new CLS380(((float)(arr_v[1] + arr_v[0])) / 2.0f, ((float)v)), new CLS380(((float)v1) + ((float)v9) / 2.0f, ((float)v))}, BarcodeFormat.CODE_93);
            }
            v1 = v7;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int MTH4683(int[] arr_v) {
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

    public static char MTH4684(int v) {
        for(int v1 = 0; true; ++v1) {
            int[] arr_v = CLS840.FLD1481;
            if(v1 >= arr_v.length) {
                break;
            }
            if(arr_v[v1] == v) {
                return CLS840.FLD1480[v1];
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static String MTH4685(CharSequence charSequence0) {
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

    public final int[] MTH4686(CLS118 ˆٴ0) {
        int v = ˆٴ0.MTH2347();
        int v1 = ˆٴ0.MTH2349(0);
        Arrays.fill(this.FLD1477, 0);
        int[] arr_v = this.FLD1477;
        int v2 = v1;
        boolean z = false;
        int v3 = 0;
        while(v1 < v) {
            if((ˆٴ0.MTH2357(v1) ^ z) == 0) {
                int v4 = arr_v.length - 1;
                if(v3 == v4) {
                    if(CLS840.MTH4683(arr_v) == CLS840.FLD1478) {
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

    public static void MTH4687(CharSequence charSequence0) {
        int v = charSequence0.length();
        CLS840.MTH4688(charSequence0, v - 2, 20);
        CLS840.MTH4688(charSequence0, v - 1, 15);
    }

    public static void MTH4688(CharSequence charSequence0, int v, int v1) {
        int v2 = v - 1;
        int v3 = 0;
        int v4 = 1;
        while(v2 >= 0) {
            v3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence0.charAt(v2)) * v4;
            ++v4;
            v4 = v4 <= v1 ? v4 + 1 : 1;
            --v2;
        }
        if(charSequence0.charAt(v) != CLS840.FLD1480[v3 % 0x2F]) {
            throw ChecksumException.getChecksumInstance();
        }
    }
}

