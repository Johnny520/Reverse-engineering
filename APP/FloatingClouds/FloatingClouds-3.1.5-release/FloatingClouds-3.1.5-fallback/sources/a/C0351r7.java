package a;

/* JADX INFO: renamed from: a.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0351r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f667a;
    public boolean b;
    public final java.util.ArrayList c;

    public C0351r7(androidx.activity.ComponentActivity.e r1, a.A3 r2) {
            r0 = this;
            java.lang.String r2 = "executor"
            a.C0193i9.e(r1, r2)
            r0.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f667a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.c = r1
            return
    }

    public final void a() {
            r3 = this;
            java.lang.Object r0 = r3.f667a
            monitor-enter(r0)
            r1 = 1
            r3.b = r1     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList r1 = r3.c     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1c
            a.s7 r2 = (a.InterfaceC0369s7) r2     // Catch: java.lang.Throwable -> L1c
            r2.a()     // Catch: java.lang.Throwable -> L1c
            goto Lc
        L1c:
            r1 = move-exception
            goto L27
        L1e:
            java.util.ArrayList r1 = r3.c     // Catch: java.lang.Throwable -> L1c
            r1.clear()     // Catch: java.lang.Throwable -> L1c
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L27:
            monitor-exit(r0)
            throw r1
    }
}
