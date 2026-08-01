package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: loaded from: classes.dex */
public final class qp extends AsyncTask {
    public final /* synthetic */ JobIntentService a;

    public qp(JobIntentService r1) {
        this.a = r1;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] r5) {
        Void[] r52 = (Void[]) r5;
    L3:
        JobIntentService r53 = this.a;
        r53.a.getClass();
        rp r54 = r53.a;
        Object r0 = r54.b;
        monitor-enter(r0);
        JobParameters r1 = r54.c;     // Catch: Throwable -> L9
        if (r1 != null) goto L11;
        monitor-exit(r0);     // Catch: Throwable -> L9
    L8:
        d4 r02 = null;
    L15:
        if (r02 == null) goto L27;
        JobIntentService r55 = this.a;
        ((JobWorkItem) r02.b).getIntent();
        r55.a();
        Object r56 = ((rp) r02.c).b;
        monitor-enter(r56);
        JobParameters r12 = ((rp) r02.c).c;     // Catch: Throwable -> L21
        if (r12 == null) goto L23;
        r12.completeWork((JobWorkItem) r02.b);     // Catch: Throwable -> L21
    L23:
        monitor-exit(r56);     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        throw th;
    L27:
        return null;
    L11:
        JobWorkItem r13 = r1.dequeueWork();     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        if (r13 == null) goto L8;
        r13.getIntent().setExtrasClassLoader(r54.a.getClassLoader());
        r02 = new d4(r54, 14, r13);
    L9:
        th = move-exception;
        throw th;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object r1) {
        Void r12 = (Void) r1;
        this.a.getClass();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object r1) {
        Void r12 = (Void) r1;
        this.a.getClass();
    }
}
