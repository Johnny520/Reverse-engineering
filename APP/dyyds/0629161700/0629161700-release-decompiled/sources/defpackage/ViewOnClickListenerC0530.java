package defpackage;

/* JADX INFO: renamed from: ᛳᛸᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0530 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2637;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2638;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2639;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2640;

    public /* synthetic */ ViewOnClickListenerC0530(int r2, defpackage.C1006 r3, java.util.List r4) {
            r1 = this;
            r0 = 1
            r1.f2639 = r0
            r1.<init>()
            r1.f2637 = r3
            r1.f2638 = r2
            r1.f2640 = r4
            return
    }

    public /* synthetic */ ViewOnClickListenerC0530(int r2, defpackage.C1474 r3, defpackage.C1322 r4) {
            r1 = this;
            r0 = 0
            r1.f2639 = r0
            r1.<init>()
            r1.f2638 = r2
            r1.f2637 = r3
            r1.f2640 = r4
            return
    }

    public /* synthetic */ ViewOnClickListenerC0530(defpackage.C1419 r1, defpackage.C1730 r2, android.content.Context r3, int r4) {
            r0 = this;
            r3 = 2
            r0.f2639 = r3
            r0.<init>()
            r0.f2637 = r1
            r0.f2640 = r2
            r0.f2638 = r4
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r8) {
            r7 = this;
            int r0 = r7.f2639
            r1 = 0
            r2 = 0
            int r3 = r7.f2638
            java.lang.Object r4 = r7.f2640
            java.lang.Object r7 = r7.f2637
            switch(r0) {
                case 0: goto L68;
                case 1: goto L23;
                default: goto Ld;
            }
        Ld:
            ᛸᛱᛴᲁ r7 = (defpackage.C1419) r7
            ᲀᲀᛱᛱ r4 = (defpackage.C1730) r4
            java.lang.Object r8 = r8.getTag()
            boolean r0 = r8 instanceof defpackage.C1940
            if (r0 == 0) goto L1c
            r2 = r8
            ᲁᲇᛳᛴ r2 = (defpackage.C1940) r2
        L1c:
            if (r2 != 0) goto L1f
            goto L22
        L1f:
            defpackage.C1884.m3298(r7, r4, r3, r2)
        L22:
            return
        L23:
            ᛶᛱᛵᛳ r7 = (defpackage.C1006) r7
            java.util.List r4 = (java.util.List) r4
            r7.f4472 = r3
            java.util.Iterator r8 = r4.iterator()
        L2d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r8.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L63
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r4 = r7.f4472
            if (r1 != r4) goto L52
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            r1 = 1711800431(0x6608006f, float:1.6056246E23)
            r0.setBackgroundResource(r1)
            r1 = 1090519040(0x41000000, float:8.0)
            r0.setElevation(r1)
            goto L61
        L52:
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r1)
            r1 = 1711800432(0x66080070, float:1.6056248E23)
            r0.setBackgroundResource(r1)
            r1 = 0
            r0.setElevation(r1)
        L61:
            r1 = r3
            goto L2d
        L63:
            defpackage.AbstractC0425.m1196()
            throw r2
        L67:
            return
        L68:
            ᛸᛴᛵᛶ r7 = (defpackage.C1474) r7
            ᛷᛷᲈᲇ r4 = (defpackage.C1322) r4
            java.util.ArrayList r8 = r4.f5847
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r5 = -140003333545518(0xffff80aaef0961d2, double:NaN)
            java.lang.String r2 = "播放按钮点击 position="
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r2 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r2 = r0.length()
            if (r2 != 0) goto L9a
            goto Lbb
        L9a:
            int r2 = r0.length()
        L9e:
            if (r1 >= r2) goto Lbb
            int r3 = r1 + 2000
            if (r3 <= r2) goto La5
            r3 = r2
        La5:
            java.lang.String r1 = r0.substring(r1, r3)
            r5 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r5 = defpackage.C0346.f1773
            r5.getClass()
            defpackage.C0346.m1040(r1)
            r1 = r3
            goto L9e
        Lbb:
            int r7 = r7.m3783()
            r0 = -1
            if (r7 == r0) goto Ld9
            int r0 = r8.size()
            if (r7 >= r0) goto Ld9
            ᲇᛴᲇᛳ r0 = r4.f5846
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r8.get(r7)
            ᛵᛳᲈᲁ r7 = (defpackage.C0860) r7
            java.io.File r7 = r7.f3915
            r0.mo388(r1, r7)
        Ld9:
            return
    }
}
