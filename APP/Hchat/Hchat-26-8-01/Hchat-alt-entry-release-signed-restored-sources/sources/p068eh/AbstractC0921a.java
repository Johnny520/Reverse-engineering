package p068eh;

import gg.AbstractC1426v;
import java.io.File;
import java.lang.reflect.Method;
import p080fb.AbstractC1184v0;
import p218og.AbstractC3156t;

/* JADX INFO: renamed from: eh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0921a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m2236A(Method method, boolean z9, String str) {
        return AbstractC3156t.m6740d0(method.getDeclaringClass().getName(), str, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m2237B(int i9) {
        switch (i9) {
            case 1:
                return "Format10t";
            case 2:
                return "Format10x";
            case 3:
                return "Format11n";
            case 4:
                return "Format11x";
            case 5:
                return "Format12x";
            case 6:
                return "Format20bc";
            case 7:
                return "Format20t";
            case 8:
                return "Format21c";
            case 9:
                return "Format21ih";
            case 10:
                return "Format21lh";
            case 11:
                return "Format21s";
            case 12:
                return "Format21t";
            case 13:
                return "Format22b";
            case 14:
                return "Format22c";
            case 15:
                return "Format22cs";
            case 16:
                return "Format22s";
            case 17:
                return "Format22t";
            case 18:
                return "Format22x";
            case 19:
                return "Format23x";
            case 20:
                return "Format30t";
            case 21:
                return "Format31c";
            case 22:
                return "Format31i";
            case 23:
                return "Format31t";
            case 24:
                return "Format32x";
            case 25:
                return "Format35c";
            case 26:
                return "Format35mi";
            case 27:
                return "Format35ms";
            case 28:
                return "Format3rc";
            case 29:
                return "Format3rmi";
            case 30:
                return "Format3rms";
            case 31:
                return "Format45cc";
            case 32:
                return "Format4rcc";
            case 33:
                return "Format51l";
            case 34:
                return "ArrayPayload";
            case 35:
                return "PackedSwitchPayload";
            case 36:
                return "SparseSwitchPayload";
            case 37:
                return "UnresolvedOdexInstruction";
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m2238a(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m2239b(String str) {
        int length = str.length();
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char cCharAt = str.charAt(i9);
            if (!Character.isLetter(cCharAt)) {
                i9++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i9 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i9) + upperCase + str.substring(i9 + 1);
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m2240c(int i9) {
        switch (i9) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 2;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return 4;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return 6;
            case 31:
            case 32:
                return 8;
            case 33:
                return 10;
            case 34:
            case 35:
            case 36:
            case 37:
                return -1;
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m2241d(float f3, int i9, int i10) {
        return (Float.hashCode(f3) + i9) * i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m2242e(int i9, int i10, int i11) {
        return (Integer.hashCode(i9) + i10) * i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m2243f(int i9, int i10, long j3) {
        return (Long.hashCode(j3) + i9) * i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m2244g(int i9, int i10, String str) {
        return (str.hashCode() + i9) * i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m2245h(int i9, int i10, boolean z9) {
        return (Boolean.hashCode(z9) + i9) * i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Class m2246i(Class cls) {
        Class cls2 = AbstractC1426v.m3834a(cls).f4729a;
        cls2.getClass();
        return cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static ClassCastException m2247j(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m2248k(int i9, int i10, String str, String str2, String str3) {
        return str + i9 + str2 + i10 + str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m2249l(int i9, String str) {
        return str + i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m2250m(int i9, String str, String str2) {
        return str + i9 + str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m2251n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m2252o(StringBuilder sb2, float f3, char c10) {
        sb2.append(f3);
        sb2.append(c10);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m2253p(StringBuilder sb2, long j3, String str) {
        sb2.append(j3);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m2254q(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m2255r(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static StringBuilder m2256s(int i9, int i10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i9);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static StringBuilder m2257t(int i9, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i9);
        sb2.append(str2);
        return sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static StringBuilder m2258u(int i9, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i9);
        sb2.append(str4);
        return sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static StringBuilder m2259v(String str, String str2, String str3, long j3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(j3);
        return sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m2260w(String str, String str2, String str3, String str4, Throwable th2) {
        AbstractC1184v0.m3204n(str + str2 + str3 + str4, th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m2261x(String str, String str2, Throwable th2) {
        AbstractC1184v0.m3204n(str + str2, th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static boolean m2262y(String str) {
        return new File(str).isFile();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m2263z(String str, Object obj, boolean z9) {
        return AbstractC3156t.m6740d0(obj.getClass().getName(), str, z9);
    }
}
