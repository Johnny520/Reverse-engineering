// Decompiled by JEB v5.42.0.202606242140

package c.ⁱʽ;

import c.ˎˊ.CLS124;
import java.text.DecimalFormat;

public final class CLS356 {
    public static final String[] FLD1576;

    static {
        CLS356.FLD1576 = new String[]{"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\uFFFA\u001C\u001D\u001E\uFFFB \uFFFC\"#$%&\'()*+,-./0123456789:\uFFF1\uFFF2\uFFF3\uFFF4\uFFF8", "`abcdefghijklmnopqrstuvwxyz\uFFFA\u001C\u001D\u001E\uFFFB{\uFFFC}~\u007F;<=>?[\\]^_ ,./:@!|\uFFFC\uFFF5\uFFF6\uFFFC\uFFF0\uFFF2\uFFF3\uFFF4\uFFF7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\uFFFA\u001C\u001D\u001EÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\uFFF7 \uFFF9\uFFF3\uFFF4\uFFF8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\uFFFA\u001C\u001D\u001E\uFFFBûüýþÿ¡¨«¯°´·¸»¿\u008A\u008B\u008C\u008D\u008E\u008F\u0090\u0091\u0092\u0093\u0094\uFFF7 \uFFF2\uFFF9\uFFF4\uFFF8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\uFFFA\uFFFC\uFFFC\u001B\uFFFB\u001C\u001D\u001E\u001F\u009F ¢£¤¥¦§©­®¶\u0095\u0096\u0097\u0098\u0099\u009A\u009B\u009C\u009D\u009E\uFFF7 \uFFF2\uFFF3\uFFF9\uFFF8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&\'()*+,-./0123456789:;<=>?"};
    }

    public static int MTH4906(int v, byte[] arr_b) {
        return (1 << 5 - (v - 1) % 6 & arr_b[(v - 1) / 6]) == 0 ? 0 : 1;
    }

    public static String MTH4907(byte[] arr_b, int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v2 = v;
        int v3 = 0;
        int v5 = 0;
        for(int v4 = -1; v2 < v + v1; --v4) {
            int v6 = CLS356.FLD1576[v3].charAt(((int)arr_b[v2]));
            switch(v6) {
                case 0xFFF0: 
                case 0xFFF1: 
                case 0xFFF2: 
                case 0xFFF3: 
                case 0xFFF4: {
                    v5 = v3;
                    v3 = v6 - 0xFFF0;
                    v4 = 1;
                    break;
                }
                case 0xFFF5: {
                    v4 = 2;
                    v5 = v3;
                    v3 = 0;
                    break;
                }
                case 0xFFF6: {
                    v4 = 3;
                    v5 = v3;
                    v3 = 0;
                    break;
                }
                case 0xFFF7: {
                    v3 = 0;
                    v4 = -1;
                    break;
                }
                case 0xFFF8: {
                    v3 = 1;
                    v4 = -1;
                    break;
                }
                case 0xFFF9: {
                    v4 = -1;
                    break;
                }
                case 0xFFFB: {
                    int v7 = (arr_b[v2 + 1] << 24) + (arr_b[v2 + 2] << 18) + (arr_b[v2 + 3] << 12) + (arr_b[v2 + 4] << 6);
                    v2 += 5;
                    int v8 = v7 + arr_b[v2];
                    stringBuilder0.append(new DecimalFormat("000000000").format(((long)v8)));
                    break;
                }
                default: {
                    stringBuilder0.append(((char)v6));
                }
            }
            if(v4 == 0) {
                v3 = v5;
            }
            ++v2;
        }
        while(stringBuilder0.length() > 0 && stringBuilder0.charAt(stringBuilder0.length() - 1) == 0xFFFC) {
            stringBuilder0.setLength(stringBuilder0.length() - 1);
        }
        return stringBuilder0.toString();
    }

