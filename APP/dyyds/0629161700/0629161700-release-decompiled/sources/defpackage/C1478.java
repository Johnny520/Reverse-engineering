package defpackage;

/* JADX INFO: renamed from: ᛸᛴᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1478 extends defpackage.AbstractC0343 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C1478 f6557 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static android.app.Dialog f6558;

    static {
            ᛸᛴᲁᛳ r0 = new ᛸᛴᲁᛳ
            r0.<init>()
            defpackage.C1478.f6557 = r0
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public static final void m2679(defpackage.C1006 r17, android.widget.TextView r18, android.content.Context r19, android.widget.TextView r20, defpackage.C0682 r21, android.widget.TextView r22, com.android.app.CustomRecyclerView r23, com.android.app.CustomRecyclerView r24, android.widget.LinearLayout r25, int r26) {
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r26
            java.lang.Object r4 = r2.f3285
            r7 = r4
            ᛳᲁᛳᛴ r7 = (defpackage.C0554) r7
            r4 = r17
            r4.f4472 = r3
            r8 = 3
            r4 = 1711669487(0x660600ef, float:1.5820358E23)
            r5 = 1711800470(0x66080096, float:1.6056316E23)
            r6 = 1711669516(0x6606010c, float:1.582041E23)
            r9 = 1711800471(0x66080097, float:1.6056318E23)
            r10 = 0
            if (r3 != 0) goto L5f
            r0.setBackgroundResource(r9)
            android.content.res.Resources r3 = r19.getResources()
            int r3 = r3.getColor(r6, r10)
            r0.setTextColor(r3)
            r1.setBackgroundResource(r5)
            android.content.res.Resources r0 = r19.getResources()
            int r0 = r0.getColor(r4, r10)
            r1.setTextColor(r0)
            ᲀᛱᲈᛸ r0 = new ᲀᛱᲈᛸ
            r3 = r19
            r1 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r3 = -716478138981934(0xfffd745def0961d2, double:NaN)
            ᛲᛷᛶᛸ r1 = new ᛲᛷᛶᛸ
            r3 = 18
            r1.<init>(r2, r0, r10, r3)
            defpackage.AbstractC0397.m1149(r7, r10, r1, r8)
            return
        L5f:
            r1.setBackgroundResource(r9)
            android.content.res.Resources r3 = r19.getResources()
            int r3 = r3.getColor(r6, r10)
            r1.setTextColor(r3)
            r0.setBackgroundResource(r5)
            android.content.res.Resources r1 = r19.getResources()
            int r1 = r1.getColor(r4, r10)
            r0.setTextColor(r1)
            ᛱᲈᛶᲀ r11 = new ᛱᲈᛶᲀ
            r13 = r19
            r12 = r22
            r15 = r23
            r14 = r24
            r16 = r25
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = -716899045776942(0xfffd73fbef0961d2, double:NaN)
            ᛲᛷᛶᛸ r0 = new ᛲᛷᛶᛸ
            r1 = 19
            r0.<init>(r2, r11, r10, r1)
            defpackage.AbstractC0397.m1149(r7, r10, r0, r8)
            return
    }

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public static final void m2680(android.widget.LinearLayout r18, defpackage.C1006 r19, defpackage.C1419 r20, defpackage.C1419 r21, android.content.Context r22, defpackage.C1772 r23, defpackage.C1419 r24) {
            r7 = r22
            r8 = r23
            r0 = 5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = 14
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r18.removeAllViews()
            r5 = r19
            int r0 = r5.f4472
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            r11 = 0
            r1.<init>(r11, r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r6 = r20
            java.lang.Object r1 = r6.f6211
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = defpackage.AbstractC0575.m1369(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r1.next()
            ᛱᲀᛵᛴ r3 = (defpackage.C0163) r3
            java.lang.String r4 = r3.f1138
            int r3 = r3.f1139
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r12 = new kotlin.Pair
            r12.<init>(r4, r3)
            r2.add(r12)
            goto L37
        L54:
            java.util.ArrayList r0 = defpackage.AbstractC1107.m2115(r0, r2)
            java.util.Iterator r12 = r0.iterator()
            r14 = 0
        L5d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L165
            java.lang.Object r0 = r12.next()
            int r15 = r14 + 1
            if (r14 < 0) goto L15f
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.component1()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.component2()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = r21
            java.lang.Object r3 = r1.f6211
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r2)
            if (r2 == 0) goto L98
            boolean r4 = defpackage.AbstractC1347.m2524(r2)
            if (r4 == 0) goto L94
            r16 = -650614815497774(0xfffdb044ef0961d2, double:NaN)
            goto L9d
        L94:
            r4 = r2
        L95:
            r16 = r11
            goto La2
        L98:
            r16 = -650631995366958(0xfffdb040ef0961d2, double:NaN)
        L9d:
            java.lang.String r4 = "全部"
            goto L95
        La2:
            android.widget.TextView r11 = new android.widget.TextView
            r11.<init>(r7)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r4)
            r4 = 32
            r13.append(r4)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            r11.setText(r0)
            r0 = 17
            r11.setGravity(r0)
            r13 = 0
            r11.setIncludeFontPadding(r13)
            r0 = 28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r8.mo617(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r11.setMinHeight(r0)
            r11.setSingleLine()
            r0 = 2
            r4 = 1095761920(0x41500000, float:13.0)
            r11.setTextSize(r0, r4)
            java.lang.Object r0 = r8.mo617(r10)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r4 = r8.mo617(r9)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r17 = r8.mo617(r10)
            java.lang.Number r17 = (java.lang.Number) r17
            int r13 = r17.intValue()
            java.lang.Object r17 = r8.mo617(r9)
            java.lang.Number r17 = (java.lang.Number) r17
            int r1 = r17.intValue()
            r11.setPadding(r0, r4, r13, r1)
            if (r3 == 0) goto L111
            r0 = 1711800469(0x66080095, float:1.6056314E23)
            goto L114
        L111:
            r0 = 1711800470(0x66080096, float:1.6056316E23)
        L114:
            r11.setBackgroundResource(r0)
            if (r3 == 0) goto L11d
            r0 = 1711669380(0x66060084, float:1.5820166E23)
            goto L120
        L11d:
            r0 = 1711669487(0x660600ef, float:1.5820358E23)
        L120:
            int r0 = r7.getColor(r0)
            r11.setTextColor(r0)
            ᲀᛲᛶᛴ r0 = new ᲀᛲᛶᛴ
            r4 = r18
            r1 = r21
            r3 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.setOnClickListener(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            if (r14 <= 0) goto L14f
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r8.mo617(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.leftMargin = r1
        L14f:
            r4 = r18
            r4.addView(r11, r0)
            r5 = r19
            r6 = r20
            r7 = r22
            r14 = r15
            r11 = r16
            goto L5d
        L15f:
            r16 = r11
            defpackage.AbstractC0425.m1196()
            throw r16
        L165:
            return
    }

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public static final void m2681(android.widget.TextView r15, defpackage.C1419 r16, android.widget.TextView r17, android.widget.TextView r18, android.widget.TextView r19, defpackage.C1006 r20, android.content.Context r21) {
            r0 = r16
            r1 = -650644880268846(0xfffdb03def0961d2, double:NaN)
            java.lang.String r7 = "全部"
            java.lang.Object r1 = r0.f6211
            ᲀᛳᛱᲈ r1 = (defpackage.C1642) r1
            int r8 = r1.f7331
            r6 = 0
            r5 = r15
            r3 = r20
            r4 = r21
            m2683(r3, r4, r5, r6, r7, r8)
            r1 = -650657765170734(0xfffdb03aef0961d2, double:NaN)
            java.lang.String r13 = "视频"
            java.lang.Object r15 = r0.f6211
            ᲀᛳᛱᲈ r15 = (defpackage.C1642) r15
            int r14 = r15.f7332
            r12 = 1
            r11 = r17
            r9 = r20
            r10 = r21
            m2683(r9, r10, r11, r12, r13, r14)
            r1 = -650670650072622(0xfffdb037ef0961d2, double:NaN)
            java.lang.String r13 = "评论"
            java.lang.Object r15 = r0.f6211
            ᲀᛳᛱᲈ r15 = (defpackage.C1642) r15
            int r14 = r15.f7330
            r12 = 2
            r11 = r18
            m2683(r9, r10, r11, r12, r13, r14)
            r1 = -650683534974510(0xfffdb034ef0961d2, double:NaN)
            java.lang.String r4 = "主页"
            java.lang.Object r15 = r0.f6211
            ᲀᛳᛱᲈ r15 = (defpackage.C1642) r15
            int r5 = r15.f7329
            r3 = 3
            r2 = r19
            r0 = r20
            r1 = r21
            m2683(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static final native void m2682(defpackage.C0949 r0, android.content.Context r1, java.lang.String r2);

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public static final native void m2683(defpackage.C1006 r0, android.content.Context r1, android.widget.TextView r2, int r3, java.lang.String r4, int r5);

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public static native void m2684(android.content.Context r0, defpackage.InterfaceC1781 r1);

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public static final void m2685(defpackage.C1006 r16, defpackage.C0682 r17, defpackage.C1419 r18, defpackage.C1419 r19, defpackage.C1006 r20, defpackage.C1419 r21, android.widget.TextView r22, android.widget.TextView r23, android.widget.TextView r24, android.widget.TextView r25, android.content.Context r26, defpackage.C1006 r27, defpackage.C1419 r28, defpackage.C1419 r29, android.widget.LinearLayout r30, defpackage.C1772 r31) {
            r2 = r16
            r10 = r18
            int r0 = r2.f4472
            int r1 = r0 + 1
            r2.f4472 = r1
            java.lang.Object r0 = r10.f6211
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            r12 = r19
            java.lang.Object r0 = r12.f6211
            java.lang.String r0 = (java.lang.String) r0
            ᛶᛲᛲᛶ r0 = new ᛶᛲᛲᛶ
            r8 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = -716662822575662(0xfffd7432ef0961d2, double:NaN)
            r2 = -716697182314030(0xfffd742aef0961d2, double:NaN)
            r3 = r17
            java.lang.Object r2 = r3.f3285
            r13 = r2
            ᛳᲁᛳᛴ r13 = (defpackage.C0554) r13
            ᲁᲀᲇᛱ r2 = new ᲁᲀᲇᛱ
            r7 = 10
            r6 = 0
            r5 = r0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r11 = r6
            r14 = 3
            defpackage.AbstractC0397.m1149(r13, r11, r2, r14)
            java.lang.Object r0 = r10.f6211
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            int r15 = r8.f4472
            ᛶᛲᛲᛶ r0 = new ᛶᛲᛲᛶ
            r2 = r16
            r7 = r26
            r3 = r27
            r4 = r28
            r6 = r29
            r8 = r30
            r9 = r31
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = -716735837019694(0xfffd7421ef0961d2, double:NaN)
            r1 = -716770196758062(0xfffd7419ef0961d2, double:NaN)
            ᛸᛷᛱᛵ r1 = new ᛸᛷᛱᛵ
            r2 = 0
            r19 = r17
            r22 = r0
            r18 = r1
            r23 = r2
            r20 = r10
            r21 = r15
            r18.<init>(r19, r20, r21, r22, r23)
            r0 = r18
            defpackage.AbstractC0397.m1149(r13, r11, r0, r14)
            return
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public static native void m2686(android.content.Context r0);

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public static final native void m2687(android.content.Context r0, com.android.app.CustomRecyclerView r1, android.widget.LinearLayout r2, android.widget.LinearLayout r3, defpackage.InterfaceC1781 r4);

    @Override // defpackage.AbstractC0343
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final native void mo1028();
}
