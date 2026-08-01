package p034c7;

import java.util.Iterator;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p023b8.AbstractC1011d;
import p023b8.AbstractC1012e;
import p023b8.C1009b;
import p023b8.C1016i;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p035c8.C1399a;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p153k4.AbstractC3955e;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p241q7.AbstractC6312r0;
import p241q7.C6286e0;
import p241q7.C6310q0;
import p241q7.C6319w;
import p241q7.InterfaceC6297k;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p282t7.AbstractC8180d;
import p282t7.C8174a;
import p282t7.InterfaceC8176b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: c7.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1377m {

    /* JADX INFO: renamed from: a */
    public static final C8174a f4111a;

    /* JADX INFO: renamed from: c7.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f4112q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f4113r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f4114s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC1385q f4115t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Object f4116u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC0189q f4117v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1385q interfaceC1385q, Object obj, InterfaceC0189q interfaceC0189q, InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
            this.f4115t = interfaceC1385q;
            this.f4116u = obj;
            this.f4117v = interfaceC0189q;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f4112q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                AbstractC1012e abstractC1012e = (AbstractC1012e) this.f4113r;
                Object obj2 = this.f4114s;
                Object objM3752c = abstractC1012e.m3752c();
                if ((objM3752c instanceof C6286e0) && AbstractC1061t.m3842c(AbstractC1386q0.m5448a(((C6286e0) objM3752c).m24887h(), this.f4115t), this.f4116u)) {
                    InterfaceC0189q interfaceC0189q = this.f4117v;
                    this.f4113r = null;
                    this.f4112q = 1;
                    if (interfaceC0189q.mo236e(abstractC1012e, obj2, this) == objM24992g) {
                        return objM24992g;
                    }
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(AbstractC1012e abstractC1012e, Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f4115t, this.f4116u, this.f4117v, interfaceC5976f);
            aVar.f4113r = abstractC1012e;
            aVar.f4114s = obj;
            return aVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    static {
        InterfaceC2560n interfaceC2560nM3817l;
        InterfaceC2549c interfaceC2549cM3807b = AbstractC1052o0.m3807b(InterfaceC8176b.class);
        try {
            interfaceC2560nM3817l = AbstractC1052o0.m3817l(InterfaceC8176b.class);
        } catch (Throwable unused) {
            interfaceC2560nM3817l = null;
        }
        f4111a = new C8174a("ApplicationPluginRegistry", new C1399a(interfaceC2549cM3807b, interfaceC2560nM3817l));
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC8176b m5432a() {
        return AbstractC8180d.m31846a(true);
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m5433b(Object obj) {
        obj.getClass();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m5434c(AbstractC1011d abstractC1011d, AbstractC1011d abstractC1011d2, InterfaceC1385q interfaceC1385q, Object obj) throws C1009b {
        for (C1016i c1016i : abstractC1011d.m3744r()) {
            Iterator it = abstractC1011d2.m3750y(c1016i).iterator();
            while (it.hasNext()) {
                abstractC1011d.m3749w(c1016i, new a(interfaceC1385q, obj, (InterfaceC0189q) it.next(), null));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m5435d(InterfaceC6297k interfaceC6297k, C6319w c6319w) {
        InterfaceC6297k interfaceC6297kMo24909c = interfaceC6297k.mo24909c(c6319w.m24982Z());
        Iterator it = c6319w.m24980X().iterator();
        while (it.hasNext()) {
            interfaceC6297kMo24909c.mo24908b((InterfaceC0188p) it.next());
        }
        Iterator it2 = c6319w.m24979W().iterator();
        while (it2.hasNext()) {
            m5435d(interfaceC6297kMo24909c, (C6319w) it2.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC8176b m5436e(AbstractC1011d abstractC1011d) {
        abstractC1011d.getClass();
        return (InterfaceC8176b) abstractC1011d.getAttributes().mo31835f(f4111a, new InterfaceC0173a() { // from class: c7.k
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC1377m.m5432a();
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final Object m5437f(AbstractC1011d abstractC1011d, InterfaceC1372j0 interfaceC1372j0, InterfaceC0184l interfaceC0184l) throws C1398z {
        abstractC1011d.getClass();
        interfaceC1372j0.getClass();
        interfaceC0184l.getClass();
        if ((abstractC1011d instanceof C6319w) && (interfaceC1372j0 instanceof InterfaceC1385q)) {
            return m5439h((C6319w) abstractC1011d, (InterfaceC1385q) interfaceC1372j0, interfaceC0184l);
        }
        InterfaceC8176b interfaceC8176bM5436e = m5436e(abstractC1011d);
        Object objMo31832c = interfaceC8176bM5436e.mo31832c(interfaceC1372j0.getKey());
        if (objMo31832c == null) {
            Object objMo5406a = interfaceC1372j0.mo5406a(abstractC1011d, interfaceC0184l);
            interfaceC8176bM5436e.mo31833d(interfaceC1372j0.getKey(), objMo5406a);
            return objMo5406a;
        }
        if (AbstractC1061t.m3842c(objMo31832c, interfaceC1372j0)) {
            return objMo31832c;
        }
        throw new C1398z("Please make sure that you use unique name for the plugin and don't install it twice. Conflicting application plugin is already installed with the same key as `" + interfaceC1372j0.getKey().m31825a() + '`');
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m5438g(AbstractC1011d abstractC1011d, InterfaceC1372j0 interfaceC1372j0, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC0184l = new InterfaceC0184l() { // from class: c7.l
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj2) {
                    return AbstractC1377m.m5433b(obj2);
                }
            };
        }
        return m5437f(abstractC1011d, interfaceC1372j0, interfaceC0184l);
    }

    /* JADX INFO: renamed from: h */
    public static final Object m5439h(C6319w c6319w, InterfaceC1385q interfaceC1385q, InterfaceC0184l interfaceC0184l) throws C1009b, C1398z {
        if (m5436e(c6319w).mo31832c(interfaceC1385q.getKey()) != null) {
            throw new C1398z("Please make sure that you use unique name for the plugin and don't install it twice. Plugin `" + interfaceC1385q.getKey().m31825a() + "` is already installed to the pipeline " + c6319w);
        }
        if (m5436e(AbstractC6312r0.m24963a(c6319w)).mo31832c(interfaceC1385q.getKey()) != null) {
            throw new C1398z("Installing RouteScopedPlugin to application and route is not supported. Consider moving application level install to routing root.");
        }
        C6319w c6310q0 = c6319w instanceof C6310q0 ? new C6310q0(((C6310q0) c6319w).m24949F()) : new C6319w(c6319w.getParent(), c6319w.m24982Z(), c6319w.mo3742p(), c6319w.m5377Q());
        Object objMo5406a = interfaceC1385q.mo5406a(c6310q0, interfaceC0184l);
        m5436e(c6319w).mo31833d(interfaceC1385q.getKey(), objMo5406a);
        Iterator it = c6310q0.m24979W().iterator();
        while (it.hasNext()) {
            m5435d(c6319w, (C6319w) it.next());
        }
        c6319w.m3725D(c6310q0);
        c6319w.m5378R().m3725D(c6310q0.m5378R());
        c6319w.m5379S().m3725D(c6310q0.m5379S());
        m5434c(c6319w, c6310q0, interfaceC1385q, objMo5406a);
        m5434c(c6319w.m5378R(), c6310q0.m5378R(), interfaceC1385q, objMo5406a);
        m5434c(c6319w.m5379S(), c6310q0.m5379S(), interfaceC1385q, objMo5406a);
        return objMo5406a;
    }

    /* JADX INFO: renamed from: i */
    public static final Object m5440i(AbstractC1011d abstractC1011d, InterfaceC1372j0 interfaceC1372j0) {
        abstractC1011d.getClass();
        interfaceC1372j0.getClass();
        Object objM5448a = abstractC1011d instanceof C6319w ? AbstractC1386q0.m5448a((C6319w) abstractC1011d, interfaceC1372j0) : m5441j(abstractC1011d, interfaceC1372j0);
        if (objM5448a != null) {
            return objM5448a;
        }
        throw new C1358c0(interfaceC1372j0.getKey());
    }

    /* JADX INFO: renamed from: j */
    public static final Object m5441j(AbstractC1011d abstractC1011d, InterfaceC1372j0 interfaceC1372j0) {
        abstractC1011d.getClass();
        interfaceC1372j0.getClass();
        return m5436e(abstractC1011d).mo31832c(interfaceC1372j0.getKey());
    }

    /* JADX INFO: renamed from: k */
    public static final void m5442k(AbstractC1011d abstractC1011d) {
        abstractC1011d.getClass();
        for (C8174a c8174a : m5436e(abstractC1011d).mo31831b()) {
            c8174a.getClass();
            m5443l(abstractC1011d, c8174a);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m5443l(AbstractC1011d abstractC1011d, C8174a c8174a) throws Exception {
        Object objMo31832c;
        abstractC1011d.getClass();
        c8174a.getClass();
        InterfaceC8176b interfaceC8176b = (InterfaceC8176b) abstractC1011d.getAttributes().mo31832c(f4111a);
        if (interfaceC8176b == null || (objMo31832c = interfaceC8176b.mo31832c(c8174a)) == null) {
            return;
        }
        if (objMo31832c instanceof AutoCloseable) {
            AbstractC3955e.m15664a((AutoCloseable) objMo31832c);
        }
        interfaceC8176b.mo31830a(c8174a);
    }
}
