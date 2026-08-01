package p000;

import java.text.BreakIterator;
import java.util.ArrayList;

/* JADX INFO: renamed from: u0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0786u0 extends AbstractC0747t0 {

    /* JADX INFO: renamed from: e */
    public static C0786u0 f6082e;

    /* JADX INFO: renamed from: f */
    public static C0786u0 f6083f;

    /* JADX INFO: renamed from: g */
    public static C0786u0 f6084g;

    /* JADX INFO: renamed from: h */
    public static final wu0 f6085h = wu0.f7191e;

    /* JADX INFO: renamed from: i */
    public static final wu0 f6086i = wu0.f7190d;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f6087c;

    /* JADX INFO: renamed from: d */
    public Object f6088d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [f1.performAction(int, int, android.os.Bundle):boolean] */
    public /* synthetic */ C0786u0(int i) {
        this.f6087c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0747t0
    /* JADX INFO: renamed from: a */
    public final int[] mo4139a(int i) {
        int iM1227a;
        switch (this.f6087c) {
            case 0:
                int length = m4141c().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f6088d;
                    if (breakIterator == null) {
                        p30.m2986V("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.f6088d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            p30.m2986V("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m4140b(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        p30.m2986V("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (m4141c().length() <= 0 || i >= m4141c().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!m4242h(i) && (!m4242h(i) || (i != 0 && m4242h(i - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f6088d;
                    if (breakIterator3 == null) {
                        p30.m2986V("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f6088d;
                if (breakIterator4 == null) {
                    p30.m2986V("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !m4241g(iFollowing2)) {
                    return null;
                }
                return m4140b(i, iFollowing2);
            default:
                if (m4141c().length() <= 0 || i >= m4141c().length()) {
                    return null;
                }
                g71 g71Var = (g71) this.f6088d;
                wu0 wu0Var = f6085h;
                if (i < 0) {
                    if (g71Var == null) {
                        p30.m2986V("layoutResult");
                        throw null;
                    }
                    iM1227a = g71Var.m1227a(0);
                } else {
                    if (g71Var == null) {
                        p30.m2986V("layoutResult");
                        throw null;
                    }
                    int iM1227a2 = g71Var.m1227a(i);
                    iM1227a = m4239e(iM1227a2, wu0Var) == i ? iM1227a2 : iM1227a2 + 1;
                }
                g71 g71Var2 = (g71) this.f6088d;
                if (g71Var2 == null) {
                    p30.m2986V("layoutResult");
                    throw null;
                }
                if (iM1227a >= g71Var2.f1880b.f4259b) {
                    return null;
                }
                return m4140b(m4239e(iM1227a, wu0Var), m4239e(iM1227a, f6086i) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0747t0
    /* JADX INFO: renamed from: d */
    public final int[] mo4142d(int i) {
        int iM1227a;
        switch (this.f6087c) {
            case 0:
                int length = m4141c().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f6088d;
                    if (breakIterator == null) {
                        p30.m2986V("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.f6088d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            p30.m2986V("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m4140b(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        p30.m2986V("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = m4141c().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !m4242h(i - 1) && !m4241g(i)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f6088d;
                    if (breakIterator3 == null) {
                        p30.m2986V("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f6088d;
                if (breakIterator4 == null) {
                    p30.m2986V("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !m4242h(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m4242h(iPreceding2 - 1)) {
                    return m4140b(iPreceding2, i);
                }
                return null;
            default:
                if (m4141c().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = m4141c().length();
                g71 g71Var = (g71) this.f6088d;
                wu0 wu0Var = f6086i;
                if (i > length3) {
                    if (g71Var == null) {
                        p30.m2986V("layoutResult");
                        throw null;
                    }
                    iM1227a = g71Var.m1227a(m4141c().length());
                } else {
                    if (g71Var == null) {
                        p30.m2986V("layoutResult");
                        throw null;
                    }
                    int iM1227a2 = g71Var.m1227a(i);
                    iM1227a = m4239e(iM1227a2, wu0Var) + 1 == i ? iM1227a2 : iM1227a2 - 1;
                }
                if (iM1227a < 0) {
                    return null;
                }
                return m4140b(m4239e(iM1227a, f6085h), m4239e(iM1227a, wu0Var) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public int m4239e(int i, wu0 wu0Var) {
        g71 g71Var = (g71) this.f6088d;
        if (g71Var == null) {
            p30.m2986V("layoutResult");
            throw null;
        }
        int iM1229c = g71Var.m1229c(i);
        g71 g71Var2 = (g71) this.f6088d;
        if (g71Var2 == null) {
            p30.m2986V("layoutResult");
            throw null;
        }
        wu0 wu0VarM1231e = g71Var2.m1231e(iM1229c);
        g71 g71Var3 = (g71) this.f6088d;
        if (wu0Var != wu0VarM1231e) {
            if (g71Var3 != null) {
                return g71Var3.m1229c(i);
            }
            p30.m2986V("layoutResult");
            throw null;
        }
        if (g71Var3 == null) {
            p30.m2986V("layoutResult");
            throw null;
        }
        ng0 ng0Var = g71Var3.f1880b;
        ng0Var.m2703b(i);
        ArrayList arrayList = (ArrayList) ng0Var.f4262e;
        C0951y5 c0951y5 = ((wo0) arrayList.get(w60.m4911r(i, arrayList))).f7159a;
        return (c0951y5.f7540d.m797e(i - r4.f7162d) + r4.f7160b) - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m4240f(String str) {
        switch (this.f6087c) {
            case 0:
                this.f5882a = str;
                BreakIterator breakIterator = (BreakIterator) this.f6088d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    p30.m2986V("impl");
                    throw null;
                }
            default:
                this.f5882a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f6088d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    p30.m2986V("impl");
                    throw null;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public boolean m4241g(int i) {
        if (i <= 0 || !m4242h(i - 1)) {
            return false;
        }
        return i == m4141c().length() || !m4242h(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public boolean m4242h(int i) {
        if (i < 0 || i >= m4141c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m4141c().codePointAt(i));
    }
}
