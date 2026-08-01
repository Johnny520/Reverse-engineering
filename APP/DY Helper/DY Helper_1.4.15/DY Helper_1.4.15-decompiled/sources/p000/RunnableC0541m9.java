package p000;

/* JADX INFO: renamed from: m9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0541m9 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7021;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f7022;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f7023;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f7024;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f7025;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f7026;

    public /* synthetic */ RunnableC0541m9(android.app.Activity r2, p000.ec1 r3, java.util.Set r4, int r5, p000.nb1 r6) {
            r1 = this;
            r0 = 2
            r1.f7021 = r0
            r1.<init>()
            r1.f7023 = r2
            r1.f7024 = r3
            r1.f7025 = r4
            r1.f7022 = r5
            r1.f7026 = r6
            return
    }

    public /* synthetic */ RunnableC0541m9(android.app.Dialog r2, android.util.DisplayMetrics r3, android.view.View r4, android.view.Window r5, int r6) {
            r1 = this;
            r0 = 0
            r1.f7021 = r0
            r1.<init>()
            r1.f7023 = r2
            r1.f7024 = r3
            r1.f7025 = r4
            r1.f7026 = r5
            r1.f7022 = r6
            return
    }

    public /* synthetic */ RunnableC0541m9(java.lang.Object r2, int r3, p000.qm1 r4, p000.um1 r5, java.util.concurrent.CountDownLatch r6) {
            r1 = this;
            r0 = 1
            r1.f7021 = r0
            r1.<init>()
            r1.f7023 = r2
            r1.f7022 = r3
            r1.f7024 = r4
            r1.f7025 = r5
            r1.f7026 = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f7021
            r1 = 1
            java.lang.Object r2 = r7.f7026
            int r3 = r7.f7022
            java.lang.Object r4 = r7.f7025
            java.lang.Object r5 = r7.f7024
            java.lang.Object r7 = r7.f7023
            switch(r0) {
                case 0: goto L67;
                case 1: goto L40;
                default: goto L10;
            }
        L10:
            android.app.Activity r7 = (android.app.Activity) r7
            ec1 r5 = (p000.ec1) r5
            java.util.Set r4 = (java.util.Set) r4
            nb1 r2 = (p000.nb1) r2
            p000.xd1.m6622(r7, r5, r4, r3, r2)     // Catch: java.lang.Throwable -> L1e
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L25:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L3f
            java.lang.String r2 = "DYHelper"
            java.lang.String r3 = "打开营地种子排除面板失败"
            p000.C0888ux.m5977(r2, r3, r0)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L3a
            java.lang.String r0 = ""
        L3a:
            java.lang.String r2 = "打开种子排除面板失败: "
            p000.a12.m21(r1, r7, r2, r0)
        L3f:
            return
        L40:
            java.lang.String r0 = "DYHelperExportFull"
            qm1 r5 = (p000.qm1) r5
            um1 r4 = (p000.um1) r4
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2
            java.lang.Object r6 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = "loadOld"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch: java.lang.Throwable -> L5d
            p000.qe0.m4869(r7, r6, r0)     // Catch: java.lang.Throwable -> L5d
            r5.f9050 = r1     // Catch: java.lang.Throwable -> L5d
        L59:
            r2.countDown()
            goto L61
        L5d:
            r7 = move-exception
            r4.f10912 = r7     // Catch: java.lang.Throwable -> L62
            goto L59
        L61:
            return
        L62:
            r7 = move-exception
            r2.countDown()
            throw r7
        L67:
            android.app.Dialog r7 = (android.app.Dialog) r7
            android.util.DisplayMetrics r5 = (android.util.DisplayMetrics) r5
            android.view.View r4 = (android.view.View) r4
            android.view.Window r2 = (android.view.Window) r2
            boolean r7 = r7.isShowing()
            if (r7 != 0) goto L76
            goto L94
        L76:
            int r7 = r5.heightPixels
            float r7 = (float) r7
            r0 = 1060320051(0x3f333333, float:0.7)
            float r7 = r7 * r0
            int r7 = (int) r7
            int r0 = r4.getHeight()
            if (r0 <= r7) goto L94
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            r0.height = r7
            r4.setLayoutParams(r0)
            r4.requestLayout()
            r7 = -2
            r2.setLayout(r3, r7)
        L94:
            return
    }
}
