package Yue;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3659 extends AbstractC3661 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Future<?> f6481;

    public C3659(@InterfaceC6399 Future<?> future) {
        this.f6481 = future;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
        mo5758(th);
        return C8107.f3222;
    }

    @InterfaceC6399
    public String toString() {
        return "CancelFutureOnCancel[" + this.f6481 + ']';
    }

    @Override // Yue.AbstractC3662
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo5758(@InterfaceC6489 Throwable th) {
        if (th != null) {
            this.f6481.cancel(false);
        }
    }
}
