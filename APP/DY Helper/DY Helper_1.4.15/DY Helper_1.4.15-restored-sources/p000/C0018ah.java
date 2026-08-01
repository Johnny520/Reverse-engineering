package p000;

/* JADX INFO: renamed from: ah */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0018ah implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f221;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f222;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.Object f223;

    public /* synthetic */ C0018ah(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f221 = r2
            r0.f222 = r1
            r0.f223 = r3
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m114(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: β */
    private final void m115(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
            r3 = this;
            int r0 = r3.f221
            java.lang.Object r1 = r3.f222
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            r4.getClass()
            if (r6 == 0) goto L15
            a80 r1 = (p000.a80) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1.invoke(r3)
        L15:
            return
        L16:
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r4 = r1.getContext()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r2 = 2131689529(0x7f0f0039, float:1.9008076E38)
            java.lang.String r4 = r4.getString(r2, r0)
            r1.setText(r4)
            if (r6 == 0) goto L3b
            java.lang.Object r3 = r3.f223
            wg r3 = (p000.C0946wg) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.invoke(r4)
        L3b:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r2) {
            r1 = this;
            int r0 = r1.f221
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            r2.getClass()
            java.lang.Object r1 = r1.f223
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L16
            r2 = 1
            r1.requestDisallowInterceptTouchEvent(r2)
        L16:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r2) {
            r1 = this;
            int r0 = r1.f221
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            r2.getClass()
            java.lang.Object r1 = r1.f223
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L16
            r2 = 0
            r1.requestDisallowInterceptTouchEvent(r2)
        L16:
            return
    }
}
