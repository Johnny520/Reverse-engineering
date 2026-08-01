package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xt extends defpackage.y2 {
    public static final int[][] A = null;
    public static final int B = 0;
    public static final int[] y = null;
    public static final int[] z = null;
    public final java.util.LinkedHashSet e;
    public final java.util.LinkedHashSet f;
    public android.content.res.ColorStateList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public java.lang.CharSequence k;
    public android.graphics.drawable.Drawable l;
    public android.graphics.drawable.Drawable m;
    public boolean n;
    public android.content.res.ColorStateList o;
    public android.content.res.ColorStateList p;
    public android.graphics.PorterDuff.Mode q;
    public int r;
    public int[] s;
    public boolean t;
    public java.lang.CharSequence u;
    public android.widget.CompoundButton.OnCheckedChangeListener v;
    public final defpackage.n2 w;
    public final defpackage.vt x;

    static {
            r0 = 2130969515(0x7f0403ab, float:1.7547714E38)
            int[] r0 = new int[]{r0}
            defpackage.xt.y = r0
            r0 = 2130969514(0x7f0403aa, float:1.7547712E38)
            int[] r1 = new int[]{r0}
            defpackage.xt.z = r1
            r1 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r1, r0}
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r3 = new int[]{r1, r2}
            r4 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1, r4}
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r2 = new int[]{r5, r2}
            int[] r4 = new int[]{r5, r4}
            int[][] r0 = new int[][]{r0, r3, r1, r2, r4}
            defpackage.xt.A = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "drawable"
            java.lang.String r2 = "android"
            java.lang.String r3 = "btn_check_material_anim"
            int r0 = r0.getIdentifier(r3, r1, r2)
            defpackage.xt.B = r0
            return
    }

    public xt(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r0 = 2131821578(0x7f11040a, float:1.9275903E38)
            r4 = 2130968737(0x7f0400a1, float:1.7546136E38)
            android.content.Context r9 = defpackage.ff.W(r9, r10, r4, r0)
            r8.<init>(r9, r10, r4)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.e = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f = r9
            android.content.Context r9 = r8.getContext()
            n2 r0 = new n2
            r7 = 0
            r0.<init>(r9, r7)
            android.content.res.Resources r1 = r9.getResources()
            android.content.res.Resources$Theme r9 = r9.getTheme()
            java.lang.ThreadLocal r2 = defpackage.c10.a
            r2 = 2131230893(0x7f0800ad, float:1.8077852E38)
            android.graphics.drawable.Drawable r9 = defpackage.x00.a(r1, r2, r9)
            r0.a = r9
            k2 r1 = r0.f
            r9.setCallback(r1)
            m2 r9 = new m2
            android.graphics.drawable.Drawable r1 = r0.a
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r9.<init>(r1)
            r8.w = r0
            vt r9 = new vt
            r9.<init>(r8)
            r8.x = r9
            android.content.Context r1 = r8.getContext()
            android.graphics.drawable.Drawable r9 = defpackage.xb.a(r8)
            r8.l = r9
            android.content.res.ColorStateList r9 = r8.getSuperButtonTintList()
            r8.o = r9
            r9 = 0
            r8.setSupportButtonTintList(r9)
            int[] r6 = new int[r7]
            r5 = 2131821578(0x7f11040a, float:1.9275903E38)
            defpackage.a80.c(r1, r10, r4, r5)
            int[] r3 = defpackage.wy.n
            r2 = r10
            defpackage.a80.e(r1, r2, r3, r4, r5, r6)
            r5 r10 = new r5
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r10.<init>(r1, r0)
            r2 = 2
            android.graphics.drawable.Drawable r2 = r10.m(r2)
            r8.m = r2
            android.graphics.drawable.Drawable r2 = r8.l
            r3 = 1
            if (r2 == 0) goto Lba
            r2 = 2130969119(0x7f04021f, float:1.754691E38)
            boolean r2 = defpackage.gt.z(r1, r2, r7)
            if (r2 == 0) goto Lba
            int r2 = r0.getResourceId(r7, r7)
            int r4 = r0.getResourceId(r3, r7)
            int r5 = defpackage.xt.B
            if (r2 != r5) goto Lba
            if (r4 != 0) goto Lba
            super.setButtonDrawable(r9)
            r9 = 2131230892(0x7f0800ac, float:1.807785E38)
            android.graphics.drawable.Drawable r9 = defpackage.ff.r(r1, r9)
            r8.l = r9
            r8.n = r3
            android.graphics.drawable.Drawable r9 = r8.m
            if (r9 != 0) goto Lba
            r9 = 2131230894(0x7f0800ae, float:1.8077854E38)
            android.graphics.drawable.Drawable r9 = defpackage.ff.r(r1, r9)
            r8.m = r9
        Lba:
            r9 = 3
            android.content.res.ColorStateList r9 = defpackage.ct.m(r1, r10, r9)
            r8.p = r9
            r9 = 4
            r1 = -1
            int r9 = r0.getInt(r9, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = defpackage.gt.v(r9, r1)
            r8.q = r9
            r9 = 10
            boolean r9 = r0.getBoolean(r9, r7)
            r8.h = r9
            r9 = 6
            boolean r9 = r0.getBoolean(r9, r3)
            r8.i = r9
            r9 = 9
            boolean r9 = r0.getBoolean(r9, r7)
            r8.j = r9
            r9 = 8
            java.lang.CharSequence r9 = r0.getText(r9)
            r8.k = r9
            r9 = 7
            boolean r1 = r0.hasValue(r9)
            if (r1 == 0) goto Lfc
            int r9 = r0.getInt(r9, r7)
            r8.setCheckedState(r9)
        Lfc:
            r10.z()
            r8.a()
            return
    }

    private java.lang.String getButtonStateDescription() {
            r2 = this;
            int r0 = r2.r
            r1 = 1
            if (r0 != r1) goto L11
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131755103(0x7f10005f, float:1.9141076E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L11:
            if (r0 != 0) goto L1f
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131755105(0x7f100061, float:1.914108E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L1f:
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131755104(0x7f100060, float:1.9141078E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.g
            if (r0 != 0) goto L49
            r0 = 2130968800(0x7f0400e0, float:1.7546264E38)
            int r0 = defpackage.zt.k(r7, r0)
            r1 = 2130968803(0x7f0400e3, float:1.754627E38)
            int r1 = defpackage.zt.k(r7, r1)
            r2 = 2130968841(0x7f040109, float:1.7546347E38)
            int r2 = defpackage.zt.k(r7, r2)
            r3 = 2130968819(0x7f0400f3, float:1.7546302E38)
            int r3 = defpackage.zt.k(r7, r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r1 = defpackage.zt.E(r4, r2, r1)
            int r0 = defpackage.zt.E(r4, r2, r0)
            r4 = 1057635697(0x3f0a3d71, float:0.54)
            int r4 = defpackage.zt.E(r4, r2, r3)
            r5 = 1052938076(0x3ec28f5c, float:0.38)
            int r6 = defpackage.zt.E(r5, r2, r3)
            int r2 = defpackage.zt.E(r5, r2, r3)
            int[] r0 = new int[]{r1, r0, r4, r6, r2}
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            int[][] r2 = defpackage.xt.A
            r1.<init>(r2, r0)
            r7.g = r1
        L49:
            android.content.res.ColorStateList r0 = r7.g
            return r0
    }

    private android.content.res.ColorStateList getSuperButtonTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.o
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            if (r0 == 0) goto L10
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            return r0
        L10:
            android.content.res.ColorStateList r0 = r1.getSupportButtonTintList()
            return r0
    }

    public final void a() {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.l
            android.content.res.ColorStateList r1 = r6.o
            android.graphics.PorterDuff$Mode r2 = defpackage.wb.b(r6)
            r3 = 0
            if (r0 != 0) goto Ld
            r0 = r3
            goto L18
        Ld:
            if (r1 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r2 == 0) goto L18
            defpackage.ch.i(r0, r2)
        L18:
            r6.l = r0
            android.graphics.drawable.Drawable r0 = r6.m
            android.content.res.ColorStateList r1 = r6.p
            android.graphics.PorterDuff$Mode r2 = r6.q
            if (r0 != 0) goto L24
            r0 = r3
            goto L2f
        L24:
            if (r1 == 0) goto L2f
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r2 == 0) goto L2f
            defpackage.ch.i(r0, r2)
        L2f:
            r6.m = r0
            boolean r0 = r6.n
            if (r0 != 0) goto L37
            goto Ld6
        L37:
            n2 r0 = r6.w
            if (r0 == 0) goto Lb8
            l2 r1 = r0.b
            android.graphics.drawable.Drawable r2 = r0.a
            vt r4 = r6.x
            if (r2 == 0) goto L55
            android.graphics.drawable.AnimatedVectorDrawable r2 = (android.graphics.drawable.AnimatedVectorDrawable) r2
            j2 r5 = r4.a
            if (r5 != 0) goto L50
            j2 r5 = new j2
            r5.<init>(r4)
            r4.a = r5
        L50:
            j2 r5 = r4.a
            r2.unregisterAnimationCallback(r5)
        L55:
            java.util.ArrayList r2 = r0.e
            if (r2 == 0) goto L72
            if (r4 != 0) goto L5c
            goto L72
        L5c:
            r2.remove(r4)
            java.util.ArrayList r2 = r0.e
            int r2 = r2.size()
            if (r2 != 0) goto L72
            y0 r2 = r0.d
            if (r2 == 0) goto L72
            android.animation.AnimatorSet r5 = r1.b
            r5.removeListener(r2)
            r0.d = r3
        L72:
            android.graphics.drawable.Drawable r2 = r0.a
            if (r2 == 0) goto L89
            android.graphics.drawable.AnimatedVectorDrawable r2 = (android.graphics.drawable.AnimatedVectorDrawable) r2
            j2 r1 = r4.a
            if (r1 != 0) goto L83
            j2 r1 = new j2
            r1.<init>(r4)
            r4.a = r1
        L83:
            j2 r1 = r4.a
            r2.registerAnimationCallback(r1)
            goto Lb8
        L89:
            if (r4 != 0) goto L8c
            goto Lb8
        L8c:
            java.util.ArrayList r2 = r0.e
            if (r2 != 0) goto L97
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.e = r2
        L97:
            java.util.ArrayList r2 = r0.e
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto La0
            goto Lb8
        La0:
            java.util.ArrayList r2 = r0.e
            r2.add(r4)
            y0 r2 = r0.d
            if (r2 != 0) goto Lb1
            y0 r2 = new y0
            r3 = 1
            r2.<init>(r3, r0)
            r0.d = r2
        Lb1:
            android.animation.AnimatorSet r1 = r1.b
            y0 r2 = r0.d
            r1.addListener(r2)
        Lb8:
            android.graphics.drawable.Drawable r1 = r6.l
            boolean r2 = r1 instanceof android.graphics.drawable.AnimatedStateListDrawable
            if (r2 == 0) goto Ld6
            if (r0 == 0) goto Ld6
            android.graphics.drawable.AnimatedStateListDrawable r1 = (android.graphics.drawable.AnimatedStateListDrawable) r1
            r2 = 2131296354(0x7f090062, float:1.8210622E38)
            r3 = 2131296689(0x7f0901b1, float:1.8211302E38)
            r4 = 0
            r1.addTransition(r2, r3, r0, r4)
            android.graphics.drawable.Drawable r1 = r6.l
            android.graphics.drawable.AnimatedStateListDrawable r1 = (android.graphics.drawable.AnimatedStateListDrawable) r1
            r2 = 2131296448(0x7f0900c0, float:1.8210813E38)
            r1.addTransition(r2, r3, r0, r4)
        Ld6:
            android.graphics.drawable.Drawable r0 = r6.l
            if (r0 == 0) goto Le1
            android.content.res.ColorStateList r1 = r6.o
            if (r1 == 0) goto Le1
            defpackage.ch.h(r0, r1)
        Le1:
            android.graphics.drawable.Drawable r0 = r6.m
            if (r0 == 0) goto Lec
            android.content.res.ColorStateList r1 = r6.p
            if (r1 == 0) goto Lec
            defpackage.ch.h(r0, r1)
        Lec:
            android.graphics.drawable.Drawable r0 = r6.l
            android.graphics.drawable.Drawable r1 = r6.m
            if (r0 != 0) goto Lf4
            r0 = r1
            goto L150
        Lf4:
            if (r1 != 0) goto Lf7
            goto L150
        Lf7:
            int r2 = r1.getIntrinsicWidth()
            r3 = -1
            if (r2 == r3) goto Lff
            goto L103
        Lff:
            int r2 = r0.getIntrinsicWidth()
        L103:
            int r4 = r1.getIntrinsicHeight()
            if (r4 == r3) goto L10a
            goto L10e
        L10a:
            int r4 = r0.getIntrinsicHeight()
        L10e:
            int r3 = r0.getIntrinsicWidth()
            if (r2 > r3) goto L11b
            int r3 = r0.getIntrinsicHeight()
            if (r4 > r3) goto L11b
            goto L13d
        L11b:
            float r2 = (float) r2
            float r3 = (float) r4
            float r2 = r2 / r3
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            int r4 = r0.getIntrinsicHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L136
            int r3 = r0.getIntrinsicWidth()
            float r4 = (float) r3
            float r4 = r4 / r2
            int r4 = (int) r4
            r2 = r3
            goto L13d
        L136:
            int r4 = r0.getIntrinsicHeight()
            float r3 = (float) r4
            float r2 = r2 * r3
            int r2 = (int) r2
        L13d:
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r0, r1}
            r3.<init>(r0)
            r0 = 1
            r3.setLayerSize(r0, r2, r4)
            r1 = 17
            r3.setLayerGravity(r0, r1)
            r0 = r3
        L150:
            super.setButtonDrawable(r0)
            r6.refreshDrawableState()
            return
    }

    @Override // android.widget.CompoundButton
    public android.graphics.drawable.Drawable getButtonDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.l
            return r0
    }

    public android.graphics.drawable.Drawable getButtonIconDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.m
            return r0
    }

    public android.content.res.ColorStateList getButtonIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.p
            return r0
    }

    public android.graphics.PorterDuff.Mode getButtonIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.q
            return r0
    }

    @Override // android.widget.CompoundButton
    public android.content.res.ColorStateList getButtonTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.o
            return r0
    }

    public int getCheckedState() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    public java.lang.CharSequence getErrorAccessibilityLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.k
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
            r2 = this;
            int r0 = r2.r
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.h
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = r1.o
            if (r0 != 0) goto L13
            android.content.res.ColorStateList r0 = r1.p
            if (r0 != 0) goto L13
            r0 = 1
            r1.setUseMaterialThemeColors(r0)
        L13:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r4) {
            r3 = this;
            r0 = 2
            int r4 = r4 + r0
            int[] r4 = super.onCreateDrawableState(r4)
            int r1 = r3.getCheckedState()
            if (r1 != r0) goto L11
            int[] r0 = defpackage.xt.y
            android.view.View.mergeDrawableStates(r4, r0)
        L11:
            boolean r0 = r3.j
            if (r0 == 0) goto L1a
            int[] r0 = defpackage.xt.z
            android.view.View.mergeDrawableStates(r4, r0)
        L1a:
            r0 = 0
        L1b:
            int r1 = r4.length
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r0 >= r1) goto L35
            r1 = r4[r0]
            if (r1 != r2) goto L27
            r1 = r4
            goto L3f
        L27:
            if (r1 != 0) goto L32
            java.lang.Object r1 = r4.clone()
            int[] r1 = (int[]) r1
            r1[r0] = r2
            goto L3f
        L32:
            int r0 = r0 + 1
            goto L1b
        L35:
            int r0 = r4.length
            int r0 = r0 + 1
            int[] r1 = java.util.Arrays.copyOf(r4, r0)
            int r0 = r4.length
            r1[r0] = r2
        L3f:
            r3.s = r1
            return r4
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.i
            if (r0 == 0) goto L54
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L54
            android.graphics.drawable.Drawable r0 = defpackage.xb.a(r5)
            if (r0 == 0) goto L54
            boolean r1 = defpackage.gt.n(r5)
            if (r1 == 0) goto L1c
            r1 = -1
            goto L1d
        L1c:
            r1 = 1
        L1d:
            int r2 = r5.getWidth()
            int r3 = r0.getIntrinsicWidth()
            int r2 = r2 - r3
            int r2 = r2 / 2
            int r2 = r2 * r1
            int r1 = r6.save()
            float r3 = (float) r2
            r4 = 0
            r6.translate(r3, r4)
            super.onDraw(r6)
            r6.restoreToCount(r1)
            android.graphics.drawable.Drawable r6 = r5.getBackground()
            if (r6 == 0) goto L53
            android.graphics.Rect r6 = r0.getBounds()
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            int r1 = r6.left
            int r1 = r1 + r2
            int r3 = r6.top
            int r4 = r6.right
            int r4 = r4 + r2
            int r6 = r6.bottom
            defpackage.ch.f(r0, r1, r3, r4, r6)
        L53:
            return
        L54:
            super.onDraw(r6)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            if (r3 != 0) goto L6
            goto L27
        L6:
            boolean r0 = r2.j
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r3.getText()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.CharSequence r1 = r2.k
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
        L27:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.wt
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            wt r2 = (defpackage.wt) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            int r2 = r2.a
            r1.setCheckedState(r2)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            wt r1 = new wt
            r1.<init>(r0)
            int r0 = r2.getCheckedState()
            r1.a = r0
            return r1
    }

    @Override // defpackage.y2, android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // defpackage.y2, android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.l = r1
            r1 = 0
            r0.n = r1
            r0.a()
            return
    }

    public void setButtonIconDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.m = r1
            r0.a()
            return
    }

    public void setButtonIconDrawableResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setButtonIconDrawable(r2)
            return
    }

    public void setButtonIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.p
            if (r0 != r2) goto L5
            return
        L5:
            r1.p = r2
            r1.a()
            return
    }

    public void setButtonIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.q
            if (r0 != r2) goto L5
            return
        L5:
            r1.q = r2
            r1.a()
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.o
            if (r0 != r2) goto L5
            return
        L5:
            r1.o = r2
            r1.a()
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportButtonTintMode(r1)
            r0.a()
            return
    }

    public void setCenterIfNoTextEnabled(boolean r1) {
            r0 = this;
            r0.i = r1
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r1) {
            r0 = this;
            r0.setCheckedState(r1)
            return
    }

    public void setCheckedState(int r4) {
            r3 = this;
            int r0 = r3.r
            if (r0 == r4) goto L62
            r3.r = r4
            r0 = 0
            r1 = 1
            if (r4 != r1) goto Lc
            r4 = r1
            goto Ld
        Lc:
            r4 = r0
        Ld:
            super.setChecked(r4)
            r3.refreshDrawableState()
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r4 < r2) goto L24
            java.lang.CharSequence r4 = r3.u
            if (r4 != 0) goto L24
            java.lang.String r4 = r3.getButtonStateDescription()
            super.setStateDescription(r4)
        L24:
            boolean r4 = r3.t
            if (r4 == 0) goto L29
            goto L62
        L29:
            r3.t = r1
            java.util.LinkedHashSet r4 = r3.f
            if (r4 == 0) goto L3f
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L3a
            goto L3f
        L3a:
            java.lang.ClassCastException r4 = defpackage.z30.h(r4)
            throw r4
        L3f:
            int r4 = r3.r
            r1 = 2
            if (r4 == r1) goto L4f
            android.widget.CompoundButton$OnCheckedChangeListener r4 = r3.v
            if (r4 == 0) goto L4f
            boolean r1 = r3.isChecked()
            r4.onCheckedChanged(r3, r1)
        L4f:
            android.content.Context r4 = r3.getContext()
            java.lang.Class<android.view.autofill.AutofillManager> r1 = android.view.autofill.AutofillManager.class
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            if (r4 == 0) goto L60
            r4.notifyValueChanged(r3)
        L60:
            r3.t = r0
        L62:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            super.setEnabled(r1)
            return
    }

    public void setErrorAccessibilityLabel(java.lang.CharSequence r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void setErrorAccessibilityLabelResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setErrorAccessibilityLabel(r2)
            return
    }

    public void setErrorShown(boolean r2) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 != r2) goto L5
            goto L16
        L5:
            r1.j = r2
            r1.refreshDrawableState()
            java.util.LinkedHashSet r2 = r1.e
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L17
        L16:
            return
        L17:
            java.lang.ClassCastException r2 = defpackage.z30.h(r2)
            throw r2
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener r1) {
            r0 = this;
            r0.v = r1
            return
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(java.lang.CharSequence r3) {
            r2 = this;
            r2.u = r3
            if (r3 != 0) goto L14
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L13
            if (r3 != 0) goto L13
            java.lang.String r3 = r2.getButtonStateDescription()
            super.setStateDescription(r3)
        L13:
            return
        L14:
            super.setStateDescription(r3)
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.h = r1
            if (r1 == 0) goto Lc
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsTintList()
            defpackage.wb.c(r0, r1)
            return
        Lc:
            r1 = 0
            defpackage.wb.c(r0, r1)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
            r1 = this;
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
