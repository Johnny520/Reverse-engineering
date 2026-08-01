package p274t;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p151k2.InterfaceC3937d;
import p151k2.InterfaceC3944k;

/* JADX INFO: renamed from: t.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7830f0 implements InterfaceC3937d {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f26096b;

    /* JADX INFO: renamed from: c */
    public InterfaceC7888q3 f26097c;

    public C7830f0(InterfaceC0184l interfaceC0184l) {
        this.f26096b = interfaceC0184l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7830f0) && ((C7830f0) obj).f26096b == this.f26096b;
    }

    @Override // p151k2.InterfaceC3937d
    /* JADX INFO: renamed from: f */
    public void mo15636f(InterfaceC3944k interfaceC3944k) {
        InterfaceC7888q3 interfaceC7888q3 = (InterfaceC7888q3) interfaceC3944k.mo15645q(AbstractC7913v3.m30552b());
        if (AbstractC1061t.m3842c(interfaceC7888q3, this.f26097c)) {
            return;
        }
        this.f26097c = interfaceC7888q3;
        this.f26096b.mo27m(interfaceC7888q3);
    }

    public int hashCode() {
        return this.f26096b.hashCode();
    }
}
