package p221p1;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p120i2.AbstractC3167a;
import p121i3.AbstractC3190t;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4547h1;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4563l1;
import p166l2.AbstractC4590u;
import p166l2.InterfaceC4559k1;
import p172l8.C4700i0;
import p215oc.C5706c;
import p265s1.InterfaceC7064d2;
import p290u1.InterfaceC8484c;

/* JADX INFO: renamed from: p1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5921d extends InterfaceC4507m.c implements InterfaceC5920c, InterfaceC4559k1, InterfaceC5919b {

    /* JADX INFO: renamed from: F */
    public final C5922e f18815F;

    /* JADX INFO: renamed from: G */
    public boolean f18816G;

    /* JADX INFO: renamed from: H */
    public C5938u f18817H;

    /* JADX INFO: renamed from: I */
    public InterfaceC0184l f18818I;

    /* JADX INFO: renamed from: p1.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {
        public a() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7064d2 invoke() {
            return C5921d.this.m23822H2();
        }
    }

    /* JADX INFO: renamed from: p1.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C5922e f18821s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5922e c5922e) {
            super(0);
            this.f18821s = c5922e;
        }

        /* JADX INFO: renamed from: a */
        public final void m23826a() {
            C5921d.this.m23821G2().mo27m(this.f18821s);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23826a();
            return C4700i0.f13910a;
        }
    }

    public C5921d(C5922e c5922e, InterfaceC0184l interfaceC0184l) {
        this.f18815F = c5922e;
        this.f18818I = interfaceC0184l;
        c5922e.m23831o(this);
        c5922e.m23834u(new a());
    }

    /* JADX INFO: renamed from: G2 */
    public final InterfaceC0184l m23821G2() {
        return this.f18818I;
    }

    /* JADX INFO: renamed from: H2 */
    public final InterfaceC7064d2 m23822H2() {
        C5938u c5938u = this.f18817H;
        if (c5938u == null) {
            c5938u = new C5938u();
            this.f18817H = c5938u;
        }
        if (c5938u.m23874c() == null) {
            c5938u.m23876e(AbstractC4557k.m18012n(this));
        }
        return c5938u;
    }

    /* JADX INFO: renamed from: I2 */
    public final C5928k m23823I2(InterfaceC8484c interfaceC8484c) {
        if (!this.f18816G) {
            C5922e c5922e = this.f18815F;
            c5922e.m23833t(null);
            c5922e.m23832q(interfaceC8484c);
            AbstractC4563l1.m18046a(this, new b(c5922e));
            if (c5922e.m23828d() == null) {
                AbstractC3167a.m11957c("DrawResult not defined, did you forget to call onDraw?");
                C5706c.m23089a();
                return null;
            }
            this.f18816G = true;
        }
        C5928k c5928kM23828d = this.f18815F.m23828d();
        c5928kM23828d.getClass();
        return c5928kM23828d;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m23824J2(InterfaceC0184l interfaceC0184l) {
        this.f18818I = interfaceC0184l;
        mo23820Z();
    }

    @Override // p166l2.InterfaceC4587t
    /* JADX INFO: renamed from: K0 */
    public void mo17549K0() {
        mo23820Z();
    }

    @Override // p166l2.InterfaceC4553j
    /* JADX INFO: renamed from: Q0 */
    public void mo17828Q0() {
        mo23820Z();
    }

    @Override // p221p1.InterfaceC5920c
    /* JADX INFO: renamed from: Z */
    public void mo23820Z() {
        C5938u c5938u = this.f18817H;
        if (c5938u != null) {
            c5938u.m23875d();
        }
        this.f18816G = false;
        this.f18815F.m23833t(null);
        AbstractC4590u.m18259a(this);
    }

    @Override // p221p1.InterfaceC5919b
    /* JADX INFO: renamed from: b */
    public long mo17555b() {
        return AbstractC3190t.m12092d(AbstractC4557k.m18010l(this, AbstractC4547h1.m17812a(4)).mo13242a());
    }

    @Override // p221p1.InterfaceC5919b
    public InterfaceC3175e getDensity() {
        return AbstractC4557k.m18011m(this);
    }

    @Override // p221p1.InterfaceC5919b
    public EnumC3191u getLayoutDirection() {
        return AbstractC4557k.m18014p(this);
    }

    @Override // p166l2.InterfaceC4587t
    /* JADX INFO: renamed from: o */
    public void mo1376o(InterfaceC8484c interfaceC8484c) {
        m23823I2(interfaceC8484c).m23845a().mo27m(interfaceC8484c);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        super.mo1378q2();
        C5938u c5938u = this.f18817H;
        if (c5938u != null) {
            c5938u.m23875d();
        }
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: r2 */
    public void mo15375r2() {
        super.mo15375r2();
        mo23820Z();
    }

    @Override // p166l2.InterfaceC4559k1
    /* JADX INFO: renamed from: s1 */
    public void mo18018s1() {
        mo23820Z();
    }

    @Override // p166l2.InterfaceC4553j, p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: u */
    public void mo8056u() {
        mo23820Z();
    }
}
