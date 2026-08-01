package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tn1 {

    /* JADX INFO: renamed from: ζ */
    public static final android.graphics.PorterDuff.Mode f10420 = null;

    /* JADX INFO: renamed from: η */
    public static p000.tn1 f10421;

    /* JADX INFO: renamed from: θ */
    public static final p000.sn1 f10422 = null;

    /* JADX INFO: renamed from: α */
    public java.util.WeakHashMap f10423;

    /* JADX INFO: renamed from: β */
    public final java.util.WeakHashMap f10424;

    /* JADX INFO: renamed from: γ */
    public android.util.TypedValue f10425;

    /* JADX INFO: renamed from: δ */
    public boolean f10426;

    /* JADX INFO: renamed from: ε */
    public p000.C0384i5 f10427;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            p000.tn1.f10420 = r0
            sn1 r0 = new sn1
            r1 = 6
            r0.<init>(r1)
            p000.tn1.f10422 = r0
            return
    }

    public tn1() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.f10424 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public static synchronized p000.tn1 m5720() {
            java.lang.Class<tn1> r0 = p000.tn1.class
            monitor-enter(r0)
            tn1 r1 = p000.tn1.f10421     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            tn1 r1 = new tn1     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            p000.tn1.f10421 = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            tn1 r1 = p000.tn1.f10421     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    /* JADX INFO: renamed from: ζ */
    public static synchronized android.graphics.PorterDuffColorFilter m5721(int r4, android.graphics.PorterDuff.Mode r5) {
            java.lang.Class<tn1> r0 = p000.tn1.class
            monitor-enter(r0)
            sn1 r1 = p000.tn1.f10422     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
            r2 = 31
            int r3 = r2 + r4
            int r3 = r3 * r2
            int r2 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r1.m3421(r2)     // Catch: java.lang.Throwable -> L33
            android.graphics.PorterDuffColorFilter r2 = (android.graphics.PorterDuffColorFilter) r2     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L35
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> L33
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L33
            int r4 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r4 = r4 + r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r1.m3422(r4, r2)     // Catch: java.lang.Throwable -> L33
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

    /* JADX INFO: renamed from: α */
    public final void m5722(android.content.Context r6, int r7, android.content.res.ColorStateList r8) {
            r5 = this;
            java.util.WeakHashMap r0 = r5.f10423
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r5.f10423 = r0
        Lb:
            java.util.WeakHashMap r0 = r5.f10423
            java.lang.Object r0 = r0.get(r6)
            kz1 r0 = (p000.kz1) r0
            if (r0 != 0) goto L20
            kz1 r0 = new kz1
            r1 = 0
            r0.<init>(r1)
            java.util.WeakHashMap r5 = r5.f10423
            r5.put(r6, r0)
        L20:
            int r5 = r0.f6335
            if (r5 == 0) goto L30
            int[] r6 = r0.f6333
            int r1 = r5 + (-1)
            r6 = r6[r1]
            if (r7 > r6) goto L30
            r0.m3429(r7, r8)
            return
        L30:
            int[] r6 = r0.f6333
            int r6 = r6.length
            r1 = 1
            if (r5 < r6) goto L5b
            int r6 = r5 + 1
            r2 = 4
            int r6 = r6 * r2
            r3 = r2
        L3b:
            r4 = 32
            if (r3 >= r4) goto L4a
            int r4 = r1 << r3
            int r4 = r4 + (-12)
            if (r6 > r4) goto L47
            r6 = r4
            goto L4a
        L47:
            int r3 = r3 + 1
            goto L3b
        L4a:
            int r6 = r6 / r2
            int[] r2 = r0.f6333
            int[] r2 = java.util.Arrays.copyOf(r2, r6)
            r0.f6333 = r2
            java.lang.Object[] r2 = r0.f6334
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r2, r6)
            r0.f6334 = r6
        L5b:
            int[] r6 = r0.f6333
            r6[r5] = r7
            java.lang.Object[] r6 = r0.f6334
            r6[r5] = r8
            int r5 = r5 + r1
            r0.f6335 = r5
            return
    }

    /* JADX INFO: renamed from: β */
    public final android.graphics.drawable.Drawable m5723(android.content.Context r7, int r8) {
            r6 = this;
            android.util.TypedValue r0 = r6.f10425
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r6.f10425 = r0
        Lb:
            android.util.TypedValue r0 = r6.f10425
            android.content.res.Resources r1 = r7.getResources()
            r2 = 1
            r1.getValue(r8, r0, r2)
            int r1 = r0.assetCookie
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data
            long r3 = (long) r3
            long r1 = r1 | r3
            monitor-enter(r6)
            java.util.WeakHashMap r3 = r6.f10424     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L48
            zv0 r3 = (p000.zv0) r3     // Catch: java.lang.Throwable -> L48
            r4 = 0
            if (r3 != 0) goto L2e
            monitor-exit(r6)
        L2c:
            r3 = r4
            goto L50
        L2e:
            java.lang.Object r5 = r3.m7234(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4b
            android.content.res.Resources r3 = r7.getResources()     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.Drawable r3 = r5.newDrawable(r3)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r6)
            goto L50
        L48:
            r7 = move-exception
            goto Ld0
        L4b:
            r3.m7237(r1)     // Catch: java.lang.Throwable -> L48
        L4e:
            monitor-exit(r6)
            goto L2c
        L50:
            if (r3 == 0) goto L53
            return r3
        L53:
            i5 r3 = r6.f10427
            if (r3 != 0) goto L59
        L57:
            r8 = r4
            goto L9c
        L59:
            r3 = 2131230737(0x7f080011, float:1.8077535E38)
            if (r8 != r3) goto L76
            android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable
            r3 = 2131230736(0x7f080010, float:1.8077533E38)
            android.graphics.drawable.Drawable r3 = r6.m5724(r7, r3)
            r5 = 2131230738(0x7f080012, float:1.8077537E38)
            android.graphics.drawable.Drawable r5 = r6.m5724(r7, r5)
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[]{r3, r5}
            r8.<init>(r3)
            goto L9c
        L76:
            r3 = 2131230772(0x7f080034, float:1.8077606E38)
            if (r8 != r3) goto L83
            r8 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r8 = p000.C0384i5.m2616(r6, r7, r8)
            goto L9c
        L83:
            r3 = 2131230771(0x7f080033, float:1.8077604E38)
            if (r8 != r3) goto L90
            r8 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r8 = p000.C0384i5.m2616(r6, r7, r8)
            goto L9c
        L90:
            r3 = 2131230773(0x7f080035, float:1.8077608E38)
            if (r8 != r3) goto L57
            r8 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r8 = p000.C0384i5.m2616(r6, r7, r8)
        L9c:
            if (r8 == 0) goto Lcf
            int r0 = r0.changingConfigurations
            r8.setChangingConfigurations(r0)
            monitor-enter(r6)
            android.graphics.drawable.Drawable$ConstantState r0 = r8.getConstantState()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto Lcb
            java.util.WeakHashMap r3 = r6.f10424     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> Lbf
            zv0 r3 = (p000.zv0) r3     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto Lc1
            zv0 r3 = new zv0     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbf
            java.util.WeakHashMap r4 = r6.f10424     // Catch: java.lang.Throwable -> Lbf
            r4.put(r7, r3)     // Catch: java.lang.Throwable -> Lbf
            goto Lc1
        Lbf:
            r7 = move-exception
            goto Lcd
        Lc1:
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lbf
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            r3.m7236(r1, r7)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r6)
            return r8
        Lcb:
            monitor-exit(r6)
            return r8
        Lcd:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbf
            throw r7
        Lcf:
            return r8
        Ld0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
            throw r7
    }

    /* JADX INFO: renamed from: δ */
    public final synchronized android.graphics.drawable.Drawable m5724(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.graphics.drawable.Drawable r2 = r1.m5725(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    /* JADX INFO: renamed from: ε */
    public final synchronized android.graphics.drawable.Drawable m5725(android.content.Context r3, int r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f10426     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6
            goto L22
        L6:
            r0 = 1
            r2.f10426 = r0     // Catch: java.lang.Throwable -> L2d
            r0 = 2131230799(0x7f08004f, float:1.807766E38)
            android.graphics.drawable.Drawable r0 = r2.m5724(r3, r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L3c
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L3c
        L22:
            android.graphics.drawable.Drawable r0 = r2.m5723(r3, r4)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L2f
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r3 = move-exception
            goto L47
        L2f:
            if (r0 == 0) goto L35
            android.graphics.drawable.Drawable r0 = r2.m5727(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L2d
        L35:
            if (r0 == 0) goto L3a
            p000.AbstractC0300fw.m2205(r0)     // Catch: java.lang.Throwable -> L2d
        L3a:
            monitor-exit(r2)
            return r0
        L3c:
            r3 = 0
            r2.f10426 = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            throw r3     // Catch: java.lang.Throwable -> L2d
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r3
    }

    /* JADX INFO: renamed from: η */
    public final synchronized android.content.res.ColorStateList m5726(android.content.Context r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.WeakHashMap r0 = r2.f10423     // Catch: java.lang.Throwable -> L27
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L27
            kz1 r0 = (p000.kz1) r0     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.m3428(r4)     // Catch: java.lang.Throwable -> L27
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch: java.lang.Throwable -> L27
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L2a
            i5 r0 = r2.f10427     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L1d
            goto L21
        L1d:
            android.content.res.ColorStateList r1 = r0.m2618(r3, r4)     // Catch: java.lang.Throwable -> L27
        L21:
            if (r1 == 0) goto L29
            r2.m5722(r3, r4, r1)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r3 = move-exception
            goto L2c
        L29:
            r0 = r1
        L2a:
            monitor-exit(r2)
            return r0
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    /* JADX INFO: renamed from: θ */
    public final android.graphics.drawable.Drawable m5727(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
            r8 = this;
            android.content.res.ColorStateList r0 = r8.m5726(r9, r10)
            r1 = 0
            if (r0 == 0) goto L20
            android.graphics.drawable.Drawable r9 = r12.mutate()
            r9.setTintList(r0)
            i5 r8 = r8.f10427
            if (r8 != 0) goto L13
            goto L1a
        L13:
            r8 = 2131230786(0x7f080042, float:1.8077635E38)
            if (r10 != r8) goto L1a
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L1a:
            if (r1 == 0) goto L1f
            r9.setTintMode(r1)
        L1f:
            return r9
        L20:
            i5 r0 = r8.f10427
            r2 = 2130968667(0x7f04005b, float:1.7545994E38)
            r3 = 2130968665(0x7f040059, float:1.754599E38)
            if (r0 == 0) goto L94
            r0 = 2131230781(0x7f08003d, float:1.8077624E38)
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r10 != r0) goto L5e
            r8 = r12
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r6)
            int r11 = p000.b42.m741(r9, r2)
            android.graphics.PorterDuff$Mode r0 = p000.C0419j5.f5320
            p000.C0384i5.m2617(r10, r11, r0)
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r5)
            int r11 = p000.b42.m741(r9, r2)
            p000.C0384i5.m2617(r10, r11, r0)
            android.graphics.drawable.Drawable r8 = r8.findDrawableByLayerId(r4)
            int r9 = p000.b42.m741(r9, r3)
            p000.C0384i5.m2617(r8, r9, r0)
            return r12
        L5e:
            r0 = 2131230772(0x7f080034, float:1.8077606E38)
            if (r10 == r0) goto L6d
            r0 = 2131230771(0x7f080033, float:1.8077604E38)
            if (r10 == r0) goto L6d
            r0 = 2131230773(0x7f080035, float:1.8077608E38)
            if (r10 != r0) goto L94
        L6d:
            r8 = r12
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r6)
            int r11 = p000.b42.m740(r9, r2)
            android.graphics.PorterDuff$Mode r0 = p000.C0419j5.f5320
            p000.C0384i5.m2617(r10, r11, r0)
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r5)
            int r11 = p000.b42.m741(r9, r3)
            p000.C0384i5.m2617(r10, r11, r0)
            android.graphics.drawable.Drawable r8 = r8.findDrawableByLayerId(r4)
            int r9 = p000.b42.m741(r9, r3)
            p000.C0384i5.m2617(r8, r9, r0)
            return r12
        L94:
            i5 r8 = r8.f10427
            r0 = 0
            if (r8 == 0) goto Lff
            android.graphics.PorterDuff$Mode r4 = p000.C0419j5.f5320
            java.lang.Object r5 = r8.f4914
            int[] r5 = (int[]) r5
            boolean r5 = p000.C0384i5.m2614(r10, r5)
            r6 = 1
            r7 = -1
            if (r5 == 0) goto Laa
        La7:
            r10 = r6
        La8:
            r8 = r7
            goto Le0
        Laa:
            java.lang.Object r2 = r8.f4916
            int[] r2 = (int[]) r2
            boolean r2 = p000.C0384i5.m2614(r10, r2)
            if (r2 == 0) goto Lb6
            r2 = r3
            goto La7
        Lb6:
            java.lang.Object r8 = r8.f4917
            int[] r8 = (int[]) r8
            boolean r8 = p000.C0384i5.m2614(r10, r8)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            if (r8 == 0) goto Lc6
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto La7
        Lc6:
            r8 = 2131230758(0x7f080026, float:1.8077578E38)
            if (r10 != r8) goto Ld7
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r10 = r6
            goto Le0
        Ld7:
            r8 = 2131230740(0x7f080014, float:1.8077541E38)
            if (r10 != r8) goto Ldd
            goto La7
        Ldd:
            r10 = r0
            r2 = r10
            goto La8
        Le0:
            if (r10 == 0) goto Lff
            android.graphics.drawable.Drawable r10 = r12.mutate()
            int r9 = p000.b42.m741(r9, r2)
            java.lang.Class<j5> r2 = p000.C0419j5.class
            monitor-enter(r2)
            android.graphics.PorterDuffColorFilter r9 = m5721(r9, r4)     // Catch: java.lang.Throwable -> Lfc
            monitor-exit(r2)
            r10.setColorFilter(r9)
            if (r8 == r7) goto Lfa
            r10.setAlpha(r8)
        Lfa:
            r0 = r6
            goto Lff
        Lfc:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lfc
            throw r8
        Lff:
            if (r0 != 0) goto L104
            if (r11 == 0) goto L104
            return r1
        L104:
            return r12
    }
}
