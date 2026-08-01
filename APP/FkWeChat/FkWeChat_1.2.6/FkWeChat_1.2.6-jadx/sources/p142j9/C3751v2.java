package p142j9;

import gb.AbstractC2675i2;
import gb.AbstractC2706r0;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p024b9.InterfaceC1063u;
import p098g9.C2562p;
import p098g9.InterfaceC2550d;
import p098g9.InterfaceC2557k;
import p127i9.AbstractC3365c;
import p127i9.C3364b;
import p142j9.AbstractC3659b3;
import p172l8.AbstractC4706m;
import p172l8.C4710q;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p215oc.C5729x;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6018l1;
import p313v9.AbstractC8865f;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: j9.v2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3751v2 implements InterfaceC1063u {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC2557k[] f10321e = {AbstractC1052o0.m3814i(new C1038h0(C3751v2.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), AbstractC1052o0.m3814i(new C1038h0(C3751v2.class, "arguments", "getArguments()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a */
    public final AbstractC2706r0 f10322a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3659b3.a f10323b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3659b3.a f10324c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3659b3.a f10325d;

    /* JADX INFO: renamed from: j9.v2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10326a;

        static {
            int[] iArr = new int[EnumC2691m2.values().length];
            try {
                iArr[EnumC2691m2.f7042u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2691m2.f7043v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2691m2.f7044w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10326a = iArr;
        }
    }

    public C3751v2(AbstractC2706r0 abstractC2706r0, InterfaceC0173a interfaceC0173a) {
        abstractC2706r0.getClass();
        this.f10322a = abstractC2706r0;
        AbstractC3659b3.a aVarM13645b = null;
        AbstractC3659b3.a aVar = interfaceC0173a instanceof AbstractC3659b3.a ? (AbstractC3659b3.a) interfaceC0173a : null;
        if (aVar != null) {
            aVarM13645b = aVar;
        } else if (interfaceC0173a != null) {
            aVarM13645b = AbstractC3659b3.m13645b(interfaceC0173a);
        }
        this.f10323b = aVarM13645b;
        this.f10324c = AbstractC3659b3.m13645b(new C3735r2(this));
        this.f10325d = AbstractC3659b3.m13645b(new C3739s2(this, interfaceC0173a));
    }

    /* JADX INFO: renamed from: i */
    public static final List m13872i(C3751v2 c3751v2, InterfaceC0173a interfaceC0173a) {
        C2562p c2562pM9089d;
        List listMo9330R0 = c3751v2.f10322a.mo9330R0();
        if (listMo9330R0.isEmpty()) {
            return AbstractC5114x.m20800o();
        }
        InterfaceC4705l interfaceC4705lM18788b = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C3743t2(c3751v2));
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo9330R0, 10));
        int i10 = 0;
        for (Object obj : listMo9330R0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC5114x.m20810y();
            }
            InterfaceC2643a2 interfaceC2643a2 = (InterfaceC2643a2) obj;
            if (interfaceC2643a2.mo9336c()) {
                c2562pM9089d = C2562p.f6818c.m9088c();
            } else {
                AbstractC2706r0 type = interfaceC2643a2.getType();
                type.getClass();
                C3751v2 c3751v22 = new C3751v2(type, interfaceC0173a == null ? null : new C3747u2(c3751v2, i10, interfaceC4705lM18788b));
                int i12 = a.f10326a[interfaceC2643a2.mo9335b().ordinal()];
                if (i12 == 1) {
                    c2562pM9089d = C2562p.f6818c.m9089d(c3751v22);
                } else if (i12 == 2) {
                    c2562pM9089d = C2562p.f6818c.m9086a(c3751v22);
                } else {
                    if (i12 != 3) {
                        C5729x.m23182a();
                        return null;
                    }
                    c2562pM9089d = C2562p.f6818c.m9087b(c3751v22);
                }
            }
            arrayList.add(c2562pM9089d);
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static final List m13873j(C3751v2 c3751v2) {
        Type typeMo3852b = c3751v2.mo3852b();
        typeMo3852b.getClass();
        return AbstractC8865f.m34032h(typeMo3852b);
    }

    /* JADX INFO: renamed from: k */
    public static final List m13874k(InterfaceC4705l interfaceC4705l) {
        return (List) interfaceC4705l.getValue();
    }

    /* JADX INFO: renamed from: l */
    public static final Type m13875l(C3751v2 c3751v2, int i10, InterfaceC4705l interfaceC4705l) {
        Type typeMo3852b = c3751v2.mo3852b();
        if (typeMo3852b instanceof Class) {
            Class cls = (Class) typeMo3852b;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            componentType.getClass();
            return componentType;
        }
        if (typeMo3852b instanceof GenericArrayType) {
            if (i10 != 0) {
                C3364b.m12576a("Array type has been queried for a non-0th argument: ", c3751v2);
                return null;
            }
            Type genericComponentType = ((GenericArrayType) typeMo3852b).getGenericComponentType();
            genericComponentType.getClass();
            return genericComponentType;
        }
        if (!(typeMo3852b instanceof ParameterizedType)) {
            C3364b.m12576a("Non-generic type has been queried for arguments: ", c3751v2);
            return null;
        }
        Type type = (Type) m13874k(interfaceC4705l).get(i10);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        lowerBounds.getClass();
        Type type2 = (Type) AbstractC5106t.m20720Z(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            upperBounds.getClass();
            type2 = (Type) AbstractC5106t.m20716X(upperBounds);
        }
        type2.getClass();
        return type2;
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC2550d m13876m(C3751v2 c3751v2) {
        return c3751v2.m13877n(c3751v2.f10322a);
    }

    @Override // p098g9.InterfaceC2560n
    /* JADX INFO: renamed from: a */
    public boolean mo3875a() {
        return this.f10322a.mo9258U0();
    }

    @Override // p024b9.InterfaceC1063u
    /* JADX INFO: renamed from: b */
    public Type mo3852b() {
        AbstractC3659b3.a aVar = this.f10323b;
        if (aVar != null) {
            return (Type) aVar.invoke();
        }
        return null;
    }

    @Override // p098g9.InterfaceC2560n
    /* JADX INFO: renamed from: c */
    public List mo3876c() {
        Object objM13649c = this.f10325d.m13649c(this, f10321e[1]);
        objM13649c.getClass();
        return (List) objM13649c;
    }

    @Override // p098g9.InterfaceC2560n
    /* JADX INFO: renamed from: e */
    public InterfaceC2550d mo3877e() {
        return (InterfaceC2550d) this.f10324c.m13649c(this, f10321e[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3751v2)) {
            return false;
        }
        C3751v2 c3751v2 = (C3751v2) obj;
        return AbstractC1061t.m3842c(this.f10322a, c3751v2.f10322a) && AbstractC1061t.m3842c(mo3877e(), c3751v2.mo3877e()) && AbstractC1061t.m3842c(mo3876c(), c3751v2.mo3876c());
    }

    public int hashCode() {
        int iHashCode = this.f10322a.hashCode() * 31;
        InterfaceC2550d interfaceC2550dMo3877e = mo3877e();
        return ((iHashCode + (interfaceC2550dMo3877e != null ? interfaceC2550dMo3877e.hashCode() : 0)) * 31) + mo3876c().hashCode();
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC2550d m13877n(AbstractC2706r0 abstractC2706r0) {
        AbstractC2706r0 type;
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        if (!(interfaceC6004hMo5602u instanceof InterfaceC5995e)) {
            if (interfaceC6004hMo5602u instanceof InterfaceC6018l1) {
                return new C3759x2(null, (InterfaceC6018l1) interfaceC6004hMo5602u);
            }
            if (interfaceC6004hMo5602u instanceof InterfaceC6015k1) {
                throw new C4710q("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class clsM13821r = AbstractC3714m3.m13821r((InterfaceC5995e) interfaceC6004hMo5602u);
        if (clsM13821r == null) {
            return null;
        }
        if (!clsM13821r.isArray()) {
            if (AbstractC2675i2.m9464l(abstractC2706r0)) {
                return new C3761y0(clsM13821r);
            }
            Class clsM34033i = AbstractC8865f.m34033i(clsM13821r);
            if (clsM34033i != null) {
                clsM13821r = clsM34033i;
            }
            return new C3761y0(clsM13821r);
        }
        InterfaceC2643a2 interfaceC2643a2 = (InterfaceC2643a2) AbstractC5081g0.m20539K0(abstractC2706r0.mo9330R0());
        if (interfaceC2643a2 == null || (type = interfaceC2643a2.getType()) == null) {
            return new C3761y0(clsM13821r);
        }
        InterfaceC2550d interfaceC2550dM13877n = m13877n(type);
        if (interfaceC2550dM13877n != null) {
            return new C3761y0(AbstractC3714m3.m13809f(AbstractC9886a.m38367b(AbstractC3365c.m12577a(interfaceC2550dM13877n))));
        }
        C3364b.m12576a("Cannot determine classifier for array element type: ", this);
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC2706r0 m13878o() {
        return this.f10322a;
    }

    public String toString() {
        return C3679f3.f10193a.m13715l(this.f10322a);
    }

    public /* synthetic */ C3751v2(AbstractC2706r0 abstractC2706r0, InterfaceC0173a interfaceC0173a, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC2706r0, (i10 & 2) != 0 ? null : interfaceC0173a);
    }
}
