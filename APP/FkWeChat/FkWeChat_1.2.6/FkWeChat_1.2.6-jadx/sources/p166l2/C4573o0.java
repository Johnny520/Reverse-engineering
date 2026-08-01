package p166l2;

import p121i3.C3173c;
import p166l2.C4554j0;

/* JADX INFO: renamed from: l2.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4573o0 {

    /* JADX INFO: renamed from: a */
    public final C4554j0 f13436a;

    /* JADX INFO: renamed from: b */
    public boolean f13437b;

    /* JADX INFO: renamed from: c */
    public boolean f13438c;

    /* JADX INFO: renamed from: e */
    public boolean f13440e;

    /* JADX INFO: renamed from: f */
    public boolean f13441f;

    /* JADX INFO: renamed from: g */
    public boolean f13442g;

    /* JADX INFO: renamed from: h */
    public int f13443h;

    /* JADX INFO: renamed from: i */
    public int f13444i;

    /* JADX INFO: renamed from: j */
    public boolean f13445j;

    /* JADX INFO: renamed from: k */
    public boolean f13446k;

    /* JADX INFO: renamed from: l */
    public int f13447l;

    /* JADX INFO: renamed from: m */
    public boolean f13448m;

    /* JADX INFO: renamed from: n */
    public boolean f13449n;

    /* JADX INFO: renamed from: o */
    public int f13450o;

    /* JADX INFO: renamed from: q */
    public C4591u0 f13452q;

    /* JADX INFO: renamed from: d */
    public C4554j0.e f13439d = C4554j0.e.f13391u;

    /* JADX INFO: renamed from: p */
    public final C4597w0 f13451p = new C4597w0(this);

    public C4573o0(C4554j0 c4554j0) {
        this.f13436a = c4554j0;
    }

    /* JADX INFO: renamed from: A */
    public final int m18078A() {
        return this.f13451p.m13264M0();
    }

    /* JADX INFO: renamed from: B */
    public final void m18079B() {
        this.f13451p.m18415d2();
        C4591u0 c4591u0 = this.f13452q;
        if (c4591u0 != null) {
            c4591u0.m18284c2();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m18080C() {
        this.f13451p.m18428u2(true);
        C4591u0 c4591u0 = this.f13452q;
        if (c4591u0 != null) {
            c4591u0.m18301s2(true);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m18081D() {
        this.f13451p.m18419h2();
    }

    /* JADX INFO: renamed from: E */
    public final void m18082E() {
        this.f13441f = true;
        this.f13442g = true;
    }

    /* JADX INFO: renamed from: F */
    public final void m18083F() {
        this.f13440e = true;
    }

    /* JADX INFO: renamed from: G */
    public final void m18084G() {
        this.f13451p.m18420i2();
    }

    /* JADX INFO: renamed from: H */
    public final void m18085H() {
        C4554j0.e eVarM17937i0 = this.f13436a.m17937i0();
        if (eVarM17937i0 == C4554j0.e.f13389s || eVarM17937i0 == C4554j0.e.f13390t) {
            if (this.f13451p.m18405M1()) {
                m18092O(true);
            } else {
                m18091N(true);
            }
        }
        if (eVarM17937i0 == C4554j0.e.f13390t) {
            C4591u0 c4591u0 = this.f13452q;
            if (c4591u0 == null || !c4591u0.m18276L1()) {
                m18096S(true);
            } else {
                m18097T(true);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m18086I() {
        this.f13452q = null;
        this.f13441f = false;
        this.f13440e = false;
    }

    /* JADX INFO: renamed from: J */
    public final void m18087J(long j10) {
        C4591u0 c4591u0 = this.f13452q;
        if (c4591u0 != null) {
            c4591u0.m18296o2(j10);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m18088K() {
        AbstractC4517a abstractC4517aMo17532l;
        this.f13451p.mo17532l().m17505p();
        C4591u0 c4591u0 = this.f13452q;
        if (c4591u0 == null || (abstractC4517aMo17532l = c4591u0.mo17532l()) == null) {
            return;
        }
        abstractC4517aMo17532l.m17505p();
    }

    /* JADX INFO: renamed from: L */
    public final void m18089L(int i10) {
        int i11 = this.f13447l;
        this.f13447l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            C4554j0 c4554j0M17848B0 = this.f13436a.m17848B0();
            C4573o0 c4573o0M17929f0 = c4554j0M17848B0 != null ? c4554j0M17848B0.m17929f0() : null;
            if (c4573o0M17929f0 != null) {
                int i12 = c4573o0M17929f0.f13447l;
                if (i10 == 0) {
                    c4573o0M17929f0.m18089L(i12 - 1);
                } else {
                    c4573o0M17929f0.m18089L(i12 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m18090M(int i10) {
        int i11 = this.f13450o;
        this.f13450o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            C4554j0 c4554j0M17848B0 = this.f13436a.m17848B0();
            C4573o0 c4573o0M17929f0 = c4554j0M17848B0 != null ? c4554j0M17848B0.m17929f0() : null;
            if (c4573o0M17929f0 != null) {
                int i12 = c4573o0M17929f0.f13450o;
                if (i10 == 0) {
                    c4573o0M17929f0.m18090M(i12 - 1);
                } else {
                    c4573o0M17929f0.m18090M(i12 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m18091N(boolean z10) {
        if (this.f13446k != z10) {
            this.f13446k = z10;
            if (z10 && !this.f13445j) {
                m18089L(this.f13447l + 1);
            } else {
                if (z10 || this.f13445j) {
                    return;
                }
                m18089L(this.f13447l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m18092O(boolean z10) {
        if (this.f13445j != z10) {
            this.f13445j = z10;
            if (z10 && !this.f13446k) {
                m18089L(this.f13447l + 1);
            } else {
                if (z10 || this.f13446k) {
                    return;
                }
                m18089L(this.f13447l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m18093P(boolean z10) {
        this.f13437b = z10;
    }

    /* JADX INFO: renamed from: Q */
    public final void m18094Q(boolean z10) {
        this.f13438c = z10;
    }

    /* JADX INFO: renamed from: R */
    public final void m18095R(C4554j0.e eVar) {
        this.f13439d = eVar;
    }

    /* JADX INFO: renamed from: S */
    public final void m18096S(boolean z10) {
        if (this.f13449n != z10) {
            this.f13449n = z10;
            if (z10 && !this.f13448m) {
                m18090M(this.f13450o + 1);
            } else {
                if (z10 || this.f13448m) {
                    return;
                }
                m18090M(this.f13450o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m18097T(boolean z10) {
        if (this.f13448m != z10) {
            this.f13448m = z10;
            if (z10 && !this.f13449n) {
                m18090M(this.f13450o + 1);
            } else {
                if (z10 || this.f13449n) {
                    return;
                }
                m18090M(this.f13450o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m18098U(boolean z10) {
        this.f13441f = z10;
    }

    /* JADX INFO: renamed from: V */
    public final void m18099V(boolean z10) {
        this.f13442g = z10;
    }

    /* JADX INFO: renamed from: W */
    public final void m18100W(boolean z10) {
        this.f13440e = z10;
    }

    /* JADX INFO: renamed from: X */
    public final void m18101X(int i10) {
        this.f13443h = i10;
    }

    /* JADX INFO: renamed from: Y */
    public final void m18102Y(int i10) {
        this.f13444i = i10;
    }

    /* JADX INFO: renamed from: Z */
    public final void m18103Z() {
        C4554j0 c4554j0M17848B0;
        if (this.f13451p.m18401A2() && (c4554j0M17848B0 = this.f13436a.m17848B0()) != null) {
            C4554j0.m17835J1(c4554j0M17848B0, false, false, false, 7, null);
        }
        C4591u0 c4591u0 = this.f13452q;
        if (c4591u0 == null || !c4591u0.m18274B2()) {
            return;
        }
        boolean zM18141a = AbstractC4576p0.m18141a(this.f13436a);
        C4554j0 c4554j0 = this.f13436a;
        if (zM18141a) {
            C4554j0 c4554j0M17848B02 = c4554j0.m17848B0();
            if (c4554j0M17848B02 != null) {
                C4554j0.m17835J1(c4554j0M17848B02, false, false, false, 7, null);
                return;
            }
            return;
        }
        C4554j0 c4554j0M17848B03 = c4554j0.m17848B0();
        if (c4554j0M17848B03 != null) {
            C4554j0.m17831F1(c4554j0M17848B03, false, false, false, 7, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18104a() {
        if (this.f13452q == null) {
            this.f13452q = new C4591u0(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4521b m18105b() {
        return this.f13451p;
    }

    /* JADX INFO: renamed from: c */
    public final int m18106c() {
        return this.f13447l;
    }

    /* JADX INFO: renamed from: d */
    public final int m18107d() {
        return this.f13450o;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18108e() {
        return this.f13446k;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18109f() {
        return this.f13445j;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m18110g() {
        return this.f13437b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18111h() {
        return this.f13438c;
    }

    /* JADX INFO: renamed from: i */
    public final int m18112i() {
        return this.f13451p.m13259G0();
    }

    /* JADX INFO: renamed from: j */
    public final C3173c m18113j() {
        return this.f13451p.m18404L1();
    }

    /* JADX INFO: renamed from: k */
    public final C3173c m18114k() {
        C4591u0 c4591u0 = this.f13452q;
        if (c4591u0 != null) {
            return c4591u0.m18275H1();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final C4554j0 m18115l() {
        return this.f13436a;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m18116m() {
        return this.f13451p.m18406N1();
    }

    /* JADX INFO: renamed from: n */
    public final C4554j0.e m18117n() {
        return this.f13439d;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC4521b m18118o() {
        return this.f13452q;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m18119p() {
        return this.f13449n;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18120q() {
        return this.f13448m;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m18121r() {
        return this.f13441f;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m18122s() {
        return this.f13442g;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18123t() {
        return this.f13440e;
    }

    /* JADX INFO: renamed from: u */
    public final C4591u0 m18124u() {
        return this.f13452q;
    }

    /* JADX INFO: renamed from: v */
    public final C4597w0 m18125v() {
        return this.f13451p;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m18126w() {
        return this.f13451p.m18409R1();
    }

    /* JADX INFO: renamed from: x */
    public final int m18127x() {
        return this.f13443h;
    }

    /* JADX INFO: renamed from: y */
    public final int m18128y() {
        return this.f13444i;
    }

    /* JADX INFO: renamed from: z */
    public final AbstractC4539f1 m18129z() {
        return this.f13436a.m17965v0().m17600n();
    }
}
