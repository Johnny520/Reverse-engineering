package p000;

import android.os.Process;

/* JADX INFO: renamed from: cw */
/* JADX INFO: loaded from: classes.dex */
public final class C1298cw extends Thread {

    /* JADX INFO: renamed from: a */
    public final int f4735a;

    public C1298cw(Runnable r2) {
        super(r2, "fonts-androidx");
        this.f4735a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f4735a);
        super.run();
    }
}
