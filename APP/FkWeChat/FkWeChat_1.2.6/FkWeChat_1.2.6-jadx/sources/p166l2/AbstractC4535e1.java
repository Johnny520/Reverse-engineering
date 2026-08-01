package p166l2;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p165l1.AbstractC4498d;
import p165l1.C4502h;
import p165l1.InterfaceC4507m;
import p349y0.C9508c;

/* JADX INFO: renamed from: l2.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4535e1 {

    /* JADX INFO: renamed from: l2.e1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C9508c f13236r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9508c c9508c) {
            super(1);
            this.f13236r = c9508c;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(InterfaceC4507m.b bVar) {
            this.f13236r.m37029b(bVar);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m17633c(InterfaceC4507m.b bVar, InterfaceC4507m.b bVar2) {
        if (AbstractC1061t.m3842c(bVar, bVar2)) {
            return 2;
        }
        return AbstractC4498d.m17409a(bVar, bVar2) ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public static final C9508c m17634d(InterfaceC4507m interfaceC4507m, C9508c c9508c, C9508c c9508c2) {
        c9508c2.m37029b(interfaceC4507m);
        a aVar = null;
        while (c9508c2.m37039l() != 0) {
            InterfaceC4507m interfaceC4507m2 = (InterfaceC4507m) c9508c2.m37045r(c9508c2.m37039l() - 1);
            if (interfaceC4507m2 instanceof C4502h) {
                C4502h c4502h = (C4502h) interfaceC4507m2;
                c9508c2.m37029b(c4502h.m17431j());
                c9508c2.m37029b(c4502h.m17432k());
            } else if (interfaceC4507m2 instanceof InterfaceC4507m.b) {
                c9508c.m37029b(interfaceC4507m2);
            } else {
                if (aVar == null) {
                    aVar = new a(c9508c);
                }
                interfaceC4507m2.mo17430b(aVar);
                aVar = aVar;
            }
        }
        return c9508c;
    }

    /* JADX INFO: renamed from: e */
    public static final void m17635e(AbstractC4606z0 abstractC4606z0, InterfaceC4507m.c cVar) {
        cVar.getClass();
        abstractC4606z0.mo1192k(cVar);
    }
}
