package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲀᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1176 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.os.Handler f3788;

    public ExecutorC1176(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.f3788 = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            r2.getClass()
            android.os.Handler r1 = r1.f3788
            boolean r2 = r1.post(r2)
            if (r2 == 0) goto Lc
            return
        Lc:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is shutting down"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
    }
}
