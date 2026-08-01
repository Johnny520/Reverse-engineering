package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ru1 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9517;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ android.widget.TextView f9518;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.String f9519;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ p000.a80 f9520;

    public ru1(int r1, android.widget.TextView r2, java.lang.String r3, p000.a80 r4) {
            r0 = this;
            r0.<init>()
            r0.f9517 = r1
            r0.f9518 = r2
            r0.f9519 = r3
            r0.f9520 = r4
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
            r3 = this;
            int r4 = r3.f9517
            int r5 = r5 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r0 = r3.f9519
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.widget.TextView r0 = r3.f9518
            r0.setText(r4)
            if (r6 == 0) goto L3d
            android.view.ViewPropertyAnimator r4 = r0.animate()
            r6 = 1066024305(0x3f8a3d71, float:1.08)
            android.view.ViewPropertyAnimator r4 = r4.scaleX(r6)
            android.view.ViewPropertyAnimator r4 = r4.scaleY(r6)
            r1 = 80
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r1)
            bu1 r6 = new bu1
            r1 = 1
            r6.<init>(r0, r1)
            android.view.ViewPropertyAnimator r4 = r4.withEndAction(r6)
            r4.start()
        L3d:
            a80 r3 = r3.f9520
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.invoke(r4)
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
            return
    }
}
