package Yue;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC4422 implements Executor {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final AbstractC4232 f9157;

    public ExecutorC4422(@InterfaceC6399 AbstractC4232 abstractC4232) {
        this.f9157 = abstractC4232;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@InterfaceC6399 Runnable runnable) {
        this.f9157.dispatch(C4629.f9940, runnable);
    }

    @InterfaceC6399
    public String toString() {
        return this.f9157.toString();
    }
}
