package defpackage;

/* JADX INFO: renamed from: ᛶᲈᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1181 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C0340 f5357;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f5358;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public android.graphics.Typeface f5359;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C0252 f5360;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0340 f5361;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f5362;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C0340 f5363;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0340 f5364;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.widget.TextView f5365;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f5366;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.C0340 f5367;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0340 f5368;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0340 f5369;

    public C1181(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5366 = r0
            r0 = -1
            r1.f5358 = r0
            r1.f5365 = r2
            ᛲᛲᛵᲀ r0 = new ᛲᛲᛵᲀ
            r0.<init>(r2)
            r1.f5360 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0340 m2302(android.content.Context r1, defpackage.C0844 r2, int r3) {
            monitor-enter(r2)
            ᲇᛶᛸᲈ r0 = r2.f3870     // Catch: java.lang.Throwable -> L17
            android.content.res.ColorStateList r1 = r0.m3485(r1, r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            if (r1 == 0) goto L15
            ᛲᛸᲀᲁ r2 = new ᛲᛸᲀᲁ
            r2.<init>()
            r3 = 1
            r2.f1740 = r3
            r2.f1738 = r1
            return r2
        L15:
            r1 = 0
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m2303(android.content.res.ColorStateList r3) {
            r2 = this;
            ᛲᛸᲀᲁ r0 = r2.f5357
            if (r0 != 0) goto Lb
            ᛲᛸᲀᲁ r0 = new ᛲᛸᲀᲁ
            r0.<init>()
            r2.f5357 = r0
        Lb:
            r1 = r0
            r0.f1738 = r3
            if (r3 == 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            r0.f1740 = r3
            r2.f5367 = r1
            r2.f5364 = r1
            r2.f5363 = r1
            r2.f5361 = r1
            r2.f5368 = r1
            r2.f5369 = r1
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m2304(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            ᛲᛸᲀᲁ r0 = r2.f5357
            if (r0 != 0) goto Lb
            ᛲᛸᲀᲁ r0 = new ᛲᛸᲀᲁ
            r0.<init>()
            r2.f5357 = r0
        Lb:
            r1 = r0
            r0.f1737 = r3
            if (r3 == 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            r0.f1739 = r3
            r2.f5367 = r1
            r2.f5364 = r1
            r2.f5363 = r1
            r2.f5361 = r1
            r2.f5368 = r1
            r2.f5369 = r1
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final android.graphics.PorterDuff.Mode m2305() {
            r0 = this;
            ᛲᛸᲀᲁ r0 = r0.f5357
            if (r0 == 0) goto L9
            java.io.Serializable r0 = r0.f1737
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.res.ColorStateList m2306() {
            r0 = this;
            ᛲᛸᲀᲁ r0 = r0.f5357
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.f1738
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2307(android.graphics.drawable.Drawable r2, defpackage.C0340 r3) {
            r1 = this;
            if (r2 == 0) goto Lf
            if (r3 == 0) goto Lf
            android.widget.TextView r1 = r1.f5365
            int[] r1 = r1.getDrawableState()
            android.graphics.PorterDuff$Mode r0 = defpackage.C0844.f3869
            defpackage.C2070.m3477(r2, r3, r1)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void m2308(android.content.Context r10, defpackage.C1326 r11) {
            r9 = this;
            int r0 = r9.f5366
            java.lang.Object r1 = r11.f5856
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 2
            int r0 = r1.getInt(r2, r0)
            r9.f5366 = r0
            r0 = 11
            r3 = -1
            int r0 = r1.getInt(r0, r3)
            r9.f5358 = r0
            if (r0 == r3) goto L1d
            int r0 = r9.f5366
            r0 = r0 & r2
            r9.f5366 = r0
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
            r9.f5362 = r7
            int r10 = r1.getInt(r5, r5)
            if (r10 == r5) goto L4f
            if (r10 == r2) goto L4a
            r11 = 3
            if (r10 == r11) goto L45
            goto Lca
        L45:
            android.graphics.Typeface r10 = android.graphics.Typeface.MONOSPACE
            r9.f5359 = r10
            return
        L4a:
            android.graphics.Typeface r10 = android.graphics.Typeface.SERIF
            r9.f5359 = r10
            return
        L4f:
            android.graphics.Typeface r10 = android.graphics.Typeface.SANS_SERIF
            r9.f5359 = r10
            return
        L54:
            r4 = 0
            r9.f5359 = r4
            boolean r4 = r1.hasValue(r6)
            if (r4 == 0) goto L5e
            r0 = r6
        L5e:
            int r4 = r9.f5358
            int r6 = r9.f5366
            boolean r10 = r10.isRestricted()
            if (r10 != 0) goto La0
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            android.widget.TextView r8 = r9.f5365
            r10.<init>(r8)
            ᛲᲈᛸᛷ r8 = new ᛲᲈᛸᛷ
            r8.<init>(r9, r4, r6, r10)
            int r10 = r9.f5366     // Catch: java.lang.Throwable -> La0
            android.graphics.Typeface r10 = r11.m2473(r0, r10, r8)     // Catch: java.lang.Throwable -> La0
            if (r10 == 0) goto L97
            int r11 = r9.f5358     // Catch: java.lang.Throwable -> La0
            if (r11 == r3) goto L95
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r7)     // Catch: java.lang.Throwable -> La0
            int r11 = r9.f5358     // Catch: java.lang.Throwable -> La0
            int r4 = r9.f5366     // Catch: java.lang.Throwable -> La0
            r4 = r4 & r2
            if (r4 == 0) goto L8d
            r4 = r5
            goto L8e
        L8d:
            r4 = r7
        L8e:
            android.graphics.Typeface r10 = defpackage.AbstractC1030.m1984(r10, r11, r4)     // Catch: java.lang.Throwable -> La0
            r9.f5359 = r10     // Catch: java.lang.Throwable -> La0
            goto L97
        L95:
            r9.f5359 = r10     // Catch: java.lang.Throwable -> La0
        L97:
            android.graphics.Typeface r10 = r9.f5359     // Catch: java.lang.Throwable -> La0
            if (r10 != 0) goto L9d
            r10 = r5
            goto L9e
        L9d:
            r10 = r7
        L9e:
            r9.f5362 = r10     // Catch: java.lang.Throwable -> La0
        La0:
            android.graphics.Typeface r10 = r9.f5359
            if (r10 != 0) goto Lca
            java.lang.String r10 = r1.getString(r0)
            if (r10 == 0) goto Lca
            int r11 = r9.f5358
            if (r11 == r3) goto Lc2
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r7)
            int r11 = r9.f5358
            int r0 = r9.f5366
            r0 = r0 & r2
            if (r0 == 0) goto Lba
            goto Lbb
        Lba:
            r5 = r7
        Lbb:
            android.graphics.Typeface r10 = defpackage.AbstractC1030.m1984(r10, r11, r5)
            r9.f5359 = r10
            goto Lca
        Lc2:
            int r11 = r9.f5366
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r11)
            r9.f5359 = r10
        Lca:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m2309() {
            r6 = this;
            ᛲᛸᲀᲁ r0 = r6.f5367
            r1 = 2
            r2 = 0
            android.widget.TextView r3 = r6.f5365
            if (r0 != 0) goto L14
            ᛲᛸᲀᲁ r0 = r6.f5364
            if (r0 != 0) goto L14
            ᛲᛸᲀᲁ r0 = r6.f5363
            if (r0 != 0) goto L14
            ᛲᛸᲀᲁ r0 = r6.f5361
            if (r0 == 0) goto L36
        L14:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawables()
            r4 = r0[r2]
            ᛲᛸᲀᲁ r5 = r6.f5367
            r6.m2307(r4, r5)
            r4 = 1
            r4 = r0[r4]
            ᛲᛸᲀᲁ r5 = r6.f5364
            r6.m2307(r4, r5)
            r4 = r0[r1]
            ᛲᛸᲀᲁ r5 = r6.f5363
            r6.m2307(r4, r5)
            r4 = 3
            r0 = r0[r4]
            ᛲᛸᲀᲁ r4 = r6.f5361
            r6.m2307(r0, r4)
        L36:
            ᛲᛸᲀᲁ r0 = r6.f5368
            if (r0 != 0) goto L40
            ᛲᛸᲀᲁ r0 = r6.f5369
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            android.graphics.drawable.Drawable[] r0 = defpackage.AbstractC0681.m1531(r3)
            r2 = r0[r2]
            ᛲᛸᲀᲁ r3 = r6.f5368
            r6.m2307(r2, r3)
            r0 = r0[r1]
            ᛲᛸᲀᲁ r1 = r6.f5369
            r6.m2307(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m2310(android.util.AttributeSet r26, int r27) {
            r25 = this;
            r0 = r25
            r3 = r26
            r5 = r27
            android.widget.TextView r1 = r0.f5365
            android.content.Context r8 = r1.getContext()
            ᛵᛲᲈᛲ r9 = defpackage.C0844.m1774()
            int[] r2 = defpackage.AbstractC1070.f4779
            ᛷᛸᛱᛸ r10 = defpackage.C1326.m2454(r8, r3, r2, r5)
            r3 = r2
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r10.f5856
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r6 = defpackage.AbstractC0858.f3911
            r7 = 0
            r6 = r5
            r5 = r4
            r4 = r26
            defpackage.AbstractC0756.m1676(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            r3 = r4
            r5 = r6
            java.lang.Object r1 = r10.f5856
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r11 = 0
            r12 = -1
            int r2 = r1.getResourceId(r11, r12)
            r13 = 3
            boolean r4 = r1.hasValue(r13)
            if (r4 == 0) goto L47
            int r4 = r1.getResourceId(r13, r11)
            ᛲᛸᲀᲁ r4 = m2302(r8, r9, r4)
            r0.f5367 = r4
        L47:
            r14 = 1
            boolean r4 = r1.hasValue(r14)
            if (r4 == 0) goto L58
            int r4 = r1.getResourceId(r14, r11)
            ᛲᛸᲀᲁ r4 = m2302(r8, r9, r4)
            r0.f5364 = r4
        L58:
            r15 = 4
            boolean r4 = r1.hasValue(r15)
            if (r4 == 0) goto L69
            int r4 = r1.getResourceId(r15, r11)
            ᛲᛸᲀᲁ r4 = m2302(r8, r9, r4)
            r0.f5363 = r4
        L69:
            r4 = 2
            boolean r6 = r1.hasValue(r4)
            if (r6 == 0) goto L7a
            int r6 = r1.getResourceId(r4, r11)
            ᛲᛸᲀᲁ r6 = m2302(r8, r9, r6)
            r0.f5361 = r6
        L7a:
            r6 = 5
            boolean r16 = r1.hasValue(r6)
            if (r16 == 0) goto L8b
            int r4 = r1.getResourceId(r6, r11)
            ᛲᛸᲀᲁ r4 = m2302(r8, r9, r4)
            r0.f5368 = r4
        L8b:
            r4 = 6
            boolean r17 = r1.hasValue(r4)
            if (r17 == 0) goto L9c
            int r1 = r1.getResourceId(r4, r11)
            ᛲᛸᲀᲁ r1 = m2302(r8, r9, r1)
            r0.f5369 = r1
        L9c:
            r10.m2469()
            android.text.method.TransformationMethod r1 = r7.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            int[] r10 = defpackage.AbstractC1070.f4795
            r4 = 14
            r13 = 13
            r14 = 15
            if (r2 == r12) goto Led
            ᛷᛸᛱᛸ r6 = new ᛷᛸᛱᛸ
            android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r2, r10)
            r6.<init>(r8, r2)
            if (r1 != 0) goto Lc9
            boolean r20 = r2.hasValue(r4)
            if (r20 == 0) goto Lc9
            boolean r20 = r2.getBoolean(r4, r11)
            r21 = r20
            r20 = 1
            goto Lcd
        Lc9:
            r20 = r11
            r21 = r20
        Lcd:
            r0.m2308(r8, r6)
            boolean r22 = r2.hasValue(r14)
            if (r22 == 0) goto Ldb
            java.lang.String r22 = r2.getString(r14)
            goto Ldd
        Ldb:
            r22 = 0
        Ldd:
            boolean r23 = r2.hasValue(r13)
            if (r23 == 0) goto Le8
            java.lang.String r2 = r2.getString(r13)
            goto Le9
        Le8:
            r2 = 0
        Le9:
            r6.m2469()
            goto Lf4
        Led:
            r20 = r11
            r21 = r20
            r2 = 0
            r22 = 0
        Lf4:
            ᛷᛸᛱᛸ r6 = new ᛷᛸᛱᛸ
            android.content.res.TypedArray r10 = r8.obtainStyledAttributes(r3, r10, r5, r11)
            r6.<init>(r8, r10)
            if (r1 != 0) goto L10b
            boolean r23 = r10.hasValue(r4)
            if (r23 == 0) goto L10b
            boolean r21 = r10.getBoolean(r4, r11)
            r20 = 1
        L10b:
            r4 = r21
            boolean r21 = r10.hasValue(r14)
            if (r21 == 0) goto L117
            java.lang.String r22 = r10.getString(r14)
        L117:
            boolean r21 = r10.hasValue(r13)
            if (r21 == 0) goto L121
            java.lang.String r2 = r10.getString(r13)
        L121:
            boolean r21 = r10.hasValue(r11)
            r14 = 0
            if (r21 == 0) goto L131
            int r10 = r10.getDimensionPixelSize(r11, r12)
            if (r10 != 0) goto L131
            r7.setTextSize(r11, r14)
        L131:
            r0.m2308(r8, r6)
            r6.m2469()
            if (r1 != 0) goto L13e
            if (r20 == 0) goto L13e
            r7.setAllCaps(r4)
        L13e:
            android.graphics.Typeface r1 = r0.f5359
            if (r1 == 0) goto L14f
            int r4 = r0.f5358
            if (r4 != r12) goto L14c
            int r4 = r0.f5366
            r7.setTypeface(r1, r4)
            goto L14f
        L14c:
            r7.setTypeface(r1)
        L14f:
            if (r2 == 0) goto L154
            defpackage.AbstractC0714.m1619(r7, r2)
        L154:
            if (r22 == 0) goto L15d
            android.os.LocaleList r1 = defpackage.AbstractC2366.m3874(r22)
            defpackage.AbstractC2366.m3875(r7, r1)
        L15d:
            ᛲᛲᛵᲀ r10 = r0.f5360
            android.content.Context r0 = r10.f1469
            int[] r2 = defpackage.AbstractC1070.f4782
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r3, r2, r5, r11)
            r1 = r0
            android.widget.TextView r0 = r10.f1476
            r6 = r1
            android.content.Context r1 = r0.getContext()
            r20 = r6
            r6 = 0
            r16 = r14
            r14 = 2
            r15 = 5
            defpackage.AbstractC0756.m1676(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = r4.hasValue(r15)
            if (r0 == 0) goto L185
            int r0 = r4.getInt(r15, r11)
            r10.f1473 = r0
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
            boolean r15 = r4.hasValue(r6)
            if (r15 == 0) goto L1ae
            float r15 = r4.getDimension(r6, r5)
        L1ac:
            r6 = 3
            goto L1b0
        L1ae:
            r15 = r5
            goto L1ac
        L1b0:
            boolean r18 = r4.hasValue(r6)
            if (r18 == 0) goto L203
            int r13 = r4.getResourceId(r6, r11)
            if (r13 <= 0) goto L203
            android.content.res.Resources r6 = r4.getResources()
            android.content.res.TypedArray r6 = r6.obtainTypedArray(r13)
            int r13 = r6.length()
            r21 = r11
            int[] r11 = new int[r13]
            if (r13 <= 0) goto L1ff
            r14 = r21
        L1d0:
            if (r14 >= r13) goto L1db
            int r24 = r6.getDimensionPixelSize(r14, r12)
            r11[r14] = r24
            int r14 = r14 + 1
            goto L1d0
        L1db:
            int[] r11 = defpackage.C0252.m875(r11)
            r10.f1470 = r11
            int r13 = r11.length
            if (r13 <= 0) goto L1e6
            r14 = 1
            goto L1e8
        L1e6:
            r14 = r21
        L1e8:
            r10.f1475 = r14
            if (r14 == 0) goto L1ff
            r14 = 1
            r10.f1473 = r14
            r19 = r14
            r14 = r11[r21]
            float r14 = (float) r14
            r10.f1472 = r14
            int r13 = r13 + (-1)
            r11 = r11[r13]
            float r11 = (float) r11
            r10.f1471 = r11
            r10.f1474 = r5
        L1ff:
            r6.recycle()
            goto L205
        L203:
            r21 = r11
        L205:
            r4.recycle()
            boolean r4 = r10.m876()
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L2ea
            int r4 = r10.f1473
            r14 = 1
            if (r4 != r14) goto L2ee
            boolean r4 = r10.f1475
            if (r4 != 0) goto L2a8
            android.content.res.Resources r4 = r20.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 != 0) goto L22d
            r1 = 1094713344(0x41400000, float:12.0)
            r14 = 2
            float r1 = android.util.TypedValue.applyDimension(r14, r1, r4)
            goto L22e
        L22d:
            r14 = 2
        L22e:
            int r11 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r11 != 0) goto L238
            r11 = 1121976320(0x42e00000, float:112.0)
            float r15 = android.util.TypedValue.applyDimension(r14, r11, r4)
        L238:
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 != 0) goto L23d
            r0 = r6
        L23d:
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            java.lang.String r11 = "px) is less or equal to (0px)"
            if (r4 <= 0) goto L291
            int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r4 <= 0) goto L270
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 <= 0) goto L259
            r14 = 1
            r10.f1473 = r14
            r10.f1472 = r1
            r10.f1471 = r15
            r10.f1474 = r0
            r0 = r21
            r10.f1475 = r0
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
            r2.append(r15)
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
            boolean r0 = r10.m876()
            if (r0 == 0) goto L2ee
            int r0 = r10.f1473
            r14 = 1
            if (r0 != r14) goto L2ee
            boolean r0 = r10.f1475
            if (r0 == 0) goto L2bc
            int[] r0 = r10.f1470
            int r0 = r0.length
            if (r0 != 0) goto L2ee
        L2bc:
            float r0 = r10.f1471
            float r1 = r10.f1472
            float r0 = r0 - r1
            float r1 = r10.f1474
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
            float r11 = r10.f1472
            float r13 = (float) r4
            float r14 = r10.f1474
            float r13 = r13 * r14
            float r13 = r13 + r11
            int r11 = java.lang.Math.round(r13)
            r1[r4] = r11
            int r4 = r4 + 1
            goto L2d1
        L2e3:
            int[] r0 = defpackage.C0252.m875(r1)
            r10.f1470 = r0
            goto L2ee
        L2ea:
            r0 = r21
            r10.f1473 = r0
        L2ee:
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            int r0 = r10.f1473
            if (r0 == 0) goto L31d
            int[] r0 = r10.f1470
            int r1 = r0.length
            if (r1 <= 0) goto L31d
            int r1 = defpackage.AbstractC0714.m1621(r7)
            float r1 = (float) r1
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L319
            float r0 = r10.f1472
            int r0 = java.lang.Math.round(r0)
            float r1 = r10.f1471
            int r1 = java.lang.Math.round(r1)
            float r4 = r10.f1474
            int r4 = java.lang.Math.round(r4)
            r5 = 0
            defpackage.AbstractC0714.m1622(r7, r0, r1, r4, r5)
            goto L31d
        L319:
            r5 = 0
            defpackage.AbstractC0714.m1620(r7, r0, r5)
        L31d:
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r3, r2)
            r1 = 8
            int r1 = r0.getResourceId(r1, r12)
            if (r1 == r12) goto L330
            android.graphics.drawable.Drawable r1 = r9.m1775(r8, r1)
        L32d:
            r2 = 13
            goto L332
        L330:
            r1 = 0
            goto L32d
        L332:
            int r2 = r0.getResourceId(r2, r12)
            if (r2 == r12) goto L33d
            android.graphics.drawable.Drawable r2 = r9.m1775(r8, r2)
            goto L33e
        L33d:
            r2 = 0
        L33e:
            r3 = 9
            int r3 = r0.getResourceId(r3, r12)
            if (r3 == r12) goto L34c
            android.graphics.drawable.Drawable r3 = r9.m1775(r8, r3)
        L34a:
            r4 = 6
            goto L34e
        L34c:
            r3 = 0
            goto L34a
        L34e:
            int r4 = r0.getResourceId(r4, r12)
            if (r4 == r12) goto L359
            android.graphics.drawable.Drawable r4 = r9.m1775(r8, r4)
            goto L35a
        L359:
            r4 = 0
        L35a:
            r5 = 10
            int r5 = r0.getResourceId(r5, r12)
            if (r5 == r12) goto L367
            android.graphics.drawable.Drawable r5 = r9.m1775(r8, r5)
            goto L368
        L367:
            r5 = 0
        L368:
            r10 = 7
            int r10 = r0.getResourceId(r10, r12)
            if (r10 == r12) goto L374
            android.graphics.drawable.Drawable r9 = r9.m1775(r8, r10)
            goto L375
        L374:
            r9 = 0
        L375:
            if (r5 != 0) goto L3cc
            if (r9 == 0) goto L37a
            goto L3cc
        L37a:
            if (r1 != 0) goto L382
            if (r2 != 0) goto L382
            if (r3 != 0) goto L382
            if (r4 == 0) goto L3ef
        L382:
            android.graphics.drawable.Drawable[] r5 = defpackage.AbstractC0681.m1531(r7)
            r21 = 0
            r9 = r5[r21]
            if (r9 != 0) goto L3b5
            r22 = 2
            r10 = r5[r22]
            if (r10 == 0) goto L393
            goto L3b5
        L393:
            android.graphics.drawable.Drawable[] r5 = r7.getCompoundDrawables()
            if (r1 == 0) goto L39a
            goto L39c
        L39a:
            r1 = r5[r21]
        L39c:
            if (r2 == 0) goto L39f
            goto L3a3
        L39f:
            r19 = 1
            r2 = r5[r19]
        L3a3:
            if (r3 == 0) goto L3a6
            goto L3aa
        L3a6:
            r22 = 2
            r3 = r5[r22]
        L3aa:
            if (r4 == 0) goto L3ad
            goto L3b1
        L3ad:
            r18 = 3
            r4 = r5[r18]
        L3b1:
            r7.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            goto L3ef
        L3b5:
            if (r2 == 0) goto L3ba
        L3b7:
            r22 = 2
            goto L3bf
        L3ba:
            r19 = 1
            r2 = r5[r19]
            goto L3b7
        L3bf:
            r1 = r5[r22]
            if (r4 == 0) goto L3c4
            goto L3c8
        L3c4:
            r18 = 3
            r4 = r5[r18]
        L3c8:
            defpackage.AbstractC0681.m1532(r7, r9, r2, r1, r4)
            goto L3ef
        L3cc:
            android.graphics.drawable.Drawable[] r1 = defpackage.AbstractC0681.m1531(r7)
            if (r5 == 0) goto L3d3
            goto L3d7
        L3d3:
            r21 = 0
            r5 = r1[r21]
        L3d7:
            if (r2 == 0) goto L3da
            goto L3de
        L3da:
            r19 = 1
            r2 = r1[r19]
        L3de:
            if (r9 == 0) goto L3e1
            goto L3e5
        L3e1:
            r22 = 2
            r9 = r1[r22]
        L3e5:
            if (r4 == 0) goto L3e8
            goto L3ec
        L3e8:
            r18 = 3
            r4 = r1[r18]
        L3ec:
            defpackage.AbstractC0681.m1532(r7, r5, r2, r9, r4)
        L3ef:
            r1 = 11
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L412
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L40b
            r5 = 0
            int r2 = r0.getResourceId(r1, r5)
            if (r2 == 0) goto L40b
            android.content.res.ColorStateList r2 = defpackage.AbstractC2279.m3698(r8, r2)
            if (r2 == 0) goto L40b
            goto L40f
        L40b:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r1)
        L40f:
            r7.setCompoundDrawableTintList(r2)
        L412:
            r1 = 12
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L426
            int r1 = r0.getInt(r1, r12)
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = defpackage.AbstractC1660.m3053(r1, r2)
            r7.setCompoundDrawableTintMode(r1)
        L426:
            r1 = 15
            int r1 = r0.getDimensionPixelSize(r1, r12)
            r2 = 18
            int r2 = r0.getDimensionPixelSize(r2, r12)
            r3 = 19
            int r3 = r0.getDimensionPixelSize(r3, r12)
            r0.recycle()
            if (r1 == r12) goto L447
            if (r1 < 0) goto L443
            r7.setFirstBaselineToTopHeight(r1)
            goto L447
        L443:
            defpackage.C0086.m557()
            return
        L447:
            if (r2 == r12) goto L479
            if (r2 < 0) goto L475
            android.text.TextPaint r0 = r7.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = r7.getIncludeFontPadding()
            if (r1 == 0) goto L45c
            int r0 = r0.bottom
            goto L45e
        L45c:
            int r0 = r0.descent
        L45e:
            int r1 = java.lang.Math.abs(r0)
            if (r2 <= r1) goto L479
            int r2 = r2 - r0
            int r0 = r7.getPaddingLeft()
            int r1 = r7.getPaddingTop()
            int r4 = r7.getPaddingRight()
            r7.setPadding(r0, r1, r4, r2)
            goto L479
        L475:
            defpackage.C0086.m557()
            return
        L479:
            if (r3 == r12) goto L491
            if (r3 < 0) goto L48e
            android.text.TextPaint r0 = r7.getPaint()
            r2 = 0
            int r0 = r0.getFontMetricsInt(r2)
            if (r3 == r0) goto L491
            int r3 = r3 - r0
            float r0 = (float) r3
            r7.setLineSpacing(r0, r6)
            return
        L48e:
            defpackage.C0086.m557()
        L491:
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m2311(android.content.Context r6, int r7) {
            r5 = this;
            ᛷᛸᛱᛸ r0 = new ᛷᛸᛱᛸ
            int[] r1 = defpackage.AbstractC1070.f4795
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
            r0.<init>(r6, r7)
            r1 = 14
            boolean r2 = r7.hasValue(r1)
            r3 = 0
            android.widget.TextView r4 = r5.f5365
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
            r5.m2308(r6, r0)
            r6 = 13
            boolean r1 = r7.hasValue(r6)
            if (r1 == 0) goto L42
            java.lang.String r6 = r7.getString(r6)
            if (r6 == 0) goto L42
            defpackage.AbstractC0714.m1619(r4, r6)
        L42:
            r0.m2469()
            android.graphics.Typeface r6 = r5.f5359
            if (r6 == 0) goto L4e
            int r5 = r5.f5366
            r4.setTypeface(r6, r5)
        L4e:
            return
    }
}
