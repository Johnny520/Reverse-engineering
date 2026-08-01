package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲀᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0897 extends java.lang.Thread {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2924;

    public /* synthetic */ C0897(java.lang.Runnable r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.f2924 = r0
            r1.<init>(r2, r3)
            return
    }

    public /* synthetic */ C0897(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.f2924 = r0
            r1.<init>(r2)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f2924
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        Le:
            java.util.concurrent.locks.ReentrantLock r2 = xhss.C1181.f3810     // Catch: java.lang.InterruptedException -> Le
            r2.lock()     // Catch: java.lang.InterruptedException -> Le
            xhss.ᲈᲀᲇᛶ r0 = xhss.AbstractC0694.m1217()     // Catch: java.lang.Throwable -> L22
            xhss.ᲈᲀᲇᛶ r1 = xhss.C1181.f3807     // Catch: java.lang.Throwable -> L22
            if (r0 != r1) goto L24
            r0 = 0
            xhss.C1181.f3807 = r0     // Catch: java.lang.Throwable -> L22
            r2.unlock()     // Catch: java.lang.InterruptedException -> Le
            return
        L22:
            r0 = move-exception
            goto L2d
        L24:
            r2.unlock()     // Catch: java.lang.InterruptedException -> Le
            if (r0 == 0) goto Le
            r0.mo851()     // Catch: java.lang.InterruptedException -> Le
            goto Le
        L2d:
            r2.unlock()     // Catch: java.lang.InterruptedException -> Le
            throw r0     // Catch: java.lang.InterruptedException -> Le
    }
}
