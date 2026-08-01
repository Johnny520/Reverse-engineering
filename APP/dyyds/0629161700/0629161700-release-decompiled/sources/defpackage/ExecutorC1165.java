package defpackage;

/* JADX INFO: renamed from: ᛶᲇᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1165 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5279;

    public /* synthetic */ ExecutorC1165(int r1) {
            r0 = this;
            r0.f5279 = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            int r0 = r0.f5279
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            r1.run()
            return
        L9:
            ᛵᛲᛴᛵ r0 = defpackage.C0824.m1752()
            ᛵᛷᲇᛵ r0 = r0.f3791
            java.util.concurrent.ExecutorService r0 = r0.f4226
            r0.execute(r1)
            return
    }
}
