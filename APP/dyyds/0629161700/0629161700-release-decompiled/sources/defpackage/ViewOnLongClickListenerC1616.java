package defpackage;

/* JADX INFO: renamed from: ᲀᛱᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC1616 implements android.view.View.OnLongClickListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7126;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7127;

    public /* synthetic */ ViewOnLongClickListenerC1616(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7126 = r1
            r0.f7127 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r7) {
            r6 = this;
            int r0 = r6.f7126
            r1 = 3
            r2 = 0
            r3 = 1
            java.lang.Object r6 = r6.f7127
            switch(r0) {
                case 0: goto L131;
                case 1: goto Lec;
                case 2: goto Ldc;
                case 3: goto Ld8;
                case 4: goto L4a;
                case 5: goto L2c;
                case 6: goto L1c;
                default: goto La;
            }
        La:
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.content.Context r6 = r6.getContext()
            r0 = -156358569008686(0xffff71caef0961d2, double:NaN)
            defpackage.C1500.m2710(r6)
            return r3
        L1c:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.ss.android.ugc.aweme.feed.model.Aweme) r6
            ᛷᲈᛳᛳ r7 = defpackage.AbstractC1140.m2170()
            ᛱᛶᛵᛸ r0 = new ᛱᛶᛵᛸ
            r4 = 5
            r0.<init>(r6, r2, r4)
            defpackage.AbstractC0397.m1149(r7, r2, r0, r1)
            return r3
        L2c:
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            ᲀᛳᛸᲁ r0 = defpackage.C1647.f7340
            android.content.Context r7 = r7.getContext()
            r1 = -482350881742382(0xfffe494def0961d2, double:NaN)
            ᛲᲀ r1 = new ᛲᲀ
            r2 = 17
            r1.<init>(r2, r6)
            r0.getClass()
            defpackage.C1647.m3029(r7, r1)
            return r3
        L4a:
            android.content.Context r6 = (android.content.Context) r6
            ᲀᛳᛸᲁ r7 = defpackage.C1647.f7340
            r7.getClass()
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r6)
            r7.setOrientation(r3)
            r0 = 8
            int r0 = defpackage.AbstractC2093.m3510(r0)
            r1 = 4
            int r1 = defpackage.AbstractC2093.m3510(r1)
            r4 = 0
            r7.setPadding(r4, r0, r4, r1)
            r0 = -111063843905070(0xffff9afcef0961d2, double:NaN)
            java.lang.String r0 = "启用调试日志"
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            boolean r1 = defpackage.C1141.m2181()
            ᛴᛳᛷᛸ r4 = new ᛴᛳᛷᛸ
            r5 = 9
            r4.<init>(r5)
            android.widget.LinearLayout r0 = defpackage.C1647.m3019(r6, r0, r1, r4)
            r7.addView(r0)
            r0 = -111093908676142(0xffff9af5ef0961d2, double:NaN)
            java.lang.String r0 = "启用网络请求日志"
            ᲀᲇᛸᛶ r1 = defpackage.C1141.f5110
            ᲁᛷᛶᛶ[] r4 = defpackage.C1141.f5221
            r5 = 33
            r4 = r4[r5]
            java.lang.Object r1 = r1.m3169(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            ᛴᛳᛷᛸ r4 = new ᛴᛳᛷᛸ
            r5 = 10
            r4.<init>(r5)
            android.widget.LinearLayout r0 = defpackage.C1647.m3019(r6, r0, r1, r4)
            r7.addView(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
            r4 = -111132563381806(0xffff9aecef0961d2, double:NaN)
            java.lang.String r6 = "调试模式"
            android.app.AlertDialog$Builder r6 = r0.setTitle(r6)
            android.app.AlertDialog$Builder r6 = r6.setView(r7)
            r0 = -111154038218286(0xffff9ae7ef0961d2, double:NaN)
            java.lang.String r7 = "关闭"
            android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r7, r2)
            r6.show()
            return r3
        Ld8:
            defpackage.AbstractC2171.m3570(r6)
            return r3
        Ldc:
            com.ss.android.ugc.aweme.comment.model.Comment r6 = (com.ss.android.ugc.aweme.comment.model.Comment) r6
            ᛷᲈᛳᛳ r7 = defpackage.AbstractC1140.m2170()
            ᛲᛷᛶᛸ r0 = new ᛲᛷᛶᛸ
            r4 = 2
            r0.<init>(r6, r2, r4)
            defpackage.AbstractC0397.m1149(r7, r2, r0, r1)
            return r3
        Lec:
            android.view.View r6 = (android.view.View) r6
            ᛶᲀᛵ r7 = defpackage.C1141.f5173
            r7.getClass()
            boolean r7 = defpackage.C1141.m2195()
            r7 = r7 ^ r3
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5233
            ᲁᛷᛶᛶ[] r1 = defpackage.C1141.f5221
            r2 = 98
            r1 = r1[r2]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0.m3168(r1, r7)
            boolean r7 = defpackage.C1141.m2195()
            if (r7 == 0) goto L112
            r7 = 0
            r6.setAlpha(r7)
            goto L117
        L112:
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r7)
        L117:
            boolean r6 = defpackage.C1141.m2195()
            if (r6 == 0) goto L127
            r6 = -549567119924782(0xfffe0c2bef0961d2, double:NaN)
        L122:
            java.lang.String r6 = "已隐藏"
            goto L12d
        L127:
            r6 = -549584299793966(0xfffe0c27ef0961d2, double:NaN)
            goto L122
        L12d:
            defpackage.AbstractC0209.m764(r6)
            return r3
        L131:
            ᲀᛲᛶᲈ r6 = (defpackage.C1630) r6
            r6.m2987()
            return r3
    }
}
