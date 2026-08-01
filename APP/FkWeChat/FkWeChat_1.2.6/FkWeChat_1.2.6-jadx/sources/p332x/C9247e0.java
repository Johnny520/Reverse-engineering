package p332x;

import androidx.compose.foundation.lazy.layout.AbstractC0413q;
import androidx.compose.foundation.lazy.layout.C0433w1;
import androidx.compose.foundation.lazy.layout.InterfaceC0370f;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0190r;

/* JADX INFO: renamed from: x.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9247e0 extends AbstractC0413q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0190r f31581a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f31582b;

    /* JADX INFO: renamed from: c */
    public final int f31583c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0370f f31584d;

    public C9247e0(InterfaceC0190r interfaceC0190r, InterfaceC0184l interfaceC0184l, int i10) {
        this.f31581a = interfaceC0190r;
        this.f31582b = interfaceC0184l;
        this.f31583c = i10;
        C0433w1 c0433w1 = new C0433w1();
        c0433w1.m1443c(i10, new C9283u(interfaceC0184l, interfaceC0190r));
        this.f31584d = c0433w1;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0413q
    /* JADX INFO: renamed from: h */
    public InterfaceC0370f mo1319h() {
        return this.f31584d;
    }
}
