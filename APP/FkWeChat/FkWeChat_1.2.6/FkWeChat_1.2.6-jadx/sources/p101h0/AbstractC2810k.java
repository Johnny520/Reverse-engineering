package p101h0;

import p010a9.InterfaceC0184l;
import p024b9.C1055q;
import p040d0.C1848a;
import p056e0.C1964c;
import p166l2.AbstractC4560k2;
import p166l2.InterfaceC4553j;
import p166l2.InterfaceC4556j2;
import p172l8.C4700i0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: h0.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2810k {

    /* JADX INFO: renamed from: h0.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0184l {
        public a(Object obj) {
            super(1, obj, C1848a.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m10010y((InterfaceC0184l) obj);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: y */
        public final void m10010y(InterfaceC0184l interfaceC0184l) {
            ((C1848a) this.f3190r).m6541b(interfaceC0184l);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10006a(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC4556j2 interfaceC4556j2) {
        if (interfaceC4556j2 instanceof C2800a) {
            interfaceC0184l.mo27m(((C2800a) interfaceC4556j2).m9986G2());
            return true;
        }
        C10010p0.m38820a("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m10007b(C1848a c1848a, InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.mo27m(c1848a);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final C1964c m10008c(InterfaceC4553j interfaceC4553j) {
        final C1848a c1848a = new C1848a();
        m10009d(interfaceC4553j, new a(c1848a), new InterfaceC0184l() { // from class: h0.i
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC2810k.m10007b(c1848a, (InterfaceC0184l) obj);
            }
        });
        return c1848a.m6542c();
    }

    /* JADX INFO: renamed from: d */
    public static final void m10009d(InterfaceC4553j interfaceC4553j, final InterfaceC0184l interfaceC0184l, final InterfaceC0184l interfaceC0184l2) {
        AbstractC4560k2.m18021c(interfaceC4553j, C2804e.f7325a, new InterfaceC0184l() { // from class: h0.j
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(AbstractC2810k.m10006a(interfaceC0184l2, interfaceC0184l, (InterfaceC4556j2) obj));
            }
        });
    }
}
