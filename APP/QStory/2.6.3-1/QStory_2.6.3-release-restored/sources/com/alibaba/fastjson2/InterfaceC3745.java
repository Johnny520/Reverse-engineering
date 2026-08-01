package com.alibaba.fastjson2;

import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.util.AbstractC3687;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3745 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    static boolean m6913(int i) {
        return (i & 248) == 64;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    static boolean m6914(int i) {
        return (i & 248) == 192;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    static byte[] m6915(String str) {
        byte[] bArr;
        int length;
        int i = 0;
        if (str == null) {
            return new byte[]{-81};
        }
        if (AbstractC3687.f9263 == 8) {
            char[] cArrM6330 = AbstractC3687.m6330(str);
            int length2 = cArrM6330.length;
            if (length2 <= 47) {
                for (char c : cArrM6330) {
                    if (c <= 127) {
                    }
                }
                byte[] bArr2 = new byte[cArrM6330.length + 1];
                bArr2[0] = (byte) (length2 + 73);
                while (i < length2) {
                    int i2 = i + 1;
                    bArr2[i2] = (byte) cArrM6330[i];
                    i = i2;
                }
                return bArr2;
            }
        } else {
            Function function = AbstractC3687.f9272;
            if (function != null && AbstractC3687.f9271.applyAsInt(str) == 0 && (length = (bArr = (byte[]) function.apply(str)).length) <= 47) {
                byte[] bArr3 = new byte[bArr.length + 1];
                bArr3[0] = (byte) (length + 73);
                System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
                return bArr3;
            }
        }
        C3729 c3729 = new C3729(new C3728(AbstractC3766.f9639));
        try {
            c3729.mo6577(str);
            byte[] bArrCopyOf = Arrays.copyOf(c3729.f9504, c3729.f9514);
            c3729.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                c3729.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    static boolean m6916(int i) {
        return (i & 240) == 48;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static String m6917(byte b) {
        if (b == 72) {
            return AbstractC3275.m5136(new StringBuilder("INT32 "), b);
        }
        if (b == 127) {
            return AbstractC3275.m5136(new StringBuilder("SYMBOL "), b);
        }
        switch (b) {
            case -111:
                return AbstractC3275.m5136(new StringBuilder("BINARY "), b);
            case -110:
                return AbstractC3275.m5136(new StringBuilder("TYPED_ANY "), b);
            case -109:
                return AbstractC3275.m5136(new StringBuilder("REFERENCE "), b);
            default:
                switch (b) {
                    case -91:
                        return AbstractC3275.m5136(new StringBuilder("OBJECT_END "), b);
                    case -90:
                        return AbstractC3275.m5136(new StringBuilder("OBJECT "), b);
                    case -89:
                        return AbstractC3275.m5136(new StringBuilder("LOCAL_TIME "), b);
                    case -88:
                        return AbstractC3275.m5136(new StringBuilder("LOCAL_DATETIME "), b);
                    case -87:
                        return AbstractC3275.m5136(new StringBuilder("LOCAL_DATE "), b);
                    case -86:
                        return AbstractC3275.m5136(new StringBuilder("TIMESTAMP_WITH_TIMEZONE "), b);
                    case -85:
                        return AbstractC3275.m5136(new StringBuilder("TIMESTAMP_MILLIS "), b);
                    case -84:
                        return AbstractC3275.m5136(new StringBuilder("TIMESTAMP_SECONDS "), b);
                    case -83:
                        return AbstractC3275.m5136(new StringBuilder("TIMESTAMP_MINUTES "), b);
                    case -82:
                        return AbstractC3275.m5136(new StringBuilder("TIMESTAMP "), b);
                    case -81:
                        return AbstractC3275.m5136(new StringBuilder("NULL "), b);
                    case -80:
                        return AbstractC3275.m5136(new StringBuilder("FALSE "), b);
                    case -79:
                        return AbstractC3275.m5136(new StringBuilder("TRUE "), b);
                    case -78:
                    case -77:
                    case -76:
                    case -75:
                        return AbstractC3275.m5136(new StringBuilder("DOUBLE "), b);
                    case -74:
                    case -73:
                        return AbstractC3275.m5136(new StringBuilder("FLOAT "), b);
                    case -72:
                    case -71:
                        return AbstractC3275.m5136(new StringBuilder("DECIMAL "), b);
                    case -70:
                    case -69:
                        return AbstractC3275.m5136(new StringBuilder("BIGINT "), b);
                    case -68:
                        return AbstractC3275.m5136(new StringBuilder("INT16 "), b);
                    case -67:
                        return AbstractC3275.m5136(new StringBuilder("INT8 "), b);
                    case -66:
                    case -65:
                        return AbstractC3275.m5136(new StringBuilder("INT64 "), b);
                    default:
                        switch (b) {
                            case 122:
                                return AbstractC3275.m5136(new StringBuilder("STR_UTF8 "), b);
                            case 123:
                                return AbstractC3275.m5136(new StringBuilder("STR_UTF16 "), b);
                            case 124:
                                return AbstractC3275.m5136(new StringBuilder("STR_UTF16LE "), b);
                            case 125:
                                return AbstractC3275.m5136(new StringBuilder("STR_UTF16BE "), b);
                            default:
                                return (b < -108 || b > -92) ? (b < 73 || b > 121) ? (b < -16 || b > 47) ? (b < 48 || b > 63) ? (b < 64 || b > 71) ? (b < -40 || b > -17) ? (b < -56 || b > -41) ? (b < -64 || b > -57) ? Integer.toString(b) : AbstractC3275.m5136(new StringBuilder("INT64 "), b) : AbstractC3275.m5136(new StringBuilder("INT64 "), b) : AbstractC3275.m5136(new StringBuilder("INT64 "), b) : AbstractC3275.m5136(new StringBuilder("INT32 "), b) : AbstractC3275.m5136(new StringBuilder("INT32 "), b) : AbstractC3275.m5136(new StringBuilder("INT32 "), b) : AbstractC3275.m5136(new StringBuilder("STR_ASCII "), b) : AbstractC3275.m5136(new StringBuilder("ARRAY "), b);
                        }
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    static boolean m6918(int i) {
        return ((i + 56) & 240) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    static boolean m6919(int i) {
        return i >= -40 && i <= -17;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    static boolean m6920(int i) {
        return i >= -16 && i <= 72;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    static boolean m6921(int i) {
        return i >= -16 && i <= 47;
    }
}
