package defpackage;

/* JADX INFO: renamed from: ᛷᛶᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1291 implements defpackage.InterfaceC0598 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f5731;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5732;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5733;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5734;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5735;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f5736;

    public /* synthetic */ C1291(java.lang.Object r1, int r2, java.lang.Object r3, android.view.View r4, android.view.View r5, int r6) {
            r0 = this;
            r0.f5734 = r6
            r0.f5732 = r1
            r0.f5733 = r2
            r0.f5735 = r3
            r0.f5736 = r4
            r0.f5731 = r5
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f5734
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            r2 = 0
            android.view.View r3 = r10.f5731
            android.view.View r4 = r10.f5736
            java.lang.Object r5 = r10.f5735
            int r6 = r10.f5733
            java.lang.Object r10 = r10.f5732
            switch(r0) {
                case 0: goto L4e;
                default: goto L12;
            }
        L12:
            android.content.Context r10 = (android.content.Context) r10
            com.android.app.CustomRecyclerView r5 = (com.android.app.CustomRecyclerView) r5
            com.android.app.CustomRecyclerView r4 = (com.android.app.CustomRecyclerView) r4
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            java.util.List r11 = (java.util.List) r11
            r7 = -652968457575982(0xfffdae20ef0961d2, double:NaN)
            boolean r0 = r11.isEmpty()
            r7 = 8
            if (r0 != 0) goto L44
            ᲀᲀᛴᲀ r0 = new ᲀᲀᛴᲀ
            ᲀᲇᲁᛵ r8 = new ᲀᲇᲁᛵ
            r9 = 2
            r8.<init>(r10, r9)
            r0.<init>(r10, r11, r6, r8)
            r5.setAdapter(r0)
            r5.setVisibility(r2)
            r4.setVisibility(r7)
            r3.setVisibility(r7)
            goto L4d
        L44:
            r5.setVisibility(r7)
            r4.setVisibility(r7)
            r3.setVisibility(r2)
        L4d:
            return r1
        L4e:
            ᲁᛶᲁ r10 = (defpackage.C1876) r10
            ᛲᲈᲀᛱ r5 = (defpackage.C0395) r5
            android.widget.EditText r4 = (android.widget.EditText) r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            r10.m3279()
            if (r11 != 0) goto L5c
            goto L98
        L5c:
            int r10 = r6 >>> 24
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 24
            int r11 = r11.intValue()
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r0
            r10 = r10 | r11
            ᛶᲀᛵ r11 = defpackage.C1141.f5173
            r11.getClass()
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5194
            ᲁᛷᛶᛶ[] r6 = defpackage.C1141.f5221
            r7 = 49
            r6 = r6[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r0.m3168(r6, r7)
            r0 = 1
            r5.f2031 = r0
            java.lang.String r10 = defpackage.C1326.m2452(r10)
            r4.setText(r10)
            r5.f2031 = r2
            r11.getClass()
            int r10 = defpackage.C1141.m2213()
            r3.setBackgroundColor(r10)
            defpackage.C1326.m2461()
        L98:
            return r1
    }
}
