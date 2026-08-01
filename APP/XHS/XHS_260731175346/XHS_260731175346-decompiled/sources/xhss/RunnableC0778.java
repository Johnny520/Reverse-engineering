package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛶᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0778 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2564;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0137 f2565;

    public /* synthetic */ RunnableC0778(xhss.C0137 r1, int r2) {
            r0 = this;
            r0.f2564 = r2
            r0.f2565 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f2564
            java.lang.String r1 = "window"
            r2 = 0
            xhss.ᛲᛲᲀᛷ r3 = r8.f2565
            r4 = 0
            switch(r0) {
                case 0: goto L48;
                default: goto Lb;
            }
        Lb:
            xhss.ᛳᛲᛳᛵ r8 = r3.f597
            android.app.Activity r0 = r8.f906     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r0 == 0) goto L1f
            boolean r0 = r0.isDestroyed()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r0 == 0) goto L18
            goto L2a
        L18:
            android.app.Activity r0 = r8.f906     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            android.view.WindowManager r2 = r0.getWindowManager()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            goto L2a
        L1f:
            android.app.Application r0 = r8.f904     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r2 = r0
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
        L2a:
            if (r2 != 0) goto L32
        L2c:
            r8.m544()
            r3.f602 = r4
            goto L41
        L32:
            xhss.ᲈᛱᛷᛵ r0 = r3.f600     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            android.view.View r0 = r0.f3607     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r2.removeViewImmediate(r0)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            goto L2c
        L3a:
            r0 = move-exception
            goto L42
        L3c:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            goto L2c
        L41:
            return
        L42:
            r8.m544()
            r3.f602 = r4
            throw r0
        L48:
            xhss.ᲈᛱᛷᛵ r0 = r3.f600
            xhss.ᛳᛲᛳᛵ r5 = r3.f597
            android.app.Activity r6 = r5.f906
            if (r6 == 0) goto L5e
            boolean r1 = r6.isDestroyed()
            if (r1 == 0) goto L57
            goto L69
        L57:
            android.app.Activity r1 = r5.f906
            android.view.WindowManager r2 = r1.getWindowManager()
            goto L69
        L5e:
            android.app.Application r6 = r5.f904
            if (r6 == 0) goto L69
            java.lang.Object r1 = r6.getSystemService(r1)
            r2 = r1
            android.view.WindowManager r2 = (android.view.WindowManager) r2
        L69:
            if (r2 != 0) goto L6c
            goto Ld9
        L6c:
            android.view.WindowManager$LayoutParams r1 = new android.view.WindowManager$LayoutParams
            r1.<init>()
            r6 = -2
            r1.height = r6
            r1.width = r6
            r6 = -3
            r1.format = r6
            r6 = 152(0x98, float:2.13E-43)
            r1.flags = r6
            java.lang.String r6 = r3.f598
            r1.packageName = r6
            int r6 = r0.f3605
            r1.gravity = r6
            r1.x = r4
            r1.y = r4
            r4 = 0
            r1.verticalMargin = r4
            r1.horizontalMargin = r4
            r4 = 16973828(0x1030004, float:2.406091E-38)
            r1.windowAnimations = r4
            java.lang.String r4 = "Toast"
            r1.setTitle(r4)
            r4 = 1
            r1.setFitInsetsIgnoringVisibility(r4)
            boolean r6 = r3.f599
            if (r6 == 0) goto Laa
            r6 = 2038(0x7f6, float:2.856E-42)
            r1.type = r6
            int r6 = r1.flags
            r6 = r6 & (-17)
            r1.flags = r6
        Laa:
            android.view.View r6 = r0.f3607     // Catch: java.lang.Exception -> Ld5
            r2.addView(r6, r1)     // Catch: java.lang.Exception -> Ld5
            android.os.Handler r1 = xhss.C0137.f596     // Catch: java.lang.Exception -> Ld5
            xhss.ᛳᛶᲈᛲ r2 = new xhss.ᛳᛶᲈᛲ     // Catch: java.lang.Exception -> Ld5
            r6 = 5
            r2.<init>(r6, r8)     // Catch: java.lang.Exception -> Ld5
            int r8 = r0.f3608     // Catch: java.lang.Exception -> Ld5
            if (r8 != r4) goto Lbe
            r6 = 3500(0xdac, double:1.729E-320)
            goto Lc0
        Lbe:
            r6 = 2000(0x7d0, double:9.88E-321)
        Lc0:
            r1.postDelayed(r2, r6)     // Catch: java.lang.Exception -> Ld5
            r5.f905 = r3     // Catch: java.lang.Exception -> Ld5
            android.app.Activity r8 = r5.f906     // Catch: java.lang.Exception -> Ld5
            if (r8 != 0) goto Lca
            goto Lcd
        Lca:
            r8.registerActivityLifecycleCallbacks(r5)     // Catch: java.lang.Exception -> Ld5
        Lcd:
            r3.f602 = r4     // Catch: java.lang.Exception -> Ld5
            android.view.View r8 = r0.f3607     // Catch: java.lang.Exception -> Ld5
            xhss.C0137.m366(r8)     // Catch: java.lang.Exception -> Ld5
            goto Ld9
        Ld5:
            r8 = move-exception
            r8.printStackTrace()
        Ld9:
            return
    }
}
