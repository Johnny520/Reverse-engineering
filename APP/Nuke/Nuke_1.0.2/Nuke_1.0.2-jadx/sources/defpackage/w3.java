package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends v3 {
    public static w3 l;
    public static w3 m;
    public static w3 n;
    public static final c92 o = c92.i;
    public static final c92 p = c92.h;
    public final /* synthetic */ int j;
    public Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v3
    public final int[] a(int i) {
        int iD;
        switch (this.j) {
            case 0:
                int length = c().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.k;
                    if (breakIterator == null) {
                        t11.S("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.k;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            t11.S("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return b(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        t11.S("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i >= c().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!n(i) && (!n(i) || (i != 0 && n(i - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.k;
                    if (breakIterator3 == null) {
                        t11.S("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.k;
                if (breakIterator4 == null) {
                    t11.S("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !m(iFollowing2)) {
                    return null;
                }
                return b(i, iFollowing2);
            default:
                if (c().length() <= 0 || i >= c().length()) {
                    return null;
                }
                y03 y03Var = (y03) this.k;
                c92 c92Var = o;
                if (i < 0) {
                    if (y03Var == null) {
                        t11.S("layoutResult");
                        throw null;
                    }
                    iD = y03Var.b.d(0);
                } else {
                    if (y03Var == null) {
                        t11.S("layoutResult");
                        throw null;
                    }
                    int iD2 = y03Var.b.d(i);
                    iD = k(iD2, c92Var) == i ? iD2 : iD2 + 1;
                }
                y03 y03Var2 = (y03) this.k;
                if (y03Var2 == null) {
                    t11.S("layoutResult");
                    throw null;
                }
                if (iD >= y03Var2.b.f) {
                    return null;
                }
                return b(k(iD, c92Var), k(iD, p) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v3
    public final int[] i(int i) {
        int iD;
        switch (this.j) {
            case 0:
                int length = c().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.k;
                    if (breakIterator == null) {
                        t11.S("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.k;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            t11.S("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return b(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        t11.S("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !n(i - 1) && !m(i)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.k;
                    if (breakIterator3 == null) {
                        t11.S("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.k;
                if (breakIterator4 == null) {
                    t11.S("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !n(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !n(iPreceding2 - 1)) {
                    return b(iPreceding2, i);
                }
                return null;
            default:
                if (c().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = c().length();
                y03 y03Var = (y03) this.k;
                c92 c92Var = p;
                if (i > length3) {
                    if (y03Var == null) {
                        t11.S("layoutResult");
                        throw null;
                    }
                    iD = y03Var.b.d(c().length());
                } else {
                    if (y03Var == null) {
                        t11.S("layoutResult");
                        throw null;
                    }
                    int iD2 = y03Var.b.d(i);
                    iD = k(iD2, c92Var) + 1 == i ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return b(k(iD, o), k(iD, c92Var) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int k(int i, c92 c92Var) {
        y03 y03Var = (y03) this.k;
        if (y03Var == null) {
            t11.S("layoutResult");
            throw null;
        }
        int iF = y03Var.f(i);
        y03 y03Var2 = (y03) this.k;
        if (y03Var2 == null) {
            t11.S("layoutResult");
            throw null;
        }
        c92 c92VarG = y03Var2.g(iF);
        y03 y03Var3 = (y03) this.k;
        if (c92Var != c92VarG) {
            if (y03Var3 != null) {
                return y03Var3.f(i);
            }
            t11.S("layoutResult");
            throw null;
        }
        if (y03Var3 != null) {
            return y03Var3.b.c(i, false) - 1;
        }
        t11.S("layoutResult");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(String str) {
        switch (this.j) {
            case 0:
                this.h = str;
                BreakIterator breakIterator = (BreakIterator) this.k;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    t11.S("impl");
                    throw null;
                }
            default:
                this.h = str;
                BreakIterator breakIterator2 = (BreakIterator) this.k;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    t11.S("impl");
                    throw null;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean m(int i) {
        if (i <= 0 || !n(i - 1)) {
            return false;
        }
        return i == c().length() || !n(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean n(int i) {
        if (i < 0 || i >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i));
    }
}
