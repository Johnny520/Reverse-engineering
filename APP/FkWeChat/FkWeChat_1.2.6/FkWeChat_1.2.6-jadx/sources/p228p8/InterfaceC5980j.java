package p228p8;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p228p8.InterfaceC5977g;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: p8.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5980j {

    /* JADX INFO: renamed from: p8.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static InterfaceC5980j m23983a(InterfaceC5980j interfaceC5980j, b bVar) {
            interfaceC5980j.getClass();
            bVar.getClass();
            InterfaceC5980j interfaceC5980jMo1649L = interfaceC5980j.mo1649L(bVar.getKey());
            C5981k c5981k = C5981k.f18917q;
            if (interfaceC5980jMo1649L == c5981k) {
                return bVar;
            }
            InterfaceC5977g.b bVar2 = InterfaceC5977g.f18915n;
            InterfaceC5977g interfaceC5977g = (InterfaceC5977g) interfaceC5980jMo1649L.mo1654h(bVar2);
            if (interfaceC5977g == null) {
                return new C5975e(interfaceC5980jMo1649L, bVar);
            }
            InterfaceC5980j interfaceC5980jMo1649L2 = interfaceC5980jMo1649L.mo1649L(bVar2);
            return interfaceC5980jMo1649L2 == c5981k ? new C5975e(bVar, interfaceC5977g) : new C5975e(new C5975e(interfaceC5980jMo1649L2, bVar), interfaceC5977g);
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC5980j m23984b(InterfaceC5980j interfaceC5980j, InterfaceC5980j interfaceC5980j2) {
            interfaceC5980j2.getClass();
            return interfaceC5980j2 == C5981k.f18917q ? interfaceC5980j : (InterfaceC5980j) interfaceC5980j2.mo1655q(interfaceC5980j, new InterfaceC0188p() { // from class: p8.i
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return InterfaceC5980j.a.m23983a((InterfaceC5980j) obj, (InterfaceC5980j.b) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p8.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b extends InterfaceC5980j {

        /* JADX INFO: renamed from: p8.j$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            /* JADX INFO: renamed from: a */
            public static Object m23985a(b bVar, Object obj, InterfaceC0188p interfaceC0188p) {
                interfaceC0188p.getClass();
                return interfaceC0188p.invoke(obj, bVar);
            }

            /* JADX INFO: renamed from: b */
            public static b m23986b(b bVar, c cVar) {
                cVar.getClass();
                if (AbstractC1061t.m3842c(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            /* JADX INFO: renamed from: c */
            public static InterfaceC5980j m23987c(b bVar, c cVar) {
                cVar.getClass();
                return AbstractC1061t.m3842c(bVar.getKey(), cVar) ? C5981k.f18917q : bVar;
            }

            /* JADX INFO: renamed from: d */
            public static InterfaceC5980j m23988d(b bVar, InterfaceC5980j interfaceC5980j) {
                interfaceC5980j.getClass();
                return a.m23984b(bVar, interfaceC5980j);
            }
        }

        c getKey();

        @Override // p228p8.InterfaceC5980j
        /* JADX INFO: renamed from: h */
        b mo1654h(c cVar);
    }

    /* JADX INFO: renamed from: p8.j$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface c {
    }

    /* JADX INFO: renamed from: L */
    InterfaceC5980j mo1649L(c cVar);

    /* JADX INFO: renamed from: c0 */
    InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j);

    /* JADX INFO: renamed from: h */
    b mo1654h(c cVar);

    /* JADX INFO: renamed from: q */
    Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p);
}
