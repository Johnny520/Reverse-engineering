package p142j9;

import java.util.Collection;
import la.AbstractC4726f;
import la.C4723c;
import la.C4728h;
import ma.AbstractC5140a;
import na.C5530e;
import na.C5533h;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p024b9.C1055q;
import p037cb.C1481k0;
import p098g9.InterfaceC2557k;
import p128ia.C3368a;
import p142j9.AbstractC3659b3;
import p142j9.AbstractC3672e1;
import p143ja.C3780m;
import p143ja.C3782o;
import p143ja.C3788u;
import p172l8.AbstractC4706m;
import p172l8.C4711r;
import p172l8.C4716w;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5114x;
import p213oa.C5695f;
import p229p9.InterfaceC6055y0;
import p298u9.C8571f;
import p299ub.AbstractC8611a0;
import p313v9.AbstractC8865f;
import p342x9.EnumC9470d;
import qa.AbstractC6353j;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: j9.w1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3754w1 extends AbstractC3672e1 {

    /* JADX INFO: renamed from: t */
    public final Class f10330t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC4705l f10331u;

    /* JADX INFO: renamed from: j9.w1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a extends AbstractC3672e1.b {

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ InterfaceC2557k[] f10332j = {AbstractC1052o0.m3814i(new C1038h0(a.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0)), AbstractC1052o0.m3814i(new C1038h0(a.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)), AbstractC1052o0.m3814i(new C1038h0(a.class, "members", "getMembers()Ljava/util/Collection;", 0))};

        /* JADX INFO: renamed from: d */
        public final AbstractC3659b3.a f10333d;

        /* JADX INFO: renamed from: e */
        public final AbstractC3659b3.a f10334e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC4705l f10335f;

        /* JADX INFO: renamed from: g */
        public final InterfaceC4705l f10336g;

        /* JADX INFO: renamed from: h */
        public final AbstractC3659b3.a f10337h;

        public a() {
            super();
            this.f10333d = AbstractC3659b3.m13645b(new C3734r1(C3754w1.this));
            this.f10334e = AbstractC3659b3.m13645b(new C3738s1(this));
            EnumC4708o enumC4708o = EnumC4708o.f13922r;
            this.f10335f = AbstractC4706m.m18788b(enumC4708o, new C3742t1(this, C3754w1.this));
            this.f10336g = AbstractC4706m.m18788b(enumC4708o, new C3746u1(this));
            this.f10337h = AbstractC3659b3.m13645b(new C3750v1(C3754w1.this, this));
        }

        /* JADX INFO: renamed from: n */
        public static final C8571f m13887n(C3754w1 c3754w1) {
            return C8571f.f28610c.m32986a(c3754w1.mo3775b());
        }

        /* JADX INFO: renamed from: o */
        public static final Collection m13888o(C3754w1 c3754w1, a aVar) {
            return c3754w1.m13673E(aVar.m13896m(), AbstractC3672e1.d.f10181q);
        }

        /* JADX INFO: renamed from: p */
        public static final C4716w m13889p(a aVar) {
            C3368a c3368aMo10733b;
            C8571f c8571fM13892i = aVar.m13892i();
            if (c8571fM13892i != null && (c3368aMo10733b = c8571fM13892i.mo10733b()) != null) {
                String[] strArrM12590a = c3368aMo10733b.m12590a();
                String[] strArrM12596g = c3368aMo10733b.m12596g();
                if (strArrM12590a != null && strArrM12596g != null) {
                    C4711r c4711rM22549m = C5533h.m22549m(strArrM12590a, strArrM12596g);
                    return new C4716w((C5530e) c4711rM22549m.m18792a(), (C3780m) c4711rM22549m.m18793b(), c3368aMo10733b.m12593d());
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: q */
        public static final Class m13890q(a aVar, C3754w1 c3754w1) {
            C3368a c3368aMo10733b;
            C8571f c8571fM13892i = aVar.m13892i();
            String strM12594e = (c8571fM13892i == null || (c3368aMo10733b = c8571fM13892i.mo10733b()) == null) ? null : c3368aMo10733b.m12594e();
            if (strM12594e == null || strM12594e.length() <= 0) {
                return null;
            }
            return c3754w1.mo3775b().getClassLoader().loadClass(AbstractC8611a0.m33068M(strM12594e, '/', '.', false, 4, null));
        }

        /* JADX INFO: renamed from: r */
        public static final InterfaceC9913k m13891r(a aVar) {
            C8571f c8571fM13892i = aVar.m13892i();
            return c8571fM13892i != null ? aVar.m13691b().m32993c().m32970a(c8571fM13892i) : InterfaceC9913k.b.f33436b;
        }

        /* JADX INFO: renamed from: i */
        public final C8571f m13892i() {
            return (C8571f) this.f10333d.m13649c(this, f10332j[0]);
        }

        /* JADX INFO: renamed from: j */
        public final Collection m13893j() {
            Object objM13649c = this.f10337h.m13649c(this, f10332j[2]);
            objM13649c.getClass();
            return (Collection) objM13649c;
        }

        /* JADX INFO: renamed from: k */
        public final C4716w m13894k() {
            return (C4716w) this.f10336g.getValue();
        }

        /* JADX INFO: renamed from: l */
        public final Class m13895l() {
            return (Class) this.f10335f.getValue();
        }

        /* JADX INFO: renamed from: m */
        public final InterfaceC9913k m13896m() {
            Object objM13649c = this.f10334e.m13649c(this, f10332j[1]);
            objM13649c.getClass();
            return (InterfaceC9913k) objM13649c;
        }
    }

    /* JADX INFO: renamed from: j9.w1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b extends C1055q implements InterfaceC0188p {

        /* JADX INFO: renamed from: y */
        public static final b f10339y = new b();

        public b() {
            super(2, C1481k0.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6055y0 invoke(C1481k0 c1481k0, C3782o c3782o) {
            c1481k0.getClass();
            c3782o.getClass();
            return c1481k0.m5807u(c3782o);
        }
    }

    public C3754w1(Class cls) {
        cls.getClass();
        this.f10330t = cls;
        this.f10331u = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C3730q1(this));
    }

    /* JADX INFO: renamed from: N */
    public static final a m13880N(C3754w1 c3754w1) {
        return c3754w1.new a();
    }

    @Override // p142j9.AbstractC3672e1
    /* JADX INFO: renamed from: B */
    public Collection mo13670B() {
        return AbstractC5114x.m20800o();
    }

    @Override // p142j9.AbstractC3672e1
    /* JADX INFO: renamed from: C */
    public Collection mo13671C(C5695f c5695f) {
        c5695f.getClass();
        return m13881O().mo5513a(c5695f, EnumC9470d.f32180x);
    }

    @Override // p142j9.AbstractC3672e1
    /* JADX INFO: renamed from: D */
    public InterfaceC6055y0 mo13672D(int i10) {
        C4716w c4716wM13894k = ((a) this.f10331u.getValue()).m13894k();
        if (c4716wM13894k != null) {
            C5530e c5530e = (C5530e) c4716wM13894k.m18809a();
            C3780m c3780m = (C3780m) c4716wM13894k.m18810b();
            C4723c c4723c = (C4723c) c4716wM13894k.m18811c();
            AbstractC6353j.f fVar = AbstractC5140a.f15662n;
            fVar.getClass();
            C3782o c3782o = (C3782o) AbstractC4726f.m18873b(c3780m, fVar, i10);
            if (c3782o != null) {
                Class clsMo3775b = mo3775b();
                C3788u c3788uM14555V = c3780m.m14555V();
                c3788uM14555V.getClass();
                return (InterfaceC6055y0) AbstractC3714m3.m13811h(clsMo3775b, c3782o, c5530e, new C4728h(c3788uM14555V), c4723c, b.f10339y);
            }
        }
        return null;
    }

    @Override // p142j9.AbstractC3672e1
    /* JADX INFO: renamed from: F */
    public Class mo13674F() {
        Class clsM13895l = ((a) this.f10331u.getValue()).m13895l();
        return clsM13895l == null ? mo3775b() : clsM13895l;
    }

    @Override // p142j9.AbstractC3672e1
    /* JADX INFO: renamed from: G */
    public Collection mo13675G(C5695f c5695f) {
        c5695f.getClass();
        return m13881O().mo5515c(c5695f, EnumC9470d.f32180x);
    }

    /* JADX INFO: renamed from: O */
    public final InterfaceC9913k m13881O() {
        return ((a) this.f10331u.getValue()).m13896m();
    }

    @Override // p024b9.InterfaceC1037h
    /* JADX INFO: renamed from: b */
    public Class mo3775b() {
        return this.f10330t;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3754w1) && AbstractC1061t.m3842c(mo3775b(), ((C3754w1) obj).mo3775b());
    }

    public int hashCode() {
        return mo3775b().hashCode();
    }

    @Override // p098g9.InterfaceC2551e
    /* JADX INFO: renamed from: t */
    public Collection mo3776t() {
        return ((a) this.f10331u.getValue()).m13893j();
    }

    public String toString() {
        return "file class " + AbstractC8865f.m34029e(mo3775b()).m22982a();
    }
}
