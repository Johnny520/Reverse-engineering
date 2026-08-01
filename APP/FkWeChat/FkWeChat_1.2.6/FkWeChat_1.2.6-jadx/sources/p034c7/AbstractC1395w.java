package p034c7;

import java.util.Iterator;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p055e.AbstractC1960a;
import p172l8.C4700i0;
import p241q7.C6319w;
import p282t7.C8174a;

/* JADX INFO: renamed from: c7.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1395w {

    /* JADX INFO: renamed from: c7.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1376l0 {

        /* JADX INFO: renamed from: g */
        public final C1353a f4150g;

        /* JADX INFO: renamed from: h */
        public final C1357c f4151h;

        /* JADX INFO: renamed from: i */
        public final Object f4152i;

        public a(C1353a c1353a, C1357c c1357c, Object obj, C8174a c8174a) {
            super(c8174a);
            this.f4150g = c1353a;
            this.f4151h = c1357c;
            this.f4152i = obj;
        }

        @Override // p034c7.AbstractC1376l0
        /* JADX INFO: renamed from: h */
        public C1357c mo5415h() {
            return this.f4151h;
        }

        @Override // p034c7.AbstractC1376l0
        /* JADX INFO: renamed from: i */
        public Object mo5416i() {
            return this.f4152i;
        }
    }

    /* JADX INFO: renamed from: c7.w$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1382o0 {

        /* JADX INFO: renamed from: g */
        public final C1353a f4153g;

        /* JADX INFO: renamed from: h */
        public final C1357c f4154h;

        /* JADX INFO: renamed from: i */
        public final Object f4155i;

        /* JADX INFO: renamed from: j */
        public final C6319w f4156j;

        public b(C1353a c1353a, C1357c c1357c, Object obj, C8174a c8174a) {
            super(c8174a);
            this.f4153g = c1353a;
            this.f4154h = c1357c;
            this.f4155i = obj;
            this.f4156j = c1357c instanceof C6319w ? (C6319w) c1357c : null;
        }

        @Override // p034c7.AbstractC1376l0
        /* JADX INFO: renamed from: h */
        public C1357c mo5415h() {
            return this.f4154h;
        }

        @Override // p034c7.AbstractC1376l0
        /* JADX INFO: renamed from: i */
        public Object mo5416i() {
            return this.f4155i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m5462a() {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static Object m5463b(InterfaceC0173a interfaceC0173a, C1357c c1357c) {
        c1357c.getClass();
        return interfaceC0173a.invoke();
    }

    /* JADX INFO: renamed from: c */
    public static Object m5464c(InterfaceC0173a interfaceC0173a, C1357c c1357c) {
        c1357c.getClass();
        return interfaceC0173a.invoke();
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC1369i m5467f(String str, final InterfaceC0173a interfaceC0173a, InterfaceC0184l interfaceC0184l) {
        str.getClass();
        interfaceC0173a.getClass();
        interfaceC0184l.getClass();
        return new C1371j(str, new InterfaceC0184l() { // from class: c7.v
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC1395w.m5463b(interfaceC0173a, (C1357c) obj);
            }
        }, interfaceC0184l);
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC1369i m5468g(String str, InterfaceC0184l interfaceC0184l) {
        str.getClass();
        interfaceC0184l.getClass();
        return m5467f(str, new InterfaceC0173a() { // from class: c7.t
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC1395w.m5462a();
            }
        }, interfaceC0184l);
    }

    /* JADX INFO: renamed from: h */
    public static final C1378m0 m5469h(InterfaceC1372j0 interfaceC1372j0, C1353a c1353a, C1357c c1357c, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3) {
        Object objMo27m = interfaceC0184l2.mo27m(c1357c);
        interfaceC0184l3.mo27m(objMo27m);
        a aVar = new a(c1353a, c1357c, objMo27m, interfaceC1372j0.getKey());
        m5472k(aVar, interfaceC0184l);
        return new C1378m0(aVar);
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC1380n0 m5470i(String str, final InterfaceC0173a interfaceC0173a, InterfaceC0184l interfaceC0184l) {
        str.getClass();
        interfaceC0173a.getClass();
        interfaceC0184l.getClass();
        return new C1384p0(str, new InterfaceC0184l() { // from class: c7.u
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC1395w.m5464c(interfaceC0173a, (C1357c) obj);
            }
        }, interfaceC0184l);
    }

    /* JADX INFO: renamed from: j */
    public static final C1378m0 m5471j(InterfaceC1372j0 interfaceC1372j0, C1353a c1353a, C1357c c1357c, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3) {
        Object objMo27m = interfaceC0184l2.mo27m(c1357c);
        interfaceC0184l3.mo27m(objMo27m);
        b bVar = new b(c1353a, c1357c, objMo27m, interfaceC1372j0.getKey());
        m5472k(bVar, interfaceC0184l);
        return new C1378m0(bVar);
    }

    /* JADX INFO: renamed from: k */
    public static final void m5472k(AbstractC1376l0 abstractC1376l0, InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.mo27m(abstractC1376l0);
        Iterator it = abstractC1376l0.m5410c().iterator();
        while (it.hasNext()) {
            ((C1356b0) it.next()).m5373a().mo27m(abstractC1376l0.mo5415h());
        }
        Iterator it2 = abstractC1376l0.m5413f().iterator();
        while (it2.hasNext()) {
            ((C1356b0) it2.next()).m5373a().mo27m(abstractC1376l0.mo5415h().m5378R());
        }
        Iterator it3 = abstractC1376l0.m5414g().iterator();
        while (it3.hasNext()) {
            ((C1356b0) it3.next()).m5373a().mo27m(abstractC1376l0.mo5415h().m5379S());
        }
        Iterator it4 = abstractC1376l0.m5409b().iterator();
        while (it4.hasNext()) {
            ((C1356b0) it4.next()).m5373a().mo27m(abstractC1376l0.mo5415h().m5379S());
        }
        Iterator it5 = abstractC1376l0.m5411d().iterator();
        if (it5.hasNext()) {
            AbstractC1960a.m7104a(it5.next());
            abstractC1376l0.mo5415h();
            throw null;
        }
    }
}
