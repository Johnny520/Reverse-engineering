package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ha0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.fa0 f4666;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ int f4667;

    public ha0(p000.fa0 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f4666 = r1
            r0.f4667 = r2
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
            r3 = this;
            java.util.List r0 = p000.ia0.f4972
            int r1 = p000.AbstractC1021yh.m6858(r0)
            r2 = 0
            int r5 = p000.j81.m2906(r5, r2, r1)
            fa0 r3 = r3.f4666
            android.widget.TextView r3 = r3.f3837
            java.lang.Object r5 = r0.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (int) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "x"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r3.setText(r5)
            if (r6 == 0) goto L36
            if (r4 == 0) goto L36
            r3 = 4
            r4.performHapticFeedback(r3)
        L36:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r3) {
            r2 = this;
            if (r3 == 0) goto L7
            int r2 = r3.getProgress()
            goto L9
        L7:
            int r2 = r2.f4667
        L9:
            java.util.List r3 = p000.ia0.f4972
            int r0 = p000.AbstractC1021yh.m6858(r3)
            r1 = 0
            int r2 = p000.j81.m2906(r2, r1, r0)
            java.lang.Object r0 = p000.ui1.f10844
            java.lang.Object r2 = r3.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.String r3 = "global_video_speed"
            p000.ui1.m5872(r3, r2)
            return
    }
}
