package p142j9;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import ma.AbstractC5140a;
import na.AbstractC5529d;
import na.C5533h;
import p024b9.AbstractC1033f;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p098g9.InterfaceC2552f;
import p098g9.InterfaceC2553g;
import p098g9.InterfaceC2557k;
import p110h9.C2900b;
import p127i9.AbstractC3363a;
import p142j9.AbstractC3659b3;
import p142j9.AbstractC3724p;
import p158k9.AbstractC4217o;
import p158k9.InterfaceC4210h;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p215oc.C5729x;
import p229p9.InterfaceC5985a1;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6053x0;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6057z0;
import p243q9.InterfaceC6333h;
import p273s9.C7224l0;
import p273s9.C7226m0;
import p358y9.AbstractC9637o;
import sa.AbstractC7258h;

/* JADX INFO: renamed from: j9.l2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3708l2 extends AbstractC3656b0 implements InterfaceC2557k {

    /* JADX INFO: renamed from: C */
    public static final b f10236C = new b(null);

    /* JADX INFO: renamed from: D */
    public static final Object f10237D = new Object();

    /* JADX INFO: renamed from: A */
    public final InterfaceC4705l f10238A;

    /* JADX INFO: renamed from: B */
    public final AbstractC3659b3.a f10239B;

    /* JADX INFO: renamed from: w */
    public final AbstractC3672e1 f10240w;

    /* JADX INFO: renamed from: x */
    public final String f10241x;

    /* JADX INFO: renamed from: y */
    public final String f10242y;

    /* JADX INFO: renamed from: z */
    public final Object f10243z;

    /* JADX INFO: renamed from: j9.l2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class a extends AbstractC3656b0 implements InterfaceC2552f, InterfaceC2557k.a {
        @Override // p098g9.InterfaceC2552f
        /* JADX INFO: renamed from: A */
        public boolean mo3818A() {
            return mo13792Z().mo24117A();
        }

        @Override // p142j9.AbstractC3656b0
        /* JADX INFO: renamed from: S */
        public AbstractC3672e1 mo13638S() {
            return mo13658a0().mo13638S();
        }

        @Override // p142j9.AbstractC3656b0
        /* JADX INFO: renamed from: T */
        public InterfaceC4210h mo13639T() {
            return null;
        }

        @Override // p142j9.AbstractC3656b0
        /* JADX INFO: renamed from: X */
        public boolean mo13643X() {
            return mo13658a0().mo13643X();
        }

        /* JADX INFO: renamed from: Z */
        public abstract InterfaceC6053x0 mo13792Z();

        /* JADX INFO: renamed from: a0 */
        public abstract AbstractC3708l2 mo13658a0();

        @Override // p098g9.InterfaceC2552f
        /* JADX INFO: renamed from: k */
        public boolean mo3819k() {
            return mo13792Z().mo7422k();
        }

        @Override // p098g9.InterfaceC2548b
        /* JADX INFO: renamed from: n */
        public boolean mo3783n() {
            return mo13792Z().mo7423n();
        }

        @Override // p098g9.InterfaceC2552f
        /* JADX INFO: renamed from: u */
        public boolean mo3820u() {
            return mo13792Z().mo24121u();
        }
    }

    /* JADX INFO: renamed from: j9.l2$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class c extends a implements InterfaceC2557k.b {

        /* JADX INFO: renamed from: y */
        public static final /* synthetic */ InterfaceC2557k[] f10244y = {AbstractC1052o0.m3814i(new C1038h0(c.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

        /* JADX INFO: renamed from: w */
        public final AbstractC3659b3.a f10245w = AbstractC3659b3.m13645b(new C3713m2(this));

        /* JADX INFO: renamed from: x */
        public final InterfaceC4705l f10246x = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C3718n2(this));

        /* JADX INFO: renamed from: d0 */
        public static final InterfaceC4210h m13795d0(c cVar) {
            return AbstractC3731q2.m13862b(cVar, true);
        }

        /* JADX INFO: renamed from: e0 */
        public static final InterfaceC6057z0 m13796e0(c cVar) {
            InterfaceC6057z0 interfaceC6057z0Mo12676h = cVar.mo13658a0().mo13792Z().mo12676h();
            if (interfaceC6057z0Mo12676h != null) {
                return interfaceC6057z0Mo12676h;
            }
            C7224l0 c7224l0M28720d = AbstractC7258h.m28720d(cVar.mo13658a0().mo13792Z(), InterfaceC6333h.f19873o.m25003b());
            c7224l0M28720d.getClass();
            return c7224l0M28720d;
        }

        @Override // p142j9.AbstractC3656b0
        /* JADX INFO: renamed from: R */
        public InterfaceC4210h mo13637R() {
            return (InterfaceC4210h) this.f10246x.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && AbstractC1061t.m3842c(mo13658a0(), ((c) obj).mo13658a0());
        }

        @Override // p142j9.AbstractC3708l2.a
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public InterfaceC6057z0 mo13792Z() {
            Object objM13649c = this.f10245w.m13649c(this, f10244y[0]);
            objM13649c.getClass();
            return (InterfaceC6057z0) objM13649c;
        }

        @Override // p098g9.InterfaceC2548b
        public String getName() {
            return "<get-" + mo13658a0().getName() + '>';
        }

        public int hashCode() {
            return mo13658a0().hashCode();
        }

        public String toString() {
            return "getter of " + mo13658a0();
        }
    }

    /* JADX INFO: renamed from: j9.l2$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class d extends a implements InterfaceC2553g.a {

        /* JADX INFO: renamed from: y */
        public static final /* synthetic */ InterfaceC2557k[] f10247y = {AbstractC1052o0.m3814i(new C1038h0(d.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

        /* JADX INFO: renamed from: w */
        public final AbstractC3659b3.a f10248w = AbstractC3659b3.m13645b(new C3723o2(this));

        /* JADX INFO: renamed from: x */
        public final InterfaceC4705l f10249x = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C3727p2(this));

        /* JADX INFO: renamed from: d0 */
        public static final InterfaceC4210h m13800d0(d dVar) {
            return AbstractC3731q2.m13862b(dVar, false);
        }

        /* JADX INFO: renamed from: e0 */
        public static final InterfaceC5985a1 m13801e0(d dVar) {
            InterfaceC5985a1 interfaceC5985a1Mo12677i = dVar.mo13658a0().mo13792Z().mo12677i();
            if (interfaceC5985a1Mo12677i != null) {
                return interfaceC5985a1Mo12677i;
            }
            InterfaceC6055y0 interfaceC6055y0Mo13792Z = dVar.mo13658a0().mo13792Z();
            InterfaceC6333h.a aVar = InterfaceC6333h.f19873o;
            C7226m0 c7226m0M28721e = AbstractC7258h.m28721e(interfaceC6055y0Mo13792Z, aVar.m25003b(), aVar.m25003b());
            c7226m0M28721e.getClass();
            return c7226m0M28721e;
        }

        @Override // p142j9.AbstractC3656b0
        /* JADX INFO: renamed from: R */
        public InterfaceC4210h mo13637R() {
            return (InterfaceC4210h) this.f10249x.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && AbstractC1061t.m3842c(mo13658a0(), ((d) obj).mo13658a0());
        }

        @Override // p142j9.AbstractC3708l2.a
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5985a1 mo13792Z() {
            Object objM13649c = this.f10248w.m13649c(this, f10247y[0]);
            objM13649c.getClass();
            return (InterfaceC5985a1) objM13649c;
        }

        @Override // p098g9.InterfaceC2548b
        public String getName() {
            return "<set-" + mo13658a0().getName() + '>';
        }

        public int hashCode() {
            return mo13658a0().hashCode();
        }

        public String toString() {
            return "setter of " + mo13658a0();
        }
    }

    public AbstractC3708l2(AbstractC3672e1 abstractC3672e1, String str, String str2, InterfaceC6055y0 interfaceC6055y0, Object obj) {
        this.f10240w = abstractC3672e1;
        this.f10241x = str;
        this.f10242y = str2;
        this.f10243z = obj;
        this.f10238A = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C3698j2(this));
        AbstractC3659b3.a aVarM13646c = AbstractC3659b3.m13646c(interfaceC6055y0, new C3703k2(this));
        aVarM13646c.getClass();
        this.f10239B = aVarM13646c;
    }

    /* JADX INFO: renamed from: Z */
    public static final InterfaceC6055y0 m13782Z(AbstractC3708l2 abstractC3708l2) {
        return abstractC3708l2.mo13638S().m13687p(abstractC3708l2.getName(), abstractC3708l2.f10242y);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Field m13783a0(AbstractC3708l2 abstractC3708l2) {
        Class<?> enclosingClass;
        AbstractC3724p abstractC3724pM13736f = C3689h3.f10209a.m13736f(abstractC3708l2.mo13792Z());
        if (!(abstractC3724pM13736f instanceof AbstractC3724p.c)) {
            if (abstractC3724pM13736f instanceof AbstractC3724p.a) {
                return ((AbstractC3724p.a) abstractC3724pM13736f).m13843b();
            }
            if ((abstractC3724pM13736f instanceof AbstractC3724p.b) || (abstractC3724pM13736f instanceof AbstractC3724p.d)) {
                return null;
            }
            C5729x.m23182a();
            return null;
        }
        AbstractC3724p.c cVar = (AbstractC3724p.c) abstractC3724pM13736f;
        InterfaceC6055y0 interfaceC6055y0M13846b = cVar.m13846b();
        AbstractC5529d.a aVarM22543d = C5533h.m22543d(C5533h.f17305a, cVar.m13849e(), cVar.m13848d(), cVar.m13851g(), false, 8, null);
        if (aVarM22543d == null) {
            return null;
        }
        if (AbstractC9637o.m37697e(interfaceC6055y0M13846b) || C5533h.m22544f(cVar.m13849e())) {
            enclosingClass = abstractC3708l2.mo13638S().mo3775b().getEnclosingClass();
        } else {
            InterfaceC6019m interfaceC6019mMo7443b = interfaceC6055y0M13846b.mo7443b();
            enclosingClass = interfaceC6019mMo7443b instanceof InterfaceC5995e ? AbstractC3714m3.m13821r((InterfaceC5995e) interfaceC6019mMo7443b) : abstractC3708l2.mo13638S().mo3775b();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(aVarM22543d.m22537e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: R */
    public InterfaceC4210h mo13637R() {
        return mo13656h0().mo13637R();
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: S */
    public AbstractC3672e1 mo13638S() {
        return this.f10240w;
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: T */
    public InterfaceC4210h mo13639T() {
        return mo13656h0().mo13639T();
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: X */
    public boolean mo13643X() {
        return this.f10243z != AbstractC1033f.f3188w;
    }

    /* JADX INFO: renamed from: d0 */
    public final Member m13786d0() {
        if (!mo13792Z().mo12672T()) {
            return null;
        }
        AbstractC3724p abstractC3724pM13736f = C3689h3.f10209a.m13736f(mo13792Z());
        if (abstractC3724pM13736f instanceof AbstractC3724p.c) {
            AbstractC3724p.c cVar = (AbstractC3724p.c) abstractC3724pM13736f;
            if (cVar.m13850f().m21051E()) {
                AbstractC5140a.c cVarM21058z = cVar.m13850f().m21058z();
                if (!cVarM21058z.m21024z() || !cVarM21058z.m21023y()) {
                    return null;
                }
                return mo13638S().m13686o(cVar.m13848d().getString(cVarM21058z.m21022x()), cVar.m13848d().getString(cVarM21058z.m21021w()));
            }
        }
        return m13790i0();
    }

    /* JADX INFO: renamed from: e0 */
    public final Object m13787e0() {
        return AbstractC4217o.m16693h(this.f10243z, mo13792Z());
    }

    public boolean equals(Object obj) {
        AbstractC3708l2 abstractC3708l2M13807d = AbstractC3714m3.m13807d(obj);
        return abstractC3708l2M13807d != null && AbstractC1061t.m3842c(mo13638S(), abstractC3708l2M13807d.mo13638S()) && AbstractC1061t.m3842c(getName(), abstractC3708l2M13807d.getName()) && AbstractC1061t.m3842c(this.f10242y, abstractC3708l2M13807d.f10242y) && AbstractC1061t.m3842c(this.f10243z, abstractC3708l2M13807d.f10243z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public final Object m13788f0(Member member, Object obj, Object obj2) throws C2900b {
        try {
            Object obj3 = f10237D;
            if ((obj == obj3 || obj2 == obj3) && mo13792Z().mo12682q0() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objM13787e0 = mo13643X() ? m13787e0() : obj;
            if (objM13787e0 == obj3) {
                objM13787e0 = null;
            }
            if (!mo13643X()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(AbstractC3363a.m12575a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objM13787e0);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objM13787e0 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    cls.getClass();
                    objM13787e0 = AbstractC3714m3.m13810g(cls);
                }
                return method.invoke(null, objM13787e0);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                cls2.getClass();
                obj = AbstractC3714m3.m13810g(cls2);
            }
            return method2.invoke(null, objM13787e0, obj);
        } catch (IllegalAccessException e10) {
            throw new C2900b(e10);
        }
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6055y0 mo13792Z() {
        Object objInvoke = this.f10239B.invoke();
        objInvoke.getClass();
        return (InterfaceC6055y0) objInvoke;
    }

    @Override // p098g9.InterfaceC2548b
    public String getName() {
        return this.f10241x;
    }

    /* JADX INFO: renamed from: h0 */
    public abstract c mo13656h0();

    public int hashCode() {
        return (((mo13638S().hashCode() * 31) + getName().hashCode()) * 31) + this.f10242y.hashCode();
    }

    /* JADX INFO: renamed from: i0 */
    public final Field m13790i0() {
        return (Field) this.f10238A.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    public final String m13791j0() {
        return this.f10242y;
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: n */
    public boolean mo3783n() {
        return false;
    }

    public String toString() {
        return C3679f3.f10193a.m13714k(mo13792Z());
    }

    /* JADX INFO: renamed from: j9.l2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC3708l2(AbstractC3672e1 abstractC3672e1, String str, String str2, Object obj) {
        this(abstractC3672e1, str, str2, null, obj);
        abstractC3672e1.getClass();
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC3708l2(AbstractC3672e1 abstractC3672e1, InterfaceC6055y0 interfaceC6055y0) {
        abstractC3672e1.getClass();
        interfaceC6055y0.getClass();
        String strM23030c = interfaceC6055y0.getName().m23030c();
        strM23030c.getClass();
        this(abstractC3672e1, strM23030c, C3689h3.f10209a.m13736f(interfaceC6055y0).mo13842a(), interfaceC6055y0, AbstractC1033f.f3188w);
    }
}
