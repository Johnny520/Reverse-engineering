package a;

/* JADX INFO: renamed from: a.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0322pd {
    public static final android.graphics.PorterDuff.Mode f = null;
    public static a.C0322pd g;
    public static final a.C0322pd.a h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.WeakHashMap<android.content.Context, a.C0305oe<android.content.res.ColorStateList>> f642a;
    public final java.util.WeakHashMap<android.content.Context, a.U9<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>>> b;
    public android.util.TypedValue c;
    public boolean d;
    public a.Y0.a e;

    /* JADX INFO: renamed from: a.pd$a */
    public static class a extends a.W9<java.lang.Integer, android.graphics.PorterDuffColorFilter> {
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            a.C0322pd.f = r0
            a.pd$a r0 = new a.pd$a
            r1 = 6
            r0.<init>(r1)
            a.C0322pd.h = r0
            return
    }

    public C0322pd() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.b = r0
            return
    }

    public static synchronized a.C0322pd b() {
            java.lang.Class<a.pd> r0 = a.C0322pd.class
            monitor-enter(r0)
            a.pd r1 = a.C0322pd.g     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            a.pd r1 = new a.pd     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            a.C0322pd.g = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            a.pd r1 = a.C0322pd.g     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static synchronized android.graphics.PorterDuffColorFilter e(int r4, android.graphics.PorterDuff.Mode r5) {
            java.lang.Class<a.pd> r0 = a.C0322pd.class
            monitor-enter(r0)
            a.pd$a r1 = a.C0322pd.h     // Catch: java.lang.Throwable -> L33
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
            java.util.WeakHashMap<android.content.Context, a.U9<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r3 = r9.b     // Catch: java.lang.Throwable -> L47
            java.lang.Object r3 = r3.get(r10)     // Catch: java.lang.Throwable -> L47
            a.U9 r3 = (a.U9) r3     // Catch: java.lang.Throwable -> L47
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
            goto Ld9
        L4a:
            long[] r5 = r3.b     // Catch: java.lang.Throwable -> L47
            int r6 = r3.d     // Catch: java.lang.Throwable -> L47
            int r5 = a.C0435w1.b(r5, r6, r1)     // Catch: java.lang.Throwable -> L47
            if (r5 < 0) goto L61
            java.lang.Object[] r6 = r3.c     // Catch: java.lang.Throwable -> L47
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L47
            java.lang.Object r8 = a.U9.e     // Catch: java.lang.Throwable -> L47
            if (r7 == r8) goto L61
            r6[r5] = r8     // Catch: java.lang.Throwable -> L47
            r5 = 1
            r3.f290a = r5     // Catch: java.lang.Throwable -> L47
        L61:
            monitor-exit(r9)
        L62:
            if (r4 == 0) goto L65
            return r4
        L65:
            a.Y0$a r3 = r9.e
            r4 = 0
            if (r3 != 0) goto L6b
            goto La5
        L6b:
            int r3 = androidx.appcompat.R.drawable.abc_cab_background_top_material
            if (r11 != r3) goto L85
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable
            int r11 = androidx.appcompat.R.drawable.abc_cab_background_internal_bg
            android.graphics.drawable.Drawable r11 = r9.c(r10, r11)
            int r3 = androidx.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha
            android.graphics.drawable.Drawable r3 = r9.c(r10, r3)
            android.graphics.drawable.Drawable[] r11 = new android.graphics.drawable.Drawable[]{r11, r3}
            r4.<init>(r11)
            goto La5
        L85:
            int r3 = androidx.appcompat.R.drawable.abc_ratingbar_material
            if (r11 != r3) goto L90
            int r11 = androidx.appcompat.R.dimen.abc_star_big
            android.graphics.drawable.LayerDrawable r4 = a.Y0.a.c(r9, r10, r11)
            goto La5
        L90:
            int r3 = androidx.appcompat.R.drawable.abc_ratingbar_indicator_material
            if (r11 != r3) goto L9b
            int r11 = androidx.appcompat.R.dimen.abc_star_medium
            android.graphics.drawable.LayerDrawable r4 = a.Y0.a.c(r9, r10, r11)
            goto La5
        L9b:
            int r3 = androidx.appcompat.R.drawable.abc_ratingbar_small_material
            if (r11 != r3) goto La5
            int r11 = androidx.appcompat.R.dimen.abc_star_small
            android.graphics.drawable.LayerDrawable r4 = a.Y0.a.c(r9, r10, r11)
        La5:
            if (r4 == 0) goto Ld8
            int r11 = r0.changingConfigurations
            r4.setChangingConfigurations(r11)
            monitor-enter(r9)
            android.graphics.drawable.Drawable$ConstantState r11 = r4.getConstantState()     // Catch: java.lang.Throwable -> Lc8
            if (r11 == 0) goto Ld4
            java.util.WeakHashMap<android.content.Context, a.U9<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r9.b     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> Lc8
            a.U9 r0 = (a.U9) r0     // Catch: java.lang.Throwable -> Lc8
            if (r0 != 0) goto Lca
            a.U9 r0 = new a.U9     // Catch: java.lang.Throwable -> Lc8
            r0.<init>()     // Catch: java.lang.Throwable -> Lc8
            java.util.WeakHashMap<android.content.Context, a.U9<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r3 = r9.b     // Catch: java.lang.Throwable -> Lc8
            r3.put(r10, r0)     // Catch: java.lang.Throwable -> Lc8
            goto Lca
        Lc8:
            r10 = move-exception
            goto Ld6
        Lca:
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lc8
            r10.<init>(r11)     // Catch: java.lang.Throwable -> Lc8
            r0.d(r1, r10)     // Catch: java.lang.Throwable -> Lc8
            monitor-exit(r9)
            goto Ld5
        Ld4:
            monitor-exit(r9)
        Ld5:
            return r4
        Ld6:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lc8
            throw r10
        Ld8:
            return r4
        Ld9:
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
            boolean r0 = r2.d     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L6
            goto L25
        L6:
            r0 = 1
            r2.d = r0     // Catch: java.lang.Throwable -> L36
            int r0 = androidx.appcompat.resources.R.drawable.abc_vector_test     // Catch: java.lang.Throwable -> L36
            android.graphics.drawable.Drawable r0 = r2.c(r3, r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L3f
            boolean r1 = r0 instanceof a.C0110dg     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L25
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L3f
        L25:
            android.graphics.drawable.Drawable r0 = r2.a(r3, r4)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L2f
            android.graphics.drawable.Drawable r0 = a.Y3.a.b(r3, r4)     // Catch: java.lang.Throwable -> L36
        L2f:
            if (r0 == 0) goto L38
            android.graphics.drawable.Drawable r0 = r2.g(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r3 = move-exception
            goto L4a
        L38:
            if (r0 == 0) goto L3d
            a.C0457x5.a(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            monitor-exit(r2)
            return r0
        L3f:
            r3 = 0
            r2.d = r3     // Catch: java.lang.Throwable -> L36
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L36
            throw r3     // Catch: java.lang.Throwable -> L36
        L4a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            throw r3
    }

    public final synchronized android.content.res.ColorStateList f(android.content.Context r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, a.oe<android.content.res.ColorStateList>> r0 = r3.f642a     // Catch: java.lang.Throwable -> L47
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L47
            a.oe r0 = (a.C0305oe) r0     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.b(r5, r1)     // Catch: java.lang.Throwable -> L47
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch: java.lang.Throwable -> L47
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L49
            a.Y0$a r0 = r3.e     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L1d
            goto L21
        L1d:
            android.content.res.ColorStateList r1 = r0.d(r4, r5)     // Catch: java.lang.Throwable -> L47
        L21:
            if (r1 == 0) goto L45
            java.util.WeakHashMap<android.content.Context, a.oe<android.content.res.ColorStateList>> r0 = r3.f642a     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L2e
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            r3.f642a = r0     // Catch: java.lang.Throwable -> L47
        L2e:
            java.util.WeakHashMap<android.content.Context, a.oe<android.content.res.ColorStateList>> r0 = r3.f642a     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L47
            a.oe r0 = (a.C0305oe) r0     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L42
            a.oe r0 = new a.oe     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            java.util.WeakHashMap<android.content.Context, a.oe<android.content.res.ColorStateList>> r2 = r3.f642a     // Catch: java.lang.Throwable -> L47
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

    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.f(r8, r9)
            r1 = 0
            if (r0 == 0) goto L1f
            android.graphics.drawable.Drawable r8 = r11.mutate()
            a.C0439w5.a.h(r8, r0)
            a.Y0$a r10 = r7.e
            if (r10 != 0) goto L13
            goto L19
        L13:
            int r10 = androidx.appcompat.R.drawable.abc_switch_thumb_material
            if (r9 != r10) goto L19
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L19:
            if (r1 == 0) goto L1e
            a.C0439w5.a.i(r8, r1)
        L1e:
            return r8
        L1f:
            a.Y0$a r0 = r7.e
            if (r0 == 0) goto L95
            int r0 = androidx.appcompat.R.drawable.abc_seekbar_track_material
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            r3 = 16908303(0x102000f, float:2.387727E-38)
            r4 = 16908288(0x1020000, float:2.387723E-38)
            if (r9 != r0) goto L5c
            r9 = r11
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r4)
            int r0 = androidx.appcompat.R.attr.colorControlNormal
            int r0 = a.C0109df.c(r8, r0)
            android.graphics.PorterDuff$Mode r1 = a.Y0.b
            a.Y0.a.e(r10, r0, r1)
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r3)
            int r0 = androidx.appcompat.R.attr.colorControlNormal
            int r0 = a.C0109df.c(r8, r0)
            a.Y0.a.e(r10, r0, r1)
            android.graphics.drawable.Drawable r9 = r9.findDrawableByLayerId(r2)
            int r10 = androidx.appcompat.R.attr.colorControlActivated
            int r8 = a.C0109df.c(r8, r10)
            a.Y0.a.e(r9, r8, r1)
            return r11
        L5c:
            int r0 = androidx.appcompat.R.drawable.abc_ratingbar_material
            if (r9 == r0) goto L68
            int r0 = androidx.appcompat.R.drawable.abc_ratingbar_indicator_material
            if (r9 == r0) goto L68
            int r0 = androidx.appcompat.R.drawable.abc_ratingbar_small_material
            if (r9 != r0) goto L95
        L68:
            r9 = r11
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r4)
            int r0 = androidx.appcompat.R.attr.colorControlNormal
            int r0 = a.C0109df.b(r8, r0)
            android.graphics.PorterDuff$Mode r1 = a.Y0.b
            a.Y0.a.e(r10, r0, r1)
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r3)
            int r0 = androidx.appcompat.R.attr.colorControlActivated
            int r0 = a.C0109df.c(r8, r0)
            a.Y0.a.e(r10, r0, r1)
            android.graphics.drawable.Drawable r9 = r9.findDrawableByLayerId(r2)
            int r10 = androidx.appcompat.R.attr.colorControlActivated
            int r8 = a.C0109df.c(r8, r10)
            a.Y0.a.e(r9, r8, r1)
            return r11
        L95:
            a.Y0$a r0 = r7.e
            r2 = 0
            if (r0 == 0) goto Lf7
            android.graphics.PorterDuff$Mode r3 = a.Y0.b
            int[] r4 = r0.f348a
            boolean r4 = a.Y0.a.a(r4, r9)
            r5 = 1
            r6 = -1
            if (r4 == 0) goto Lab
            int r9 = androidx.appcompat.R.attr.colorControlNormal
        La8:
            r4 = r5
        La9:
            r0 = r6
            goto Le0
        Lab:
            int[] r4 = r0.c
            boolean r4 = a.Y0.a.a(r4, r9)
            if (r4 == 0) goto Lb6
            int r9 = androidx.appcompat.R.attr.colorControlActivated
            goto La8
        Lb6:
            int[] r0 = r0.d
            boolean r0 = a.Y0.a.a(r0, r9)
            r4 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto Lc5
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
        Lc3:
            r9 = r4
            goto La8
        Lc5:
            int r0 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto Ld8
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r4 = r0
            r0 = r9
            r9 = r4
            r4 = r5
            goto Le0
        Ld8:
            int r0 = androidx.appcompat.R.drawable.abc_dialog_material_background
            if (r9 != r0) goto Ldd
            goto Lc3
        Ldd:
            r9 = r2
            r4 = r9
            goto La9
        Le0:
            if (r4 == 0) goto Lf7
            android.graphics.drawable.Drawable r2 = r11.mutate()
            int r8 = a.C0109df.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = a.Y0.c(r8, r3)
            r2.setColorFilter(r8)
            if (r0 == r6) goto Lf6
            r2.setAlpha(r0)
        Lf6:
            r2 = r5
        Lf7:
            if (r2 != 0) goto Lfc
            if (r10 == 0) goto Lfc
            return r1
        Lfc:
            return r11
    }
}
