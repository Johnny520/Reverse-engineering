package a;

/* JADX INFO: loaded from: classes.dex */
public final class Fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f92a;

    public Fg() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f92a = r0
            return
    }

    public final void a() {
            r5 = this;
            java.util.LinkedHashMap r0 = r5.f92a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            a.Dg r1 = (a.Dg) r1
            r2 = 1
            r1.c = r2
            java.util.HashMap r2 = r1.f62a
            if (r2 == 0) goto L3c
            monitor-enter(r2)
            java.util.HashMap r3 = r1.f62a     // Catch: java.lang.Throwable -> L36
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L36
        L28:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L36
            a.Dg.a(r4)     // Catch: java.lang.Throwable -> L36
            goto L28
        L36:
            r0 = move-exception
            goto L3a
        L38:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            goto L3c
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            throw r0
        L3c:
            java.util.LinkedHashSet r2 = r1.b
            if (r2 == 0) goto L5d
            monitor-enter(r2)
            java.util.LinkedHashSet r3 = r1.b     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L57
        L47:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L59
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L57
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L57
            a.Dg.a(r4)     // Catch: java.lang.Throwable -> L57
            goto L47
        L57:
            r0 = move-exception
            goto L5b
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            goto L5d
        L5b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L57
            throw r0
        L5d:
            r1.b()
            goto La
        L61:
            java.util.LinkedHashMap r0 = r5.f92a
            r0.clear()
            return
    }
}
