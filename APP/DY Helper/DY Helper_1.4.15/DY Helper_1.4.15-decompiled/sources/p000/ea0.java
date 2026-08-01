package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ea0 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3454;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f3455;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.view.KeyEvent.Callback f3456;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.view.View f3457;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.view.View f3458;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f3459;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f3460;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f3461;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ java.lang.Object f3462;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ java.lang.Object f3463;

    public /* synthetic */ ea0(com.example.dyhelper.p002ui.GestureAreaView r2, android.app.Activity r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.Switch r7, android.widget.TextView r8, p000.C1000xx r9, android.widget.TextView r10) {
            r1 = this;
            r0 = 0
            r1.f3454 = r0
            r1.<init>()
            r1.f3455 = r2
            r1.f3456 = r3
            r1.f3457 = r4
            r1.f3458 = r5
            r1.f3459 = r6
            r1.f3462 = r7
            r1.f3460 = r8
            r1.f3463 = r9
            r1.f3461 = r10
            return
    }

    public /* synthetic */ ea0(p000.ec1 r2, android.widget.Spinner r3, android.widget.Spinner r4, android.widget.Spinner r5, p000.um1 r6, p000.um1 r7, p000.um1 r8, android.app.AlertDialog r9, p000.C1048z7 r10) {
            r1 = this;
            r0 = 1
            r1.f3454 = r0
            r1.<init>()
            r1.f3455 = r2
            r1.f3456 = r3
            r1.f3457 = r4
            r1.f3458 = r5
            r1.f3459 = r6
            r1.f3460 = r7
            r1.f3461 = r8
            r1.f3462 = r9
            r1.f3463 = r10
            return
    }

    public /* synthetic */ ea0(p000.um1 r2, android.app.Activity r3, p000.um1 r4, android.widget.EditText r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8, p000.qm1 r9, p000.qm1 r10) {
            r1 = this;
            r0 = 2
            r1.f3454 = r0
            r1.<init>()
            r1.f3455 = r2
            r1.f3456 = r3
            r1.f3460 = r4
            r1.f3461 = r5
            r1.f3457 = r6
            r1.f3458 = r7
            r1.f3459 = r8
            r1.f3462 = r9
            r1.f3463 = r10
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r24) {
            r23 = this;
            r0 = r23
            int r1 = r0.f3454
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r0.f3463
            java.lang.Object r5 = r0.f3462
            java.lang.Object r6 = r0.f3459
            android.view.View r7 = r0.f3458
            android.view.View r8 = r0.f3457
            java.lang.Object r9 = r0.f3461
            java.lang.Object r10 = r0.f3460
            android.view.KeyEvent$Callback r11 = r0.f3456
            java.lang.Object r0 = r0.f3455
            switch(r1) {
                case 0: goto Lc4;
                case 1: goto L71;
                default: goto L1b;
            }
        L1b:
            r13 = r0
            um1 r13 = (p000.um1) r13
            android.app.Activity r11 = (android.app.Activity) r11
            r15 = r10
            um1 r15 = (p000.um1) r15
            r16 = r9
            android.widget.EditText r16 = (android.widget.EditText) r16
            r17 = r8
            android.widget.TextView r17 = (android.widget.TextView) r17
            r18 = r7
            android.widget.TextView r18 = (android.widget.TextView) r18
            r19 = r6
            android.widget.TextView r19 = (android.widget.TextView) r19
            r20 = r5
            qm1 r20 = (p000.qm1) r20
            r21 = r4
            qm1 r21 = (p000.qm1) r21
            java.lang.String r0 = "空格"
            java.lang.String r1 = " · "
            java.lang.String r4 = " | "
            java.lang.String r5 = " / "
            java.lang.String r6 = " - "
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r4, r5, r6}
            java.lang.String r7 = "     "
            java.lang.String[] r14 = new java.lang.String[]{r7, r1, r4, r5, r6}
            java.lang.Object r1 = r13.f10912
            int r1 = p000.AbstractC0312g7.m2254(r14, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            if (r1 < 0) goto L5c
            r3 = r4
        L5c:
            if (r3 == 0) goto L62
            int r2 = r3.intValue()
        L62:
            bv1 r1 = p000.bv1.f1853
            il1 r12 = new il1
            r22 = 2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = "选择分隔符"
            p000.bv1.m1054(r11, r1, r0, r2, r12)
            return
        L71:
            ec1 r0 = (p000.ec1) r0
            android.widget.Spinner r11 = (android.widget.Spinner) r11
            android.widget.Spinner r8 = (android.widget.Spinner) r8
            android.widget.Spinner r7 = (android.widget.Spinner) r7
            um1 r6 = (p000.um1) r6
            um1 r10 = (p000.um1) r10
            um1 r9 = (p000.um1) r9
            android.app.AlertDialog r5 = (android.app.AlertDialog) r5
            z7 r4 = (p000.C1048z7) r4
            sd r12 = new sd
            long r13 = r0.f3481
            ip1[] r0 = p000.ip1.values()
            int r1 = r11.getSelectedItemPosition()
            r15 = r0[r1]
            ip1[] r0 = p000.ip1.values()
            int r1 = r8.getSelectedItemPosition()
            r16 = r0[r1]
            ip1[] r0 = p000.ip1.values()
            int r1 = r7.getSelectedItemPosition()
            r17 = r0[r1]
            java.lang.Object r0 = r6.f10912
            r18 = r0
            java.lang.Integer r18 = (java.lang.Integer) r18
            java.lang.Object r0 = r10.f10912
            r19 = r0
            td r19 = (p000.EnumC0831td) r19
            java.lang.Object r0 = r9.f10912
            r20 = r0
            java.util.Set r20 = (java.util.Set) r20
            r12.<init>(r13, r15, r16, r17, r18, r19, r20)
            p000.v81.m6133(r12)
            r5.dismiss()
            r4.invoke()
            return
        Lc4:
            r13 = r0
            com.example.dyhelper.ui.GestureAreaView r13 = (com.example.dyhelper.p002ui.GestureAreaView) r13
            android.app.Activity r11 = (android.app.Activity) r11
            r14 = r8
            android.widget.TextView r14 = (android.widget.TextView) r14
            r15 = r7
            android.widget.TextView r15 = (android.widget.TextView) r15
            r16 = r6
            android.widget.TextView r16 = (android.widget.TextView) r16
            r17 = r5
            android.widget.Switch r17 = (android.widget.Switch) r17
            r18 = r10
            android.widget.TextView r18 = (android.widget.TextView) r18
            r19 = r4
            xx r19 = (p000.C1000xx) r19
            r20 = r9
            android.widget.TextView r20 = (android.widget.TextView) r20
            boolean r0 = p000.ia0.m2694(r13, r11)
            if (r0 != 0) goto Lea
            goto L109
        Lea:
            r13.m1552()
            p000.ia0.m2696(r13, r14, r15, r16, r17, r18, r19, r20)
            int r0 = r13.m1549(r3)
            if (r0 <= 0) goto Lf9
            java.lang.String r0 = "配置已保存"
            goto Lfb
        Lf9:
            java.lang.String r0 = "配置已保存，未设置动作时不会触发"
        Lfb:
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r0, r2)
            r0.show()
            android.app.AlertDialog r0 = p000.ia0.f4971
            if (r0 == 0) goto L109
            r0.dismiss()
        L109:
            return
    }
}
