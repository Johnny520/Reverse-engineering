package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲈᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0117 {

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final xhss.C0364 f501 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static xhss.C0117 f502;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final android.graphics.PorterDuff.Mode f503 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.WeakHashMap f504;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public android.util.TypedValue f505;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0246 f506;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public java.util.WeakHashMap f507;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f508;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            xhss.C0117.f503 = r0
            xhss.ᛴᛵᛵᛶ r0 = new xhss.ᛴᛵᛵᛶ
            r1 = 6
            r0.<init>(r1)
            xhss.C0117.f501 = r0
            return
    }

    public C0117() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.f504 = r0
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static synchronized xhss.C0117 m310() {
            java.lang.Class<xhss.ᛱᲈᲁᛴ> r0 = xhss.C0117.class
            monitor-enter(r0)
            xhss.ᛱᲈᲁᛴ r1 = xhss.C0117.f502     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            xhss.ᛱᲈᲁᛴ r1 = new xhss.ᛱᲈᲁᛴ     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            xhss.C0117.f502 = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L13
        L11:
            monitor-exit(r0)
            return r1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static void m311(android.graphics.drawable.Drawable r4, xhss.C0451 r5, int[] r6) {
            int[] r0 = r4.getState()
            android.graphics.drawable.Drawable r1 = r4.mutate()
            if (r1 != r4) goto L4e
            boolean r1 = r4 instanceof android.graphics.drawable.LayerDrawable
            r2 = 0
            if (r1 == 0) goto L1d
            boolean r1 = r4.isStateful()
            if (r1 == 0) goto L1d
            int[] r1 = new int[r2]
            r4.setState(r1)
            r4.setState(r0)
        L1d:
            boolean r0 = r5.f1630
            if (r0 != 0) goto L2a
            boolean r1 = r5.f1632
            if (r1 == 0) goto L26
            goto L2a
        L26:
            r4.clearColorFilter()
            return
        L2a:
            r1 = 0
            if (r0 == 0) goto L32
            java.lang.Object r0 = r5.f1631
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            goto L33
        L32:
            r0 = r1
        L33:
            boolean r3 = r5.f1632
            if (r3 == 0) goto L3c
            java.io.Serializable r5 = r5.f1633
            android.graphics.PorterDuff$Mode r5 = (android.graphics.PorterDuff.Mode) r5
            goto L3e
        L3c:
            android.graphics.PorterDuff$Mode r5 = xhss.C0117.f503
        L3e:
            if (r0 == 0) goto L4b
            if (r5 != 0) goto L43
            goto L4b
        L43:
            int r6 = r0.getColorForState(r6, r2)
            android.graphics.PorterDuffColorFilter r1 = m312(r6, r5)
        L4b:
            r4.setColorFilter(r1)
        L4e:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static synchronized android.graphics.PorterDuffColorFilter m312(int r4, android.graphics.PorterDuff.Mode r5) {
            java.lang.Class<xhss.ᛱᲈᲁᛴ> r0 = xhss.C0117.class
            monitor-enter(r0)
            xhss.ᛴᛵᛵᛶ r1 = xhss.C0117.f501     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
            r2 = 31
            int r3 = r2 + r4
            int r3 = r3 * r2
            int r2 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r1.m1745(r2)     // Catch: java.lang.Throwable -> L33
            android.graphics.PorterDuffColorFilter r2 = (android.graphics.PorterDuffColorFilter) r2     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L35
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> L33
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L33
            int r4 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r4 = r4 + r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r1.m1744(r4, r2)     // Catch: java.lang.Throwable -> L33
            android.graphics.PorterDuffColorFilter r4 = (android.graphics.PorterDuffColorFilter) r4     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r4 = move-exception
            goto L37
        L35:
            monitor-exit(r0)
            return r2
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r4
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m313(android.content.Context r12, int r13) {
            r11 = this;
            android.util.TypedValue r0 = r11.f505
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.f505 = r0
        Lb:
            android.content.res.Resources r1 = r12.getResources()
            r2 = 1
            r1.getValue(r13, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r5 = r0.data
            long r5 = (long) r5
            long r3 = r3 | r5
            monitor-enter(r11)
            java.util.WeakHashMap r5 = r11.f504     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = r5.get(r12)     // Catch: java.lang.Throwable -> L55
            xhss.ᛲᛵᛶᲈ r5 = (xhss.C0159) r5     // Catch: java.lang.Throwable -> L55
            r6 = 0
            if (r5 != 0) goto L2c
            monitor-exit(r11)
        L2a:
            r5 = r6
            goto L70
        L2c:
            long[] r7 = r5.f660     // Catch: java.lang.Throwable -> L55
            int r8 = r5.f661     // Catch: java.lang.Throwable -> L55
            int r7 = xhss.AbstractC0473.m853(r7, r8, r3)     // Catch: java.lang.Throwable -> L55
            if (r7 < 0) goto L3e
            java.lang.Object[] r8 = r5.f662     // Catch: java.lang.Throwable -> L55
            r7 = r8[r7]     // Catch: java.lang.Throwable -> L55
            java.lang.Object r8 = xhss.AbstractC0694.f2349     // Catch: java.lang.Throwable -> L55
            if (r7 != r8) goto L3f
        L3e:
            r7 = r6
        L3f:
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L55
            android.graphics.drawable.Drawable$ConstantState r7 = (android.graphics.drawable.Drawable.ConstantState) r7     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L58
            android.content.res.Resources r5 = r12.getResources()     // Catch: java.lang.Throwable -> L55
            android.graphics.drawable.Drawable r5 = r7.newDrawable(r5)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r11)
            goto L70
        L55:
            r12 = move-exception
            goto L109
        L58:
            long[] r7 = r5.f660     // Catch: java.lang.Throwable -> L55
            int r8 = r5.f661     // Catch: java.lang.Throwable -> L55
            int r7 = xhss.AbstractC0473.m853(r7, r8, r3)     // Catch: java.lang.Throwable -> L55
            if (r7 < 0) goto L6e
            java.lang.Object[] r8 = r5.f662     // Catch: java.lang.Throwable -> L55
            r9 = r8[r7]     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = xhss.AbstractC0694.f2349     // Catch: java.lang.Throwable -> L55
            if (r9 == r10) goto L6e
            r8[r7] = r10     // Catch: java.lang.Throwable -> L55
            r5.f659 = r2     // Catch: java.lang.Throwable -> L55
        L6e:
            monitor-exit(r11)
            goto L2a
        L70:
            if (r5 == 0) goto L73
            return r5
        L73:
            xhss.ᛳᛲᲀᲈ r5 = r11.f506
            if (r5 != 0) goto L78
            goto Lbb
        L78:
            r5 = 1678180369(0x64070011, float:9.961261E21)
            if (r13 != r5) goto L95
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            r13 = 1678180368(0x64070010, float:9.96126E21)
            android.graphics.drawable.Drawable r13 = r11.m318(r12, r13)
            r5 = 1678180370(0x64070012, float:9.961262E21)
            android.graphics.drawable.Drawable r5 = r11.m318(r12, r5)
            android.graphics.drawable.Drawable[] r13 = new android.graphics.drawable.Drawable[]{r13, r5}
            r6.<init>(r13)
            goto Lbb
        L95:
            r5 = 1678180404(0x64070034, float:9.9613E21)
            if (r13 != r5) goto La2
            r13 = 1678114875(0x6406003b, float:9.887521E21)
            android.graphics.drawable.LayerDrawable r6 = xhss.C0246.m548(r11, r12, r13)
            goto Lbb
        La2:
            r5 = 1678180403(0x64070033, float:9.961299E21)
            if (r13 != r5) goto Laf
            r13 = 1678114876(0x6406003c, float:9.887522E21)
            android.graphics.drawable.LayerDrawable r6 = xhss.C0246.m548(r11, r12, r13)
            goto Lbb
        Laf:
            r5 = 1678180405(0x64070035, float:9.961301E21)
            if (r13 != r5) goto Lbb
            r13 = 1678114877(0x6406003d, float:9.887524E21)
            android.graphics.drawable.LayerDrawable r6 = xhss.C0246.m548(r11, r12, r13)
        Lbb:
            if (r6 == 0) goto L108
            int r13 = r0.changingConfigurations
            r6.setChangingConfigurations(r13)
            monitor-enter(r11)
            android.graphics.drawable.Drawable$ConstantState r13 = r6.getConstantState()     // Catch: java.lang.Throwable -> Lf8
            if (r13 == 0) goto L104
            java.util.WeakHashMap r0 = r11.f504     // Catch: java.lang.Throwable -> Lf8
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> Lf8
            xhss.ᛲᛵᛶᲈ r0 = (xhss.C0159) r0     // Catch: java.lang.Throwable -> Lf8
            if (r0 != 0) goto Lfa
            xhss.ᛲᛵᛶᲈ r0 = new xhss.ᛲᛵᛶᲈ     // Catch: java.lang.Throwable -> Lf8
            r0.<init>()     // Catch: java.lang.Throwable -> Lf8
            r5 = 4
        Ld9:
            r7 = 80
            if (r5 >= r1) goto Le8
            int r8 = r2 << r5
            int r8 = r8 + (-12)
            if (r7 > r8) goto Le5
            r7 = r8
            goto Le8
        Le5:
            int r5 = r5 + 1
            goto Ld9
        Le8:
            int r7 = r7 / 8
            long[] r1 = new long[r7]     // Catch: java.lang.Throwable -> Lf8
            r0.f660 = r1     // Catch: java.lang.Throwable -> Lf8
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lf8
            r0.f662 = r1     // Catch: java.lang.Throwable -> Lf8
            java.util.WeakHashMap r1 = r11.f504     // Catch: java.lang.Throwable -> Lf8
            r1.put(r12, r0)     // Catch: java.lang.Throwable -> Lf8
            goto Lfa
        Lf8:
            r12 = move-exception
            goto L106
        Lfa:
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lf8
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Lf8
            r0.m405(r3, r12)     // Catch: java.lang.Throwable -> Lf8
            monitor-exit(r11)
            return r6
        L104:
            monitor-exit(r11)
            return r6
        L106:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lf8
            throw r12
        L108:
            return r6
        L109:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L55
            throw r12
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final synchronized android.graphics.drawable.Drawable m314(android.content.Context r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f508     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6
            goto L22
        L6:
            r0 = 1
            r2.f508 = r0     // Catch: java.lang.Throwable -> L2d
            r0 = 1678180431(0x6407004f, float:9.961331E21)
            android.graphics.drawable.Drawable r0 = r2.m318(r3, r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L69
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L69
        L22:
            android.graphics.drawable.Drawable r0 = r2.m313(r3, r4)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L2f
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r3 = move-exception
            goto L74
        L2f:
            if (r0 == 0) goto L35
            android.graphics.drawable.Drawable r0 = r2.m316(r3, r4, r0)     // Catch: java.lang.Throwable -> L2d
        L35:
            if (r0 == 0) goto L67
            int[] r3 = xhss.AbstractC0365.f1335     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L2d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2d
            r1 = 31
            if (r4 >= r1) goto L67
            java.lang.String r4 = "android.graphics.drawable.ColorStateListDrawable"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L67
            int[] r3 = r0.getState()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L5f
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2d
            if (r4 != 0) goto L59
            goto L5f
        L59:
            int[] r4 = xhss.AbstractC0365.f1334     // Catch: java.lang.Throwable -> L2d
            r0.setState(r4)     // Catch: java.lang.Throwable -> L2d
            goto L64
        L5f:
            int[] r4 = xhss.AbstractC0365.f1335     // Catch: java.lang.Throwable -> L2d
            r0.setState(r4)     // Catch: java.lang.Throwable -> L2d
        L64:
            r0.setState(r3)     // Catch: java.lang.Throwable -> L2d
        L67:
            monitor-exit(r2)
            return r0
        L69:
            r3 = 0
            r2.f508 = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            throw r3     // Catch: java.lang.Throwable -> L2d
        L74:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m315(android.content.Context r8, int r9, android.content.res.ColorStateList r10) {
            r7 = this;
            java.util.WeakHashMap r0 = r7.f507
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r7.f507 = r0
        Lb:
            java.lang.Object r0 = r0.get(r8)
            xhss.ᛶᛶᛸᛶ r0 = (xhss.C0570) r0
            r1 = 32
            r2 = 4
            r3 = 1
            if (r0 != 0) goto L3a
            xhss.ᛶᛶᛸᛶ r0 = new xhss.ᛶᛶᛸᛶ
            r0.<init>()
            r4 = r2
        L1d:
            r5 = 40
            if (r4 >= r1) goto L2c
            int r6 = r3 << r4
            int r6 = r6 + (-12)
            if (r5 > r6) goto L29
            r5 = r6
            goto L2c
        L29:
            int r4 = r4 + 1
            goto L1d
        L2c:
            int r5 = r5 / r2
            int[] r4 = new int[r5]
            r0.f2004 = r4
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r0.f2005 = r4
            java.util.WeakHashMap r7 = r7.f507
            r7.put(r8, r0)
        L3a:
            int r7 = r0.f2006
            if (r7 == 0) goto Lad
            int[] r8 = r0.f2004
            int r4 = r7 + (-1)
            r4 = r8[r4]
            if (r9 > r4) goto Lad
            int r7 = xhss.AbstractC0473.m859(r7, r9, r8)
            if (r7 < 0) goto L51
            java.lang.Object[] r8 = r0.f2005
            r8[r7] = r10
            return
        L51:
            int r7 = ~r7
            int r8 = r0.f2006
            if (r7 >= r8) goto L65
            java.lang.Object[] r4 = r0.f2005
            r5 = r4[r7]
            java.lang.Object r6 = xhss.AbstractC1178.f3790
            if (r5 != r6) goto L65
            int[] r8 = r0.f2004
            r8[r7] = r9
            r4[r7] = r10
            return
        L65:
            int[] r4 = r0.f2004
            int r4 = r4.length
            if (r8 < r4) goto L8b
            int r8 = r8 + r3
            int r8 = r8 * r2
            r4 = r2
        L6d:
            if (r4 >= r1) goto L7a
            int r5 = r3 << r4
            int r5 = r5 + (-12)
            if (r8 > r5) goto L77
            r8 = r5
            goto L7a
        L77:
            int r4 = r4 + 1
            goto L6d
        L7a:
            int r8 = r8 / r2
            int[] r1 = r0.f2004
            int[] r1 = java.util.Arrays.copyOf(r1, r8)
            r0.f2004 = r1
            java.lang.Object[] r1 = r0.f2005
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r1, r8)
            r0.f2005 = r8
        L8b:
            int r8 = r0.f2006
            int r1 = r8 - r7
            if (r1 == 0) goto L9f
            int[] r1 = r0.f2004
            int r2 = r7 + 1
            xhss.AbstractC0193.m457(r2, r7, r8, r1, r1)
            java.lang.Object[] r8 = r0.f2005
            int r1 = r0.f2006
            xhss.AbstractC0193.m448(r2, r7, r1, r8, r8)
        L9f:
            int[] r8 = r0.f2004
            r8[r7] = r9
            java.lang.Object[] r8 = r0.f2005
            r8[r7] = r10
            int r7 = r0.f2006
            int r7 = r7 + r3
            r0.f2006 = r7
            return
        Lad:
            int[] r8 = r0.f2004
            int r8 = r8.length
            if (r7 < r8) goto Ld4
            int r8 = r7 + 1
            int r8 = r8 * r2
            r4 = r2
        Lb6:
            if (r4 >= r1) goto Lc3
            int r5 = r3 << r4
            int r5 = r5 + (-12)
            if (r8 > r5) goto Lc0
            r8 = r5
            goto Lc3
        Lc0:
            int r4 = r4 + 1
            goto Lb6
        Lc3:
            int r8 = r8 / r2
            int[] r1 = r0.f2004
            int[] r1 = java.util.Arrays.copyOf(r1, r8)
            r0.f2004 = r1
            java.lang.Object[] r1 = r0.f2005
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r1, r8)
            r0.f2005 = r8
        Ld4:
            int[] r8 = r0.f2004
            r8[r7] = r9
            java.lang.Object[] r8 = r0.f2005
            r8[r7] = r10
            int r7 = r7 + r3
            r0.f2006 = r7
            return
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m316(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            r6 = this;
            android.content.res.ColorStateList r0 = r6.m317(r7, r8)
            if (r0 == 0) goto L20
            android.graphics.drawable.Drawable r7 = r9.mutate()
            r7.setTintList(r0)
            xhss.ᛳᛲᲀᲈ r6 = r6.f506
            r9 = 0
            if (r6 != 0) goto L13
            goto L1a
        L13:
            r6 = 1678180418(0x64070042, float:9.961316E21)
            if (r8 != r6) goto L1a
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.MULTIPLY
        L1a:
            if (r9 == 0) goto L1f
            r7.setTintMode(r9)
        L1f:
            return r7
        L20:
            xhss.ᛳᛲᲀᲈ r0 = r6.f506
            r1 = 1677918296(0x64030058, float:9.666193E21)
            r2 = 1677918294(0x64030056, float:9.666191E21)
            if (r0 == 0) goto L94
            r0 = 1678180413(0x6407003d, float:9.96131E21)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            if (r8 != r0) goto L5e
            r6 = r9
            android.graphics.drawable.LayerDrawable r6 = (android.graphics.drawable.LayerDrawable) r6
            android.graphics.drawable.Drawable r8 = r6.findDrawableByLayerId(r5)
            int r0 = xhss.AbstractC0313.m651(r7, r1)
            android.graphics.PorterDuff$Mode r5 = xhss.C0150.f629
            xhss.C0246.m550(r8, r0, r5)
            android.graphics.drawable.Drawable r8 = r6.findDrawableByLayerId(r4)
            int r0 = xhss.AbstractC0313.m651(r7, r1)
            xhss.C0246.m550(r8, r0, r5)
            android.graphics.drawable.Drawable r6 = r6.findDrawableByLayerId(r3)
            int r7 = xhss.AbstractC0313.m651(r7, r2)
            xhss.C0246.m550(r6, r7, r5)
            return r9
        L5e:
            r0 = 1678180404(0x64070034, float:9.9613E21)
            if (r8 == r0) goto L6d
            r0 = 1678180403(0x64070033, float:9.961299E21)
            if (r8 == r0) goto L6d
            r0 = 1678180405(0x64070035, float:9.961301E21)
            if (r8 != r0) goto L94
        L6d:
            r6 = r9
            android.graphics.drawable.LayerDrawable r6 = (android.graphics.drawable.LayerDrawable) r6
            android.graphics.drawable.Drawable r8 = r6.findDrawableByLayerId(r5)
            int r0 = xhss.AbstractC0313.m650(r7, r1)
            android.graphics.PorterDuff$Mode r1 = xhss.C0150.f629
            xhss.C0246.m550(r8, r0, r1)
            android.graphics.drawable.Drawable r8 = r6.findDrawableByLayerId(r4)
            int r0 = xhss.AbstractC0313.m651(r7, r2)
            xhss.C0246.m550(r8, r0, r1)
            android.graphics.drawable.Drawable r6 = r6.findDrawableByLayerId(r3)
            int r7 = xhss.AbstractC0313.m651(r7, r2)
            xhss.C0246.m550(r6, r7, r1)
            return r9
        L94:
            xhss.ᛳᛲᲀᲈ r6 = r6.f506
            if (r6 == 0) goto Lfb
            android.graphics.PorterDuff$Mode r0 = xhss.C0150.f629
            java.lang.Object r3 = r6.f918
            int[] r3 = (int[]) r3
            boolean r3 = xhss.C0246.m549(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto La8
        La6:
            r6 = r5
            goto Ldd
        La8:
            java.lang.Object r1 = r6.f916
            int[] r1 = (int[]) r1
            boolean r1 = xhss.C0246.m549(r1, r8)
            if (r1 == 0) goto Lb4
            r1 = r2
            goto La6
        Lb4:
            java.lang.Object r6 = r6.f919
            int[] r6 = (int[]) r6
            boolean r6 = xhss.C0246.m549(r6, r8)
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            if (r6 == 0) goto Lc4
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto La6
        Lc4:
            r6 = 1678180390(0x64070026, float:9.961285E21)
            if (r8 != r6) goto Ld4
            r6 = 1109603123(0x42233333, float:40.8)
            int r6 = java.lang.Math.round(r6)
            r1 = 16842800(0x1010030, float:2.3693693E-38)
            goto Ldd
        Ld4:
            r6 = 1678180372(0x64070014, float:9.961264E21)
            if (r8 != r6) goto Lda
            goto La6
        Lda:
            r1 = 0
            r4 = r1
            goto La6
        Ldd:
            if (r4 == 0) goto Lfb
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = xhss.AbstractC0313.m651(r7, r1)
            java.lang.Class<xhss.ᛲᛳᲈᛲ> r1 = xhss.C0150.class
            monitor-enter(r1)
            android.graphics.PorterDuffColorFilter r7 = m312(r7, r0)     // Catch: java.lang.Throwable -> Lf8
            monitor-exit(r1)
            r8.setColorFilter(r7)
            if (r6 == r5) goto Lfb
            r8.setAlpha(r6)
            goto Lfb
        Lf8:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf8
            throw r6
        Lfb:
            return r9
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final synchronized android.content.res.ColorStateList m317(android.content.Context r5, int r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.WeakHashMap r0 = r4.f507     // Catch: java.lang.Throwable -> L36
            r1 = 0
            if (r0 == 0) goto L24
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L36
            xhss.ᛶᛶᛸᛶ r0 = (xhss.C0570) r0     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L24
            int[] r2 = r0.f2004     // Catch: java.lang.Throwable -> L36
            int r3 = r0.f2006     // Catch: java.lang.Throwable -> L36
            int r2 = xhss.AbstractC0473.m859(r3, r6, r2)     // Catch: java.lang.Throwable -> L36
            if (r2 < 0) goto L20
            java.lang.Object[] r0 = r0.f2005     // Catch: java.lang.Throwable -> L36
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = xhss.AbstractC1178.f3790     // Catch: java.lang.Throwable -> L36
            if (r0 != r2) goto L21
        L20:
            r0 = r1
        L21:
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch: java.lang.Throwable -> L36
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != 0) goto L39
            xhss.ᛳᛲᲀᲈ r0 = r4.f506     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L2c
            goto L30
        L2c:
            android.content.res.ColorStateList r1 = r0.m552(r5, r6)     // Catch: java.lang.Throwable -> L36
        L30:
            if (r1 == 0) goto L38
            r4.m315(r5, r6, r1)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r5 = move-exception
            goto L3b
        L38:
            r0 = r1
        L39:
            monitor-exit(r4)
            return r0
        L3b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final synchronized android.graphics.drawable.Drawable m318(android.content.Context r1, int r2) {
            r0 = this;
            monitor-enter(r0)
            android.graphics.drawable.Drawable r1 = r0.m314(r1, r2)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
