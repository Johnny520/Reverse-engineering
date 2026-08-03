package p000A;

import android.os.Process;

/* JADX INFO: renamed from: A.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0012m extends Thread {

    /* JADX INFO: renamed from: a */
    public final int f35a;

    public C0012m(Runnable runnable, String str, int i2) {
        super(runnable, str);
        this.f35a = i2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f35a);
        super.run();
    }
}
