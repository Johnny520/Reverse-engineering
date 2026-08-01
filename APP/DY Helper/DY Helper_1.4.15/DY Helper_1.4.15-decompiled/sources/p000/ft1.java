package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ft1 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4128;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.qm1 f4129;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.qm1 f4130;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.LinearLayout f4131;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f4132;

    public /* synthetic */ ft1(p000.qm1 r2, p000.qm1 r3, android.widget.LinearLayout r4, android.widget.LinearLayout r5) {
            r1 = this;
            r0 = 1
            r1.f4128 = r0
            r1.<init>()
            r1.f4129 = r2
            r1.f4130 = r3
            r1.f4131 = r4
            r1.f4132 = r5
            return
    }

    public /* synthetic */ ft1(p000.qm1 r2, p000.qm1 r3, p000.um1 r4, android.widget.LinearLayout r5) {
            r1 = this;
            r0 = 0
            r1.f4128 = r0
            r1.<init>()
            r1.f4129 = r2
            r1.f4130 = r3
            r1.f4132 = r4
            r1.f4131 = r5
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f4128
            s62 r1 = p000.s62.f9751
            r2 = 8
            java.lang.String r3 = "info_bar_neon_enabled"
            java.lang.String r4 = "info_bar_neon_solid_enabled"
            r5 = 0
            java.lang.Object r6 = r9.f4132
            android.widget.LinearLayout r7 = r9.f4131
            qm1 r8 = r9.f4130
            qm1 r9 = r9.f4129
            switch(r0) {
                case 0: goto L51;
                default: goto L16;
            }
        L16:
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            android.widget.Switch r11 = (android.widget.Switch) r11
            r11.getClass()
            r9.f9050 = r10
            bv1 r11 = p000.bv1.f1853
            p000.ui1.m5871(r4, r10)
            if (r10 == 0) goto L43
            r8.f9050 = r5
            p000.ui1.m5871(r3, r5)
            r10 = 1
            android.view.View r10 = r7.getChildAt(r10)
            boolean r11 = r10 instanceof android.widget.Switch
            if (r11 == 0) goto L3d
            android.widget.Switch r10 = (android.widget.Switch) r10
            goto L3e
        L3d:
            r10 = 0
        L3e:
            if (r10 == 0) goto L43
            r10.setChecked(r5)
        L43:
            boolean r10 = r8.f9050
            if (r10 != 0) goto L4d
            boolean r9 = r9.f9050
            if (r9 == 0) goto L4c
            goto L4d
        L4c:
            r2 = r5
        L4d:
            r6.setVisibility(r2)
            return r1
        L51:
            um1 r6 = (p000.um1) r6
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            android.widget.Switch r11 = (android.widget.Switch) r11
            r11.getClass()
            r9.f9050 = r10
            bv1 r11 = p000.bv1.f1853
            p000.ui1.m5871(r3, r10)
            if (r10 == 0) goto L75
            r8.f9050 = r5
            p000.ui1.m5871(r4, r5)
            java.lang.Object r10 = r6.f10912
            android.widget.Switch r10 = (android.widget.Switch) r10
            if (r10 == 0) goto L75
            r10.setChecked(r5)
        L75:
            boolean r9 = r9.f9050
            if (r9 != 0) goto L7f
            boolean r9 = r8.f9050
            if (r9 == 0) goto L7e
            goto L7f
        L7e:
            r2 = r5
        L7f:
            r7.setVisibility(r2)
            return r1
    }
}
