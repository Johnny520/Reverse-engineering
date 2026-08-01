package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛵᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0269 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1017;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object f1018;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1019;

    public /* synthetic */ RunnableC0269(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.f1017 = r1
            r0.f1018 = r2
            r0.f1019 = r3
            r0.<init>()
            return
    }

    public RunnableC0269(xhss.C1038 r2, java.lang.Runnable r3) {
            r1 = this;
            r0 = 2
            r1.f1017 = r0
            r1.<init>()
            r1.f1019 = r2
            r1.f1018 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f1017
            java.lang.Object r1 = r5.f1019
            switch(r0) {
                case 0: goto L50;
                case 1: goto L46;
                case 2: goto L19;
                case 3: goto L11;
                default: goto L7;
            }
        L7:
            java.lang.Object r5 = r5.f1018
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.View r1 = (android.view.View) r1
            xhss.AbstractC0060.m181(r5, r1)
            return
        L11:
            java.lang.Object r5 = r5.f1018
            xhss.ᲀᛶᛲᛵ r5 = (xhss.C0866) r5
            r5.accept(r1)
            return
        L19:
            r0 = r1
            xhss.ᲇᛵᛳᛸ r0 = (xhss.C1038) r0
            xhss.ᛲᛶᲇᲇ r2 = r0.f3355
            r1 = 0
        L1f:
            java.lang.Object r3 = r5.f1018     // Catch: java.lang.Throwable -> L27
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L27
            r3.run()     // Catch: java.lang.Throwable -> L27
            goto L2d
        L27:
            r3 = move-exception
            xhss.ᲇᛷᲁᛷ r4 = xhss.C1059.f3421
            xhss.AbstractC0955.m1565(r4, r3)
        L2d:
            java.lang.Runnable r3 = r0.m1698()
            if (r3 != 0) goto L34
            goto L45
        L34:
            r5.f1018 = r3
            int r1 = r1 + 1
            r3 = 16
            if (r1 < r3) goto L1f
            boolean r3 = r2.mo441(r0)
            if (r3 == 0) goto L1f
            r2.mo359(r0, r5)
        L45:
            return
        L46:
            java.lang.Object r5 = r5.f1018
            xhss.ᛲᛶᛳᲁ r5 = (xhss.C0172) r5
            xhss.ᛵᛷᲈᛲ r1 = (xhss.C0499) r1
            r5.m413(r1)
            return
        L50:
            java.lang.Object r5 = r5.f1018
            xhss.ᲇᛵᛲᲁ r5 = (xhss.C1037) r5
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            java.lang.Object r5 = r5.f3349
            xhss.ᛷᲀᲇᲀ r5 = (xhss.C0702) r5
            r5.m1223(r1)
            return
    }
}
