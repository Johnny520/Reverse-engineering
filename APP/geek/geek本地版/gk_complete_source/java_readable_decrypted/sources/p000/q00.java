package p000;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class q00 extends Thread {

    /* JADX INFO: renamed from: a */
    public final int f3969a;

    public q00(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f3969a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f3969a);
        super.run();
    }
}
