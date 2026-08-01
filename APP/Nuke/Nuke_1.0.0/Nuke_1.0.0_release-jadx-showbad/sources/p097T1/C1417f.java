package p097T1;

import p088R1.C1214o;
import p088R1.InterfaceC1194D;
import p195l2.C2507k;

/* JADX INFO: renamed from: T1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1417f extends C2507k {

    /* JADX INFO: renamed from: d */
    public C1214o f5068d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p195l2.C2507k
    /* JADX INFO: renamed from: b */
    public final int mo2719b(Object obj) {
        InterfaceC1194D interfaceC1194D = (InterfaceC1194D) obj;
        if (interfaceC1194D == null) {
            return 1;
        }
        return interfaceC1194D.mo2254c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p195l2.C2507k
    /* JADX INFO: renamed from: c */
    public final void mo2720c(Object obj, Object obj2) {
        InterfaceC1194D interfaceC1194D = (InterfaceC1194D) obj2;
        C1214o c1214o = this.f5068d;
        if (c1214o == null || interfaceC1194D == null) {
            return;
        }
        c1214o.f4038e.m2260c(interfaceC1194D, true);
    }
}
