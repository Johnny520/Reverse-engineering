package Yue;

import Yue.C5283;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,594:1\n1#2:595\n1183#3,3:596\n1183#3,3:599\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n16#1:596,3\n17#1:599,3\n*E\n"})
public final class C5282 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final String f1386 = "0123456789abcdef";

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final String f1387 = "0123456789ABCDEF";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final int[] f12577;

    static {
        int[] iArr = new int[128];
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            iArr[i2] = -1;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < f1386.length()) {
            iArr[f1386.charAt(i3)] = i4;
            i3++;
            i4++;
        }
        int i5 = 0;
        while (i < f1387.length()) {
            iArr[f1387.charAt(i)] = i5;
            i++;
            i5++;
        }
        f12577 = iArr;
    }

    /* JADX INFO: renamed from: ۥ */
    public static final long m2057(long j, int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j2 = i;
        return (j * j2) + (((long) i2) * (j2 - 1));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m2058(String str, String str2, int i, int i2, String str3) {
        int length = str2.length() + i;
        if (length <= i2 && C7627.m23991(str, i, str2, 0, str2.length(), true)) {
            return length;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(str3);
        sb.append(" \"");
        sb.append(str2);
        sb.append("\" at index ");
        sb.append(i);
        sb.append(", but was ");
        int iM21668 = C7007.m21668(length, i2);
        C5499.m17101(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, iM21668);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        throw new NumberFormatException(sb.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m16183(String str, int i, int i2, int i3, boolean z) {
        int i4 = i2 - i;
        if (z) {
            if (i4 == i3) {
                return;
            }
        } else if (i4 <= i3) {
            return;
        }
        String str2 = z ? "exactly" : "at most";
        C5499.m17101(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was " + strSubstring + " of length " + i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m16184(String str, int i, int i2) {
        if (str.charAt(i) == '\r') {
            int i3 = i + 1;
            return (i3 >= i2 || str.charAt(i3) != '\n') ? i3 : i + 2;
        }
        if (str.charAt(i) == '\n') {
            return i + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i + ", but was " + str.charAt(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m16185(String str, int i) {
        int i2;
        char cCharAt = str.charAt(i);
        if (cCharAt <= 127 && (i2 = f12577[cCharAt]) >= 0) {
            return i2;
        }
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i + ", but was " + str.charAt(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m16186(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i8 = i - 1;
        int i9 = i8 / i2;
        int i10 = (i2 - 1) / i3;
        int i11 = i % i2;
        if (i11 != 0) {
            i2 = i11;
        }
        int i12 = (i10 * i9) + ((i2 - 1) / i3);
        long j = ((long) i9) + (((long) i12) * ((long) i4)) + (((long) ((i8 - i9) - i12)) * ((long) i5)) + (((long) i) * (((long) i6) + 2 + ((long) i7)));
        if (C7007.m21729(new C5458(0, Integer.MAX_VALUE), j)) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) C8064.m26455(C8064.m26408(j))));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m16187() {
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final byte m16188(String str, int i, int i2, C5283 c5283) {
        return (byte) m16204(str, i, i2, c5283, 2);
    }

    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final byte m16189(@InterfaceC6399 String str, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(str, "<this>");
        C5499.m17103(c5283, "format");
        return m16188(str, 0, str.length(), c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ byte m16190(String str, int i, int i2, C5283 c5283, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16188(str, i, i2, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ byte m16191(String str, C5283 c5283, int i, Object obj) {
        if ((i & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16189(str, c5283);
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final byte[] m16192(String str, int i, int i2, C5283 c5283) {
        int iM2058 = i;
        AbstractC2986.f4328.m51(iM2058, i2, str.length());
        if (iM2058 == i2) {
            return new byte[0];
        }
        C5283.C0694 c0694M16225 = c5283.m16225();
        int iM16237 = c0694M16225.m16237();
        int iM16236 = c0694M16225.m16236();
        String strM16233 = c0694M16225.m16233();
        String strM16235 = c0694M16225.m16235();
        String strM16234 = c0694M16225.m16234();
        String strM16238 = c0694M16225.m16238();
        String str2 = strM16234;
        int iM16210 = m16210(i2 - iM2058, iM16237, iM16236, strM16238.length(), strM16234.length(), strM16233.length(), strM16235.length());
        byte[] bArr = new byte[iM16210];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (iM2058 < i2) {
            if (i4 == iM16237) {
                iM2058 = m16184(str, iM2058, i2);
                i4 = 0;
            } else if (i5 == iM16236) {
                iM2058 = m2058(str, strM16238, iM2058, i2, "group separator");
            } else {
                if (i5 != 0) {
                    iM2058 = m2058(str, str2, iM2058, i2, "byte separator");
                }
                i4++;
                i5++;
                int iM20582 = m2058(str, strM16233, iM2058, i2, "byte prefix");
                m16183(str, iM20582, C7007.m21668(iM20582 + 2, i2), 2, true);
                int iM16185 = m16185(str, iM20582) << 4;
                bArr[i3] = (byte) (iM16185 | m16185(str, iM20582 + 1));
                iM2058 = m2058(str, strM16235, iM20582 + 2, i2, "byte suffix");
                i3++;
                str2 = str2;
            }
            i5 = 0;
            i4++;
            i5++;
            int iM205822 = m2058(str, strM16233, iM2058, i2, "byte prefix");
            m16183(str, iM205822, C7007.m21668(iM205822 + 2, i2), 2, true);
            int iM161852 = m16185(str, iM205822) << 4;
            bArr[i3] = (byte) (iM161852 | m16185(str, iM205822 + 1));
            iM2058 = m2058(str, strM16235, iM205822 + 2, i2, "byte suffix");
            i3++;
            str2 = str2;
        }
        if (i3 == iM16210) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
        C5499.m17102(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final byte[] m16193(@InterfaceC6399 String str, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(str, "<this>");
        C5499.m17103(c5283, "format");
        return m16192(str, 0, str.length(), c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m16194(String str, int i, int i2, C5283 c5283, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16192(str, i, i2, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ byte[] m16195(String str, C5283 c5283, int i, Object obj) {
        if ((i & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16193(str, c5283);
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m16196(String str, int i, int i2, C5283 c5283) {
        return (int) m16204(str, i, i2, c5283, 8);
    }

    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int m16197(@InterfaceC6399 String str, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(str, "<this>");
        C5499.m17103(c5283, "format");
        return m16196(str, 0, str.length(), c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ int m16198(String str, int i, int i2, C5283 c5283, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16196(str, i, i2, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m16199(String str, C5283 c5283, int i, Object obj) {
        if ((i & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16197(str, c5283);
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final long m16200(String str, int i, int i2, C5283 c5283) {
        return m16204(str, i, i2, c5283, 16);
    }

    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long m16201(@InterfaceC6399 String str, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(str, "<this>");
        C5499.m17103(c5283, "format");
        return m16200(str, 0, str.length(), c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ long m16202(String str, int i, int i2, C5283 c5283, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16200(str, i, i2, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ long m16203(String str, C5283 c5283, int i, Object obj) {
        if ((i & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16201(str, c5283);
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final long m16204(String str, int i, int i2, C5283 c5283, int i3) {
        AbstractC2986.f4328.m51(i, i2, str.length());
        String strM16250 = c5283.m16226().m16250();
        String strM16252 = c5283.m16226().m16252();
        if (strM16250.length() + strM16252.length() < i2 - i) {
            int iM2058 = m2058(str, strM16250, i, i2, "prefix");
            int length = i2 - strM16252.length();
            m2058(str, strM16252, length, i2, "suffix");
            m16183(str, iM2058, length, i3, false);
            long jM16185 = 0;
            while (iM2058 < length) {
                jM16185 = (jM16185 << 4) | ((long) m16185(str, iM2058));
                iM2058++;
            }
            return jM16185;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected a hexadecimal number with prefix \"");
        sb.append(strM16250);
        sb.append("\" and suffix \"");
        sb.append(strM16252);
        sb.append("\", but was ");
        C5499.m17101(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        throw new NumberFormatException(sb.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ long m16205(String str, int i, int i2, C5283 c5283, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = str.length();
        }
        return m16204(str, i, i2, c5283, i3);
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final short m16206(String str, int i, int i2, C5283 c5283) {
        return (short) m16204(str, i, i2, c5283, 4);
    }

    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final short m16207(@InterfaceC6399 String str, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(str, "<this>");
        C5499.m17103(c5283, "format");
        return m16206(str, 0, str.length(), c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ short m16208(String str, int i, int i2, C5283 c5283, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16206(str, i, i2, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ short m16209(String str, C5283 c5283, int i, Object obj) {
        if ((i & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16207(str, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int m16210(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jM2057;
        int i8;
        int i9;
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j = ((long) i6) + 2 + ((long) i7);
        long jM20572 = m2057(j, i3, i5);
        if (i2 <= i3) {
            jM2057 = m2057(j, i2, i5);
        } else {
            jM2057 = m2057(jM20572, i2 / i3, i4);
            int i10 = i2 % i3;
            if (i10 != 0) {
                jM2057 = jM2057 + ((long) i4) + m2057(j, i10, i5);
            }
        }
        long j2 = i;
        long jM16224 = m16224(j2, jM2057, 1);
        long j3 = j2 - ((jM2057 + 1) * jM16224);
        long jM162242 = m16224(j3, jM20572, i4);
        long j4 = j3 - ((jM20572 + ((long) i4)) * jM162242);
        long jM162243 = m16224(j4, j, i5);
        if (j4 - ((j + ((long) i5)) * jM162243) > 0) {
            i9 = i2;
            i8 = 1;
        } else {
            i8 = 0;
            i9 = i2;
        }
        return (int) ((jM16224 * ((long) i9)) + (jM162242 * ((long) i3)) + jM162243 + ((long) i8));
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String m16211(byte b, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(c5283, "format");
        return m16223(b, c5283, 8);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String m16212(int i, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(c5283, "format");
        return m16223(i, c5283, 32);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String m16213(long j, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(c5283, "format");
        return m16223(j, c5283, 64);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final String m16214(short s, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(c5283, "format");
        return m16223(s, c5283, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[SYNTHETIC] */
    @InterfaceC6399
    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m16215(@InterfaceC6399 byte[] bArr, int i, int i2, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(c5283, "format");
        AbstractC2986.f4328.m51(i, i2, bArr.length);
        if (i == i2) {
            return "";
        }
        String str = c5283.m16227() ? f1387 : f1386;
        C5283.C0694 c0694M16225 = c5283.m16225();
        int iM16237 = c0694M16225.m16237();
        int iM16236 = c0694M16225.m16236();
        String strM16233 = c0694M16225.m16233();
        String strM16235 = c0694M16225.m16235();
        String strM16234 = c0694M16225.m16234();
        String strM16238 = c0694M16225.m16238();
        int iM16186 = m16186(i2 - i, iM16237, iM16236, strM16238.length(), strM16234.length(), strM16233.length(), strM16235.length());
        StringBuilder sb = new StringBuilder(iM16186);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < i2; i5++) {
            byte b = bArr[i5];
            int i6 = b & 255;
            if (i3 == iM16237) {
                sb.append('\n');
                i3 = 0;
            } else {
                if (i4 == iM16236) {
                    sb.append(strM16238);
                }
                if (i4 == 0) {
                    sb.append(strM16234);
                }
                sb.append(strM16233);
                sb.append(str.charAt(i6 >> 4));
                sb.append(str.charAt(b & 15));
                sb.append(strM16235);
                i4++;
                i3++;
            }
            i4 = 0;
            if (i4 == 0) {
            }
            sb.append(strM16233);
            sb.append(str.charAt(i6 >> 4));
            sb.append(str.charAt(b & 15));
            sb.append(strM16235);
            i4++;
            i3++;
        }
        if (iM16186 != sb.length()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.9")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final String m16216(@InterfaceC6399 byte[] bArr, @InterfaceC6399 C5283 c5283) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(c5283, "format");
        return m16215(bArr, 0, bArr.length, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ String m16217(byte b, C5283 c5283, int i, Object obj) {
        if ((i & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16211(b, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ String m16218(int i, C5283 c5283, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16212(i, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ String m16219(long j, C5283 c5283, int i, Object obj) {
        if ((i & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16213(j, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ String m16220(short s, C5283 c5283, int i, Object obj) {
        if ((i & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16214(s, c5283);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ String m16221(byte[] bArr, int i, int i2, C5283 c5283, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16215(bArr, i, i2, c5283);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ String m16222(byte[] bArr, C5283 c5283, int i, Object obj) {
        if ((i & 1) != 0) {
            c5283 = C5283.f12578.m2068();
        }
        return m16216(bArr, c5283);
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final String m16223(long j, C5283 c5283, int i) {
        if ((i & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String str = c5283.m16227() ? f1387 : f1386;
        String strM16250 = c5283.m16226().m16250();
        String strM16252 = c5283.m16226().m16252();
        int length = strM16250.length() + (i >> 2) + strM16252.length();
        boolean zM16251 = c5283.m16226().m16251();
        StringBuilder sb = new StringBuilder(length);
        sb.append(strM16250);
        while (i > 0) {
            i -= 4;
            int i2 = (int) ((j >> i) & 15);
            zM16251 = zM16251 && i2 == 0 && i > 0;
            if (!zM16251) {
                sb.append(str.charAt(i2));
            }
        }
        sb.append(strM16252);
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final long m16224(long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }
}
