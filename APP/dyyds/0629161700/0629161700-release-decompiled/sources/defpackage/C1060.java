package defpackage;

/* JADX INFO: renamed from: ᛶᛴᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1060 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4693;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1653 f4694;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4695;

    public /* synthetic */ C1060(java.lang.Object r1, defpackage.C1653 r2, defpackage.InterfaceC0140 r3, int r4) {
            r0 = this;
            r0.f4695 = r4
            r0.f4693 = r1
            r0.f4694 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f4695
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            switch(r0) {
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛶᛴᛸᛵ r2 = (defpackage.C1060) r2
            r2.mo390(r1)
            return r1
        L15:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛶᛴᛸᛵ r2 = (defpackage.C1060) r2
            r2.mo390(r1)
            return r1
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.f4695
            ᲀᛳᲈᲀ r0 = r2.f4694
            java.lang.Object r2 = r2.f4693
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            ᛶᛴᛸᛵ r4 = new ᛶᛴᛸᛵ
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            ᛶᛴᛸᛵ r4 = new ᛶᛴᛸᛵ
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f4695
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᲀᛳᲈᲀ r2 = r4.f4694
            java.lang.Object r4 = r4.f4693
            switch(r0) {
                case 0: goto L3f;
                default: goto Lb;
            }
        Lb:
            defpackage.AbstractC0762.m1680(r5)
            android.view.View r5 = r2.f7353
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4 instanceof defpackage.C0723
            if (r0 != 0) goto L1c
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            r5.setText(r0)
        L1c:
            java.lang.Throwable r4 = defpackage.C2165.m3569(r4)
            if (r4 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = -101932743433774(0xffffa34aef0961d2, double:NaN)
            java.lang.String r2 = "获取备份信息失败\n"
            r0.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.setText(r4)
        L3e:
            return r1
        L3f:
            defpackage.AbstractC0762.m1680(r5)
            android.widget.TextView r5 = r2.f7354
            boolean r0 = r4 instanceof defpackage.C0723
            if (r0 != 0) goto L4e
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            r5.setText(r0)
        L4e:
            java.lang.Throwable r4 = defpackage.C2165.m3569(r4)
            if (r4 == 0) goto L70
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = -133079846264366(0xffff86f6ef0961d2, double:NaN)
            java.lang.String r2 = "获取备份信息失败\n"
            r0.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.setText(r4)
        L70:
            return r1
    }
}
