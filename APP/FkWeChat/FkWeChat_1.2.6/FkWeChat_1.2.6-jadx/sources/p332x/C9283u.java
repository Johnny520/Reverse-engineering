package p332x;

import androidx.compose.foundation.lazy.layout.AbstractC0413q;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0190r;

/* JADX INFO: renamed from: x.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9283u implements AbstractC0413q.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f31743a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0190r f31744b;

    public C9283u(InterfaceC0184l interfaceC0184l, InterfaceC0190r interfaceC0190r) {
        this.f31743a = interfaceC0184l;
        this.f31744b = interfaceC0190r;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0190r m36125a() {
        return this.f31744b;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0413q.a
    public InterfaceC0184l getKey() {
        return this.f31743a;
    }
}
