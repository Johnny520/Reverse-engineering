package p000;

import android.os.Process;

/* JADX INFO: renamed from: Uj */
/* JADX INFO: loaded from: classes.dex */
public final class C0885Uj extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
