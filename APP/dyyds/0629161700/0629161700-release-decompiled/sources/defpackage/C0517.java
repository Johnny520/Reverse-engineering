package defpackage;

/* JADX INFO: renamed from: ᛳᛷᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0517 extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f2553;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2554;

    public /* synthetic */ C0517(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2553 = r1
            r0.f2554 = r2
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            int r5 = r4.f2553
            switch(r5) {
                case 0: goto L73;
                default: goto L5;
            }
        L5:
            if (r6 == 0) goto Lc
            java.lang.String r5 = r6.getAction()
            goto Ld
        Lc:
            r5 = 0
        Ld:
            r0 = -488445440335406(0xfffe43c2ef0961d2, double:NaN)
            java.lang.String r6 = "com.ss.android.ugc.awemes.ACTION_CANCEL_DOWNLOAD"
            boolean r5 = defpackage.AbstractC0498.m1280(r5, r6)
            if (r5 == 0) goto L72
            r5 = -488655893732910(0xfffe4391ef0961d2, double:NaN)
            java.lang.String r5 = "收到取消下载请求"
            r0 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r2 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r6 = defpackage.AbstractC0225.m818(r0, r5, r2)
            if (r6 != 0) goto L36
            goto L58
        L36:
            int r6 = r5.length()
            r0 = 0
        L3b:
            if (r0 >= r6) goto L58
            int r1 = r0 + 2000
            if (r1 <= r6) goto L42
            r1 = r6
        L42:
            java.lang.String r0 = r5.substring(r0, r1)
            r2 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1040(r0)
            r0 = r1
            goto L3b
        L58:
            ᲈᲈᲁᛶ r5 = defpackage.C2374.f10260
            r5 = 1
            defpackage.C2374.f10261 = r5
            java.lang.Object r4 = r4.f2554
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            r5 = 1001(0x3e9, float:1.403E-42)
            r4.cancel(r5)
            r4 = -488694548438574(0xfffe4388ef0961d2, double:NaN)
            java.lang.String r4 = "下载已取消"
            defpackage.AbstractC0209.m764(r4)
        L72:
            return
        L73:
            java.lang.Object r4 = r4.f2554
            ᛷᛳᲁᛵ r4 = (defpackage.AbstractC1246) r4
            r4.mo1945()
            return
    }
}
