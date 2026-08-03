package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements androidx.lifecycle.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.s f7802g;

    public j(androidx.emoji2.text.EmojiCompatInitializer r1, androidx.lifecycle.s r2) {
            r0 = this;
            r0.<init>()
            r0.f7802g = r2
            return
    }

    @Override // androidx.lifecycle.d
    public final void a(androidx.lifecycle.q r4) {
            r3 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r4 < r0) goto Lf
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            android.os.Handler r4 = l3.b.a(r4)
            goto L18
        Lf:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
        L18:
            l3.m r0 = new l3.m
            r0.<init>()
            r1 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r0, r1)
            androidx.lifecycle.s r4 = r3.f7802g
            r4.f(r3)
            return
    }
}
