package a;

/* JADX INFO: loaded from: classes.dex */
public final class Zc implements java.util.concurrent.ThreadFactory {

    public static class a extends java.lang.Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f380a;

        public a(java.lang.Runnable r2) {
                r1 = this;
                java.lang.String r0 = "fonts-androidx"
                r1.<init>(r2, r0)
                r2 = 10
                r1.f380a = r2
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
                r1 = this;
                int r0 = r1.f380a
                android.os.Process.setThreadPriority(r0)
                super.run()
                return
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            a.Zc$a r0 = new a.Zc$a
            r0.<init>(r2)
            return r0
    }
}
