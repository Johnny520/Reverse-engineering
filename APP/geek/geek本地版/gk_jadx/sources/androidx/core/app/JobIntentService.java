package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import p000.AsyncTaskC0642qp;
import p000.JobServiceEngineC0679rp;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: a */
    public JobServiceEngineC0679rp f440a;

    /* JADX INFO: renamed from: b */
    public AsyncTaskC0642qp f441b;

    static {
        new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public abstract void m230a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineC0679rp jobServiceEngineC0679rp = this.f440a;
        if (jobServiceEngineC0679rp != null) {
            return jobServiceEngineC0679rp.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f440a = new JobServiceEngineC0679rp(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
