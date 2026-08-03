package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g3.a0 f4187a;

    public b0(int r3, android.view.animation.Interpolator r4, long r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L15
            g3.z r0 = new g3.z
            android.view.WindowInsetsAnimation r3 = g3.h.i(r3, r4, r5)
            r0.<init>(r3)
            r2.f4187a = r0
            return
        L15:
            g3.x r0 = new g3.x
            r0.<init>(r3, r4, r5)
            r2.f4187a = r0
            return
    }
}
