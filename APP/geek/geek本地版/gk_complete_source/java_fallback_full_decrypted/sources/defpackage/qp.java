package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qp extends android.os.AsyncTask {
    public final /* synthetic */ androidx.core.app.JobIntentService a;

    public qp(androidx.core.app.JobIntentService r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.os.AsyncTask
    public final java.lang.Object doInBackground(java.lang.Object[] r5) {
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
        L2:
            androidx.core.app.JobIntentService r5 = r4.a
            rp r0 = r5.a
            r0.getClass()
            rp r5 = r5.a
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            android.app.job.JobParameters r1 = r5.c     // Catch: java.lang.Throwable -> L16
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
            androidx.core.app.JobIntentService r3 = r5.a
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r0.setExtrasClassLoader(r3)
            d4 r0 = new d4
            r3 = 14
            r0.<init>(r5, r3, r1)
        L33:
            if (r0 == 0) goto L5e
            androidx.core.app.JobIntentService r5 = r4.a
            java.lang.Object r1 = r0.b
            android.app.job.JobWorkItem r1 = (android.app.job.JobWorkItem) r1
            r1.getIntent()
            r5.a()
            java.lang.Object r5 = r0.c
            rp r5 = (defpackage.rp) r5
            java.lang.Object r5 = r5.b
            monitor-enter(r5)
            java.lang.Object r1 = r0.c     // Catch: java.lang.Throwable -> L58
            rp r1 = (defpackage.rp) r1     // Catch: java.lang.Throwable -> L58
            android.app.job.JobParameters r1 = r1.c     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> L58
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
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            androidx.core.app.JobIntentService r1 = r0.a
            r1.getClass()
            return
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            androidx.core.app.JobIntentService r1 = r0.a
            r1.getClass()
            return
    }
}
