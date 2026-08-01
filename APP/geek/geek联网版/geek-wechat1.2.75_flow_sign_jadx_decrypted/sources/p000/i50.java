package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i50 extends h50 {
    /* JADX INFO: renamed from: A */
    public static boolean m1458A(String str, String str2) {
        AbstractC0493mp.m1857g("<this>", str);
        AbstractC0493mp.m1857g("suffix", str2);
        return str.endsWith(str2);
    }

    /* JADX INFO: renamed from: B */
    public static final int m1459B(CharSequence charSequence) {
        AbstractC0493mp.m1857g("<this>", charSequence);
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: C */
    public static final int m1460C(CharSequence charSequence, String str, int i, boolean z) {
        AbstractC0493mp.m1857g("<this>", charSequence);
        AbstractC0493mp.m1857g("string", str);
        return (z || !(charSequence instanceof String)) ? m1461D(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: D */
    public static final int m1461D(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C0382jp c0382jp;
        if (z2) {
            int iM1459B = m1459B(charSequence);
            if (i > iM1459B) {
                i = iM1459B;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c0382jp = new C0382jp(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c0382jp = new C0456lp(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c0382jp.f2739c;
        int i4 = c0382jp.f2738b;
        int i5 = c0382jp.f2737a;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (true) {
                    String str = (String) charSequence2;
                    boolean z4 = z;
                    if (!m1464G(0, i6, str.length(), str, (String) charSequence, z4)) {
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
            while (!m1465H(charSequence2, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ int m1462E(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m1460C(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m1463F(CharSequence charSequence) {
        AbstractC0493mp.m1857g("<this>", charSequence);
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m1464G(int i, int i2, int i3, String str, String str2, boolean z) {
        AbstractC0493mp.m1857g("<this>", str);
        AbstractC0493mp.m1857g("other", str2);
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m1465H(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        char upperCase;
        char upperCase2;
        AbstractC0493mp.m1857g("<this>", charSequence);
        AbstractC0493mp.m1857g("other", charSequence2);
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

    /* JADX INFO: renamed from: I */
    public static String m1466I(String str, String str2, String str3) {
        AbstractC0493mp.m1857g("<this>", str);
        AbstractC0493mp.m1857g("oldValue", str2);
        AbstractC0493mp.m1857g("newValue", str3);
        int iM1460C = m1460C(str, str2, 0, false);
        if (iM1460C < 0) {
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
            sb.append((CharSequence) str, i2, iM1460C);
            sb.append(str3);
            i2 = iM1460C + length;
            if (iM1460C >= str.length()) {
                break;
            }
            iM1460C = m1460C(str, str2, iM1460C + i, false);
        } while (iM1460C > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        AbstractC0493mp.m1856f("toString(...)", string);
        return string;
    }

    /* JADX INFO: renamed from: J */
    public static List m1467J(CharSequence charSequence, String[] strArr) {
        AbstractC0493mp.m1857g("<this>", charSequence);
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                int iM1460C = m1460C(charSequence, str, 0, false);
                if (iM1460C == -1) {
                    return AbstractC0493mp.m1872w(charSequence.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int length = 0;
                do {
                    arrayList.add(charSequence.subSequence(length, iM1460C).toString());
                    length = str.length() + iM1460C;
                    iM1460C = m1460C(charSequence, str, length, false);
                } while (iM1460C != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        List listAsList = Arrays.asList(strArr);
        AbstractC0493mp.m1856f("asList(...)", listAsList);
        t20 t20Var = new t20(new C0297hg(charSequence, new C0633qh(listAsList)));
        ArrayList arrayList2 = new ArrayList(AbstractC0405kb.m1675c0(t20Var));
        Iterator it = t20Var.iterator();
        while (true) {
            C0260gg c0260gg = (C0260gg) it;
            if (!c0260gg.hasNext()) {
                return arrayList2;
            }
            C0456lp c0456lp = (C0456lp) c0260gg.next();
            AbstractC0493mp.m1857g("range", c0456lp);
            arrayList2.add(charSequence.subSequence(c0456lp.f2737a, c0456lp.f2738b + 1).toString());
        }
    }

    /* JADX INFO: renamed from: K */
    public static boolean m1468K(String str, String str2) {
        AbstractC0493mp.m1857g("<this>", str);
        AbstractC0493mp.m1857g("prefix", str2);
        return str.startsWith(str2);
    }

    /* JADX INFO: renamed from: L */
    public static String m1469L(String str, String str2) {
        AbstractC0493mp.m1857g("<this>", str);
        AbstractC0493mp.m1857g("delimiter", str2);
        AbstractC0493mp.m1857g("missingDelimiterValue", str);
        int iM1462E = m1462E(str, str2, 0, false, 6);
        if (iM1462E == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iM1462E, str.length());
        AbstractC0493mp.m1856f("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: M */
    public static String m1470M(String str) {
        int iLastIndexOf = str.lastIndexOf(46, m1459B(str));
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC0493mp.m1856f("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: N */
    public static String m1471N(String str, String str2) {
        AbstractC0493mp.m1857g("delimiter", str2);
        int iM1462E = m1462E(str, str2, 0, false, 6);
        if (iM1462E == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM1462E);
        AbstractC0493mp.m1856f("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: O */
    public static Integer m1472O(String str) {
        boolean z;
        int i;
        int i2;
        AbstractC0493mp.m1857g("<this>", str);
        AbstractC0259gf.m1255p(10);
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

    /* JADX INFO: renamed from: P */
    public static Long m1473P(String str) {
        boolean z;
        AbstractC0259gf.m1255p(10);
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

    /* JADX INFO: renamed from: Q */
    public static CharSequence m1474Q(String str) {
        AbstractC0493mp.m1857g("<this>", str);
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

    /* JADX INFO: renamed from: z */
    public static boolean m1475z(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        AbstractC0493mp.m1857g("<this>", charSequence);
        AbstractC0493mp.m1857g("other", charSequence2);
        if (charSequence2 instanceof String) {
            if (m1462E(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m1461D(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }
}
