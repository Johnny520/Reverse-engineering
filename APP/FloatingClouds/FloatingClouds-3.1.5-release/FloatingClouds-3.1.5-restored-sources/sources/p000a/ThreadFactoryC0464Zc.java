package p000a;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: a.Zc */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0464Zc implements ThreadFactory {

    /* JADX INFO: renamed from: a.Zc$a */
    public static class a extends Thread {

        /* JADX INFO: renamed from: a */
        public final int f1748a;

        public a(Runnable runnable) {
            super(runnable, "fonts-androidx");
            this.f1748a = 10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f1748a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}
