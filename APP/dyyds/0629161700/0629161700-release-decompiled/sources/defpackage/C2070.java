package defpackage;

/* JADX INFO: renamed from: ᲇᛶᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2070 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C0514 f8890 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final android.graphics.PorterDuff.Mode f8891 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static defpackage.C2070 f8892;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0478 f8893;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f8894;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.util.TypedValue f8895;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public java.util.WeakHashMap f8896;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.WeakHashMap f8897;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            defpackage.C2070.f8891 = r0
            ᛳᛷᛵᛷ r0 = new ᛳᛷᛵᛷ
            r1 = 6
            r0.<init>(r1)
            defpackage.C2070.f8890 = r0
            return
    }

    public C2070() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.f8897 = r0
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static void m3477(android.graphics.drawable.Drawable r4, defpackage.C0340 r5, int[] r6) {
            int[] r0 = r4.getState()
            int[] r1 = defpackage.AbstractC1660.f7407
            android.graphics.drawable.Drawable r1 = r4.mutate()
            if (r1 != r4) goto L51
            boolean r1 = r4 instanceof android.graphics.drawable.LayerDrawable
            r2 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r4.isStateful()
            if (r1 == 0) goto L1f
            int[] r1 = new int[r2]
            r4.setState(r1)
            r4.setState(r0)
        L1f:
            boolean r0 = r5.f1740
            if (r0 != 0) goto L2c
            boolean r1 = r5.f1739
            if (r1 == 0) goto L28
            goto L2c
        L28:
            r4.clearColorFilter()
            return
        L2c:
            r1 = 0
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.f1738
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            goto L35
        L34:
            r0 = r1
        L35:
            boolean r3 = r5.f1739
            if (r3 == 0) goto L3e
            java.io.Serializable r5 = r5.f1737
            android.graphics.PorterDuff$Mode r5 = (android.graphics.PorterDuff.Mode) r5
            goto L40
        L3e:
            android.graphics.PorterDuff$Mode r5 = defpackage.C2070.f8891
        L40:
            if (r0 == 0) goto L4d
            if (r5 != 0) goto L45
            goto L4d
        L45:
            int r6 = r0.getColorForState(r6, r2)
            android.graphics.PorterDuffColorFilter r1 = m3479(r6, r5)
        L4d:
            r4.setColorFilter(r1)
            return
        L51:
            java.lang.String r4 = "ResourceManagerInternal"
            java.lang.String r5 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r4, r5)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static synchronized defpackage.C2070 m3478() {
            java.lang.Class<ᲇᛶᛸᲈ> r0 = defpackage.C2070.class
            monitor-enter(r0)
            ᲇᛶᛸᲈ r1 = defpackage.C2070.f8892     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            ᲇᛶᛸᲈ r1 = new ᲇᛶᛸᲈ     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            defpackage.C2070.f8892 = r1     // Catch: java.lang.Throwable -> Lf
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

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static synchronized android.graphics.PorterDuffColorFilter m3479(int r4, android.graphics.PorterDuff.Mode r5) {
            java.lang.Class<ᲇᛶᛸᲈ> r0 = defpackage.C2070.class
            monitor-enter(r0)
            ᛳᛷᛵᛷ r1 = defpackage.C2070.f8890     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
            r2 = 31
            int r3 = r2 + r4
            int r3 = r3 * r2
            int r2 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r1.m3732(r2)     // Catch: java.lang.Throwable -> L33
            android.graphics.PorterDuffColorFilter r2 = (android.graphics.PorterDuffColorFilter) r2     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L35
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> L33
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L33
            int r4 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r4 = r4 + r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r1.m3734(r4, r2)     // Catch: java.lang.Throwable -> L33
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

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m3480(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
            r8 = this;
            android.content.res.ColorStateList r0 = r8.m3485(r9, r10)
            r1 = 0
            if (r0 == 0) goto L22
            int[] r9 = defpackage.AbstractC1660.f7407
            android.graphics.drawable.Drawable r9 = r12.mutate()
            r9.setTintList(r0)
            ᛳᛵᛴᛴ r8 = r8.f8893
            if (r8 != 0) goto L15
            goto L1c
        L15:
            r8 = 1711800391(0x66080047, float:1.6056174E23)
            if (r10 != r8) goto L1c
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L1c:
            if (r1 == 0) goto L21
            r9.setTintMode(r1)
        L21:
            return r9
        L22:
            ᛳᛵᛴᛴ r0 = r8.f8893
            r2 = 1711538373(0x660400c5, float:1.5584164E23)
            r3 = 1711538371(0x660400c3, float:1.558416E23)
            if (r0 == 0) goto L96
            r0 = 1711800386(0x66080042, float:1.6056165E23)
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r10 != r0) goto L60
            r8 = r12
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r6)
            int r11 = defpackage.AbstractC2218.m3608(r9, r2)
            android.graphics.PorterDuff$Mode r0 = defpackage.C0844.f3869
            defpackage.C0478.m1246(r10, r11, r0)
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r5)
            int r11 = defpackage.AbstractC2218.m3608(r9, r2)
            defpackage.C0478.m1246(r10, r11, r0)
            android.graphics.drawable.Drawable r8 = r8.findDrawableByLayerId(r4)
            int r9 = defpackage.AbstractC2218.m3608(r9, r3)
            defpackage.C0478.m1246(r8, r9, r0)
            return r12
        L60:
            r0 = 1711800377(0x66080039, float:1.6056149E23)
            if (r10 == r0) goto L6f
            r0 = 1711800376(0x66080038, float:1.6056147E23)
            if (r10 == r0) goto L6f
            r0 = 1711800378(0x6608003a, float:1.605615E23)
            if (r10 != r0) goto L96
        L6f:
            r8 = r12
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r6)
            int r11 = defpackage.AbstractC2218.m3610(r9, r2)
            android.graphics.PorterDuff$Mode r0 = defpackage.C0844.f3869
            defpackage.C0478.m1246(r10, r11, r0)
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r5)
            int r11 = defpackage.AbstractC2218.m3608(r9, r3)
            defpackage.C0478.m1246(r10, r11, r0)
            android.graphics.drawable.Drawable r8 = r8.findDrawableByLayerId(r4)
            int r9 = defpackage.AbstractC2218.m3608(r9, r3)
            defpackage.C0478.m1246(r8, r9, r0)
            return r12
        L96:
            ᛳᛵᛴᛴ r8 = r8.f8893
            r0 = 0
            if (r8 == 0) goto L103
            android.graphics.PorterDuff$Mode r4 = defpackage.C0844.f3869
            java.lang.Object r5 = r8.f2401
            int[] r5 = (int[]) r5
            boolean r5 = defpackage.C0478.m1248(r5, r10)
            r6 = 1
            r7 = -1
            if (r5 == 0) goto Lac
        La9:
            r10 = r6
        Laa:
            r8 = r7
            goto Le2
        Lac:
            java.lang.Object r2 = r8.f2403
            int[] r2 = (int[]) r2
            boolean r2 = defpackage.C0478.m1248(r2, r10)
            if (r2 == 0) goto Lb8
            r2 = r3
            goto La9
        Lb8:
            java.lang.Object r8 = r8.f2404
            int[] r8 = (int[]) r8
            boolean r8 = defpackage.C0478.m1248(r8, r10)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            if (r8 == 0) goto Lc8
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto La9
        Lc8:
            r8 = 1711800363(0x6608002b, float:1.6056124E23)
            if (r10 != r8) goto Ld9
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r10 = r6
            goto Le2
        Ld9:
            r8 = 1711800345(0x66080019, float:1.6056091E23)
            if (r10 != r8) goto Ldf
            goto La9
        Ldf:
            r10 = r0
            r2 = r10
            goto Laa
        Le2:
            if (r10 == 0) goto L103
            int[] r10 = defpackage.AbstractC1660.f7407
            android.graphics.drawable.Drawable r10 = r12.mutate()
            int r9 = defpackage.AbstractC2218.m3608(r9, r2)
            java.lang.Class<ᛵᛲᲈᛲ> r2 = defpackage.C0844.class
            monitor-enter(r2)
            android.graphics.PorterDuffColorFilter r9 = m3479(r9, r4)     // Catch: java.lang.Throwable -> L100
            monitor-exit(r2)
            r10.setColorFilter(r9)
            if (r8 == r7) goto Lfe
            r10.setAlpha(r8)
        Lfe:
            r0 = r6
            goto L103
        L100:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L100
            throw r8
        L103:
            if (r0 != 0) goto L108
            if (r11 == 0) goto L108
            return r1
        L108:
            return r12
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final synchronized android.graphics.drawable.Drawable m3481(android.content.Context r3, int r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f8894     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6
            goto L22
        L6:
            r0 = 1
            r2.f8894 = r0     // Catch: java.lang.Throwable -> L2d
            r0 = 1711800404(0x66080054, float:1.6056197E23)
            android.graphics.drawable.Drawable r0 = r2.m3482(r3, r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L3c
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L3c
        L22:
            android.graphics.drawable.Drawable r0 = r2.m3484(r3, r4)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L2f
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r3 = move-exception
            goto L47
        L2f:
            if (r0 == 0) goto L35
            android.graphics.drawable.Drawable r0 = r2.m3480(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L2d
        L35:
            if (r0 == 0) goto L3a
            defpackage.AbstractC1660.m3052(r0)     // Catch: java.lang.Throwable -> L2d
        L3a:
            monitor-exit(r2)
            return r0
        L3c:
            r3 = 0
            r2.f8894 = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            throw r3     // Catch: java.lang.Throwable -> L2d
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final synchronized android.graphics.drawable.Drawable m3482(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.graphics.drawable.Drawable r2 = r1.m3481(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3483(android.content.Context r8, int r9, android.content.res.ColorStateList r10) {
            r7 = this;
            java.util.WeakHashMap r0 = r7.f8896
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r7.f8896 = r0
        Lb:
            java.lang.Object r0 = r0.get(r8)
            ᛴᛴᛵᛷ r0 = (defpackage.C0652) r0
            r1 = 32
            r2 = 4
            r3 = 1
            if (r0 != 0) goto L3a
            ᛴᛴᛵᛷ r0 = new ᛴᛴᛵᛷ
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
            r0.f3176 = r4
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r0.f3175 = r4
            java.util.WeakHashMap r7 = r7.f8896
            r7.put(r8, r0)
        L3a:
            int r7 = r0.f3174
            if (r7 == 0) goto Lad
            int[] r8 = r0.f3176
            int r4 = r7 + (-1)
            r4 = r8[r4]
            if (r9 > r4) goto Lad
            int r7 = defpackage.AbstractC1628.m2961(r7, r9, r8)
            if (r7 < 0) goto L51
            java.lang.Object[] r8 = r0.f3175
            r8[r7] = r10
            return
        L51:
            int r7 = ~r7
            int r8 = r0.f3174
            if (r7 >= r8) goto L65
            java.lang.Object[] r4 = r0.f3175
            r5 = r4[r7]
            java.lang.Object r6 = defpackage.AbstractC0729.f3459
            if (r5 != r6) goto L65
            int[] r8 = r0.f3176
            r8[r7] = r9
            r4[r7] = r10
            return
        L65:
            int[] r4 = r0.f3176
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
            int[] r1 = r0.f3176
            int[] r1 = java.util.Arrays.copyOf(r1, r8)
            r0.f3176 = r1
            java.lang.Object[] r1 = r0.f3175
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r1, r8)
            r0.f3175 = r8
        L8b:
            int r8 = r0.f3174
            int r1 = r8 - r7
            if (r1 == 0) goto L9f
            int[] r1 = r0.f3176
            int r2 = r7 + 1
            defpackage.AbstractC2315.m3770(r2, r7, r8, r1, r1)
            java.lang.Object[] r8 = r0.f3175
            int r1 = r0.f3174
            defpackage.AbstractC2315.m3766(r2, r7, r1, r8, r8)
        L9f:
            int[] r8 = r0.f3176
            r8[r7] = r9
            java.lang.Object[] r8 = r0.f3175
            r8[r7] = r10
            int r7 = r0.f3174
            int r7 = r7 + r3
            r0.f3174 = r7
            return
        Lad:
            int[] r8 = r0.f3176
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
            int[] r1 = r0.f3176
            int[] r1 = java.util.Arrays.copyOf(r1, r8)
            r0.f3176 = r1
            java.lang.Object[] r1 = r0.f3175
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r1, r8)
            r0.f3175 = r8
        Ld4:
            int[] r8 = r0.f3176
            r8[r7] = r9
            java.lang.Object[] r8 = r0.f3175
            r8[r7] = r10
            int r7 = r7 + r3
            r0.f3174 = r7
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m3484(android.content.Context r11, int r12) {
            r10 = this;
            android.util.TypedValue r0 = r10.f8895
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f8895 = r0
        Lb:
            android.content.res.Resources r1 = r11.getResources()
            r2 = 1
            r1.getValue(r12, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            monitor-enter(r10)
            java.util.WeakHashMap r1 = r10.f8897     // Catch: java.lang.Throwable -> L46
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L46
            ᛳᛳᛱᛶ r1 = (defpackage.C0435) r1     // Catch: java.lang.Throwable -> L46
            r5 = 0
            if (r1 != 0) goto L2c
            monitor-exit(r10)
        L2a:
            r1 = r5
            goto L61
        L2c:
            java.lang.Object r6 = r1.m1218(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L46
            android.graphics.drawable.Drawable$ConstantState r6 = (android.graphics.drawable.Drawable.ConstantState) r6     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L49
            android.content.res.Resources r1 = r11.getResources()     // Catch: java.lang.Throwable -> L46
            android.graphics.drawable.Drawable r1 = r6.newDrawable(r1)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r10)
            goto L61
        L46:
            r11 = move-exception
            goto Le0
        L49:
            long[] r6 = r1.f2134     // Catch: java.lang.Throwable -> L46
            int r7 = r1.f2136     // Catch: java.lang.Throwable -> L46
            int r6 = defpackage.AbstractC1628.m2956(r6, r7, r3)     // Catch: java.lang.Throwable -> L46
            if (r6 < 0) goto L5f
            java.lang.Object[] r7 = r1.f2133     // Catch: java.lang.Throwable -> L46
            r8 = r7[r6]     // Catch: java.lang.Throwable -> L46
            java.lang.Object r9 = defpackage.AbstractC0498.f2478     // Catch: java.lang.Throwable -> L46
            if (r8 == r9) goto L5f
            r7[r6] = r9     // Catch: java.lang.Throwable -> L46
            r1.f2135 = r2     // Catch: java.lang.Throwable -> L46
        L5f:
            monitor-exit(r10)
            goto L2a
        L61:
            if (r1 == 0) goto L64
            return r1
        L64:
            ᛳᛵᛴᛴ r1 = r10.f8893
            if (r1 != 0) goto L69
            goto Lac
        L69:
            r1 = 1711800342(0x66080016, float:1.6056086E23)
            if (r12 != r1) goto L86
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            r12 = 1711800341(0x66080015, float:1.6056084E23)
            android.graphics.drawable.Drawable r12 = r10.m3482(r11, r12)
            r1 = 1711800343(0x66080017, float:1.6056087E23)
            android.graphics.drawable.Drawable r1 = r10.m3482(r11, r1)
            android.graphics.drawable.Drawable[] r12 = new android.graphics.drawable.Drawable[]{r12, r1}
            r5.<init>(r12)
            goto Lac
        L86:
            r1 = 1711800377(0x66080039, float:1.6056149E23)
            if (r12 != r1) goto L93
            r12 = 1711734843(0x6607003b, float:1.5938093E23)
            android.graphics.drawable.LayerDrawable r5 = defpackage.C0478.m1247(r10, r11, r12)
            goto Lac
        L93:
            r1 = 1711800376(0x66080038, float:1.6056147E23)
            if (r12 != r1) goto La0
            r12 = 1711734844(0x6607003c, float:1.5938095E23)
            android.graphics.drawable.LayerDrawable r5 = defpackage.C0478.m1247(r10, r11, r12)
            goto Lac
        La0:
            r1 = 1711800378(0x6608003a, float:1.605615E23)
            if (r12 != r1) goto Lac
            r12 = 1711734845(0x6607003d, float:1.5938097E23)
            android.graphics.drawable.LayerDrawable r5 = defpackage.C0478.m1247(r10, r11, r12)
        Lac:
            if (r5 == 0) goto Ldf
            int r12 = r0.changingConfigurations
            r5.setChangingConfigurations(r12)
            monitor-enter(r10)
            android.graphics.drawable.Drawable$ConstantState r12 = r5.getConstantState()     // Catch: java.lang.Throwable -> Lcf
            if (r12 == 0) goto Ldb
            java.util.WeakHashMap r0 = r10.f8897     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> Lcf
            ᛳᛳᛱᛶ r0 = (defpackage.C0435) r0     // Catch: java.lang.Throwable -> Lcf
            if (r0 != 0) goto Ld1
            ᛳᛳᛱᛶ r0 = new ᛳᛳᛱᛶ     // Catch: java.lang.Throwable -> Lcf
            r0.<init>()     // Catch: java.lang.Throwable -> Lcf
            java.util.WeakHashMap r1 = r10.f8897     // Catch: java.lang.Throwable -> Lcf
            r1.put(r11, r0)     // Catch: java.lang.Throwable -> Lcf
            goto Ld1
        Lcf:
            r11 = move-exception
            goto Ldd
        Ld1:
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lcf
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lcf
            r0.m1216(r3, r11)     // Catch: java.lang.Throwable -> Lcf
            monitor-exit(r10)
            return r5
        Ldb:
            monitor-exit(r10)
            return r5
        Ldd:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lcf
            throw r11
        Ldf:
            return r5
        Le0:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L46
            throw r11
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final synchronized android.content.res.ColorStateList m3485(android.content.Context r5, int r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.WeakHashMap r0 = r4.f8896     // Catch: java.lang.Throwable -> L36
            r1 = 0
            if (r0 == 0) goto L24
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L36
            ᛴᛴᛵᛷ r0 = (defpackage.C0652) r0     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L24
            int[] r2 = r0.f3176     // Catch: java.lang.Throwable -> L36
            int r3 = r0.f3174     // Catch: java.lang.Throwable -> L36
            int r2 = defpackage.AbstractC1628.m2961(r3, r6, r2)     // Catch: java.lang.Throwable -> L36
            if (r2 < 0) goto L20
            java.lang.Object[] r0 = r0.f3175     // Catch: java.lang.Throwable -> L36
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = defpackage.AbstractC0729.f3459     // Catch: java.lang.Throwable -> L36
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
            ᛳᛵᛴᛴ r0 = r4.f8893     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L2c
            goto L30
        L2c:
            android.content.res.ColorStateList r1 = r0.m1251(r5, r6)     // Catch: java.lang.Throwable -> L36
        L30:
            if (r1 == 0) goto L38
            r4.m3483(r5, r6, r1)     // Catch: java.lang.Throwable -> L36
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
}
