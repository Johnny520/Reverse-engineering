package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.β */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0159 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2636;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.ViewGroup f2637;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f2638;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f2639;

    public /* synthetic */ C0159(android.view.ViewGroup r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f2636 = r4
            r0.f2637 = r1
            r0.f2638 = r2
            r0.f2639 = r3
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f2636
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup r0 = r3.f2637
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeHostView r0 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeHostView) r0
            java.lang.Object r1 = r3.f2638
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r3.f2639
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView r3 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView) r3
            java.util.LinkedHashMap r2 = r0.f2594
            r2.remove(r1)
            android.widget.LinearLayout r0 = r0.f2592
            r0.removeView(r3)
            s62 r3 = p000.s62.f9751
            return r3
        L1e:
            android.view.ViewGroup r0 = r3.f2637
            com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView r0 = (com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView) r0
            java.lang.Object r1 = r3.f2638
            a80 r1 = (p000.a80) r1
            java.lang.Object r3 = r3.f2639
            um1 r3 = (p000.um1) r3
            boolean r2 = r0.f2468
            if (r2 != 0) goto L2f
            goto L41
        L2f:
            int r0 = r0.f2465
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r0)
            java.lang.Object r3 = r3.f10912
            if (r3 == 0) goto L44
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            r3.dismiss()
        L41:
            s62 r3 = p000.s62.f9751
            return r3
        L44:
            java.lang.String r3 = "dialog"
            p000.ln0.m3650(r3)
            r3 = 0
            throw r3
    }
}
