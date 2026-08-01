package p303v;

import androidx.compose.foundation.lazy.layout.AbstractC0413q;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0190r;

/* JADX INFO: renamed from: v.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8701j implements AbstractC0413q.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f28896a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f28897b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0190r f28898c;

    public C8701j(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0190r interfaceC0190r) {
        this.f28896a = interfaceC0184l;
        this.f28897b = interfaceC0184l2;
        this.f28898c = interfaceC0190r;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0190r m33427a() {
        return this.f28898c;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0413q.a
    public InterfaceC0184l getKey() {
        return this.f28896a;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0413q.a
    public InterfaceC0184l getType() {
        return this.f28897b;
    }
}
