package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7729 extends AbstractRunnableC7725 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final Runnable f23253;

    public C7729(@InterfaceC6399 Runnable runnable, long j, @InterfaceC6399 InterfaceC7726 interfaceC7726) {
        super(j, interfaceC7726);
        this.f23253 = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f23253.run();
        } finally {
            this.f23251.mo17603();
        }
    }

    @InterfaceC6399
    public String toString() {
        return "Task[" + C4325.m1288(this.f23253) + '@' + C4325.m1289(this.f23253) + ", " + this.f23250 + ", " + this.f23251 + ']';
    }
}
