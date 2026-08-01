package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7503;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.um1 f7504;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f7505;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.Button f7506;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.Button f7507;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.um1 f7508;

    public /* synthetic */ nb1(p000.um1 r2, android.widget.Button r3, p000.um1 r4, p000.um1 r5, android.widget.Button r6) {
            r1 = this;
            r0 = 0
            r1.f7503 = r0
            r1.<init>()
            r1.f7504 = r2
            r1.f7506 = r3
            r1.f7505 = r4
            r1.f7508 = r5
            r1.f7507 = r6
            return
    }

    public /* synthetic */ nb1(p000.um1 r2, p000.um1 r3, android.widget.Button r4, android.widget.Button r5, p000.um1 r6) {
            r1 = this;
            r0 = 1
            r1.f7503 = r0
            r1.<init>()
            r1.f7504 = r2
            r1.f7505 = r3
            r1.f7506 = r4
            r1.f7507 = r5
            r1.f7508 = r6
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f7503
            switch(r0) {
                case 0: goto L2c;
                default: goto L5;
            }
        L5:
            vd1 r4 = (p000.vd1) r4
            r4.getClass()
            td r0 = r4.f11246
            if (r0 != 0) goto L10
            td r0 = p000.EnumC0831td.f10317
        L10:
            um1 r1 = r3.f7504
            r1.f10912 = r0
            java.lang.Integer r4 = r4.f11247
            td r2 = p000.EnumC0831td.f10319
            if (r0 != r2) goto L1b
            goto L1c
        L1b:
            r4 = 0
        L1c:
            um1 r0 = r3.f7505
            r0.f10912 = r4
            android.widget.Button r4 = r3.f7506
            android.widget.Button r2 = r3.f7507
            um1 r3 = r3.f7508
            p000.xn0.m6724(r1, r0, r4, r2, r3)
        L29:
            s62 r3 = p000.s62.f9751
            return r3
        L2c:
            java.util.Set r4 = (java.util.Set) r4
            r4.getClass()
            um1 r0 = r3.f7504
            r0.f10912 = r4
            um1 r4 = r3.f7505
            um1 r1 = r3.f7508
            android.widget.Button r2 = r3.f7506
            android.widget.Button r3 = r3.f7507
            p000.xn0.m6724(r4, r1, r2, r3, r0)
            goto L29
    }
}
