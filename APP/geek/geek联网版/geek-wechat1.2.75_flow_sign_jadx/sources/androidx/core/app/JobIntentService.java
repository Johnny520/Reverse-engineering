package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import p000.AsyncTaskC0789up;
import p000.JobServiceEngineC0826vp;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: a */
    public JobServiceEngineC0826vp f403a;

    /* JADX INFO: renamed from: b */
    public AsyncTaskC0789up f404b;

    static {
        new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public abstract void m215a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineC0826vp jobServiceEngineC0826vp = this.f403a;
        if (jobServiceEngineC0826vp != null) {
            return jobServiceEngineC0826vp.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f403a = new JobServiceEngineC0826vp(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
