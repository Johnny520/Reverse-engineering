package p204o1;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p024b9.C1042j0;
import p024b9.C1050n0;
import p120i2.AbstractC3167a;
import p121i3.C3189s;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4560k2;
import p166l2.EnumC4552i2;
import p166l2.InterfaceC4530d0;
import p166l2.InterfaceC4553j;
import p166l2.InterfaceC4556j2;

/* JADX INFO: renamed from: o1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5623e extends InterfaceC4507m.c implements InterfaceC4556j2, InterfaceC4553j, InterfaceC5625g, InterfaceC4530d0 {

    /* JADX INFO: renamed from: L */
    public static final a f17606L = new a(null);

    /* JADX INFO: renamed from: M */
    public static final int f17607M = 8;

    /* JADX INFO: renamed from: F */
    public InterfaceC0188p f17608F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC0184l f17609G;

    /* JADX INFO: renamed from: H */
    public final Object f17610H;

    /* JADX INFO: renamed from: I */
    public C5623e f17611I;

    /* JADX INFO: renamed from: J */
    public InterfaceC5625g f17612J;

    /* JADX INFO: renamed from: K */
    public long f17613K;

    /* JADX INFO: renamed from: o1.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C5621c f17615r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C5623e f17616s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C1042j0 f17617t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5621c c5621c, C5623e c5623e, C1042j0 c1042j0) {
            super(1);
            this.f17615r = c5621c;
            this.f17616s = c5623e;
            this.f17617t = c1042j0;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC4552i2 mo27m(C5623e c5623e) {
            if (!c5623e.m17461m2()) {
                return EnumC4552i2.f13330r;
            }
            if (!(c5623e.f17612J == null)) {
                AbstractC3167a.m11956b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            InterfaceC0184l interfaceC0184l = c5623e.f17609G;
            c5623e.f17612J = interfaceC0184l != null ? (InterfaceC5625g) interfaceC0184l.mo27m(this.f17615r) : null;
            boolean z10 = c5623e.f17612J != null;
            if (z10) {
                this.f17616s.m22775M2().mo22762a(c5623e);
            }
            C1042j0 c1042j0 = this.f17617t;
            c1042j0.f3202q = c1042j0.f3202q || z10;
            return EnumC4552i2.f13329q;
        }
    }

    /* JADX INFO: renamed from: o1.e$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C5621c f17618r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5621c c5621c) {
            super(1);
            this.f17618r = c5621c;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC4552i2 mo27m(C5623e c5623e) {
            if (!c5623e.mo17471z().m17461m2()) {
                return EnumC4552i2.f13330r;
            }
            InterfaceC5625g interfaceC5625g = c5623e.f17612J;
            if (interfaceC5625g != null) {
                interfaceC5625g.mo22773B1(this.f17618r);
            }
            c5623e.f17612J = null;
            c5623e.f17611I = null;
            return EnumC4552i2.f13329q;
        }
    }

    /* JADX INFO: renamed from: o1.e$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f17619r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C5623e f17620s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C5621c f17621t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1050n0 c1050n0, C5623e c5623e, C5621c c5621c) {
            super(1);
            this.f17619r = c1050n0;
            this.f17620s = c5623e;
            this.f17621t = c5621c;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC4552i2 mo27m(InterfaceC4556j2 interfaceC4556j2) {
            C5623e c5623e = (C5623e) interfaceC4556j2;
            if (!this.f17620s.m22775M2().mo22763b(c5623e) || !AbstractC5624f.m22788d(c5623e, AbstractC5627i.m22791a(this.f17621t))) {
                return EnumC4552i2.f13329q;
            }
            this.f17619r.f3208q = interfaceC4556j2;
            return EnumC4552i2.f13331s;
        }
    }

    public C5623e(InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l) {
        this.f17608F = interfaceC0188p;
        this.f17609G = interfaceC0184l;
        this.f17610H = a.C10170a.f17614a;
        this.f17613K = C3189s.f8481b.m12088a();
    }

    @Override // p204o1.InterfaceC5625g
    /* JADX INFO: renamed from: B1 */
    public void mo22773B1(C5621c c5621c) {
        AbstractC5624f.m22790f(this, new c(c5621c));
    }

    /* JADX INFO: renamed from: G2 */
    public boolean m22774G2(C5621c c5621c) {
        C1042j0 c1042j0 = new C1042j0();
        AbstractC5624f.m22790f(this, new b(c5621c, this, c1042j0));
        return c1042j0.f3202q;
    }

    /* JADX INFO: renamed from: M2 */
    public final InterfaceC5622d m22775M2() {
        return AbstractC4557k.m18016r(this).getDragAndDropManager();
    }

    /* JADX INFO: renamed from: N2 */
    public final long m22776N2() {
        return this.f17613K;
    }

    @Override // p166l2.InterfaceC4556j2
    /* JADX INFO: renamed from: T */
    public Object mo1308T() {
        return this.f17610H;
    }

    @Override // p204o1.InterfaceC5625g
    /* JADX INFO: renamed from: T0 */
    public void mo22777T0(C5621c c5621c) {
        InterfaceC5625g interfaceC5625g = this.f17612J;
        if (interfaceC5625g != null) {
            interfaceC5625g.mo22777T0(c5621c);
            return;
        }
        C5623e c5623e = this.f17611I;
        if (c5623e != null) {
            c5623e.mo22777T0(c5621c);
        }
    }

    @Override // p166l2.InterfaceC4530d0
    /* JADX INFO: renamed from: X */
    public void mo13125X(long j10) {
        this.f17613K = j10;
    }

    @Override // p204o1.InterfaceC5625g
    /* JADX INFO: renamed from: k1 */
    public void mo22778k1(C5621c c5621c) {
        InterfaceC5625g interfaceC5625g = this.f17612J;
        if (interfaceC5625g != null) {
            interfaceC5625g.mo22778k1(c5621c);
        }
        C5623e c5623e = this.f17611I;
        if (c5623e != null) {
            c5623e.mo22778k1(c5621c);
        }
        this.f17611I = null;
    }

    @Override // p204o1.InterfaceC5625g
    /* JADX INFO: renamed from: q1 */
    public boolean mo22779q1(C5621c c5621c) {
        C5623e c5623e = this.f17611I;
        if (c5623e != null) {
            return c5623e.mo22779q1(c5621c);
        }
        InterfaceC5625g interfaceC5625g = this.f17612J;
        if (interfaceC5625g != null) {
            return interfaceC5625g.mo22779q1(c5621c);
        }
        return false;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        this.f17612J = null;
        this.f17611I = null;
    }

    @Override // p204o1.InterfaceC5625g
    /* JADX INFO: renamed from: s0 */
    public void mo22780s0(C5621c c5621c) {
        InterfaceC5625g interfaceC5625g = this.f17612J;
        if (interfaceC5625g != null) {
            interfaceC5625g.mo22780s0(c5621c);
            return;
        }
        C5623e c5623e = this.f17611I;
        if (c5623e != null) {
            c5623e.mo22780s0(c5621c);
        }
    }

    @Override // p204o1.InterfaceC5625g
    /* JADX INFO: renamed from: v1 */
    public void mo22781v1(C5621c c5621c) {
        InterfaceC4556j2 interfaceC4556j2;
        C5623e c5623e;
        C5623e c5623e2 = this.f17611I;
        if (c5623e2 == null || !AbstractC5624f.m22788d(c5623e2, AbstractC5627i.m22791a(c5621c))) {
            if (mo17471z().m17461m2()) {
                C1050n0 c1050n0 = new C1050n0();
                AbstractC4560k2.m18024f(this, new d(c1050n0, this, c5621c));
                interfaceC4556j2 = (InterfaceC4556j2) c1050n0.f3208q;
            } else {
                interfaceC4556j2 = null;
            }
            c5623e = (C5623e) interfaceC4556j2;
        } else {
            c5623e = c5623e2;
        }
        if (c5623e != null && c5623e2 == null) {
            AbstractC5624f.m22789e(c5623e, c5621c);
            InterfaceC5625g interfaceC5625g = this.f17612J;
            if (interfaceC5625g != null) {
                interfaceC5625g.mo22778k1(c5621c);
            }
        } else if (c5623e == null && c5623e2 != null) {
            InterfaceC5625g interfaceC5625g2 = this.f17612J;
            if (interfaceC5625g2 != null) {
                AbstractC5624f.m22789e(interfaceC5625g2, c5621c);
            }
            c5623e2.mo22778k1(c5621c);
        } else if (!AbstractC1061t.m3842c(c5623e, c5623e2)) {
            if (c5623e != null) {
                AbstractC5624f.m22789e(c5623e, c5621c);
            }
            if (c5623e2 != null) {
                c5623e2.mo22778k1(c5621c);
            }
        } else if (c5623e != null) {
            c5623e.mo22781v1(c5621c);
        } else {
            InterfaceC5625g interfaceC5625g3 = this.f17612J;
            if (interfaceC5625g3 != null) {
                interfaceC5625g3.mo22781v1(c5621c);
            }
        }
        this.f17611I = c5623e;
    }

    /* JADX INFO: renamed from: o1.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: o1.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10170a {

            /* JADX INFO: renamed from: a */
            public static final C10170a f17614a = new C10170a();
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C5623e(InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : interfaceC0188p, (i10 & 2) != 0 ? null : interfaceC0184l);
    }
}
