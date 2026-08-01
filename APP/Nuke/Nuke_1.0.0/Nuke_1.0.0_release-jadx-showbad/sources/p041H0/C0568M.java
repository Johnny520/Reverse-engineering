package p041H0;

import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: H0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0568M {

    /* JADX INFO: renamed from: a */
    public final C0564I f1745a;

    /* JADX INFO: renamed from: b */
    public boolean f1746b;

    /* JADX INFO: renamed from: c */
    public boolean f1747c;

    /* JADX INFO: renamed from: e */
    public boolean f1749e;

    /* JADX INFO: renamed from: f */
    public boolean f1750f;

    /* JADX INFO: renamed from: g */
    public boolean f1751g;

    /* JADX INFO: renamed from: h */
    public int f1752h;

    /* JADX INFO: renamed from: i */
    public int f1753i;

    /* JADX INFO: renamed from: j */
    public boolean f1754j;

    /* JADX INFO: renamed from: k */
    public boolean f1755k;

    /* JADX INFO: renamed from: l */
    public int f1756l;

    /* JADX INFO: renamed from: m */
    public boolean f1757m;

    /* JADX INFO: renamed from: n */
    public boolean f1758n;

    /* JADX INFO: renamed from: o */
    public int f1759o;

    /* JADX INFO: renamed from: q */
    public C0576V f1761q;

    /* JADX INFO: renamed from: d */
    public EnumC0557E f1748d = EnumC0557E.f1676h;

    /* JADX INFO: renamed from: p */
    public final C0580Z f1760p = new C0580Z(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0568M(C0564I c0564i) {
        this.f1745a = c0564i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractC0596h0 m867a() {
        return this.f1745a.f1699J.f1894d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m868b() {
        EnumC0557E enumC0557E = this.f1745a.f1700K.f1748d;
        EnumC0557E enumC0557E2 = EnumC0557E.f1674f;
        EnumC0557E enumC0557E3 = EnumC0557E.f1675g;
        if (enumC0557E == enumC0557E2 || enumC0557E == enumC0557E3) {
            if (this.f1760p.f1835C) {
                m873g(true);
            } else {
                m872f(true);
            }
        }
        if (enumC0557E == enumC0557E3) {
            C0576V c0576v = this.f1761q;
            if (c0576v == null || !c0576v.f1815w) {
                m874h(true);
            } else {
                m875i(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m869c(long j5) {
        C0576V c0576v = this.f1761q;
        if (c0576v != null) {
            C0568M c0568m = c0576v.f1801i;
            c0568m.f1748d = EnumC0557E.f1673e;
            C0580Z c0580z = c0568m.f1760p;
            C0564I c0564i = c0568m.f1745a;
            c0568m.f1749e = false;
            c0576v.f1797A = j5;
            C0618s0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getSnapshotObserver();
            C0575U c0575u = c0576v.f1798B;
            snapshotObserver.f1972a.m3867c(c0564i, snapshotObserver.f1973b, c0575u);
            c0568m.f1750f = true;
            c0568m.f1751g = true;
            if (AbstractC0601k.m1039o(c0564i)) {
                c0580z.f1861x = true;
                c0580z.f1862y = true;
            } else {
                c0580z.f1860w = true;
            }
            c0568m.f1748d = EnumC0557E.f1676h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m870d(int i5) {
        int i6 = this.f1756l;
        this.f1756l = i5;
        if ((i6 == 0) != (i5 == 0)) {
            C0564I c0564iM839u = this.f1745a.m839u();
            C0568M c0568m = c0564iM839u != null ? c0564iM839u.f1700K : null;
            if (c0568m != null) {
                if (i5 == 0) {
                    c0568m.m870d(c0568m.f1756l - 1);
                } else {
                    c0568m.m870d(c0568m.f1756l + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m871e(int i5) {
        int i6 = this.f1759o;
        this.f1759o = i5;
        if ((i6 == 0) != (i5 == 0)) {
            C0564I c0564iM839u = this.f1745a.m839u();
            C0568M c0568m = c0564iM839u != null ? c0564iM839u.f1700K : null;
            if (c0568m != null) {
                if (i5 == 0) {
                    c0568m.m871e(c0568m.f1759o - 1);
                } else {
                    c0568m.m871e(c0568m.f1759o + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m872f(boolean z5) {
        if (this.f1755k != z5) {
            this.f1755k = z5;
            if (z5 && !this.f1754j) {
                m870d(this.f1756l + 1);
            } else {
                if (z5 || this.f1754j) {
                    return;
                }
                m870d(this.f1756l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m873g(boolean z5) {
        if (this.f1754j != z5) {
            this.f1754j = z5;
            if (z5 && !this.f1755k) {
                m870d(this.f1756l + 1);
            } else {
                if (z5 || this.f1755k) {
                    return;
                }
                m870d(this.f1756l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m874h(boolean z5) {
        if (this.f1758n != z5) {
            this.f1758n = z5;
            if (z5 && !this.f1757m) {
                m871e(this.f1759o + 1);
            } else {
                if (z5 || this.f1757m) {
                    return;
                }
                m871e(this.f1759o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m875i(boolean z5) {
        if (this.f1757m != z5) {
            this.f1757m = z5;
            if (z5 && !this.f1758n) {
                m871e(this.f1759o + 1);
            } else {
                if (z5 || this.f1758n) {
                    return;
                }
                m871e(this.f1759o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m876j() {
        C0580Z c0580z = this.f1760p;
        C0568M c0568m = c0580z.f1846i;
        Object obj = c0580z.f1857t;
        C0564I c0564i = this.f1745a;
        if ((obj != null || c0568m.m867a().mo650l() != null) && c0580z.f1856s) {
            c0580z.f1856s = false;
            c0580z.f1857t = c0568m.m867a().mo650l();
            C0564I c0564iM839u = c0564i.m839u();
            if (c0564iM839u != null) {
                C0564I.m790V(c0564iM839u, false, 7);
            }
        }
        C0576V c0576v = this.f1761q;
        if (c0576v != null) {
            C0568M c0568m2 = c0576v.f1801i;
            if (c0576v.f1818z == null) {
                AbstractC0573S abstractC0573SMo979P0 = c0568m2.m867a().mo979P0();
                AbstractC1665j.m2982b(abstractC0573SMo979P0);
                if (abstractC0573SMo979P0.f1785r.mo650l() == null) {
                    return;
                }
            }
            if (c0576v.f1817y) {
                c0576v.f1817y = false;
                AbstractC0573S abstractC0573SMo979P02 = c0568m2.m867a().mo979P0();
                AbstractC1665j.m2982b(abstractC0573SMo979P02);
                c0576v.f1818z = abstractC0573SMo979P02.f1785r.mo650l();
                if (AbstractC0601k.m1039o(c0564i)) {
                    C0564I c0564iM839u2 = c0564i.m839u();
                    if (c0564iM839u2 != null) {
                        C0564I.m790V(c0564iM839u2, false, 7);
                        return;
                    }
                    return;
                }
                C0564I c0564iM839u3 = c0564i.m839u();
                if (c0564iM839u3 != null) {
                    C0564I.m789T(c0564iM839u3, false, 7);
                }
            }
        }
    }
}
