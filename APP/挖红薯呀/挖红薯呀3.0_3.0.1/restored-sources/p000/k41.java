package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k41 extends r41 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static boolean m1764V(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (m1768Z(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m1766X(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static final int m1765W(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? m1766X(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static final int m1766X(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        x20 x20Var;
        boolean z3;
        boolean zRegionMatches;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            x20Var = new x20(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            x20Var = new z20(i, i2, 1);
        }
        boolean z4 = charSequence instanceof String;
        int i3 = x20Var.f7250f;
        int i4 = x20Var.f7249e;
        int i5 = x20Var.f7248d;
        if (z4 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (true) {
                    String str = (String) charSequence2;
                    String str2 = (String) charSequence;
                    int length3 = str.length();
                    if (z) {
                        z3 = z;
                        zRegionMatches = str.regionMatches(z3, 0, str2, i6, length3);
                    } else {
                        zRegionMatches = str.regionMatches(0, str2, i6, length3);
                        z3 = z;
                    }
                    if (!zRegionMatches) {
                        if (i6 == i4) {
                            break;
                        }
                        i6 += i3;
                        z = z3;
                    } else {
                        return i6;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!m1772d0(charSequence2, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static int m1767Y(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (!p30.m3015y(cArr[0], charSequence.charAt(i), false)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ int m1768Z(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m1765W(charSequence, str, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static boolean m1769a0(String str) {
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            if (!p30.m2978N(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static char m1770b0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static final List m1771c0(String str) {
        oa0 oa0Var = new oa0(str);
        if (!oa0Var.hasNext()) {
            return C0294hs.f2354d;
        }
        Object next = oa0Var.next();
        if (!oa0Var.hasNext()) {
            return o30.m2782v(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (oa0Var.hasNext()) {
            arrayList.add(oa0Var.next());
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static final boolean m1772d0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i >= 0 && charSequence.length() - i2 >= 0 && i <= charSequence2.length() - i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (p30.m3015y(charSequence.charAt(i3), charSequence2.charAt(i + i3), z)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static List m1773e0(String str, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        str.getClass();
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                int iM1765W = m1765W(str, str2, 0, false);
                if (iM1765W == -1 || i2 == 1) {
                    return o30.m2782v(str.toString());
                }
                boolean z = i2 > 0;
                ArrayList arrayList = new ArrayList(z ? i2 : 10);
                int length = 0;
                do {
                    arrayList.add(str.subSequence(length, iM1765W).toString());
                    length = str2.length() + iM1765W;
                    if (z && arrayList.size() == i2 - 1) {
                        break;
                    }
                    iM1765W = m1765W(str, str2, length, false);
                } while (iM1765W != -1);
                arrayList.add(str.subSequence(length, str.length()).toString());
                return arrayList;
            }
        }
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        t01 t01Var = new t01(new C0894wm(str, i2, new C0956ya(i, listAsList)));
        ArrayList arrayList2 = new ArrayList(AbstractC1001ze.m5585E(t01Var));
        Iterator it = t01Var.iterator();
        while (true) {
            C0857vm c0857vm = (C0857vm) it;
            if (!c0857vm.hasNext()) {
                return arrayList2;
            }
            z20 z20Var = (z20) c0857vm.next();
            z20Var.getClass();
            arrayList2.add(str.subSequence(z20Var.f7248d, z20Var.f7249e + 1).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static String m1774f0(String str, String str2) {
        int iM1768Z = m1768Z(str, str2, 0, false, 6);
        return iM1768Z == -1 ? str : str.substring(str2.length() + iM1768Z, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static CharSequence m1775g0(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM2978N = p30.m2978N(str.charAt(!z ? i : length));
            if (z) {
                if (!zM2978N) {
                    break;
                }
                length--;
            } else if (zM2978N) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
