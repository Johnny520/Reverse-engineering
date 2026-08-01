package p169h0;

import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: h0.n */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2205n extends InterfaceC2207p {
    @Override // p169h0.InterfaceC2207p
    /* JADX INFO: renamed from: a */
    default boolean mo4019a(InterfaceC1601c interfaceC1601c) {
        return ((Boolean) interfaceC1601c.mo1h(this)).booleanValue();
    }

    @Override // p169h0.InterfaceC2207p
    /* JADX INFO: renamed from: b */
    default Object mo4020b(InterfaceC1603e interfaceC1603e, Object obj) {
        return interfaceC1603e.mo0g(obj, this);
    }
}
