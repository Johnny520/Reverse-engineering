package p235q1;

import android.os.Trace;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p024b9.C1050n0;
import p120i2.AbstractC3167a;
import p121i3.AbstractC3190t;
import p135j2.InterfaceC3515e;
import p135j2.InterfaceC3578w;
import p151k2.InterfaceC3941h;
import p165l1.C4503i;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4547h1;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4563l1;
import p166l2.AbstractC4565m;
import p166l2.AbstractC4606z0;
import p166l2.C4531d1;
import p166l2.C4554j0;
import p166l2.InterfaceC4530d0;
import p166l2.InterfaceC4545h;
import p166l2.InterfaceC4559k1;
import p172l8.C4700i0;
import p215oc.C5729x;
import p250r1.AbstractC6458h;
import p250r1.C6455e;
import p250r1.C6457g;
import p349y0.C9508c;

/* JADX INFO: renamed from: q1.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6206h0 extends InterfaceC4507m.c implements InterfaceC4545h, InterfaceC4530d0, InterfaceC6202f0, InterfaceC4559k1, InterfaceC3941h {

    /* JADX INFO: renamed from: F */
    public final boolean f19264F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC0188p f19265G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC0184l f19266H;

    /* JADX INFO: renamed from: I */
    public boolean f19267I;

    /* JADX INFO: renamed from: J */
    public boolean f19268J;

    /* JADX INFO: renamed from: K */
    public EnumC6200e0 f19269K;

    /* JADX INFO: renamed from: L */
    public final boolean f19270L;

    /* JADX INFO: renamed from: M */
    public int f19271M;

    /* JADX INFO: renamed from: q1.h0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19273a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f19274b;

        static {
            int[] iArr = new int[EnumC6195c.values().length];
            try {
                iArr[EnumC6195c.f19237q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6195c.f19239s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6195c.f19238r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6195c.f19240t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19273a = iArr;
            int[] iArr2 = new int[EnumC6200e0.values().length];
            try {
                iArr2[EnumC6200e0.f19245q.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC6200e0.f19247s.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC6200e0.f19246r.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC6200e0.f19248t.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f19274b = iArr2;
        }
    }

    /* JADX INFO: renamed from: q1.h0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f19275r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C6206h0 f19276s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1050n0 c1050n0, C6206h0 c6206h0) {
            super(0);
            this.f19275r = c1050n0;
            this.f19276s = c6206h0;
        }

        /* JADX INFO: renamed from: a */
        public final void m24404a() {
            this.f19275r.f3208q = this.f19276s.m24395N2();
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m24404a();
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: q1.h0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ int f19277r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10) {
            super(1);
            this.f19277r = i10;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(C6206h0 c6206h0) {
            return Boolean.valueOf(c6206h0.m24393L2(this.f19277r));
        }
    }

    public /* synthetic */ C6206h0(int i10, boolean z10, InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? AbstractC6214l0.f19289a.m24448a() : i10, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? null : interfaceC0188p, (i11 & 8) != 0 ? null : interfaceC0184l, null);
    }

    /* JADX INFO: renamed from: L2 */
    public final boolean m24393L2(int i10) {
        int i11 = b.f19273a[AbstractC6210j0.m24415h(this, i10).ordinal()];
        if (i11 == 1) {
            return AbstractC6210j0.m24416i(this);
        }
        if (i11 == 2) {
            return true;
        }
        if (i11 == 3 || i11 == 4) {
            return false;
        }
        C5729x.m23182a();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX INFO: renamed from: M2 */
    public final void m24394M2(InterfaceC6198d0 interfaceC6198d0, InterfaceC6198d0 interfaceC6198d02) {
        C4531d1 c4531d1M17965v0;
        InterfaceC0188p interfaceC0188p;
        InterfaceC6223q focusOwner = AbstractC4557k.m18016r(this).getFocusOwner();
        C6206h0 c6206h0Mo24511w = focusOwner.mo24511w();
        if (!AbstractC1061t.m3842c(interfaceC6198d0, interfaceC6198d02) && (interfaceC0188p = this.f19265G) != null) {
            interfaceC0188p.invoke(interfaceC6198d0, interfaceC6198d02);
        }
        int iM17812a = AbstractC4547h1.m17812a(4096);
        int iM17812a2 = AbstractC4547h1.m17812a(1024);
        InterfaceC4507m.c cVarMo17471z = mo17471z();
        int i10 = iM17812a | iM17812a2;
        if (!mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitAncestors called on an unattached node");
        }
        InterfaceC4507m.c cVarMo17471z2 = mo17471z();
        C4554j0 c4554j0M18015q = AbstractC4557k.m18015q(this);
        loop0: while (c4554j0M18015q != null) {
            if ((c4554j0M18015q.m17965v0().m17597k().m17452c2() & i10) != 0) {
                while (cVarMo17471z2 != null) {
                    if ((cVarMo17471z2.m17457h2() & i10) != 0) {
                        if (cVarMo17471z2 != cVarMo17471z && (cVarMo17471z2.m17457h2() & iM17812a2) != 0) {
                            break loop0;
                        }
                        if ((cVarMo17471z2.m17457h2() & iM17812a) != 0) {
                            ?? M18008j = cVarMo17471z2;
                            ?? c9508c = 0;
                            while (M18008j != 0) {
                                if (M18008j instanceof InterfaceC6207i) {
                                    InterfaceC6207i interfaceC6207i = (InterfaceC6207i) M18008j;
                                    if (c6206h0Mo24511w == focusOwner.mo24511w()) {
                                        interfaceC6207i.mo13026Y1(interfaceC6198d02);
                                    }
                                } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                                    InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                                    int i11 = 0;
                                    M18008j = M18008j;
                                    c9508c = c9508c;
                                    while (cVarM18050H2 != null) {
                                        if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                            i11++;
                                            c9508c = c9508c;
                                            if (i11 == 1) {
                                                M18008j = cVarM18050H2;
                                            } else {
                                                if (c9508c == 0) {
                                                    c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                                }
                                                if (M18008j != 0) {
                                                    c9508c.m37029b(M18008j);
                                                    M18008j = 0;
                                                }
                                                c9508c.m37029b(cVarM18050H2);
                                            }
                                        }
                                        cVarM18050H2 = cVarM18050H2.m17453d2();
                                        M18008j = M18008j;
                                        c9508c = c9508c;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                M18008j = AbstractC4557k.m18008j(c9508c);
                            }
                        }
                    }
                    cVarMo17471z2 = cVarMo17471z2.m17459j2();
                }
            }
            c4554j0M18015q = c4554j0M18015q.m17848B0();
            cVarMo17471z2 = (c4554j0M18015q == null || (c4531d1M17965v0 = c4554j0M18015q.m17965v0()) == null) ? null : c4531d1M17965v0.m17601o();
        }
        InterfaceC0184l interfaceC0184l = this.f19266H;
        if (interfaceC0184l != null) {
            interfaceC0184l.mo27m(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [l1.m$c] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [y0.c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: N2 */
    public final InterfaceC6226t m24395N2() {
        C4531d1 c4531d1M17965v0;
        C6227u c6227u = new C6227u();
        c6227u.mo17627o(AbstractC6214l0.m24445d(m24399R2(), this));
        int iM17812a = AbstractC4547h1.m17812a(2048);
        int iM17812a2 = AbstractC4547h1.m17812a(1024);
        InterfaceC4507m.c cVarMo17471z = mo17471z();
        int i10 = iM17812a | iM17812a2;
        if (!mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitAncestors called on an unattached node");
        }
        InterfaceC4507m.c cVarMo17471z2 = mo17471z();
        C4554j0 c4554j0M18015q = AbstractC4557k.m18015q(this);
        while (c4554j0M18015q != null) {
            if ((c4554j0M18015q.m17965v0().m17597k().m17452c2() & i10) != 0) {
                while (cVarMo17471z2 != null) {
                    if ((cVarMo17471z2.m17457h2() & i10) != 0) {
                        if (cVarMo17471z2 != cVarMo17471z && (cVarMo17471z2.m17457h2() & iM17812a2) != 0) {
                            return c6227u;
                        }
                        if ((cVarMo17471z2.m17457h2() & iM17812a) != 0) {
                            ?? M18008j = cVarMo17471z2;
                            ?? c9508c = 0;
                            while (M18008j != 0) {
                                if (M18008j instanceof InterfaceC6228v) {
                                    ((InterfaceC6228v) M18008j).mo17557j1(c6227u);
                                } else if ((M18008j.m17457h2() & iM17812a) != 0 && (M18008j instanceof AbstractC4565m)) {
                                    InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) M18008j).m18050H2();
                                    int i11 = 0;
                                    M18008j = M18008j;
                                    c9508c = c9508c;
                                    while (cVarM18050H2 != null) {
                                        if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                            i11++;
                                            c9508c = c9508c;
                                            if (i11 == 1) {
                                                M18008j = cVarM18050H2;
                                            } else {
                                                if (c9508c == 0) {
                                                    c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                                }
                                                if (M18008j != 0) {
                                                    c9508c.m37029b(M18008j);
                                                    M18008j = 0;
                                                }
                                                c9508c.m37029b(cVarM18050H2);
                                            }
                                        }
                                        cVarM18050H2 = cVarM18050H2.m17453d2();
                                        M18008j = M18008j;
                                        c9508c = c9508c;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                M18008j = AbstractC4557k.m18008j(c9508c);
                            }
                        }
                    }
                    cVarMo17471z2 = cVarMo17471z2.m17459j2();
                }
            }
            c4554j0M18015q = c4554j0M18015q.m17848B0();
            cVarMo17471z2 = (c4554j0M18015q == null || (c4531d1M17965v0 = c4554j0M18015q.m17965v0()) == null) ? null : c4531d1M17965v0.m17601o();
        }
        return c6227u;
    }

    @Override // p235q1.InterfaceC6202f0
    /* JADX INFO: renamed from: O */
    public boolean mo24361O(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zM24393L2 = C4503i.f13062h ? m24395N2().mo17626e() ? m24393L2(i10) : AbstractC6222p0.m24477k(this, i10, new d(i10)) : m24395N2().mo17626e() && m24393L2(i10);
            Trace.endSection();
            return zM24393L2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: O2 */
    public final C6457g m24396O2(InterfaceC3578w interfaceC3578w) {
        C6457g c6457gMo13249j0;
        C6457g c6457gMo24532d = m24395N2().mo24532d();
        return c6457gMo24532d != InterfaceC6226t.f19326a.m24543a() ? interfaceC3578w == null ? c6457gMo24532d : c6457gMo24532d.m25593v(InterfaceC3578w.m13370Q(interfaceC3578w, AbstractC4557k.m18013o(this), 0L, false, 6, null)) : (interfaceC3578w == null || (c6457gMo13249j0 = interfaceC3578w.mo13249j0(AbstractC4557k.m18013o(this), false)) == null) ? AbstractC6458h.m25597c(C6455e.f20314b.m25569c(), AbstractC3190t.m12092d(AbstractC4557k.m18013o(this).mo13242a())) : c6457gMo13249j0;
    }

    /* JADX INFO: renamed from: P2 */
    public final InterfaceC3515e m24397P2() {
        return AbstractC4557k.m18004f(this);
    }

    @Override // p235q1.InterfaceC6202f0
    /* JADX INFO: renamed from: Q2, reason: merged with bridge method [inline-methods] */
    public EnumC6200e0 mo24362j0() {
        C4531d1 c4531d1M17965v0;
        if (!m17461m2()) {
            return EnumC6200e0.f19248t;
        }
        InterfaceC6223q focusOwner = AbstractC4557k.m18016r(this).getFocusOwner();
        C6206h0 c6206h0Mo24511w = focusOwner.mo24511w();
        if (c6206h0Mo24511w == null) {
            return EnumC6200e0.f19248t;
        }
        if (this == c6206h0Mo24511w) {
            return focusOwner.mo24499j() ? EnumC6200e0.f19247s : EnumC6200e0.f19245q;
        }
        if (c6206h0Mo24511w.m17461m2()) {
            int iM17812a = AbstractC4547h1.m17812a(1024);
            if (!c6206h0Mo24511w.mo17471z().m17461m2()) {
                AbstractC3167a.m11956b("visitAncestors called on an unattached node");
            }
            InterfaceC4507m.c cVarM17459j2 = c6206h0Mo24511w.mo17471z().m17459j2();
            C4554j0 c4554j0M18015q = AbstractC4557k.m18015q(c6206h0Mo24511w);
            while (c4554j0M18015q != null) {
                if ((c4554j0M18015q.m17965v0().m17597k().m17452c2() & iM17812a) != 0) {
                    while (cVarM17459j2 != null) {
                        if ((cVarM17459j2.m17457h2() & iM17812a) != 0) {
                            InterfaceC4507m.c cVarM18008j = cVarM17459j2;
                            C9508c c9508c = null;
                            while (cVarM18008j != null) {
                                if (cVarM18008j instanceof C6206h0) {
                                    if (this == ((C6206h0) cVarM18008j)) {
                                        return EnumC6200e0.f19246r;
                                    }
                                } else if ((cVarM18008j.m17457h2() & iM17812a) != 0 && (cVarM18008j instanceof AbstractC4565m)) {
                                    int i10 = 0;
                                    for (InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) cVarM18008j).m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
                                        if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarM18008j = cVarM18050H2;
                                            } else {
                                                if (c9508c == null) {
                                                    c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                                }
                                                if (cVarM18008j != null) {
                                                    c9508c.m37029b(cVarM18008j);
                                                    cVarM18008j = null;
                                                }
                                                c9508c.m37029b(cVarM18050H2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarM18008j = AbstractC4557k.m18008j(c9508c);
                            }
                        }
                        cVarM17459j2 = cVarM17459j2.m17459j2();
                    }
                }
                c4554j0M18015q = c4554j0M18015q.m17848B0();
                cVarM17459j2 = (c4554j0M18015q == null || (c4531d1M17965v0 = c4554j0M18015q.m17965v0()) == null) ? null : c4531d1M17965v0.m17601o();
            }
        }
        return EnumC6200e0.f19248t;
    }

    /* JADX INFO: renamed from: R2 */
    public int m24399R2() {
        return this.f19271M;
    }

    /* JADX INFO: renamed from: S2 */
    public final void m24400S2() {
        InterfaceC6226t interfaceC6226t;
        int i10 = b.f19274b[mo24362j0().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return;
            }
            C5729x.m23182a();
            return;
        }
        C1050n0 c1050n0 = new C1050n0();
        AbstractC4563l1.m18046a(this, new c(c1050n0, this));
        Object obj = c1050n0.f3208q;
        if (obj == null) {
            AbstractC1061t.m3851l("focusProperties");
            interfaceC6226t = null;
        } else {
            interfaceC6226t = (InterfaceC6226t) obj;
        }
        if (interfaceC6226t.mo17626e()) {
            return;
        }
        AbstractC4557k.m18016r(this).getFocusOwner().mo24454A(true);
    }

    /* JADX INFO: renamed from: T2 */
    public final boolean m24401T2() {
        return this.f19264F;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return this.f19270L;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        int i10 = b.f19274b[mo24362j0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            InterfaceC6223q focusOwner = AbstractC4557k.m18016r(this).getFocusOwner();
            focusOwner.mo24501l(true, true, false, C6203g.f19254b.m24380c());
            if (this.f19264F) {
                focusOwner.mo24491a(null, null);
            }
            focusOwner.mo24495f();
        } else if (i10 == 3) {
            InterfaceC6223q focusOwner2 = AbstractC4557k.m18016r(this).getFocusOwner();
            C6206h0 c6206h0M24428b = AbstractC6212k0.m24428b(this);
            if (c6206h0M24428b != null && c6206h0M24428b.f19264F) {
                focusOwner2.mo24491a(null, null);
                focusOwner2.mo24495f();
            }
        } else if (i10 != 4) {
            C5729x.m23182a();
            return;
        }
        this.f19269K = null;
    }

    @Override // p166l2.InterfaceC4530d0
    /* JADX INFO: renamed from: r0 */
    public void mo13088r0(InterfaceC3578w interfaceC3578w) {
        if (C4503i.f13061g) {
            AbstractC4557k.m18016r(mo17471z()).getFocusOwner().mo24492b();
        }
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: r2 */
    public void mo15375r2() {
        if (mo24362j0().mo24356c()) {
            AbstractC4557k.m18016r(this).getFocusOwner().mo24501l(true, true, true, C6203g.f19254b.m24380c());
        }
    }

    @Override // p166l2.InterfaceC4559k1
    /* JADX INFO: renamed from: s1 */
    public void mo18018s1() {
        m24400S2();
    }

    /* JADX INFO: renamed from: q1.h0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m16758d2 = {"Lq1/h0$a;", "Ll2/z0;", "Lq1/h0;", "<init>", "()V", "m", "()Lq1/h0;", "node", "Ll8/i0;", "n", "(Lq1/h0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
    public static final class a extends AbstractC4606z0 {

        /* JADX INFO: renamed from: b */
        public static final a f19272b = new a();

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // p166l2.AbstractC4606z0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C6206h0 mo1191j() {
            return new C6206h0(0, false, null, null, 15, null);
        }

        @Override // p166l2.AbstractC4606z0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo1192k(C6206h0 node) {
        }
    }

    public C6206h0(int i10, boolean z10, InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l) {
        this.f19264F = z10;
        this.f19265G = interfaceC0188p;
        this.f19266H = interfaceC0184l;
        this.f19271M = i10;
    }

    public /* synthetic */ C6206h0(int i10, boolean z10, InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l, AbstractC1043k abstractC1043k) {
        this(i10, z10, interfaceC0188p, interfaceC0184l);
    }
}
