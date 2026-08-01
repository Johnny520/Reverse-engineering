package p235q1;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: q1.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6201f extends InterfaceC4507m.c implements InterfaceC6207i {

    /* JADX INFO: renamed from: F */
    public InterfaceC0184l f19252F;

    /* JADX INFO: renamed from: G */
    public InterfaceC6198d0 f19253G;

    public C6201f(InterfaceC0184l interfaceC0184l) {
        this.f19252F = interfaceC0184l;
    }

    /* JADX INFO: renamed from: G2 */
    public final void m24359G2(InterfaceC0184l interfaceC0184l) {
        this.f19252F = interfaceC0184l;
    }

    @Override // p235q1.InterfaceC6207i
    /* JADX INFO: renamed from: Y1 */
    public void mo13026Y1(InterfaceC6198d0 interfaceC6198d0) {
        if (AbstractC1061t.m3842c(this.f19253G, interfaceC6198d0)) {
            return;
        }
        this.f19253G = interfaceC6198d0;
        this.f19252F.mo27m(interfaceC6198d0);
    }
}
