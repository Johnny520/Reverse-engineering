package p017b2;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: b2.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0933c implements InterfaceC0932b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f2898a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0512i2 f2899b;

    public C0933c(int i10, InterfaceC0184l interfaceC0184l) {
        this.f2898a = interfaceC0184l;
        this.f2899b = AbstractC0522j5.m1773e(C0931a.m3433c(i10), null, 2, null);
    }

    @Override // p017b2.InterfaceC0932b
    /* JADX INFO: renamed from: a */
    public int mo3442a() {
        return ((C0931a) this.f2899b.getValue()).m3439i();
    }

    /* JADX INFO: renamed from: b */
    public void m3443b(int i10) {
        this.f2899b.setValue(C0931a.m3433c(i10));
    }

    public /* synthetic */ C0933c(int i10, InterfaceC0184l interfaceC0184l, AbstractC1043k abstractC1043k) {
        this(i10, interfaceC0184l);
    }
}
