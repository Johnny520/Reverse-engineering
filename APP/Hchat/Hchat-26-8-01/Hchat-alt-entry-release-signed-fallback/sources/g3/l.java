package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements android.view.View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g3.r0 f4220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3.e f4222c;

    public l(android.view.View r1, g3.e r2) {
            r0 = this;
            r0.f4221b = r1
            r0.f4222c = r2
            r0.<init>()
            r1 = 0
            r0.f4220a = r1
            return
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View r6, android.view.WindowInsets r7) {
            r5 = this;
            g3.r0 r0 = g3.r0.c(r7, r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            g3.e r2 = r5.f4222c
            r3 = 30
            if (r1 >= r3) goto L22
            android.view.View r4 = r5.f4221b
            g3.m.a(r7, r4)
            g3.r0 r7 = r5.f4220a
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L22
            g3.r0 r6 = r2.c(r6, r0)
            android.view.WindowInsets r6 = r6.b()
            return r6
        L22:
            r5.f4220a = r0
            g3.r0 r7 = r2.c(r6, r0)
            if (r1 < r3) goto L2f
            android.view.WindowInsets r6 = r7.b()
            return r6
        L2f:
            int r0 = g3.q.f4227a
            g3.k.a(r6)
            android.view.WindowInsets r6 = r7.b()
            return r6
    }
}
