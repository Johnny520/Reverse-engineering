package a;

/* JADX INFO: loaded from: classes.dex */
public final class P6 implements java.util.concurrent.Callable<a.R6.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207a;
    public final /* synthetic */ android.content.Context b;
    public final /* synthetic */ a.M6 c;
    public final /* synthetic */ int d;

    public P6(java.lang.String r1, android.content.Context r2, a.M6 r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f207a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // java.util.concurrent.Callable
    public final a.R6.a call() {
            r4 = this;
            java.lang.String r0 = r4.f207a     // Catch: java.lang.Throwable -> Ld
            android.content.Context r1 = r4.b     // Catch: java.lang.Throwable -> Ld
            a.M6 r2 = r4.c     // Catch: java.lang.Throwable -> Ld
            int r3 = r4.d     // Catch: java.lang.Throwable -> Ld
            a.R6$a r0 = a.R6.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            a.R6$a r0 = new a.R6$a
            r1 = -3
            r0.<init>(r1)
            return r0
    }
}
