package p316w;

import androidx.compose.foundation.lazy.layout.AbstractC0413q;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0190r;

/* JADX INFO: renamed from: w.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8958j implements AbstractC0413q.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f29694a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188p f29695b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f29696c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0190r f29697d;

    public C8958j(InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l2, InterfaceC0190r interfaceC0190r) {
        this.f29694a = interfaceC0184l;
        this.f29695b = interfaceC0188p;
        this.f29696c = interfaceC0184l2;
        this.f29697d = interfaceC0190r;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0190r m34399a() {
        return this.f29697d;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188p m34400b() {
        return this.f29695b;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0413q.a
    public InterfaceC0184l getKey() {
        return this.f29694a;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0413q.a
    public InterfaceC0184l getType() {
        return this.f29696c;
    }
}
