package b3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.a f450a = null;

    static {
            java.lang.String r0 = "TypefaceCompat static init"
            a.a.o(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L13
            b3.f r0 = new b3.f
            r0.<init>()
            b3.c.f450a = r0
            goto L26
        L13:
            r1 = 28
            if (r0 < r1) goto L1f
            b3.e r0 = new b3.e
            r0.<init>()
            b3.c.f450a = r0
            goto L26
        L1f:
            b3.d r0 = new b3.d
            r0.<init>()
            b3.c.f450a = r0
        L26:
            androidx.lifecycle.e0 r0 = new androidx.lifecycle.e0
            r1 = 1
            r0.<init>(r1)
            android.os.Trace.endSection()
            return
    }
}
