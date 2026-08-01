package p166l2;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p120i2.AbstractC3167a;
import p121i3.C3173c;
import p166l2.C4554j0;
import p166l2.InterfaceC4580q1;
import p166l2.InterfaceC4607z1;
import p215oc.C5729x;
import p349y0.C9508c;

/* JADX INFO: renamed from: l2.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4594v0 {

    /* JADX INFO: renamed from: a */
    public final C4554j0 f13557a;

    /* JADX INFO: renamed from: b */
    public final C4575p f13558b;

    /* JADX INFO: renamed from: c */
    public boolean f13559c;

    /* JADX INFO: renamed from: d */
    public boolean f13560d;

    /* JADX INFO: renamed from: e */
    public final C4571n1 f13561e;

    /* JADX INFO: renamed from: f */
    public final C9508c f13562f;

    /* JADX INFO: renamed from: g */
    public long f13563g;

    /* JADX INFO: renamed from: h */
    public final C9508c f13564h;

    /* JADX INFO: renamed from: i */
    public C3173c f13565i;

    /* JADX INFO: renamed from: j */
    public final C4579q0 f13566j;

    /* JADX INFO: renamed from: l2.v0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C4554j0 f13567a;

        /* JADX INFO: renamed from: b */
        public final boolean f13568b;

        /* JADX INFO: renamed from: c */
        public final boolean f13569c;

        public a(C4554j0 c4554j0, boolean z10, boolean z11) {
            this.f13567a = c4554j0;
            this.f13568b = z10;
            this.f13569c = z11;
        }

        /* JADX INFO: renamed from: a */
        public final C4554j0 m18355a() {
            return this.f13567a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m18356b() {
            return this.f13569c;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m18357c() {
            return this.f13568b;
        }
    }

    /* JADX INFO: renamed from: l2.v0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13570a;

        static {
            int[] iArr = new int[C4554j0.e.values().length];
            try {
                iArr[C4554j0.e.f13388r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C4554j0.e.f13387q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C4554j0.e.f13390t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C4554j0.e.f13389s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C4554j0.e.f13391u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13570a = iArr;
        }
    }

    public C4594v0(C4554j0 c4554j0) {
        this.f13557a = c4554j0;
        InterfaceC4580q1.a aVar = InterfaceC4580q1.f13460k;
        C4575p c4575p = new C4575p(aVar.m18189a());
        this.f13558b = c4575p;
        this.f13561e = new C4571n1();
        this.f13562f = new C9508c(new InterfaceC4580q1.b[16], 0);
        this.f13563g = 1L;
        C9508c c9508c = new C9508c(new a[16], 0);
        this.f13564h = c9508c;
        this.f13566j = aVar.m18189a() ? new C4579q0(c4554j0, c4575p, c9508c.m37034g()) : null;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ boolean m18317J(C4594v0 c4594v0, C4554j0 c4554j0, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c4594v0.m18330I(c4554j0, z10);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m18321f(C4594v0 c4594v0, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c4594v0.m18334e(z10);
    }

    /* JADX INFO: renamed from: A */
    public final void m18322A(C4554j0 c4554j0, boolean z10) {
        if (m18353y(c4554j0, z10)) {
            m18323B(c4554j0, z10, false);
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m18323B(C4554j0 c4554j0, boolean z10, boolean z11) {
        C3173c c3173c;
        boolean zM18335g;
        C4554j0 c4554j0M17848B0;
        if (c4554j0.mo13085p()) {
            return false;
        }
        if (!c4554j0.mo13086t() && !c4554j0.m17902W0() && !m18342n(c4554j0) && !AbstractC1061t.m3842c(c4554j0.m17905X0(), Boolean.TRUE) && !m18341m(c4554j0) && !c4554j0.m17867K()) {
            return false;
        }
        if (c4554j0 == this.f13557a) {
            c3173c = this.f13565i;
            c3173c.getClass();
        } else {
            c3173c = null;
        }
        if (z10) {
            zM18335g = c4554j0.m17941k0() ? m18335g(c4554j0, c3173c) : false;
            if (z11 && ((zM18335g || c4554j0.m17939j0()) && AbstractC1061t.m3842c(c4554j0.m17905X0(), Boolean.TRUE))) {
                c4554j0.m17917b1();
            }
        } else {
            boolean zM18336h = c4554j0.m17952p0() ? m18336h(c4554j0, c3173c) : false;
            if (z11 && c4554j0.m17934h0() && (c4554j0 == this.f13557a || ((c4554j0M17848B0 = c4554j0.m17848B0()) != null && c4554j0M17848B0.mo13086t() && c4554j0.m17902W0()))) {
                if (c4554j0 == this.f13557a) {
                    c4554j0.m17964u1(0, 0);
                } else {
                    c4554j0.m17846A1();
                }
                this.f13561e.m18072d(c4554j0);
                C4579q0 c4579q0 = this.f13566j;
                if (c4579q0 != null) {
                    c4579q0.m18155a();
                }
            }
            zM18335g = zM18336h;
        }
        m18337i();
        return zM18335g;
    }

    /* JADX INFO: renamed from: C */
    public final void m18324C(C4554j0 c4554j0) {
        C9508c c9508cM17866J0 = c4554j0.m17866J0();
        Object[] objArr = c9508cM17866J0.f32299q;
        int iM37039l = c9508cM17866J0.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            C4554j0 c4554j02 = (C4554j0) objArr[i10];
            if (m18349u(c4554j02)) {
                if (AbstractC4576p0.m18141a(c4554j02)) {
                    m18325D(c4554j02, true);
                } else {
                    m18324C(c4554j02);
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m18325D(C4554j0 c4554j0, boolean z10) {
        C3173c c3173c;
        if (c4554j0.mo13085p()) {
            return;
        }
        if (c4554j0 == this.f13557a) {
            c3173c = this.f13565i;
            c3173c.getClass();
        } else {
            c3173c = null;
        }
        if (z10) {
            m18335g(c4554j0, c3173c);
        } else {
            m18336h(c4554j0, c3173c);
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m18326E(C4554j0 c4554j0, boolean z10) {
        int i10 = b.f13570a[c4554j0.m17937i0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        C5729x.m23182a();
                        return false;
                    }
                }
            }
            if ((c4554j0.m17941k0() || c4554j0.m17939j0()) && !z10) {
                C4579q0 c4579q0 = this.f13566j;
                if (c4579q0 != null) {
                    c4579q0.m18155a();
                }
                return false;
            }
            c4554j0.m17924d1();
            c4554j0.m17921c1();
            if (c4554j0.mo13085p()) {
                return false;
            }
            C4554j0 c4554j0M17848B0 = c4554j0.m17848B0();
            if (AbstractC1061t.m3842c(c4554j0.m17905X0(), Boolean.TRUE) && ((c4554j0M17848B0 == null || !c4554j0M17848B0.m17941k0()) && (c4554j0M17848B0 == null || !c4554j0M17848B0.m17939j0()))) {
                this.f13558b.m18134d(c4554j0, EnumC4522b0.f13185r);
            } else if (c4554j0.mo13086t() && ((c4554j0M17848B0 == null || !c4554j0M17848B0.m17934h0()) && (c4554j0M17848B0 == null || !c4554j0M17848B0.m17952p0()))) {
                this.f13558b.m18134d(c4554j0, EnumC4522b0.f13187t);
            }
            return !this.f13560d;
        }
        C4579q0 c4579q02 = this.f13566j;
        if (c4579q02 != null) {
            c4579q02.m18155a();
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m18327F(C4554j0 c4554j0, boolean z10) {
        C4554j0 c4554j0M17848B0;
        C4554j0 c4554j0M17848B02;
        if (!(c4554j0.m17946m0() != null)) {
            AbstractC3167a.m11956b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = b.f13570a[c4554j0.m17937i0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    C5729x.m23182a();
                    return false;
                }
                if (c4554j0.m17941k0() && !z10) {
                    return false;
                }
                c4554j0.m17927e1();
                c4554j0.m17930f1();
                if (c4554j0.mo13085p()) {
                    return false;
                }
                if ((AbstractC1061t.m3842c(c4554j0.m17905X0(), Boolean.TRUE) || m18341m(c4554j0)) && ((c4554j0M17848B0 = c4554j0.m17848B0()) == null || !c4554j0M17848B0.m17941k0())) {
                    this.f13558b.m18134d(c4554j0, EnumC4522b0.f13184q);
                } else if ((c4554j0.mo13086t() || m18342n(c4554j0)) && ((c4554j0M17848B02 = c4554j0.m17848B0()) == null || !c4554j0M17848B02.m17952p0())) {
                    this.f13558b.m18134d(c4554j0, EnumC4522b0.f13186s);
                }
                return !this.f13560d;
            }
            this.f13564h.m37029b(new a(c4554j0, true, z10));
            C4579q0 c4579q0 = this.f13566j;
            if (c4579q0 != null) {
                c4579q0.m18155a();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final void m18328G(C4554j0 c4554j0) {
        this.f13561e.m18072d(c4554j0);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m18329H(C4554j0 c4554j0, boolean z10) {
        int i10 = b.f13570a[c4554j0.m17937i0().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            C4579q0 c4579q0 = this.f13566j;
            if (c4579q0 != null) {
                c4579q0.m18155a();
            }
            return false;
        }
        if (i10 != 5) {
            C5729x.m23182a();
            return false;
        }
        C4554j0 c4554j0M17848B0 = c4554j0.m17848B0();
        boolean z11 = c4554j0M17848B0 == null || c4554j0M17848B0.mo13086t();
        if (!z10 && (c4554j0.m17952p0() || (c4554j0.m17934h0() && c4554j0.mo13086t() == z11 && c4554j0.mo13086t() == c4554j0.m17902W0()))) {
            C4579q0 c4579q02 = this.f13566j;
            if (c4579q02 != null) {
                c4579q02.m18155a();
            }
            return false;
        }
        c4554j0.m17921c1();
        if (!c4554j0.mo13085p() && c4554j0.m17902W0() && z11) {
            if ((c4554j0M17848B0 == null || !c4554j0M17848B0.m17934h0()) && (c4554j0M17848B0 == null || !c4554j0M17848B0.m17952p0())) {
                this.f13558b.m18134d(c4554j0, EnumC4522b0.f13187t);
            }
            if (!this.f13560d) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m18330I(C4554j0 c4554j0, boolean z10) {
        int i10 = b.f13570a[c4554j0.m17937i0().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    C5729x.m23182a();
                    return false;
                }
                if (c4554j0.m17952p0() && !z10) {
                    return false;
                }
                c4554j0.m17930f1();
                if (c4554j0.mo13085p()) {
                    return false;
                }
                if (!c4554j0.mo13086t() && !m18342n(c4554j0)) {
                    return false;
                }
                C4554j0 c4554j0M17848B0 = c4554j0.m17848B0();
                if (c4554j0M17848B0 == null || !c4554j0M17848B0.m17952p0()) {
                    this.f13558b.m18134d(c4554j0, EnumC4522b0.f13186s);
                }
                return !this.f13560d;
            }
            this.f13564h.m37029b(new a(c4554j0, false, z10));
            C4579q0 c4579q0 = this.f13566j;
            if (c4579q0 != null) {
                c4579q0.m18155a();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final void m18332L(long j10) {
        C3173c c3173c = this.f13565i;
        if (c3173c == null ? false : C3173c.m11967f(c3173c.m11978q(), j10)) {
            return;
        }
        if (this.f13559c) {
            AbstractC3167a.m11955a("updateRootConstraints called while measuring");
        }
        this.f13565i = C3173c.m11962a(j10);
        if (this.f13557a.m17946m0() != null) {
            this.f13557a.m17927e1();
        }
        this.f13557a.m17930f1();
        C4575p c4575p = this.f13558b;
        C4554j0 c4554j0 = this.f13557a;
        c4575p.m18134d(c4554j0, c4554j0.m17946m0() != null ? EnumC4522b0.f13184q : EnumC4522b0.f13186s);
    }

    /* JADX INFO: renamed from: d */
    public final void m18333d() {
        C9508c c9508c = this.f13562f;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            ((InterfaceC4580q1.b) objArr[i10]).mo17915b();
        }
        this.f13562f.m37035h();
    }

    /* JADX INFO: renamed from: e */
    public final void m18334e(boolean z10) {
        if (z10) {
            this.f13561e.m18073e(this.f13557a);
        }
        if (this.f13561e.m18071c()) {
            this.f13561e.m18069a();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m18335g(C4554j0 c4554j0, C3173c c3173c) {
        if (c4554j0.m17946m0() == null) {
            return false;
        }
        boolean zM17911Z0 = c3173c != null ? c4554j0.m17911Z0(c3173c) : C4554j0.m17838a1(c4554j0, null, 1, null);
        C4554j0 c4554j0M17848B0 = c4554j0.m17848B0();
        if (zM17911Z0 && c4554j0M17848B0 != null) {
            if (c4554j0M17848B0.m17946m0() == null) {
                C4554j0.m17835J1(c4554j0M17848B0, false, false, false, 3, null);
                return zM17911Z0;
            }
            if (c4554j0.m17959s0() == C4554j0.g.f13395q) {
                C4554j0.m17831F1(c4554j0M17848B0, false, false, false, 3, null);
                return zM17911Z0;
            }
            if (c4554j0.m17959s0() == C4554j0.g.f13396r) {
                C4554j0.m17829D1(c4554j0M17848B0, false, 1, null);
            }
        }
        return zM17911Z0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18336h(C4554j0 c4554j0, C3173c c3173c) {
        boolean zM17968w1 = c3173c != null ? c4554j0.m17968w1(c3173c) : C4554j0.m17843x1(c4554j0, null, 1, null);
        C4554j0 c4554j0M17848B0 = c4554j0.m17848B0();
        if (zM17968w1 && c4554j0M17848B0 != null) {
            if (c4554j0.m17957r0() == C4554j0.g.f13395q) {
                C4554j0.m17835J1(c4554j0M17848B0, false, false, false, 3, null);
                return zM17968w1;
            }
            if (c4554j0.m17957r0() == C4554j0.g.f13396r) {
                C4554j0.m17833H1(c4554j0M17848B0, false, 1, null);
            }
        }
        return zM17968w1;
    }

    /* JADX INFO: renamed from: i */
    public final void m18337i() {
        if (this.f13564h.m37039l() != 0) {
            C9508c c9508c = this.f13564h;
            Object[] objArr = c9508c.f32299q;
            int iM37039l = c9508c.m37039l();
            for (int i10 = 0; i10 < iM37039l; i10++) {
                a aVar = (a) objArr[i10];
                if (aVar.m18355a().mo13082d()) {
                    if (aVar.m18357c()) {
                        C4554j0.m17831F1(aVar.m18355a(), aVar.m18356b(), false, false, 2, null);
                    } else {
                        C4554j0.m17835J1(aVar.m18355a(), aVar.m18356b(), false, false, 2, null);
                    }
                }
            }
            this.f13564h.m37035h();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m18338j(C4554j0 c4554j0) {
        C9508c c9508cM17866J0 = c4554j0.m17866J0();
        Object[] objArr = c9508cM17866J0.f32299q;
        int iM37039l = c9508cM17866J0.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            C4554j0 c4554j02 = (C4554j0) objArr[i10];
            if (AbstractC1061t.m3842c(c4554j02.m17905X0(), Boolean.TRUE) && !c4554j02.mo13085p()) {
                if (this.f13558b.m18136f(c4554j02, true)) {
                    c4554j02.m17917b1();
                }
                m18338j(c4554j02);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18339k(C4554j0 c4554j0, boolean z10) {
        if (!this.f13559c) {
            AbstractC3167a.m11956b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (m18353y(c4554j0, z10)) {
            AbstractC3167a.m11955a("node not yet measured");
        }
        m18340l(c4554j0, z10);
    }

    /* JADX INFO: renamed from: l */
    public final void m18340l(C4554j0 c4554j0, boolean z10) {
        C9508c c9508cM17866J0 = c4554j0.m17866J0();
        Object[] objArr = c9508cM17866J0.f32299q;
        int iM37039l = c9508cM17866J0.m37039l();
        for (int i10 = 0; i10 < iM37039l; i10++) {
            C4554j0 c4554j02 = (C4554j0) objArr[i10];
            if ((!z10 && m18349u(c4554j02)) || (z10 && m18346r(c4554j02))) {
                if (AbstractC4576p0.m18141a(c4554j02) && !z10) {
                    if (c4554j02.m17941k0() && this.f13558b.m18136f(c4554j02, true)) {
                        m18323B(c4554j02, true, false);
                    } else {
                        m18339k(c4554j02, true);
                    }
                }
                m18322A(c4554j02, z10);
                if (!m18353y(c4554j02, z10)) {
                    m18340l(c4554j02, z10);
                }
            }
        }
        m18322A(c4554j0, z10);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m18341m(C4554j0 c4554j0) {
        InterfaceC4521b interfaceC4521bM18118o;
        AbstractC4517a abstractC4517aMo17532l;
        if (c4554j0.m17941k0()) {
            return (c4554j0.m17959s0() == C4554j0.g.f13397s && ((interfaceC4521bM18118o = c4554j0.m17929f0().m18118o()) == null || (abstractC4517aMo17532l = interfaceC4521bM18118o.mo17532l()) == null || !abstractC4517aMo17532l.m17500k())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m18342n(C4554j0 c4554j0) {
        return c4554j0.m17952p0() && m18348t(c4554j0);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m18343o() {
        return this.f13559c;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m18344p() {
        return this.f13558b.m18139i();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18345q() {
        return this.f13561e.m18071c();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m18346r(C4554j0 c4554j0) {
        InterfaceC4521b interfaceC4521bM18118o;
        AbstractC4517a abstractC4517aMo17532l;
        return c4554j0.m17959s0() == C4554j0.g.f13395q || !((interfaceC4521bM18118o = c4554j0.m17929f0().m18118o()) == null || (abstractC4517aMo17532l = interfaceC4521bM18118o.mo17532l()) == null || !abstractC4517aMo17532l.m17500k());
    }

    /* JADX INFO: renamed from: s */
    public final long m18347s() {
        if (!this.f13559c) {
            AbstractC3167a.m11955a("measureIteration should be only used during the measure/layout pass");
        }
        return this.f13563g;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18348t(C4554j0 c4554j0) {
        do {
            if (c4554j0.m17957r0() == C4554j0.g.f13397s && !c4554j0.m17929f0().m18105b().mo17532l().m17500k()) {
                C4554j0 c4554j0M17848B0 = c4554j0.m17848B0();
                if ((c4554j0M17848B0 != null ? c4554j0M17848B0.m17937i0() : null) != C4554j0.e.f13387q) {
                    return false;
                }
            }
            c4554j0 = c4554j0.m17848B0();
            if (c4554j0 == null) {
                return false;
            }
        } while (!c4554j0.mo13086t());
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m18349u(C4554j0 c4554j0) {
        return c4554j0.m17957r0() == C4554j0.g.f13395q || c4554j0.m17929f0().m18105b().mo17532l().m17500k();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m18350v(InterfaceC0173a interfaceC0173a) {
        boolean z10;
        C4554j0 c4554j0M18064d;
        boolean z11;
        boolean z12;
        if (!this.f13557a.mo13082d()) {
            AbstractC3167a.m11955a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f13557a.mo13086t()) {
            AbstractC3167a.m11955a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f13559c) {
            AbstractC3167a.m11955a("performMeasureAndLayout called during measure layout");
        }
        boolean z13 = false;
        if (this.f13565i != null) {
            this.f13559c = true;
            this.f13560d = true;
            try {
                if (this.f13558b.m18139i()) {
                    C4575p c4575p = this.f13558b;
                    z10 = false;
                    while (true) {
                        if (!c4575p.f13453a.m18063c()) {
                            c4554j0M18064d = c4575p.f13453a.m18064d();
                            z12 = c4554j0M18064d.m17946m0() != null;
                            z11 = false;
                        } else if (!c4575p.f13454b.m18063c()) {
                            c4554j0M18064d = c4575p.f13454b.m18064d();
                            z12 = c4554j0M18064d.m17946m0() != null;
                            z11 = true;
                        } else {
                            if (c4575p.f13455c.m18063c()) {
                                break;
                            }
                            c4554j0M18064d = c4575p.f13455c.m18064d();
                            z11 = true;
                            z12 = false;
                        }
                        boolean zM18323B = m18323B(c4554j0M18064d, z12, z11);
                        if (!z11) {
                            if (c4554j0M18064d.m17939j0()) {
                                this.f13558b.m18134d(c4554j0M18064d, EnumC4522b0.f13185r);
                            }
                            if (c4554j0M18064d.m17934h0()) {
                                this.f13558b.m18134d(c4554j0M18064d, EnumC4522b0.f13187t);
                            }
                        }
                        if (c4554j0M18064d == this.f13557a && zM18323B) {
                            z10 = true;
                        }
                    }
                    if (interfaceC0173a != null) {
                        interfaceC0173a.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f13559c = false;
                this.f13560d = false;
                C4579q0 c4579q0 = this.f13566j;
                if (c4579q0 != null) {
                    c4579q0.m18155a();
                }
                z13 = z10;
            } finally {
            }
        }
        m18333d();
        return z13;
    }

    /* JADX INFO: renamed from: w */
    public final void m18351w(C4554j0 c4554j0, long j10) {
        if (c4554j0.mo13085p()) {
            return;
        }
        if (AbstractC1061t.m3842c(c4554j0, this.f13557a)) {
            AbstractC3167a.m11955a("measureAndLayout called on root");
        }
        if (!this.f13557a.mo13082d()) {
            AbstractC3167a.m11955a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f13557a.mo13086t()) {
            AbstractC3167a.m11955a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f13559c) {
            AbstractC3167a.m11955a("performMeasureAndLayout called during measure layout");
        }
        if (this.f13565i != null) {
            this.f13559c = true;
            this.f13560d = false;
            try {
                this.f13558b.m18140j(c4554j0);
                if (m18335g(c4554j0, C3173c.m11962a(j10)) || c4554j0.m17939j0()) {
                    if (AbstractC1061t.m3842c(c4554j0.m17905X0(), Boolean.TRUE)) {
                        c4554j0.m17917b1();
                    }
                }
                m18338j(c4554j0);
                m18336h(c4554j0, C3173c.m11962a(j10));
                if (c4554j0.m17934h0() && c4554j0.mo13086t()) {
                    c4554j0.m17846A1();
                    this.f13561e.m18072d(c4554j0);
                }
                m18337i();
                this.f13559c = false;
                this.f13560d = false;
                C4579q0 c4579q0 = this.f13566j;
                if (c4579q0 != null) {
                    c4579q0.m18155a();
                }
            } finally {
            }
        }
        m18333d();
    }

    /* JADX INFO: renamed from: x */
    public final void m18352x() {
        if (this.f13558b.m18139i()) {
            if (!this.f13557a.mo13082d()) {
                AbstractC3167a.m11955a("performMeasureAndLayout called with unattached root");
            }
            if (!this.f13557a.mo13086t()) {
                AbstractC3167a.m11955a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f13559c) {
                AbstractC3167a.m11955a("performMeasureAndLayout called during measure layout");
            }
            if (this.f13565i != null) {
                this.f13559c = true;
                this.f13560d = false;
                try {
                    if (this.f13558b.m18137g()) {
                        C4554j0 c4554j0M17946m0 = this.f13557a.m17946m0();
                        C4554j0 c4554j0 = this.f13557a;
                        if (c4554j0M17946m0 != null) {
                            m18325D(c4554j0, true);
                        } else {
                            m18324C(c4554j0);
                        }
                    }
                    m18325D(this.f13557a, false);
                    this.f13559c = false;
                    this.f13560d = false;
                    C4579q0 c4579q0 = this.f13566j;
                    if (c4579q0 != null) {
                        c4579q0.m18155a();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.f13559c = false;
                        this.f13560d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m18353y(C4554j0 c4554j0, boolean z10) {
        return z10 ? c4554j0.m17941k0() : c4554j0.m17952p0();
    }

    /* JADX INFO: renamed from: z */
    public final void m18354z(C4554j0 c4554j0) {
        this.f13558b.m18140j(c4554j0);
        this.f13561e.m18074f(c4554j0);
    }

    /* JADX INFO: renamed from: K */
    public final void m18331K(InterfaceC4607z1.a aVar) {
    }
}
