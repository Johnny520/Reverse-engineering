package p361yc;

import java.util.Arrays;
import java.util.Iterator;
import p010a9.InterfaceC0184l;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5081g0;
import p329wc.AbstractC9221i;
import p329wc.AbstractC9224l;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.l2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9724l2 {
    /* JADX INFO: renamed from: a */
    public static CharSequence m37967a(InterfaceC9218f interfaceC9218f, int i10) {
        return interfaceC9218f.mo35892f(i10) + ": " + interfaceC9218f.mo35894h(i10).mo35888a();
    }

    /* JADX INFO: renamed from: b */
    public static final int m37968b(InterfaceC9218f interfaceC9218f, InterfaceC9218f[] interfaceC9218fArr) {
        interfaceC9218f.getClass();
        interfaceC9218fArr.getClass();
        int iHashCode = (interfaceC9218f.mo35888a().hashCode() * 31) + Arrays.hashCode(interfaceC9218fArr);
        Iterable iterableM35901a = AbstractC9221i.m35901a(interfaceC9218f);
        Iterator it = iterableM35901a.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strMo35888a = ((InterfaceC9218f) it.next()).mo35888a();
            if (strMo35888a != null) {
                iHashCode3 = strMo35888a.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator it2 = iterableM35901a.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            AbstractC9224l abstractC9224lMo35896j = ((InterfaceC9218f) it2.next()).mo35896j();
            iHashCode2 = i12 + (abstractC9224lMo35896j != null ? abstractC9224lMo35896j.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }

    /* JADX INFO: renamed from: c */
    public static final String m37969c(final InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return AbstractC5081g0.m20585s0(AbstractC2368o.m8592s(0, interfaceC9218f.mo35891e()), ", ", interfaceC9218f.mo35888a() + '(', ")", 0, null, new InterfaceC0184l() { // from class: yc.k2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC9724l2.m37967a(interfaceC9218f, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}
