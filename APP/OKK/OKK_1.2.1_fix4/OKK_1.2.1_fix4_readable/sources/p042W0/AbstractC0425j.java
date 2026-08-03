package p042W0;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0183n;
import p009E0.C0170a;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p036T0.C0338a;
import p036T0.C0340c;
import p037U.AbstractC0358S;
import p040V0.C0403f;
import p040V0.C0409l;

/* JADX INFO: renamed from: W0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0425j extends AbstractC0433r {
    /* JADX INFO: renamed from: J0 */
    public static boolean m1005J0(CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        AbstractC0307g.m703e(charSequence, "<this>");
        AbstractC0307g.m703e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m1011P0(charSequence, (String) charSequence2, 0, z2, 2) < 0) {
                return false;
            }
        } else if (m1009N0(charSequence, charSequence2, 0, charSequence.length(), z2, false) < 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: K0 */
    public static boolean m1006K0(CharSequence charSequence, char c) {
        AbstractC0307g.m703e(charSequence, "<this>");
        return m1010O0(charSequence, c, 0, false, 2) >= 0;
    }

    /* JADX INFO: renamed from: L0 */
    public static final int m1007L0(CharSequence charSequence) {
        AbstractC0307g.m703e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: M0 */
    public static final int m1008M0(CharSequence charSequence, String str, int i2, boolean z2) {
        AbstractC0307g.m703e(charSequence, "<this>");
        AbstractC0307g.m703e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? m1009N0(charSequence, str, i2, charSequence.length(), z2, false) : ((String) charSequence).indexOf(str, i2);
    }

    /* JADX INFO: renamed from: N0 */
    public static final int m1009N0(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3) {
        C0338a c0338a;
        if (z3) {
            int iM1007L0 = m1007L0(charSequence);
            if (i2 > iM1007L0) {
                i2 = iM1007L0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            c0338a = new C0338a(i2, i3, -1);
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            c0338a = new C0340c(i2, i3, 1);
        }
        boolean z4 = charSequence instanceof String;
        int i4 = c0338a.f659c;
        int i5 = c0338a.f658b;
        int i6 = c0338a.f657a;
        if (z4 && (charSequence2 instanceof String)) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!AbstractC0433r.m1030E0(0, i6, ((String) charSequence2).length(), (String) charSequence2, (String) charSequence, z2)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
        } else if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            while (!m1015T0(charSequence2, 0, charSequence, i6, charSequence2.length(), z2)) {
                if (i6 != i5) {
                    i6 += i4;
                }
            }
            return i6;
        }
        return -1;
    }

    /* JADX INFO: renamed from: O0 */
    public static int m1010O0(CharSequence charSequence, char c, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        AbstractC0307g.m703e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? m1012Q0(charSequence, new char[]{c}, i2, z2) : ((String) charSequence).indexOf(c, i2);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ int m1011P0(CharSequence charSequence, String str, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return m1008M0(charSequence, str, i2, z2);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final int m1012Q0(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        AbstractC0307g.m703e(charSequence, "<this>");
        AbstractC0307g.m703e(cArr, "chars");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int iM1007L0 = m1007L0(charSequence);
        if (i2 > iM1007L0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i2);
            for (char c : cArr) {
                if (AbstractC0358S.m902p(c, cCharAt, z2)) {
                    return i2;
                }
            }
            if (i2 == iM1007L0) {
                return -1;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static boolean m1013R0(CharSequence charSequence) {
        AbstractC0307g.m703e(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!AbstractC0358S.m860J(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public static C0403f m1014S0(CharSequence charSequence) {
        m1018W0(0);
        return new C0403f(new C0418c(charSequence, 0, 0, new C0434s(AbstractC0179j.m530g0(new String[]{"\r\n", "\n", "\r"}), false, 1)), new C0170a(2, charSequence));
    }

    /* JADX INFO: renamed from: T0 */
    public static final boolean m1015T0(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z2) {
        AbstractC0307g.m703e(charSequence, "<this>");
        AbstractC0307g.m703e(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!AbstractC0358S.m902p(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: U0 */
    public static String m1016U0(String str, String str2) {
        AbstractC0307g.m703e(str, "<this>");
        AbstractC0307g.m703e(str2, "prefix");
        if (!AbstractC0433r.m1033H0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC0307g.m702d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: V0 */
    public static String m1017V0(String str, String str2) {
        if (!AbstractC0433r.m1028C0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        AbstractC0307g.m702d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: W0 */
    public static final void m1018W0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0324d.m720c("Limit must be non-negative, but was ", i2).toString());
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static List m1019X0(String str, char[] cArr) {
        boolean z2 = false;
        if (cArr.length != 1) {
            m1018W0(0);
            C0418c<C0340c> c0418c = new C0418c(str, 0, 0, new C0434s(cArr, z2, 0));
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(new C0409l(c0418c), 10));
            for (C0340c c0340c : c0418c) {
                AbstractC0307g.m703e(c0340c, "range");
                arrayList.add(str.subSequence(c0340c.f657a, c0340c.f658b + 1).toString());
            }
            return arrayList;
        }
        String strValueOf = String.valueOf(cArr[0]);
        m1018W0(0);
        int iM1008M0 = m1008M0(str, strValueOf, 0, false);
        if (iM1008M0 == -1) {
            return AbstractC0040p.m82F(str.toString());
        }
        ArrayList arrayList2 = new ArrayList(10);
        int length = 0;
        do {
            arrayList2.add(str.subSequence(length, iM1008M0).toString());
            length = strValueOf.length() + iM1008M0;
            iM1008M0 = m1008M0(str, strValueOf, length, false);
        } while (iM1008M0 != -1);
        arrayList2.add(str.subSequence(length, str.length()).toString());
        return arrayList2;
    }

    /* JADX INFO: renamed from: Y0 */
    public static String m1020Y0(String str) {
        AbstractC0307g.m703e(str, "<this>");
        AbstractC0307g.m703e(str, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, m1007L0(str));
        if (iLastIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC0307g.m702d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: Z0 */
    public static String m1021Z0(String str, int i2) {
        AbstractC0307g.m703e(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String strSubstring = str.substring(0, i2);
        AbstractC0307g.m702d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: a1 */
    public static CharSequence m1022a1(CharSequence charSequence) {
        AbstractC0307g.m703e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zM860J = AbstractC0358S.m860J(charSequence.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zM860J) {
                    break;
                }
                length--;
            } else if (zM860J) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* JADX INFO: renamed from: b1 */
    public static CharSequence m1023b1(CharSequence charSequence) {
        AbstractC0307g.m703e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!AbstractC0358S.m860J(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return "";
    }
}
