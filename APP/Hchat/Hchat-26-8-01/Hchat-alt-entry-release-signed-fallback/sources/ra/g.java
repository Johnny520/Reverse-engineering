package ra;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f11854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f11855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int[] f11857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f11859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ra.h f11860m;

    public g(ra.h r1, android.app.Activity r2, java.lang.String r3, boolean r4, int[] r5, int r6, android.os.Handler r7) {
            r0 = this;
            r0.<init>()
            r0.f11860m = r1
            r0.f11854g = r2
            r0.f11855h = r3
            r0.f11856i = r4
            r0.f11857j = r5
            r0.f11858k = r6
            r0.f11859l = r7
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            android.app.Activity r0 = r10.f11854g
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto Lb4
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L10
            goto Lb4
        L10:
            ra.h r1 = r10.f11860m
            java.lang.String r2 = r10.f11855h
            boolean r3 = r10.f11856i
            r4 = 0
            android.view.Window r5 = r0.getWindow()     // Catch: java.lang.Throwable -> L73
            android.view.View r5 = r5.getDecorView()     // Catch: java.lang.Throwable -> L73
            boolean r6 = ra.h.d(r5)     // Catch: java.lang.Throwable -> L73
            if (r6 != 0) goto L27
            goto La1
        L27:
            android.widget.TextView r5 = ra.h.h(r5)     // Catch: java.lang.Throwable -> L73
            r6 = 0
            if (r5 != 0) goto L2f
            goto L57
        L2f:
            android.view.ViewParent r7 = r5.getParent()     // Catch: java.lang.Throwable -> L73
        L33:
            boolean r8 = r7 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L73
            if (r8 == 0) goto L57
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> L73
            r8 = r4
        L3a:
            int r9 = r7.getChildCount()     // Catch: java.lang.Throwable -> L73
            if (r8 >= r9) goto L52
            android.view.View r9 = r7.getChildAt(r8)     // Catch: java.lang.Throwable -> L73
            if (r9 != r5) goto L47
            goto L4f
        L47:
            java.lang.String r9 = ra.h.f(r9)     // Catch: java.lang.Throwable -> L73
            if (r9 == 0) goto L4f
            r6 = r9
            goto L57
        L4f:
            int r8 = r8 + 1
            goto L3a
        L52:
            android.view.ViewParent r7 = r7.getParent()     // Catch: java.lang.Throwable -> L73
            goto L33
        L57:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r5.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = "检测到红包领取成功: amount="
            r5.append(r7)     // Catch: java.lang.Throwable -> L73
            r5.append(r6)     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L73
            r1.o(r5)     // Catch: java.lang.Throwable -> L73
            na.b r5 = r1.f11864d     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L75
            r5.d(r2, r6, r3)     // Catch: java.lang.Throwable -> L73
            goto L75
        L73:
            r0 = move-exception
            goto L8c
        L75:
            l3.l r2 = r1.f11862b     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "hb_auto_close"
            r2.getClass()     // Catch: java.lang.Throwable -> L73
            android.content.SharedPreferences r2 = r2.b()     // Catch: java.lang.Throwable -> L85
            boolean r2 = r2.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> L85
            goto L86
        L85:
            r2 = r4
        L86:
            if (r2 == 0) goto Lb4
            r0.finish()     // Catch: java.lang.Throwable -> L73
            goto Lb4
        L8c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "检测红包成功状态异常: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.o(r0)
        La1:
            int[] r0 = r10.f11857j
            r1 = r0[r4]
            int r2 = r1 + 1
            r0[r4] = r2
            int r0 = r10.f11858k
            if (r1 >= r0) goto Lb4
            android.os.Handler r0 = r10.f11859l
            r1 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r10, r1)
        Lb4:
            return
    }
}
