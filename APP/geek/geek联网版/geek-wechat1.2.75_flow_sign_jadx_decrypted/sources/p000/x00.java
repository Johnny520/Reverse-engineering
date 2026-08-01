package p000;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class x00 extends Thread {

    /* JADX INFO: renamed from: a */
    public final int f5151a;

    public x00(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f5151a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f5151a);
        super.run();
    }
}
