package defpackage;

/* JADX INFO: renamed from: ᲈᲁᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2330 implements android.media.MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f10047;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f10048;

    public /* synthetic */ C2330(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f10047 = r1
            r0.f10048 = r2
            r0.<init>()
            return
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer r4) {
            r3 = this;
            int r4 = r3.f10047
            r0 = -1
            java.lang.Object r3 = r3.f10048
            switch(r4) {
                case 0: goto L3a;
                case 1: goto L16;
                default: goto L8;
            }
        L8:
            ᛱᛵᛴᛲ r3 = (defpackage.C0089) r3
            r3.f848 = r0
            java.lang.Object r3 = r3.f842
            ᛱᲁᛲᛸ r3 = (defpackage.C0177) r3
            if (r3 == 0) goto L15
            r3.m710(r0)
        L15:
            return
        L16:
            ᲀᛲᛶᲈ r3 = (defpackage.C1630) r3
            r4 = 0
            r3.f7269 = r4
            android.widget.ImageView r0 = r3.f7241
            r1 = 1711800653(0x6608014d, float:1.6056646E23)
            r0.setImageResource(r1)
            android.widget.TextView r0 = r3.f7262
            r1 = -86496630971950(0xffffb154ef0961d2, double:NaN)
            java.lang.String r1 = "00:00"
            r0.setText(r1)
            android.widget.SeekBar r0 = r3.f7256
            r0.setProgress(r4)
            r3.m2984()
            return
        L3a:
            ᲀᛲᛶᲈ r3 = (defpackage.C1630) r3
            r3.f7265 = r0
            ᛷᛷᲈᲇ r3 = r3.f7249
            if (r3 == 0) goto L45
            r3.m2450(r0)
        L45:
            return
    }
}
