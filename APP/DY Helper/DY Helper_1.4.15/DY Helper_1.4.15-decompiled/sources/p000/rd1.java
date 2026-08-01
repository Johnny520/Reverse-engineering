package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd1 implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9343;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.qm1 f9344;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.util.LinkedHashMap f9345;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ p000.um1 f9346;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.widget.RadioGroup f9347;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f9348;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.C1000xx f9349;

    public /* synthetic */ rd1(p000.qm1 r1, java.util.LinkedHashMap r2, p000.um1 r3, android.widget.RadioGroup r4, android.app.Activity r5, p000.C1000xx r6, int r7) {
            r0 = this;
            r0.f9343 = r7
            r0.f9344 = r1
            r0.f9345 = r2
            r0.f9346 = r3
            r0.f9347 = r4
            r0.f9348 = r5
            r0.f9349 = r6
            r0.<init>()
            return
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup r2, int r3) {
            r1 = this;
            int r0 = r1.f9343
            switch(r0) {
                case 0: goto L2b;
                default: goto L5;
            }
        L5:
            r2.getClass()
            qm1 r2 = r1.f9344
            boolean r2 = r2.f9050
            if (r2 == 0) goto Lf
            goto L2a
        Lf:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.util.LinkedHashMap r0 = r1.f9345
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2a
            um1 r0 = r1.f9346
            r0.f10912 = r2
            android.widget.RadioGroup r2 = r1.f9347
            android.app.Activity r0 = r1.f9348
            xx r1 = r1.f9349
            p000.pf1.m4524(r2, r0, r1, r3)
        L2a:
            return
        L2b:
            r2.getClass()
            qm1 r2 = r1.f9344
            boolean r2 = r2.f9050
            if (r2 == 0) goto L35
            goto L52
        L35:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.util.LinkedHashMap r0 = r1.f9345
            java.lang.Object r2 = r0.get(r2)
            ud1 r2 = (p000.ud1) r2
            if (r2 == 0) goto L52
            vd1 r2 = r2.f10704
            um1 r0 = r1.f9346
            r0.f10912 = r2
            android.widget.RadioGroup r2 = r1.f9347
            android.app.Activity r0 = r1.f9348
            xx r1 = r1.f9349
            p000.xd1.m6628(r2, r0, r1, r3)
        L52:
            return
    }
}
