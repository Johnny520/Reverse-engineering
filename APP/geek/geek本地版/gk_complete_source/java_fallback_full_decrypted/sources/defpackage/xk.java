package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xk implements java.util.concurrent.Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ android.content.Context c;
    public final /* synthetic */ defpackage.y1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ xk(java.lang.String r1, android.content.Context r2, defpackage.y1 r3, int r4, int r5) {
            r0 = this;
            r0.a = r5
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r4.b     // Catch: java.lang.Throwable -> L12
            android.content.Context r1 = r4.c     // Catch: java.lang.Throwable -> L12
            y1 r2 = r4.d     // Catch: java.lang.Throwable -> L12
            int r3 = r4.e     // Catch: java.lang.Throwable -> L12
            zk r0 = defpackage.al.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L12
            goto L18
        L12:
            zk r0 = new zk
            r1 = -3
            r0.<init>(r1)
        L18:
            return r0
        L19:
            y1 r0 = r4.d
            int r1 = r4.e
            java.lang.String r2 = r4.b
            android.content.Context r3 = r4.c
            zk r0 = defpackage.al.a(r2, r3, r0, r1)
            return r0
    }
}
