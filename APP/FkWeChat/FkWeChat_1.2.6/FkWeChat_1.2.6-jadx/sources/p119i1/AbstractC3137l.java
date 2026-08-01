package p119i1;

import androidx.compose.runtime.AbstractC0464b3;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p057e1.AbstractC1998z;
import p119i1.AbstractC3137l;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p314vb.C8897d;
import p376zd.C10010p0;

/* JADX INFO: renamed from: i1.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3137l {

    /* JADX INFO: renamed from: e */
    public static final a f8345e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f8346f = 8;

    /* JADX INFO: renamed from: a */
    public C3147q f8347a;

    /* JADX INFO: renamed from: b */
    public long f8348b;

    /* JADX INFO: renamed from: c */
    public boolean f8349c;

    /* JADX INFO: renamed from: d */
    public int f8350d;

    public AbstractC3137l(long j10, C3147q c3147q) {
        this.f8347a = c3147q;
        this.f8348b = j10;
        this.f8350d = j10 != AbstractC3159w.f8424b ? AbstractC3159w.m11907e0(j10, mo11675f()) : -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m11753b() {
        synchronized (AbstractC3159w.m11883L()) {
            mo11711c();
            mo11712r();
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo11711c() {
        AbstractC3159w.f8427e = AbstractC3159w.f8427e.m11846q(mo11678i());
    }

    /* JADX INFO: renamed from: d */
    public void mo11659d() {
        this.f8349c = true;
        synchronized (AbstractC3159w.m11883L()) {
            m11756q();
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11754e() {
        return this.f8349c;
    }

    /* JADX INFO: renamed from: f */
    public C3147q mo11675f() {
        return this.f8347a;
    }

    /* JADX INFO: renamed from: g */
    public abstract InterfaceC0184l mo11676g();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo11677h();

    /* JADX INFO: renamed from: i */
    public long mo11678i() {
        return this.f8348b;
    }

    /* JADX INFO: renamed from: j */
    public int mo11679j() {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public abstract InterfaceC0184l mo11680k();

    /* JADX INFO: renamed from: l */
    public AbstractC3137l m11755l() {
        AbstractC3137l abstractC3137l = (AbstractC3137l) AbstractC3159w.f8425c.m7197a();
        AbstractC3159w.f8425c.m7198b(this);
        return abstractC3137l;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo11660m(AbstractC3137l abstractC3137l);

    /* JADX INFO: renamed from: n */
    public abstract void mo11661n(AbstractC3137l abstractC3137l);

    /* JADX INFO: renamed from: o */
    public abstract void mo11662o();

    /* JADX INFO: renamed from: p */
    public abstract void mo11681p(InterfaceC3158v0 interfaceC3158v0);

    /* JADX INFO: renamed from: q */
    public final void m11756q() {
        int i10 = this.f8350d;
        if (i10 >= 0) {
            AbstractC3159w.m11899a0(i10);
            this.f8350d = -1;
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo11712r() {
        m11756q();
    }

    /* JADX INFO: renamed from: s */
    public void m11757s(AbstractC3137l abstractC3137l) {
        AbstractC3159w.f8425c.m7198b(abstractC3137l);
    }

    /* JADX INFO: renamed from: t */
    public final void m11758t(boolean z10) {
        this.f8349c = z10;
    }

    /* JADX INFO: renamed from: u */
    public void mo11682u(C3147q c3147q) {
        this.f8347a = c3147q;
    }

    /* JADX INFO: renamed from: v */
    public void mo11683v(long j10) {
        this.f8348b = j10;
    }

    /* JADX INFO: renamed from: w */
    public void mo11684w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: x */
    public abstract AbstractC3137l mo11663x(InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: y */
    public final int m11759y() {
        int i10 = this.f8350d;
        this.f8350d = -1;
        return i10;
    }

    /* JADX INFO: renamed from: z */
    public final void m11760z() {
        if (this.f8349c) {
            AbstractC0464b3.m1535a("Cannot use a disposed snapshot");
        }
    }

    /* JADX INFO: renamed from: i1.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m11761a(InterfaceC0188p interfaceC0188p) {
            synchronized (AbstractC3159w.m11883L()) {
                AbstractC3159w.f8431i = AbstractC5081g0.m20530B0(AbstractC3159w.f8431i, interfaceC0188p);
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m11762b(InterfaceC0184l interfaceC0184l) {
            synchronized (AbstractC3159w.m11883L()) {
                AbstractC3159w.f8432j = AbstractC5081g0.m20530B0(AbstractC3159w.f8432j, interfaceC0184l);
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            AbstractC3159w.m11876E();
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ C3121d m11763n(a aVar, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC0184l = null;
            }
            if ((i10 & 2) != 0) {
                interfaceC0184l2 = null;
            }
            return aVar.m11774m(interfaceC0184l, interfaceC0184l2);
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC3137l m11764c() {
            return AbstractC3159w.m11882K();
        }

        /* JADX INFO: renamed from: d */
        public final AbstractC3137l m11765d() {
            return (AbstractC3137l) AbstractC3159w.f8425c.m7197a();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m11766e() {
            return AbstractC3159w.f8425c.m7197a() != null;
        }

        /* JADX INFO: renamed from: f */
        public final AbstractC3137l m11767f(AbstractC3137l abstractC3137l) {
            if (abstractC3137l instanceof C3117b1) {
                C3117b1 c3117b1 = (C3117b1) abstractC3137l;
                if (c3117b1.m11670V() == AbstractC1998z.m7206a()) {
                    c3117b1.m11673Y(null);
                    return abstractC3137l;
                }
            }
            if (abstractC3137l instanceof C3120c1) {
                C3120c1 c3120c1 = (C3120c1) abstractC3137l;
                if (c3120c1.m11692C() == AbstractC1998z.m7206a()) {
                    c3120c1.m11695F(null);
                    return abstractC3137l;
                }
            }
            AbstractC3137l abstractC3137lM11879H = AbstractC3159w.m11879H(abstractC3137l, null, false, 6, null);
            abstractC3137lM11879H.m11755l();
            return abstractC3137lM11879H;
        }

        /* JADX INFO: renamed from: g */
        public final void m11768g() {
            AbstractC3159w.m11882K().mo11662o();
        }

        /* JADX INFO: renamed from: h */
        public final Object m11769h(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0173a interfaceC0173a) {
            AbstractC3137l c3117b1;
            if (interfaceC0184l == null && interfaceC0184l2 == null) {
                return interfaceC0173a.invoke();
            }
            AbstractC3137l abstractC3137l = (AbstractC3137l) AbstractC3159w.f8425c.m7197a();
            if (abstractC3137l instanceof C3117b1) {
                C3117b1 c3117b12 = (C3117b1) abstractC3137l;
                if (c3117b12.m11670V() == AbstractC1998z.m7206a()) {
                    InterfaceC0184l interfaceC0184lMo11667H = c3117b12.mo11676g();
                    InterfaceC0184l interfaceC0184lMo11680k = c3117b12.mo11680k();
                    try {
                        ((C3117b1) abstractC3137l).m11673Y(AbstractC3159w.m11885N(interfaceC0184l, interfaceC0184lMo11667H, false, 4, null));
                        ((C3117b1) abstractC3137l).m11674Z(AbstractC3159w.m11886O(interfaceC0184l2, interfaceC0184lMo11680k));
                        return interfaceC0173a.invoke();
                    } finally {
                        c3117b12.m11673Y(interfaceC0184lMo11667H);
                        c3117b12.m11674Z(interfaceC0184lMo11680k);
                    }
                }
            }
            if (abstractC3137l == null || (abstractC3137l instanceof C3121d)) {
                c3117b1 = new C3117b1(abstractC3137l instanceof C3121d ? (C3121d) abstractC3137l : null, interfaceC0184l, interfaceC0184l2, true, false);
            } else {
                if (interfaceC0184l == null) {
                    return interfaceC0173a.invoke();
                }
                c3117b1 = abstractC3137l.mo11663x(interfaceC0184l);
            }
            try {
                AbstractC3137l abstractC3137lM11755l = c3117b1.m11755l();
                try {
                    Object objInvoke = interfaceC0173a.invoke();
                    c3117b1.m11757s(abstractC3137lM11755l);
                    c3117b1.mo11659d();
                    return objInvoke;
                } catch (Throwable th) {
                    c3117b1.m11757s(abstractC3137lM11755l);
                    throw th;
                }
            } catch (Throwable th2) {
                c3117b1.mo11659d();
                throw th2;
            }
        }

        /* JADX INFO: renamed from: i */
        public final InterfaceC3127g m11770i(final InterfaceC0188p interfaceC0188p) {
            AbstractC3159w.m11875D(AbstractC3159w.f8423a);
            synchronized (AbstractC3159w.m11883L()) {
                AbstractC3159w.f8431i = AbstractC5081g0.m20534F0(AbstractC3159w.f8431i, interfaceC0188p);
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            return new InterfaceC3127g() { // from class: i1.k
                @Override // p119i1.InterfaceC3127g
                /* JADX INFO: renamed from: a */
                public final void mo11733a() {
                    AbstractC3137l.a.m11761a(interfaceC0188p);
                }
            };
        }

        /* JADX INFO: renamed from: j */
        public final InterfaceC3127g m11771j(final InterfaceC0184l interfaceC0184l) {
            synchronized (AbstractC3159w.m11883L()) {
                AbstractC3159w.f8432j = AbstractC5081g0.m20534F0(AbstractC3159w.f8432j, interfaceC0184l);
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            AbstractC3159w.m11876E();
            return new InterfaceC3127g() { // from class: i1.j
                @Override // p119i1.InterfaceC3127g
                /* JADX INFO: renamed from: a */
                public final void mo11733a() {
                    AbstractC3137l.a.m11762b(interfaceC0184l);
                }
            };
        }

        /* JADX INFO: renamed from: k */
        public final void m11772k(AbstractC3137l abstractC3137l, AbstractC3137l abstractC3137l2, InterfaceC0184l interfaceC0184l) {
            if (abstractC3137l != abstractC3137l2) {
                abstractC3137l2.m11757s(abstractC3137l);
                abstractC3137l2.mo11659d();
            } else if (abstractC3137l instanceof C3117b1) {
                ((C3117b1) abstractC3137l).m11673Y(interfaceC0184l);
            } else if (abstractC3137l instanceof C3120c1) {
                ((C3120c1) abstractC3137l).m11695F(interfaceC0184l);
            } else {
                C8897d.m34134a("Non-transparent snapshot was reused: ", abstractC3137l);
            }
        }

        /* JADX INFO: renamed from: l */
        public final void m11773l() {
            boolean zM11701I;
            synchronized (AbstractC3159w.m11883L()) {
                zM11701I = AbstractC3159w.f8433k.m11701I();
            }
            if (zM11701I) {
                AbstractC3159w.m11876E();
            }
        }

        /* JADX INFO: renamed from: m */
        public final C3121d m11774m(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
            C3121d c3121dMo11656R;
            AbstractC3137l abstractC3137lM11882K = AbstractC3159w.m11882K();
            C3121d c3121d = abstractC3137lM11882K instanceof C3121d ? (C3121d) abstractC3137lM11882K : null;
            if (c3121d != null && (c3121dMo11656R = c3121d.mo11656R(interfaceC0184l, interfaceC0184l2)) != null) {
                return c3121dMo11656R;
            }
            C10010p0.m38820a("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }

        /* JADX INFO: renamed from: o */
        public final AbstractC3137l m11775o(InterfaceC0184l interfaceC0184l) {
            return AbstractC3159w.m11882K().mo11663x(interfaceC0184l);
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC3137l(long j10, C3147q c3147q, AbstractC1043k abstractC1043k) {
        this(j10, c3147q);
    }
}
