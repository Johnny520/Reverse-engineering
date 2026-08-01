package defpackage;

/* JADX INFO: renamed from: ᲀᲀᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1738 extends defpackage.AbstractC1191 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC0598 f7697;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f7698;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.List f7699;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7700;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f7701;

    public C1738(android.content.Context r3, java.util.List r4, int r5, defpackage.C1772 r6) {
            r2 = this;
            r0 = 0
            r2.f7700 = r0
            r0 = -1015274718797358(0xfffc649cef0961d2, double:NaN)
            r0 = -1015309078535726(0xfffc6494ef0961d2, double:NaN)
            r2.<init>()
            r2.f7701 = r3
            r2.f7699 = r4
            r2.f7698 = r5
            r2.f7697 = r6
            return
    }

    public C1738(android.content.Context r3, java.util.List r4, int r5, defpackage.C1772 r6, byte r7) {
            r2 = this;
            r7 = 1
            r2.f7700 = r7
            r0 = -695200870997550(0xfffd87b7ef0961d2, double:NaN)
            r0 = -695235230735918(0xfffd87afef0961d2, double:NaN)
            r2.<init>()
            r2.f7701 = r3
            r2.f7699 = r4
            r2.f7698 = r5
            r2.f7697 = r6
            return
    }

    @Override // defpackage.AbstractC1191
    public final int getItemCount() {
            r1 = this;
            int r0 = r1.f7700
            java.util.List r1 = r1.f7699
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            int r1 = r1.size()
            return r1
        Lc:
            int r1 = r1.size()
            return r1
    }

    @Override // defpackage.AbstractC1191
    public final void onBindViewHolder(defpackage.AbstractC2316 r13, int r14) {
            r12 = this;
            int r0 = r12.f7700
            r1 = 37
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r4 = r12.f7698
            java.util.List r5 = r12.f7699
            r6 = 0
            switch(r0) {
                case 0: goto Le4;
                default: goto Le;
            }
        Le:
            ᲁᛳᲁ r13 = (defpackage.C1837) r13
            r7 = -695308245179950(0xfffd879eef0961d2, double:NaN)
            android.widget.ImageView r0 = r13.f8025
            java.lang.Object r14 = r5.get(r14)
            ᛲᛸᛲᛵ r14 = (defpackage.C0332) r14
            android.widget.TextView r5 = r13.f8026
            java.lang.String r7 = r14.f1717
            java.lang.String r8 = r14.f1715
            int r9 = r14.f1714
            if (r7 == 0) goto L2b
            goto L34
        L2b:
            r10 = -695338309951022(0xfffd8797ef0961d2, double:NaN)
            java.lang.String r7 = "未知用户"
        L34:
            r5.setText(r7)
            android.widget.TextView r5 = r13.f8027
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r10 = -695359784787502(0xfffd8792ef0961d2, double:NaN)
            java.lang.String r10 = "UID: "
            r7.<init>(r10)
            java.lang.String r10 = r14.f1716
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r5.setText(r7)
            android.widget.TextView r5 = r13.f8028
            java.lang.String r7 = java.lang.String.valueOf(r9)
            r5.setText(r7)
            if (r4 <= 0) goto L64
            double r9 = (double) r9
            double r9 = r9 * r2
            double r2 = (double) r4
            double r9 = r9 / r2
            int r2 = (int) r9
            goto L65
        L64:
            r2 = r6
        L65:
            android.widget.TextView r3 = r13.f8031
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.setText(r1)
            android.widget.ProgressBar r1 = r13.f8030
            r1.setProgress(r2)
            if (r8 == 0) goto Lc5
            int r1 = r8.length()
            if (r1 != 0) goto L87
            goto Lc5
        L87:
            android.content.Context r1 = r12.f7701     // Catch: java.lang.Exception -> La3
            ᲈᛲᛵᲀ r1 = com.bumptech.glide.ComponentCallbacks2C0007.m234(r1)     // Catch: java.lang.Exception -> La3
            ᲀᛷᛴᲀ r1 = r1.m3586(r8)     // Catch: java.lang.Exception -> La3
            ᲇᛴᛸᲇ r1 = r1.m3446()     // Catch: java.lang.Exception -> La3
            ᲀᛷᛴᲀ r1 = (defpackage.C1706) r1     // Catch: java.lang.Exception -> La3
            ᛸᛶᛵᛲ r2 = defpackage.C1506.f6658     // Catch: java.lang.Exception -> La3
            ᲇᛴᛸᲇ r1 = r1.m3439(r2)     // Catch: java.lang.Exception -> La3
            ᲀᛷᛴᲀ r1 = (defpackage.C1706) r1     // Catch: java.lang.Exception -> La3
            r1.m3097(r0)     // Catch: java.lang.Exception -> La3
            goto Lc5
        La3:
            r1 = move-exception
            r2 = -695385554591278(0xfffd878cef0961d2, double:NaN)
            java.lang.String r2 = "加载用户头像失败"
            r3 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r3 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r2, r1)
        Lc5:
            ᲈᛶᲇ r1 = new ᲈᛶᲇ
            r1.<init>(r12, r14, r6)
            r0.setOnClickListener(r1)
            android.view.View r0 = r13.f9791
            ᲈᛶᲇ r1 = new ᲈᛶᲇ
            r2 = 1
            r1.<init>(r12, r14, r2)
            r0.setOnClickListener(r1)
            android.widget.TextView r13 = r13.f8029
            ᲈᛶᲇ r0 = new ᲈᛶᲇ
            r1 = 2
            r0.<init>(r12, r14, r1)
            r13.setOnClickListener(r0)
            return
        Le4:
            ᛷᛱᛸᛷ r13 = (defpackage.C1210) r13
            r7 = -1015382092979758(0xfffc6483ef0961d2, double:NaN)
            java.lang.Object r14 = r5.get(r14)
            ᛱᲀᛵᛴ r14 = (defpackage.C0163) r14
            android.widget.TextView r0 = r13.f5452
            java.lang.String r5 = r14.f1138
            r0.setText(r5)
            android.widget.TextView r0 = r13.f5453
            int r5 = r14.f1139
            java.lang.String r7 = java.lang.String.valueOf(r5)
            r0.setText(r7)
            if (r4 <= 0) goto L10d
            double r5 = (double) r5
            double r5 = r5 * r2
            double r2 = (double) r4
            double r5 = r5 / r2
            int r6 = (int) r5
        L10d:
            android.widget.TextView r0 = r13.f5454
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.setText(r1)
            android.widget.ProgressBar r0 = r13.f5455
            r0.setProgress(r6)
            android.widget.TextView r13 = r13.f5456
            ᛳᛲᛶᛶ r0 = new ᛳᛲᛶᛶ
            r1 = 3
            r0.<init>(r12, r1, r14)
            r13.setOnClickListener(r0)
            return
    }

    @Override // defpackage.AbstractC1191
    public final defpackage.AbstractC2316 onCreateViewHolder(android.view.ViewGroup r4, int r5) {
            r3 = this;
            int r5 = r3.f7700
            r0 = 0
            android.content.Context r3 = r3.f7701
            switch(r5) {
                case 0: goto L21;
                default: goto L8;
            }
        L8:
            r1 = -695278180408878(0xfffd87a5ef0961d2, double:NaN)
            android.view.LayoutInflater r3 = defpackage.AbstractC1668.m3063(r3)
            r5 = 1712062624(0x660c00a0, float:1.6528571E23)
            android.view.View r3 = r3.inflate(r5, r4, r0)
            ᲁᛳᲁ r4 = new ᲁᛳᲁ
            r4.<init>(r3)
            return r4
        L21:
            r1 = -1015352028208686(0xfffc648aef0961d2, double:NaN)
            android.view.LayoutInflater r3 = defpackage.AbstractC1668.m3063(r3)
            r5 = 1712062632(0x660c00a8, float:1.6528585E23)
            android.view.View r3 = r3.inflate(r5, r4, r0)
            ᛷᛱᛸᛷ r4 = new ᛷᛱᛸᛷ
            r4.<init>(r3)
            return r4
    }
}
