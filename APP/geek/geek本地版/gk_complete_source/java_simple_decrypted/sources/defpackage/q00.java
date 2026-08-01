package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class q00 extends Thread {
    public final int a;

    public q00(Runnable r2) {
        super(r2, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
