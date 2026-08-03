package ra;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f11848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f11849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f11850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f11852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ra.h f11853l;

    public f(ra.h r1, android.app.Activity r2, java.lang.String r3, int[] r4, int r5, android.os.Handler r6) {
            r0 = this;
            r0.<init>()
            r0.f11853l = r1
            r0.f11848g = r2
            r0.f11849h = r3
            r0.f11850i = r4
            r0.f11851j = r5
            r0.f11852k = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            android.app.Activity r0 = r6.f11848g
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L7d
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L10
            goto L7d
        L10:
            ra.h r1 = r6.f11853l
            java.lang.String r2 = r6.f11849h
            r3 = 0
            android.view.Window r4 = r0.getWindow()     // Catch: java.lang.Throwable -> L37
            android.view.View r4 = r4.getDecorView()     // Catch: java.lang.Throwable -> L37
            boolean r5 = ra.h.d(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L24
            goto L6a
        L24:
            boolean r4 = ra.h.c(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L6a
            java.lang.String r4 = "检测到红包失败状态，关闭页面"
            r1.o(r4)     // Catch: java.lang.Throwable -> L37
            na.b r4 = r1.f11865e     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L39
            r4.b(r2)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r0 = move-exception
            goto L55
        L39:
            java.util.WeakHashMap r2 = r1.f11867g     // Catch: java.lang.Throwable -> L37
            r2.remove(r0)     // Catch: java.lang.Throwable -> L37
            l3.l r2 = r1.f11862b     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "hb_auto_close"
            r2.getClass()     // Catch: java.lang.Throwable -> L37
            android.content.SharedPreferences r2 = r2.b()     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r2.getBoolean(r4, r3)     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
            r2 = r3
        L4f:
            if (r2 == 0) goto L7d
            r0.finish()     // Catch: java.lang.Throwable -> L37
            goto L7d
        L55:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "检测红包失败状态异常: "
            r2.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.o(r0)
        L6a:
            int[] r0 = r6.f11850i
            r1 = r0[r3]
            int r2 = r1 + 1
            r0[r3] = r2
            int r0 = r6.f11851j
            if (r1 >= r0) goto L7d
            android.os.Handler r0 = r6.f11852k
            r1 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r6, r1)
        L7d:
            return
    }
}
