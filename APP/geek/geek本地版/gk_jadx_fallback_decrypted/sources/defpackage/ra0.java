package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ra0 {
    public final java.util.LinkedHashMap a;

    public ra0() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public final void a() {
            r6 = this;
            java.util.LinkedHashMap r0 = r6.a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r0.next()
            pa0 r1 = (defpackage.pa0) r1
            java.util.HashMap r2 = r1.a
            if (r2 == 0) goto L46
            monitor-enter(r2)
            java.util.HashMap r3 = r1.a     // Catch: java.lang.Throwable -> L40
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L40
        L25:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L42
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L40
            boolean r5 = r4 instanceof java.io.Closeable     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L25
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L40
            r4.close()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L40
            goto L25
        L39:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L40
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L40
            throw r1     // Catch: java.lang.Throwable -> L40
        L40:
            r0 = move-exception
            goto L44
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            goto L46
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            throw r0
        L46:
            java.util.LinkedHashSet r2 = r1.b
            if (r2 == 0) goto L70
            monitor-enter(r2)
            java.util.LinkedHashSet r3 = r1.b     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L6a
        L51:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6a
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L51
            r4.close()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L6a
            goto L51
        L63:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            throw r1     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            goto L6e
        L6c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            goto L70
        L6e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            throw r0
        L70:
            r1.a()
            goto La
        L74:
            java.util.LinkedHashMap r0 = r6.a
            r0.clear()
            return
    }
}
