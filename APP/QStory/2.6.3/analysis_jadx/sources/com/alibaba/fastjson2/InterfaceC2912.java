package com.alibaba.fastjson2;

import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.util.AbstractC2854;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2912 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    static boolean m6353(int i) {
        return (i & 248) == 64;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    static boolean m6354(int i) {
        return (i & 248) == 192;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    static byte[] m6355(String str) {
        byte[] bArr;
        int length;
        int i = 0;
        if (str == null) {
            return new byte[]{-81};
        }
        if (AbstractC2854.f8918 == 8) {
            char[] cArrM5770 = AbstractC2854.m5770(str);
            int length2 = cArrM5770.length;
            if (length2 <= 47) {
                for (char c : cArrM5770) {
                    if (c <= 127) {
                    }
                }
                byte[] bArr2 = new byte[cArrM5770.length + 1];
                bArr2[0] = (byte) (length2 + 73);
                while (i < length2) {
                    int i2 = i + 1;
                    bArr2[i2] = (byte) cArrM5770[i];
                    i = i2;
                }
                return bArr2;
            }
        } else {
            Function function = AbstractC2854.f8927;
            if (function != null && AbstractC2854.f8926.applyAsInt(str) == 0 && (length = (bArr = (byte[]) function.apply(str)).length) <= 47) {
                byte[] bArr3 = new byte[bArr.length + 1];
                bArr3[0] = (byte) (length + 73);
                System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
                return bArr3;
            }
        }
        C2896 c2896 = new C2896(new C2895(AbstractC2933.f9294));
        try {
            c2896.mo6017(str);
            byte[] bArrCopyOf = Arrays.copyOf(c2896.f9159, c2896.f9169);
            c2896.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                c2896.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    static boolean m6356(int i) {
        return (i & 240) == 48;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static String m6357(byte b) {
        if (b == 72) {
            return AbstractC2442.m4576(new StringBuilder("INT32 "), b);
        }
        if (b == 127) {
            return AbstractC2442.m4576(new StringBuilder("SYMBOL "), b);
        }
        switch (b) {
            case -111:
                return AbstractC2442.m4576(new StringBuilder("BINARY "), b);
            case -110:
                return AbstractC2442.m4576(new StringBuilder("TYPED_ANY "), b);
            case -109:
                return AbstractC2442.m4576(new StringBuilder("REFERENCE "), b);
            default:
                switch (b) {
                    case -91:
                        return AbstractC2442.m4576(new StringBuilder("OBJECT_END "), b);
                    case -90:
                        return AbstractC2442.m4576(new StringBuilder("OBJECT "), b);
                    case -89:
                        return AbstractC2442.m4576(new StringBuilder("LOCAL_TIME "), b);
                    case -88:
                        return AbstractC2442.m4576(new StringBuilder("LOCAL_DATETIME "), b);
                    case -87:
                        return AbstractC2442.m4576(new StringBuilder("LOCAL_DATE "), b);
                    case -86:
                        return AbstractC2442.m4576(new StringBuilder("TIMESTAMP_WITH_TIMEZONE "), b);
                    case -85:
                        return AbstractC2442.m4576(new StringBuilder("TIMESTAMP_MILLIS "), b);
                    case -84:
                        return AbstractC2442.m4576(new StringBuilder("TIMESTAMP_SECONDS "), b);
                    case -83:
                        return AbstractC2442.m4576(new StringBuilder("TIMESTAMP_MINUTES "), b);
                    case -82:
                        return AbstractC2442.m4576(new StringBuilder("TIMESTAMP "), b);
                    case -81:
                        return AbstractC2442.m4576(new StringBuilder("NULL "), b);
                    case -80:
                        return AbstractC2442.m4576(new StringBuilder("FALSE "), b);
                    case -79:
                        return AbstractC2442.m4576(new StringBuilder("TRUE "), b);
                    case -78:
                    case -77:
                    case -76:
                    case -75:
                        return AbstractC2442.m4576(new StringBuilder("DOUBLE "), b);
                    case -74:
                    case -73:
                        return AbstractC2442.m4576(new StringBuilder("FLOAT "), b);
                    case -72:
                    case -71:
                        return AbstractC2442.m4576(new StringBuilder("DECIMAL "), b);
                    case -70:
                    case -69:
                        return AbstractC2442.m4576(new StringBuilder("BIGINT "), b);
                    case -68:
                        return AbstractC2442.m4576(new StringBuilder("INT16 "), b);
                    case -67:
                        return AbstractC2442.m4576(new StringBuilder("INT8 "), b);
                    case -66:
                    case -65:
                        return AbstractC2442.m4576(new StringBuilder("INT64 "), b);
                    default:
                        switch (b) {
                            case 122:
                                return AbstractC2442.m4576(new StringBuilder("STR_UTF8 "), b);
                            case 123:
                                return AbstractC2442.m4576(new StringBuilder("STR_UTF16 "), b);
                            case 124:
                                return AbstractC2442.m4576(new StringBuilder("STR_UTF16LE "), b);
                            case 125:
                                return AbstractC2442.m4576(new StringBuilder("STR_UTF16BE "), b);
                            default:
                                return (b < -108 || b > -92) ? (b < 73 || b > 121) ? (b < -16 || b > 47) ? (b < 48 || b > 63) ? (b < 64 || b > 71) ? (b < -40 || b > -17) ? (b < -56 || b > -41) ? (b < -64 || b > -57) ? Integer.toString(b) : AbstractC2442.m4576(new StringBuilder("INT64 "), b) : AbstractC2442.m4576(new StringBuilder("INT64 "), b) : AbstractC2442.m4576(new StringBuilder("INT64 "), b) : AbstractC2442.m4576(new StringBuilder("INT32 "), b) : AbstractC2442.m4576(new StringBuilder("INT32 "), b) : AbstractC2442.m4576(new StringBuilder("INT32 "), b) : AbstractC2442.m4576(new StringBuilder("STR_ASCII "), b) : AbstractC2442.m4576(new StringBuilder("ARRAY "), b);
                        }
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    static boolean m6358(int i) {
        return ((i + 56) & 240) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    static boolean m6359(int i) {
        return i >= -40 && i <= -17;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    static boolean m6360(int i) {
        return i >= -16 && i <= 72;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    static boolean m6361(int i) {
        return i >= -16 && i <= 47;
    }
}
