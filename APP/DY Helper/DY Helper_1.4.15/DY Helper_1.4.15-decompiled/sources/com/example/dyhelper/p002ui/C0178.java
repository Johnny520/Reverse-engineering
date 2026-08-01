package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.φ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0178 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.app.Activity f2689;

    public /* synthetic */ C0178(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.f2689 = r1
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r3 = this;
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694
            java.lang.String r0 = "camp:auto"
            java.lang.String r0 = com.example.dyhelper.p002ui.C0182.m1593(r0)
            java.util.LinkedHashMap r1 = com.example.dyhelper.p002ui.C0182.f2698
            java.lang.Object r1 = r1.remove(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L17
            android.os.Handler r2 = com.example.dyhelper.p002ui.C0182.f2694
            r2.removeCallbacks(r1)
        L17:
            java.util.LinkedHashMap r1 = com.example.dyhelper.p002ui.C0182.f2697
            r1.remove(r0)
            java.util.LinkedHashSet r2 = com.example.dyhelper.p002ui.C0182.f2699
            r2.remove(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L2a
            r2.clear()
        L2a:
            android.app.Activity r3 = r3.f2689
            r0 = 0
            if (r3 == 0) goto L33
            com.example.dyhelper.p002ui.C0182.m1596(r3, r0)
            goto L64
        L33:
            java.util.List r3 = com.example.dyhelper.p002ui.C0182.m1588()
            r1 = 3
            java.util.List r3 = p000.AbstractC0984xh.m6662(r3, r1)
            java.util.List r2 = com.example.dyhelper.p002ui.C0182.m1588()
            int r2 = r2.size()
            int r2 = r2 - r1
            if (r2 >= 0) goto L48
            r2 = r0
        L48:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L5c
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r3 = com.example.dyhelper.p002ui.C0182.f2696
            if (r3 == 0) goto L64
            tv1 r0 = new tv1
            r1 = 5
            r0.<init>(r1)
            r3.m1572(r0)
            goto L64
        L5c:
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r1 = com.example.dyhelper.p002ui.C0182.f2696
            if (r1 != 0) goto L61
            goto L64
        L61:
            r1.m1574(r3, r2, r0)
        L64:
            s62 r3 = p000.s62.f9751
            return r3
    }
}
