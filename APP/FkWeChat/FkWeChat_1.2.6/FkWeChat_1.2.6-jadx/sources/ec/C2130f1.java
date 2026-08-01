package ec;

/* JADX INFO: renamed from: ec.f1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2130f1 implements InterfaceC2152l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2126e1 f5957a;

    public C2130f1(InterfaceC2126e1 interfaceC2126e1) {
        this.f5957a = interfaceC2126e1;
    }

    @Override // ec.InterfaceC2152l
    /* JADX INFO: renamed from: a */
    public void mo7747a(Throwable th) {
        this.f5957a.mo7628a();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f5957a + ']';
    }
}
