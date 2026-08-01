package defpackage;

/* JADX INFO: renamed from: ᛶᲁᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1162 implements defpackage.InterfaceC1781 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5268;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5269;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5270;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5271;

    public /* synthetic */ C1162(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f5270 = r4
            r0.f5269 = r1
            r0.f5268 = r2
            r0.f5271 = r3
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1781
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Object mo1032() {
            r6 = this;
            int r0 = r6.f5270
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r2 = r6.f5271
            java.lang.Object r3 = r6.f5268
            java.lang.Object r6 = r6.f5269
            switch(r0) {
                case 0: goto Lc2;
                case 1: goto Lad;
                case 2: goto La3;
                case 3: goto L57;
                case 4: goto L4d;
                default: goto Ld;
            }
        Ld:
            ᛴᛵᲇᲇ r6 = (defpackage.C0682) r6
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.ss.android.ugc.aweme.profile.model.User) r3
            ᛶᲈᛱᲈ r2 = (defpackage.C1180) r2
            java.lang.String r0 = r3.uid
            if (r0 != 0) goto L20
            r3 = -583853843848750(0xfffdecfcef0961d2, double:NaN)
            java.lang.String r0 = "-1"
        L20:
            r3 = -583866728750638(0xfffdecf9ef0961d2, double:NaN)
            java.lang.String r3 = "-1"
            boolean r6 = r6.m1542(r0, r3)
            java.lang.Object r0 = r2.f5356
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r6 == 0) goto L40
            r2 = -583879613652526(0xfffdecf6ef0961d2, double:NaN)
            java.lang.String r6 = "取消主页插眼"
            r0.setText(r6)
            goto L4c
        L40:
            r2 = -583909678423598(0xfffdecefef0961d2, double:NaN)
            java.lang.String r6 = "主页插眼"
            r0.setText(r6)
        L4c:
            return r1
        L4d:
            ᛵᛸᲀᲁ r6 = (defpackage.C0949) r6
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r2 = (java.lang.String) r2
            defpackage.C0904.m1872(r6, r3, r2)
            return r1
        L57:
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r3 = (java.lang.String) r3
            ᛶᛸᲈᛶ r2 = (defpackage.C1135) r2
            ᛴᛶᲁᛲ r0 = defpackage.C0697.f3343
            r0.getClass()
            r4 = -193978187554350(0xffff4f93ef0961d2, double:NaN)
            r4 = -194012547292718(0xffff4f8bef0961d2, double:NaN)
            java.util.ArrayList r0 = defpackage.C0697.m1577(r6)
            boolean r3 = r0.remove(r3)
            if (r3 == 0) goto L7f
            defpackage.C0697.m1576(r6, r0)
        L7f:
            if (r3 == 0) goto L96
            r3 = -652852493458990(0xfffdae3bef0961d2, double:NaN)
            java.lang.String r0 = "删除成功 ✓"
            defpackage.AbstractC0209.m764(r0)
            ᛶᛸᛱᲀ r0 = defpackage.C1121.f5003
            defpackage.C1121.m2134(r6)
            r2.mo1032()
            goto La2
        L96:
            r2 = -652882558230062(0xfffdae34ef0961d2, double:NaN)
            java.lang.String r6 = "删除失败"
            defpackage.AbstractC0209.m764(r6)
        La2:
            return r1
        La3:
            ᛵᛸᲀᲁ r6 = (defpackage.C0949) r6
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r2 = (java.lang.String) r2
            defpackage.C1478.m2682(r6, r3, r2)
            return r1
        Lad:
            ᲈᛳᛷ r6 = (defpackage.C2209) r6
            ᛶᛳᛸᛷ r3 = (defpackage.C1045) r3
            ᛱᛲᛶᲈ r2 = (defpackage.C0038) r2
            ᲈᛲᲀᛳ r6 = r6.f9421
            java.util.List r0 = r3.m2002()
            ᛳᛸᛲ r1 = r2.f538
            java.lang.String r1 = r1.f2563
            java.util.List r6 = r6.mo1625(r0, r1)
            return r6
        Lc2:
            android.app.Activity r6 = (android.app.Activity) r6
            ᛸᛱᛴᲁ r3 = (defpackage.C1419) r3
            android.app.AlertDialog r2 = (android.app.AlertDialog) r2
            ᛲᲈᛶᲈ r0 = defpackage.C1836.f8024
            r4 = -147867418664494(0xffff7983ef0961d2, double:NaN)
            java.lang.String r0 = "请卸载模块～"
            defpackage.C1836.m3231(r6, r0)
            ᲇᲁᲁᛲ r6 = defpackage.C2133.f9104
            r6.getClass()
            defpackage.C2133.m3551()
            java.lang.Object r6 = r3.f6211
            ᲇᛳᛸᛳ r6 = (defpackage.InterfaceC2023) r6
            if (r6 == 0) goto Le7
            defpackage.AbstractC1193.m2333(r6)
        Le7:
            r2.dismiss()
            com.tencent.mmkv.MMKV r6 = defpackage.AbstractC0902.m1871()
            r2 = -147897483435566(0xffff797cef0961d2, double:NaN)
            java.lang.String r0 = "disabled"
            r2 = 1
            r6.putBoolean(r0, r2)
            return r1
    }
}
