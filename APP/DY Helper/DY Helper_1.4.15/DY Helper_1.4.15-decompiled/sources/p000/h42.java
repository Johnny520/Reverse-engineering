package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class h42 {

    /* JADX INFO: renamed from: α */
    public static final long f4573 = 0;

    static {
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> Ld
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Exception -> Ld
            long r0 = r0.getId()     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r0 = -1
        Lf:
            p000.h42.f4573 = r0
            return
    }
}
