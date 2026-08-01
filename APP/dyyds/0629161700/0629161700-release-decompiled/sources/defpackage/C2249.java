package defpackage;

/* JADX INFO: renamed from: ᲈᛵᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2249 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f9567;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9568;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f9569;

    public /* synthetic */ C2249(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f9568 = r2
            r0.f9569 = r1
            r0.f9567 = r3
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m3633(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m3634(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
            r3 = this;
            int r4 = r3.f9568
            java.lang.Object r0 = r3.f9567
            java.lang.Object r3 = r3.f9569
            switch(r4) {
                case 0: goto L62;
                case 1: goto L34;
                default: goto L9;
            }
        L9:
            r1 = -115440415579694(0xffff9701ef0961d2, double:NaN)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r6 = 37
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            ᛳᲈᲇᛳ r0 = (defpackage.InterfaceC0598) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r0.mo617(r3)
            defpackage.C0433.m1212()
            return
        L34:
            r1 = -135678301478446(0xffff8499ef0961d2, double:NaN)
            ᛶᲀᛵ r4 = defpackage.C1141.f5173
            r4.getClass()
            ᲀᲇᛸᛶ r4 = defpackage.C1141.f5122
            ᲁᛷᛶᛶ[] r6 = defpackage.C1141.f5221
            r1 = 42
            r6 = r6[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r4.m3168(r6, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r4 = java.lang.String.valueOf(r5)
            r3.setText(r4)
            android.view.View r0 = (android.view.View) r0
            defpackage.C1326.m2465(r0)
            defpackage.C1500.m2706()
            return
        L62:
            if (r6 == 0) goto L72
            ᛸᛱᛴᲁ r3 = (defpackage.C1419) r3
            r4 = 0
            r3.f6211 = r4
            ᛳᲈᲇᛳ r0 = (defpackage.InterfaceC0598) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r0.mo617(r3)
        L72:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            int r0 = r0.f9568
            switch(r0) {
                case 0: goto L14;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            r0 = -115474775318062(0xffff96f9ef0961d2, double:NaN)
        La:
            return
        Le:
            r0 = -135691186380334(0xffff8496ef0961d2, double:NaN)
            goto La
        L14:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            int r0 = r0.f9568
            switch(r0) {
                case 0: goto L14;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            r0 = -115509135056430(0xffff96f1ef0961d2, double:NaN)
        La:
            return
        Le:
            r0 = -135704071282222(0xffff8493ef0961d2, double:NaN)
            goto La
        L14:
            return
    }
}
