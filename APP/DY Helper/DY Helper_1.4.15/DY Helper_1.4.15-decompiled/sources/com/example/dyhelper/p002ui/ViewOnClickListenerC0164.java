package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.η */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0164 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2648;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f2649;

    public /* synthetic */ ViewOnClickListenerC0164(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2648 = r1
            r0.f2649 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            int r5 = r4.f2648
            java.lang.Object r4 = r4.f2649
            switch(r5) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            p70 r4 = (p000.p70) r4
            int r5 = com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView.f2601
            r4.invoke()
            return
        Lf:
            com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView r4 = (com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView) r4
            boolean r5 = r4.f2471
            r0 = r5 ^ 1
            r4.f2471 = r0
            android.widget.LinearLayout r0 = r4.f2460
            r1 = 0
            if (r0 == 0) goto L5f
            if (r5 != 0) goto L20
            r5 = 0
            goto L22
        L20:
            r5 = 8
        L22:
            r0.setVisibility(r5)
            android.widget.TextView r5 = r4.f2461
            if (r5 == 0) goto L59
            android.view.ViewPropertyAnimator r5 = r5.animate()
            boolean r0 = r4.f2471
            if (r0 == 0) goto L34
            r0 = 1127481344(0x43340000, float:180.0)
            goto L35
        L34:
            r0 = 0
        L35:
            android.view.ViewPropertyAnimator r5 = r5.rotation(r0)
            r2 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r2)
            r5.start()
            android.widget.LinearLayout r5 = r4.f2462
            if (r5 == 0) goto L53
            boolean r4 = r4.f2471
            if (r4 == 0) goto L4d
            java.lang.String r4 = "收起 RGB 精确调整"
            goto L4f
        L4d:
            java.lang.String r4 = "展开 RGB 精确调整"
        L4f:
            r5.setContentDescription(r4)
            return
        L53:
            java.lang.String r4 = "advancedHeader"
            p000.ln0.m3650(r4)
            throw r1
        L59:
            java.lang.String r4 = "advancedChevron"
            p000.ln0.m3650(r4)
            throw r1
        L5f:
            java.lang.String r4 = "advancedContent"
            p000.ln0.m3650(r4)
            throw r1
    }
}
