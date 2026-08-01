package p042d2;

import android.view.KeyEvent;
import p010a9.InterfaceC0184l;
import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: d2.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1863h extends InterfaceC4507m.c implements InterfaceC1862g {

    /* JADX INFO: renamed from: F */
    public InterfaceC0184l f5193F;

    /* JADX INFO: renamed from: G */
    public InterfaceC0184l f5194G;

    public C1863h(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        this.f5193F = interfaceC0184l;
        this.f5194G = interfaceC0184l2;
    }

    /* JADX INFO: renamed from: G2 */
    public final void m6617G2(InterfaceC0184l interfaceC0184l) {
        this.f5193F = interfaceC0184l;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m6618H2(InterfaceC0184l interfaceC0184l) {
        this.f5194G = interfaceC0184l;
    }

    @Override // p042d2.InterfaceC1862g
    /* JADX INFO: renamed from: Q */
    public boolean mo6615Q(KeyEvent keyEvent) {
        InterfaceC0184l interfaceC0184l = this.f5194G;
        if (interfaceC0184l != null) {
            return ((Boolean) interfaceC0184l.mo27m(C1857b.m6591a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p042d2.InterfaceC1862g
    /* JADX INFO: renamed from: u0 */
    public boolean mo6616u0(KeyEvent keyEvent) {
        InterfaceC0184l interfaceC0184l = this.f5193F;
        if (interfaceC0184l != null) {
            return ((Boolean) interfaceC0184l.mo27m(C1857b.m6591a(keyEvent))).booleanValue();
        }
        return false;
    }
}
