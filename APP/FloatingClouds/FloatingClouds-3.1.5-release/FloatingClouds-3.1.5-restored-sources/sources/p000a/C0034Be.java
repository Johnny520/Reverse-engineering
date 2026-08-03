package p000a;

/* JADX INFO: renamed from: a.Be */
/* JADX INFO: loaded from: classes.dex */
public class C0034Be extends C0015Ae {
    /* JADX INFO: renamed from: I */
    public static boolean m94I(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C0631i9.m1482e(charSequence, "<this>");
        C0631i9.m1482e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m99N(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m98M(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m95J(String str, char c) {
        C0631i9.m1482e(str, "<this>");
        return m100O(str, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: K */
    public static final int m96K(CharSequence charSequence) {
        C0631i9.m1482e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: L */
    public static final int m97L(CharSequence charSequence, String str, int i, boolean z) {
        C0631i9.m1482e(charSequence, "<this>");
        C0631i9.m1482e(str, "string");
        return (z || !(charSequence instanceof String)) ? m98M(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: M */
    public static final int m98M(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C0536d9 c0536d9;
        if (z2) {
            int iM96K = m96K(charSequence);
            if (i > iM96K) {
                i = iM96K;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c0536d9 = new C0536d9(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c0536d9 = new C0574f9(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c0536d9.f1931c;
        int i4 = c0536d9.f1930b;
        int i5 = c0536d9.f1929a;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!m103R(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!C0015Ae.m46E(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ int m99N(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m97L(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: O */
    public static int m100O(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C0631i9.m1482e(str, "<this>");
        return str.indexOf(c, i);
    }

    /* JADX INFO: renamed from: P */
    public static boolean m101P(CharSequence charSequence) {
        C0631i9.m1482e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public static int m102Q(String str, char c) {
        int iM96K = m96K(str);
        C0631i9.m1482e(str, "<this>");
        return str.lastIndexOf(c, iM96K);
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m103R(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C0631i9.m1482e(charSequence, "<this>");
        C0631i9.m1482e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C0889w1.m2153l(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public static String m104S(String str, String str2) {
        C0631i9.m1482e(str, "<this>");
        if (!C0015Ae.m49H(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        C0631i9.m1481d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: T */
    public static String m105T(String str, char c) {
        C0631i9.m1482e(str, "<this>");
        C0631i9.m1482e(str, "missingDelimiterValue");
        int iM102Q = m102Q(str, c);
        if (iM102Q == -1) {
            return str;
        }
        String strSubstring = str.substring(iM102Q + 1, str.length());
        C0631i9.m1481d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: U */
    public static String m106U(String str, String str2) {
        C0631i9.m1482e(str, "<this>");
        C0631i9.m1482e(str2, "missingDelimiterValue");
        int iM102Q = m102Q(str, '.');
        if (iM102Q == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iM102Q);
        C0631i9.m1481d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: V */
    public static CharSequence m107V(String str) {
        C0631i9.m1482e(str, "<this>");
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
