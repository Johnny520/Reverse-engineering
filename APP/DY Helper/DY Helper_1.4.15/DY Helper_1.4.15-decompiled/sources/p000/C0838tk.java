package p000;

/* JADX INFO: renamed from: tk */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0838tk implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f10403;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f10404;

    public /* synthetic */ C0838tk(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f10403 = r1
            r0.f10404 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m5713(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: β */
    private final void m5714(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
            r3 = this;
            int r0 = r3.f10403
            java.lang.Object r3 = r3.f10404
            r1 = 0
            switch(r0) {
                case 0: goto L42;
                default: goto L8;
            }
        L8:
            r4.getClass()
            java.util.List r0 = p000.q71.f8897
            int r2 = p000.AbstractC1021yh.m6858(r0)
            int r5 = p000.j81.m2906(r5, r1, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            q71 r1 = p000.q71.f8896
            java.lang.Object r5 = r0.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.String r5 = p000.q71.m4801(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "x"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r3.setText(r5)
            if (r6 == 0) goto L41
            r3 = 4
            r4.performHapticFeedback(r3)
        L41:
            return
        L42:
            uk r3 = (p000.C0875uk) r3
            boolean r4 = r3.f10867
            if (r4 != 0) goto L9d
            if (r6 == 0) goto L9d
            mk r4 = r3.f10866
            boolean r6 = r4.f7189
            if (r6 != 0) goto L51
            goto L9d
        L51:
            java.lang.Object r6 = p000.ui1.f10844
            java.lang.String r4 = r4.f7186
            java.lang.String r6 = "comment_control_"
            java.lang.String r0 = "_alpha"
            java.lang.String r4 = p000.lz1.m3674(r6, r4, r0)
            r6 = 100
            int r6 = p000.j81.m2906(r5, r1, r6)
            p000.ui1.m5873(r4, r6)
            android.widget.TextView r4 = r3.f10878
            r6 = 0
            if (r4 == 0) goto L97
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "%"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.setText(r5)
            b8 r4 = r3.f10862
            if (r4 == 0) goto L91
            mk r3 = r3.f10866
            boolean r5 = p000.ui1.m5901()
            boolean r6 = p000.C0875uk.m5915()
            r4.m818(r3, r5, r6)
            goto L9d
        L91:
            java.lang.String r3 = "preview"
            p000.ln0.m3650(r3)
            throw r6
        L97:
            java.lang.String r3 = "alphaValue"
            p000.ln0.m3650(r3)
            throw r6
        L9d:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            int r0 = r0.f10403
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r1.getClass()
        L8:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r3) {
            r2 = this;
            int r2 = r2.f10403
            switch(r2) {
                case 0: goto L59;
                default: goto L5;
            }
        L5:
            r3.getClass()
            int r2 = r3.getProgress()
            java.util.List r3 = p000.q71.f8897
            int r0 = p000.AbstractC1021yh.m6858(r3)
            r1 = 0
            int r2 = p000.j81.m2906(r2, r1, r0)
            java.lang.Object r2 = r3.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.String r3 = "global_video_speed"
            p000.ui1.m5872(r3, r2)
            java.lang.String[] r2 = p000.n82.f7460
            l82 r2 = p000.l82.f6483
            java.lang.Float r2 = p000.l82.m3537()
            if (r2 == 0) goto L59
            float r2 = r2.floatValue()
            java.util.concurrent.atomic.AtomicLong r3 = p000.l82.f6489
            long r0 = r3.get()
            p000.l82.f6490 = r0
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r3 = p000.ln0.m3626(r3, r0)
            if (r3 == 0) goto L4e
            p000.l82.m3534(r2)
            goto L59
        L4e:
            android.os.Handler r3 = p000.l82.f6488
            g82 r0 = new g82
            r1 = 1
            r0.<init>(r1, r2)
            r3.post(r0)
        L59:
            return
    }
}
