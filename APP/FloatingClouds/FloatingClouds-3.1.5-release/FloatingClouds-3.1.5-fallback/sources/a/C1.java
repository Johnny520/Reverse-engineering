package a;

/* JADX INFO: loaded from: classes.dex */
public final class C1 extends a.AbstractC0040a2 {
    public static volatile a.C1 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.R4 f39a;

    public C1() {
            r1 = this;
            r1.<init>()
            a.R4 r0 = new a.R4
            r0.<init>()
            r1.f39a = r0
            return
    }

    public static a.C1 g() {
            a.C1 r0 = a.C1.b
            if (r0 == 0) goto L7
            a.C1 r0 = a.C1.b
            return r0
        L7:
            java.lang.Class<a.C1> r0 = a.C1.class
            monitor-enter(r0)
            a.C1 r1 = a.C1.b     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            a.C1 r1 = new a.C1     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            a.C1.b = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1c
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            a.C1 r0 = a.C1.b
            return r0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }
}
