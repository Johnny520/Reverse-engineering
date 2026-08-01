package androidx.compose.runtime;

import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: androidx.compose.runtime.z1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631z1 implements InterfaceC0184l {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0184l f1818q;

    public C0631z1(InterfaceC0184l interfaceC0184l) {
        this.f1818q = interfaceC0184l;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2463a(long j10) {
        return this.f1818q.mo27m(Long.valueOf(j10 / 1000000));
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
        return m2463a(((Number) obj).longValue());
    }
}
