package io.sentry;

/* JADX INFO: renamed from: io.sentry.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1640V0 implements InterfaceC1880h0 {

    /* JADX INFO: renamed from: b */
    public static final C1640V0 f5880b = new C1640V0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5881a;

    public /* synthetic */ C1640V0(int i) {
        this.f5881a = i;
    }

    @Override // io.sentry.InterfaceC1880h0
    /* JADX INFO: renamed from: a */
    public final InterfaceC1895i0 mo3748a(C1621P2 c1621p2, C2045v1 c2045v1, C1625Q2 c1625q2, InterfaceC1925m interfaceC1925m) {
        switch (this.f5881a) {
            case 0:
                return C1643W0.f5888a;
            default:
                return new C1573D2(c1621p2, c2045v1, c1625q2, interfaceC1925m);
        }
    }
}
