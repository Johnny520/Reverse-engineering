package Yue;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4432 implements InterfaceC4433 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Future<?> f9161;

    public C4432(@InterfaceC6399 Future<?> future) {
        this.f9161 = future;
    }

    @InterfaceC6399
    public String toString() {
        return "DisposableFutureHandle[" + this.f9161 + ']';
    }

    @Override // Yue.InterfaceC4433
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public void mo5757() {
        this.f9161.cancel(false);
    }
}
