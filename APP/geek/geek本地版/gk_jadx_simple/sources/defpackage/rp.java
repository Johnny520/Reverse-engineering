package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: loaded from: classes.dex */
public final class rp extends JobServiceEngine {
    public final JobIntentService a;
    public final Object b;
    public JobParameters c;

    public rp(JobIntentService r2) {
        super(r2);
        this.b = new Object();
        this.a = r2;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters r3) {
        this.c = r3;
        JobIntentService r32 = this.a;
        if (r32.b != null) goto L7;
        qp r0 = new qp(r32);
        r32.b = r0;
        r0.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    L7:
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters r2) {
        qp r22 = this.a.b;
        if (r22 == null) goto L5;
        r22.cancel(false);
    L5:
        Object r23 = this.b;
        monitor-enter(r23);
        this.c = null;     // Catch: Throwable -> L11
        monitor-exit(r23);     // Catch: Throwable -> L11
        return true;
    L11:
        th = move-exception;
        throw th;
    }
}
