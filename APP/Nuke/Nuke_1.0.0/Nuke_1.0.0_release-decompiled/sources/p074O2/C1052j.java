package p074O2;

import java.io.Serializable;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: O2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1052j implements InterfaceC1051i, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C1052j f3286d = new C1052j();

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: C */
    public final InterfaceC1049g mo1166C(InterfaceC1050h interfaceC1050h) {
        AbstractC1665j.m2985e(interfaceC1050h, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: j */
    public final InterfaceC1051i mo1167j(InterfaceC1050h interfaceC1050h) {
        AbstractC1665j.m2985e(interfaceC1050h, "key");
        return this;
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: m */
    public final InterfaceC1051i mo1168m(InterfaceC1051i interfaceC1051i) {
        AbstractC1665j.m2985e(interfaceC1051i, "context");
        return interfaceC1051i;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: A */
    public final Object mo1165A(InterfaceC1603e interfaceC1603e, Object obj) {
        return obj;
    }
}
