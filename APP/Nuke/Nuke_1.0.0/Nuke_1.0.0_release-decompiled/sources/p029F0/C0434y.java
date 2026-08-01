package p029F0;

import p041H0.InterfaceC0627x;
import p112W2.InterfaceC1604f;
import p153e1.C2005a;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: F0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0434y extends AbstractC2206o implements InterfaceC0627x {

    /* JADX INFO: renamed from: r */
    public InterfaceC1604f f1306r;

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        return (InterfaceC0378P) this.f1306r.mo5f(interfaceC0379Q, interfaceC0376N, new C2005a(j5));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f1306r + ')';
    }
}
