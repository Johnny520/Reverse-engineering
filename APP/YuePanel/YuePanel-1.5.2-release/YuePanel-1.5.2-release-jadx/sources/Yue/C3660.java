package Yue;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3660 extends AbstractC5556 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final Future<?> f6482;

    public C3660(@InterfaceC6399 Future<?> future) {
        this.f6482 = future;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
        mo9329(th);
        return C8107.f3222;
    }

    @Override // Yue.AbstractC4052
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public void mo9329(@InterfaceC6489 Throwable th) {
        if (th != null) {
            this.f6482.cancel(false);
        }
    }
}
