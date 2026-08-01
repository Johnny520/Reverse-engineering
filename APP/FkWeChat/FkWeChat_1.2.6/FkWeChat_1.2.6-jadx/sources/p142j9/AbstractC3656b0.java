package p142j9;

import ae.C0307f;
import gb.AbstractC2659e2;
import gb.AbstractC2706r0;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.C5752g;
import p011aa.InterfaceC0196a;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2548b;
import p098g9.InterfaceC2556j;
import p098g9.InterfaceC2560n;
import p110h9.C2899a;
import p127i9.AbstractC3365c;
import p127i9.AbstractC3366d;
import p142j9.AbstractC3659b3;
import p158k9.AbstractC4217o;
import p158k9.InterfaceC4210h;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5067b0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p211o8.AbstractC5661b;
import p228p8.InterfaceC5976f;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6047v0;
import p372z8.AbstractC9886a;
import p376zd.C9987e;

/* JADX INFO: renamed from: j9.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3656b0 implements InterfaceC2548b, InterfaceC3763y2 {

    /* JADX INFO: renamed from: q */
    public final AbstractC3659b3.a f10150q;

    /* JADX INFO: renamed from: r */
    public final AbstractC3659b3.a f10151r;

    /* JADX INFO: renamed from: s */
    public final AbstractC3659b3.a f10152s;

    /* JADX INFO: renamed from: t */
    public final AbstractC3659b3.a f10153t;

    /* JADX INFO: renamed from: u */
    public final AbstractC3659b3.a f10154u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC4705l f10155v;

    /* JADX INFO: renamed from: j9.b0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC5661b.m22869d(((InterfaceC2556j) obj).getName(), ((InterfaceC2556j) obj2).getName());
        }
    }

    public AbstractC3656b0() {
        AbstractC3659b3.a aVarM13645b = AbstractC3659b3.m13645b(new C3732r(this));
        aVarM13645b.getClass();
        this.f10150q = aVarM13645b;
        AbstractC3659b3.a aVarM13645b2 = AbstractC3659b3.m13645b(new C3736s(this));
        aVarM13645b2.getClass();
        this.f10151r = aVarM13645b2;
        AbstractC3659b3.a aVarM13645b3 = AbstractC3659b3.m13645b(new C3740t(this));
        aVarM13645b3.getClass();
        this.f10152s = aVarM13645b3;
        AbstractC3659b3.a aVarM13645b4 = AbstractC3659b3.m13645b(new C3744u(this));
        aVarM13645b4.getClass();
        this.f10153t = aVarM13645b4;
        AbstractC3659b3.a aVarM13645b5 = AbstractC3659b3.m13645b(new C3748v(this));
        aVarM13645b5.getClass();
        this.f10154u = aVarM13645b5;
        this.f10155v = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C3752w(this));
    }

    /* JADX INFO: renamed from: B */
    public static final List m13612B(AbstractC3656b0 abstractC3656b0) {
        List<InterfaceC6018l1> typeParameters = abstractC3656b0.mo13792Z().getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(typeParameters, 10));
        for (InterfaceC6018l1 interfaceC6018l1 : typeParameters) {
            interfaceC6018l1.getClass();
            arrayList.add(new C3759x2(abstractC3656b0, interfaceC6018l1));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Y */
    public static final boolean m13623Y(AbstractC3656b0 abstractC3656b0) {
        List listMo3778d = abstractC3656b0.mo3778d();
        if (listMo3778d != null && listMo3778d.isEmpty()) {
            return false;
        }
        Iterator it = listMo3778d.iterator();
        while (it.hasNext()) {
            if (AbstractC3714m3.m13815l(((InterfaceC2556j) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final Object[] m13624c(AbstractC3656b0 abstractC3656b0) {
        int iM13641V;
        List<InterfaceC2556j> listMo3778d = abstractC3656b0.mo3778d();
        int size = listMo3778d.size() + (abstractC3656b0.mo3783n() ? 1 : 0);
        if (((Boolean) abstractC3656b0.f10155v.getValue()).booleanValue()) {
            iM13641V = 0;
            for (InterfaceC2556j interfaceC2556j : listMo3778d) {
                iM13641V += interfaceC2556j.mo9077j() == InterfaceC2556j.a.f6815t ? abstractC3656b0.m13641V(interfaceC2556j) : 0;
            }
        } else if (listMo3778d.isEmpty()) {
            iM13641V = 0;
        } else {
            Iterator it = listMo3778d.iterator();
            iM13641V = 0;
            while (it.hasNext()) {
                if (((InterfaceC2556j) it.next()).mo9077j() == InterfaceC2556j.a.f6815t && (iM13641V = iM13641V + 1) < 0) {
                    AbstractC5114x.m20809x();
                }
            }
        }
        int i10 = (iM13641V + 31) / 32;
        Object[] objArr = new Object[size + i10 + 1];
        for (InterfaceC2556j interfaceC2556j2 : listMo3778d) {
            if (interfaceC2556j2.mo9078k() && !AbstractC3714m3.m13816m(interfaceC2556j2.getType())) {
                objArr[interfaceC2556j2.getIndex()] = AbstractC3714m3.m13810g(AbstractC3366d.m12585g(interfaceC2556j2.getType()));
            } else if (interfaceC2556j2.mo9076a()) {
                objArr[interfaceC2556j2.getIndex()] = abstractC3656b0.m13634O(interfaceC2556j2.getType());
            }
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[size + i11] = 0;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: g */
    public static final List m13625g(AbstractC3656b0 abstractC3656b0) {
        return AbstractC3714m3.m13808e(abstractC3656b0.mo13792Z());
    }

    /* JADX INFO: renamed from: l */
    public static final ArrayList m13626l(AbstractC3656b0 abstractC3656b0) {
        int i10;
        InterfaceC5986b interfaceC5986bMo13640U = abstractC3656b0.mo13792Z();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (abstractC3656b0.mo13643X()) {
            i10 = 0;
        } else {
            InterfaceC5988b1 interfaceC5988b1M13813j = AbstractC3714m3.m13813j(interfaceC5986bMo13640U);
            if (interfaceC5988b1M13813j != null) {
                arrayList.add(new C3766z1(abstractC3656b0, 0, InterfaceC2556j.a.f6812q, new C3756x(interfaceC5988b1M13813j)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            InterfaceC5988b1 interfaceC5988b1Mo12682q0 = interfaceC5986bMo13640U.mo12682q0();
            if (interfaceC5988b1Mo12682q0 != null) {
                arrayList.add(new C3766z1(abstractC3656b0, i10, InterfaceC2556j.a.f6814s, new C3760y(interfaceC5988b1Mo12682q0)));
                i10++;
            }
        }
        int size = interfaceC5986bMo13640U.mo12680m().size();
        while (i11 < size) {
            arrayList.add(new C3766z1(abstractC3656b0, i10, InterfaceC2556j.a.f6815t, new C3764z(interfaceC5986bMo13640U, i11)));
            i11++;
            i10++;
        }
        if (abstractC3656b0.m13642W() && (interfaceC5986bMo13640U instanceof InterfaceC0196a) && arrayList.size() > 1) {
            AbstractC5067b0.m20482D(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC6047v0 m13629x(InterfaceC5986b interfaceC5986b, int i10) {
        Object obj = interfaceC5986b.mo12680m().get(i10);
        obj.getClass();
        return (InterfaceC6047v0) obj;
    }

    /* JADX INFO: renamed from: y */
    public static final C3751v2 m13630y(AbstractC3656b0 abstractC3656b0) {
        AbstractC2706r0 abstractC2706r0Mo12675f = abstractC3656b0.mo13792Z().mo12675f();
        abstractC2706r0Mo12675f.getClass();
        return new C3751v2(abstractC2706r0Mo12675f, new C3651a0(abstractC3656b0));
    }

    /* JADX INFO: renamed from: z */
    public static final Type m13631z(AbstractC3656b0 abstractC3656b0) {
        Type typeM13635P = abstractC3656b0.m13635P();
        return typeM13635P == null ? abstractC3656b0.mo13637R().mo16642f() : typeM13635P;
    }

    /* JADX INFO: renamed from: M */
    public final Object m13632M(Map map) throws C2899a {
        Object objM13634O;
        List<InterfaceC2556j> listMo3778d = mo3778d();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo3778d, 10));
        for (InterfaceC2556j interfaceC2556j : listMo3778d) {
            if (map.containsKey(interfaceC2556j)) {
                objM13634O = map.get(interfaceC2556j);
                if (objM13634O == null) {
                    C5752g.m23253a("Annotation argument value cannot be null (", interfaceC2556j, 41);
                    return null;
                }
            } else if (interfaceC2556j.mo9078k()) {
                objM13634O = null;
            } else {
                if (!interfaceC2556j.mo9076a()) {
                    C0307f.m923a("No argument provided for a required parameter: ", interfaceC2556j);
                    return null;
                }
                objM13634O = m13634O(interfaceC2556j.getType());
            }
            arrayList.add(objM13634O);
        }
        InterfaceC4210h interfaceC4210hMo13639T = mo13639T();
        if (interfaceC4210hMo13639T == null) {
            C3728q.m13860a("This callable does not support a default call: ", mo13792Z());
            return null;
        }
        try {
            return interfaceC4210hMo13639T.mo16643o(arrayList.toArray(new Object[0]));
        } catch (IllegalAccessException e10) {
            throw new C2899a(e10);
        }
    }

    /* JADX INFO: renamed from: N */
    public final Object m13633N(Map map, InterfaceC5976f interfaceC5976f) throws C2899a {
        map.getClass();
        List<InterfaceC2556j> listMo3778d = mo3778d();
        boolean z10 = false;
        if (listMo3778d.isEmpty()) {
            try {
                return mo13637R().mo16643o(mo3783n() ? new InterfaceC5976f[]{interfaceC5976f} : new InterfaceC5976f[0]);
            } catch (IllegalAccessException e10) {
                throw new C2899a(e10);
            }
        }
        int size = listMo3778d.size() + (mo3783n() ? 1 : 0);
        Object[] objArrM13636Q = m13636Q();
        if (mo3783n()) {
            objArrM13636Q[listMo3778d.size()] = interfaceC5976f;
        }
        boolean zBooleanValue = ((Boolean) this.f10155v.getValue()).booleanValue();
        int i10 = 0;
        for (InterfaceC2556j interfaceC2556j : listMo3778d) {
            int iM13641V = zBooleanValue ? m13641V(interfaceC2556j) : 1;
            if (map.containsKey(interfaceC2556j)) {
                objArrM13636Q[interfaceC2556j.getIndex()] = map.get(interfaceC2556j);
            } else if (interfaceC2556j.mo9078k()) {
                if (zBooleanValue) {
                    int i11 = i10 + iM13641V;
                    for (int i12 = i10; i12 < i11; i12++) {
                        int i13 = (i12 / 32) + size;
                        Object obj = objArrM13636Q[i13];
                        obj.getClass();
                        objArrM13636Q[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                    }
                } else {
                    int i14 = (i10 / 32) + size;
                    Object obj2 = objArrM13636Q[i14];
                    obj2.getClass();
                    objArrM13636Q[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                }
                z10 = true;
            } else if (!interfaceC2556j.mo9076a()) {
                C0307f.m923a("No argument provided for a required parameter: ", interfaceC2556j);
                return null;
            }
            if (interfaceC2556j.mo9077j() == InterfaceC2556j.a.f6815t) {
                i10 += iM13641V;
            }
        }
        if (!z10) {
            try {
                return mo13637R().mo16643o(Arrays.copyOf(objArrM13636Q, size));
            } catch (IllegalAccessException e11) {
                throw new C2899a(e11);
            }
        }
        InterfaceC4210h interfaceC4210hMo13639T = mo13639T();
        if (interfaceC4210hMo13639T == null) {
            C3728q.m13860a("This callable does not support a default call: ", mo13792Z());
            return null;
        }
        try {
            return interfaceC4210hMo13639T.mo16643o(objArrM13636Q);
        } catch (IllegalAccessException e12) {
            throw new C2899a(e12);
        }
    }

    /* JADX INFO: renamed from: O */
    public final Object m13634O(InterfaceC2560n interfaceC2560n) {
        Class clsM38367b = AbstractC9886a.m38367b(AbstractC3365c.m12578b(interfaceC2560n));
        if (clsM38367b.isArray()) {
            Object objNewInstance = Array.newInstance(clsM38367b.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new C3767z2("Cannot instantiate the default empty array of type " + clsM38367b.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: renamed from: P */
    public final Type m13635P() {
        Type[] lowerBounds;
        if (mo3783n()) {
            Object objM20589w0 = AbstractC5081g0.m20589w0(mo13637R().mo16637a());
            ParameterizedType parameterizedType = objM20589w0 instanceof ParameterizedType ? (ParameterizedType) objM20589w0 : null;
            if (AbstractC1061t.m3842c(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC5976f.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objM20686G0 = AbstractC5106t.m20686G0(actualTypeArguments);
                WildcardType wildcardType = objM20686G0 instanceof WildcardType ? (WildcardType) objM20686G0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) AbstractC5106t.m20716X(lowerBounds);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public final Object[] m13636Q() {
        return (Object[]) ((Object[]) this.f10154u.invoke()).clone();
    }

    /* JADX INFO: renamed from: R */
    public abstract InterfaceC4210h mo13637R();

    /* JADX INFO: renamed from: S */
    public abstract AbstractC3672e1 mo13638S();

    /* JADX INFO: renamed from: T */
    public abstract InterfaceC4210h mo13639T();

    /* JADX INFO: renamed from: U */
    public abstract InterfaceC5986b mo13792Z();

    /* JADX INFO: renamed from: V */
    public final int m13641V(InterfaceC2556j interfaceC2556j) {
        if (!((Boolean) this.f10155v.getValue()).booleanValue()) {
            C9987e.m38645a("Check if parametersNeedMFVCFlattening is true before");
            return 0;
        }
        if (!AbstractC3714m3.m13815l(interfaceC2556j.getType())) {
            return 1;
        }
        InterfaceC2560n type = interfaceC2556j.getType();
        type.getClass();
        List listM16699n = AbstractC4217o.m16699n(AbstractC2659e2.m9366a(((C3751v2) type).m13878o()));
        listM16699n.getClass();
        return listM16699n.size();
    }

    /* JADX INFO: renamed from: W */
    public final boolean m13642W() {
        return AbstractC1061t.m3842c(getName(), "<init>") && mo13638S().mo3775b().isAnnotation();
    }

    /* JADX INFO: renamed from: X */
    public abstract boolean mo13643X();

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: d */
    public List mo3778d() {
        Object objInvoke = this.f10151r.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: f */
    public InterfaceC2560n mo3779f() {
        Object objInvoke = this.f10152s.invoke();
        objInvoke.getClass();
        return (InterfaceC2560n) objInvoke;
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: j */
    public boolean mo3781j() {
        return mo13792Z().mo5592p() == EnumC5996e0.f18939u;
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: o */
    public Object mo9075o(Object... objArr) throws C2899a {
        objArr.getClass();
        try {
            return mo13637R().mo16643o(objArr);
        } catch (IllegalAccessException e10) {
            throw new C2899a(e10);
        }
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: r */
    public Object mo3784r(Map map) {
        map.getClass();
        return m13642W() ? m13632M(map) : m13633N(map, null);
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC6047v0 m13627v(InterfaceC5988b1 interfaceC5988b1) {
        return interfaceC5988b1;
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC6047v0 m13628w(InterfaceC5988b1 interfaceC5988b1) {
        return interfaceC5988b1;
    }
}
