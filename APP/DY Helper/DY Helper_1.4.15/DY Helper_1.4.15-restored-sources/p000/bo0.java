package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bo0 extends android.app.job.JobServiceEngine {

    /* JADX INFO: renamed from: α */
    public final androidx.core.app.JobIntentService f1792;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f1793;

    /* JADX INFO: renamed from: γ */
    public android.app.job.JobParameters f1794;

    public bo0(androidx.core.app.JobIntentService r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f1793 = r0
            r1.f1792 = r2
            return
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(android.app.job.JobParameters r2) {
            r1 = this;
            r1.f1794 = r2
            androidx.core.app.JobIntentService r1 = r1.f1792
            ao0 r2 = r1.f990
            if (r2 != 0) goto L17
            ao0 r2 = new ao0
            r2.<init>(r1)
            r1.f990 = r2
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r2.executeOnExecutor(r1, r0)
        L17:
            r1 = 1
            return r1
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(android.app.job.JobParameters r2) {
            r1 = this;
            androidx.core.app.JobIntentService r2 = r1.f1792
            ao0 r2 = r2.f990
            if (r2 == 0) goto La
            r0 = 0
            r2.cancel(r0)
        La:
            java.lang.Object r2 = r1.f1793
            monitor-enter(r2)
            r0 = 0
            r1.f1794 = r0     // Catch: java.lang.Throwable -> L13
            r1 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r1
    }
}
