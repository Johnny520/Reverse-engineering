package p000;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: renamed from: vp */
/* JADX INFO: loaded from: classes.dex */
public final class JobServiceEngineC0826vp extends JobServiceEngine {

    /* JADX INFO: renamed from: a */
    public final JobIntentService f4970a;

    /* JADX INFO: renamed from: b */
    public final Object f4971b;

    /* JADX INFO: renamed from: c */
    public JobParameters f4972c;

    public JobServiceEngineC0826vp(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.f4971b = new Object();
        this.f4970a = jobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f4972c = jobParameters;
        JobIntentService jobIntentService = this.f4970a;
        if (jobIntentService.f404b != null) {
            return true;
        }
        AsyncTaskC0789up asyncTaskC0789up = new AsyncTaskC0789up(jobIntentService);
        jobIntentService.f404b = asyncTaskC0789up;
        asyncTaskC0789up.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        AsyncTaskC0789up asyncTaskC0789up = this.f4970a.f404b;
        if (asyncTaskC0789up != null) {
            asyncTaskC0789up.cancel(false);
        }
        synchronized (this.f4971b) {
            this.f4972c = null;
        }
        return true;
    }
}
