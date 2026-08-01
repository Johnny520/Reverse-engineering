package p073f2;

import p010a9.InterfaceC0184l;
import p172l8.C4700i0;

/* JADX INFO: renamed from: f2.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2270u0 implements InterfaceC0184l {

    /* JADX INFO: renamed from: q */
    public C2256n0 f6238q;

    /* JADX INFO: renamed from: a */
    public void m8272a(boolean z10) {
        C2256n0 c2256n0 = this.f6238q;
        if (c2256n0 != null) {
            c2256n0.m8195m(z10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8273c(C2256n0 c2256n0) {
        this.f6238q = c2256n0;
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
        m8272a(((Boolean) obj).booleanValue());
        return C4700i0.f13910a;
    }
}
