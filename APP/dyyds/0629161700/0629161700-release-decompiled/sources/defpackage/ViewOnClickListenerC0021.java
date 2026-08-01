package defpackage;

/* JADX INFO: renamed from: ᛱᛱᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0021 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f458;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f459;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f460;

    public /* synthetic */ ViewOnClickListenerC0021(android.content.Context r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f460 = r3
            r0.f459 = r1
            r0.f458 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r12) {
            r11 = this;
            int r12 = r11.f460
            r0 = 3
            r1 = 0
            java.lang.String r2 = r11.f458
            android.content.Context r3 = r11.f459
            switch(r12) {
                case 0: goto L7f;
                case 1: goto L27;
                case 2: goto L19;
                default: goto Lb;
            }
        Lb:
            ᛷᲈᛳᛳ r11 = defpackage.AbstractC1140.m2170()
            ᛴᛳᛵᛷ r12 = new ᛴᛳᛵᛷ
            r4 = 1
            r12.<init>(r3, r2, r1, r4)
            defpackage.AbstractC0397.m1149(r11, r1, r12, r0)
            return
        L19:
            ᛷᲈᲀ r5 = defpackage.C1403.f6102
            r9 = 0
            r10 = 58
            android.content.Context r6 = r11.f459
            r7 = 0
            java.lang.String r8 = r11.f458
            defpackage.C1403.m2568(r5, r6, r7, r8, r9, r10)
            return
        L27:
            r11 = -653196090842670(0xfffdadebef0961d2, double:NaN)
            java.lang.String r11 = "clipboard"     // Catch: java.lang.Exception -> L60
            java.lang.Object r11 = r3.getSystemService(r11)     // Catch: java.lang.Exception -> L60
            r0 = -653239040515630(0xfffdade1ef0961d2, double:NaN)
            android.content.ClipboardManager r11 = (android.content.ClipboardManager) r11     // Catch: java.lang.Exception -> L60
            r0 = -653539688226350(0xfffdad9bef0961d2, double:NaN)
            java.lang.String r12 = "JSON"     // Catch: java.lang.Exception -> L60
            android.content.ClipData r12 = android.content.ClipData.newPlainText(r12, r2)     // Catch: java.lang.Exception -> L60
            r11.setPrimaryClip(r12)     // Catch: java.lang.Exception -> L60
            r11 = -653561163062830(0xfffdad96ef0961d2, double:NaN)
            java.lang.String r11 = "已复制到剪贴板"     // Catch: java.lang.Exception -> L60
            defpackage.AbstractC0209.m764(r11)     // Catch: java.lang.Exception -> L60
            ᛶᛸᛱᲀ r11 = defpackage.C1121.f5003     // Catch: java.lang.Exception -> L60
            defpackage.C1121.m2134(r3)     // Catch: java.lang.Exception -> L60
            goto L7e
        L60:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r0 = -653595522801198(0xfffdad8eef0961d2, double:NaN)
            java.lang.String r0 = "复制失败: "
            r12.<init>(r0)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            defpackage.AbstractC0209.m764(r11)
        L7e:
            return
        L7f:
            ᛷᲈᛳᛳ r11 = defpackage.AbstractC1140.m2170()
            ᛴᛴᛷ r12 = new ᛴᛴᛷ
            r4 = 2
            r12.<init>(r3, r2, r1, r4)
            defpackage.AbstractC0397.m1149(r11, r1, r12, r0)
            return
    }
}
