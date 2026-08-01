package p000;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: renamed from: rp */
/* JADX INFO: loaded from: classes.dex */
public final class JobServiceEngineC0679rp extends JobServiceEngine {

    /* JADX INFO: renamed from: a */
    public final JobIntentService f4333a;

    /* JADX INFO: renamed from: b */
    public final Object f4334b;

    /* JADX INFO: renamed from: c */
    public JobParameters f4335c;

    public JobServiceEngineC0679rp(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.f4334b = new Object();
        this.f4333a = jobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f4335c = jobParameters;
        JobIntentService jobIntentService = this.f4333a;
        if (jobIntentService.f441b != null) {
            return true;
        }
        AsyncTaskC0642qp asyncTaskC0642qp = new AsyncTaskC0642qp(jobIntentService);
        jobIntentService.f441b = asyncTaskC0642qp;
        asyncTaskC0642qp.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        AsyncTaskC0642qp asyncTaskC0642qp = this.f4333a.f441b;
        if (asyncTaskC0642qp != null) {
            asyncTaskC0642qp.cancel(false);
        }
        synchronized (this.f4334b) {
            this.f4335c = null;
        }
        return true;
    }
}
