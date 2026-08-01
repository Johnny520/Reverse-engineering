package p148k;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p117i.AbstractC3044c1;
import p117i.C3082r0;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3533i1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p163l.AbstractC4322l;
import p163l.AbstractC4336n3;
import p163l.AbstractC4350q2;
import p163l.C4295f2;
import p163l.InterfaceC4303h0;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4606z0;
import p172l8.C4700i0;
import p221p1.AbstractC5923f;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3876g implements InterfaceC3874f {

    /* JADX INFO: renamed from: a */
    public final C4295f2 f11122a;

    /* JADX INFO: renamed from: b */
    public InterfaceC4499e f11123b;

    /* JADX INFO: renamed from: c */
    public EnumC3191u f11124c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0512i2 f11125d = AbstractC0522j5.m1773e(C3189s.m12081b(C3189s.f8481b.m12088a()), null, 2, null);

    /* JADX INFO: renamed from: e */
    public final C3082r0 f11126e = AbstractC3044c1.m11262b();

    /* JADX INFO: renamed from: f */
    public InterfaceC0564p5 f11127f;

    /* JADX INFO: renamed from: k.g$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002BE\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m16758d2 = {"Lk/g$b;", "S", "Ll2/z0;", "Lk/g$c;", "Ll/f2$a;", "Li3/s;", "Ll/p;", "Ll/f2;", "sizeAnimation", "Landroidx/compose/runtime/p5;", "Lk/j0;", "sizeTransform", "Lk/g;", "scope", "<init>", "(Ll/f2$a;Landroidx/compose/runtime/p5;Lk/g;)V", "m", "()Lk/g$c;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "node", "Ll8/i0;", "n", "(Lk/g$c;)V", "b", "Ll/f2$a;", "getSizeAnimation", "()Ll/f2$a;", "c", "Landroidx/compose/runtime/p5;", "getSizeTransform", "()Landroidx/compose/runtime/p5;", "d", "Lk/g;", "getScope", "()Lk/g;", "animation"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
    public static final class b<S> extends AbstractC4606z0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final C4295f2.a sizeAnimation;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final InterfaceC0564p5 sizeTransform;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final C3876g scope;

        public b(C4295f2.a aVar, InterfaceC0564p5 interfaceC0564p5, C3876g c3876g) {
            this.sizeAnimation = aVar;
            this.sizeTransform = interfaceC0564p5;
            this.scope = c3876g;
        }

        public boolean equals(Object other) {
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC1061t.m3842c(bVar.sizeAnimation, this.sizeAnimation) && AbstractC1061t.m3842c(bVar.sizeTransform, this.sizeTransform);
        }

        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            C4295f2.a aVar = this.sizeAnimation;
            return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.sizeTransform.hashCode();
        }

        @Override // p166l2.AbstractC4606z0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public c mo1191j() {
            return new c(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        @Override // p166l2.AbstractC4606z0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo1192k(c node) {
            node.m15373L2(this.sizeAnimation);
            node.m15374M2(this.sizeTransform);
            node.m15372K2(this.scope);
        }
    }

    /* JADX INFO: renamed from: k.g$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC3871d0 {

        /* JADX INFO: renamed from: G */
        public C4295f2.a f11132G;

        /* JADX INFO: renamed from: H */
        public InterfaceC0564p5 f11133H;

        /* JADX INFO: renamed from: I */
        public C3876g f11134I;

        /* JADX INFO: renamed from: J */
        public long f11135J = AbstractC3866b.f11067a;

        /* JADX INFO: renamed from: k.g$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ AbstractC3545l1 f11137s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ long f11138t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC3545l1 abstractC3545l1, long j10) {
                super(1);
                this.f11137s = abstractC3545l1;
                this.f11138t = j10;
            }

            /* JADX INFO: renamed from: a */
            public final void m15376a(AbstractC3545l1.a aVar) {
                AbstractC3545l1.a.m13269B(aVar, this.f11137s, c.this.m15369H2().m15358h().mo17411a(C3189s.m12082c((((long) this.f11137s.m13264M0()) << 32) | (((long) this.f11137s.m13259G0()) & 4294967295L)), this.f11138t, EnumC3191u.f8484q), 0.0f, 2, null);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                m15376a((AbstractC3545l1.a) obj);
                return C4700i0.f13910a;
            }
        }

        /* JADX INFO: renamed from: k.g$c$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ long f11140s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j10) {
                super(1);
                this.f11140s = j10;
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4303h0 mo27m(C4295f2.b bVar) {
                long jM12087h;
                InterfaceC4303h0 interfaceC4303h0Mo15425b;
                boolean zM3842c = AbstractC1061t.m3842c(bVar.mo15355a(), c.this.m15369H2().mo15355a());
                c cVar = c.this;
                if (zM3842c) {
                    jM12087h = cVar.m15371J2(this.f11140s);
                } else {
                    InterfaceC0564p5 interfaceC0564p5 = (InterfaceC0564p5) cVar.m15369H2().m15359i().m11238e(bVar.mo15355a());
                    jM12087h = interfaceC0564p5 != null ? ((C3189s) interfaceC0564p5.getValue()).m12087h() : C3189s.f8481b.m12088a();
                }
                InterfaceC0564p5 interfaceC0564p52 = (InterfaceC0564p5) c.this.m15369H2().m15359i().m11238e(bVar.mo15356c());
                long jM12087h2 = interfaceC0564p52 != null ? ((C3189s) interfaceC0564p52.getValue()).m12087h() : C3189s.f8481b.m12088a();
                InterfaceC3883j0 interfaceC3883j0 = (InterfaceC3883j0) c.this.m15370I2().getValue();
                return (interfaceC3883j0 == null || (interfaceC4303h0Mo15425b = interfaceC3883j0.mo15425b(jM12087h, jM12087h2)) == null) ? AbstractC4322l.m16974j(0.0f, 400.0f, null, 5, null) : interfaceC4303h0Mo15425b;
            }
        }

        /* JADX INFO: renamed from: k.g$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10129c extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ long f11142s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10129c(long j10) {
                super(1);
                this.f11142s = j10;
            }

            /* JADX INFO: renamed from: a */
            public final long m15378a(Object obj) {
                boolean zM3842c = AbstractC1061t.m3842c(obj, c.this.m15369H2().mo15355a());
                c cVar = c.this;
                if (zM3842c) {
                    return cVar.m15371J2(this.f11142s);
                }
                InterfaceC0564p5 interfaceC0564p5 = (InterfaceC0564p5) cVar.m15369H2().m15359i().m11238e(obj);
                return interfaceC0564p5 != null ? ((C3189s) interfaceC0564p5.getValue()).m12087h() : C3189s.f8481b.m12088a();
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                return C3189s.m12081b(m15378a(obj));
            }
        }

        public c(C4295f2.a aVar, InterfaceC0564p5 interfaceC0564p5, C3876g c3876g) {
            this.f11132G = aVar;
            this.f11133H = interfaceC0564p5;
            this.f11134I = c3876g;
        }

        /* JADX INFO: renamed from: H2 */
        public final C3876g m15369H2() {
            return this.f11134I;
        }

        /* JADX INFO: renamed from: I2 */
        public final InterfaceC0564p5 m15370I2() {
            return this.f11133H;
        }

        /* JADX INFO: renamed from: J2 */
        public final long m15371J2(long j10) {
            return C3189s.m12084e(this.f11135J, AbstractC3866b.f11067a) ? j10 : this.f11135J;
        }

        /* JADX INFO: renamed from: K2 */
        public final void m15372K2(C3876g c3876g) {
            this.f11134I = c3876g;
        }

        /* JADX INFO: renamed from: L2 */
        public final void m15373L2(C4295f2.a aVar) {
            this.f11132G = aVar;
        }

        /* JADX INFO: renamed from: M2 */
        public final void m15374M2(InterfaceC0564p5 interfaceC0564p5) {
            this.f11133H = interfaceC0564p5;
        }

        @Override // p166l2.InterfaceC4534e0
        /* JADX INFO: renamed from: d */
        public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
            long jM12087h;
            AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(j10);
            if (interfaceC3561q0.mo1232g1()) {
                jM12087h = C3189s.m12082c((((long) abstractC3545l1Mo13148X.m13264M0()) << 32) | (((long) abstractC3545l1Mo13148X.m13259G0()) & 4294967295L));
            } else if (this.f11132G == null) {
                jM12087h = C3189s.m12082c((((long) abstractC3545l1Mo13148X.m13264M0()) << 32) | (((long) abstractC3545l1Mo13148X.m13259G0()) & 4294967295L));
                this.f11135J = C3189s.m12082c((((long) abstractC3545l1Mo13148X.m13264M0()) << 32) | (((long) abstractC3545l1Mo13148X.m13259G0()) & 4294967295L));
            } else {
                long jM12082c = C3189s.m12082c((((long) abstractC3545l1Mo13148X.m13264M0()) << 32) | (((long) abstractC3545l1Mo13148X.m13259G0()) & 4294967295L));
                C4295f2.a aVar = this.f11132G;
                aVar.getClass();
                InterfaceC0564p5 interfaceC0564p5M16892a = aVar.m16892a(new b(jM12082c), new C10129c(jM12082c));
                this.f11134I.m15360j(interfaceC0564p5M16892a);
                jM12087h = ((C3189s) interfaceC0564p5M16892a.getValue()).m12087h();
                this.f11135J = ((C3189s) interfaceC0564p5M16892a.getValue()).m12087h();
            }
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, (int) (jM12087h >> 32), (int) (jM12087h & 4294967295L), null, new a(abstractC3545l1Mo13148X, jM12087h), 4, null);
        }

        @Override // p165l1.InterfaceC4507m.c
        /* JADX INFO: renamed from: r2 */
        public void mo15375r2() {
            super.mo15375r2();
            this.f11135J = AbstractC3866b.f11067a;
        }
    }

    public C3876g(C4295f2 c4295f2, InterfaceC4499e interfaceC4499e, EnumC3191u enumC3191u) {
        this.f11122a = c4295f2;
        this.f11123b = interfaceC4499e;
        this.f11124c = enumC3191u;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m15353f(InterfaceC0512i2 interfaceC0512i2) {
        return ((Boolean) interfaceC0512i2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static final void m15354g(InterfaceC0512i2 interfaceC0512i2, boolean z10) {
        interfaceC0512i2.setValue(Boolean.valueOf(z10));
    }

    @Override // p163l.C4295f2.b
    /* JADX INFO: renamed from: a */
    public Object mo15355a() {
        return this.f11122a.m16882q().mo15355a();
    }

    @Override // p163l.C4295f2.b
    /* JADX INFO: renamed from: c */
    public Object mo15356c() {
        return this.f11122a.m16882q().mo15356c();
    }

    @Override // p148k.InterfaceC3874f
    /* JADX INFO: renamed from: d */
    public C3892o mo15349d(C3892o c3892o, InterfaceC3883j0 interfaceC3883j0) {
        c3892o.m15454e(interfaceC3883j0);
        return c3892o;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC4507m m15357e(C3892o c3892o, InterfaceC0572r interfaceC0572r, int i10) {
        InterfaceC4507m interfaceC4507m;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:557)");
        }
        boolean zMo2162U = interfaceC0572r.mo2162U(this);
        Object objMo2170f = interfaceC0572r.mo2170f();
        C4295f2.a aVarM17097l = null;
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC0512i2 interfaceC0512i2 = (InterfaceC0512i2) objMo2170f;
        InterfaceC0564p5 interfaceC0564p5M1577p = AbstractC0473c5.m1577p(c3892o.m15451b(), interfaceC0572r, 0);
        if (AbstractC1061t.m3842c(this.f11122a.m16877l(), this.f11122a.m16884s())) {
            m15354g(interfaceC0512i2, false);
        } else if (interfaceC0564p5M1577p.getValue() != null) {
            m15354g(interfaceC0512i2, true);
        }
        if (m15353f(interfaceC0512i2)) {
            interfaceC0572r.mo2163V(1353180665);
            aVarM17097l = AbstractC4350q2.m17097l(this.f11122a, AbstractC4336n3.m17030y(C3189s.f8481b), null, interfaceC0572r, 0, 2);
            boolean zMo2162U2 = interfaceC0572r.mo2162U(aVarM17097l);
            Object objMo2170f2 = interfaceC0572r.mo2170f();
            if (zMo2162U2 || objMo2170f2 == InterfaceC0572r.f1573a.m2191a()) {
                InterfaceC3883j0 interfaceC3883j0 = (InterfaceC3883j0) interfaceC0564p5M1577p.getValue();
                objMo2170f2 = (interfaceC3883j0 == null || interfaceC3883j0.mo15424a()) ? AbstractC5923f.m23837b(InterfaceC4507m.f13080a) : InterfaceC4507m.f13080a;
                interfaceC0572r.mo2153L(objMo2170f2);
            }
            interfaceC4507m = (InterfaceC4507m) objMo2170f2;
            interfaceC0572r.mo2152K();
        } else {
            interfaceC0572r.mo2163V(1353446707);
            interfaceC0572r.mo2152K();
            this.f11127f = null;
            interfaceC4507m = InterfaceC4507m.f13080a;
        }
        InterfaceC4507m interfaceC4507mMo17445i = interfaceC4507m.mo17445i(new b(aVarM17097l, interfaceC0564p5M1577p, this));
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC4507mMo17445i;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC4499e m15358h() {
        return this.f11123b;
    }

    /* JADX INFO: renamed from: i */
    public final C3082r0 m15359i() {
        return this.f11126e;
    }

    /* JADX INFO: renamed from: j */
    public final void m15360j(InterfaceC0564p5 interfaceC0564p5) {
        this.f11127f = interfaceC0564p5;
    }

    /* JADX INFO: renamed from: k */
    public void m15361k(InterfaceC4499e interfaceC4499e) {
        this.f11123b = interfaceC4499e;
    }

    /* JADX INFO: renamed from: l */
    public final void m15362l(EnumC3191u enumC3191u) {
        this.f11124c = enumC3191u;
    }

    /* JADX INFO: renamed from: m */
    public final void m15363m(long j10) {
        this.f11125d.setValue(C3189s.m12081b(j10));
    }

    /* JADX INFO: renamed from: k.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC3533i1 {

        /* JADX INFO: renamed from: b */
        public final InterfaceC0512i2 f11128b;

        public a(boolean z10) {
            this.f11128b = AbstractC0522j5.m1773e(Boolean.valueOf(z10), null, 2, null);
        }

        /* JADX INFO: renamed from: j */
        public final boolean m15364j() {
            return ((Boolean) this.f11128b.getValue()).booleanValue();
        }

        /* JADX INFO: renamed from: k */
        public final void m15365k(boolean z10) {
            this.f11128b.setValue(Boolean.valueOf(z10));
        }

        @Override // p135j2.InterfaceC3533i1
        /* JADX INFO: renamed from: l */
        public Object mo3204l(InterfaceC3175e interfaceC3175e, Object obj) {
            return this;
        }
    }
}
