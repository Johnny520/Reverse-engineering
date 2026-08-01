package androidx.core.app;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class JobIntentService extends android.app.Service {

    /* JADX INFO: renamed from: ε */
    public p000.bo0 f989;

    /* JADX INFO: renamed from: ζ */
    public p000.ao0 f990;

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

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            bo0 r0 = r0.f989
            if (r0 == 0) goto L9
            android.os.IBinder r0 = r0.getBinder()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.app.Service
    public final void onCreate() {
            r1 = this;
            super.onCreate()
            bo0 r0 = new bo0
            r0.<init>(r1)
            r1.f989 = r0
            return
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            r0 = 2
            return r0
    }

    /* JADX INFO: renamed from: α */
    public abstract void m412();
}
