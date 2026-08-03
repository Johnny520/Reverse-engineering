package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f783a;
    public final /* synthetic */ top.mmjz.floatingclouds.XposedEntry b;
    public final /* synthetic */ a.J8 c;

    public /* synthetic */ zh(top.mmjz.floatingclouds.XposedEntry r1, a.J8 r2, int r3) {
            r0 = this;
            r0.f783a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f783a
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            top.mmjz.floatingclouds.XposedEntry r0 = r2.b
            a.J8 r1 = r2.c
            top.mmjz.floatingclouds.XposedEntry.a(r0, r1)
            return
        Ld:
            top.mmjz.floatingclouds.XposedEntry r0 = r2.b
            a.J8 r1 = r2.c
            top.mmjz.floatingclouds.XposedEntry.c(r0, r1)
            return
    }
}
