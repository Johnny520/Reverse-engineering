package androidx.core.content;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends android.app.Service {

    /* JADX INFO: renamed from: ε */
    public final p000.z62 f1003;

    public UnusedAppRestrictionsBackportService() {
            r1 = this;
            r1.<init>()
            z62 r0 = new z62
            r0.<init>(r1)
            r1.f1003 = r0
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            z62 r0 = r0.f1003
            return r0
    }

    /* JADX INFO: renamed from: α */
    public abstract void m417();
}
