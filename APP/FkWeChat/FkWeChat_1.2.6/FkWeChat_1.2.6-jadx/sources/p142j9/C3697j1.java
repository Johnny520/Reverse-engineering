package p142j9;

import gb.AbstractC2706r0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1033f;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p024b9.InterfaceC1051o;
import p098g9.InterfaceC2552f;
import p098g9.InterfaceC2556j;
import p098g9.InterfaceC2557k;
import p142j9.AbstractC3659b3;
import p142j9.AbstractC3715n;
import p142j9.InterfaceC3705l;
import p158k9.AbstractC4211i;
import p158k9.AbstractC4212j;
import p158k9.AbstractC4217o;
import p158k9.C4203a;
import p158k9.C4216n;
import p158k9.InterfaceC4210h;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5116y;
import p215oc.C5729x;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6016l;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6056z;
import p343xa.AbstractC9472b;
import sa.AbstractC7261k;

/* JADX INFO: renamed from: j9.j1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3697j1 extends AbstractC3656b0 implements InterfaceC1051o, InterfaceC2552f, InterfaceC3705l {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ InterfaceC2557k[] f10221C = {AbstractC1052o0.m3814i(new C1038h0(C3697j1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: A */
    public final InterfaceC4705l f10222A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC4705l f10223B;

    /* JADX INFO: renamed from: w */
    public final AbstractC3672e1 f10224w;

    /* JADX INFO: renamed from: x */
    public final String f10225x;

    /* JADX INFO: renamed from: y */
    public final Object f10226y;

    /* JADX INFO: renamed from: z */
    public final AbstractC3659b3.a f10227z;

    public C3697j1(AbstractC3672e1 abstractC3672e1, String str, String str2, InterfaceC6056z interfaceC6056z, Object obj) {
        this.f10224w = abstractC3672e1;
        this.f10225x = str2;
        this.f10226y = obj;
        this.f10227z = AbstractC3659b3.m13646c(interfaceC6056z, new C3682g1(this, str));
        EnumC4708o enumC4708o = EnumC4708o.f13922r;
        this.f10222A = AbstractC4706m.m18788b(enumC4708o, new C3687h1(this));
        this.f10223B = AbstractC4706m.m18788b(enumC4708o, new C3692i1(this));
    }

    /* JADX INFO: renamed from: c0 */
    public static final InterfaceC4210h m13752c0(C3697j1 c3697j1) {
        Object objM13830d;
        InterfaceC4210h interfaceC4210hM13757e0;
        AbstractC3715n abstractC3715nM13737g = C3689h3.f10209a.m13737g(c3697j1.mo13792Z());
        if (abstractC3715nM13737g instanceof AbstractC3715n.d) {
            if (c3697j1.m13642W()) {
                Class clsMo3775b = c3697j1.mo13638S().mo3775b();
                List listMo3778d = c3697j1.mo3778d();
                ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo3778d, 10));
                Iterator it = listMo3778d.iterator();
                while (it.hasNext()) {
                    String name = ((InterfaceC2556j) it.next()).getName();
                    name.getClass();
                    arrayList.add(name);
                }
                return new C4203a(clsMo3775b, arrayList, C4203a.a.f12344r, C4203a.b.f12348r, null, 16, null);
            }
            objM13830d = c3697j1.mo13638S().m13682i(((AbstractC3715n.d) abstractC3715nM13737g).m13832b());
        } else if (abstractC3715nM13737g instanceof AbstractC3715n.e) {
            InterfaceC6056z interfaceC6056zMo13792Z = c3697j1.mo13792Z();
            InterfaceC6019m interfaceC6019mMo7443b = interfaceC6056zMo13792Z.mo7443b();
            interfaceC6019mMo7443b.getClass();
            if (AbstractC7261k.m28779d(interfaceC6019mMo7443b) && (interfaceC6056zMo13792Z instanceof InterfaceC6016l) && ((InterfaceC6016l) interfaceC6056zMo13792Z).mo24019G()) {
                InterfaceC6056z interfaceC6056zMo13792Z2 = c3697j1.mo13792Z();
                AbstractC3672e1 abstractC3672e1Mo13638S = c3697j1.mo13638S();
                String strM13833b = ((AbstractC3715n.e) abstractC3715nM13737g).m13833b();
                List listMo12680m = c3697j1.mo13792Z().mo12680m();
                listMo12680m.getClass();
                return new C4216n.b(interfaceC6056zMo13792Z2, abstractC3672e1Mo13638S, strM13833b, listMo12680m);
            }
            AbstractC3715n.e eVar = (AbstractC3715n.e) abstractC3715nM13737g;
            objM13830d = c3697j1.mo13638S().m13686o(eVar.m13834c(), eVar.m13833b());
        } else if (abstractC3715nM13737g instanceof AbstractC3715n.c) {
            objM13830d = ((AbstractC3715n.c) abstractC3715nM13737g).m13831b();
            objM13830d.getClass();
        } else {
            if (!(abstractC3715nM13737g instanceof AbstractC3715n.b)) {
                if (!(abstractC3715nM13737g instanceof AbstractC3715n.a)) {
                    C5729x.m23182a();
                    return null;
                }
                List listM13827d = ((AbstractC3715n.a) abstractC3715nM13737g).m13827d();
                Class clsMo3775b2 = c3697j1.mo13638S().mo3775b();
                ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(listM13827d, 10));
                Iterator it2 = listM13827d.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new C4203a(clsMo3775b2, arrayList2, C4203a.a.f12344r, C4203a.b.f12347q, listM13827d);
            }
            objM13830d = ((AbstractC3715n.b) abstractC3715nM13737g).m13830d();
            objM13830d.getClass();
        }
        if (objM13830d instanceof Constructor) {
            interfaceC4210hM13757e0 = c3697j1.m13756d0((Constructor) objM13830d, c3697j1.mo13792Z(), false);
        } else {
            if (!(objM13830d instanceof Method)) {
                C3661c0.m13651a("Could not compute caller for function: ", c3697j1.mo13792Z(), " (member = ", objM13830d);
                return null;
            }
            Method method = (Method) objM13830d;
            interfaceC4210hM13757e0 = !Modifier.isStatic(method.getModifiers()) ? c3697j1.m13757e0(method) : c3697j1.mo13792Z().getAnnotations().mo3926b(AbstractC3714m3.m13814k()) != null ? c3697j1.m13758f0(method) : c3697j1.m13759g0(method, false);
        }
        return AbstractC4217o.m16695j(interfaceC4210hM13757e0, c3697j1.mo13792Z(), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /* JADX INFO: renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p158k9.InterfaceC4210h m13753h0(p142j9.C3697j1 r11) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p142j9.C3697j1.m13753h0(j9.j1):k9.h");
    }

    /* JADX INFO: renamed from: i0 */
    public static final InterfaceC6056z m13754i0(C3697j1 c3697j1, String str) {
        return c3697j1.mo13638S().m13685m(str, c3697j1.f10225x);
    }

    /* JADX INFO: renamed from: j0 */
    private final Object m13755j0() {
        return AbstractC4217o.m16693h(this.f10226y, mo13792Z());
    }

    @Override // p098g9.InterfaceC2552f
    /* JADX INFO: renamed from: A */
    public boolean mo3818A() {
        return mo13792Z().mo24117A();
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: R */
    public InterfaceC4210h mo13637R() {
        return (InterfaceC4210h) this.f10222A.getValue();
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: S */
    public AbstractC3672e1 mo13638S() {
        return this.f10224w;
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: T */
    public InterfaceC4210h mo13639T() {
        return (InterfaceC4210h) this.f10223B.getValue();
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: X */
    public boolean mo13643X() {
        return this.f10226y != AbstractC1033f.f3188w;
    }

    /* JADX INFO: renamed from: d0 */
    public final AbstractC4211i m13756d0(Constructor constructor, InterfaceC6056z interfaceC6056z, boolean z10) {
        return (z10 || !AbstractC9472b.m36899f(interfaceC6056z)) ? mo13643X() ? new AbstractC4211i.c(constructor, m13755j0()) : new AbstractC4211i.e(constructor) : mo13643X() ? new AbstractC4211i.a(constructor, m13755j0()) : new AbstractC4211i.b(constructor);
    }

    @Override // p010a9.InterfaceC0189q
    /* JADX INFO: renamed from: e */
    public Object mo236e(Object obj, Object obj2, Object obj3) {
        return InterfaceC3705l.a.m13772d(this, obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: e0 */
    public final AbstractC4211i.h m13757e0(Method method) {
        return mo13643X() ? new AbstractC4211i.h.a(method, m13755j0()) : new AbstractC4211i.h.e(method);
    }

    public boolean equals(Object obj) {
        C3697j1 c3697j1M13806c = AbstractC3714m3.m13806c(obj);
        return c3697j1M13806c != null && AbstractC1061t.m3842c(mo13638S(), c3697j1M13806c.mo13638S()) && AbstractC1061t.m3842c(getName(), c3697j1M13806c.getName()) && AbstractC1061t.m3842c(this.f10225x, c3697j1M13806c.f10225x) && AbstractC1061t.m3842c(this.f10226y, c3697j1M13806c.f10226y);
    }

    /* JADX INFO: renamed from: f0 */
    public final AbstractC4211i.h m13758f0(Method method) {
        return mo13643X() ? new AbstractC4211i.h.b(method) : new AbstractC4211i.h.f(method);
    }

    /* JADX INFO: renamed from: g0 */
    public final InterfaceC4210h m13759g0(Method method, boolean z10) {
        if (mo13643X()) {
            return new AbstractC4211i.h.c(method, z10, m13762m0(method) ? this.f10226y : m13755j0());
        }
        return new AbstractC4211i.h.g(method);
    }

    @Override // p024b9.InterfaceC1051o
    public int getArity() {
        return AbstractC4212j.m16673a(mo13637R());
    }

    @Override // p098g9.InterfaceC2548b
    public String getName() {
        String strM23030c = mo13792Z().getName().m23030c();
        strM23030c.getClass();
        return strM23030c;
    }

    public int hashCode() {
        return (((mo13638S().hashCode() * 31) + getName().hashCode()) * 31) + this.f10225x.hashCode();
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return InterfaceC3705l.a.m13769a(this);
    }

    @Override // p098g9.InterfaceC2552f
    /* JADX INFO: renamed from: k */
    public boolean mo3819k() {
        return mo13792Z().mo7422k();
    }

    @Override // p142j9.AbstractC3656b0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6056z mo13792Z() {
        Object objM13649c = this.f10227z.m13649c(this, f10221C[0]);
        objM13649c.getClass();
        return (InterfaceC6056z) objM13649c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX INFO: renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p229p9.InterfaceC6056z m13761l0(p229p9.InterfaceC6056z r5) {
        /*
            r4 = this;
            java.util.List r0 = r5.mo12680m()
            r0.getClass()
            r1 = 0
            if (r0 == 0) goto L11
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L11
            goto L28
        L11:
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            p9.s1 r2 = (p229p9.InterfaceC6039s1) r2
            boolean r2 = r2.mo24071y0()
            if (r2 == 0) goto L15
            goto L8f
        L28:
            p9.m r0 = r5.mo7443b()
            r0.getClass()
            boolean r0 = sa.AbstractC7261k.m28782g(r0)
            if (r0 == 0) goto L8f
            k9.h r0 = r4.mo13637R()
            java.lang.reflect.Member r0 = r0.mo16638b()
            r0.getClass()
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L8f
            r0 = 0
            sb.h r5 = p327wa.AbstractC9211e.m35871z(r5, r0)
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r5.next()
            r2 = r0
            p9.b r2 = (p229p9.InterfaceC5986b) r2
            java.util.List r2 = r2.mo12680m()
            r2.getClass()
            if (r2 == 0) goto L70
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L70
            goto L53
        L70:
            java.util.Iterator r2 = r2.iterator()
        L74:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r2.next()
            p9.s1 r3 = (p229p9.InterfaceC6039s1) r3
            boolean r3 = r3.mo24071y0()
            if (r3 == 0) goto L74
            goto L88
        L87:
            r0 = r1
        L88:
            boolean r5 = r0 instanceof p229p9.InterfaceC6056z
            if (r5 == 0) goto L8f
            p9.z r0 = (p229p9.InterfaceC6056z) r0
            return r0
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p142j9.C3697j1.m13761l0(p9.z):p9.z");
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public Object mo27m(Object obj) {
        return InterfaceC3705l.a.m13770b(this, obj);
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m13762m0(Method method) {
        AbstractC2706r0 type;
        InterfaceC5988b1 interfaceC5988b1Mo12679k0 = mo13792Z().mo12679k0();
        if (interfaceC5988b1Mo12679k0 == null || (type = interfaceC5988b1Mo12679k0.getType()) == null || !AbstractC7261k.m28778c(type)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        Class cls = (Class) AbstractC5106t.m20720Z(parameterTypes);
        return cls != null && cls.isInterface();
    }

    @Override // p098g9.InterfaceC2548b
    /* JADX INFO: renamed from: n */
    public boolean mo3783n() {
        return mo13792Z().mo7423n();
    }

    @Override // p010a9.InterfaceC0190r
    /* JADX INFO: renamed from: p */
    public Object mo284p(Object obj, Object obj2, Object obj3, Object obj4) {
        return InterfaceC3705l.a.m13773e(this, obj, obj2, obj3, obj4);
    }

    @Override // p010a9.InterfaceC0192t
    /* JADX INFO: renamed from: s */
    public Object mo361s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return InterfaceC3705l.a.m13775g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // p010a9.InterfaceC0191s
    /* JADX INFO: renamed from: t */
    public Object mo231t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return InterfaceC3705l.a.m13774f(this, obj, obj2, obj3, obj4, obj5);
    }

    public String toString() {
        return C3679f3.f10193a.m13711f(mo13792Z());
    }

    @Override // p098g9.InterfaceC2552f
    /* JADX INFO: renamed from: u */
    public boolean mo3820u() {
        return mo13792Z().mo24121u();
    }

    @Override // p010a9.InterfaceC0188p
    public Object invoke(Object obj, Object obj2) {
        return InterfaceC3705l.a.m13771c(this, obj, obj2);
    }

    public /* synthetic */ C3697j1(AbstractC3672e1 abstractC3672e1, String str, String str2, InterfaceC6056z interfaceC6056z, Object obj, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC3672e1, str, str2, interfaceC6056z, (i10 & 16) != 0 ? AbstractC1033f.f3188w : obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3697j1(AbstractC3672e1 abstractC3672e1, String str, String str2, Object obj) {
        this(abstractC3672e1, str, str2, null, obj);
        abstractC3672e1.getClass();
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3697j1(AbstractC3672e1 abstractC3672e1, InterfaceC6056z interfaceC6056z) {
        abstractC3672e1.getClass();
        interfaceC6056z.getClass();
        String strM23030c = interfaceC6056z.getName().m23030c();
        strM23030c.getClass();
        this(abstractC3672e1, strM23030c, C3689h3.f10209a.m13737g(interfaceC6056z).mo13824a(), interfaceC6056z, null, 16, null);
    }
}
