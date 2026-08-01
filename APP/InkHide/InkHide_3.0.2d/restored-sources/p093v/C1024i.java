package p093v;

import android.os.Process;

/* JADX INFO: renamed from: v.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1024i extends Thread {

    /* JADX INFO: renamed from: a */
    public final int f3637a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1024i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f3637a = 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f3637a);
        super.run();
    }
}
