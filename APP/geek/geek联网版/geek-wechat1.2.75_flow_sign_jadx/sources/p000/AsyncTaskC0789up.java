package p000;

import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: renamed from: up */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC0789up extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JobIntentService f4842a;

    public AsyncTaskC0789up(JobIntentService jobIntentService) {
        this.f4842a = jobIntentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
        L2:
            androidx.core.app.JobIntentService r5 = r4.f4842a
            vp r0 = r5.f403a
            r0.getClass()
            vp r5 = r5.f403a
            java.lang.Object r0 = r5.f4971b
            monitor-enter(r0)
            android.app.job.JobParameters r1 = r5.f4972c     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 != 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
        L14:
            r0 = r2
            goto L33
        L16:
            r5 = move-exception
            goto L5f
        L18:
            android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L14
            android.content.Intent r0 = r1.getIntent()
            androidx.core.app.JobIntentService r3 = r5.f4970a
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r0.setExtrasClassLoader(r3)
            d4 r0 = new d4
            r3 = 14
            r0.<init>(r5, r3, r1)
        L33:
            if (r0 == 0) goto L5e
            androidx.core.app.JobIntentService r5 = r4.f4842a
            java.lang.Object r1 = r0.f1297b
            android.app.job.JobWorkItem r1 = (android.app.job.JobWorkItem) r1
            r1.getIntent()
            r5.m215a()
            java.lang.Object r5 = r0.f1298c
            vp r5 = (p000.JobServiceEngineC0826vp) r5
            java.lang.Object r5 = r5.f4971b
            monitor-enter(r5)
            java.lang.Object r1 = r0.f1298c     // Catch: java.lang.Throwable -> L58
            vp r1 = (p000.JobServiceEngineC0826vp) r1     // Catch: java.lang.Throwable -> L58
            android.app.job.JobParameters r1 = r1.f4972c     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            java.lang.Object r0 = r0.f1297b     // Catch: java.lang.Throwable -> L58
            android.app.job.JobWorkItem r0 = (android.app.job.JobWorkItem) r0     // Catch: java.lang.Throwable -> L58
            r1.completeWork(r0)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r0 = move-exception
            goto L5c
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L58
            goto L2
        L5c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L58
            throw r0
        L5e:
            return r2
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AsyncTaskC0789up.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f4842a.getClass();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f4842a.getClass();
    }
}
