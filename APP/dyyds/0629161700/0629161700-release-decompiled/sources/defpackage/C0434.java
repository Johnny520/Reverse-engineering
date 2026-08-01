package defpackage;

/* JADX INFO: renamed from: ᛳᛲᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0434 extends java.lang.Thread {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2132;

    public /* synthetic */ C0434(java.lang.Runnable r2) {
            r1 = this;
            r0 = 1
            r1.f2132 = r0
            r1.<init>(r2)
            return
    }

    public /* synthetic */ C0434(java.lang.Runnable r2, java.lang.String r3) {
            r1 = this;
            r0 = 2
            r1.f2132 = r0
            r1.<init>(r2, r3)
            return
    }

    public /* synthetic */ C0434(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.f2132 = r0
            r1.<init>(r2)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f2132
            switch(r0) {
                case 0: goto L17;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        Le:
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        L17:
            java.util.concurrent.locks.ReentrantLock r2 = defpackage.C2027.f8738     // Catch: java.lang.InterruptedException -> L17
            r2.lock()     // Catch: java.lang.InterruptedException -> L17
            ᲇᛳᲇ r0 = defpackage.AbstractC0425.m1193()     // Catch: java.lang.Throwable -> L2b
            ᲇᛳᲇ r1 = defpackage.C2027.f8736     // Catch: java.lang.Throwable -> L2b
            if (r0 != r1) goto L2d
            r0 = 0
            defpackage.C2027.f8736 = r0     // Catch: java.lang.Throwable -> L2b
            r2.unlock()     // Catch: java.lang.InterruptedException -> L17
            return
        L2b:
            r0 = move-exception
            goto L36
        L2d:
            r2.unlock()     // Catch: java.lang.InterruptedException -> L17
            if (r0 == 0) goto L17
            r0.mo1864()     // Catch: java.lang.InterruptedException -> L17
            goto L17
        L36:
            r2.unlock()     // Catch: java.lang.InterruptedException -> L17
            throw r0     // Catch: java.lang.InterruptedException -> L17
    }
}
