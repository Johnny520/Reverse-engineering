package defpackage;

/* JADX INFO: renamed from: ᲁᛲᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1811 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7934;

    public /* synthetic */ ExecutorC1811(int r1) {
            r0 = this;
            r0.f7934 = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            int r0 = r0.f7934
            switch(r0) {
                case 0: goto L11;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            r1.run()
            return
        L9:
            android.os.Handler r0 = defpackage.AbstractC1754.m3141()
            r0.post(r1)
            return
        L11:
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r1)
            r0.start()
            return
    }
}
