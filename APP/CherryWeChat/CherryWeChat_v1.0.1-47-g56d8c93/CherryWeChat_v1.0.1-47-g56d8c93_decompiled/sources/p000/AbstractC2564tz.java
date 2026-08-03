package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: tz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2564tz extends AbstractC0085Bz {
    /* JADX INFO: renamed from: L */
    public static boolean m5051L(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m5057R(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m5055P(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static String m5052M(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: N */
    public static final int m5053N(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: O */
    public static final int m5054O(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? m5055P(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: P */
    public static final int m5055P(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C0157Dl c0157Dl;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iM5053N = m5053N(charSequence);
            if (i3 > iM5053N) {
                i3 = iM5053N;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c0157Dl = new C0157Dl(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c0157Dl = new C0286Gl(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = c0157Dl.f434c;
        int i6 = c0157Dl.f433b;
        int i7 = c0157Dl.f432a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!m5062W(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    /* JADX INFO: renamed from: Q */
    public static int m5056Q(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m5058S(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ int m5057R(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5054O(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: S */
    public static final int m5058S(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iM5053N = m5053N(charSequence);
        if (i > iM5053N) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC0148Dc.m274h(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM5053N) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m5059T(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: U */
    public static int m5060U(int i, String str, String str2) {
        int iM5053N = (i & 2) != 0 ? m5053N(str) : 0;
        return str == null ? m5055P(str, str2, iM5053N, 0, false, true) : str.lastIndexOf(str2, iM5053N);
    }

    /* JADX INFO: renamed from: V */
    public static int m5061V(String str, char c) {
        int iM5053N = m5053N(str);
        if (str != null) {
            return str.lastIndexOf(c, iM5053N);
        }
        char[] cArr = {c};
        if (str != null) {
            return str.lastIndexOf(cArr[0], iM5053N);
        }
        int iM5053N2 = m5053N(str);
        if (iM5053N > iM5053N2) {
            iM5053N = iM5053N2;
        }
        while (-1 < iM5053N) {
            if (AbstractC0148Dc.m274h(cArr[0], str.charAt(iM5053N), false)) {
                return iM5053N;
            }
            iM5053N--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: W */
    public static final boolean m5062W(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC0148Dc.m274h(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: X */
    public static final void m5063X(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Limit must be non-negative, but was ").toString());
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final List m5064Y(int i, CharSequence charSequence, String str) {
        m5063X(i);
        int iM5054O = m5054O(charSequence, str, 0, false);
        if (iM5054O == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM5054O).toString());
            length = str.length() + iM5054O;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iM5054O = m5054O(charSequence, str, length, false);
        } while (iM5054O != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static List m5065Z(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m5064Y(i2, charSequence, str);
            }
        }
        m5063X(i2);
        C2107jl c2107jl = new C2107jl(1, new C2499sd(charSequence, i2, new C1082Z7(1, Arrays.asList(strArr)), 0));
        ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(c2107jl, 10));
        Iterator it = c2107jl.iterator();
        while (true) {
            C2456rd c2456rd = (C2456rd) it;
            if (!c2456rd.hasNext()) {
                return arrayList;
            }
            C0286Gl c0286Gl = (C0286Gl) c2456rd.next();
            arrayList.add(charSequence.subSequence(c0286Gl.f432a, c0286Gl.f433b + 1).toString());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static List m5066a0(String str, char[] cArr) {
        int i = 0;
        if (cArr.length == 1) {
            return m5064Y(0, str, String.valueOf(cArr[0]));
        }
        m5063X(0);
        C2107jl c2107jl = new C2107jl(1, new C2499sd(str, i, new C1082Z7(2, cArr), 0));
        ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(c2107jl, 10));
        Iterator it = c2107jl.iterator();
        while (true) {
            C2456rd c2456rd = (C2456rd) it;
            if (!c2456rd.hasNext()) {
                return arrayList;
            }
            C0286Gl c0286Gl = (C0286Gl) c2456rd.next();
            arrayList.add(str.subSequence(c0286Gl.f432a, c0286Gl.f433b + 1).toString());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static String m5067b0(String str, String str2) {
        int iM5057R = m5057R(str, str2, 0, false, 6);
        return iM5057R == -1 ? str : str.substring(str2.length() + iM5057R, str.length());
    }

    /* JADX INFO: renamed from: c0 */
    public static String m5068c0(String str, char c) {
        int iM5061V = m5061V(str, c);
        return iM5061V == -1 ? str : str.substring(iM5061V + 1, str.length());
    }

    /* JADX INFO: renamed from: d0 */
    public static String m5069d0(String str, String str2) {
        int iM5060U = m5060U(6, str, str2);
        return iM5060U == -1 ? str : str.substring(str2.length() + iM5060U, str.length());
    }

    /* JADX INFO: renamed from: e0 */
    public static CharSequence m5070e0(String str) {
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
