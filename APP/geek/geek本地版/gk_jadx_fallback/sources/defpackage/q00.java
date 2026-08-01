package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q00 extends java.lang.Thread {
    public final int a;

    public q00(java.lang.Runnable r2) {
            r1 = this;
            java.lang.String r0 = "fonts-androidx"
            r1.<init>(r2, r0)
            r2 = 10
            r1.a = r2
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.a
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
    }
}
