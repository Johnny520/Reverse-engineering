package Yue;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC4340 extends AbstractC4746 implements Executor {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final ExecutorC4340 f8907 = new ExecutorC4340();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final AbstractC4232 f8908 = C8108.f24032.limitedParallelism(C7707.m24506(C4424.f887, C7007.m21661(64, C7705.m3805()), 0, 0, 12, null));

    @Override // Yue.AbstractC4746, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // Yue.AbstractC4232
    public void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        f8908.dispatch(interfaceC4225, runnable);
    }

    @Override // Yue.AbstractC4232
    @InterfaceC5495
    public void dispatchYield(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        f8908.dispatchYield(interfaceC4225, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@InterfaceC6399 Runnable runnable) {
        dispatch(C4629.f9940, runnable);
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    @InterfaceC4764
    public AbstractC4232 limitedParallelism(int i) {
        return C8108.f24032.limitedParallelism(i);
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // Yue.AbstractC4746
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public Executor mo12605() {
        return this;
    }
}
