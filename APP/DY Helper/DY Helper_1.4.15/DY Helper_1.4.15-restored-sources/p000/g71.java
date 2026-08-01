package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g71 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4265;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f4266;

    public /* synthetic */ g71(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f4265 = r2
            r0.f4266 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ g71(java.lang.String[] r1, android.app.Activity r2) {
            r0 = this;
            r1 = 23
            r0.f4265 = r1
            r0.<init>()
            r0.f4266 = r2
            return
    }

    /* JADX INFO: renamed from: β */
    private final java.lang.Object m2264(java.lang.Object r34) {
            r33 = this;
            r1 = r34
            a80 r1 = (p000.a80) r1
            r1.getClass()
            java.lang.String r0 = "info_bar_text_format"
            java.lang.String r2 = "{time}     {location}"
            java.lang.String r8 = p000.ui1.m5893(r0, r2)
            um1 r10 = new um1
            r10.<init>()
            r0 = 0
            r2 = r0
        L16:
            int r3 = r8.length()
            r4 = 125(0x7d, float:1.75E-43)
            r5 = 123(0x7b, float:1.72E-43)
            r6 = 4
            java.lang.String r7 = "createTime:"
            java.lang.String r9 = "time:"
            java.lang.String r11 = "yyyy-MM-dd HH:mm"
            r12 = 0
            if (r2 >= r3) goto L5a
            int r2 = p000.q02.m4668(r8, r5, r2, r6)
            if (r2 < 0) goto L5a
            int r2 = r2 + 1
            int r3 = p000.q02.m4668(r8, r4, r2, r6)
            if (r3 < 0) goto L5a
            java.lang.String r2 = r8.substring(r2, r3)
            boolean r13 = p000.x02.m6485(r2, r9, r0)
            if (r13 != 0) goto L4a
            boolean r13 = p000.x02.m6485(r2, r7, r0)
            if (r13 == 0) goto L47
            goto L4a
        L47:
            int r2 = r3 + 1
            goto L16
        L4a:
            r3 = 58
            java.lang.String r2 = p000.q02.m4685(r2, r3, r2)
            boolean r3 = p000.q02.m4671(r2)
            if (r3 != 0) goto L57
            goto L58
        L57:
            r2 = r12
        L58:
            if (r2 != 0) goto L5b
        L5a:
            r2 = r11
        L5b:
            r10.f10912 = r2
            um1 r14 = new um1
            r14.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r8.length()
            r2.<init>(r3)
            r3 = r0
        L6c:
            int r13 = r8.length()
            java.lang.String r15 = "{time}"
            if (r3 >= r13) goto Lc6
            int r13 = p000.q02.m4668(r8, r5, r3, r6)
            if (r13 >= 0) goto L82
            int r4 = r8.length()
            r2.append(r8, r3, r4)
            goto Lc6
        L82:
            r2.append(r8, r3, r13)
            int r3 = r13 + 1
            int r5 = p000.q02.m4668(r8, r4, r3, r6)
            if (r5 >= 0) goto L95
            int r3 = r8.length()
            r2.append(r8, r13, r3)
            goto Lc6
        L95:
            java.lang.String r3 = r8.substring(r3, r5)
            java.lang.String r4 = "time"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto Lbc
            java.lang.String r4 = "createTime"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto Lbc
            boolean r4 = p000.x02.m6485(r3, r9, r0)
            if (r4 != 0) goto Lbc
            boolean r3 = p000.x02.m6485(r3, r7, r0)
            if (r3 == 0) goto Lb6
            goto Lbc
        Lb6:
            int r3 = r5 + 1
            r2.append(r8, r13, r3)
            goto Lbf
        Lbc:
            r2.append(r15)
        Lbf:
            int r3 = r5 + 1
            r4 = 125(0x7d, float:1.75E-43)
            r5 = 123(0x7b, float:1.72E-43)
            goto L6c
        Lc6:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "{loc}"
            java.lang.String r4 = "{location}"
            java.lang.String r2 = p000.x02.m6483(r2, r3, r4)
            java.lang.String r5 = "{awemeId}"
            java.lang.String r7 = "{id}"
            java.lang.String r2 = p000.x02.m6483(r2, r5, r7)
            r9 = 6
            int r13 = p000.q02.m4669(r2, r15, r0, r0, r9)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            if (r13 < 0) goto Le6
            goto Le7
        Le6:
            r15 = r12
        Le7:
            if (r15 == 0) goto L133
            int r13 = r15.intValue()
            int r13 = r13 + r9
            int r9 = p000.q02.m4669(r2, r4, r13, r0, r6)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            if (r9 < 0) goto Lf9
            goto Lfa
        Lf9:
            r15 = r12
        Lfa:
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == 0) goto L104
            int r15 = r15.intValue()
            goto L105
        L104:
            r15 = r9
        L105:
            int r16 = p000.q02.m4669(r2, r7, r13, r0, r6)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r16)
            if (r16 < 0) goto L110
            goto L112
        L110:
            r17 = r12
        L112:
            if (r17 == 0) goto L11b
            int r16 = r17.intValue()
            r6 = r16
            goto L11c
        L11b:
            r6 = r9
        L11c:
            int r6 = java.lang.Math.min(r15, r6)
            if (r6 == r9) goto L133
            if (r6 > r13) goto L125
            goto L133
        L125:
            java.lang.String r2 = r2.substring(r13, r6)
            int r6 = r2.length()
            if (r6 <= 0) goto L130
            goto L131
        L130:
            r2 = r12
        L131:
            if (r2 != 0) goto L135
        L133:
            java.lang.String r2 = "     "
        L135:
            r14.f10912 = r2
            qm1 r15 = new qm1
            r15.<init>()
            boolean r2 = p000.q02.m4654(r8, r4, r0)
            if (r2 != 0) goto L14b
            boolean r2 = p000.q02.m4654(r8, r3, r0)
            if (r2 == 0) goto L149
            goto L14b
        L149:
            r2 = r0
            goto L14c
        L14b:
            r2 = 1
        L14c:
            r15.f9050 = r2
            qm1 r6 = new qm1
            r6.<init>()
            boolean r2 = p000.q02.m4654(r8, r7, r0)
            if (r2 != 0) goto L162
            boolean r2 = p000.q02.m4654(r8, r5, r0)
            if (r2 == 0) goto L160
            goto L162
        L160:
            r2 = r0
            goto L163
        L162:
            r2 = 1
        L163:
            r6.f9050 = r2
            x01 r2 = p000.x01.f11964
            r3 = r33
            android.app.Activity r3 = r3.f4266
            android.view.LayoutInflater r2 = r2.m6477(r3)
            r5 = 2131492909(0x7f0c002d, float:1.8609283E38)
            android.view.View r2 = r2.inflate(r5, r12, r0)
            r2.getClass()
            xx r5 = p000.jx0.m3049(r3)
            java.lang.String r7 = r5.f12348
            java.lang.String r9 = r5.f12355
            java.lang.String r12 = r5.f12352
            r13 = 2131296761(0x7f0901f9, float:1.8211448E38)
            android.view.View r13 = r2.findViewById(r13)
            android.widget.ScrollView r13 = (android.widget.ScrollView) r13
            r4 = 2
            if (r13 == 0) goto L199
            r13.setBackgroundColor(r0)
            r0 = 1
            r13.setVerticalScrollBarEnabled(r0)
            r13.setOverScrollMode(r4)
        L199:
            r0 = 2131296760(0x7f0901f8, float:1.8211446E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L1ad
            java.lang.String r13 = r5.f12351
            r4 = 14
            android.graphics.drawable.GradientDrawable r4 = p000.jx0.m3062(r4, r3, r13)
            r0.setBackground(r4)
        L1ad:
            r0 = 2131296664(0x7f090198, float:1.8211251E38)
            android.view.View r0 = r2.findViewById(r0)
            r4 = 12
            if (r0 == 0) goto L1bf
            android.graphics.drawable.GradientDrawable r13 = p000.jx0.m3062(r4, r3, r12)
            r0.setBackground(r13)
        L1bf:
            r0 = 2131296654(0x7f09018e, float:1.821123E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13 = 2131296652(0x7f09018c, float:1.8211227E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r17 = 2131296653(0x7f09018d, float:1.8211229E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r13, r4}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L1e0:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L204
            java.lang.Object r4 = r0.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            android.view.View r4 = r2.findViewById(r4)
            r17 = r0
            r13 = 12
            if (r4 == 0) goto L201
            android.graphics.drawable.GradientDrawable r0 = p000.jx0.m3062(r13, r3, r12)
            r4.setBackground(r0)
        L201:
            r0 = r17
            goto L1e0
        L204:
            r0 = 2131296665(0x7f090199, float:1.8211253E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4 = 99
            if (r0 == 0) goto L223
            java.lang.String r13 = r5.f12358
            int r13 = android.graphics.Color.parseColor(r13)
            r0.setTextColor(r13)
            java.lang.String r13 = r5.f12359
            android.graphics.drawable.GradientDrawable r13 = p000.jx0.m3062(r4, r3, r13)
            r0.setBackground(r13)
        L223:
            r0 = 2131296681(0x7f0901a9, float:1.8211286E38)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            r0 = 2131296676(0x7f0901a4, float:1.8211275E38)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
            r0 = 2131296668(0x7f09019c, float:1.821126E38)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r0)
            r0 = 2131296669(0x7f09019d, float:1.8211261E38)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r0)
            r0 = 2131296678(0x7f0901a6, float:1.821128E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r0)
            r0 = 2131296674(0x7f0901a2, float:1.8211271E38)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r0)
            r0 = 2131296672(0x7f0901a0, float:1.8211267E38)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r21, r22, r23, r24, r25, r26, r27}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L260:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L282
            java.lang.Object r13 = r0.next()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            android.view.View r13 = r2.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L27f
            int r4 = android.graphics.Color.parseColor(r9)
            r13.setTextColor(r4)
        L27f:
            r4 = 99
            goto L260
        L282:
            r0 = 2131296666(0x7f09019a, float:1.8211255E38)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            r4 = 2131296680(0x7f0901a8, float:1.8211284E38)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r4)
            r13 = 2131296667(0x7f09019b, float:1.8211257E38)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r13)
            r13 = 2131296677(0x7f0901a5, float:1.8211277E38)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r13)
            r13 = 2131296673(0x7f0901a1, float:1.821127E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r13)
            r13 = 2131296671(0x7f09019f, float:1.8211265E38)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r13)
            java.lang.Integer[] r13 = new java.lang.Integer[]{r21, r22, r23, r24, r25, r26}
            java.util.List r13 = p000.AbstractC1021yh.m6897(r13)
            java.util.Iterator r13 = r13.iterator()
        L2b8:
            boolean r18 = r13.hasNext()
            if (r18 == 0) goto L2e0
            java.lang.Object r18 = r13.next()
            java.lang.Number r18 = (java.lang.Number) r18
            int r4 = r18.intValue()
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L2d9
            java.lang.String r0 = r5.f12356
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setTextColor(r0)
        L2d9:
            r0 = 2131296666(0x7f09019a, float:1.8211255E38)
            r4 = 2131296680(0x7f0901a8, float:1.8211284E38)
            goto L2b8
        L2e0:
            r0 = 2131296675(0x7f0901a3, float:1.8211273E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r21 = 2131296679(0x7f0901a7, float:1.8211281E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r21)
            java.lang.Integer[] r4 = new java.lang.Integer[]{r4, r13}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            java.util.Iterator r4 = r4.iterator()
        L2fa:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L31f
            java.lang.Object r13 = r4.next()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            android.view.View r13 = r2.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L31b
            java.lang.String r0 = r5.f12360
            int r0 = android.graphics.Color.parseColor(r0)
            r13.setTextColor(r0)
        L31b:
            r0 = 2131296675(0x7f0901a3, float:1.8211273E38)
            goto L2fa
        L31f:
            r0 = 2131296670(0x7f09019e, float:1.8211263E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L333
            java.lang.String r4 = r5.f12349
            int r4 = android.graphics.Color.parseColor(r4)
            r0.setTextColor(r4)
        L333:
            r0 = 2131296656(0x7f090190, float:1.8211235E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 2131296657(0x7f090191, float:1.8211237E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r4}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L34d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L36d
            java.lang.Object r4 = r0.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            android.view.View r4 = r2.findViewById(r4)
            if (r4 == 0) goto L34d
            java.lang.String r13 = r5.f12353
            int r13 = android.graphics.Color.parseColor(r13)
            r4.setBackgroundColor(r13)
            goto L34d
        L36d:
            r0 = 2131296658(0x7f090192, float:1.8211239E38)
            android.view.View r4 = r2.findViewById(r0)
            android.widget.EditText r4 = (android.widget.EditText) r4
            r13 = 10
            if (r4 == 0) goto L3a5
            int r9 = android.graphics.Color.parseColor(r9)
            r4.setTextColor(r9)
            java.lang.String r9 = r5.f12357
            int r9 = android.graphics.Color.parseColor(r9)
            r4.setHintTextColor(r9)
            java.lang.String r5 = r5.f12371
            android.graphics.drawable.RippleDrawable r5 = p000.jx0.m3059(r13, r3, r7, r5)
            r4.setBackground(r5)
            su r5 = new su
            r9 = 2
            r5.<init>(r3, r4, r9)
            r4.setOnClickListener(r5)
            uu r5 = new uu
            r9 = 1
            r5.<init>(r3, r4, r9)
            r4.setOnFocusChangeListener(r5)
        L3a5:
            r4 = 2131296661(0x7f090195, float:1.8211245E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r16 = 2131296660(0x7f090194, float:1.8211243E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
            r24 = 2131296659(0x7f090193, float:1.821124E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r24)
            java.lang.Integer[] r4 = new java.lang.Integer[]{r5, r9, r4}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            java.util.Iterator r4 = r4.iterator()
        L3c6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3e6
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            android.view.View r5 = r2.findViewById(r5)
            if (r5 == 0) goto L3c6
            r9 = 8
            android.graphics.drawable.RippleDrawable r9 = p000.jx0.m3059(r9, r3, r7, r12)
            r5.setBackground(r9)
            goto L3c6
        L3e6:
            r4 = 2131296663(0x7f090197, float:1.821125E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7 = 2131296662(0x7f090196, float:1.8211247E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Integer[] r5 = new java.lang.Integer[]{r5, r9}
            java.util.List r5 = p000.AbstractC1021yh.m6897(r5)
            java.util.Iterator r5 = r5.iterator()
        L400:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L471
            java.lang.Object r9 = r5.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            android.view.View r9 = r2.findViewById(r9)
            android.widget.Switch r9 = (android.widget.Switch) r9
            if (r9 == 0) goto L465
            xx r12 = p000.jx0.m3049(r3)
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            r26 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r4 = new int[]{r26}
            r0 = 0
            int[] r13 = new int[r0]
            int[][] r4 = new int[][]{r4, r13}
            java.lang.String r13 = r12.f12358
            int r13 = android.graphics.Color.parseColor(r13)
            java.lang.String r0 = r12.f12357
            int r0 = android.graphics.Color.parseColor(r0)
            int[] r0 = new int[]{r13, r0}
            r7.<init>(r4, r0)
            r9.setThumbTintList(r7)
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            int[] r4 = new int[]{r26}
            r7 = 0
            int[] r13 = new int[r7]
            int[][] r4 = new int[][]{r4, r13}
            java.lang.String r7 = r12.f12359
            int r7 = android.graphics.Color.parseColor(r7)
            java.lang.String r12 = r12.f12371
            int r12 = android.graphics.Color.parseColor(r12)
            int[] r7 = new int[]{r7, r12}
            r0.<init>(r4, r7)
            r9.setTrackTintList(r0)
        L465:
            r0 = 2131296658(0x7f090192, float:1.8211239E38)
            r4 = 2131296663(0x7f090197, float:1.821125E38)
            r7 = 2131296662(0x7f090196, float:1.8211247E38)
            r13 = 10
            goto L400
        L471:
            r0 = 2131296650(0x7f09018a, float:1.8211223E38)
            android.view.View r4 = r2.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L47f
            p000.ln0.m3625(r3, r4)
        L47f:
            r4 = 2131296649(0x7f090189, float:1.821122E38)
            android.view.View r5 = r2.findViewById(r4)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L48d
            p000.ln0.m3625(r3, r5)
        L48d:
            r5 = 2131296651(0x7f09018b, float:1.8211225E38)
            android.view.View r7 = r2.findViewById(r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r9 = 17
            if (r7 == 0) goto L4b6
            xx r12 = p000.jx0.m3049(r3)
            r7.setGravity(r9)
            r13 = 0
            r7.setIncludeFontPadding(r13)
            r13 = -1
            r7.setTextColor(r13)
            java.lang.String r13 = r12.f12348
            java.lang.String r12 = r12.f12358
            r5 = 10
            android.graphics.drawable.RippleDrawable r5 = p000.jx0.m3059(r5, r3, r13, r12)
            r7.setBackground(r5)
        L4b6:
            r5 = 2131296666(0x7f09019a, float:1.8211255E38)
            android.view.View r7 = r2.findViewById(r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L4e6
            xx r5 = p000.jx0.m3049(r3)
            r7.setGravity(r9)
            r9 = 0
            r7.setIncludeFontPadding(r9)
            java.lang.String r12 = r5.f12356
            int r12 = android.graphics.Color.parseColor(r12)
            r7.setTextColor(r12)
            java.lang.String r12 = r5.f12348
            java.lang.String r5 = r5.f12371
            r13 = 99
            android.graphics.drawable.RippleDrawable r5 = p000.jx0.m3059(r13, r3, r12, r5)
            r7.setBackground(r5)
        L4e2:
            r5 = 2131296675(0x7f0901a3, float:1.8211273E38)
            goto L4e8
        L4e6:
            r9 = 0
            goto L4e2
        L4e8:
            android.view.View r5 = r2.findViewById(r5)
            r13 = r5
            android.widget.TextView r13 = (android.widget.TextView) r13
            r5 = 2131296680(0x7f0901a8, float:1.8211284E38)
            android.view.View r5 = r2.findViewById(r5)
            r12 = r5
            android.widget.TextView r12 = (android.widget.TextView) r12
            r5 = 2131296658(0x7f090192, float:1.8211239E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r7 = 2131296655(0x7f09018f, float:1.8211233E38)
            android.view.View r7 = r2.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r9 = 2131296661(0x7f090195, float:1.8211245E38)
            android.view.View r9 = r2.findViewById(r9)
            r4 = r21
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = r16
            android.view.View r0 = r2.findViewById(r0)
            r21 = r1
            r1 = 2131296663(0x7f090197, float:1.821125E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.Switch r1 = (android.widget.Switch) r1
            r16 = r4
            r4 = r24
            android.view.View r4 = r2.findViewById(r4)
            r22 = r5
            r5 = 2131296662(0x7f090196, float:1.8211247E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.Switch r5 = (android.widget.Switch) r5
            r23 = r6
            r6 = 2131296666(0x7f09019a, float:1.8211255E38)
            android.view.View r6 = r2.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r18 = r9
            r9 = 2131296650(0x7f09018a, float:1.8211223E38)
            android.view.View r9 = r2.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r19 = r9
            r9 = 2131296649(0x7f090189, float:1.821122E38)
            android.view.View r9 = r2.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r17 = r9
            r9 = 2131296651(0x7f09018b, float:1.8211225E38)
            android.view.View r9 = r2.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r24 = r9
            android.app.AlertDialog$Builder r9 = new android.app.AlertDialog$Builder
            r9.<init>(r3)
            android.app.AlertDialog$Builder r2 = r9.setView(r2)
            android.app.AlertDialog r2 = r2.create()
            java.lang.String r9 = "yyyy年MM月dd日 HH:mm"
            r25 = r10
            java.lang.String r10 = "yyyyMMdd HH:mm"
            r26 = r12
            java.lang.String r12 = "yyyy/MM/dd HH:mm"
            r27 = r13
            java.lang.String r13 = "MM-dd HH:mm"
            java.lang.String[] r9 = new java.lang.String[]{r11, r12, r13, r9, r10}
            java.util.List r9 = p000.AbstractC1021yh.m6897(r9)
            java.util.Iterator r28 = r9.iterator()
        L593:
            boolean r9 = r28.hasNext()
            if (r9 == 0) goto L5e5
            java.lang.Object r9 = r28.next()
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11
            bv1 r9 = p000.bv1.f1853
            il1 r9 = new il1
            r10 = r19
            r19 = 1
            r29 = r8
            r30 = r10
            r31 = r17
            r8 = r18
            r12 = r22
            r18 = r23
            r32 = r24
            r10 = r25
            r13 = r27
            r20 = 2
            r22 = 0
            r17 = r15
            r15 = r16
            r16 = r14
            r14 = r26
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r13 = ""
            java.lang.String r14 = "点击应用该日期格式"
            android.widget.LinearLayout r9 = p000.bv1.m1063(r3, r11, r13, r14, r9)
            r7.addView(r9)
            r22 = r12
            r14 = r16
            r19 = r30
            r18 = r8
            r16 = r15
            r15 = r17
            r8 = r29
            r17 = r31
            goto L593
        L5e5:
            r29 = r8
            r31 = r17
            r8 = r18
            r30 = r19
            r12 = r22
            r18 = r23
            r32 = r24
            r10 = r25
            r20 = 2
            r22 = 0
            r17 = r15
            r15 = r16
            r16 = r14
            java.lang.Object r7 = r10.f10912
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r12.setText(r7)
            android.text.Editable r7 = r12.getText()
            if (r7 == 0) goto L611
            int r7 = r7.length()
            goto L613
        L611:
            r7 = r22
        L613:
            r12.setSelection(r7)
            av1 r9 = new av1
            r11 = r12
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r13 = r26
            r12 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r17 = r16
            r16 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r12.addTextChangedListener(r9)
            ea0 r9 = new ea0
            r12 = r10
            r10 = r16
            r16 = r15
            r15 = r14
            r14 = r13
            r13 = r11
            r11 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r19 = r11
            r7 = r16
            r3 = r18
            r16 = r10
            r10 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r17
            r8.setOnClickListener(r9)
            boolean r8 = r15.f9050
            r1.setChecked(r8)
            boolean r8 = r3.f9050
            r5.setChecked(r8)
            st1 r9 = new st1
            r18 = 0
            r17 = r3
            r11 = r10
            r10 = r15
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r18 = r17
            r17 = r10
            r10 = r11
            r1.setOnCheckedChangeListener(r9)
            st1 r9 = new st1
            r3 = r18
            r18 = 1
            r10 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r18 = r10
            r10 = r11
            r5.setOnCheckedChangeListener(r9)
            wu r3 = new wu
            r7 = 3
            r3.<init>(r1, r7)
            r0.setOnClickListener(r3)
            wu r0 = new wu
            r1 = 4
            r0.<init>(r5, r1)
            r4.setOnClickListener(r0)
            sa r0 = new sa
            r1 = 20
            r0.<init>(r2, r1)
            r6.setOnClickListener(r0)
            sa r0 = new sa
            r1 = 21
            r0.<init>(r2, r1)
            r9 = r31
            r9.setOnClickListener(r0)
            tt1 r0 = new tt1
            r3 = r2
            r4 = r10
            r7 = r16
            r5 = r17
            r6 = r18
            r2 = r19
            r8 = r20
            r1 = r21
            r20 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = r32
            r9.setOnClickListener(r0)
            vj r0 = new vj
            r4 = r29
            r0.<init>(r3, r2, r4, r1)
            r9 = r30
            r9.setOnClickListener(r0)
            r9 = r10
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r16
            r15 = r17
            r16 = r18
            r0 = r20
            p000.bv1.m1052(r9, r10, r11, r12, r13, r14, r15, r16)
            r3.show()
            android.view.Window r1 = r3.getWindow()
            if (r1 == 0) goto L715
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>(r0)
            r1.setBackgroundDrawable(r3)
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.setDimAmount(r0)
            r1.addFlags(r8)
            r0 = 131080(0x20008, float:1.83682E-40)
            r1.clearFlags(r0)
            r0 = 16
            r1.setSoftInputMode(r0)
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            float r0 = (float) r0
            r2 = 1064011039(0x3f6b851f, float:0.92)
            float r0 = r0 * r2
            int r0 = (int) r0
            r2 = -2
            r1.setLayout(r0, r2)
        L715:
            s62 r0 = p000.s62.f9751
            return r0
    }

    /* JADX INFO: renamed from: γ */
    private final java.lang.Object m2265(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            android.app.Activity r1 = r0.f4266
            r0 = r18
            a80 r0 = (p000.a80) r0
            r0.getClass()
            bv1 r2 = p000.bv1.f1853
            nt r8 = new nt
            r2 = 3
            r8.<init>(r0, r2)
            r9 = 0
            x01 r0 = p000.x01.f11964     // Catch: java.lang.Throwable -> L65
            android.view.LayoutInflater r0 = r0.m6477(r1)     // Catch: java.lang.Throwable -> L65
            r2 = 2131492901(0x7f0c0025, float:1.8609267E38)
            r3 = 0
            android.view.View r0 = r0.inflate(r2, r3, r9)     // Catch: java.lang.Throwable -> L65
            r2 = 2131297076(0x7f090334, float:1.8212087E38)
            android.view.View r2 = r0.findViewById(r2)     // Catch: java.lang.Throwable -> L65
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch: java.lang.Throwable -> L65
            r4 = 2131297070(0x7f09032e, float:1.8212075E38)
            android.view.View r4 = r0.findViewById(r4)     // Catch: java.lang.Throwable -> L65
            r12 = r4
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch: java.lang.Throwable -> L65
            r4 = 2131297077(0x7f090335, float:1.8212089E38)
            android.view.View r4 = r0.findViewById(r4)     // Catch: java.lang.Throwable -> L65
            r13 = r4
            android.widget.TextView r13 = (android.widget.TextView) r13     // Catch: java.lang.Throwable -> L65
            r4 = 2131296787(0x7f090213, float:1.82115E38)
            android.view.View r4 = r0.findViewById(r4)     // Catch: java.lang.Throwable -> L65
            android.widget.ListView r4 = (android.widget.ListView) r4     // Catch: java.lang.Throwable -> L65
            r5 = 2131296341(0x7f090055, float:1.8210596E38)
            android.view.View r5 = r0.findViewById(r5)     // Catch: java.lang.Throwable -> L65
            r6 = 2131296362(0x7f09006a, float:1.8210639E38)
            android.view.View r6 = r0.findViewById(r6)     // Catch: java.lang.Throwable -> L65
            r7 = 2131296360(0x7f090068, float:1.8210634E38)
            android.view.View r7 = r0.findViewById(r7)     // Catch: java.lang.Throwable -> L65
            boolean r10 = r5 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L65
            if (r10 == 0) goto L68
            r10 = r5
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch: java.lang.Throwable -> L65
            goto L69
        L65:
            r0 = move-exception
            goto L189
        L68:
            r10 = r3
        L69:
            if (r10 == 0) goto L70
            java.lang.String r11 = "清空筛选"
            r10.setText(r11)     // Catch: java.lang.Throwable -> L65
        L70:
            boolean r10 = r6 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L65
            if (r10 == 0) goto L78
            r10 = r6
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch: java.lang.Throwable -> L65
            goto L79
        L78:
            r10 = r3
        L79:
            if (r10 == 0) goto L80
            java.lang.String r11 = "全部显示"
            r10.setText(r11)     // Catch: java.lang.Throwable -> L65
        L80:
            boolean r10 = r7 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L65
            if (r10 == 0) goto L88
            r10 = r7
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch: java.lang.Throwable -> L65
            goto L89
        L88:
            r10 = r3
        L89:
            if (r10 == 0) goto L90
            java.lang.String r11 = "保存"
            r10.setText(r11)     // Catch: java.lang.Throwable -> L65
        L90:
            java.util.List r15 = p000.bv1.m1077()     // Catch: java.lang.Throwable -> L65
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L65
            r14.<init>()     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r10 = r15.iterator()     // Catch: java.lang.Throwable -> L65
        L9d:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r11 == 0) goto Lbe
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L65
            ku1 r11 = (p000.ku1) r11     // Catch: java.lang.Throwable -> L65
            java.lang.String r11 = r11.f6118     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = "feed_right_control_hide_"
            java.lang.String r3 = r3.concat(r11)     // Catch: java.lang.Throwable -> L65
            boolean r3 = p000.ui1.m5887(r3, r9)     // Catch: java.lang.Throwable -> L65
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L65
            r14.put(r11, r3)     // Catch: java.lang.Throwable -> L65
            r3 = 0
            goto L9d
        Lbe:
            zc0 r11 = new zc0     // Catch: java.lang.Throwable -> L65
            r11.<init>(r1, r15, r14)     // Catch: java.lang.Throwable -> L65
            r4.setAdapter(r11)     // Catch: java.lang.Throwable -> L65
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L65
            qu1 r10 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L65
            java.lang.String r16 = "theme"
            if (r10 == 0) goto L184
            java.lang.String r10 = r10.f9120     // Catch: java.lang.Throwable -> L65
            int r10 = android.graphics.Color.parseColor(r10)     // Catch: java.lang.Throwable -> L65
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L65
            r4.setDivider(r3)     // Catch: java.lang.Throwable -> L65
            r3 = 1
            r4.setDividerHeight(r3)     // Catch: java.lang.Throwable -> L65
            r4.setCacheColorHint(r9)     // Catch: java.lang.Throwable -> L65
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable     // Catch: java.lang.Throwable -> L65
            qu1 r10 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L65
            if (r10 == 0) goto L17f
            java.lang.String r10 = r10.f9135     // Catch: java.lang.Throwable -> L65
            int r10 = android.graphics.Color.parseColor(r10)     // Catch: java.lang.Throwable -> L65
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)     // Catch: java.lang.Throwable -> L65
            r9 = 0
            r3.<init>(r10, r9, r9)     // Catch: java.lang.Throwable -> L65
            r4.setSelector(r3)     // Catch: java.lang.Throwable -> L65
            p000.bv1.m1047(r12, r15, r13, r14)     // Catch: java.lang.Throwable -> L65
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L65
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L65
            android.app.AlertDialog$Builder r0 = r3.setView(r0)     // Catch: java.lang.Throwable -> L65
            android.app.AlertDialog r9 = r0.create()     // Catch: java.lang.Throwable -> L65
            sa r0 = new sa     // Catch: java.lang.Throwable -> L65
            r3 = 22
            r0.<init>(r9, r3)     // Catch: java.lang.Throwable -> L65
            r2.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L65
            ut1 r10 = new ut1     // Catch: java.lang.Throwable -> L65
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L65
            r4.setOnItemClickListener(r10)     // Catch: java.lang.Throwable -> L65
            cl0 r0 = new cl0     // Catch: java.lang.Throwable -> L65
            r2 = r7
            r7 = 3
            r10 = r5
            r3 = r11
            r5 = r12
            r4 = r14
            r12 = r2
            r11 = r6
            r6 = r13
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L65
            r10.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L65
            g90 r10 = new g90     // Catch: java.lang.Throwable -> L65
            r0 = r11
            r6 = r12
            r11 = r3
            r12 = r5
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L65
            r0.setOnClickListener(r10)     // Catch: java.lang.Throwable -> L65
            g90 r0 = new g90     // Catch: java.lang.Throwable -> L65
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r14
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L17c
            r1 = r2
            r6.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L65
            r4.show()     // Catch: java.lang.Throwable -> L65
            android.view.Window r0 = r4.getWindow()     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L1ba
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L65
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            r0.setBackgroundDrawable(r2)     // Catch: java.lang.Throwable -> L65
            android.content.res.Resources r2 = r1.getResources()     // Catch: java.lang.Throwable -> L65
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L65
            int r2 = r2.widthPixels     // Catch: java.lang.Throwable -> L65
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L65
            r3 = 1064011039(0x3f6b851f, float:0.92)
            float r2 = r2 * r3
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L65
            android.content.res.Resources r3 = r1.getResources()     // Catch: java.lang.Throwable -> L65
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch: java.lang.Throwable -> L65
            int r3 = r3.heightPixels     // Catch: java.lang.Throwable -> L65
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L65
            r4 = 1061326684(0x3f428f5c, float:0.76)
            float r3 = r3 * r4
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L65
            r0.setLayout(r2, r3)     // Catch: java.lang.Throwable -> L65
            goto L1ba
        L17c:
            r0 = move-exception
            r1 = r2
            goto L189
        L17f:
            p000.ln0.m3650(r16)     // Catch: java.lang.Throwable -> L65
            r9 = 0
            throw r9     // Catch: java.lang.Throwable -> L65
        L184:
            p000.ln0.m3650(r16)     // Catch: java.lang.Throwable -> L65
            r9 = 0
            throw r9     // Catch: java.lang.Throwable -> L65
        L189:
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "打开 Feed 右侧控件屏蔽设置失败: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DYHelper"
            p000.C0888ux.m5977(r3, r2, r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "打开设置失败: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
        L1ba:
            s62 r0 = p000.s62.f9751
            return r0
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r28) {
            r27 = this;
            r0 = r27
            int r1 = r0.f4265
            r2 = 4
            r3 = 17
            r4 = 11
            r5 = 19
            r6 = 10
            r8 = 0
            java.lang.String r9 = "DYHelper"
            r10 = 2
            r11 = 7
            r12 = 1
            r13 = 0
            android.app.Activity r14 = r0.f4266
            s62 r15 = p000.s62.f9751
            switch(r1) {
                case 0: goto L89c;
                case 1: goto L88d;
                case 2: goto L872;
                case 3: goto L769;
                case 4: goto L751;
                case 5: goto L707;
                case 6: goto L6f8;
                case 7: goto L6e4;
                case 8: goto L638;
                case 9: goto L62f;
                case 10: goto L622;
                case 11: goto L5f3;
                case 12: goto L5ca;
                case 13: goto L5a3;
                case 14: goto L587;
                case 15: goto L270;
                case 16: goto L1ce;
                case 17: goto L1b4;
                case 18: goto L19c;
                case 19: goto L183;
                case 20: goto L145;
                case 21: goto L140;
                case 22: goto L11d;
                case 23: goto Lf5;
                case 24: goto Lc1;
                case 25: goto L86;
                case 26: goto L81;
                case 27: goto L6c;
                case 28: goto L46;
                default: goto L1b;
            }
        L1b:
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            java.lang.String r1 = "手动编辑规则"
            java.lang.String r2 = "清空规则"
            java.lang.String r3 = "从当前会话选择"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r14)
            java.lang.String r3 = "设置自动已读规则"
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            bc0 r3 = new bc0
            r3.<init>(r14, r11, r0)
            android.app.AlertDialog$Builder r0 = r2.setItems(r1, r3)
            r0.show()
            return r15
        L46:
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String[] r1 = p000.kn0.f6041
            java.lang.String r2 = "im_auto_read_filter_mode"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L5c
            int r2 = r3.getInt(r2, r13)     // Catch: java.lang.Throwable -> L5c
            goto L5d
        L5c:
            r2 = r13
        L5d:
            int r2 = p000.j81.m2906(r2, r13, r10)
            xj0 r3 = new xj0
            r3.<init>(r0, r11)
            java.lang.String r0 = "选择自动已读模式"
            p000.bv1.m1054(r14, r0, r1, r2, r3)
            return r15
        L6c:
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            r14.getClass()
            n9 r0 = new n9
            r1 = 29
            r0.<init>(r14, r1)
            r14.runOnUiThread(r0)
            return r15
        L81:
            java.lang.Object r0 = r27.m2265(r28)
            return r0
        L86:
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = p000.bv1.m1075()
            boolean r2 = p000.q02.m4671(r1)
            if (r2 != 0) goto Lb2
            java.lang.String r2 = "0"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La2
            goto Lb2
        La2:
            java.lang.String r2 = "检查中…"
            r0.invoke(r2)
            hu r2 = new hu
            r3 = 23
            r2.<init>(r14, r0, r3)
            p000.AbstractC0976x9.m6534(r1, r2)
            goto Lc0
        Lb2:
            java.lang.String r1 = "暂未检测到当前抖音账号 UID"
            android.widget.Toast r1 = android.widget.Toast.makeText(r14, r1, r13)
            r1.show()
            java.lang.String r1 = "未检测到账号"
            r0.invoke(r1)
        Lc0:
            return r15
        Lc1:
            r1 = r28
            a80 r1 = (p000.a80) r1
            r1.getClass()
            bv1 r2 = p000.bv1.f1853
            java.lang.String r2 = "offline_cache_count_enabled"
            p000.ui1.m5887(r2, r13)
            java.lang.String r2 = "offline_cache_count"
            r3 = 100
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Ldb
            int r3 = r4.getInt(r2, r3)     // Catch: java.lang.Throwable -> Ldb
        Ldb:
            r2 = 500(0x1f4, float:7.0E-43)
            int r2 = p000.j81.m2906(r3, r6, r2)
            java.lang.String r9 = java.lang.String.valueOf(r2)
            hu r11 = new hu
            android.app.Activity r6 = r0.f4266
            r11.<init>(r6, r1, r5)
            java.lang.String r7 = "设置离线缓存视频数量"
            java.lang.String r8 = "输入 10~500 的整数"
            r10 = 2
            p000.bv1.m1053(r6, r7, r8, r9, r10, r11)
            return r15
        Lf5:
            java.lang.String[] r0 = p000.kn0.f6042
            r1 = r28
            a80 r1 = (p000.a80) r1
            r1.getClass()
            bv1 r2 = p000.bv1.f1853
            java.lang.String r2 = "comment_audio_download_trigger_mode"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L10a
            int r12 = r3.getInt(r2, r12)     // Catch: java.lang.Throwable -> L10a
        L10a:
            xm0 r2 = p000.AbstractC0312g7.m2251(r0)
            int r2 = p000.j81.m2907(r12, r2)
            m3 r3 = new m3
            r3.<init>(r1, r0, r14, r4)
            java.lang.String r1 = "选择评论语音下载方案"
            p000.bv1.m1054(r14, r1, r0, r2, r3)
            return r15
        L11d:
            r0 = r28
            a80 r0 = (p000.a80) r0
            java.lang.String r1 = "#CCFFFFFF"
            r0.getClass()
            java.lang.String r2 = "info_bar_text_color"
            java.lang.String r2 = p000.ui1.m5893(r2, r1)     // Catch: java.lang.Exception -> L131
            int r1 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Exception -> L131
            goto L135
        L131:
            int r1 = android.graphics.Color.parseColor(r1)
        L135:
            hu r2 = new hu
            r2.<init>(r0, r14, r3)
            java.lang.String r0 = "设置字体颜色"
            com.example.dyhelper.p002ui.C0169.m1584(r14, r0, r1, r12, r2)
            return r15
        L140:
            java.lang.Object r0 = r27.m2264(r28)
            return r0
        L145:
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            r14.getClass()
            boolean r0 = r14.isFinishing()
            if (r0 != 0) goto L182
            boolean r0 = r14.isDestroyed()
            if (r0 == 0) goto L15c
            goto L182
        L15c:
            uk r0 = new uk     // Catch: java.lang.Throwable -> L166
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L166
            r0.m5924()     // Catch: java.lang.Throwable -> L166
            r1 = r15
            goto L16c
        L166:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
        L16c:
            java.lang.Throwable r0 = p000.fo1.m2190(r1)
            if (r0 == 0) goto L182
            java.lang.String r1 = "rb83b9714f35f634"
            java.lang.String r2 = "打开评论区控件管理器失败"
            p000.C0888ux.m5977(r1, r2, r0)
            java.lang.String r0 = "评论区控件管理器打开失败"
            android.widget.Toast r0 = android.widget.Toast.makeText(r14, r0, r13)
            r0.show()
        L182:
            return r15
        L183:
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            xj0 r1 = new xj0
            r2 = 5
            r1.<init>(r0, r2)
            r14.getClass()
            w1 r0 = new w1
            r0.<init>(r14, r1)
            r14.runOnUiThread(r0)
            return r15
        L19c:
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            bv1 r0 = p000.bv1.f1853
            e71 r0 = new e71
            r0.<init>(r14, r3)
            java.lang.String r1 = "确认清除全部用户配置"
            java.lang.String r2 = "确定要清除 DYHelper 的全部用户配置吗？\n\n将清除：\n• 当前账号配置\n• 其他账号配置\n• 旧版全局配置\n• 元数据 / 最后账号记录\n• 内测状态文件\n• 内测账号状态文件\n• 火花记录等模块配置文件\n\n不会删除你已经下载到本地的视频、图片或音频文件。\n\n此操作不可恢复，清除后建议重启抖音。"
            java.lang.String r3 = "全部清除"
            p000.bv1.m1043(r14, r1, r2, r3, r0)
            return r15
        L1b4:
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            bv1 r0 = p000.bv1.f1853
            e71 r0 = new e71
            r1 = 16
            r0.<init>(r14, r1)
            java.lang.String r1 = "确认导入用户配置"
            java.lang.String r2 = "导入会覆盖备份文件中包含的 DYHelper 配置，包括账号配置、火花记录、内测状态等。\n\n导入完成后建议重启抖音，确保所有 Hook 重新读取配置。"
            java.lang.String r3 = "选择文件"
            p000.bv1.m1043(r14, r1, r2, r3, r0)
            return r15
        L1ce:
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            it1 r0 = new it1
            r0.<init>(r14, r2)
            java.lang.String r1 = "dyhelper_config_"
            r14.getClass()
            boolean r2 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L1f0
            if (r2 != 0) goto L1f2
            android.content.Context r2 = r14.getApplicationContext()     // Catch: java.lang.Throwable -> L1f0
            r2.getClass()     // Catch: java.lang.Throwable -> L1f0
            p000.ui1.m5896(r2)     // Catch: java.lang.Throwable -> L1f0
            goto L1f2
        L1f0:
            r0 = move-exception
            goto L251
        L1f2:
            java.lang.String r2 = p000.ui1.m5886()     // Catch: java.lang.Throwable -> L1f0
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f0
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L1f0
            r5.append(r3)     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r1 = ".json"
            r5.append(r1)     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L1f0
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r4 = "android.intent.action.CREATE_DOCUMENT"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r4 = "android.intent.category.OPENABLE"
            r3.addCategory(r4)     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r4 = "application/json"
            r3.setType(r4)     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r4 = "android.intent.extra.TITLE"
            r3.putExtra(r4, r1)     // Catch: java.lang.Throwable -> L1f0
            bt1 r1 = new bt1     // Catch: java.lang.Throwable -> L1f0
            r1.<init>()     // Catch: java.lang.Throwable -> L1f0
            r1.f1835 = r12     // Catch: java.lang.Throwable -> L1f0
            r1.f1836 = r2     // Catch: java.lang.Throwable -> L1f0
            r1.f1837 = r0     // Catch: java.lang.Throwable -> L1f0
            android.app.FragmentManager r0 = r14.getFragmentManager()     // Catch: java.lang.Throwable -> L1f0
            android.app.FragmentTransaction r0 = r0.beginTransaction()     // Catch: java.lang.Throwable -> L1f0
            java.lang.String r2 = "dyhelper_config_export"
            android.app.FragmentTransaction r0 = r0.add(r1, r2)     // Catch: java.lang.Throwable -> L1f0
            r0.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> L1f0
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L1f0
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1f0
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1f0
            at1 r2 = new at1     // Catch: java.lang.Throwable -> L1f0
            r2.<init>(r1, r3, r13)     // Catch: java.lang.Throwable -> L1f0
            r3 = 100
            r0.postDelayed(r2, r3)     // Catch: java.lang.Throwable -> L1f0
            goto L26f
        L251:
            java.lang.String r1 = "导出用户配置失败"
            p000.C0888ux.m5977(r9, r1, r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "导出失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r14, r0, r13)
            r0.show()
        L26f:
            return r15
        L270:
            android.app.Activity r1 = r0.f4266
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "打开 DyLog 日志查看器，当前缓存日志="
            java.util.List r3 = p000.C0888ux.m5967(r8, r12, r8)     // Catch: java.lang.Throwable -> L550
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L550
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L550
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L550
            r4.append(r3)     // Catch: java.lang.Throwable -> L550
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L550
            p000.C0888ux.m5988(r9, r0, r8, r2, r8)     // Catch: java.lang.Throwable -> L550
            x01 r0 = p000.x01.f11964     // Catch: java.lang.Throwable -> L550
            android.view.LayoutInflater r0 = r0.m6477(r1)     // Catch: java.lang.Throwable -> L550
            r2 = 2131492900(0x7f0c0024, float:1.8609265E38)
            android.view.View r2 = r0.inflate(r2, r8, r13)     // Catch: java.lang.Throwable -> L550
            r3 = 2131296567(0x7f090137, float:1.8211054E38)
            android.view.View r3 = r2.findViewById(r3)     // Catch: java.lang.Throwable -> L550
            if (r3 != 0) goto L2ab
            r3 = r2
        L2ab:
            r4 = 2131296568(0x7f090138, float:1.8211056E38)
            android.view.View r4 = r2.findViewById(r4)     // Catch: java.lang.Throwable -> L550
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch: java.lang.Throwable -> L550
            r11 = 2131296572(0x7f09013c, float:1.8211064E38)
            android.view.View r11 = r2.findViewById(r11)     // Catch: java.lang.Throwable -> L550
            android.widget.TextView r11 = (android.widget.TextView) r11     // Catch: java.lang.Throwable -> L550
            r14 = 2131296569(0x7f090139, float:1.8211058E38)
            android.view.View r14 = r2.findViewById(r14)     // Catch: java.lang.Throwable -> L550
            android.widget.TextView r14 = (android.widget.TextView) r14     // Catch: java.lang.Throwable -> L550
            r5 = 2131296571(0x7f09013b, float:1.8211062E38)
            android.view.View r5 = r2.findViewById(r5)     // Catch: java.lang.Throwable -> L550
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch: java.lang.Throwable -> L550
            r10 = 2131296557(0x7f09012d, float:1.8211034E38)
            android.view.View r10 = r2.findViewById(r10)     // Catch: java.lang.Throwable -> L550
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch: java.lang.Throwable -> L550
            r13 = 2131296559(0x7f09012f, float:1.8211038E38)
            android.view.View r13 = r2.findViewById(r13)     // Catch: java.lang.Throwable -> L550
            android.widget.TextView r13 = (android.widget.TextView) r13     // Catch: java.lang.Throwable -> L550
            r8 = 2131296558(0x7f09012e, float:1.8211036E38)
            android.view.View r8 = r2.findViewById(r8)     // Catch: java.lang.Throwable -> L550
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch: java.lang.Throwable -> L550
            r6 = 2131296566(0x7f090136, float:1.8211052E38)
            android.view.View r6 = r2.findViewById(r6)     // Catch: java.lang.Throwable -> L550
            android.widget.ListView r6 = (android.widget.ListView) r6     // Catch: java.lang.Throwable -> L550
            r12 = 2131296570(0x7f09013a, float:1.821106E38)
            android.view.View r12 = r2.findViewById(r12)     // Catch: java.lang.Throwable -> L550
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch: java.lang.Throwable -> L550
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L550
            r7.<init>()     // Catch: java.lang.Throwable -> L550
            r24 = r15
            qu1 r15 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L544
            java.lang.String r20 = "theme"
            if (r15 == 0) goto L548
            java.lang.String r15 = r15.f9117     // Catch: java.lang.Throwable -> L544
            int r15 = android.graphics.Color.parseColor(r15)     // Catch: java.lang.Throwable -> L544
            r7.setColor(r15)     // Catch: java.lang.Throwable -> L544
            r15 = 18
            int r15 = p000.bv1.m1076(r1, r15)     // Catch: java.lang.Throwable -> L544
            float r15 = (float) r15     // Catch: java.lang.Throwable -> L544
            r7.setCornerRadius(r15)     // Catch: java.lang.Throwable -> L544
            r25 = r9
            r15 = 1
            int r9 = p000.bv1.m1076(r1, r15)     // Catch: java.lang.Throwable -> L4cb
            qu1 r15 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r15 == 0) goto L53e
            java.lang.String r15 = r15.f9136     // Catch: java.lang.Throwable -> L4cb
            int r15 = android.graphics.Color.parseColor(r15)     // Catch: java.lang.Throwable -> L4cb
            r7.setStroke(r9, r15)     // Catch: java.lang.Throwable -> L4cb
            r3.setBackground(r7)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L538
            java.lang.String r3 = r3.f9122     // Catch: java.lang.Throwable -> L4cb
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L4cb
            r11.setTextColor(r3)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L532
            java.lang.String r3 = r3.f9123     // Catch: java.lang.Throwable -> L4cb
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L4cb
            r4.setTextColor(r3)     // Catch: java.lang.Throwable -> L4cb
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L4cb
            r3.<init>()     // Catch: java.lang.Throwable -> L4cb
            qu1 r7 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r7 == 0) goto L52c
            java.lang.String r7 = r7.f9119     // Catch: java.lang.Throwable -> L4cb
            int r7 = android.graphics.Color.parseColor(r7)     // Catch: java.lang.Throwable -> L4cb
            r3.setColor(r7)     // Catch: java.lang.Throwable -> L4cb
            r15 = 1
            r3.setShape(r15)     // Catch: java.lang.Throwable -> L4cb
            r4.setBackground(r3)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L526
            java.lang.String r3 = r3.f9127     // Catch: java.lang.Throwable -> L4cb
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L4cb
            r14.setTextColor(r3)     // Catch: java.lang.Throwable -> L4cb
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L4cb
            r3.<init>()     // Catch: java.lang.Throwable -> L4cb
            qu1 r7 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r7 == 0) goto L520
            java.lang.String r7 = r7.f9128     // Catch: java.lang.Throwable -> L4cb
            int r7 = android.graphics.Color.parseColor(r7)     // Catch: java.lang.Throwable -> L4cb
            r3.setColor(r7)     // Catch: java.lang.Throwable -> L4cb
            r7 = 10
            int r7 = p000.bv1.m1076(r1, r7)     // Catch: java.lang.Throwable -> L4cb
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L4cb
            r3.setCornerRadius(r7)     // Catch: java.lang.Throwable -> L4cb
            r14.setBackground(r3)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L51a
            java.lang.String r3 = r3.f9124     // Catch: java.lang.Throwable -> L4cb
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L4cb
            r5.setTextColor(r3)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L514
            java.lang.String r3 = r3.f9123     // Catch: java.lang.Throwable -> L4cb
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L4cb
            r10.setTextColor(r3)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L50e
            java.lang.String r3 = r3.f9119     // Catch: java.lang.Throwable -> L4cb
            android.graphics.drawable.GradientDrawable r3 = p000.bv1.m1044(r1, r3)     // Catch: java.lang.Throwable -> L4cb
            r10.setBackground(r3)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L508
            java.lang.String r3 = r3.f9127     // Catch: java.lang.Throwable -> L4cb
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L4cb
            r13.setTextColor(r3)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L502
            java.lang.String r3 = r3.f9128     // Catch: java.lang.Throwable -> L4cb
            android.graphics.drawable.GradientDrawable r3 = p000.bv1.m1044(r1, r3)     // Catch: java.lang.Throwable -> L4cb
            r13.setBackground(r3)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L4fc
            java.lang.String r3 = r3.f9125     // Catch: java.lang.Throwable -> L4cb
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L4cb
            r8.setTextColor(r3)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L4f6
            java.lang.String r3 = r3.f9126     // Catch: java.lang.Throwable -> L4cb
            android.graphics.drawable.GradientDrawable r3 = p000.bv1.m1044(r1, r3)     // Catch: java.lang.Throwable -> L4cb
            r8.setBackground(r3)     // Catch: java.lang.Throwable -> L4cb
            r3 = 0
            r6.setDivider(r3)     // Catch: java.lang.Throwable -> L4cb
            r3 = 0
            r6.setCacheColorHint(r3)     // Catch: java.lang.Throwable -> L4cb
            r6.setEmptyView(r12)     // Catch: java.lang.Throwable -> L4cb
            qu1 r3 = p000.bv1.f1856     // Catch: java.lang.Throwable -> L4cb
            if (r3 == 0) goto L4f0
            java.lang.String r3 = r3.f9124     // Catch: java.lang.Throwable -> L4cb
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L4cb
            r12.setTextColor(r3)     // Catch: java.lang.Throwable -> L4cb
            wu1 r3 = new wu1     // Catch: java.lang.Throwable -> L4cb
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4cb
            r6.setAdapter(r3)     // Catch: java.lang.Throwable -> L4cb
            um1 r0 = new um1     // Catch: java.lang.Throwable -> L4cb
            r0.<init>()     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r7 = ""
            r0.f10912 = r7     // Catch: java.lang.Throwable -> L4cb
            pt1 r16 = new pt1     // Catch: java.lang.Throwable -> L4cb
            r18 = r0
            r17 = r1
            r19 = r3
            r21 = r5
            r23 = r10
            r22 = r12
            r20 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L4ec
            r0 = r16
            r16 = r18
            r13.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L4ec
            r18 = r16
            pt1 r16 = new pt1     // Catch: java.lang.Throwable -> L4ec
            r26 = r18
            r18 = r17
            r17 = r26
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L4e8
            r3 = r16
            r16 = r17
            r1 = r18
            r0 = r19
            r10 = r23
            r10.setOnClickListener(r3)     // Catch: java.lang.Throwable -> L4cb
            ma0 r3 = new ma0     // Catch: java.lang.Throwable -> L4cb
            r5 = 2
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> L4cb
            r8.setOnClickListener(r3)     // Catch: java.lang.Throwable -> L4cb
            qt1 r3 = new qt1     // Catch: java.lang.Throwable -> L4cb
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L4cb
            r6.setOnItemClickListener(r3)     // Catch: java.lang.Throwable -> L4cb
            r3 = 1063675494(0x3f666666, float:0.9)
            p000.bv1.m1034(r4, r3)     // Catch: java.lang.Throwable -> L4cb
            r3 = 1064682127(0x3f75c28f, float:0.96)
            p000.bv1.m1034(r10, r3)     // Catch: java.lang.Throwable -> L4cb
            p000.bv1.m1034(r13, r3)     // Catch: java.lang.Throwable -> L4cb
            p000.bv1.m1034(r8, r3)     // Catch: java.lang.Throwable -> L4cb
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L4cb
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4cb
            android.app.AlertDialog$Builder r3 = r3.setView(r2)     // Catch: java.lang.Throwable -> L4cb
            android.app.AlertDialog r3 = r3.create()     // Catch: java.lang.Throwable -> L4cb
            sa r5 = new sa     // Catch: java.lang.Throwable -> L4cb
            r6 = 19
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L4cb
            r4.setOnClickListener(r5)     // Catch: java.lang.Throwable -> L4cb
            r17 = r0
            r18 = r20
            r19 = r21
            r20 = r22
            r21 = r10
            p000.bv1.m1045(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L4cb
            r22 = r20
            r23 = r21
            r20 = r18
            r21 = r19
            r19 = r17
            r3.show()     // Catch: java.lang.Throwable -> L4cb
            android.view.Window r0 = r3.getWindow()     // Catch: java.lang.Throwable -> L4cb
            if (r0 == 0) goto L4c8
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L4cb
            r4 = 0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4cb
            r0.setBackgroundDrawable(r3)     // Catch: java.lang.Throwable -> L4cb
            android.view.View r3 = r0.getDecorView()     // Catch: java.lang.Throwable -> L4cb
            r3.setPadding(r4, r4, r4, r4)     // Catch: java.lang.Throwable -> L4cb
            android.content.res.Resources r3 = r1.getResources()     // Catch: java.lang.Throwable -> L4cb
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch: java.lang.Throwable -> L4cb
            int r3 = r3.widthPixels     // Catch: java.lang.Throwable -> L4cb
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L4cb
            r4 = 1064346583(0x3f70a3d7, float:0.94)
            float r3 = r3 * r4
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L4cb
            r4 = -2
            r0.setLayout(r3, r4)     // Catch: java.lang.Throwable -> L4cb
        L4c8:
            r17 = r16
            goto L4ce
        L4cb:
            r0 = move-exception
            goto L555
        L4ce:
            rt1 r16 = new rt1     // Catch: java.lang.Throwable -> L4cb
            r10 = r23
            r23 = 0
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L4cb
            r0 = r16
            r2.post(r0)     // Catch: java.lang.Throwable -> L4cb
            goto L586
        L4e8:
            r0 = move-exception
            r1 = r18
            goto L555
        L4ec:
            r0 = move-exception
            r1 = r17
            goto L555
        L4f0:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L4f6:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L4fc:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L502:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L508:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L50e:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L514:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L51a:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L520:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L526:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L52c:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L532:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L538:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L53e:
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L544:
            r0 = move-exception
            r25 = r9
            goto L555
        L548:
            r25 = r9
            p000.ln0.m3650(r20)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            throw r16     // Catch: java.lang.Throwable -> L4cb
        L550:
            r0 = move-exception
            r25 = r9
            r24 = r15
        L555:
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "打开 DyLog 日志查看器失败: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = r25
            p000.C0888ux.m5977(r3, r2, r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "打开日志失败: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
        L586:
            return r24
        L587:
            r24 = r15
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            bv1 r0 = p000.bv1.f1853
            e71 r0 = new e71
            r15 = 18
            r0.<init>(r14, r15)
            java.lang.String r1 = "确认清除"
            java.lang.String r2 = "确定要清除 DexKit 缓存吗？\n\n清除后下次启动会重新进行 DexKit 适配，可能需要较长时间。"
            java.lang.String r3 = "清除"
            p000.bv1.m1043(r14, r1, r2, r3, r0)
            return r24
        L5a3:
            r24 = r15
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            ym1 r1 = p000.hk0.f4753
            java.lang.String r1 = "im_time_label_dark_color"
            java.lang.String r2 = "#FFFFFF"
            java.lang.String r1 = p000.ui1.m5893(r1, r2)
            java.lang.String r1 = p000.hk0.m2515(r1, r2)
            int r1 = android.graphics.Color.parseColor(r1)
            hu r2 = new hu
            r2.<init>(r0, r14, r4)
            java.lang.String r0 = "设置深色模式标签颜色"
            r3 = 0
            com.example.dyhelper.p002ui.C0169.m1584(r14, r0, r1, r3, r2)
            return r24
        L5ca:
            r24 = r15
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            ym1 r1 = p000.hk0.f4753
            java.lang.String r1 = "im_time_label_light_color"
            java.lang.String r2 = "#000000"
            java.lang.String r1 = p000.ui1.m5893(r1, r2)
            java.lang.String r1 = p000.hk0.m2515(r1, r2)
            int r1 = android.graphics.Color.parseColor(r1)
            hu r2 = new hu
            r15 = 18
            r2.<init>(r0, r14, r15)
            java.lang.String r0 = "设置浅色模式标签颜色"
            r3 = 0
            com.example.dyhelper.p002ui.C0169.m1584(r14, r0, r1, r3, r2)
            return r24
        L5f3:
            r24 = r15
            r1 = r28
            a80 r1 = (p000.a80) r1
            r1.getClass()
            java.lang.String r2 = "im_time_label_format"
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r6 = p000.ui1.m5893(r2, r3)
            java.lang.String r2 = "im_time_label_text"
            java.lang.String r3 = "{time}"
            java.lang.String r7 = p000.ui1.m5893(r2, r3)
            hu r8 = new hu
            r2 = 22
            android.app.Activity r5 = r0.f4266
            r8.<init>(r1, r5, r2)
            r5.getClass()
            vg0 r4 = new vg0
            r9 = 1
            r4.<init>(r5, r6, r7, r8, r9)
            r5.runOnUiThread(r4)
            return r24
        L622:
            r24 = r15
            r0 = r28
            a80 r0 = (p000.a80) r0
            r0.getClass()
            p000.pd2.m4473(r14)
            return r24
        L62f:
            r0 = r28
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r0
            s62 r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.m1453(r14, r0)
            return r0
        L638:
            r16 = r8
            r3 = r9
            r1 = r28
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L64b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L668
            java.lang.Object r2 = r1.next()
            zy0 r2 = (p000.zy0) r2
            java.lang.Object r2 = r2.f13360
            boolean r4 = r2 instanceof p000.C0276f8
            if (r4 == 0) goto L660
            f8 r2 = (p000.C0276f8) r2
            goto L662
        L660:
            r2 = r16
        L662:
            if (r2 == 0) goto L64b
            r6.add(r2)
            goto L64b
        L668:
            boolean r1 = r6.isEmpty()
            android.app.Activity r7 = r0.f4266
            if (r1 == 0) goto L67c
            java.lang.String r0 = "请先勾选要下载的作品"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r3)
            r0.show()
            r12 = 0
            goto L6df
        L67c:
            qy0 r0 = p000.qy0.f9157
            r7.getClass()
            iu r1 = p000.AbstractC1021yh.m6915(r7)
            java.lang.String r2 = r1.f5186
            if (r2 == 0) goto L69b
            boolean r2 = p000.q02.m4671(r2)
            if (r2 == 0) goto L690
            goto L69b
        L690:
            boolean r1 = r1.m2799()
            if (r1 != 0) goto L69b
            java.lang.String r1 = "[DOWNLOAD-STORAGE] 当前空间无可用 SAF 授权，改用 MediaStore"
            p000.C0888ux.m5975(r3, r1)
        L69b:
            p000.qy0.m4960(r7)
            int r11 = r0.m5031()
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r7.getSystemService(r0)
            r0.getClass()
            r10 = r0
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            boolean r9 = p000.qy0.m4988(r7)
            java.util.concurrent.atomic.AtomicInteger r8 = new java.util.concurrent.atomic.AtomicInteger
            r3 = 0
            r8.<init>(r3)
            int r5 = r6.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "共 "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = " 个作品，准备中..."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "批量下载"
            p000.qy0.m4996(r7, r1, r0)
            java.util.concurrent.ExecutorService r0 = p000.qy0.f9160
            cy0 r4 = new cy0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.execute(r4)
            r12 = 1
        L6df:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            return r0
        L6e4:
            r24 = r15
            r0 = r28
            mg1 r0 = (p000.mg1) r0
            r0.getClass()
            java.lang.String r0 = r0.f7129
            r15 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r14, r0, r15)
            r0.show()
            return r24
        L6f8:
            r24 = r15
            r0 = r28
            f8 r0 = (p000.C0276f8) r0
            r0.getClass()
            qy0 r1 = p000.qy0.f9157
            p000.qy0.m4989(r0, r14)
            return r24
        L707:
            r16 = r8
            r24 = r15
            r0 = r28
            f8 r0 = (p000.C0276f8) r0
            r0.getClass()
            qy0 r1 = p000.qy0.f9157
            r14.getClass()
            java.lang.String r1 = r0.f3799
            if (r1 != 0) goto L747
            java.lang.String r1 = r0.m2046()
            if (r1 != 0) goto L747
            java.lang.String r1 = r0.m2047()
            if (r1 != 0) goto L747
            java.lang.String r1 = r0.m2045()
            if (r1 != 0) goto L747
            java.util.List r1 = r0.f3796
            if (r1 == 0) goto L739
            java.lang.Object r1 = p000.AbstractC0984xh.m6640(r1)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            goto L73b
        L739:
            r8 = r16
        L73b:
            if (r8 != 0) goto L746
            java.lang.String r1 = r0.m2044()
            if (r1 != 0) goto L747
            java.lang.String r1 = "无链接"
            goto L747
        L746:
            r1 = r8
        L747:
            xx0 r0 = new xx0
            r2 = 3
            r0.<init>(r14, r1, r2)
            r14.runOnUiThread(r0)
            return r24
        L751:
            r24 = r15
            r0 = r28
            f8 r0 = (p000.C0276f8) r0
            r0.getClass()
            android.os.Handler r1 = p000.dl0.f3213
            r14.getClass()
            zk0 r1 = new zk0
            r3 = 0
            r1.<init>(r14, r0, r3)
            r14.runOnUiThread(r1)
            return r24
        L769:
            r24 = r15
            r0 = r28
            f8 r0 = (p000.C0276f8) r0
            r0.getClass()
            qy0 r3 = p000.qy0.f9157
            r14.getClass()
            h8 r1 = r0.f3798
            h8 r2 = p000.EnumC0350h8.f4617
            if (r1 == r2) goto L84c
            boolean r1 = r0.m2051()
            if (r1 != 0) goto L84c
            boolean r1 = r0.m2052()
            if (r1 == 0) goto L78b
            goto L84c
        L78b:
            boolean r1 = r0.m2053()
            jz r2 = p000.C0450jz.f5672
            if (r1 == 0) goto L80b
            java.lang.String r1 = r0.m2047()
            java.util.List r1 = p000.AbstractC1021yh.m6898(r1)
            java.util.List r0 = r0.f3795
            if (r0 != 0) goto L7a0
            goto L7a1
        L7a0:
            r2 = r0
        L7a1:
            uh0 r0 = new uh0
            r4 = 20
            r0.<init>(r4)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r2, r0)
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6651(r1, r0)
            f7 r1 = new f7
            r15 = 1
            r1.<init>(r15, r0)
            oy0 r0 = p000.oy0.f8344
            t52 r2 = new t52
            r2.<init>(r1, r0)
            sv0 r0 = new sv0
            r0.<init>(r11)
            y30 r9 = new y30
            r9.<init>(r2, r15, r0)
            ny0 r1 = new ny0
            r7 = 0
            r8 = 1
            r2 = 1
            java.lang.Class<qy0> r4 = p000.qy0.class
            java.lang.String r5 = "isBadVideoUrlForMp4Download"
            java.lang.String r6 = "isBadVideoUrlForMp4Download(Ljava/lang/String;)Z"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            y30 r0 = new y30
            r4 = 0
            r0.<init>(r9, r4, r1)
            ny0 r15 = new ny0
            r21 = 0
            r22 = 2
            r16 = 1
            pu0 r17 = p000.pu0.f8717
            java.lang.Class<pu0> r18 = p000.pu0.class
            java.lang.String r19 = "isWatermarkVideoUrl"
            java.lang.String r20 = "isWatermarkVideoUrl(Ljava/lang/String;)Z"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            y30 r9 = new y30
            r9.<init>(r0, r4, r15)
            ny0 r1 = new ny0
            r8 = 3
            java.lang.Class<qy0> r4 = p000.qy0.class
            java.lang.String r5 = "normalizeAssetUrl"
            java.lang.String r6 = "normalizeAssetUrl(Ljava/lang/String;)Ljava/lang/String;"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            t52 r0 = new t52
            r0.<init>(r9, r1)
            java.lang.Object r0 = p000.us1.m5953(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L868
        L80b:
            java.util.List r1 = p000.qy0.m4990(r0)
            if (r1 != 0) goto L818
            java.util.List r0 = r0.f3796
            if (r0 != 0) goto L816
            goto L819
        L816:
            r2 = r0
            goto L819
        L818:
            r2 = r1
        L819:
            f7 r0 = new f7
            r15 = 1
            r0.<init>(r15, r2)
            py0 r1 = p000.py0.f8758
            t52 r2 = new t52
            r2.<init>(r0, r1)
            sv0 r0 = new sv0
            r1 = 8
            r0.<init>(r1)
            y30 r9 = new y30
            r9.<init>(r2, r15, r0)
            ny0 r1 = new ny0
            r7 = 0
            r8 = 4
            r2 = 1
            java.lang.Class<qy0> r4 = p000.qy0.class
            java.lang.String r5 = "normalizeAssetUrl"
            java.lang.String r6 = "normalizeAssetUrl(Ljava/lang/String;)Ljava/lang/String;"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            t52 r0 = new t52
            r0.<init>(r9, r1)
            java.lang.Object r0 = p000.us1.m5953(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L868
        L84c:
            lu r1 = p000.qy0.m4998()
            java.util.List r1 = p000.kn0.m3372(r0, r1)
            java.lang.Object r1 = p000.AbstractC0984xh.m6640(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L867
            java.util.List r0 = p000.qy0.m4971(r0)
            java.lang.Object r0 = p000.AbstractC0984xh.m6640(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L868
        L867:
            r0 = r1
        L868:
            xx0 r1 = new xx0
            r5 = 2
            r1.<init>(r0, r14, r5)
            r14.runOnUiThread(r1)
            return r24
        L872:
            r24 = r15
            r15 = r12
            r0 = r28
            te1 r0 = (p000.te1) r0
            r0.getClass()
            java.lang.String r1 = r0.f10350
            int r0 = r0.f10349
            if (r0 != 0) goto L884
            r12 = 0
            goto L885
        L884:
            r12 = r15
        L885:
            android.widget.Toast r0 = android.widget.Toast.makeText(r14, r1, r12)
            r0.show()
            return r24
        L88d:
            r24 = r15
            r0 = r28
            f8 r0 = (p000.C0276f8) r0
            r0.getClass()
            qy0 r1 = p000.qy0.f9157
            p000.qy0.m4989(r0, r14)
            return r24
        L89c:
            r24 = r15
            r0 = r28
            f8 r0 = (p000.C0276f8) r0
            r0.getClass()
            java.lang.String r0 = r0.f3794
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L8ce
            java.lang.String r1 = "无描述"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L8ce
            java.lang.String r1 = "未知"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L8c6
            goto L8ce
        L8c6:
            q71 r1 = p000.q71.f8896
            java.lang.String r1 = "文案已复制"
            p000.q71.m4792(r14, r0, r1)
            goto L8d8
        L8ce:
            java.lang.String r0 = "当前作品没有可复制文案"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r14, r0, r3)
            r0.show()
        L8d8:
            return r24
    }
}
