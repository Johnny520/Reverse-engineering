package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u5 implements java.util.concurrent.Executor {
    public final java.lang.Object a;
    public final java.util.ArrayDeque b;
    public final defpackage.v5 c;
    public java.lang.Runnable d;

    public u5(defpackage.v5 r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.b = r0
            r1.c = r2
            return
    }

    public final void a() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r3.b     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L15
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L15
            r3.d = r1     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            v5 r2 = r3.c     // Catch: java.lang.Throwable -> L15
            r2.execute(r1)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r5) {
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r4.b     // Catch: java.lang.Throwable -> L16
            t5 r2 = new t5     // Catch: java.lang.Throwable -> L16
            r3 = 0
            r2.<init>(r4, r3, r5)     // Catch: java.lang.Throwable -> L16
            r1.add(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Runnable r5 = r4.d     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L18
            r4.a()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r5 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r5
    }
}
