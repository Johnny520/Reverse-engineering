package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b50 extends a50 {
    /* JADX INFO: renamed from: B */
    public static boolean m516B(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        AbstractC0346ip.m1503o("<this>", charSequence);
        AbstractC0346ip.m1503o("other", charSequence2);
        if (charSequence2 instanceof String) {
            if (m521G(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m520F(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m517C(String str, String str2) {
        AbstractC0346ip.m1503o("<this>", str);
        AbstractC0346ip.m1503o("suffix", str2);
        return str.endsWith(str2);
    }

    /* JADX INFO: renamed from: D */
    public static final int m518D(CharSequence charSequence) {
        AbstractC0346ip.m1503o("<this>", charSequence);
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: E */
    public static final int m519E(CharSequence charSequence, String str, int i, boolean z) {
        AbstractC0346ip.m1503o("<this>", charSequence);
        AbstractC0346ip.m1503o("string", str);
        return (z || !(charSequence instanceof String)) ? m520F(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: F */
    public static final int m520F(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C0232fp c0232fp;
        if (z2) {
            int iM518D = m518D(charSequence);
            if (i > iM518D) {
                i = iM518D;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c0232fp = new C0232fp(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c0232fp = new C0306hp(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c0232fp.f1990c;
        int i4 = c0232fp.f1989b;
        int i5 = c0232fp.f1988a;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z4 = z;
                    if (!m524J(0, i6, str.length(), str, (String) charSequence, z4)) {
                        if (i6 == i4) {
                            break;
                        }
                        i6 += i3;
                        z = z4;
                    } else {
                        return i6;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!m525K(charSequence2, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ int m521G(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m519E(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m522H(CharSequence charSequence) {
        AbstractC0346ip.m1503o("<this>", charSequence);
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public static int m523I(String str, String str2, int i) {
        int iM518D = (i & 2) != 0 ? m518D(str) : 0;
        AbstractC0346ip.m1503o("<this>", str);
        AbstractC0346ip.m1503o("string", str2);
        return str.lastIndexOf(str2, iM518D);
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m524J(int i, int i2, int i3, String str, String str2, boolean z) {
        AbstractC0346ip.m1503o("<this>", str);
        AbstractC0346ip.m1503o("other", str2);
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m525K(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        char upperCase;
        char upperCase2;
        AbstractC0346ip.m1503o("<this>", charSequence);
        AbstractC0346ip.m1503o("other", charSequence2);
        if (i >= 0 && charSequence.length() - i2 >= 0 && i <= charSequence2.length() - i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char cCharAt = charSequence.charAt(i3);
                char cCharAt2 = charSequence2.charAt(i + i3);
                if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public static String m526L(String str, String str2, String str3) {
        AbstractC0346ip.m1503o("<this>", str);
        AbstractC0346ip.m1503o("oldValue", str2);
        AbstractC0346ip.m1503o("newValue", str3);
        int iM519E = m519E(str, str2, 0, false);
        if (iM519E < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM519E);
            sb.append(str3);
            i2 = iM519E + length;
            if (iM519E >= str.length()) {
                break;
            }
            iM519E = m519E(str, str2, iM519E + i, false);
        } while (iM519E > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        AbstractC0346ip.m1502n("toString(...)", string);
        return string;
    }

    /* JADX INFO: renamed from: M */
    public static List m527M(String str, String[] strArr) {
        AbstractC0346ip.m1503o("<this>", str);
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                int iM519E = m519E(str, str2, 0, false);
                if (iM519E == -1) {
                    return AbstractC0346ip.m1469C(str.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int length = 0;
                do {
                    arrayList.add(str.subSequence(length, iM519E).toString());
                    length = str2.length() + iM519E;
                    iM519E = m519E(str, str2, length, false);
                } while (iM519E != -1);
                arrayList.add(str.subSequence(length, str.length()).toString());
                return arrayList;
            }
        }
        List listAsList = Arrays.asList(strArr);
        AbstractC0346ip.m1502n("asList(...)", listAsList);
        m20 m20Var = new m20(new C0260gg(str, new C0559oh(listAsList)));
        ArrayList arrayList2 = new ArrayList(AbstractC0098cb.m657h0(m20Var));
        Iterator it = m20Var.iterator();
        while (true) {
            C0223fg c0223fg = (C0223fg) it;
            if (!c0223fg.hasNext()) {
                return arrayList2;
            }
            C0306hp c0306hp = (C0306hp) c0223fg.next();
            AbstractC0346ip.m1503o("range", c0306hp);
            arrayList2.add(str.subSequence(c0306hp.f1988a, c0306hp.f1989b + 1).toString());
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m528N(String str, String str2, boolean z) {
        AbstractC0346ip.m1503o("<this>", str);
        AbstractC0346ip.m1503o("prefix", str2);
        return !z ? str.startsWith(str2) : m524J(0, 0, str2.length(), str, str2, z);
    }

    /* JADX INFO: renamed from: O */
    public static String m529O(String str, String str2) {
        AbstractC0346ip.m1503o("<this>", str);
        AbstractC0346ip.m1503o("delimiter", str2);
        AbstractC0346ip.m1503o("missingDelimiterValue", str);
        int iM521G = m521G(str, str2, 0, false, 6);
        if (iM521G == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iM521G, str.length());
        AbstractC0346ip.m1502n("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: P */
    public static String m530P(String str) {
        int iLastIndexOf = str.lastIndexOf(46, m518D(str));
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC0346ip.m1502n("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: Q */
    public static String m531Q(String str, String str2) {
        AbstractC0346ip.m1503o("delimiter", str2);
        int iM521G = m521G(str, str2, 0, false, 6);
        if (iM521G == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM521G);
        AbstractC0346ip.m1502n("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: R */
    public static Integer m532R(String str) {
        boolean z;
        int i;
        int i2;
        AbstractC0346ip.m1503o("<this>", str);
        AbstractC0222ff.m1186h(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if (cCharAt < '0') {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* JADX INFO: renamed from: S */
    public static Long m533S(String str) {
        boolean z;
        AbstractC0222ff.m1186h(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (cCharAt < '0') {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / ((long) 10);
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * ((long) 10);
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    /* JADX INFO: renamed from: T */
    public static CharSequence m534T(String str) {
        AbstractC0346ip.m1503o("<this>", str);
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
