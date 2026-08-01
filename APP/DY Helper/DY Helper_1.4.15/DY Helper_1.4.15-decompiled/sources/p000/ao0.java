package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ao0 extends android.os.AsyncTask {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ androidx.core.app.JobIntentService f1266;

    public ao0(androidx.core.app.JobIntentService r1) {
            r0 = this;
            r0.f1266 = r1
            r0.<init>()
            return
    }

    @Override // android.os.AsyncTask
    public final java.lang.Object doInBackground(java.lang.Object[] r5) {
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
        L2:
            androidx.core.app.JobIntentService r5 = r4.f1266
            bo0 r0 = r5.f989
            r0.getClass()
            bo0 r5 = r5.f989
            java.lang.Object r0 = r5.f1793
            monitor-enter(r0)
            android.app.job.JobParameters r1 = r5.f1794     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 != 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
        L14:
            r0 = r2
            goto L33
        L16:
            r4 = move-exception
            goto L5f
        L18:
            android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L14
            android.content.Intent r0 = r1.getIntent()
            androidx.core.app.JobIntentService r3 = r5.f1792
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r0.setExtrasClassLoader(r3)
            n5 r0 = new n5
            r3 = 20
            r0.<init>(r5, r3, r1)
        L33:
            if (r0 == 0) goto L5e
            androidx.core.app.JobIntentService r5 = r4.f1266
            java.lang.Object r1 = r0.f7387
            android.app.job.JobWorkItem r1 = (android.app.job.JobWorkItem) r1
            r1.getIntent()
            r5.m412()
            java.lang.Object r5 = r0.f7388
            bo0 r5 = (p000.bo0) r5
            java.lang.Object r5 = r5.f1793
            monitor-enter(r5)
            java.lang.Object r1 = r0.f7388     // Catch: java.lang.Throwable -> L58
            bo0 r1 = (p000.bo0) r1     // Catch: java.lang.Throwable -> L58
            android.app.job.JobParameters r1 = r1.f1794     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            java.lang.Object r0 = r0.f7387     // Catch: java.lang.Throwable -> L58
            android.app.job.JobWorkItem r0 = (android.app.job.JobWorkItem) r0     // Catch: java.lang.Throwable -> L58
            r1.completeWork(r0)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L5c
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L58
            goto L2
        L5c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L58
            throw r4
        L5e:
            return r2
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            return
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            return
    }
}
