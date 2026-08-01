package defpackage;

/* JADX INFO: renamed from: ᛵᛵᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0886 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4005;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f4006;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4007;

    public /* synthetic */ C0886(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f4006 = r2
            r0.f4007 = r1
            r0.f4005 = r3
            r0.<init>()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r6, boolean r7) {
            r5 = this;
            int r6 = r5.f4006
            r0 = 8
            r1 = 0
            java.lang.Object r2 = r5.f4005
            java.lang.Object r5 = r5.f4007
            switch(r6) {
                case 0: goto L4b;
                case 1: goto L35;
                default: goto Lc;
            }
        Lc:
            ᛳᛵᛵᛷ r5 = (defpackage.AbstractC0483) r5
            ᛳᲈᲇᛳ r2 = (defpackage.InterfaceC0598) r2
            r0 = -111166923120174(0xffff9ae4ef0961d2, double:NaN)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r5.mo1264(r6)
            r5 = -111222757695022(0xffff9ad7ef0961d2, double:NaN)
            java.lang.String r5 = "保存成功"
            defpackage.AbstractC0209.m764(r5)
            if (r2 == 0) goto L34
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r2.mo617(r5)
        L34:
            return
        L35:
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = -153614084906542(0xffff7449ef0961d2, double:NaN)
            if (r7 == 0) goto L44
            r0 = r1
        L44:
            r5.setVisibility(r0)
            r2.setVisibility(r0)
            return
        L4b:
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = -122273708547630(0xffff90caef0961d2, double:NaN)
            ᛶᲀᛵ r6 = defpackage.C1141.f5173
            r6.getClass()
            ᲀᲇᛸᛶ r6 = defpackage.C1141.f5127
            ᲁᛷᛶᛶ[] r3 = defpackage.C1141.f5221
            r4 = 46
            r3 = r3[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r6.m3168(r3, r4)
            if (r7 == 0) goto L6f
            r6 = r1
            goto L70
        L6f:
            r6 = r0
        L70:
            r5.setVisibility(r6)
            if (r7 == 0) goto L76
            goto L77
        L76:
            r0 = r1
        L77:
            r2.setVisibility(r0)
            boolean r5 = defpackage.C1141.m2225()
            if (r5 == 0) goto L8c
            if (r7 == 0) goto L86
            defpackage.C1500.m2705()
            goto L8c
        L86:
            defpackage.C1500.m2707()
            defpackage.C1500.m2706()
        L8c:
            return
    }
}
