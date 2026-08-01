package p101h0;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p040d0.C1848a;
import p166l2.AbstractC4549i;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4545h;
import p172l8.C4700i0;
import p179m2.AbstractC4854i0;

/* JADX INFO: renamed from: h0.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2803d extends AbstractC4565m implements InterfaceC4545h {

    /* JADX INFO: renamed from: H */
    public InterfaceC0188p f7324H;

    public C2803d(InterfaceC0188p interfaceC0188p) {
        this.f7324H = interfaceC0188p;
        m18049G2(new C2800a(new InterfaceC0184l() { // from class: h0.c
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C2803d.m9989M2(this.f7323q, (C1848a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M2 */
    public static C4700i0 m9989M2(C2803d c2803d, C1848a c1848a) {
        c2803d.f7324H.invoke(c1848a, AbstractC4549i.m17816a(c2803d, AbstractC4854i0.m19379d()));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: N2 */
    public final void m9990N2(InterfaceC0188p interfaceC0188p) {
        this.f7324H = interfaceC0188p;
    }
}
