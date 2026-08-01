package p022b7;

import p008a7.AbstractC0168d;
import p010a9.InterfaceC0184l;
import p172l8.C4700i0;
import p281t6.C8140d;
import p370z6.InterfaceC9878b;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9974z;
import p375zc.C9947g;

/* JADX INFO: renamed from: b7.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1004d {

    /* JADX INFO: renamed from: a */
    public static final AbstractC9939c f3111a = AbstractC9974z.m38608b(null, new InterfaceC0184l() { // from class: b7.c
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return AbstractC1004d.m3697a((C9947g) obj);
        }
    }, 1, null);

    /* JADX INFO: renamed from: a */
    public static C4700i0 m3697a(C9947g c9947g) {
        c9947g.getClass();
        c9947g.m38533f(true);
        c9947g.m38536i(true);
        c9947g.m38530c(true);
        c9947g.m38531d(true);
        c9947g.m38537j(false);
        c9947g.m38538k(false);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m3698b(InterfaceC9878b interfaceC9878b, AbstractC9939c abstractC9939c, C8140d c8140d) {
        interfaceC9878b.getClass();
        abstractC9939c.getClass();
        c8140d.getClass();
        AbstractC0168d.m403a(interfaceC9878b, c8140d, abstractC9939c);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3699c(InterfaceC9878b interfaceC9878b, AbstractC9939c abstractC9939c, C8140d c8140d, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC9939c = f3111a;
        }
        if ((i10 & 2) != 0) {
            c8140d = C8140d.a.f27224a.m31604b();
        }
        m3698b(interfaceC9878b, abstractC9939c, c8140d);
    }
}
