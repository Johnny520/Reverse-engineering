package defpackage;

/* JADX INFO: renamed from: ᛷᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1239 extends defpackage.AbstractC0534 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1042 f5546;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1042 f5547;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f5548;

    public C1239(android.content.Context r3, defpackage.C1042 r4, defpackage.C1042 r5) {
            r2 = this;
            r0 = -248270869143086(0xffff1e32ef0961d2, double:NaN)
            r0 = -248305228881454(0xffff1e2aef0961d2, double:NaN)
            r0 = -248335293652526(0xffff1e23ef0961d2, double:NaN)
            ᲈᛴᛷᲁ r0 = new ᲈᛴᛷᲁ
            r1 = 0
            r0.<init>(r1)
            r2.<init>(r0)
            r2.f5548 = r3
            r2.f5547 = r4
            r2.f5546 = r5
            return
    }

    @Override // defpackage.AbstractC1191
    public final void onBindViewHolder(defpackage.AbstractC2316 r13, int r14) {
            r12 = this;
            ᛳᛸᲀᲁ r13 = (defpackage.C0531) r13
            r0 = -248404013129262(0xffff1e13ef0961d2, double:NaN)
            ᲇᛶᲇᲀ r12 = r12.f2652
            java.util.List r12 = r12.f8922
            java.lang.Object r12 = r12.get(r14)
            r0 = -248434077900334(0xffff1e0cef0961d2, double:NaN)
            ᛲᛳᲈᛴ r12 = (defpackage.C0273) r12
            android.widget.ImageView r14 = r13.f2642
            ᛷᛳᛴ r0 = r13.f2646
            android.widget.TextView r1 = r13.f2647
            r2 = -734001605549614(0xfffd646def0961d2, double:NaN)
            android.widget.TextView r2 = r13.f2641
            java.lang.String r3 = r12.m900()
            r2.setText(r3)
            android.widget.TextView r2 = r13.f2644
            java.lang.Boolean r3 = r12.m898()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r4)
            r4 = 45
            if (r3 == 0) goto L7e
            java.lang.String r3 = r12.m899()
            if (r3 == 0) goto L7e
            boolean r3 = defpackage.AbstractC1347.m2524(r3)
            if (r3 == 0) goto L50
            goto L7e
        L50:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r5 = r12.m904()
            r3.append(r5)
            r3.append(r4)
            long r4 = r12.m907()
            r3.append(r4)
            r4 = -734027375353390(0xfffd6467ef0961d2, double:NaN)
            java.lang.String r4 = "ms · 到点 "
            r3.append(r4)
            java.lang.String r4 = r12.m899()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto La4
        L7e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r5 = r12.m904()
            r3.append(r5)
            r3.append(r4)
            long r4 = r12.m907()
            r3.append(r4)
            r4 = -734066030059054(0xfffd645eef0961d2, double:NaN)
            java.lang.String r4 = "ms"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        La4:
            r2.setText(r3)
            android.widget.TextView r2 = r13.f2645
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List r4 = r12.m905()
            r5 = 0
            if (r4 == 0) goto Lbe
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto Lbf
        Lbe:
            r4 = r5
        Lbf:
            r3.append(r4)
            r4 = 26465(0x6761, float:3.7085E-41)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            java.util.List r2 = r12.m905()
            r3 = 1
            if (r2 == 0) goto Lf6
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 != r3) goto Lf6
            java.util.List r6 = r12.m905()
            r7 = -734078914960942(0xfffd645bef0961d2, double:NaN)
            java.lang.String r7 = "\n"
            r10 = 0
            r11 = 62
            r8 = 0
            r9 = 0
            java.lang.String r2 = defpackage.AbstractC1107.m2125(r6, r7, r8, r9, r10, r11)
            r1.setText(r2)
            goto L102
        Lf6:
            r6 = -734087504895534(0xfffd6459ef0961d2, double:NaN)
            java.lang.String r2 = "暂无消息"
            r1.setText(r2)
        L102:
            java.util.List r1 = defpackage.AbstractC2311.m3758()
            boolean r2 = r1.isEmpty()
            r4 = 0
            if (r2 == 0) goto L10f
            r2 = r4
            goto L137
        L10f:
            java.util.Iterator r1 = r1.iterator()
            r2 = r4
        L114:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L137
            java.lang.Object r6 = r1.next()
            ᲇᛸᛶᛸ r6 = (defpackage.C2105) r6
            java.lang.String r6 = r6.m3529()
            java.lang.String r7 = r12.m897()
            boolean r6 = defpackage.AbstractC0498.m1280(r6, r7)
            if (r6 == 0) goto L114
            int r2 = r2 + 1
            if (r2 < 0) goto L133
            goto L114
        L133:
            defpackage.AbstractC0425.m1199()
            throw r5
        L137:
            android.widget.TextView r1 = r13.f2649
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r2 = 20010(0x4e2a, float:2.804E-41)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.setText(r2)
            android.widget.TextView r1 = r13.f2650
            ᛸᛴᲀᛴ r2 = new ᛸᛴᲀᛴ
            r5 = 2
            r2.<init>(r5, r13)
            r1.setOnClickListener(r2)
            android.widget.ImageView r13 = r13.f2648
            ᲇᛳᛶ r1 = new ᲇᛳᛶ
            r1.<init>(r0, r12, r4)
            r13.setOnClickListener(r1)
            ᲇᛳᛶ r13 = new ᲇᛳᛶ
            r13.<init>(r0, r12, r3)
            r14.setOnClickListener(r13)
            java.lang.String r12 = r12.m897()
            r0 = -734108979732014(0xfffd6454ef0961d2, double:NaN)
            java.lang.String r13 = "default"
            boolean r12 = defpackage.AbstractC0498.m1280(r12, r13)
            if (r12 == 0) goto L183
            r12 = 8
            r14.setVisibility(r12)
            return
        L183:
            r14.setVisibility(r4)
            return
    }

    @Override // defpackage.AbstractC1191
    public final defpackage.AbstractC2316 onCreateViewHolder(android.view.ViewGroup r3, int r4) {
            r2 = this;
            r0 = -248373948358190(0xffff1e1aef0961d2, double:NaN)
            android.content.Context r4 = r2.f5548
            android.view.LayoutInflater r4 = defpackage.AbstractC1668.m3063(r4)
            r0 = 1712062575(0x660c006f, float:1.6528483E23)
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            ᛳᛸᲀᲁ r4 = new ᛳᛸᲀᲁ
            r4.<init>(r2, r3)
            return r4
    }
}
