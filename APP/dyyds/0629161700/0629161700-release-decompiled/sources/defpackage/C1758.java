package defpackage;

/* JADX INFO: renamed from: ᲀᲁᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1758 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7773;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7774;

    public /* synthetic */ C1758(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7773 = r1
            r0.f7774 = r2
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m3165(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m3166(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r3, int r4, boolean r5) {
            r2 = this;
            int r3 = r2.f7773
            java.lang.Object r2 = r2.f7774
            switch(r3) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            r0 = -118202079551022(0xffff947eef0961d2, double:NaN)
            ᛳᲈᲇᛳ r2 = (defpackage.InterfaceC0598) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.mo617(r3)
            return
        L19:
            ᲀᛲᛶᲈ r2 = (defpackage.C1630) r2
            if (r5 == 0) goto L2f
            android.media.MediaPlayer r3 = r2.f7268
            if (r3 == 0) goto L2f
            int r3 = r3.getDuration()
            int r3 = r3 * r4
            int r3 = r3 / 100
            android.media.MediaPlayer r2 = r2.f7268
            if (r2 == 0) goto L2f
            r2.seekTo(r3)
        L2f:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            int r0 = r0.f7773
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            r0 = -118214964452910(0xffff947bef0961d2, double:NaN)
        Ld:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            int r0 = r0.f7773
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = -118227849354798(0xffff9478ef0961d2, double:NaN)
            defpackage.C1326.m2461()
        L10:
            return
    }
}
