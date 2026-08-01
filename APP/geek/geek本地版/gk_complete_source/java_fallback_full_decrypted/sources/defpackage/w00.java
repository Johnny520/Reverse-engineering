package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w00 {
    public static final android.graphics.PorterDuff.Mode f = null;
    public static defpackage.w00 g;
    public static final defpackage.v00 h = null;
    public java.util.WeakHashMap a;
    public final java.util.WeakHashMap b;
    public android.util.TypedValue c;
    public boolean d;
    public defpackage.t3 e;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            defpackage.w00.f = r0
            v00 r0 = new v00
            r1 = 6
            r0.<init>(r1)
            defpackage.w00.h = r0
            return
    }

    public w00() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.b = r0
            return
    }

    public static synchronized defpackage.w00 b() {
            java.lang.Class<w00> r0 = defpackage.w00.class
            monitor-enter(r0)
            w00 r1 = defpackage.w00.g     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            w00 r1 = new w00     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            defpackage.w00.g = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            w00 r1 = defpackage.w00.g     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static synchronized android.graphics.PorterDuffColorFilter e(int r4, android.graphics.PorterDuff.Mode r5) {
            java.lang.Class<w00> r0 = defpackage.w00.class
            monitor-enter(r0)
            v00 r1 = defpackage.w00.h     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
            r2 = 31
            int r3 = r2 + r4
            int r3 = r3 * r2
            int r2 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r1.a(r2)     // Catch: java.lang.Throwable -> L33
            android.graphics.PorterDuffColorFilter r2 = (android.graphics.PorterDuffColorFilter) r2     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L35
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> L33
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L33
            int r4 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r4 = r4 + r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r1.b(r4, r2)     // Catch: java.lang.Throwable -> L33
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

    public final android.graphics.drawable.Drawable a(android.content.Context r10, int r11) {
            r9 = this;
            android.util.TypedValue r0 = r9.c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.c = r0
        Lb:
            android.util.TypedValue r0 = r9.c
            android.content.res.Resources r1 = r10.getResources()
            r2 = 1
            r1.getValue(r11, r0, r2)
            int r1 = r0.assetCookie
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data
            long r3 = (long) r3
            long r1 = r1 | r3
            monitor-enter(r9)
            java.util.WeakHashMap r3 = r9.b     // Catch: java.lang.Throwable -> L47
            java.lang.Object r3 = r3.get(r10)     // Catch: java.lang.Throwable -> L47
            bs r3 = (defpackage.bs) r3     // Catch: java.lang.Throwable -> L47
            r4 = 0
            if (r3 != 0) goto L2d
            monitor-exit(r9)
            goto L62
        L2d:
            java.lang.Object r5 = r3.c(r1, r4)     // Catch: java.lang.Throwable -> L47
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L61
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L47
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L4a
            android.content.res.Resources r3 = r10.getResources()     // Catch: java.lang.Throwable -> L47
            android.graphics.drawable.Drawable r4 = r5.newDrawable(r3)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r9)
            goto L62
        L47:
            r10 = move-exception
            goto Le2
        L4a:
            long[] r5 = r3.b     // Catch: java.lang.Throwable -> L47
            int r6 = r3.d     // Catch: java.lang.Throwable -> L47
            int r5 = defpackage.ff.d(r5, r6, r1)     // Catch: java.lang.Throwable -> L47
            if (r5 < 0) goto L61
            java.lang.Object[] r6 = r3.c     // Catch: java.lang.Throwable -> L47
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L47
            java.lang.Object r8 = defpackage.bs.e     // Catch: java.lang.Throwable -> L47
            if (r7 == r8) goto L61
            r6[r5] = r8     // Catch: java.lang.Throwable -> L47
            r5 = 1
            r3.a = r5     // Catch: java.lang.Throwable -> L47
        L61:
            monitor-exit(r9)
        L62:
            if (r4 == 0) goto L65
            return r4
        L65:
            t3 r3 = r9.e
            r4 = 0
            if (r3 != 0) goto L6b
            goto Lae
        L6b:
            r3 = 2131230777(0x7f080039, float:1.8077616E38)
            if (r11 != r3) goto L88
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable
            r11 = 2131230776(0x7f080038, float:1.8077614E38)
            android.graphics.drawable.Drawable r11 = r9.c(r10, r11)
            r3 = 2131230778(0x7f08003a, float:1.8077618E38)
            android.graphics.drawable.Drawable r3 = r9.c(r10, r3)
            android.graphics.drawable.Drawable[] r11 = new android.graphics.drawable.Drawable[]{r11, r3}
            r4.<init>(r11)
            goto Lae
        L88:
            r3 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r11 != r3) goto L95
            r11 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r4 = defpackage.t3.c(r9, r10, r11)
            goto Lae
        L95:
            r3 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r11 != r3) goto La2
            r11 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r4 = defpackage.t3.c(r9, r10, r11)
            goto Lae
        La2:
            r3 = 2131230813(0x7f08005d, float:1.807769E38)
            if (r11 != r3) goto Lae
            r11 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r4 = defpackage.t3.c(r9, r10, r11)
        Lae:
            if (r4 == 0) goto Le1
            int r11 = r0.changingConfigurations
            r4.setChangingConfigurations(r11)
            monitor-enter(r9)
            android.graphics.drawable.Drawable$ConstantState r11 = r4.getConstantState()     // Catch: java.lang.Throwable -> Ld1
            if (r11 == 0) goto Ldd
            java.util.WeakHashMap r0 = r9.b     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> Ld1
            bs r0 = (defpackage.bs) r0     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto Ld3
            bs r0 = new bs     // Catch: java.lang.Throwable -> Ld1
            r0.<init>()     // Catch: java.lang.Throwable -> Ld1
            java.util.WeakHashMap r3 = r9.b     // Catch: java.lang.Throwable -> Ld1
            r3.put(r10, r0)     // Catch: java.lang.Throwable -> Ld1
            goto Ld3
        Ld1:
            r10 = move-exception
            goto Ldf
        Ld3:
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Ld1
            r10.<init>(r11)     // Catch: java.lang.Throwable -> Ld1
            r0.d(r1, r10)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r9)
            goto Lde
        Ldd:
            monitor-exit(r9)
        Lde:
            return r4
        Ldf:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Ld1
            throw r10
        Le1:
            return r4
        Le2:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r10
    }

    public final synchronized android.graphics.drawable.Drawable c(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.graphics.drawable.Drawable r2 = r1.d(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r3, int r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.d     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L6
            goto L26
        L6:
            r0 = 1
            r2.d = r0     // Catch: java.lang.Throwable -> L31
            r0 = 2131230839(0x7f080077, float:1.8077742E38)
            android.graphics.drawable.Drawable r0 = r2.c(r3, r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L40
            boolean r1 = r0 instanceof defpackage.e90     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L26
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L31
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L40
        L26:
            android.graphics.drawable.Drawable r0 = r2.a(r3, r4)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L33
            android.graphics.drawable.Drawable r0 = defpackage.gd.b(r3, r4)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r3 = move-exception
            goto L4b
        L33:
            if (r0 == 0) goto L39
            android.graphics.drawable.Drawable r0 = r2.g(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L31
        L39:
            if (r0 == 0) goto L3e
            defpackage.eh.a(r0)     // Catch: java.lang.Throwable -> L31
        L3e:
            monitor-exit(r2)
            return r0
        L40:
            r3 = 0
            r2.d = r3     // Catch: java.lang.Throwable -> L31
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r3
    }

    public final synchronized android.content.res.ColorStateList f(android.content.Context r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.a     // Catch: java.lang.Throwable -> L47
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L47
            e40 r0 = (defpackage.e40) r0     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.b(r5, r1)     // Catch: java.lang.Throwable -> L47
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch: java.lang.Throwable -> L47
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L49
            t3 r0 = r3.e     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L1d
            goto L21
        L1d:
            android.content.res.ColorStateList r1 = r0.d(r4, r5)     // Catch: java.lang.Throwable -> L47
        L21:
            if (r1 == 0) goto L45
            java.util.WeakHashMap r0 = r3.a     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L2e
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            r3.a = r0     // Catch: java.lang.Throwable -> L47
        L2e:
            java.util.WeakHashMap r0 = r3.a     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L47
            e40 r0 = (defpackage.e40) r0     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L42
            e40 r0 = new e40     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            java.util.WeakHashMap r2 = r3.a     // Catch: java.lang.Throwable -> L47
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L47
        L42:
            r0.a(r5, r1)     // Catch: java.lang.Throwable -> L47
        L45:
            r0 = r1
            goto L49
        L47:
            r4 = move-exception
            goto L4b
        L49:
            monitor-exit(r3)
            return r0
        L4b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            throw r4
    }

    public final android.graphics.drawable.Drawable g(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
            r9 = this;
            android.content.res.ColorStateList r0 = r9.f(r10, r11)
            r1 = 0
            if (r0 == 0) goto L22
            int[] r10 = defpackage.eh.a
            android.graphics.drawable.Drawable r10 = r13.mutate()
            defpackage.ch.h(r10, r0)
            t3 r12 = r9.e
            if (r12 != 0) goto L15
            goto L1c
        L15:
            r12 = 2131230826(0x7f08006a, float:1.8077716E38)
            if (r11 != r12) goto L1c
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L1c:
            if (r1 == 0) goto L21
            defpackage.ch.i(r10, r1)
        L21:
            return r10
        L22:
            t3 r0 = r9.e
            r2 = 2130968802(0x7f0400e2, float:1.7546268E38)
            r3 = 2130968800(0x7f0400e0, float:1.7546264E38)
            if (r0 == 0) goto L96
            r0 = 2131230821(0x7f080065, float:1.8077706E38)
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r11 != r0) goto L60
            r11 = r13
            android.graphics.drawable.LayerDrawable r11 = (android.graphics.drawable.LayerDrawable) r11
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r6)
            int r0 = defpackage.r60.c(r10, r2)
            android.graphics.PorterDuff$Mode r1 = defpackage.u3.b
            defpackage.t3.e(r12, r0, r1)
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r5)
            int r0 = defpackage.r60.c(r10, r2)
            defpackage.t3.e(r12, r0, r1)
            android.graphics.drawable.Drawable r11 = r11.findDrawableByLayerId(r4)
            int r10 = defpackage.r60.c(r10, r3)
            defpackage.t3.e(r11, r10, r1)
            return r13
        L60:
            r0 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r11 == r0) goto L6f
            r0 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r11 == r0) goto L6f
            r0 = 2131230813(0x7f08005d, float:1.807769E38)
            if (r11 != r0) goto L96
        L6f:
            r11 = r13
            android.graphics.drawable.LayerDrawable r11 = (android.graphics.drawable.LayerDrawable) r11
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r6)
            int r0 = defpackage.r60.b(r10, r2)
            android.graphics.PorterDuff$Mode r1 = defpackage.u3.b
            defpackage.t3.e(r12, r0, r1)
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r5)
            int r0 = defpackage.r60.c(r10, r3)
            defpackage.t3.e(r12, r0, r1)
            android.graphics.drawable.Drawable r11 = r11.findDrawableByLayerId(r4)
            int r10 = defpackage.r60.c(r10, r3)
            defpackage.t3.e(r11, r10, r1)
            return r13
        L96:
            t3 r0 = r9.e
            r4 = 0
            if (r0 == 0) goto Lf5
            android.graphics.PorterDuff$Mode r5 = defpackage.u3.b
            int[] r6 = r0.a
            boolean r6 = defpackage.t3.a(r6, r11)
            r7 = 1
            r8 = -1
            if (r6 == 0) goto Laa
        La7:
            r0 = r7
        La8:
            r11 = r8
            goto Ldc
        Laa:
            int[] r2 = r0.c
            boolean r2 = defpackage.t3.a(r2, r11)
            if (r2 == 0) goto Lb4
            r2 = r3
            goto La7
        Lb4:
            int[] r0 = r0.d
            boolean r0 = defpackage.t3.a(r0, r11)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto Lc2
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto La7
        Lc2:
            r0 = 2131230798(0x7f08004e, float:1.8077659E38)
            if (r11 != r0) goto Ld3
            r11 = 1109603123(0x42233333, float:40.8)
            int r11 = java.lang.Math.round(r11)
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = r7
            goto Ldc
        Ld3:
            r0 = 2131230780(0x7f08003c, float:1.8077622E38)
            if (r11 != r0) goto Ld9
            goto La7
        Ld9:
            r0 = r4
            r2 = r0
            goto La8
        Ldc:
            if (r0 == 0) goto Lf5
            int[] r0 = defpackage.eh.a
            android.graphics.drawable.Drawable r0 = r13.mutate()
            int r10 = defpackage.r60.c(r10, r2)
            android.graphics.PorterDuffColorFilter r10 = defpackage.u3.c(r10, r5)
            r0.setColorFilter(r10)
            if (r11 == r8) goto Lf4
            r0.setAlpha(r11)
        Lf4:
            r4 = r7
        Lf5:
            if (r4 != 0) goto Lfa
            if (r12 == 0) goto Lfa
            return r1
        Lfa:
            return r13
    }
}
