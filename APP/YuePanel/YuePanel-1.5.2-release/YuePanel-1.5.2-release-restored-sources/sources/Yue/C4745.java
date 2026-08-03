package Yue;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4745 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۢ$ۥ */
    public static class ExecutorC0479 implements Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Handler f10204;

        public ExecutorC0479(@InterfaceC6391 Handler handler) {
            this.f10204 = (Handler) C6740.m21415(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@InterfaceC6391 Runnable runnable) {
            if (this.f10204.post((Runnable) C6740.m21415(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f10204 + " is shutting down");
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Executor m1664(@InterfaceC6391 Handler handler) {
        return new ExecutorC0479(handler);
    }
}