    public static CLS124 MTH4908(byte[] arr_b, int v) {
        int v3;
        String s3;
        String s;
        int v1 = 0;
        StringBuilder stringBuilder0 = new StringBuilder(0x90);
        switch(v) {
            case 2: 
            case 3: {
                if(v == 2) {
                    int v2 = CLS356.MTH4913(arr_b);
                    s = new DecimalFormat("0000000000".substring(0, CLS356.MTH4911(arr_b))).format(((long)v2));
                }
                else {
                    s = CLS356.MTH4912(arr_b);
                }
                DecimalFormat decimalFormat0 = new DecimalFormat("000");
                String s1 = decimalFormat0.format(((long)CLS356.MTH4910(arr_b)));
                String s2 = decimalFormat0.format(((long)CLS356.MTH4909(arr_b)));
                stringBuilder0.append(CLS356.MTH4907(arr_b, 10, 84));
                if(stringBuilder0.toString().startsWith("[)>\u001E01\u001D")) {
                    s3 = s + '\u001D' + s1 + '\u001D' + s2 + '\u001D';
                    v1 = 9;
                }
                else {
                    s3 = s + '\u001D' + s1 + '\u001D' + s2 + '\u001D';
                }
                stringBuilder0.insert(v1, s3);
                return new CLS124(arr_b, stringBuilder0.toString(), null, String.valueOf(v));
            }
            case 4: {
                v3 = 93;
                break;
            }
            case 5: {
                v3 = 77;
                break;
            }
            default: {
                return new CLS124(arr_b, stringBuilder0.toString(), null, String.valueOf(v));
            }
        }
        stringBuilder0.append(CLS356.MTH4907(arr_b, 1, v3));
        return new CLS124(arr_b, stringBuilder0.toString(), null, String.valueOf(v));
    }

    public static int MTH4909(byte[] arr_b) {
        return CLS356.MTH4914(arr_b, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }

    public static int MTH4910(byte[] arr_b) {
        return CLS356.MTH4914(arr_b, new byte[]{53, 54, 43, 44, 45, 46, 0x2F, 0x30, 37, 38});
    }

    public static int MTH4911(byte[] arr_b) {
        return CLS356.MTH4914(arr_b, new byte[]{39, 40, 41, 42, 0x1F, 0x20});
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public static String MTH4912(byte[] arr_b) {
        return String.valueOf(new char[]{"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\uFFFA\u001C\u001D\u001E\uFFFB \uFFFC\"#$%&\'()*+,-./0123456789:\uFFF1\uFFF2\uFFF3\uFFF4\uFFF8".charAt(CLS356.MTH4914(arr_b, new byte[]{39, 40, 41, 42, 0x1F, 0x20})), "\nABCDEFGHIJKLMNOPQRSTUVWXYZ\uFFFA\u001C\u001D\u001E\uFFFB \uFFFC\"#$%&\'()*+,-./0123456789:\uFFF1\uFFF2\uFFF3\uFFF4\uFFF8".charAt(CLS356.MTH4914(arr_b, new byte[]{33, 34, 35, 36, 25, 26})), "\nABCDEFGHIJKLMNOPQRSTUVWXYZ\uFFFA\u001C\u001D\u001E\uFFFB \uFFFC\"#$%&\'()*+,-./0123456789:\uFFF1\uFFF2\uFFF3\uFFF4\uFFF8".charAt(CLS356.MTH4914(arr_b, new byte[]{27, 28, 29, 30, 19, 20})), "\nABCDEFGHIJKLMNOPQRSTUVWXYZ\uFFFA\u001C\u001D\u001E\uFFFB \uFFFC\"#$%&\'()*+,-./0123456789:\uFFF1\uFFF2\uFFF3\uFFF4\uFFF8".charAt(CLS356.MTH4914(arr_b, new byte[]{21, 22, 23, 24, 13, 14})), "\nABCDEFGHIJKLMNOPQRSTUVWXYZ\uFFFA\u001C\u001D\u001E\uFFFB \uFFFC\"#$%&\'()*+,-./0123456789:\uFFF1\uFFF2\uFFF3\uFFF4\uFFF8".charAt(CLS356.MTH4914(arr_b, new byte[]{15, 16, 17, 18, 7, 8})), "\nABCDEFGHIJKLMNOPQRSTUVWXYZ\uFFFA\u001C\u001D\u001E\uFFFB \uFFFC\"#$%&\'()*+,-./0123456789:\uFFF1\uFFF2\uFFF3\uFFF4\uFFF8".charAt(CLS356.MTH4914(arr_b, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    public static int MTH4913(byte[] arr_b) {
        return CLS356.MTH4914(arr_b, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    public static int MTH4914(byte[] arr_b, byte[] arr_b1) {
        if(arr_b1.length == 0) {
            throw new IllegalArgumentException();
        }
        int v1 = 0;
        for(int v = 0; v < arr_b1.length; ++v) {
            v1 += CLS356.MTH4906(arr_b1[v], arr_b) << arr_b1.length - v - 1;
        }
        return v1;
    }
}

