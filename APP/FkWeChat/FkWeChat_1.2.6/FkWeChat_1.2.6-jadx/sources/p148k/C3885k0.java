package p148k;

import p010a9.InterfaceC0188p;
import p121i3.C3189s;
import p163l.InterfaceC4303h0;

/* JADX INFO: renamed from: k.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3885k0 implements InterfaceC3883j0 {

    /* JADX INFO: renamed from: a */
    public final boolean f11227a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188p f11228b;

    public C3885k0(boolean z10, InterfaceC0188p interfaceC0188p) {
        this.f11227a = z10;
        this.f11228b = interfaceC0188p;
    }

    @Override // p148k.InterfaceC3883j0
    /* JADX INFO: renamed from: a */
    public boolean mo15424a() {
        return this.f11227a;
    }

    @Override // p148k.InterfaceC3883j0
    /* JADX INFO: renamed from: b */
    public InterfaceC4303h0 mo15425b(long j10, long j11) {
        return (InterfaceC4303h0) this.f11228b.invoke(C3189s.m12081b(j10), C3189s.m12081b(j11));
    }
}
