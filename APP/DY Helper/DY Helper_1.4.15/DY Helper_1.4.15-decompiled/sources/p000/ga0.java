package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ga0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.rm1 f4293;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.fa0 f4294;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ android.app.Activity f4295;

    public ga0(p000.rm1 r1, p000.fa0 r2, android.app.Activity r3) {
            r0 = this;
            r0.<init>()
            r0.f4293 = r1
            r0.f4294 = r2
            r0.f4295 = r3
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
            r3 = this;
            java.util.List r0 = com.example.dyhelper.p002ui.GestureAreaView.f2526
            int r1 = p000.AbstractC1021yh.m6858(r0)
            r2 = 0
            int r5 = p000.j81.m2906(r5, r2, r1)
            java.lang.Object r5 = r0.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            rm1 r0 = r3.f4293
            r0.f9404 = r5
            fa0 r0 = r3.f4294
            android.widget.TextView r0 = r0.f3837
            x01 r1 = p000.x01.f11964
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            android.app.Activity r3 = r3.f4295
            r2 = 2131689541(0x7f0f0045, float:1.90081E38)
            java.lang.String r3 = r1.m6478(r3, r2, r5)
            r0.setText(r3)
            if (r6 == 0) goto L3b
            if (r4 == 0) goto L3b
            r3 = 4
            r4.performHapticFeedback(r3)
        L3b:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            java.lang.Object r1 = p000.ui1.f10844
            rm1 r0 = r0.f4293
            float r0 = r0.f9404
            java.lang.String r1 = "gesture_video_speed"
            p000.ui1.m5872(r1, r0)
            return
    }
}
