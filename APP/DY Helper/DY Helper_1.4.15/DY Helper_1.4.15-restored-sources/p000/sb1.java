package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb1 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9814;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f9815;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.ec1 f9816;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.um1 f9817;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.Button f9818;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.um1 f9819;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.um1 f9820;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ android.widget.Button f9821;

    public /* synthetic */ sb1(android.app.Activity r2, p000.ec1 r3, p000.um1 r4, android.widget.Button r5, p000.um1 r6, p000.um1 r7, android.widget.Button r8) {
            r1 = this;
            r0 = 1
            r1.f9814 = r0
            r1.<init>()
            r1.f9815 = r2
            r1.f9816 = r3
            r1.f9817 = r4
            r1.f9818 = r5
            r1.f9819 = r6
            r1.f9820 = r7
            r1.f9821 = r8
            return
    }

    public /* synthetic */ sb1(android.app.Activity r2, p000.um1 r3, p000.um1 r4, p000.ec1 r5, android.widget.Button r6, android.widget.Button r7, p000.um1 r8) {
            r1 = this;
            r0 = 0
            r1.f9814 = r0
            r1.<init>()
            r1.f9815 = r2
            r1.f9817 = r3
            r1.f9819 = r4
            r1.f9816 = r5
            r1.f9818 = r6
            r1.f9821 = r7
            r1.f9820 = r8
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r12) {
            r11 = this;
            int r12 = r11.f9814
            switch(r12) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            java.util.concurrent.ExecutorService r12 = p000.xd1.f12139
            um1 r1 = r11.f9817
            java.lang.Object r12 = r1.f10912
            java.util.Set r12 = (java.util.Set) r12
            qd r0 = p000.v81.m6127()
            int r6 = r0.f8968
            nb1 r0 = new nb1
            android.widget.Button r2 = r11.f9818
            um1 r3 = r11.f9819
            um1 r4 = r11.f9820
            android.widget.Button r5 = r11.f9821
            r0.<init>(r1, r2, r3, r4, r5)
            android.app.Activity r3 = r11.f9815
            r3.getClass()
            r12.getClass()
            m9 r2 = new m9
            ec1 r4 = r11.f9816
            r5 = r12
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r3.runOnUiThread(r2)
            return
        L35:
            qd r12 = p000.v81.m6127()
            java.util.concurrent.ExecutorService r0 = p000.xd1.f12139
            vd1 r4 = new vd1
            um1 r6 = r11.f9817
            java.lang.Object r0 = r6.f10912
            td r0 = (p000.EnumC0831td) r0
            um1 r7 = r11.f9819
            java.lang.Object r1 = r7.f10912
            java.lang.Integer r1 = (java.lang.Integer) r1
            r4.<init>(r0, r1)
            int r12 = r12.f8968
            nb1 r5 = new nb1
            android.widget.Button r8 = r11.f9818
            android.widget.Button r9 = r11.f9821
            um1 r10 = r11.f9820
            r5.<init>(r6, r7, r8, r9, r10)
            android.app.Activity r2 = r11.f9815
            r2.getClass()
            ec1 r11 = r11.f9816
            java.lang.String r0 = r11.f3484
            java.lang.String r1 = " 的种子策略"
            java.lang.String r3 = r0.concat(r1)
            id r11 = r11.f3487
            r0 = 0
            if (r11 == 0) goto L75
            zd1 r1 = r11.f5005
            if (r1 == 0) goto L75
            java.lang.Integer r1 = r1.f13048
            r6 = r1
            goto L76
        L75:
            r6 = r0
        L76:
            if (r11 == 0) goto L82
            zd1 r11 = r11.f5005
            if (r11 == 0) goto L82
            qc1 r0 = p000.qc1.f8961
            java.lang.Long r0 = p000.qc1.m4853(r11)
        L82:
            r7 = r0
            pd1 r1 = new pd1
            r8 = 0
            r9 = 1
            r10 = r5
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2.runOnUiThread(r1)
            return
    }
}
