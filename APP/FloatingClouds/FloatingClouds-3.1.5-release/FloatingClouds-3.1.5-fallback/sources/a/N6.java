package a;

/* JADX INFO: loaded from: classes.dex */
public final class N6 implements java.util.concurrent.Callable<a.R6.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183a;
    public final /* synthetic */ android.content.Context b;
    public final /* synthetic */ a.M6 c;
    public final /* synthetic */ int d;

    public N6(java.lang.String r1, android.content.Context r2, a.M6 r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f183a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // java.util.concurrent.Callable
    public final a.R6.a call() {
            r4 = this;
            java.lang.String r0 = r4.f183a
            android.content.Context r1 = r4.b
            a.M6 r2 = r4.c
            int r3 = r4.d
            a.R6$a r0 = a.R6.a(r0, r1, r2, r3)
            return r0
    }
}
