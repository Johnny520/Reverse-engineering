package com.alibaba.fastjson2;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2911 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    static boolean m6295(int i) {
        return (i & 248) == 64;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    static boolean m6296(int i) {
        return (i & 248) == 192;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    static byte[] m6297(String str) {
        byte[] bArr;
        int length;
        int i = 0;
        if (str == null) {
            return new byte[]{-81};
        }
        if (AbstractC2853.f8916 == 8) {
            char[] cArrM5725 = AbstractC2853.m5725(str);
            int length2 = cArrM5725.length;
            if (length2 <= 47) {
                for (char c : cArrM5725) {
                    if (c <= 127) {
                    }
                }
                byte[] bArr2 = new byte[cArrM5725.length + 1];
                bArr2[0] = (byte) (length2 + 73);
                while (i < length2) {
                    int i2 = i + 1;
                    bArr2[i2] = (byte) cArrM5725[i];
                    i = i2;
                }
                return bArr2;
            }
        } else {
            Function function = AbstractC2853.f8925;
            if (function != null && AbstractC2853.f8924.applyAsInt(str) == 0 && (length = (bArr = (byte[]) function.apply(str)).length) <= 47) {
                byte[] bArr3 = new byte[bArr.length + 1];
                bArr3[0] = (byte) (length + 73);
                System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
                return bArr3;
            }
        }
        C2895 c2895 = new C2895(new C2894(AbstractC2932.f9292));
        try {
            c2895.mo5972(str);
            byte[] bArrCopyOf = Arrays.copyOf(c2895.f9157, c2895.f9167);
            c2895.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                c2895.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    static boolean m6298(int i) {
        return (i & 240) == 48;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static String m6299(byte b) {
        if (b == 72) {
            return AbstractC2442.m4567(new StringBuilder("INT32 "), b);
        }
        if (b == 127) {
            return AbstractC2442.m4567(new StringBuilder("SYMBOL "), b);
        }
        switch (b) {
            case -111:
                return AbstractC2442.m4567(new StringBuilder("BINARY "), b);
            case -110:
                return AbstractC2442.m4567(new StringBuilder("TYPED_ANY "), b);
            case -109:
                return AbstractC2442.m4567(new StringBuilder("REFERENCE "), b);
            default:
                switch (b) {
                    case -91:
                        return AbstractC2442.m4567(new StringBuilder("OBJECT_END "), b);
                    case -90:
                        return AbstractC2442.m4567(new StringBuilder("OBJECT "), b);
                    case -89:
                        return AbstractC2442.m4567(new StringBuilder("LOCAL_TIME "), b);
                    case -88:
                        return AbstractC2442.m4567(new StringBuilder("LOCAL_DATETIME "), b);
                    case -87:
                        return AbstractC2442.m4567(new StringBuilder("LOCAL_DATE "), b);
                    case -86:
                        return AbstractC2442.m4567(new StringBuilder("TIMESTAMP_WITH_TIMEZONE "), b);
                    case -85:
                        return AbstractC2442.m4567(new StringBuilder("TIMESTAMP_MILLIS "), b);
                    case -84:
                        return AbstractC2442.m4567(new StringBuilder("TIMESTAMP_SECONDS "), b);
                    case -83:
                        return AbstractC2442.m4567(new StringBuilder("TIMESTAMP_MINUTES "), b);
                    case -82:
                        return AbstractC2442.m4567(new StringBuilder("TIMESTAMP "), b);
                    case -81:
                        return AbstractC2442.m4567(new StringBuilder("NULL "), b);
                    case -80:
                        return AbstractC2442.m4567(new StringBuilder("FALSE "), b);
                    case -79:
                        return AbstractC2442.m4567(new StringBuilder("TRUE "), b);
                    case -78:
                    case -77:
                    case -76:
                    case -75:
                        return AbstractC2442.m4567(new StringBuilder("DOUBLE "), b);
                    case -74:
                    case -73:
                        return AbstractC2442.m4567(new StringBuilder("FLOAT "), b);
                    case -72:
                    case -71:
                        return AbstractC2442.m4567(new StringBuilder("DECIMAL "), b);
                    case -70:
                    case -69:
                        return AbstractC2442.m4567(new StringBuilder("BIGINT "), b);
                    case -68:
                        return AbstractC2442.m4567(new StringBuilder("INT16 "), b);
                    case -67:
                        return AbstractC2442.m4567(new StringBuilder("INT8 "), b);
                    case -66:
                    case -65:
                        return AbstractC2442.m4567(new StringBuilder("INT64 "), b);
                    default:
                        switch (b) {
                            case 122:
                                return AbstractC2442.m4567(new StringBuilder("STR_UTF8 "), b);
                            case 123:
                                return AbstractC2442.m4567(new StringBuilder("STR_UTF16 "), b);
                            case 124:
                                return AbstractC2442.m4567(new StringBuilder("STR_UTF16LE "), b);
                            case 125:
                                return AbstractC2442.m4567(new StringBuilder("STR_UTF16BE "), b);
                            default:
                                return (b < -108 || b > -92) ? (b < 73 || b > 121) ? (b < -16 || b > 47) ? (b < 48 || b > 63) ? (b < 64 || b > 71) ? (b < -40 || b > -17) ? (b < -56 || b > -41) ? (b < -64 || b > -57) ? Integer.toString(b) : AbstractC2442.m4567(new StringBuilder("INT64 "), b) : AbstractC2442.m4567(new StringBuilder("INT64 "), b) : AbstractC2442.m4567(new StringBuilder("INT64 "), b) : AbstractC2442.m4567(new StringBuilder("INT32 "), b) : AbstractC2442.m4567(new StringBuilder("INT32 "), b) : AbstractC2442.m4567(new StringBuilder("INT32 "), b) : AbstractC2442.m4567(new StringBuilder("STR_ASCII "), b) : AbstractC2442.m4567(new StringBuilder("ARRAY "), b);
                        }
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    static boolean m6300(int i) {
        return ((i + 56) & 240) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    static boolean m6301(int i) {
        return i >= -40 && i <= -17;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    static boolean m6302(int i) {
        return i >= -16 && i <= 72;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    static boolean m6303(int i) {
        return i >= -16 && i <= 47;
    }
}
