package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k8 {
    public boolean a;
    public defpackage.j8 b;
    public boolean c;

    public final void a(defpackage.j8 r2) {
            r1 = this;
            monitor-enter(r1)
        L1:
            boolean r0 = r1.c     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L9
            r1.wait()     // Catch: java.lang.InterruptedException -> L1 java.lang.Throwable -> Lf
            goto L1
        L9:
            j8 r0 = r1.b     // Catch: java.lang.Throwable -> Lf
            if (r0 != r2) goto L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            goto L1d
        Lf:
            r2 = move-exception
            goto L1e
        L11:
            r1.b = r2     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r1.a     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L1c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            r2.onCancel()
            return
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
        L1d:
            return
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }
}
