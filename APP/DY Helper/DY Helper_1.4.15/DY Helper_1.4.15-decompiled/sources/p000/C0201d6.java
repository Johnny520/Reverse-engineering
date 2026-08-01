package p000;

/* JADX INFO: renamed from: d6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0201d6 {

    /* JADX INFO: renamed from: α */
    public final android.widget.TextView f2907;

    /* JADX INFO: renamed from: β */
    public p000.C0630oo f2908;

    /* JADX INFO: renamed from: γ */
    public p000.C0630oo f2909;

    /* JADX INFO: renamed from: δ */
    public p000.C0630oo f2910;

    /* JADX INFO: renamed from: ε */
    public p000.C0630oo f2911;

    /* JADX INFO: renamed from: ζ */
    public p000.C0630oo f2912;

    /* JADX INFO: renamed from: η */
    public p000.C0630oo f2913;

    /* JADX INFO: renamed from: θ */
    public p000.C0630oo f2914;

    /* JADX INFO: renamed from: ι */
    public final p000.C0420j6 f2915;

    /* JADX INFO: renamed from: κ */
    public int f2916;

    /* JADX INFO: renamed from: λ */
    public int f2917;

    /* JADX INFO: renamed from: μ */
    public android.graphics.Typeface f2918;

    /* JADX INFO: renamed from: ν */
    public boolean f2919;

    public C0201d6(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2916 = r0
            r0 = -1
            r1.f2917 = r0
            r1.f2907 = r2
            j6 r0 = new j6
            r0.<init>(r2)
            r1.f2915 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public static p000.C0630oo m1656(android.content.Context r1, p000.C0419j5 r2, int r3) {
            monitor-enter(r2)
            tn1 r0 = r2.f5322     // Catch: java.lang.Throwable -> L17
            android.content.res.ColorStateList r1 = r0.m5726(r1, r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            if (r1 == 0) goto L15
            oo r2 = new oo
            r2.<init>()
            r3 = 1
            r2.f8164 = r3
            r2.f8165 = r1
            return r2
        L15:
            r1 = 0
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    /* JADX INFO: renamed from: α */
    public final void m1657(android.graphics.drawable.Drawable r1, p000.C0630oo r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            if (r2 == 0) goto Ld
            android.widget.TextView r0 = r0.f2907
            int[] r0 = r0.getDrawableState()
            p000.C0419j5.m2864(r1, r2, r0)
        Ld:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m1658() {
            r6 = this;
            oo r0 = r6.f2908
            r1 = 2
            r2 = 0
            android.widget.TextView r3 = r6.f2907
            if (r0 != 0) goto L14
            oo r0 = r6.f2909
            if (r0 != 0) goto L14
            oo r0 = r6.f2910
            if (r0 != 0) goto L14
            oo r0 = r6.f2911
            if (r0 == 0) goto L36
        L14:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawables()
            r4 = r0[r2]
            oo r5 = r6.f2908
            r6.m1657(r4, r5)
            r4 = 1
            r4 = r0[r4]
            oo r5 = r6.f2909
            r6.m1657(r4, r5)
            r4 = r0[r1]
            oo r5 = r6.f2910
            r6.m1657(r4, r5)
            r4 = 3
            r0 = r0[r4]
            oo r4 = r6.f2911
            r6.m1657(r0, r4)
        L36:
            oo r0 = r6.f2912
            if (r0 != 0) goto L40
            oo r0 = r6.f2913
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawablesRelative()
            r2 = r0[r2]
            oo r3 = r6.f2912
            r6.m1657(r2, r3)
            r0 = r0[r1]
            oo r1 = r6.f2913
            r6.m1657(r0, r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final android.content.res.ColorStateList m1659() {
            r0 = this;
            oo r0 = r0.f2914
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.f8165
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final android.graphics.PorterDuff.Mode m1660() {
            r0 = this;
            oo r0 = r0.f2914
            if (r0 == 0) goto L9
            java.io.Serializable r0 = r0.f8166
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final void m1661(android.util.AttributeSet r28, int r29) {
            r27 = this;
            r0 = r27
            r3 = r28
            r5 = r29
            android.widget.TextView r1 = r0.f2907
            android.content.Context r8 = r1.getContext()
            j5 r9 = p000.C0419j5.m2862()
            int[] r2 = p000.kk1.f5975
            m6 r10 = p000.C0538m6.m3752(r8, r3, r2, r5)
            r3 = r2
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r10.f6967
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r6 = p000.b92.f1572
            r7 = 0
            r6 = r5
            r5 = r4
            r4 = r28
            p000.y82.m6840(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            r3 = r4
            r5 = r6
            java.lang.Object r1 = r10.f6967
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r11 = 0
            r12 = -1
            int r2 = r1.getResourceId(r11, r12)
            r13 = 3
            boolean r4 = r1.hasValue(r13)
            if (r4 == 0) goto L47
            int r4 = r1.getResourceId(r13, r11)
            oo r4 = m1656(r8, r9, r4)
            r0.f2908 = r4
        L47:
            r14 = 1
            boolean r4 = r1.hasValue(r14)
            if (r4 == 0) goto L58
            int r4 = r1.getResourceId(r14, r11)
            oo r4 = m1656(r8, r9, r4)
            r0.f2909 = r4
        L58:
            r15 = 4
            boolean r4 = r1.hasValue(r15)
            if (r4 == 0) goto L69
            int r4 = r1.getResourceId(r15, r11)
            oo r4 = m1656(r8, r9, r4)
            r0.f2910 = r4
        L69:
            r4 = 2
            boolean r6 = r1.hasValue(r4)
            if (r6 == 0) goto L7a
            int r6 = r1.getResourceId(r4, r11)
            oo r6 = m1656(r8, r9, r6)
            r0.f2911 = r6
        L7a:
            r6 = 5
            boolean r16 = r1.hasValue(r6)
            if (r16 == 0) goto L8b
            int r4 = r1.getResourceId(r6, r11)
            oo r4 = m1656(r8, r9, r4)
            r0.f2912 = r4
        L8b:
            r4 = 6
            boolean r17 = r1.hasValue(r4)
            if (r17 == 0) goto L9c
            int r1 = r1.getResourceId(r4, r11)
            oo r1 = m1656(r8, r9, r1)
            r0.f2913 = r1
        L9c:
            r10.m3765()
            android.text.method.TransformationMethod r1 = r7.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            int[] r10 = p000.kk1.f5962
            r4 = 14
            r13 = 13
            r14 = 15
            if (r2 == r12) goto Led
            m6 r6 = new m6
            android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r2, r10)
            r6.<init>(r8, r2)
            if (r1 != 0) goto Lc9
            boolean r21 = r2.hasValue(r4)
            if (r21 == 0) goto Lc9
            boolean r21 = r2.getBoolean(r4, r11)
            r22 = r21
            r21 = 1
            goto Lcd
        Lc9:
            r21 = r11
            r22 = r21
        Lcd:
            r0.m1665(r8, r6)
            boolean r23 = r2.hasValue(r14)
            if (r23 == 0) goto Ldb
            java.lang.String r23 = r2.getString(r14)
            goto Ldd
        Ldb:
            r23 = 0
        Ldd:
            boolean r24 = r2.hasValue(r13)
            if (r24 == 0) goto Le8
            java.lang.String r2 = r2.getString(r13)
            goto Le9
        Le8:
            r2 = 0
        Le9:
            r6.m3765()
            goto Lf4
        Led:
            r21 = r11
            r22 = r21
            r2 = 0
            r23 = 0
        Lf4:
            m6 r6 = new m6
            android.content.res.TypedArray r10 = r8.obtainStyledAttributes(r3, r10, r5, r11)
            r6.<init>(r8, r10)
            if (r1 != 0) goto L10b
            boolean r24 = r10.hasValue(r4)
            if (r24 == 0) goto L10b
            boolean r22 = r10.getBoolean(r4, r11)
            r21 = 1
        L10b:
            r4 = r22
            boolean r22 = r10.hasValue(r14)
            if (r22 == 0) goto L117
            java.lang.String r23 = r10.getString(r14)
        L117:
            boolean r22 = r10.hasValue(r13)
            if (r22 == 0) goto L121
            java.lang.String r2 = r10.getString(r13)
        L121:
            boolean r22 = r10.hasValue(r11)
            r14 = 0
            if (r22 == 0) goto L131
            int r10 = r10.getDimensionPixelSize(r11, r12)
            if (r10 != 0) goto L131
            r7.setTextSize(r11, r14)
        L131:
            r0.m1665(r8, r6)
            r6.m3765()
            if (r1 != 0) goto L13e
            if (r21 == 0) goto L13e
            r7.setAllCaps(r4)
        L13e:
            android.graphics.Typeface r1 = r0.f2918
            if (r1 == 0) goto L14f
            int r4 = r0.f2917
            if (r4 != r12) goto L14c
            int r4 = r0.f2916
            r7.setTypeface(r1, r4)
            goto L14f
        L14c:
            r7.setTypeface(r1)
        L14f:
            if (r2 == 0) goto L154
            p000.AbstractC0066b6.m750(r7, r2)
        L154:
            if (r23 == 0) goto L15d
            android.os.LocaleList r1 = p000.AbstractC0007a6.m41(r23)
            p000.AbstractC0007a6.m42(r7, r1)
        L15d:
            j6 r10 = r0.f2915
            android.content.Context r0 = r10.f5340
            int[] r2 = p000.kk1.f5976
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r3, r2, r5, r11)
            r1 = r0
            android.widget.TextView r0 = r10.f5339
            r6 = r1
            android.content.Context r1 = r0.getContext()
            r21 = r6
            r6 = 0
            r16 = r14
            r14 = 2
            r15 = 5
            p000.y82.m6840(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = r4.hasValue(r15)
            if (r0 == 0) goto L185
            int r0 = r4.getInt(r15, r11)
            r10.f5333 = r0
        L185:
            r0 = 4
            boolean r1 = r4.hasValue(r0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L193
            float r0 = r4.getDimension(r0, r5)
            goto L194
        L193:
            r0 = r5
        L194:
            boolean r1 = r4.hasValue(r14)
            if (r1 == 0) goto L1a0
            float r1 = r4.getDimension(r14, r5)
        L19e:
            r6 = 1
            goto L1a2
        L1a0:
            r1 = r5
            goto L19e
        L1a2:
            boolean r19 = r4.hasValue(r6)
            if (r19 == 0) goto L1ae
            float r20 = r4.getDimension(r6, r5)
        L1ac:
            r6 = 3
            goto L1b1
        L1ae:
            r20 = r5
            goto L1ac
        L1b1:
            boolean r18 = r4.hasValue(r6)
            if (r18 == 0) goto L205
            int r15 = r4.getResourceId(r6, r11)
            if (r15 <= 0) goto L205
            android.content.res.Resources r6 = r4.getResources()
            android.content.res.TypedArray r6 = r6.obtainTypedArray(r15)
            int r15 = r6.length()
            int[] r13 = new int[r15]
            if (r15 <= 0) goto L1ff
            r25 = r11
        L1cf:
            if (r11 >= r15) goto L1da
            int r26 = r6.getDimensionPixelSize(r11, r12)
            r13[r11] = r26
            int r11 = r11 + 1
            goto L1cf
        L1da:
            int[] r11 = p000.C0420j6.m2866(r13)
            r10.f5337 = r11
            int r13 = r11.length
            if (r13 <= 0) goto L1e5
            r15 = 1
            goto L1e7
        L1e5:
            r15 = r25
        L1e7:
            r10.f5338 = r15
            if (r15 == 0) goto L201
            r15 = 1
            r10.f5333 = r15
            r19 = r15
            r15 = r11[r25]
            float r15 = (float) r15
            r10.f5335 = r15
            int r13 = r13 + (-1)
            r11 = r11[r13]
            float r11 = (float) r11
            r10.f5336 = r11
            r10.f5334 = r5
            goto L201
        L1ff:
            r25 = r11
        L201:
            r6.recycle()
            goto L207
        L205:
            r25 = r11
        L207:
            r4.recycle()
            boolean r4 = r10.m2867()
            if (r4 == 0) goto L2ea
            int r4 = r10.f5333
            r15 = 1
            if (r4 != r15) goto L2ee
            boolean r4 = r10.f5338
            if (r4 != 0) goto L2a8
            android.content.res.Resources r4 = r21.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 != 0) goto L22b
            r1 = 1094713344(0x41400000, float:12.0)
            float r1 = android.util.TypedValue.applyDimension(r14, r1, r4)
        L22b:
            int r6 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r6 != 0) goto L235
            r6 = 1121976320(0x42e00000, float:112.0)
            float r20 = android.util.TypedValue.applyDimension(r14, r6, r4)
        L235:
            r4 = r20
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 != 0) goto L23d
            r0 = 1065353216(0x3f800000, float:1.0)
        L23d:
            int r6 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            java.lang.String r11 = "px) is less or equal to (0px)"
            if (r6 <= 0) goto L291
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L270
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 <= 0) goto L259
            r15 = 1
            r10.f5333 = r15
            r10.f5335 = r1
            r10.f5336 = r4
            r10.f5334 = r0
            r0 = r25
            r10.f5338 = r0
            goto L2a8
        L259:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The auto-size step granularity ("
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L270:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Maximum auto-size text size ("
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = "px) is less or equal to minimum auto-size text size ("
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "px)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L291:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Minimum auto-size text size ("
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L2a8:
            boolean r0 = r10.m2867()
            if (r0 == 0) goto L2ee
            int r0 = r10.f5333
            r15 = 1
            if (r0 != r15) goto L2ee
            boolean r0 = r10.f5338
            if (r0 == 0) goto L2bc
            int[] r0 = r10.f5337
            int r0 = r0.length
            if (r0 != 0) goto L2ee
        L2bc:
            float r0 = r10.f5336
            float r1 = r10.f5335
            float r0 = r0 - r1
            float r1 = r10.f5334
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            r19 = 1
            int r0 = r0 + 1
            int[] r1 = new int[r0]
            r4 = 0
        L2d1:
            if (r4 >= r0) goto L2e3
            float r6 = r10.f5335
            float r11 = (float) r4
            float r13 = r10.f5334
            float r11 = r11 * r13
            float r11 = r11 + r6
            int r6 = java.lang.Math.round(r11)
            r1[r4] = r6
            int r4 = r4 + 1
            goto L2d1
        L2e3:
            int[] r0 = p000.C0420j6.m2866(r1)
            r10.f5337 = r0
            goto L2ee
        L2ea:
            r0 = r25
            r10.f5333 = r0
        L2ee:
            int r0 = r10.f5333
            if (r0 == 0) goto L31b
            int[] r0 = r10.f5337
            int r1 = r0.length
            if (r1 <= 0) goto L31b
            int r1 = p000.AbstractC0066b6.m747(r7)
            float r1 = (float) r1
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L317
            float r0 = r10.f5335
            int r0 = java.lang.Math.round(r0)
            float r1 = r10.f5336
            int r1 = java.lang.Math.round(r1)
            float r4 = r10.f5334
            int r4 = java.lang.Math.round(r4)
            r6 = 0
            p000.AbstractC0066b6.m748(r7, r0, r1, r4, r6)
            goto L31b
        L317:
            r6 = 0
            p000.AbstractC0066b6.m749(r7, r0, r6)
        L31b:
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r3, r2)
            r1 = 8
            int r1 = r0.getResourceId(r1, r12)
            if (r1 == r12) goto L32e
            android.graphics.drawable.Drawable r1 = r9.m2865(r8, r1)
        L32b:
            r2 = 13
            goto L330
        L32e:
            r1 = 0
            goto L32b
        L330:
            int r2 = r0.getResourceId(r2, r12)
            if (r2 == r12) goto L33b
            android.graphics.drawable.Drawable r2 = r9.m2865(r8, r2)
            goto L33c
        L33b:
            r2 = 0
        L33c:
            r3 = 9
            int r3 = r0.getResourceId(r3, r12)
            if (r3 == r12) goto L34a
            android.graphics.drawable.Drawable r3 = r9.m2865(r8, r3)
        L348:
            r4 = 6
            goto L34c
        L34a:
            r3 = 0
            goto L348
        L34c:
            int r4 = r0.getResourceId(r4, r12)
            if (r4 == r12) goto L357
            android.graphics.drawable.Drawable r4 = r9.m2865(r8, r4)
            goto L358
        L357:
            r4 = 0
        L358:
            r6 = 10
            int r6 = r0.getResourceId(r6, r12)
            if (r6 == r12) goto L365
            android.graphics.drawable.Drawable r6 = r9.m2865(r8, r6)
            goto L366
        L365:
            r6 = 0
        L366:
            r10 = 7
            int r10 = r0.getResourceId(r10, r12)
            if (r10 == r12) goto L372
            android.graphics.drawable.Drawable r9 = r9.m2865(r8, r10)
            goto L373
        L372:
            r9 = 0
        L373:
            if (r6 != 0) goto L3c3
            if (r9 == 0) goto L378
            goto L3c3
        L378:
            if (r1 != 0) goto L380
            if (r2 != 0) goto L380
            if (r3 != 0) goto L380
            if (r4 == 0) goto L3e4
        L380:
            android.graphics.drawable.Drawable[] r6 = r7.getCompoundDrawablesRelative()
            r25 = 0
            r9 = r6[r25]
            if (r9 != 0) goto L38e
            r10 = r6[r14]
            if (r10 == 0) goto L391
        L38e:
            r18 = 3
            goto L3b1
        L391:
            android.graphics.drawable.Drawable[] r6 = r7.getCompoundDrawables()
            if (r1 == 0) goto L398
            goto L39a
        L398:
            r1 = r6[r25]
        L39a:
            if (r2 == 0) goto L39d
            goto L3a1
        L39d:
            r19 = 1
            r2 = r6[r19]
        L3a1:
            if (r3 == 0) goto L3a4
            goto L3a6
        L3a4:
            r3 = r6[r14]
        L3a6:
            if (r4 == 0) goto L3a9
            goto L3ad
        L3a9:
            r18 = 3
            r4 = r6[r18]
        L3ad:
            r7.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            goto L3e4
        L3b1:
            if (r2 == 0) goto L3b4
            goto L3b8
        L3b4:
            r19 = 1
            r2 = r6[r19]
        L3b8:
            if (r4 == 0) goto L3bb
            goto L3bd
        L3bb:
            r4 = r6[r18]
        L3bd:
            r1 = r6[r14]
            r7.setCompoundDrawablesRelativeWithIntrinsicBounds(r9, r2, r1, r4)
            goto L3e4
        L3c3:
            android.graphics.drawable.Drawable[] r1 = r7.getCompoundDrawablesRelative()
            if (r6 == 0) goto L3ca
            goto L3ce
        L3ca:
            r25 = 0
            r6 = r1[r25]
        L3ce:
            if (r2 == 0) goto L3d1
            goto L3d5
        L3d1:
            r19 = 1
            r2 = r1[r19]
        L3d5:
            if (r9 == 0) goto L3d8
            goto L3da
        L3d8:
            r9 = r1[r14]
        L3da:
            if (r4 == 0) goto L3dd
            goto L3e1
        L3dd:
            r18 = 3
            r4 = r1[r18]
        L3e1:
            r7.setCompoundDrawablesRelativeWithIntrinsicBounds(r6, r2, r9, r4)
        L3e4:
            r1 = 11
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L407
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L400
            r6 = 0
            int r2 = r0.getResourceId(r1, r6)
            if (r2 == 0) goto L400
            android.content.res.ColorStateList r2 = p000.ln0.m3600(r8, r2)
            if (r2 == 0) goto L400
            goto L404
        L400:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r1)
        L404:
            r7.setCompoundDrawableTintList(r2)
        L407:
            r1 = 12
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L41b
            int r1 = r0.getInt(r1, r12)
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = p000.AbstractC0300fw.m2207(r1, r2)
            r7.setCompoundDrawableTintMode(r1)
        L41b:
            r1 = 15
            int r1 = r0.getDimensionPixelSize(r1, r12)
            r2 = 18
            int r2 = r0.getDimensionPixelSize(r2, r12)
            r3 = 19
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L44a
            android.util.TypedValue r4 = r0.peekValue(r3)
            if (r4 == 0) goto L443
            int r6 = r4.type
            r15 = 5
            if (r6 != r15) goto L443
            int r3 = r4.data
            r4 = r3 & 15
            float r3 = android.util.TypedValue.complexToFloat(r3)
            goto L44c
        L443:
            int r3 = r0.getDimensionPixelSize(r3, r12)
            float r3 = (float) r3
        L448:
            r4 = r12
            goto L44c
        L44a:
            r3 = r5
            goto L448
        L44c:
            r0.recycle()
            if (r1 == r12) goto L45d
            if (r1 < 0) goto L457
            r7.setFirstBaselineToTopHeight(r1)
            goto L45d
        L457:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L45d:
            if (r2 == r12) goto L491
            if (r2 < 0) goto L48b
            android.text.TextPaint r0 = r7.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r7.getIncludeFontPadding()
            if (r1 == 0) goto L472
            int r0 = r0.bottom
            goto L474
        L472:
            int r0 = r0.descent
        L474:
            int r1 = java.lang.Math.abs(r0)
            if (r2 <= r1) goto L491
            int r2 = r2 - r0
            int r0 = r7.getPaddingLeft()
            int r1 = r7.getPaddingTop()
            int r6 = r7.getPaddingRight()
            r7.setPadding(r0, r1, r6, r2)
            goto L491
        L48b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L491:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L4b9
            if (r4 != r12) goto L49c
            int r0 = (int) r3
            p000.v81.m6134(r7, r0)
            return
        L49c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L4a6
            p000.AbstractC1117.m7300(r7, r4, r3)
            return
        L4a6:
            android.content.res.Resources r0 = r7.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r4, r3, r0)
            int r0 = java.lang.Math.round(r0)
            p000.v81.m6134(r7, r0)
        L4b9:
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m1662(android.content.Context r6, int r7) {
            r5 = this;
            m6 r0 = new m6
            int[] r1 = p000.kk1.f5962
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
            r0.<init>(r6, r7)
            r1 = 14
            boolean r2 = r7.hasValue(r1)
            r3 = 0
            android.widget.TextView r4 = r5.f2907
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
            r5.m1665(r6, r0)
            r6 = 13
            boolean r1 = r7.hasValue(r6)
            if (r1 == 0) goto L42
            java.lang.String r6 = r7.getString(r6)
            if (r6 == 0) goto L42
            p000.AbstractC0066b6.m750(r4, r6)
        L42:
            r0.m3765()
            android.graphics.Typeface r6 = r5.f2918
            if (r6 == 0) goto L4e
            int r5 = r5.f2916
            r4.setTypeface(r6, r5)
        L4e:
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m1663(android.content.res.ColorStateList r2) {
            r1 = this;
            oo r0 = r1.f2914
            if (r0 != 0) goto Lb
            oo r0 = new oo
            r0.<init>()
            r1.f2914 = r0
        Lb:
            oo r0 = r1.f2914
            r0.f8165 = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.f8164 = r2
            r1.f2908 = r0
            r1.f2909 = r0
            r1.f2910 = r0
            r1.f2911 = r0
            r1.f2912 = r0
            r1.f2913 = r0
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m1664(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            oo r0 = r1.f2914
            if (r0 != 0) goto Lb
            oo r0 = new oo
            r0.<init>()
            r1.f2914 = r0
        Lb:
            oo r0 = r1.f2914
            r0.f8166 = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.f8163 = r2
            r1.f2908 = r0
            r1.f2909 = r0
            r1.f2910 = r0
            r1.f2911 = r0
            r1.f2912 = r0
            r1.f2913 = r0
            return
    }

    /* JADX INFO: renamed from: κ */
    public final void m1665(android.content.Context r10, p000.C0538m6 r11) {
            r9 = this;
            int r0 = r9.f2916
            java.lang.Object r1 = r11.f6967
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 2
            int r0 = r1.getInt(r2, r0)
            r9.f2916 = r0
            r0 = 11
            r3 = -1
            int r0 = r1.getInt(r0, r3)
            r9.f2917 = r0
            if (r0 == r3) goto L1d
            int r0 = r9.f2916
            r0 = r0 & r2
            r9.f2916 = r0
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
            r9.f2919 = r7
            int r10 = r1.getInt(r5, r5)
            if (r10 == r5) goto L4f
            if (r10 == r2) goto L4a
            r11 = 3
            if (r10 == r11) goto L45
            goto Lca
        L45:
            android.graphics.Typeface r10 = android.graphics.Typeface.MONOSPACE
            r9.f2918 = r10
            return
        L4a:
            android.graphics.Typeface r10 = android.graphics.Typeface.SERIF
            r9.f2918 = r10
            return
        L4f:
            android.graphics.Typeface r10 = android.graphics.Typeface.SANS_SERIF
            r9.f2918 = r10
            return
        L54:
            r4 = 0
            r9.f2918 = r4
            boolean r4 = r1.hasValue(r6)
            if (r4 == 0) goto L5e
            r0 = r6
        L5e:
            int r4 = r9.f2917
            int r6 = r9.f2916
            boolean r10 = r10.isRestricted()
            if (r10 != 0) goto La0
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            android.widget.TextView r8 = r9.f2907
            r10.<init>(r8)
            y5 r8 = new y5
            r8.<init>(r9, r4, r6, r10)
            int r10 = r9.f2916     // Catch: java.lang.Throwable -> La0
            android.graphics.Typeface r10 = r11.m3756(r0, r10, r8)     // Catch: java.lang.Throwable -> La0
            if (r10 == 0) goto L97
            int r11 = r9.f2917     // Catch: java.lang.Throwable -> La0
            if (r11 == r3) goto L95
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r7)     // Catch: java.lang.Throwable -> La0
            int r11 = r9.f2917     // Catch: java.lang.Throwable -> La0
            int r4 = r9.f2916     // Catch: java.lang.Throwable -> La0
            r4 = r4 & r2
            if (r4 == 0) goto L8d
            r4 = r5
            goto L8e
        L8d:
            r4 = r7
        L8e:
            android.graphics.Typeface r10 = p000.AbstractC0102c6.m1143(r10, r11, r4)     // Catch: java.lang.Throwable -> La0
            r9.f2918 = r10     // Catch: java.lang.Throwable -> La0
            goto L97
        L95:
            r9.f2918 = r10     // Catch: java.lang.Throwable -> La0
        L97:
            android.graphics.Typeface r10 = r9.f2918     // Catch: java.lang.Throwable -> La0
            if (r10 != 0) goto L9d
            r10 = r5
            goto L9e
        L9d:
            r10 = r7
        L9e:
            r9.f2919 = r10     // Catch: java.lang.Throwable -> La0
        La0:
            android.graphics.Typeface r10 = r9.f2918
            if (r10 != 0) goto Lca
            java.lang.String r10 = r1.getString(r0)
            if (r10 == 0) goto Lca
            int r11 = r9.f2917
            if (r11 == r3) goto Lc2
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r7)
            int r11 = r9.f2917
            int r0 = r9.f2916
            r0 = r0 & r2
            if (r0 == 0) goto Lba
            goto Lbb
        Lba:
            r5 = r7
        Lbb:
            android.graphics.Typeface r10 = p000.AbstractC0102c6.m1143(r10, r11, r5)
            r9.f2918 = r10
            goto Lca
        Lc2:
            int r11 = r9.f2916
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r11)
            r9.f2918 = r10
        Lca:
            return
    }
}
