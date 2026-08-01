package p142j9;

import gb.AbstractC2706r0;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p080f9.C2363j;
import p098g9.InterfaceC2556j;
import p098g9.InterfaceC2557k;
import p098g9.InterfaceC2560n;
import p127i9.C3364b;
import p142j9.AbstractC3659b3;
import p158k9.C4216n;
import p158k9.InterfaceC4210h;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p213oa.C5695f;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6047v0;
import p327wa.AbstractC9211e;
import p372z8.C9887b;

/* JADX INFO: renamed from: j9.z1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3766z1 implements InterfaceC2556j {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC2557k[] f10378f = {AbstractC1052o0.m3814i(new C1038h0(C3766z1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0)), AbstractC1052o0.m3814i(new C1038h0(C3766z1.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a */
    public final AbstractC3656b0 f10379a;

    /* JADX INFO: renamed from: b */
    public final int f10380b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2556j.a f10381c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3659b3.a f10382d;

    /* JADX INFO: renamed from: e */
    public final AbstractC3659b3.a f10383e;

    /* JADX INFO: renamed from: j9.z1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Type {

        /* JADX INFO: renamed from: q */
        public final Type[] f10384q;

        /* JADX INFO: renamed from: r */
        public final int f10385r;

        public a(Type[] typeArr) {
            typeArr.getClass();
            this.f10384q = typeArr;
            this.f10385r = Arrays.hashCode(typeArr);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Arrays.equals(this.f10384q, ((a) obj).f10384q);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return AbstractC5106t.m20754u0(this.f10384q, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f10385r;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public C3766z1(AbstractC3656b0 abstractC3656b0, int i10, InterfaceC2556j.a aVar, InterfaceC0173a interfaceC0173a) {
        abstractC3656b0.getClass();
        aVar.getClass();
        interfaceC0173a.getClass();
        this.f10379a = abstractC3656b0;
        this.f10380b = i10;
        this.f10381c = aVar;
        this.f10382d = AbstractC3659b3.m13645b(interfaceC0173a);
        this.f10383e = AbstractC3659b3.m13645b(new C3758x1(this));
    }

    /* JADX INFO: renamed from: b */
    public static final Type m13971b(C3766z1 c3766z1) {
        List listM20540L0;
        InterfaceC6047v0 interfaceC6047v0M13977h = c3766z1.m13977h();
        if ((interfaceC6047v0M13977h instanceof InterfaceC5988b1) && AbstractC1061t.m3842c(AbstractC3714m3.m13813j(c3766z1.f10379a.mo13792Z()), interfaceC6047v0M13977h) && c3766z1.f10379a.mo13792Z().mo12678j() == InterfaceC5986b.a.FAKE_OVERRIDE) {
            InterfaceC6019m interfaceC6019mMo7443b = c3766z1.f10379a.mo13792Z().mo7443b();
            interfaceC6019mMo7443b.getClass();
            Class clsM13821r = AbstractC3714m3.m13821r((InterfaceC5995e) interfaceC6019mMo7443b);
            if (clsM13821r != null) {
                return clsM13821r;
            }
            C3364b.m12576a("Cannot determine receiver Java type of inherited declaration: ", interfaceC6047v0M13977h);
            return null;
        }
        InterfaceC4210h interfaceC4210hMo13637R = c3766z1.f10379a.mo13637R();
        if (!(interfaceC4210hMo13637R instanceof C4216n)) {
            if (!(interfaceC4210hMo13637R instanceof C4216n.b)) {
                return (Type) interfaceC4210hMo13637R.mo16637a().get(c3766z1.getIndex());
            }
            Class[] clsArr = (Class[]) ((Collection) ((C4216n.b) interfaceC4210hMo13637R).m16685e().get(c3766z1.getIndex())).toArray(new Class[0]);
            return c3766z1.m13975f((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (c3766z1.f10379a.mo13643X()) {
            C4216n c4216n = (C4216n) interfaceC4210hMo13637R;
            C2363j c2363jM16680g = c4216n.m16680g(c3766z1.getIndex() + 1);
            int iM8561p = c4216n.m16680g(0).m8561p() + 1;
            listM20540L0 = AbstractC5081g0.m20540L0(c4216n.mo16637a(), new C2363j(c2363jM16680g.m8560o() - iM8561p, c2363jM16680g.m8561p() - iM8561p));
        } else {
            C4216n c4216n2 = (C4216n) interfaceC4210hMo13637R;
            listM20540L0 = AbstractC5081g0.m20540L0(c4216n2.mo16637a(), c4216n2.m16680g(c3766z1.getIndex()));
        }
        Type[] typeArr = (Type[]) listM20540L0.toArray(new Type[0]);
        return c3766z1.m13975f((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    /* JADX INFO: renamed from: e */
    public static final List m13974e(C3766z1 c3766z1) {
        return AbstractC3714m3.m13808e(c3766z1.m13977h());
    }

    @Override // p098g9.InterfaceC2556j
    /* JADX INFO: renamed from: a */
    public boolean mo9076a() {
        InterfaceC6047v0 interfaceC6047v0M13977h = m13977h();
        return (interfaceC6047v0M13977h instanceof InterfaceC6039s1) && ((InterfaceC6039s1) interfaceC6047v0M13977h).mo24070o0() != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3766z1)) {
            return false;
        }
        C3766z1 c3766z1 = (C3766z1) obj;
        return AbstractC1061t.m3842c(this.f10379a, c3766z1.f10379a) && getIndex() == c3766z1.getIndex();
    }

    /* JADX INFO: renamed from: f */
    public final Type m13975f(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) AbstractC5106t.m20686G0(typeArr);
        }
        throw new C9887b("Expected at least 1 type for compound type");
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC3656b0 m13976g() {
        return this.f10379a;
    }

    @Override // p098g9.InterfaceC2556j
    public int getIndex() {
        return this.f10380b;
    }

    @Override // p098g9.InterfaceC2556j
    public String getName() {
        InterfaceC6047v0 interfaceC6047v0M13977h = m13977h();
        InterfaceC6039s1 interfaceC6039s1 = interfaceC6047v0M13977h instanceof InterfaceC6039s1 ? (InterfaceC6039s1) interfaceC6047v0M13977h : null;
        if (interfaceC6039s1 == null || interfaceC6039s1.mo7443b().mo418L()) {
            return null;
        }
        C5695f name = interfaceC6039s1.getName();
        name.getClass();
        if (name.m23033k()) {
            return null;
        }
        return name.m23030c();
    }

    @Override // p098g9.InterfaceC2556j
    public InterfaceC2560n getType() {
        AbstractC2706r0 type = m13977h().getType();
        type.getClass();
        return new C3751v2(type, new C3762y1(this));
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC6047v0 m13977h() {
        Object objM13649c = this.f10382d.m13649c(this, f10378f[0]);
        objM13649c.getClass();
        return (InterfaceC6047v0) objM13649c;
    }

    public int hashCode() {
        return (this.f10379a.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    @Override // p098g9.InterfaceC2556j
    /* JADX INFO: renamed from: j */
    public InterfaceC2556j.a mo9077j() {
        return this.f10381c;
    }

    @Override // p098g9.InterfaceC2556j
    /* JADX INFO: renamed from: k */
    public boolean mo9078k() {
        InterfaceC6047v0 interfaceC6047v0M13977h = m13977h();
        InterfaceC6039s1 interfaceC6039s1 = interfaceC6047v0M13977h instanceof InterfaceC6039s1 ? (InterfaceC6039s1) interfaceC6047v0M13977h : null;
        if (interfaceC6039s1 != null) {
            return AbstractC9211e.m35851f(interfaceC6039s1);
        }
        return false;
    }

    public String toString() {
        return C3679f3.f10193a.m13713j(this);
    }
}
