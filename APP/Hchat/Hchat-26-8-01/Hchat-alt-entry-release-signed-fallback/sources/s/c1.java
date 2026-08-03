package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.b1 f11992a = null;

    static {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            if (r0 == 0) goto L1b
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "robolectric"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            s.b1 r0 = new s.b1
            r0.<init>()
            goto L1c
        L1b:
            r0 = 0
        L1c:
            s.c1.f11992a = r0
            return
    }
}
