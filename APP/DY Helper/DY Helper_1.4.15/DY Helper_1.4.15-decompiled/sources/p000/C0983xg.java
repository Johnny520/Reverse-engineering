package p000;

/* JADX INFO: renamed from: xg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0983xg implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f12158;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f12159;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.Object f12160;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ android.view.KeyEvent.Callback f12161;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ java.lang.Object f12162;

    public /* synthetic */ C0983xg(int r1, android.view.KeyEvent.Callback r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r0 = this;
            r0.f12158 = r1
            r0.f12159 = r3
            r0.f12160 = r4
            r0.f12161 = r2
            r0.f12162 = r5
            r0.<init>()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r4, boolean r5) {
            r3 = this;
            int r0 = r3.f12158
            switch(r0) {
                case 0: goto L31;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f12159
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r1 = r3.f12160
            id1 r1 = (p000.id1) r1
            int r1 = r1.f5015
            android.view.KeyEvent$Callback r2 = r3.f12161
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r3 = r3.f12162
            xx r3 = (p000.C1000xx) r3
            r4.getClass()
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r5 == 0) goto L26
            r0.add(r1)
            goto L29
        L26:
            r0.remove(r1)
        L29:
            android.graphics.drawable.GradientDrawable r3 = p000.xd1.m6614(r2, r3, r5)
            r4.setBackground(r3)
            return
        L31:
            java.lang.Object r0 = r3.f12159
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            java.lang.Object r1 = r3.f12160
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.KeyEvent$Callback r2 = r3.f12161
            android.widget.Switch r2 = (android.widget.Switch) r2
            java.lang.Object r3 = r3.f12162
            wa r3 = (p000.C0940wa) r3
            r4.getClass()
            r0.setEnabled(r5)
            r1.setEnabled(r5)
            r2.setEnabled(r5)
            if (r5 == 0) goto L52
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L55
        L52:
            r4 = 1055286886(0x3ee66666, float:0.45)
        L55:
            r0.setAlpha(r4)
            r1.setAlpha(r4)
            r2.setAlpha(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r3.invoke(r4)
            return
    }
}
