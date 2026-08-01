package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends android.app.Service {
    public final defpackage.t80 a;

    public UnusedAppRestrictionsBackportService() {
            r1 = this;
            r1.<init>()
            t80 r0 = new t80
            r0.<init>(r1)
            r1.a = r0
            return
    }

    public abstract void a();

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            t80 r1 = r0.a
            return r1
    }
}
