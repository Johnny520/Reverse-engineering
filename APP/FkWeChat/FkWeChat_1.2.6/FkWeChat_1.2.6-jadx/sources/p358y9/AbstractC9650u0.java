package p358y9;

import ba.C1079g;
import ba.C1083k;
import java.util.Iterator;
import p011aa.C0200e;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2374c0;
import p213oa.C5692c;
import p229p9.AbstractC6043u;
import p229p9.AbstractC6051w1;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC6056z;
import p243q9.InterfaceC6328c;
import p376zd.C9987e;

/* JADX INFO: renamed from: y9.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9650u0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6328c m37750a(C1083k c1083k, InterfaceC2374c0 interfaceC2374c0) {
        Object next;
        c1083k.getClass();
        interfaceC2374c0.getClass();
        if (interfaceC2374c0.mo8601F() == null) {
            C9987e.m38645a("Nullability annotations on unbounded wildcards aren't supported");
            return null;
        }
        Iterator it = new C1079g(c1083k, interfaceC2374c0, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC6328c interfaceC6328c = (InterfaceC6328c) next;
            for (C5692c c5692c : AbstractC9612b0.m37606f()) {
                if (AbstractC1061t.m3842c(interfaceC6328c.mo5549d(), c5692c)) {
                    break loop0;
                }
            }
        }
        return (InterfaceC6328c) next;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m37751b(InterfaceC5986b interfaceC5986b) {
        interfaceC5986b.getClass();
        return (interfaceC5986b instanceof InterfaceC6056z) && AbstractC1061t.m3842c(interfaceC5986b.mo436Q(C0200e.f521X), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m37752c(C9616d0 c9616d0) {
        c9616d0.getClass();
        return c9616d0.m37623c().mo27m(AbstractC9612b0.m37605e()) == EnumC9638o0.f32829u;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC6043u m37753d(AbstractC6051w1 abstractC6051w1) {
        abstractC6051w1.getClass();
        AbstractC6043u abstractC6043uM37768g = AbstractC9654y.m37768g(abstractC6051w1);
        abstractC6043uM37768g.getClass();
        return abstractC6043uM37768g;
    }
}
