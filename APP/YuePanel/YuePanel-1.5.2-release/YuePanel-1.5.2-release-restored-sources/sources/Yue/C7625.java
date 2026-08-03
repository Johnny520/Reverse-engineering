package Yue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,274:1\n265#1,7:275\n265#1,7:282\n265#1,7:289\n265#1,7:296\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n142#1:275,7\n149#1:282,7\n229#1:289,7\n240#1:296,7\n*E\n"})
public class C7625 extends C7624 {
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final <T> T m23906(String str, InterfaceC5124<? super String, ? extends T> interfaceC5124) {
        try {
            if (C7243.f2762.m22055(str)) {
                return interfaceC5124.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final BigDecimal m23907(String str) {
        C5499.m17103(str, "<this>");
        return new BigDecimal(str);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final BigDecimal m23908(String str, MathContext mathContext) {
        C5499.m17103(str, "<this>");
        C5499.m17103(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @InterfaceC7470(version = "1.2")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final BigDecimal m23909(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        try {
            if (C7243.f2762.m22055(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC7470(version = "1.2")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final BigDecimal m23910(@InterfaceC6399 String str, @InterfaceC6399 MathContext mathContext) {
        C5499.m17103(str, "<this>");
        C5499.m17103(mathContext, "mathContext");
        try {
            if (C7243.f2762.m22055(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final BigInteger m23911(String str) {
        C5499.m17103(str, "<this>");
        return new BigInteger(str);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final BigInteger m23912(String str, int i) {
        C5499.m17103(str, "<this>");
        return new BigInteger(str, C3791.m836(i));
    }

    @InterfaceC7470(version = "1.2")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final BigInteger m23913(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m23914(str, 10);
    }

    @InterfaceC7470(version = "1.2")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final BigInteger m23914(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        C3791.m836(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i2 = str.charAt(0) == '-' ? 1 : 0; i2 < length; i2++) {
                if (C3791.m837(str.charAt(i2), i) < 0) {
                    return null;
                }
            }
        } else if (C3791.m837(str.charAt(0), i) < 0) {
            return null;
        }
        return new BigInteger(str, C3791.m836(i));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final boolean m23915(String str) {
        return Boolean.parseBoolean(str);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final byte m23916(String str) {
        C5499.m17103(str, "<this>");
        return Byte.parseByte(str);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final byte m23917(String str, int i) {
        C5499.m17103(str, "<this>");
        return Byte.parseByte(str, C3791.m836(i));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final double m23918(String str) {
        C5499.m17103(str, "<this>");
        return Double.parseDouble(str);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final Double m23919(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        try {
            if (C7243.f2762.m22055(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final float m23920(String str) {
        C5499.m17103(str, "<this>");
        return Float.parseFloat(str);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final Float m23921(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        try {
            if (C7243.f2762.m22055(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final int m23922(String str) {
        C5499.m17103(str, "<this>");
        return Integer.parseInt(str);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final int m23923(String str, int i) {
        C5499.m17103(str, "<this>");
        return Integer.parseInt(str, C3791.m836(i));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final long m23924(String str) {
        C5499.m17103(str, "<this>");
        return Long.parseLong(str);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final long m23925(String str, int i) {
        C5499.m17103(str, "<this>");
        return Long.parseLong(str, C3791.m836(i));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final short m23926(String str) {
        C5499.m17103(str, "<this>");
        return Short.parseShort(str);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final short m23927(String str, int i) {
        C5499.m17103(str, "<this>");
        return Short.parseShort(str, C3791.m836(i));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final String m23928(byte b, int i) {
        String string = Integer.toString(b, C3791.m836(C3791.m836(i)));
        C5499.m17102(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final String m23929(int i, int i2) {
        String string = Integer.toString(i, C3791.m836(i2));
        C5499.m17102(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final String m23930(long j, int i) {
        String string = Long.toString(j, C3791.m836(i));
        C5499.m17102(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final String m23931(short s, int i) {
        String string = Integer.toString(s, C3791.m836(C3791.m836(i)));
        C5499.m17102(string, "toString(this, checkRadix(radix))");
        return string;
    }
}
