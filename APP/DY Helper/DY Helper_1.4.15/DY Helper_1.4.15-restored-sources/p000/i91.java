package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class i91 implements p000.z92 {
    /* JADX INFO: renamed from: δ */
    public static final p000.ml1 m2676(long r8, long r10) {
            ml1 r0 = new ml1
            r1 = 32
            long r2 = r8 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r4
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r6 = r10 >> r1
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r2
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r10 = r10 & r4
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 + r8
            r0.<init>(r3, r9, r1, r10)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static final float m2677(p000.bh1 r6, boolean r7, p000.te0[] r8, float r9) {
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.mo962(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static void m2678(android.app.Activity r18, android.view.View r19, android.app.AlertDialog r20, p000.yd1 r21) {
            r0 = r18
            r1 = r19
            r2 = r21
            xx r3 = p000.jx0.m3049(r0)
            java.lang.String r4 = r3.f12353
            java.lang.String r5 = r3.f12357
            java.lang.String r6 = r3.f12364
            java.lang.String r7 = r3.f12360
            java.lang.String r8 = r3.f12362
            java.lang.String r9 = r3.f12358
            java.lang.String r10 = r3.f12351
            java.lang.String r11 = r3.f12356
            r12 = 16
            android.graphics.drawable.GradientDrawable r10 = p000.jx0.m3062(r12, r0, r10)
            r1.setBackground(r10)
            r10 = 2131296442(0x7f0900ba, float:1.82108E38)
            r12 = 2131296438(0x7f0900b6, float:1.8210793E38)
            r13 = 2131296454(0x7f0900c6, float:1.8210825E38)
            int[] r10 = new int[]{r13, r10, r12}
            r13 = 0
        L31:
            r14 = 3
            if (r13 >= r14) goto L48
            r14 = r10[r13]
            android.view.View r14 = r1.findViewById(r14)
            java.lang.String r15 = r3.f12352
            r12 = 12
            android.graphics.drawable.GradientDrawable r12 = p000.jx0.m3062(r12, r0, r15)
            r14.setBackground(r12)
            int r13 = r13 + 1
            goto L31
        L48:
            r10 = 2131296441(0x7f0900b9, float:1.8210799E38)
            android.view.View r12 = r1.findViewById(r10)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131296455(0x7f0900c7, float:1.8210827E38)
            android.view.View r12 = p000.lz1.m3682(r11, r12, r1, r13)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r13 = r3.f12355
            r14 = 2131296445(0x7f0900bd, float:1.8210807E38)
            android.view.View r12 = p000.lz1.m3682(r13, r12, r1, r14)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131296449(0x7f0900c1, float:1.8210815E38)
            android.view.View r11 = p000.lz1.m3682(r11, r12, r1, r13)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131296450(0x7f0900c2, float:1.8210817E38)
            android.view.View r11 = p000.lz1.m3682(r9, r11, r1, r12)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r15 = 2131296452(0x7f0900c4, float:1.8210821E38)
            android.view.View r11 = p000.lz1.m3682(r8, r11, r1, r15)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r15 = 2131296456(0x7f0900c8, float:1.821083E38)
            android.view.View r11 = p000.lz1.m3682(r7, r11, r1, r15)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r15 = 2131296451(0x7f0900c3, float:1.821082E38)
            android.view.View r11 = p000.lz1.m3682(r6, r11, r1, r15)
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.String r3 = r3.f12349
            android.view.View r3 = p000.lz1.m3682(r3, r11, r1, r10)
            sa r10 = new sa
            r11 = 17
            r15 = r20
            r10.<init>(r15, r11)
            r3.setOnClickListener(r10)
            jb1 r3 = r2.f12589
            java.util.ArrayList r2 = r2.f12588
            android.view.View r10 = r1.findViewById(r14)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.time.LocalDate r11 = r3.f5411
            java.lang.String r14 = "yyyy年M月d日"
            java.util.Locale r15 = java.util.Locale.getDefault()
            java.time.format.DateTimeFormatter r14 = java.time.format.DateTimeFormatter.ofPattern(r14, r15)
            java.lang.String r11 = r11.format(r14)
            r10.setText(r11)
            android.view.View r10 = r1.findViewById(r13)
            android.widget.TextView r10 = (android.widget.TextView) r10
            long r13 = r3.f5412
            int r11 = r3.f5416
            r15 = 1
            if (r11 <= 0) goto Ld0
            r11 = r15
            goto Ld1
        Ld0:
            r11 = 0
        Ld1:
            java.lang.String r11 = m2682(r13, r11)
            r10.setText(r11)
            android.view.View r10 = r1.findViewById(r12)
            android.widget.TextView r10 = (android.widget.TextView) r10
            long r11 = r3.f5413
            int r13 = r3.f5417
            if (r13 <= 0) goto Le5
            goto Le6
        Le5:
            r15 = 0
        Le6:
            java.lang.String r11 = m2682(r11, r15)
            r10.setText(r11)
            r10 = 2131296452(0x7f0900c4, float:1.8210821E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            int r11 = r3.f5414
            java.util.Locale r12 = java.util.Locale.getDefault()
            java.text.NumberFormat r12 = java.text.NumberFormat.getIntegerInstance(r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = r12.format(r11)
            r11.getClass()
            r10.setText(r11)
            r10 = 2131296456(0x7f0900c8, float:1.821083E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            int r3 = r3.f5415
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.text.NumberFormat r11 = java.text.NumberFormat.getIntegerInstance(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r11.format(r3)
            r3.getClass()
            r10.setText(r3)
            java.lang.String r3 = "M/d"
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.time.format.DateTimeFormatter r3 = java.time.format.DateTimeFormatter.ofPattern(r3, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r12 = p000.AbstractC1021yh.m6889(r2, r11)
            r10.<init>(r12)
            java.util.Iterator r12 = r2.iterator()
        L148:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L15e
            java.lang.Object r13 = r12.next()
            jb1 r13 = (p000.jb1) r13
            java.time.LocalDate r13 = r13.f5411
            java.lang.String r13 = r13.format(r3)
            r10.add(r13)
            goto L148
        L15e:
            com.example.dyhelper.ui.dialog.PetElfCampTrendChartView r3 = new com.example.dyhelper.ui.dialog.PetElfCampTrendChartView
            int r12 = android.graphics.Color.parseColor(r5)
            int r13 = android.graphics.Color.parseColor(r4)
            r3.<init>(r0, r12, r13)
            int r12 = android.graphics.Color.parseColor(r9)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = p000.AbstractC1021yh.m6889(r2, r11)
            r13.<init>(r14)
            java.util.Iterator r14 = r2.iterator()
        L17c:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L198
            java.lang.Object r15 = r14.next()
            jb1 r15 = (p000.jb1) r15
            r21 = r12
            long r11 = r15.f5412
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            r12 = r21
            r11 = 10
            goto L17c
        L198:
            r21 = r12
            ce1 r11 = new ce1
            java.lang.String r12 = "金币收益"
            r14 = r21
            r11.<init>(r14, r12, r13)
            int r12 = android.graphics.Color.parseColor(r8)
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r15 = p000.AbstractC1021yh.m6889(r2, r14)
            r13.<init>(r15)
            java.util.Iterator r14 = r2.iterator()
        L1b6:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L1d4
            java.lang.Object r15 = r14.next()
            jb1 r15 = (p000.jb1) r15
            r16 = r4
            r17 = r5
            long r4 = r15.f5413
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r13.add(r4)
            r4 = r16
            r5 = r17
            goto L1b6
        L1d4:
            r16 = r4
            r17 = r5
            ce1 r4 = new ce1
            java.lang.String r5 = "金币投入"
            r4.<init>(r12, r5, r13)
            ce1[] r4 = new p000.ce1[]{r11, r4}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            java.lang.String r5 = "金币"
            r3.m1580(r10, r4, r5)
            r4 = 2131296443(0x7f0900bb, float:1.8210803E38)
            android.view.View r4 = r1.findViewById(r4)
            r4.getClass()
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r4.removeAllViews()
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r11 = -1
            r5.<init>(r11, r11)
            r4.addView(r3, r5)
            com.example.dyhelper.ui.dialog.PetElfCampTrendChartView r3 = new com.example.dyhelper.ui.dialog.PetElfCampTrendChartView
            int r4 = android.graphics.Color.parseColor(r17)
            int r5 = android.graphics.Color.parseColor(r16)
            r3.<init>(r0, r4, r5)
            int r0 = android.graphics.Color.parseColor(r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r14 = 10
            int r5 = p000.AbstractC1021yh.m6889(r2, r14)
            r4.<init>(r5)
            java.util.Iterator r5 = r2.iterator()
        L224:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L23b
            java.lang.Object r12 = r5.next()
            jb1 r12 = (p000.jb1) r12
            int r12 = r12.f5414
            long r12 = (long) r12
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r4.add(r12)
            goto L224
        L23b:
            ce1 r5 = new ce1
            java.lang.String r12 = "种地次数"
            r5.<init>(r0, r12, r4)
            int r0 = android.graphics.Color.parseColor(r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            r14 = 10
            int r12 = p000.AbstractC1021yh.m6889(r2, r14)
            r4.<init>(r12)
            java.util.Iterator r12 = r2.iterator()
        L255:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L26c
            java.lang.Object r13 = r12.next()
            jb1 r13 = (p000.jb1) r13
            int r13 = r13.f5415
            long r13 = (long) r13
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r4.add(r13)
            goto L255
        L26c:
            ce1 r12 = new ce1
            java.lang.String r13 = "浇水次数"
            r12.<init>(r0, r13, r4)
            ce1[] r0 = new p000.ce1[]{r5, r12}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.lang.String r4 = "次"
            r3.m1580(r10, r0, r4)
            r0 = 2131296439(0x7f0900b7, float:1.8210795E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.getClass()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.removeAllViews()
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r11, r11)
            r0.addView(r3, r4)
            r0 = 2131296444(0x7f0900bc, float:1.8210805E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r3 = android.graphics.Color.parseColor(r9)
            java.lang.String r4 = "投入"
            int r5 = android.graphics.Color.parseColor(r8)
            java.lang.String r8 = "收益"
            android.text.SpannableString r3 = m2679(r3, r5, r8, r4)
            r0.setText(r3)
            r0 = 2131296440(0x7f0900b8, float:1.8210797E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r3 = android.graphics.Color.parseColor(r7)
            java.lang.String r4 = "浇水"
            int r5 = android.graphics.Color.parseColor(r6)
            java.lang.String r6 = "种地"
            android.text.SpannableString r3 = m2679(r3, r5, r6, r4)
            r0.setText(r3)
            r0 = 2131296451(0x7f0900c3, float:1.821082E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.Iterator r1 = r2.iterator()
            r3 = 0
            r5 = r3
        L2df:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L2f0
            java.lang.Object r7 = r1.next()
            jb1 r7 = (p000.jb1) r7
            int r7 = r7.f5416
            long r7 = (long) r7
            long r5 = r5 + r7
            goto L2df
        L2f0:
            java.util.Iterator r1 = r2.iterator()
            r7 = r3
        L2f5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L306
            java.lang.Object r2 = r1.next()
            jb1 r2 = (p000.jb1) r2
            int r2 = r2.f5417
            long r9 = (long) r2
            long r7 = r7 + r9
            goto L2f5
        L306:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "仅统计 DyHelper 经服务端确认成功的操作，按设备当前时区自然日累计。金币金额依据宿主种子目录，双倍作物按 2 倍收益计入。本页与入口卡片使用点击时的同一份快照；后台任务继续运行时，重新打开可查看更新。"
            r1.<init>(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L315
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 <= 0) goto L35a
        L315:
            java.lang.String r9 = " * 近 7 天有"
            r1.append(r9)
            java.lang.String r9 = " "
            if (r2 <= 0) goto L332
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r10.append(r5)
            java.lang.String r5 = " 次收获收益未知"
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r1.append(r5)
        L332:
            if (r2 <= 0) goto L33d
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L33d
            java.lang.String r2 = "、"
            r1.append(r2)
        L33d:
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L355
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            r2.append(r7)
            java.lang.String r3 = " 次种地投入未知"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
        L355:
            java.lang.String r2 = "，未计入金币曲线。"
            r1.append(r2)
        L35a:
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            return
    }

    /* JADX INFO: renamed from: η */
    public static android.text.SpannableString m2679(int r3, int r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "● "
            java.lang.String r5 = r0.concat(r5)
            java.lang.String r6 = r0.concat(r6)
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.String r1 = "    "
            java.lang.String r6 = p000.lz1.m3688(r5, r1, r6)
            r0.<init>(r6)
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r3)
            int r3 = r5.length()
            r1 = 0
            r2 = 33
            r0.setSpan(r6, r1, r3, r2)
            int r3 = r5.length()
            int r3 = r3 + 4
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            r5.<init>(r4)
            int r4 = r0.length()
            r0.setSpan(r5, r3, r4, r2)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static final long m2680() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static final p000.ml1 m2681(p000.q01 r1, boolean r2, boolean r3) {
            q01 r0 = r1.f8771
            boolean r0 = r0.f8784
            if (r0 != 0) goto L9
            ml1 r1 = p000.ml1.f7199
            return r1
        L9:
            r0 = 8
            if (r2 != 0) goto L1a
            q31 r1 = p000.h62.m2443(r1, r0)
            mp0 r2 = p000.AbstractC0782s1.m5332(r1)
            ml1 r1 = r2.mo2337(r1, r3)
            return r1
        L1a:
            q31 r1 = p000.h62.m2443(r1, r0)
            ml1 r1 = r1.m4757()
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.String m2682(long r1, boolean r3) {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.NumberFormat r0 = java.text.NumberFormat.getIntegerInstance(r0)
            java.lang.String r1 = r0.format(r1)
            if (r3 == 0) goto L15
            java.lang.String r2 = "*"
            java.lang.String r1 = p000.AbstractC0602nx.m4129(r1, r2)
            return r1
        L15:
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static final long m2683(long r5) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 / r2
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            long r0 = r1 << r0
            long r5 = r5 & r3
            long r5 = r5 | r0
            return r5
    }

    /* JADX INFO: renamed from: μ */
    public static final android.graphics.Rect m2684(android.text.TextPaint r12, java.lang.CharSequence r13, int r14, int r15) {
            boolean r0 = r13 instanceof android.text.Spanned
            if (r0 == 0) goto L68
            r0 = r13
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r1 = r14 + (-1)
            java.lang.Class<android.text.style.MetricAffectingSpan> r2 = android.text.style.MetricAffectingSpan.class
            int r1 = r0.nextSpanTransition(r1, r15, r2)
            if (r1 == r15) goto L68
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
        L20:
            if (r14 >= r15) goto L67
            int r5 = r0.nextSpanTransition(r14, r15, r2)
            java.lang.Object[] r6 = r0.getSpans(r14, r5, r2)
            android.text.style.MetricAffectingSpan[] r6 = (android.text.style.MetricAffectingSpan[]) r6
            r4.set(r12)
            int r7 = r6.length
            r8 = 0
        L31:
            if (r8 >= r7) goto L45
            r9 = r6[r8]
            int r10 = r0.getSpanStart(r9)
            int r11 = r0.getSpanEnd(r9)
            if (r10 == r11) goto L42
            r9.updateMeasureState(r4)
        L42:
            int r8 = r8 + 1
            goto L31
        L45:
            r4.getTextBounds(r13, r14, r5, r3)
            int r14 = r1.right
            int r6 = r3.width()
            int r6 = r6 + r14
            r1.right = r6
            int r14 = r1.top
            int r6 = r3.top
            int r14 = java.lang.Math.min(r14, r6)
            r1.top = r14
            int r14 = r1.bottom
            int r6 = r3.bottom
            int r14 = java.lang.Math.max(r14, r6)
            r1.bottom = r14
            r14 = r5
            goto L20
        L67:
            return r1
        L68:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.getTextBounds(r13, r14, r15, r0)
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static final void m2685(p000.zr1 r0) {
            yp0 r0 = p000.h62.m2445(r0)
            r0.m6975()
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static final void m2686(android.view.ViewStructure r38, p000.yp0 r39, android.view.autofill.AutofillId r40, java.lang.String r41, p000.ol1 r42) {
            r0 = r38
            r1 = r39
            is1 r2 = p000.fs1.f4098
            is1 r2 = p000.wr1.f11812
            xr1 r2 = r1.m7007()
            r8 = 2
            r11 = 8
            r14 = 1
            if (r2 == 0) goto L1a0
            b21 r2 = r2.f12268
            if (r2 == 0) goto L1a0
            java.lang.Object[] r15 = r2.f1428
            r16 = 128(0x80, double:6.3E-322)
            java.lang.Object[] r3 = r2.f1429
            long[] r2 = r2.f1427
            int r4 = r2.length
            int r4 = r4 - r8
            r31 = r8
            if (r4 < 0) goto L179
            r28 = r14
            r5 = 0
            r6 = 0
            r18 = 255(0xff, double:1.26E-321)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 7
        L3e:
            r7 = r2[r5]
            r32 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = ~r7
            long r9 = r9 << r30
            long r9 = r9 & r7
            long r9 = r9 & r32
            int r9 = (r9 > r32 ? 1 : (r9 == r32 ? 0 : -1))
            if (r9 == 0) goto L173
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        L57:
            if (r10 >= r9) goto L171
            long r34 = r7 & r18
            int r34 = (r34 > r16 ? 1 : (r34 == r16 ? 0 : -1))
            if (r34 >= 0) goto L16c
            int r34 = r5 << 3
            int r34 = r34 + r10
            r35 = r15[r34]
            r34 = r3[r34]
            r12 = r35
            is1 r12 = (p000.is1) r12
            is1 r13 = p000.fs1.f4115
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto L7c
            r34.getClass()
            r6 = r34
            a2 r6 = (p000.C0003a2) r6
            goto L16c
        L7c:
            is1 r13 = p000.fs1.f4098
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto L96
            r34.getClass()
            java.util.List r34 = (java.util.List) r34
            java.lang.Object r12 = p000.AbstractC0984xh.m6640(r34)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L16c
            r0.setContentDescription(r12)
            goto L16c
        L96:
            is1 r13 = p000.fs1.f4114
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto La7
            r34.getClass()
            r24 = r34
            lp r24 = (p000.InterfaceC0520lp) r24
            goto L16c
        La7:
            is1 r13 = p000.fs1.f4116
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto Lb8
            r34.getClass()
            r23 = r34
            g2 r23 = (p000.C0307g2) r23
            goto L16c
        Lb8:
            is1 r13 = p000.fs1.f4089
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto Lc9
            r34.getClass()
            r22 = r34
            g4 r22 = (p000.C0309g4) r22
            goto L16c
        Lc9:
            is1 r13 = p000.fs1.f4109
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto Ldf
            r34.getClass()
            java.lang.Boolean r34 = (java.lang.Boolean) r34
            boolean r12 = r34.booleanValue()
            r0.setFocused(r12)
            goto L16c
        Ldf:
            is1 r13 = p000.fs1.f4096
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto Lf0
            r34.getClass()
            r29 = r34
            java.lang.Integer r29 = (java.lang.Integer) r29
            goto L16c
        Lf0:
            is1 r13 = p000.fs1.f4093
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto Lfc
            r27 = r14
            goto L16c
        Lfc:
            is1 r13 = p000.fs1.f4111
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto L10e
            r34.getClass()
            java.lang.Boolean r34 = (java.lang.Boolean) r34
            boolean r28 = r34.booleanValue()
            goto L16c
        L10e:
            is1 r13 = p000.fs1.f4120
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto L11e
            r34.getClass()
            r26 = r34
            so1 r26 = (p000.so1) r26
            goto L16c
        L11e:
            is1 r13 = p000.fs1.f4091
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto L12e
            r34.getClass()
            r25 = r34
            java.lang.Boolean r25 = (java.lang.Boolean) r25
            goto L16c
        L12e:
            is1 r13 = p000.fs1.f4092
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto L13e
            r34.getClass()
            r21 = r34
            r42 r21 = (p000.r42) r21
            goto L16c
        L13e:
            is1 r13 = p000.wr1.f11813
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto L14a
            r0.setClickable(r14)
            goto L16c
        L14a:
            is1 r13 = p000.wr1.f11814
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto L156
            r0.setLongClickable(r14)
            goto L16c
        L156:
            is1 r13 = p000.wr1.f11832
            boolean r13 = p000.ln0.m3626(r12, r13)
            if (r13 == 0) goto L162
            r0.setFocusable(r14)
            goto L16c
        L162:
            is1 r13 = p000.wr1.f11821
            boolean r12 = p000.ln0.m3626(r12, r13)
            if (r12 == 0) goto L16c
            r20 = r14
        L16c:
            long r7 = r7 >> r11
            int r10 = r10 + 1
            goto L57
        L171:
            if (r9 != r11) goto L197
        L173:
            if (r5 == r4) goto L197
            int r5 = r5 + 1
            goto L3e
        L179:
            r18 = 255(0xff, double:1.26E-321)
            r30 = 7
            r32 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r28 = r14
            r6 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L197:
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r26
            goto L1be
        L1a0:
            r31 = r8
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r30 = 7
            r32 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r28 = r14
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r20 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r29 = 0
        L1be:
            xr1 r7 = r1.m7007()
            if (r7 == 0) goto L210
            boolean r8 = r7.f12270
            if (r8 == 0) goto L210
            boolean r8 = r7.f12271
            if (r8 == 0) goto L1cd
            goto L210
        L1cd:
            xr1 r7 = r7.m6779()
            v11 r8 = new v11
            java.util.List r9 = r1.m6999()
            h21 r9 = (p000.h21) r9
            k21 r9 = r9.f4540
            int r9 = r9.f5718
            r8.<init>(r9)
            java.util.List r9 = r1.m6999()
            r8.m6017(r9)
        L1e7:
            boolean r9 = r8.m6023()
            if (r9 == 0) goto L210
            int r9 = r8.f11065
            int r9 = r9 - r14
            java.lang.Object r9 = r8.m6025(r9)
            yp0 r9 = (p000.yp0) r9
            xr1 r10 = r9.m7007()
            if (r10 == 0) goto L1e7
            boolean r12 = r10.f12270
            if (r12 == 0) goto L201
            goto L1e7
        L201:
            r7.m6781(r10)
            boolean r10 = r10.f12271
            if (r10 != 0) goto L1e7
            java.util.List r9 = r9.m6999()
            r8.m6017(r9)
            goto L1e7
        L210:
            if (r7 == 0) goto L29b
            b21 r7 = r7.f12268
            if (r7 == 0) goto L29b
            java.lang.Object[] r8 = r7.f1428
            java.lang.Object[] r9 = r7.f1429
            long[] r7 = r7.f1427
            int r10 = r7.length
            int r10 = r10 + (-2)
            r21 = r14
            if (r10 < 0) goto L29d
            r12 = 0
            r13 = 0
        L225:
            r14 = r7[r12]
            r22 = r11
            r23 = r12
            long r11 = ~r14
            long r11 = r11 << r30
            long r11 = r11 & r14
            long r11 = r11 & r32
            int r11 = (r11 > r32 ? 1 : (r11 == r32 ? 0 : -1))
            if (r11 == 0) goto L28a
            int r12 = r23 - r10
            int r11 = ~r12
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L23d:
            if (r12 >= r11) goto L27f
            long r36 = r14 & r18
            int r26 = (r36 > r16 ? 1 : (r36 == r16 ? 0 : -1))
            if (r26 >= 0) goto L272
            int r26 = r23 << 3
            int r26 = r26 + r12
            r34 = r8[r26]
            r26 = r9[r26]
            r36 = r7
            r7 = r34
            is1 r7 = (p000.is1) r7
            r34 = r8
            is1 r8 = p000.fs1.f4107
            boolean r8 = p000.ln0.m3626(r7, r8)
            if (r8 == 0) goto L262
            r8 = 0
            r0.setEnabled(r8)
            goto L276
        L262:
            is1 r8 = p000.fs1.f4085
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L276
            r26.getClass()
            r13 = r26
            java.util.List r13 = (java.util.List) r13
            goto L276
        L272:
            r36 = r7
            r34 = r8
        L276:
            long r14 = r14 >> r22
            int r12 = r12 + 1
            r8 = r34
            r7 = r36
            goto L23d
        L27f:
            r36 = r7
            r34 = r8
            r7 = r22
            if (r11 != r7) goto L29e
        L287:
            r8 = r23
            goto L291
        L28a:
            r36 = r7
            r34 = r8
            r7 = r22
            goto L287
        L291:
            if (r8 == r10) goto L29e
            int r12 = r8 + 1
            r11 = r7
            r8 = r34
            r7 = r36
            goto L225
        L29b:
            r21 = r14
        L29d:
            r13 = 0
        L29e:
            int r7 = r1.f12744
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            yp0 r8 = r1.m7005()
            if (r8 != 0) goto L2ab
            r7 = 0
        L2ab:
            if (r7 == 0) goto L2b4
            int r7 = r7.intValue()
        L2b1:
            r8 = r40
            goto L2b6
        L2b4:
            r7 = -1
            goto L2b1
        L2b6:
            r0.setAutofillId(r8, r7)
            r8 = r41
            r9 = 0
            r0.setId(r7, r8, r9, r9)
            if (r6 == 0) goto L2c8
            int r6 = r6.f45
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            goto L2d7
        L2c8:
            if (r20 == 0) goto L2cf
            java.lang.Integer r12 = java.lang.Integer.valueOf(r21)
            goto L2d7
        L2cf:
            if (r2 == 0) goto L2d6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r31)
            goto L2d7
        L2d6:
            r12 = r9
        L2d7:
            if (r12 == 0) goto L2e0
            int r6 = r12.intValue()
            r0.setAutofillType(r6)
        L2e0:
            if (r3 == 0) goto L313
            java.lang.String r3 = r3.f4228
            int r6 = r3.length()
            r7 = 5000(0x1388, float:7.006E-42)
            if (r6 >= r7) goto L2ed
            goto L30c
        L2ed:
            r6 = 4999(0x1387, float:7.005E-42)
            char r8 = r3.charAt(r6)
            boolean r8 = java.lang.Character.isHighSurrogate(r8)
            if (r8 == 0) goto L308
            char r8 = r3.charAt(r7)
            boolean r8 = java.lang.Character.isLowSurrogate(r8)
            if (r8 == 0) goto L308
            java.lang.String r3 = p000.q02.m4693(r3, r6)
            goto L30c
        L308:
            java.lang.String r3 = p000.q02.m4693(r3, r7)
        L30c:
            android.view.autofill.AutofillValue r3 = android.view.autofill.AutofillValue.forText(r3)
            r0.setAutofillValue(r3)
        L313:
            if (r4 == 0) goto L31a
            android.view.autofill.AutofillValue r3 = r4.f4212
            r0.setAutofillValue(r3)
        L31a:
            if (r24 == 0) goto L325
            java.lang.String[] r3 = p000.ln0.m3601(r24)
            if (r3 == 0) goto L325
            r0.setAutofillHints(r3)
        L325:
            r3 = r42
            n2 r3 = r3.f8138
            int r4 = r1.f12744
            hi1 r6 = new hi1
            r6.<init>(r0)
            r3.m3948(r4, r6)
            if (r25 == 0) goto L33c
            boolean r3 = r25.booleanValue()
            r0.setSelected(r3)
        L33c:
            r3 = 4
            if (r2 == 0) goto L34f
            r4 = r21
            r0.setCheckable(r4)
            r42 r4 = p000.r42.f9260
            if (r2 != r4) goto L34a
            r2 = 1
            goto L34b
        L34a:
            r2 = 0
        L34b:
            r0.setChecked(r2)
            goto L364
        L34f:
            if (r25 == 0) goto L364
            if (r5 != 0) goto L355
        L353:
            r4 = 1
            goto L35a
        L355:
            int r2 = r5.f9982
            if (r2 != r3) goto L353
            goto L364
        L35a:
            r0.setCheckable(r4)
            boolean r2 = r25.booleanValue()
            r0.setChecked(r2)
        L364:
            kp r2 = p000.InterfaceC0520lp.f6728
            r2.getClass()
            b2 r2 = p000.C0483kp.f6073
            java.lang.String[] r2 = p000.ln0.m3601(r2)
            java.lang.Object r2 = p000.AbstractC0312g7.m2249(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r24 == 0) goto L388
            java.lang.String[] r4 = p000.ln0.m3601(r24)
            if (r4 == 0) goto L388
            boolean r2 = p000.AbstractC0312g7.m2234(r4, r2)
            r4 = 1
            if (r2 != r4) goto L386
            r2 = r4
            goto L38a
        L386:
            r2 = 0
            goto L38a
        L388:
            r4 = 1
            goto L386
        L38a:
            if (r27 != 0) goto L391
            if (r2 == 0) goto L38f
            goto L391
        L38f:
            r2 = 0
            goto L392
        L391:
            r2 = r4
        L392:
            if (r2 != 0) goto L399
            if (r28 == 0) goto L397
            goto L399
        L397:
            r14 = 0
            goto L39a
        L399:
            r14 = r4
        L39a:
            r0.setDataIsSensitive(r14)
            k31 r4 = r1.f12733
            q31 r4 = r4.f5727
            boolean r4 = r4.m4744()
            if (r4 == 0) goto L3a8
            goto L3a9
        L3a8:
            r3 = 0
        L3a9:
            r0.setVisibility(r3)
            if (r13 == 0) goto L3d8
            int r3 = r13.size()
            java.lang.String r4 = ""
            r6 = 0
        L3b5:
            if (r6 >= r3) goto L3d0
            java.lang.Object r7 = r13.get(r6)
            g4 r7 = (p000.C0309g4) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r4 = r7.f4228
            r7 = 10
            java.lang.String r4 = p000.AbstractC0602nx.m4132(r8, r4, r7)
            int r6 = r6 + 1
            goto L3b5
        L3d0:
            r0.setText(r4)
            java.lang.String r3 = "android.widget.TextView"
            r0.setClassName(r3)
        L3d8:
            java.util.List r1 = r1.m6999()
            h21 r1 = (p000.h21) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3f1
            if (r5 == 0) goto L3f1
            int r1 = r5.f9982
            java.lang.String r1 = p000.v71.m6047(r1)
            if (r1 == 0) goto L3f1
            r0.setClassName(r1)
        L3f1:
            if (r20 == 0) goto L408
            java.lang.String r1 = "android.widget.EditText"
            r0.setClassName(r1)
            if (r29 == 0) goto L401
            int r1 = r29.intValue()
            r0.setMaxTextLength(r1)
        L401:
            if (r2 == 0) goto L408
            r1 = 129(0x81, float:1.81E-43)
            r0.setInputType(r1)
        L408:
            return
    }

    /* JADX INFO: renamed from: ο */
    public static final java.lang.Object m2687(p000.wq1 r1, p000.wq1 r2, p000.e80 r3) {
            r0 = 2
            p000.h62.m2394(r0, r3)     // Catch: java.lang.Throwable -> L9
            java.lang.Object r2 = r3.invoke(r2, r1)     // Catch: java.lang.Throwable -> L9
            goto L11
        L9:
            r2 = move-exception
            om r3 = new om
            r0 = 0
            r3.<init>(r2, r0)
            r2 = r3
        L11:
            cq r3 = p000.EnumC0184cq.f2716
            if (r2 != r3) goto L16
            goto L27
        L16:
            java.lang.Object r1 = r1.m2171(r2)
            uy r2 = p000.AbstractC0978xb.f12102
            if (r1 != r2) goto L1f
            goto L27
        L1f:
            boolean r2 = r1 instanceof p000.C0628om
            if (r2 != 0) goto L28
            java.lang.Object r3 = p000.AbstractC0978xb.m6602(r1)
        L27:
            return r3
        L28:
            om r1 = (p000.C0628om) r1
            java.lang.Throwable r1 = r1.f8149
            throw r1
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: β */
    public void mo39() {
            r0 = this;
            return
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: γ */
    public void mo40() {
            r0 = this;
            return
    }
}
