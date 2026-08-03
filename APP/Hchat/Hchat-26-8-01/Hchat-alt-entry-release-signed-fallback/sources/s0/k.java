package s0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f12201a = 0;

    static {
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> Ld
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Exception -> Ld
            long r0 = r0.getId()     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r0 = -1
        Lf:
            s0.k.f12201a = r0
            return
    }
}
