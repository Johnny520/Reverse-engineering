package p135j2;

import p010a9.InterfaceC0184l;
import p080f9.AbstractC2368o;
import p121i3.C3173c;
import p121i3.C3185o;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p166l2.InterfaceC4519a1;
import p215oc.C5725t;
import p305v1.C8761c;

/* JADX INFO: renamed from: j2.l1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3545l1 implements InterfaceC3564r0 {

    /* JADX INFO: renamed from: q */
    public int f9861q;

    /* JADX INFO: renamed from: r */
    public int f9862r;

    /* JADX INFO: renamed from: s */
    public long f9863s;

    /* JADX INFO: renamed from: t */
    public long f9864t = AbstractC3549m1.f9870b;

    /* JADX INFO: renamed from: u */
    public long f9865u = C3185o.f8471b.m12058b();

    public AbstractC3545l1() {
        long j10 = 0;
        this.f9863s = C3189s.m12082c((j10 & 4294967295L) | (j10 << 32));
    }

    /* JADX INFO: renamed from: E0 */
    public final long m13258E0() {
        return this.f9865u;
    }

    /* JADX INFO: renamed from: G0 */
    public final int m13259G0() {
        return this.f9862r;
    }

    /* JADX INFO: renamed from: H0 */
    public int mo13260H0() {
        return (int) (this.f9863s & 4294967295L);
    }

    /* JADX INFO: renamed from: I0 */
    public final long m13261I0() {
        return this.f9863s;
    }

    /* JADX INFO: renamed from: K0 */
    public int mo13262K0() {
        return (int) (this.f9863s >> 32);
    }

    /* JADX INFO: renamed from: L0 */
    public final long m13263L0() {
        return this.f9864t;
    }

    /* JADX INFO: renamed from: M0 */
    public final int m13264M0() {
        return this.f9861q;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m13265P0() {
        this.f9861q = AbstractC2368o.m8586m((int) (this.f9863s >> 32), C3173c.m11975n(this.f9864t), C3173c.m11973l(this.f9864t));
        int iM8586m = AbstractC2368o.m8586m((int) (this.f9863s & 4294967295L), C3173c.m11974m(this.f9864t), C3173c.m11972k(this.f9864t));
        this.f9862r = iM8586m;
        int i10 = this.f9861q;
        long j10 = this.f9863s;
        this.f9865u = C3185o.m12044d((((long) ((i10 - ((int) (j10 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM8586m - ((int) (j10 & 4294967295L))) / 2))));
    }

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo13238Q0(long j10, float f10, InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: S0 */
    public void mo13266S0(long j10, float f10, C8761c c8761c) {
        mo13238Q0(j10, f10, null);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m13267T0(long j10) {
        if (C3189s.m12084e(this.f9863s, j10)) {
            return;
        }
        this.f9863s = j10;
        m13265P0();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m13268V0(long j10) {
        if (C3173c.m11967f(this.f9864t, j10)) {
            return;
        }
        this.f9864t = j10;
        m13265P0();
    }

    /* JADX INFO: renamed from: j2.l1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class a implements InterfaceC3175e {

        /* JADX INFO: renamed from: q */
        public boolean f9866q;

        /* JADX INFO: renamed from: B */
        public static /* synthetic */ void m13269B(a aVar, AbstractC3545l1 abstractC3545l1, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: place-70tqf50");
                return;
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.m13293z(abstractC3545l1, j10, f10);
        }

        /* JADX INFO: renamed from: O */
        public static /* synthetic */ void m13270O(a aVar, AbstractC3545l1 abstractC3545l1, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: placeRelative");
                return;
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.m13282G(abstractC3545l1, i10, i11, f10);
        }

        /* JADX INFO: renamed from: Q */
        public static /* synthetic */ void m13271Q(a aVar, AbstractC3545l1 abstractC3545l1, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
                return;
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.m13283P(abstractC3545l1, j10, f10);
        }

        /* JADX INFO: renamed from: T */
        public static /* synthetic */ void m13272T(a aVar, AbstractC3545l1 abstractC3545l1, int i10, int i11, float f10, InterfaceC0184l interfaceC0184l, int i12, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
                return;
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                interfaceC0184l = AbstractC3549m1.f9869a;
            }
            aVar.m13284S(abstractC3545l1, i10, i11, f11, interfaceC0184l);
        }

        /* JADX INFO: renamed from: Z */
        public static /* synthetic */ void m13273Z(a aVar, AbstractC3545l1 abstractC3545l1, long j10, float f10, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
                return;
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                interfaceC0184l = AbstractC3549m1.f9869a;
            }
            aVar.m13285W(abstractC3545l1, j10, f11, interfaceC0184l);
        }

        /* JADX INFO: renamed from: d0 */
        public static /* synthetic */ void m13275d0(a aVar, AbstractC3545l1 abstractC3545l1, long j10, C8761c c8761c, float f10, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
                return;
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.m13286X(abstractC3545l1, j10, c8761c, f10);
        }

        /* JADX INFO: renamed from: g0 */
        public static /* synthetic */ void m13277g0(a aVar, AbstractC3545l1 abstractC3545l1, int i10, int i11, float f10, InterfaceC0184l interfaceC0184l, int i12, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: placeWithLayer");
                return;
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                interfaceC0184l = AbstractC3549m1.f9869a;
            }
            aVar.m13287f0(abstractC3545l1, i10, i11, f11, interfaceC0184l);
        }

        /* JADX INFO: renamed from: j0 */
        public static /* synthetic */ void m13278j0(a aVar, AbstractC3545l1 abstractC3545l1, long j10, float f10, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
                return;
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                interfaceC0184l = AbstractC3549m1.f9869a;
            }
            aVar.m13288h0(abstractC3545l1, j10, f11, interfaceC0184l);
        }

        /* JADX INFO: renamed from: q0 */
        public static /* synthetic */ void m13280q0(a aVar, AbstractC3545l1 abstractC3545l1, long j10, C8761c c8761c, float f10, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
                return;
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.m13289i0(abstractC3545l1, j10, c8761c, f10);
        }

        /* JADX INFO: renamed from: x */
        public static /* synthetic */ void m13281x(a aVar, AbstractC3545l1 abstractC3545l1, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: place");
                return;
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.m13292v(abstractC3545l1, i10, i11, f10);
        }

        /* JADX INFO: renamed from: G */
        public final void m13282G(AbstractC3545l1 abstractC3545l1, int i10, int i11, float f10) {
            long jM12044d = C3185o.m12044d((((long) i10) << 32) | (((long) i11) & 4294967295L));
            if (mo13131q() == EnumC3191u.f8484q || mo13132t() == 0) {
                m13291u(abstractC3545l1);
                abstractC3545l1.mo13238Q0(C3185o.m12053m(jM12044d, abstractC3545l1.f9865u), f10, null);
            } else {
                long jM12044d2 = C3185o.m12044d((((long) ((mo13132t() - abstractC3545l1.m13264M0()) - C3185o.m12049i(jM12044d))) << 32) | (((long) C3185o.m12050j(jM12044d)) & 4294967295L));
                m13291u(abstractC3545l1);
                abstractC3545l1.mo13238Q0(C3185o.m12053m(jM12044d2, abstractC3545l1.f9865u), f10, null);
            }
        }

        /* JADX INFO: renamed from: P */
        public final void m13283P(AbstractC3545l1 abstractC3545l1, long j10, float f10) {
            if (mo13131q() == EnumC3191u.f8484q || mo13132t() == 0) {
                m13291u(abstractC3545l1);
                abstractC3545l1.mo13238Q0(C3185o.m12053m(j10, abstractC3545l1.f9865u), f10, null);
                return;
            }
            int iMo13132t = (mo13132t() - abstractC3545l1.m13264M0()) - C3185o.m12049i(j10);
            long jM12044d = C3185o.m12044d((((long) C3185o.m12050j(j10)) & 4294967295L) | (((long) iMo13132t) << 32));
            m13291u(abstractC3545l1);
            abstractC3545l1.mo13238Q0(C3185o.m12053m(jM12044d, abstractC3545l1.f9865u), f10, null);
        }

        /* JADX INFO: renamed from: S */
        public final void m13284S(AbstractC3545l1 abstractC3545l1, int i10, int i11, float f10, InterfaceC0184l interfaceC0184l) {
            long jM12044d = C3185o.m12044d((((long) i10) << 32) | (((long) i11) & 4294967295L));
            if (mo13131q() == EnumC3191u.f8484q || mo13132t() == 0) {
                m13291u(abstractC3545l1);
                abstractC3545l1.mo13238Q0(C3185o.m12053m(jM12044d, abstractC3545l1.f9865u), f10, interfaceC0184l);
            } else {
                long jM12044d2 = C3185o.m12044d((((long) ((mo13132t() - abstractC3545l1.m13264M0()) - C3185o.m12049i(jM12044d))) << 32) | (((long) C3185o.m12050j(jM12044d)) & 4294967295L));
                m13291u(abstractC3545l1);
                abstractC3545l1.mo13238Q0(C3185o.m12053m(jM12044d2, abstractC3545l1.f9865u), f10, interfaceC0184l);
            }
        }

        /* JADX INFO: renamed from: W */
        public final void m13285W(AbstractC3545l1 abstractC3545l1, long j10, float f10, InterfaceC0184l interfaceC0184l) {
            if (mo13131q() == EnumC3191u.f8484q || mo13132t() == 0) {
                m13291u(abstractC3545l1);
                abstractC3545l1.mo13238Q0(C3185o.m12053m(j10, abstractC3545l1.f9865u), f10, interfaceC0184l);
                return;
            }
            int iMo13132t = (mo13132t() - abstractC3545l1.m13264M0()) - C3185o.m12049i(j10);
            long jM12044d = C3185o.m12044d((((long) C3185o.m12050j(j10)) & 4294967295L) | (((long) iMo13132t) << 32));
            m13291u(abstractC3545l1);
            abstractC3545l1.mo13238Q0(C3185o.m12053m(jM12044d, abstractC3545l1.f9865u), f10, interfaceC0184l);
        }

        /* JADX INFO: renamed from: X */
        public final void m13286X(AbstractC3545l1 abstractC3545l1, long j10, C8761c c8761c, float f10) {
            if (mo13131q() == EnumC3191u.f8484q || mo13132t() == 0) {
                m13291u(abstractC3545l1);
                abstractC3545l1.mo13266S0(C3185o.m12053m(j10, abstractC3545l1.f9865u), f10, c8761c);
                return;
            }
            int iMo13132t = (mo13132t() - abstractC3545l1.m13264M0()) - C3185o.m12049i(j10);
            long jM12044d = C3185o.m12044d((((long) C3185o.m12050j(j10)) & 4294967295L) | (((long) iMo13132t) << 32));
            m13291u(abstractC3545l1);
            abstractC3545l1.mo13266S0(C3185o.m12053m(jM12044d, abstractC3545l1.f9865u), f10, c8761c);
        }

        /* JADX INFO: renamed from: f0 */
        public final void m13287f0(AbstractC3545l1 abstractC3545l1, int i10, int i11, float f10, InterfaceC0184l interfaceC0184l) {
            long jM12044d = C3185o.m12044d((((long) i11) & 4294967295L) | (((long) i10) << 32));
            m13291u(abstractC3545l1);
            abstractC3545l1.mo13238Q0(C3185o.m12053m(jM12044d, abstractC3545l1.f9865u), f10, interfaceC0184l);
        }

        /* JADX INFO: renamed from: h0 */
        public final void m13288h0(AbstractC3545l1 abstractC3545l1, long j10, float f10, InterfaceC0184l interfaceC0184l) {
            m13291u(abstractC3545l1);
            abstractC3545l1.mo13238Q0(C3185o.m12053m(j10, abstractC3545l1.f9865u), f10, interfaceC0184l);
        }

        /* JADX INFO: renamed from: i0 */
        public final void m13289i0(AbstractC3545l1 abstractC3545l1, long j10, C8761c c8761c, float f10) {
            m13291u(abstractC3545l1);
            abstractC3545l1.mo13266S0(C3185o.m12053m(j10, abstractC3545l1.f9865u), f10, c8761c);
        }

        /* JADX INFO: renamed from: q */
        public abstract EnumC3191u mo13131q();

        /* JADX INFO: renamed from: r0 */
        public final void m13290r0(InterfaceC0184l interfaceC0184l) {
            this.f9866q = true;
            interfaceC0184l.mo27m(this);
            this.f9866q = false;
        }

        /* JADX INFO: renamed from: t */
        public abstract int mo13132t();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: u */
        public final void m13291u(AbstractC3545l1 abstractC3545l1) {
            if (abstractC3545l1 instanceof InterfaceC4519a1) {
                ((InterfaceC4519a1) abstractC3545l1).mo17523i0(this.f9866q);
            }
        }

        /* JADX INFO: renamed from: v */
        public final void m13292v(AbstractC3545l1 abstractC3545l1, int i10, int i11, float f10) {
            long jM12044d = C3185o.m12044d((((long) i11) & 4294967295L) | (((long) i10) << 32));
            m13291u(abstractC3545l1);
            abstractC3545l1.mo13238Q0(C3185o.m12053m(jM12044d, abstractC3545l1.f9865u), f10, null);
        }

        /* JADX INFO: renamed from: z */
        public final void m13293z(AbstractC3545l1 abstractC3545l1, long j10, float f10) {
            m13291u(abstractC3545l1);
            abstractC3545l1.mo13238Q0(C3185o.m12053m(j10, abstractC3545l1.f9865u), f10, null);
        }

        /* JADX INFO: renamed from: o */
        public float mo13234o(AbstractC3571t1 abstractC3571t1, float f10) {
            return f10;
        }
    }
}
