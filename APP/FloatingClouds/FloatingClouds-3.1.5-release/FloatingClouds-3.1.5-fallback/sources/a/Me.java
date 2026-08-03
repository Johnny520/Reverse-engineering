package a;

/* JADX INFO: loaded from: classes.dex */
public final class Me<T> implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.InterfaceC0369s7<? extends T> f177a;
    public volatile java.lang.Object b;
    public final java.lang.Object c;

    public Me(a.InterfaceC0369s7 r1) {
            r0 = this;
            r0.<init>()
            r0.f177a = r1
            a.w1 r1 = a.C0435w1.o
            r0.b = r1
            r0.c = r0
            return
    }

    public final T a() {
            r3 = this;
            java.lang.Object r0 = r3.b
            a.w1 r1 = a.C0435w1.o
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            java.lang.Object r2 = r3.b     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            a.s7<? extends T> r1 = r3.f177a     // Catch: java.lang.Throwable -> L1f
            a.C0193i9.b(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.a()     // Catch: java.lang.Throwable -> L1f
            r3.b = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.f177a = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.b
            a.w1 r1 = a.C0435w1.o
            if (r0 == r1) goto Lf
            java.lang.Object r0 = r2.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lf:
            java.lang.String r0 = "Lazy value not initialized yet."
            return r0
    }
}
