package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.qp;
import defpackage.rp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    public rp a;
    public qp b;

    static {
        new HashMap();
    }

    public JobIntentService() {
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent r1) {
        rp r12 = this.a;
        if (r12 != null) goto L5;
        return null;
    L5:
        return r12.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a = new rp(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent r1, int r2, int r3) {
        return 2;
    }
}
