package p169h0;

import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: h0.p */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2207p {
    /* JADX INFO: renamed from: a */
    boolean mo4019a(InterfaceC1601c interfaceC1601c);

    /* JADX INFO: renamed from: b */
    Object mo4020b(InterfaceC1603e interfaceC1603e, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    default InterfaceC2207p mo4021c(InterfaceC2207p interfaceC2207p) {
        return interfaceC2207p == C2204m.f7185a ? this : new C2201j(this, interfaceC2207p);
    }
}
