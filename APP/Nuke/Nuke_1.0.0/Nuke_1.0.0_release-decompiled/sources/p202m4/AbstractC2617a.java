package p202m4;

import java.io.EOFException;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p149d3.AbstractC1976d;
import p208n4.C2706e;

/* JADX INFO: renamed from: m4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2617a {

    /* JADX INFO: renamed from: a */
    public static final char[] f8323a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m4567a(String str, int i5, int i6, String str2, int i7) {
        int i8 = (i7 & 1) != 0 ? 0 : i5;
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        int i9 = i6;
        boolean z5 = (i7 & 8) == 0;
        boolean z6 = (i7 & 16) == 0;
        boolean z7 = (i7 & 32) == 0;
        boolean z8 = (i7 & 64) == 0;
        AbstractC1665j.m2985e(str, "<this>");
        return m4568b(str, i8, i9, str2, z5, z6, z7, z8, 128);
    }

    /* JADX INFO: renamed from: b */
    public static String m4568b(String str, int i5, int i6, String str2, boolean z5, boolean z6, boolean z7, boolean z8, int i7) throws EOFException {
        int i8 = (i7 & 1) != 0 ? 0 : i5;
        int length = (i7 & 2) != 0 ? str.length() : i6;
        boolean z9 = (i7 & 8) != 0 ? false : z5;
        boolean z10 = (i7 & 16) != 0 ? false : z6;
        boolean z11 = (i7 & 64) == 0 ? z8 : false;
        AbstractC1665j.m2985e(str, "<this>");
        int iCharCount = i8;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i9 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z11) || AbstractC1976d.m3628V(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z9 || (z10 && !m4569c(iCharCount, length, str)))) || (iCodePointAt == 43 && z7)))) {
                C2706e c2706e = new C2706e();
                c2706e.m4710L(i8, iCharCount, str);
                C2706e c2706e2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z9 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c2706e.m4711M("+");
                        } else if (iCodePointAt2 == 43 && z7) {
                            c2706e.m4711M(z9 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i9 && !z11) || AbstractC1976d.m3628V(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z9 || (z10 && !m4569c(iCharCount, length, str)))))) {
                            if (c2706e2 == null) {
                                c2706e2 = new C2706e();
                            }
                            c2706e2.m4712N(iCodePointAt2);
                            while (!c2706e2.m4720m()) {
                                byte b2 = c2706e2.readByte();
                                c2706e.m4705G(37);
                                char[] cArr = f8323a;
                                c2706e.m4705G(cArr[((b2 & 255) >> 4) & 15]);
                                c2706e.m4705G(cArr[b2 & 15]);
                            }
                        } else {
                            c2706e.m4712N(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i9 = 128;
                }
                return c2706e.m4699A();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i8, length);
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m4569c(int i5, int i6, String str) {
        AbstractC1665j.m2985e(str, "<this>");
        int i7 = i5 + 2;
        return i7 < i6 && str.charAt(i5) == '%' && AbstractC1774e.m3170k(str.charAt(i5 + 1)) != -1 && AbstractC1774e.m3170k(str.charAt(i7)) != -1;
    }

    /* JADX INFO: renamed from: d */
    public static String m4570d(String str, int i5, int i6, int i7) {
        int i8;
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        boolean z5 = (i7 & 4) == 0;
        AbstractC1665j.m2985e(str, "<this>");
        int iCharCount = i5;
        while (iCharCount < i6) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z5)) {
                C2706e c2706e = new C2706e();
                c2706e.m4710L(i5, iCharCount, str);
                while (iCharCount < i6) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i8 = iCharCount + 2) < i6) {
                        int iM3170k = AbstractC1774e.m3170k(str.charAt(iCharCount + 1));
                        int iM3170k2 = AbstractC1774e.m3170k(str.charAt(i8));
                        if (iM3170k == -1 || iM3170k2 == -1) {
                            c2706e.m4712N(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c2706e.m4705G((iM3170k << 4) + iM3170k2);
                            iCharCount = Character.charCount(iCodePointAt) + i8;
                        }
                    } else if (iCodePointAt == 43 && z5) {
                        c2706e.m4705G(32);
                        iCharCount++;
                    } else {
                        c2706e.m4712N(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c2706e.m4699A();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i5, i6);
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
