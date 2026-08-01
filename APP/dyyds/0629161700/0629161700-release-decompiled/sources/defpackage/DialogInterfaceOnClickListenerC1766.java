package defpackage;

/* JADX INFO: renamed from: ᲀᲇᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1766 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1653 f7819;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f7820;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7821;

    public /* synthetic */ DialogInterfaceOnClickListenerC1766(android.content.Context r1, defpackage.C1653 r2, int r3) {
            r0 = this;
            r0.f7821 = r3
            r0.f7820 = r1
            r0.f7819 = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r5, int r6) {
            r4 = this;
            int r5 = r4.f7821
            r6 = 3
            r0 = 0
            ᲀᛳᲈᲀ r1 = r4.f7819
            android.content.Context r4 = r4.f7820
            switch(r5) {
                case 0: goto L5c;
                case 1: goto L4e;
                default: goto Lb;
            }
        Lb:
            android.app.AlertDialog$Builder r5 = new android.app.AlertDialog$Builder
            r5.<init>(r4)
            r2 = -123051097628206(0xffff9015ef0961d2, double:NaN)
            java.lang.String r6 = "确认恢复"
            android.app.AlertDialog$Builder r5 = r5.setTitle(r6)
            r2 = -123072572464686(0xffff9010ef0961d2, double:NaN)
            java.lang.String r6 = "恢复插眼数据会删除所有现有的插眼数据和分类\n\n此操作不可撤销，是否继续？"
            android.app.AlertDialog$Builder r5 = r5.setMessage(r6)
            r2 = -123231486254638(0xffff8febef0961d2, double:NaN)
            java.lang.String r6 = "确定恢复"
            ᲀᲇᛴᲈ r2 = new ᲀᲇᛴᲈ
            r3 = 0
            r2.<init>(r4, r1, r3)
            android.app.AlertDialog$Builder r4 = r5.setPositiveButton(r6, r2)
            r5 = -123252961091118(0xffff8fe6ef0961d2, double:NaN)
            java.lang.String r5 = "取消"
            android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r5, r0)
            r4.show()
            return
        L4e:
            ᛷᲈᛳᛳ r5 = defpackage.AbstractC1140.m2170()
            ᛶᛴᛳᛴ r2 = new ᛶᛴᛳᛴ
            r3 = 4
            r2.<init>(r4, r1, r0, r3)
            defpackage.AbstractC0397.m1149(r5, r0, r2, r6)
            return
        L5c:
            ᛷᲈᛳᛳ r5 = defpackage.AbstractC1140.m2170()
            ᛶᛴᛳᛴ r2 = new ᛶᛴᛳᛴ
            r3 = 5
            r2.<init>(r4, r1, r0, r3)
            defpackage.AbstractC0397.m1149(r5, r0, r2, r6)
            return
    }
}
