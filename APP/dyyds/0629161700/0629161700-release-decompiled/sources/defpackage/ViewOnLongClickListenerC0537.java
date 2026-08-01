package defpackage;

/* JADX INFO: renamed from: ᛳᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0537 implements android.view.View.OnLongClickListener {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2654;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f2655;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2656;

    public /* synthetic */ ViewOnLongClickListenerC0537(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f2655 = r2
            r0.f2656 = r1
            r0.f2654 = r3
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r9) {
            r8 = this;
            int r9 = r8.f2655
            r0 = 0
            r1 = 0
            java.lang.Object r2 = r8.f2654
            java.lang.Object r8 = r8.f2656
            r3 = 1
            switch(r9) {
                case 0: goto Lb3;
                case 1: goto L3e;
                case 2: goto L30;
                case 3: goto L25;
                case 4: goto L16;
                default: goto Lc;
            }
        Lc:
            ᛶᛸᲀᛸ r8 = (defpackage.C1131) r8
            ᛷᛶᛷᛲ r2 = (defpackage.C1294) r2
            ᲀᛶᛲᛸ r8 = r8.f5028
            r8.mo617(r2)
            return r3
        L16:
            ᛸᛱᛴᲁ r8 = (defpackage.C1419) r8
            android.app.Dialog r2 = (android.app.Dialog) r2
            java.util.concurrent.atomic.AtomicLong r9 = defpackage.AbstractC2171.f9245
            java.lang.Object r8 = r8.f6211
            defpackage.AbstractC2171.m3570(r8)
            r2.dismiss()
            return r3
        L25:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.ss.android.ugc.aweme.feed.model.Aweme) r8
            android.app.Dialog r2 = (android.app.Dialog) r2
            defpackage.AbstractC2171.m3570(r8)
            r2.dismiss()
            return r3
        L30:
            ᲇᛸᛶᛸ r8 = (defpackage.C2105) r8
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r8 = r8.m3526()
            ᛷᲈᲀ r9 = defpackage.C1403.f6102
            r9.m2569(r2, r8, r1)
            return r3
        L3e:
            ᲀᲀᛵᛸ r8 = (defpackage.C1741) r8
            com.bytedance.im.core.model.Message r2 = (com.bytedance.im.core.model.Message) r2
            ᛷᲈᛳᛳ r9 = defpackage.AbstractC1140.m2170()
            ᛵᛵᲁᛲ r4 = new ᛵᛵᲁᛲ
            r4.<init>(r2, r1, r3)
            r2 = 3
            defpackage.AbstractC0397.m1149(r9, r1, r4, r2)
            java.lang.Object r8 = r8.f7705
            r1 = -642978363645486(0xfffdb736ef0961d2, double:NaN)
            java.lang.String r9 = "dismiss"
            java.lang.Object[] r1 = new java.lang.Object[r0]
            if (r8 == 0) goto Lb2
            int r2 = defpackage.AbstractC0233.f1405     // Catch: java.lang.Exception -> L90
            ᛶᲈᛱᲈ r8 = defpackage.AbstractC2279.m3695(r8)     // Catch: java.lang.Exception -> L90
            java.lang.Object r2 = r8.f5356     // Catch: java.lang.Exception -> L90
            ᛷᲇᛱᲈ r2 = (defpackage.C1380) r2     // Catch: java.lang.Exception -> L90
            r4 = 2
            r2.f6021 = r4     // Catch: java.lang.Exception -> L90
            ᛶᛶᛲᛱ r8 = r8.m2298()     // Catch: java.lang.Exception -> L90
            r8.m1954()     // Catch: java.lang.Exception -> L90
            r8.f4431 = r9     // Catch: java.lang.Exception -> L90
            r4 = -560480631823918(0xfffe023eef0961d2, double:NaN)
            java.util.List r8 = r8.mo1885()     // Catch: java.lang.Exception -> L90
            java.lang.Object r8 = defpackage.AbstractC1107.m2124(r8)     // Catch: java.lang.Exception -> L90
            ᛱᲁᛲᲁ r8 = (defpackage.C0178) r8     // Catch: java.lang.Exception -> L90
            if (r8 == 0) goto Lb2
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Exception -> L90
            r8.m713(r9)     // Catch: java.lang.Exception -> L90
            goto Lb2
        L90:
            r8 = move-exception
            r0 = -643012723383854(0xfffdb72eef0961d2, double:NaN)
            java.lang.String r9 = "callMethod error"
            r0 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r0 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1038(r9, r8)
        Lb2:
            return r3
        Lb3:
            java.lang.String r8 = (java.lang.String) r8
            ᲀᛲᛶᲈ r2 = (defpackage.C1630) r2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r4 = -86612595088942(0xffffb139ef0961d2, double:NaN)
            java.lang.String r4 = "长按目录: "
            r9.<init>(r4)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r4 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r4 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r4 = r9.length()
            if (r4 != 0) goto Le3
            goto L104
        Le3:
            int r4 = r9.length()
        Le7:
            if (r0 >= r4) goto L104
            int r5 = r0 + 2000
            if (r5 <= r4) goto Lee
            r5 = r4
        Lee:
            java.lang.String r0 = r9.substring(r0, r5)
            r6 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r6 = defpackage.C0346.f1773
            r6.getClass()
            defpackage.C0346.m1040(r0)
            r0 = r5
            goto Le7
        L104:
            ᛷᲈᲀ r9 = defpackage.C1403.f6102
            android.widget.TextView r0 = r2.f7248
            android.content.Context r0 = r0.getContext()
            r4 = -86642659860014(0xffffb132ef0961d2, double:NaN)
            r9.m2569(r0, r8, r1)
            return r3
    }
}
