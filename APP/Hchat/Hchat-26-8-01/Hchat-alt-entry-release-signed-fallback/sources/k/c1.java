package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2.x f6929a = null;

    static {
            f2.x r0 = new f2.x
            java.lang.String r1 = "MagnifierPositionInRoot"
            r0.<init>(r1)
            k.c1.f6929a = r0
            return
    }

    public static boolean a() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
