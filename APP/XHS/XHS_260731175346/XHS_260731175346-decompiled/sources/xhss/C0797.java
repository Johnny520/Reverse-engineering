package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲀᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0797 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0451 f2597;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0451 f2598;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0451 f2599;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.widget.TextView f2600;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public android.graphics.Typeface f2601;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0207 f2602;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public xhss.C0451 f2603;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public boolean f2604;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int f2605;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0451 f2606;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0451 f2607;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.C0451 f2608;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public int f2609;

    public C0797(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2605 = r0
            r0 = -1
            r1.f2609 = r0
            r1.f2600 = r2
            xhss.ᛲᲀᲇᲈ r0 = new xhss.ᛲᲀᲇᲈ
            r0.<init>(r2)
            r1.f2602 = r0
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static xhss.C0451 m1362(android.content.Context r1, xhss.C0150 r2, int r3) {
            monitor-enter(r2)
            xhss.ᛱᲈᲁᛴ r0 = r2.f631     // Catch: java.lang.Throwable -> L17
            android.content.res.ColorStateList r1 = r0.m317(r1, r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            if (r1 == 0) goto L15
            xhss.ᛵᛳᛱᲇ r2 = new xhss.ᛵᛳᛱᲇ
            r2.<init>()
            r3 = 1
            r2.f1630 = r3
            r2.f1631 = r1
            return r2
        L15:
            r1 = 0
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1363() {
            r6 = this;
            xhss.ᛵᛳᛱᲇ r0 = r6.f2597
            r1 = 2
            r2 = 0
            android.widget.TextView r3 = r6.f2600
            if (r0 != 0) goto L14
            xhss.ᛵᛳᛱᲇ r0 = r6.f2598
            if (r0 != 0) goto L14
            xhss.ᛵᛳᛱᲇ r0 = r6.f2607
            if (r0 != 0) goto L14
            xhss.ᛵᛳᛱᲇ r0 = r6.f2599
            if (r0 == 0) goto L36
        L14:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawables()
            r4 = r0[r2]
            xhss.ᛵᛳᛱᲇ r5 = r6.f2597
            r6.m1365(r4, r5)
            r4 = 1
            r4 = r0[r4]
            xhss.ᛵᛳᛱᲇ r5 = r6.f2598
            r6.m1365(r4, r5)
            r4 = r0[r1]
            xhss.ᛵᛳᛱᲇ r5 = r6.f2607
            r6.m1365(r4, r5)
            r4 = 3
            r0 = r0[r4]
            xhss.ᛵᛳᛱᲇ r4 = r6.f2599
            r6.m1365(r0, r4)
        L36:
            xhss.ᛵᛳᛱᲇ r0 = r6.f2608
            if (r0 != 0) goto L40
            xhss.ᛵᛳᛱᲇ r0 = r6.f2606
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawablesRelative()
            r2 = r0[r2]
            xhss.ᛵᛳᛱᲇ r3 = r6.f2608
            r6.m1365(r2, r3)
            r0 = r0[r1]
            xhss.ᛵᛳᛱᲇ r1 = r6.f2606
            r6.m1365(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m1364(android.content.Context r6, int r7) {
            r5 = this;
            xhss.ᛷᛱᛳᲁ r0 = new xhss.ᛷᛱᛳᲁ
            int[] r1 = xhss.AbstractC0293.f1130
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
            r0.<init>(r6, r7)
            r1 = 14
            boolean r2 = r7.hasValue(r1)
            r3 = 0
            android.widget.TextView r4 = r5.f2600
            if (r2 == 0) goto L1d
            boolean r1 = r7.getBoolean(r1, r3)
            r4.setAllCaps(r1)
        L1d:
            boolean r1 = r7.hasValue(r3)
            if (r1 == 0) goto L2e
            r1 = -1
            int r1 = r7.getDimensionPixelSize(r3, r1)
            if (r1 != 0) goto L2e
            r1 = 0
            r4.setTextSize(r3, r1)
        L2e:
            r5.m1367(r6, r0)
            r6 = 13
            boolean r1 = r7.hasValue(r6)
            if (r1 == 0) goto L42
            java.lang.String r6 = r7.getString(r6)
            if (r6 == 0) goto L42
            xhss.AbstractC0300.m625(r4, r6)
        L42:
            r0.m1092()
            android.graphics.Typeface r6 = r5.f2601
            if (r6 == 0) goto L4e
            int r5 = r5.f2605
            r4.setTypeface(r6, r5)
        L4e:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1365(android.graphics.drawable.Drawable r2, xhss.C0451 r3) {
            r1 = this;
            if (r2 == 0) goto Lf
            if (r3 == 0) goto Lf
            android.widget.TextView r1 = r1.f2600
            int[] r1 = r1.getDrawableState()
            android.graphics.PorterDuff$Mode r0 = xhss.C0150.f629
            xhss.C0117.m311(r2, r3, r1)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m1366(android.util.AttributeSet r27, int r28) {
            r26 = this;
            r0 = r26
            r3 = r27
            int[] r8 = xhss.AbstractC0293.f1125
            int[] r9 = xhss.AbstractC0293.f1130
            xhss.ᛲᲀᲇᲈ r10 = r0.f2602
            android.widget.TextView r11 = r0.f2600
            android.content.Context r12 = r11.getContext()
            android.graphics.PorterDuff$Mode r1 = xhss.C0150.f629
            java.lang.Class<xhss.ᛲᛳᲈᛲ> r1 = xhss.C0150.class
            monitor-enter(r1)
            xhss.ᛲᛳᲈᛲ r2 = xhss.C0150.f630     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L20
            xhss.C0150.m393()     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r0 = move-exception
            goto L4d0
        L20:
            xhss.ᛲᛳᲈᛲ r13 = xhss.C0150.f630     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            int[] r1 = xhss.AbstractC0293.f1128
            r14 = 0
            r6 = r28
            android.content.res.TypedArray r5 = r12.obtainStyledAttributes(r3, r1, r6, r14)
            r3 = r1
            android.widget.TextView r1 = r0.f2600
            android.content.Context r2 = r1.getContext()
            int r4 = xhss.AbstractC0624.f2154
            r7 = 0
            r4 = r27
            xhss.AbstractC0413.m802(r1, r2, r3, r4, r5, r6, r7)
            r3 = r4
            r1 = r5
            r5 = r6
            r7 = -1
            int r2 = r1.getResourceId(r14, r7)
            r15 = 3
            boolean r4 = r1.hasValue(r15)
            if (r4 == 0) goto L54
            int r4 = r1.getResourceId(r15, r14)
            xhss.ᛵᛳᛱᲇ r4 = m1362(r12, r13, r4)
            r0.f2597 = r4
        L54:
            r4 = 1
            boolean r6 = r1.hasValue(r4)
            if (r6 == 0) goto L65
            int r6 = r1.getResourceId(r4, r14)
            xhss.ᛵᛳᛱᲇ r6 = m1362(r12, r13, r6)
            r0.f2598 = r6
        L65:
            r6 = 4
            boolean r16 = r1.hasValue(r6)
            if (r16 == 0) goto L76
            int r4 = r1.getResourceId(r6, r14)
            xhss.ᛵᛳᛱᲇ r4 = m1362(r12, r13, r4)
            r0.f2607 = r4
        L76:
            r4 = 2
            boolean r17 = r1.hasValue(r4)
            if (r17 == 0) goto L87
            int r6 = r1.getResourceId(r4, r14)
            xhss.ᛵᛳᛱᲇ r6 = m1362(r12, r13, r6)
            r0.f2599 = r6
        L87:
            r6 = 5
            boolean r18 = r1.hasValue(r6)
            if (r18 == 0) goto L98
            int r4 = r1.getResourceId(r6, r14)
            xhss.ᛵᛳᛱᲇ r4 = m1362(r12, r13, r4)
            r0.f2608 = r4
        L98:
            r4 = 6
            boolean r19 = r1.hasValue(r4)
            if (r19 == 0) goto La9
            int r6 = r1.getResourceId(r4, r14)
            xhss.ᛵᛳᛱᲇ r6 = m1362(r12, r13, r6)
            r0.f2606 = r6
        La9:
            r1.recycle()
            android.text.method.TransformationMethod r1 = r11.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            r6 = 14
            r15 = 15
            r22 = 0
            if (r2 == r7) goto Lfa
            xhss.ᛷᛱᛳᲁ r4 = new xhss.ᛷᛱᛳᲁ
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r2, r9)
            r4.<init>(r12, r2)
            if (r1 != 0) goto Ld2
            boolean r23 = r2.hasValue(r6)
            if (r23 == 0) goto Ld2
            boolean r23 = r2.getBoolean(r6, r14)
            r24 = 1
            goto Ld6
        Ld2:
            r23 = r14
            r24 = r23
        Ld6:
            r0.m1367(r12, r4)
            boolean r25 = r2.hasValue(r15)
            if (r25 == 0) goto Le6
            java.lang.String r25 = r2.getString(r15)
        Le3:
            r7 = 13
            goto Le9
        Le6:
            r25 = r22
            goto Le3
        Le9:
            boolean r21 = r2.hasValue(r7)
            if (r21 == 0) goto Lf4
            java.lang.String r2 = r2.getString(r7)
            goto Lf6
        Lf4:
            r2 = r22
        Lf6:
            r4.m1092()
            goto L102
        Lfa:
            r23 = r14
            r24 = r23
            r2 = r22
            r25 = r2
        L102:
            xhss.ᛷᛱᛳᲁ r4 = new xhss.ᛷᛱᛳᲁ
            android.content.res.TypedArray r7 = r12.obtainStyledAttributes(r3, r9, r5, r14)
            r4.<init>(r12, r7)
            if (r1 != 0) goto L119
            boolean r9 = r7.hasValue(r6)
            if (r9 == 0) goto L119
            boolean r23 = r7.getBoolean(r6, r14)
            r24 = 1
        L119:
            r6 = r23
            boolean r9 = r7.hasValue(r15)
            if (r9 == 0) goto L125
            java.lang.String r25 = r7.getString(r15)
        L125:
            r9 = 13
            boolean r21 = r7.hasValue(r9)
            if (r21 == 0) goto L131
            java.lang.String r2 = r7.getString(r9)
        L131:
            boolean r9 = r7.hasValue(r14)
            r15 = 0
            if (r9 == 0) goto L142
            r9 = -1
            int r7 = r7.getDimensionPixelSize(r14, r9)
            if (r7 != 0) goto L142
            r11.setTextSize(r14, r15)
        L142:
            r0.m1367(r12, r4)
            r4.m1092()
            if (r1 != 0) goto L151
            if (r24 == 0) goto L151
            android.widget.TextView r1 = r0.f2600
            r1.setAllCaps(r6)
        L151:
            android.graphics.Typeface r1 = r0.f2601
            if (r1 == 0) goto L163
            int r4 = r0.f2609
            r9 = -1
            if (r4 != r9) goto L160
            int r0 = r0.f2605
            r11.setTypeface(r1, r0)
            goto L163
        L160:
            r11.setTypeface(r1)
        L163:
            if (r2 == 0) goto L168
            xhss.AbstractC0300.m625(r11, r2)
        L168:
            if (r25 == 0) goto L171
            android.os.LocaleList r0 = xhss.AbstractC0917.m1512(r25)
            xhss.AbstractC0917.m1511(r11, r0)
        L171:
            android.content.Context r7 = r10.f771
            android.content.res.TypedArray r4 = r7.obtainStyledAttributes(r3, r8, r5, r14)
            android.widget.TextView r0 = r10.f772
            android.content.Context r1 = r0.getContext()
            r6 = 0
            r2 = r8
            r16 = r15
            r8 = 4
            r9 = 2
            r15 = 5
            xhss.AbstractC0413.m802(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = r4.hasValue(r15)
            if (r0 == 0) goto L193
            int r0 = r4.getInt(r15, r14)
            r10.f770 = r0
        L193:
            boolean r0 = r4.hasValue(r8)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L1a0
            float r0 = r4.getDimension(r8, r1)
            goto L1a1
        L1a0:
            r0 = r1
        L1a1:
            boolean r5 = r4.hasValue(r9)
            if (r5 == 0) goto L1ad
            float r5 = r4.getDimension(r9, r1)
        L1ab:
            r6 = 1
            goto L1af
        L1ad:
            r5 = r1
            goto L1ab
        L1af:
            boolean r8 = r4.hasValue(r6)
            if (r8 == 0) goto L1bb
            float r8 = r4.getDimension(r6, r1)
        L1b9:
            r6 = 3
            goto L1bd
        L1bb:
            r8 = r1
            goto L1b9
        L1bd:
            boolean r18 = r4.hasValue(r6)
            if (r18 == 0) goto L212
            int r15 = r4.getResourceId(r6, r14)
            if (r15 <= 0) goto L212
            android.content.res.Resources r6 = r4.getResources()
            android.content.res.TypedArray r6 = r6.obtainTypedArray(r15)
            int r15 = r6.length()
            r18 = r14
            int[] r14 = new int[r15]
            if (r15 <= 0) goto L20e
            r9 = r18
        L1dd:
            if (r9 >= r15) goto L1eb
            r1 = -1
            int r25 = r6.getDimensionPixelSize(r9, r1)
            r14[r9] = r25
            int r9 = r9 + 1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L1dd
        L1eb:
            int[] r1 = xhss.C0207.m471(r14)
            r10.f769 = r1
            int r9 = r1.length
            if (r9 <= 0) goto L1f6
            r14 = 1
            goto L1f8
        L1f6:
            r14 = r18
        L1f8:
            r10.f774 = r14
            if (r14 == 0) goto L20e
            r14 = 1
            r10.f770 = r14
            r15 = r1[r18]
            float r15 = (float) r15
            r10.f768 = r15
            int r9 = r9 - r14
            r1 = r1[r9]
            float r1 = (float) r1
            r10.f773 = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.f767 = r1
        L20e:
            r6.recycle()
            goto L214
        L212:
            r18 = r14
        L214:
            r4.recycle()
            int r4 = r10.f770
            r14 = 1
            if (r4 != r14) goto L2eb
            boolean r1 = r10.f774
            if (r1 != 0) goto L264
            android.content.res.Resources r1 = r7.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 != 0) goto L236
            r5 = 1094713344(0x41400000, float:12.0)
            r9 = 2
            float r5 = android.util.TypedValue.applyDimension(r9, r5, r1)
            goto L237
        L236:
            r9 = 2
        L237:
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 != 0) goto L241
            r6 = 1121976320(0x42e00000, float:112.0)
            float r8 = android.util.TypedValue.applyDimension(r9, r6, r1)
        L241:
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 != 0) goto L247
            r0 = 1065353216(0x3f800000, float:1.0)
        L247:
            java.lang.String r1 = "px) is less or equal to (0px)"
            int r4 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r4 <= 0) goto L29e
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 <= 0) goto L27d
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 <= 0) goto L266
            r14 = 1
            r10.f770 = r14
            r10.f768 = r5
            r10.f773 = r8
            r10.f767 = r0
            r0 = r18
            r10.f774 = r0
            r1 = 0
            r4 = 1
        L264:
            r14 = 1
            goto L2b5
        L266:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The auto-size step granularity ("
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L27d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Maximum auto-size text size ("
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = "px) is less or equal to minimum auto-size text size ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "px)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L29e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Minimum auto-size text size ("
            r2.<init>(r3)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L2b5:
            if (r4 != r14) goto L2eb
            if (r1 == 0) goto L2be
            int[] r0 = r10.f769
            int r0 = r0.length
            if (r0 != 0) goto L2eb
        L2be:
            float r0 = r10.f773
            float r1 = r10.f768
            float r0 = r0 - r1
            float r1 = r10.f767
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            r17 = 1
            int r0 = r0 + 1
            int[] r1 = new int[r0]
            r4 = 0
        L2d3:
            if (r4 >= r0) goto L2e5
            float r5 = r10.f768
            float r6 = (float) r4
            float r7 = r10.f767
            float r6 = r6 * r7
            float r6 = r6 + r5
            int r5 = java.lang.Math.round(r6)
            r1[r4] = r5
            int r4 = r4 + 1
            goto L2d3
        L2e5:
            int[] r0 = xhss.C0207.m471(r1)
            r10.f769 = r0
        L2eb:
            int r0 = r10.f770
            if (r0 == 0) goto L31a
            int[] r0 = r10.f769
            int r1 = r0.length
            if (r1 <= 0) goto L31a
            int r1 = xhss.AbstractC0300.m624(r11)
            float r1 = (float) r1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L316
            float r0 = r10.f768
            int r0 = java.lang.Math.round(r0)
            float r1 = r10.f773
            int r1 = java.lang.Math.round(r1)
            float r4 = r10.f767
            int r4 = java.lang.Math.round(r4)
            r5 = 0
            xhss.AbstractC0300.m622(r11, r0, r1, r4, r5)
            goto L31a
        L316:
            r5 = 0
            xhss.AbstractC0300.m623(r11, r0, r5)
        L31a:
            android.content.res.TypedArray r0 = r12.obtainStyledAttributes(r3, r2)
            r1 = 8
            r9 = -1
            int r1 = r0.getResourceId(r1, r9)
            if (r1 == r9) goto L32e
            android.graphics.drawable.Drawable r1 = r13.m394(r12, r1)
        L32b:
            r7 = 13
            goto L331
        L32e:
            r1 = r22
            goto L32b
        L331:
            int r2 = r0.getResourceId(r7, r9)
            if (r2 == r9) goto L33c
            android.graphics.drawable.Drawable r2 = r13.m394(r12, r2)
            goto L33e
        L33c:
            r2 = r22
        L33e:
            r3 = 9
            int r3 = r0.getResourceId(r3, r9)
            if (r3 == r9) goto L34c
            android.graphics.drawable.Drawable r3 = r13.m394(r12, r3)
        L34a:
            r4 = 6
            goto L34f
        L34c:
            r3 = r22
            goto L34a
        L34f:
            int r4 = r0.getResourceId(r4, r9)
            if (r4 == r9) goto L35a
            android.graphics.drawable.Drawable r4 = r13.m394(r12, r4)
            goto L35c
        L35a:
            r4 = r22
        L35c:
            r5 = 10
            int r5 = r0.getResourceId(r5, r9)
            if (r5 == r9) goto L369
            android.graphics.drawable.Drawable r5 = r13.m394(r12, r5)
            goto L36b
        L369:
            r5 = r22
        L36b:
            r6 = 7
            int r6 = r0.getResourceId(r6, r9)
            if (r6 == r9) goto L376
            android.graphics.drawable.Drawable r22 = r13.m394(r12, r6)
        L376:
            if (r5 != 0) goto L3cd
            if (r22 == 0) goto L37b
            goto L3cd
        L37b:
            if (r1 != 0) goto L383
            if (r2 != 0) goto L383
            if (r3 != 0) goto L383
            if (r4 == 0) goto L3f3
        L383:
            android.graphics.drawable.Drawable[] r5 = r11.getCompoundDrawablesRelative()
            r18 = 0
            r6 = r5[r18]
            if (r6 != 0) goto L393
            r24 = 2
            r7 = r5[r24]
            if (r7 == 0) goto L396
        L393:
            r20 = 3
            goto L3b8
        L396:
            android.graphics.drawable.Drawable[] r5 = r11.getCompoundDrawables()
            if (r1 == 0) goto L39d
            goto L39f
        L39d:
            r1 = r5[r18]
        L39f:
            if (r2 == 0) goto L3a2
            goto L3a6
        L3a2:
            r17 = 1
            r2 = r5[r17]
        L3a6:
            if (r3 == 0) goto L3a9
            goto L3ad
        L3a9:
            r24 = 2
            r3 = r5[r24]
        L3ad:
            if (r4 == 0) goto L3b0
            goto L3b4
        L3b0:
            r20 = 3
            r4 = r5[r20]
        L3b4:
            r11.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            goto L3f3
        L3b8:
            if (r2 == 0) goto L3bb
            goto L3bf
        L3bb:
            r17 = 1
            r2 = r5[r17]
        L3bf:
            if (r4 == 0) goto L3c4
        L3c1:
            r24 = 2
            goto L3c7
        L3c4:
            r4 = r5[r20]
            goto L3c1
        L3c7:
            r1 = r5[r24]
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r6, r2, r1, r4)
            goto L3f3
        L3cd:
            android.graphics.drawable.Drawable[] r1 = r11.getCompoundDrawablesRelative()
            if (r5 == 0) goto L3d4
            goto L3d8
        L3d4:
            r18 = 0
            r5 = r1[r18]
        L3d8:
            if (r2 == 0) goto L3db
            goto L3df
        L3db:
            r17 = 1
            r2 = r1[r17]
        L3df:
            if (r22 == 0) goto L3e4
        L3e1:
            r3 = r22
            goto L3e9
        L3e4:
            r24 = 2
            r22 = r1[r24]
            goto L3e1
        L3e9:
            if (r4 == 0) goto L3ec
            goto L3f0
        L3ec:
            r20 = 3
            r4 = r1[r20]
        L3f0:
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r2, r3, r4)
        L3f3:
            r1 = 11
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L416
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L40f
            r5 = 0
            int r2 = r0.getResourceId(r1, r5)
            if (r2 == 0) goto L40f
            android.content.res.ColorStateList r2 = xhss.C0614.m1064(r12, r2)
            if (r2 == 0) goto L40f
            goto L413
        L40f:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r1)
        L413:
            r11.setCompoundDrawableTintList(r2)
        L416:
            r1 = 12
            boolean r2 = r0.hasValue(r1)
            r9 = -1
            if (r2 == 0) goto L42a
            int r1 = r0.getInt(r1, r9)
            android.graphics.PorterDuff$Mode r1 = xhss.AbstractC0365.m718(r1)
            r11.setCompoundDrawableTintMode(r1)
        L42a:
            r1 = 15
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r2 = 18
            int r2 = r0.getDimensionPixelSize(r2, r9)
            r3 = 19
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L45b
            android.util.TypedValue r4 = r0.peekValue(r3)
            if (r4 == 0) goto L453
            int r5 = r4.type
            r15 = 5
            if (r5 != r15) goto L453
            int r3 = r4.data
            r4 = r3 & 15
            float r3 = android.util.TypedValue.complexToFloat(r3)
            r9 = -1
            goto L45f
        L453:
            r9 = -1
            int r3 = r0.getDimensionPixelSize(r3, r9)
            float r3 = (float) r3
            r4 = r9
            goto L45f
        L45b:
            r9 = -1
            r4 = r9
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L45f:
            r0.recycle()
            if (r1 == r9) goto L470
            if (r1 < 0) goto L46a
            r11.setFirstBaselineToTopHeight(r1)
            goto L470
        L46a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L470:
            if (r2 == r9) goto L49d
            if (r2 < 0) goto L4a0
            android.text.TextPaint r0 = r11.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r11.getIncludeFontPadding()
            if (r1 == 0) goto L485
            int r0 = r0.bottom
            goto L487
        L485:
            int r0 = r0.descent
        L487:
            int r1 = java.lang.Math.abs(r0)
            if (r2 <= r1) goto L49d
            int r2 = r2 - r0
            int r0 = r11.getPaddingLeft()
            int r1 = r11.getPaddingTop()
            int r5 = r11.getPaddingRight()
            r11.setPadding(r0, r1, r5, r2)
        L49d:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L4a6
        L4a0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L4a6:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4cf
            r9 = -1
            if (r4 != r9) goto L4b2
            int r0 = (int) r3
            xhss.C0614.m1061(r11, r0)
            return
        L4b2:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L4bc
            xhss.AbstractC0449.m824(r11, r4, r3)
            return
        L4bc:
            android.content.res.Resources r0 = r11.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r4, r3, r0)
            int r0 = java.lang.Math.round(r0)
            xhss.C0614.m1061(r11, r0)
        L4cf:
            return
        L4d0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m1367(android.content.Context r10, xhss.C0623 r11) {
            r9 = this;
            int r0 = r9.f2605
            java.lang.Object r1 = r11.f2151
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 2
            int r0 = r1.getInt(r2, r0)
            r9.f2605 = r0
            r0 = 11
            r3 = -1
            int r0 = r1.getInt(r0, r3)
            r9.f2609 = r0
            if (r0 == r3) goto L1d
            int r0 = r9.f2605
            r0 = r0 & r2
            r9.f2605 = r0
        L1d:
            r0 = 10
            boolean r4 = r1.hasValue(r0)
            r5 = 1
            r6 = 12
            r7 = 0
            if (r4 != 0) goto L54
            boolean r4 = r1.hasValue(r6)
            if (r4 == 0) goto L30
            goto L54
        L30:
            boolean r10 = r1.hasValue(r5)
            if (r10 == 0) goto Lca
            r9.f2604 = r7
            int r10 = r1.getInt(r5, r5)
            if (r10 == r5) goto L4f
            if (r10 == r2) goto L4a
            r11 = 3
            if (r10 == r11) goto L45
            goto Lca
        L45:
            android.graphics.Typeface r10 = android.graphics.Typeface.MONOSPACE
            r9.f2601 = r10
            return
        L4a:
            android.graphics.Typeface r10 = android.graphics.Typeface.SERIF
            r9.f2601 = r10
            return
        L4f:
            android.graphics.Typeface r10 = android.graphics.Typeface.SANS_SERIF
            r9.f2601 = r10
            return
        L54:
            r4 = 0
            r9.f2601 = r4
            boolean r4 = r1.hasValue(r6)
            if (r4 == 0) goto L5e
            r0 = r6
        L5e:
            int r4 = r9.f2609
            int r6 = r9.f2605
            boolean r10 = r10.isRestricted()
            if (r10 != 0) goto La0
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            android.widget.TextView r8 = r9.f2600
            r10.<init>(r8)
            xhss.ᛷᲀᲇᲀ r8 = new xhss.ᛷᲀᲇᲀ
            r8.<init>(r9, r4, r6, r10)
            int r10 = r9.f2605     // Catch: java.lang.Throwable -> La0
            android.graphics.Typeface r10 = r11.m1100(r0, r10, r8)     // Catch: java.lang.Throwable -> La0
            if (r10 == 0) goto L97
            int r11 = r9.f2609     // Catch: java.lang.Throwable -> La0
            if (r11 == r3) goto L95
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r7)     // Catch: java.lang.Throwable -> La0
            int r11 = r9.f2609     // Catch: java.lang.Throwable -> La0
            int r4 = r9.f2605     // Catch: java.lang.Throwable -> La0
            r4 = r4 & r2
            if (r4 == 0) goto L8d
            r4 = r5
            goto L8e
        L8d:
            r4 = r7
        L8e:
            android.graphics.Typeface r10 = xhss.AbstractC0337.m682(r10, r11, r4)     // Catch: java.lang.Throwable -> La0
            r9.f2601 = r10     // Catch: java.lang.Throwable -> La0
            goto L97
        L95:
            r9.f2601 = r10     // Catch: java.lang.Throwable -> La0
        L97:
            android.graphics.Typeface r10 = r9.f2601     // Catch: java.lang.Throwable -> La0
            if (r10 != 0) goto L9d
            r10 = r5
            goto L9e
        L9d:
            r10 = r7
        L9e:
            r9.f2604 = r10     // Catch: java.lang.Throwable -> La0
        La0:
            android.graphics.Typeface r10 = r9.f2601
            if (r10 != 0) goto Lca
            java.lang.String r10 = r1.getString(r0)
            if (r10 == 0) goto Lca
            int r11 = r9.f2609
            if (r11 == r3) goto Lc2
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r7)
            int r11 = r9.f2609
            int r0 = r9.f2605
            r0 = r0 & r2
            if (r0 == 0) goto Lba
            goto Lbb
        Lba:
            r5 = r7
        Lbb:
            android.graphics.Typeface r10 = xhss.AbstractC0337.m682(r10, r11, r5)
            r9.f2601 = r10
            goto Lca
        Lc2:
            int r11 = r9.f2605
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r11)
            r9.f2601 = r10
        Lca:
            return
    }
}
