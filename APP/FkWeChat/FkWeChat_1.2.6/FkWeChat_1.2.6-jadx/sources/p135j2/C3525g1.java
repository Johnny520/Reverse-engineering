package p135j2;

import p010a9.InterfaceC0184l;
import p121i3.C3189s;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4530d0;

/* JADX INFO: renamed from: j2.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3525g1 extends InterfaceC4507m.c implements InterfaceC4530d0 {

    /* JADX INFO: renamed from: F */
    public InterfaceC0184l f9760F;

    /* JADX INFO: renamed from: G */
    public final boolean f9761G = true;

    /* JADX INFO: renamed from: H */
    public long f9762H;

    public C3525g1(InterfaceC0184l interfaceC0184l) {
        this.f9760F = interfaceC0184l;
        long j10 = Integer.MIN_VALUE;
        this.f9762H = C3189s.m12082c((j10 & 4294967295L) | (j10 << 32));
    }

    /* JADX INFO: renamed from: G2 */
    public final void m13124G2(InterfaceC0184l interfaceC0184l) {
        this.f9760F = interfaceC0184l;
        long j10 = Integer.MIN_VALUE;
        this.f9762H = C3189s.m12082c((j10 & 4294967295L) | (j10 << 32));
    }

    @Override // p166l2.InterfaceC4530d0
    /* JADX INFO: renamed from: X */
    public void mo13125X(long j10) {
        if (C3189s.m12084e(this.f9762H, j10)) {
            return;
        }
        this.f9760F.mo27m(C3189s.m12081b(j10));
        this.f9762H = j10;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return this.f9761G;
    }
}
