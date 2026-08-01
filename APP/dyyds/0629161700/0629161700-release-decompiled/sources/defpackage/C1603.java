package defpackage;

/* JADX INFO: renamed from: ᛸᲈᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1603 implements defpackage.InterfaceC0598 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7092;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7093;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7094;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7095;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7096;

    public /* synthetic */ C1603(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f7094 = r5
            r0.f7093 = r1
            r0.f7092 = r2
            r0.f7095 = r3
            r0.f7096 = r4
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f7094
            java.lang.Object r1 = r7.f7096
            java.lang.Object r2 = r7.f7095
            java.lang.Object r3 = r7.f7092
            java.lang.Object r7 = r7.f7093
            r4 = 1
            switch(r0) {
                case 0: goto Lc1;
                default: goto Le;
            }
        Le:
            ᲇᛷᛳᲀ r3 = (defpackage.InterfaceC2087) r3
            ᛷᲇᛱᲈ r2 = (defpackage.C1380) r2
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r7 instanceof java.util.Collection
            r5 = 0
            if (r0 == 0) goto L24
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23
            goto L24
        L23:
            r7 = r5
        L24:
            if (r7 == 0) goto Lbc
            java.lang.Object r0 = r3.mo388(r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            int r2 = r2.f6021
            r3 = 3
            if (r2 == r3) goto Lb4
            int r2 = defpackage.AbstractC2298.f9719
            int r2 = defpackage.AbstractC0225.m812(r2)
            if (r2 > 0) goto Lb4
            java.lang.String r7 = defpackage.C1027.m1980(r7)
            java.lang.String r2 = ""
            java.lang.String r3 = " (Kotlin reflection is not available)"
            if (r7 == 0) goto L50
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = defpackage.AbstractC0651.m1485(r7, r3, r2)
            goto L51
        L50:
            r7 = r5
        L51:
            if (r8 == 0) goto L5c
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = defpackage.AbstractC0651.m1485(r8, r3, r2)
            goto L5d
        L5c:
            r8 = r5
        L5d:
            if (r0 == 0) goto L62
            java.lang.String r2 = "HIT"
            goto L64
        L62:
            java.lang.String r2 = "MISS"
        L64:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "[FILTER] ["
            r3.<init>(r6)
            r3.append(r2)
            java.lang.String r2 = "] "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ": "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r7 = " [RESOLVED] "
            r3.append(r7)
            r3.append(r8)
            java.lang.String r7 = r3.toString()
            int r8 = defpackage.AbstractC2298.f9719
            int r8 = defpackage.AbstractC0225.m812(r8)
            int r1 = defpackage.AbstractC0225.m812(r4)
            if (r8 > r1) goto Lb4
            ᛸᛵᛴᛲ r8 = defpackage.AbstractC2298.f9720
            r8.getClass()
            ᛲᲈᛶᲈ r8 = defpackage.AbstractC2298.f9722
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lb6
            ᛲᲈᛶᲈ r8 = defpackage.AbstractC2298.f9721
            java.lang.Object r8 = r8.getValue()
            ᛱᛸᲀᛱ r8 = (defpackage.InterfaceC0150) r8
            r8.mo672(r7)
        Lb4:
            r4 = r0
            goto Lbc
        Lb6:
            java.lang.String r8 = "KavaRef"
            android.util.Log.d(r8, r7, r5)
            goto Lb4
        Lbc:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        Lc1:
            ᲁᛶᲁ r7 = (defpackage.C1876) r7
            ᛲᲈᲀᛱ r3 = (defpackage.C0395) r3
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.view.View r1 = (android.view.View) r1
            java.lang.Integer r8 = (java.lang.Integer) r8
            r7.m3279()
            if (r8 != 0) goto Ld1
            goto L119
        Ld1:
            r5 = -122406852533806(0xffff90abef0961d2, double:NaN)
            java.lang.String r7 = "#%06X"
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            int r8 = r8.intValue()
            r8 = r8 & r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r5 = -122432622337582(0xffff90a5ef0961d2, double:NaN)
            java.lang.String r7 = defpackage.AbstractC0225.m830(r8, r4, r7, r5)
            ᛶᲀᛵ r8 = defpackage.C1141.f5173
            r8.getClass()
            r5 = -18232420769326(0xffffef6aef0961d2, double:NaN)
            ᲀᲇᛸᛶ r8 = defpackage.C1141.f5091
            ᲁᛷᛶᛶ[] r0 = defpackage.C1141.f5221
            r5 = 41
            r0 = r0[r5]
            r8.m3168(r0, r7)
            r3.f2031 = r4
            r2.setText(r7)
            r7 = 0
            r3.f2031 = r7
            defpackage.C1326.m2465(r1)
            defpackage.C1500.m2706()
        L119:
            ᲁᲀᛱᲁ r7 = defpackage.C1907.f8270
            return r7
    }
}
