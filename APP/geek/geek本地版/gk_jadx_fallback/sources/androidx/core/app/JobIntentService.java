package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class JobIntentService extends android.app.Service {
    public defpackage.rp a;
    public defpackage.qp b;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return
    }

    public JobIntentService() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void a();

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            rp r1 = r0.a
            if (r1 == 0) goto L9
            android.os.IBinder r1 = r1.getBinder()
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            rp r0 = new rp
            r0.<init>(r1)
            r1.a = r0
            return
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            r1 = 2
            return r1
    }
}
