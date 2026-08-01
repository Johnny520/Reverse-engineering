package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rp extends android.app.job.JobServiceEngine {
    public final androidx.core.app.JobIntentService a;
    public final java.lang.Object b;
    public android.app.job.JobParameters c;

    public rp(androidx.core.app.JobIntentService r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.b = r0
            r1.a = r2
            return
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(android.app.job.JobParameters r3) {
            r2 = this;
            r2.c = r3
            androidx.core.app.JobIntentService r3 = r2.a
            qp r0 = r3.b
            if (r0 != 0) goto L17
            qp r0 = new qp
            r0.<init>(r3)
            r3.b = r0
            java.util.concurrent.Executor r3 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.executeOnExecutor(r3, r1)
        L17:
            r3 = 1
            return r3
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(android.app.job.JobParameters r2) {
            r1 = this;
            androidx.core.app.JobIntentService r2 = r1.a
            qp r2 = r2.b
            if (r2 == 0) goto La
            r0 = 0
            r2.cancel(r0)
        La:
            java.lang.Object r2 = r1.b
            monitor-enter(r2)
            r0 = 0
            r1.c = r0     // Catch: java.lang.Throwable -> L13
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
    }
}
