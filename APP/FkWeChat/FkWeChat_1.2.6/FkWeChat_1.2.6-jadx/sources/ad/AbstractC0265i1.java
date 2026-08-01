package ad;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.C1050n0;
import p172l8.C4700i0;
import p300uc.InterfaceC8662p;
import p329wc.AbstractC9217e;
import p329wc.AbstractC9224l;
import p329wc.InterfaceC9218f;
import p375zc.AbstractC9939c;
import p375zc.AbstractC9957l;

/* JADX INFO: renamed from: ad.i1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0265i1 {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m782a(C1050n0 c1050n0, AbstractC9957l abstractC9957l) {
        abstractC9957l.getClass();
        c1050n0.f3208q = abstractC9957l;
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m784c(InterfaceC9218f interfaceC9218f) {
        return (interfaceC9218f.mo35896j() instanceof AbstractC9217e) || interfaceC9218f.mo35896j() == AbstractC9224l.b.f31485a;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC9957l m785d(AbstractC9939c abstractC9939c, Object obj, InterfaceC8662p interfaceC8662p) {
        abstractC9939c.getClass();
        interfaceC8662p.getClass();
        final C1050n0 c1050n0 = new C1050n0();
        new C0281p0(abstractC9939c, new InterfaceC0184l() { // from class: ad.h1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj2) {
                return AbstractC0265i1.m782a(c1050n0, (AbstractC9957l) obj2);
            }
        }).mo632G(interfaceC8662p, obj);
        Object obj2 = c1050n0.f3208q;
        if (obj2 != null) {
            return (AbstractC9957l) obj2;
        }
        AbstractC1061t.m3851l("result");
        return null;
    }
}
