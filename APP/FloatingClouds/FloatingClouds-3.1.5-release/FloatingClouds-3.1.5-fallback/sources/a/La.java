package a;

/* JADX INFO: loaded from: classes.dex */
public final class La extends a.J0 {
    public static final int[] A = null;
    public static final int[][] B = null;

    @android.annotation.SuppressLint({"DiscouragedApi"})
    public static final int C = 0;
    public static final int y = 0;
    public static final int[] z = null;
    public final java.util.LinkedHashSet<a.La.c> e;
    public final java.util.LinkedHashSet<a.La.b> f;
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
    public final a.C0398u0 w;
    public final a.La.a x;

    public class a extends a.AbstractC0380t0 {
        public final /* synthetic */ a.La b;

        public a(a.La r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        @Override // a.AbstractC0380t0
        public final void a(android.graphics.drawable.Drawable r2) {
                r1 = this;
                a.La r0 = r1.b
                android.content.res.ColorStateList r0 = r0.o
                if (r0 == 0) goto L9
                a.C0439w5.a.h(r2, r0)
            L9:
                return
        }

        @Override // a.AbstractC0380t0
        public final void b(android.graphics.drawable.Drawable r4) {
                r3 = this;
                a.La r0 = r3.b
                android.content.res.ColorStateList r1 = r0.o
                if (r1 == 0) goto L13
                int[] r0 = r0.s
                int r2 = r1.getDefaultColor()
                int r0 = r1.getColorForState(r0, r2)
                a.C0439w5.a.g(r4, r0)
            L13:
                return
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public static class d extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<a.La.d> CREATOR = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f164a;

        public class a implements android.os.Parcelable.Creator<a.La.d> {
            @Override // android.os.Parcelable.Creator
            public final a.La.d createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    a.La$d r0 = new a.La$d
                    r0.<init>(r3)
                    java.lang.Class<a.La$d> r1 = a.La.d.class
                    java.lang.ClassLoader r1 = r1.getClassLoader()
                    java.lang.Object r3 = r3.readValue(r1)
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    r0.f164a = r3
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final a.La.d[] newArray(int r1) {
                    r0 = this;
                    a.La$d[] r1 = new a.La.d[r1]
                    return r1
            }
        }

        static {
                a.La$d$a r0 = new a.La$d$a
                r0.<init>()
                a.La.d.CREATOR = r0
                return
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "MaterialCheckBox.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r3)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " CheckedState="
                r0.append(r1)
                int r1 = r3.f164a
                r2 = 1
                if (r1 == r2) goto L25
                r2 = 2
                if (r1 == r2) goto L22
                java.lang.String r1 = "unchecked"
                goto L27
            L22:
                java.lang.String r1 = "indeterminate"
                goto L27
            L25:
                java.lang.String r1 = "checked"
            L27:
                java.lang.String r2 = "}"
                java.lang.String r0 = a.C0487z.h(r0, r1, r2)
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f164a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.writeValue(r2)
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_CompoundButton_CheckBox
            a.La.y = r0
            int r0 = com.google.android.material.R.attr.state_indeterminate
            int[] r0 = new int[]{r0}
            a.La.z = r0
            int r0 = com.google.android.material.R.attr.state_error
            int[] r1 = new int[]{r0}
            a.La.A = r1
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
            a.La.B = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "drawable"
            java.lang.String r2 = "android"
            java.lang.String r3 = "btn_check_material_anim"
            int r0 = r0.getIdentifier(r3, r1, r2)
            a.La.C = r0
            return
    }

    public La(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            int r3 = com.google.android.material.R.attr.checkboxStyle
            int r4 = a.La.y
            android.content.Context r8 = a.Wa.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.e = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.f = r8
            android.content.Context r8 = r7.getContext()
            int r0 = com.google.android.material.R.drawable.mtrl_checkbox_button_checked_unchecked
            a.u0 r1 = new a.u0
            r1.<init>(r8)
            android.content.res.Resources r2 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            java.lang.ThreadLocal<android.util.TypedValue> r5 = a.C0340qd.f657a
            android.graphics.drawable.Drawable r8 = a.C0340qd.a.a(r2, r0, r8)
            r1.f428a = r8
            a.u0$a r0 = r1.f
            r8.setCallback(r0)
            a.u0$c r8 = new a.u0$c
            android.graphics.drawable.Drawable r0 = r1.f428a
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            r8.<init>(r0)
            r7.w = r1
            a.La$a r8 = new a.La$a
            r8.<init>(r7)
            r7.x = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r8 = a.G3.a(r7)
            r7.l = r8
            android.content.res.ColorStateList r8 = r7.getSuperButtonTintList()
            r7.o = r8
            r8 = 0
            r7.setSupportButtonTintList(r8)
            int[] r2 = com.google.android.material.R.styleable.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            a.C0091cf.a(r0, r9, r3, r4)
            r1 = r9
            a.C0091cf.b(r0, r1, r2, r3, r4, r5)
            a.of r9 = new a.of
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r9.<init>(r0, r1)
            int r2 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r2 = r9.b(r2)
            r7.m = r2
            android.graphics.drawable.Drawable r2 = r7.l
            r3 = 1
            if (r2 == 0) goto Lb6
            int r2 = com.google.android.material.R.attr.isMaterial3Theme
            boolean r2 = a.C0498za.b(r0, r2, r6)
            if (r2 == 0) goto Lb6
            int r2 = com.google.android.material.R.styleable.MaterialCheckBox_android_button
            int r2 = r1.getResourceId(r2, r6)
            int r4 = com.google.android.material.R.styleable.MaterialCheckBox_buttonCompat
            int r4 = r1.getResourceId(r4, r6)
            int r5 = a.La.C
            if (r2 != r5) goto Lb6
            if (r4 != 0) goto Lb6
            super.setButtonDrawable(r8)
            int r8 = com.google.android.material.R.drawable.mtrl_checkbox_button
            android.graphics.drawable.Drawable r8 = a.C0435w1.A(r0, r8)
            r7.l = r8
            r7.n = r3
            android.graphics.drawable.Drawable r8 = r7.m
            if (r8 != 0) goto Lb6
            int r8 = com.google.android.material.R.drawable.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r8 = a.C0435w1.A(r0, r8)
            r7.m = r8
        Lb6:
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r8 = a.Sa.a(r0, r9, r8)
            r7.p = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTintMode
            r0 = -1
            int r8 = r1.getInt(r8, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r8 = a.Rg.b(r8, r0)
            r7.q = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r1.getBoolean(r8, r6)
            r7.h = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_centerIfNoTextEnabled
            boolean r8 = r1.getBoolean(r8, r3)
            r7.i = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_errorShown
            boolean r8 = r1.getBoolean(r8, r6)
            r7.j = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r8 = r1.getText(r8)
            r7.k = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_checkedState
            boolean r8 = r1.hasValue(r8)
            if (r8 == 0) goto Lfe
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_checkedState
            int r8 = r1.getInt(r8, r6)
            r7.setCheckedState(r8)
        Lfe:
            r9.f()
            r7.b()
            return
    }

    private java.lang.String getButtonStateDescription() {
            r2 = this;
            int r0 = r2.r
            r1 = 1
            if (r0 != r1) goto L10
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.mtrl_checkbox_state_description_checked
            java.lang.String r0 = r0.getString(r1)
            return r0
        L10:
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.mtrl_checkbox_state_description_unchecked
            java.lang.String r0 = r0.getString(r1)
            return r0
        L1d:
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.string.mtrl_checkbox_state_description_indeterminate
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.g
            if (r0 != 0) goto L45
            int r0 = com.google.android.material.R.attr.colorControlActivated
            int r0 = a.Na.b(r7, r0)
            int r1 = com.google.android.material.R.attr.colorError
            int r1 = a.Na.b(r7, r1)
            int r2 = com.google.android.material.R.attr.colorSurface
            int r2 = a.Na.b(r7, r2)
            int r3 = com.google.android.material.R.attr.colorOnSurface
            int r3 = a.Na.b(r7, r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r1 = a.Na.d(r2, r1, r4)
            int r0 = a.Na.d(r2, r0, r4)
            r4 = 1057635697(0x3f0a3d71, float:0.54)
            int r4 = a.Na.d(r2, r3, r4)
            r5 = 1052938076(0x3ec28f5c, float:0.38)
            int r6 = a.Na.d(r2, r3, r5)
            int r2 = a.Na.d(r2, r3, r5)
            int[] r0 = new int[]{r1, r0, r4, r6, r2}
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            int[][] r2 = a.La.B
            r1.<init>(r2, r0)
            r7.g = r1
        L45:
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

    public final void b() {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.l
            android.content.res.ColorStateList r1 = r6.o
            android.graphics.PorterDuff$Mode r2 = a.F3.b(r6)
            r3 = 0
            if (r0 != 0) goto Ld
            r0 = r3
            goto L18
        Ld:
            if (r1 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r2 == 0) goto L18
            a.C0439w5.a.i(r0, r2)
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
            a.C0439w5.a.i(r0, r2)
        L2f:
            r6.m = r0
            boolean r0 = r6.n
            if (r0 != 0) goto L37
            goto Ld5
        L37:
            a.u0 r0 = r6.w
            if (r0 == 0) goto Lb8
            android.graphics.drawable.Drawable r1 = r0.f428a
            a.La$a r2 = r6.x
            if (r1 == 0) goto L53
            android.graphics.drawable.AnimatedVectorDrawable r1 = (android.graphics.drawable.AnimatedVectorDrawable) r1
            a.s0 r4 = r2.f691a
            if (r4 != 0) goto L4e
            a.s0 r4 = new a.s0
            r4.<init>(r2)
            r2.f691a = r4
        L4e:
            a.s0 r4 = r2.f691a
            r1.unregisterAnimationCallback(r4)
        L53:
            java.util.ArrayList<a.t0> r1 = r0.e
            a.u0$b r4 = r0.b
            if (r1 == 0) goto L72
            if (r2 != 0) goto L5c
            goto L72
        L5c:
            r1.remove(r2)
            java.util.ArrayList<a.t0> r1 = r0.e
            int r1 = r1.size()
            if (r1 != 0) goto L72
            a.v0 r1 = r0.d
            if (r1 == 0) goto L72
            android.animation.AnimatorSet r5 = r4.b
            r5.removeListener(r1)
            r0.d = r3
        L72:
            android.graphics.drawable.Drawable r1 = r0.f428a
            if (r1 == 0) goto L89
            android.graphics.drawable.AnimatedVectorDrawable r1 = (android.graphics.drawable.AnimatedVectorDrawable) r1
            a.s0 r3 = r2.f691a
            if (r3 != 0) goto L83
            a.s0 r3 = new a.s0
            r3.<init>(r2)
            r2.f691a = r3
        L83:
            a.s0 r2 = r2.f691a
            r1.registerAnimationCallback(r2)
            goto Lb8
        L89:
            if (r2 != 0) goto L8c
            goto Lb8
        L8c:
            java.util.ArrayList<a.t0> r1 = r0.e
            if (r1 != 0) goto L97
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.e = r1
        L97:
            java.util.ArrayList<a.t0> r1 = r0.e
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto La0
            goto Lb8
        La0:
            java.util.ArrayList<a.t0> r1 = r0.e
            r1.add(r2)
            a.v0 r1 = r0.d
            if (r1 != 0) goto Lb1
            a.v0 r1 = new a.v0
            r2 = 0
            r1.<init>(r2, r0)
            r0.d = r1
        Lb1:
            android.animation.AnimatorSet r1 = r4.b
            a.v0 r2 = r0.d
            r1.addListener(r2)
        Lb8:
            android.graphics.drawable.Drawable r1 = r6.l
            boolean r2 = r1 instanceof android.graphics.drawable.AnimatedStateListDrawable
            if (r2 == 0) goto Ld5
            if (r0 == 0) goto Ld5
            android.graphics.drawable.AnimatedStateListDrawable r1 = (android.graphics.drawable.AnimatedStateListDrawable) r1
            int r2 = com.google.android.material.R.id.checked
            int r3 = com.google.android.material.R.id.unchecked
            r4 = 0
            r1.addTransition(r2, r3, r0, r4)
            android.graphics.drawable.Drawable r1 = r6.l
            android.graphics.drawable.AnimatedStateListDrawable r1 = (android.graphics.drawable.AnimatedStateListDrawable) r1
            int r2 = com.google.android.material.R.id.indeterminate
            int r3 = com.google.android.material.R.id.unchecked
            r1.addTransition(r2, r3, r0, r4)
        Ld5:
            android.graphics.drawable.Drawable r0 = r6.l
            if (r0 == 0) goto Le0
            android.content.res.ColorStateList r1 = r6.o
            if (r1 == 0) goto Le0
            a.C0439w5.a.h(r0, r1)
        Le0:
            android.graphics.drawable.Drawable r0 = r6.m
            if (r0 == 0) goto Leb
            android.content.res.ColorStateList r1 = r6.p
            if (r1 == 0) goto Leb
            a.C0439w5.a.h(r0, r1)
        Leb:
            android.graphics.drawable.Drawable r0 = r6.l
            android.graphics.drawable.Drawable r1 = r6.m
            if (r0 != 0) goto Lf3
            r0 = r1
            goto L14f
        Lf3:
            if (r1 != 0) goto Lf6
            goto L14f
        Lf6:
            int r2 = r1.getIntrinsicWidth()
            r3 = -1
            if (r2 == r3) goto Lfe
            goto L102
        Lfe:
            int r2 = r0.getIntrinsicWidth()
        L102:
            int r4 = r1.getIntrinsicHeight()
            if (r4 == r3) goto L109
            goto L10d
        L109:
            int r4 = r0.getIntrinsicHeight()
        L10d:
            int r3 = r0.getIntrinsicWidth()
            if (r2 > r3) goto L11a
            int r3 = r0.getIntrinsicHeight()
            if (r4 > r3) goto L11a
            goto L13c
        L11a:
            float r2 = (float) r2
            float r3 = (float) r4
            float r2 = r2 / r3
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            int r4 = r0.getIntrinsicHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L135
            int r3 = r0.getIntrinsicWidth()
            float r4 = (float) r3
            float r4 = r4 / r2
            int r4 = (int) r4
            r2 = r3
            goto L13c
        L135:
            int r4 = r0.getIntrinsicHeight()
            float r3 = (float) r4
            float r2 = r2 * r3
            int r2 = (int) r2
        L13c:
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r0, r1}
            r3.<init>(r0)
            r0 = 1
            r3.setLayerSize(r0, r2, r4)
            r1 = 17
            r3.setLayerGravity(r0, r1)
            r0 = r3
        L14f:
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
            int[] r0 = a.La.z
            android.view.View.mergeDrawableStates(r4, r0)
        L11:
            boolean r0 = r3.j
            if (r0 == 0) goto L1a
            int[] r0 = a.La.A
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
            android.graphics.drawable.Drawable r0 = a.G3.a(r5)
            if (r0 == 0) goto L54
            boolean r1 = a.Rg.a(r5)
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
            a.C0439w5.a.f(r0, r1, r3, r4, r6)
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
            boolean r0 = r2 instanceof a.La.d
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            a.La$d r2 = (a.La.d) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            int r2 = r2.f164a
            r1.setCheckedState(r2)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            a.La$d r1 = new a.La$d
            r1.<init>(r0)
            int r0 = r2.getCheckedState()
            r1.f164a = r0
            return r1
    }

    @Override // a.J0, android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // a.J0, android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.l = r1
            r1 = 0
            r0.n = r1
            r0.b()
            return
    }

    public void setButtonIconDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.m = r1
            r0.b()
            return
    }

    public void setButtonIconDrawableResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
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
            r1.b()
            return
    }

    public void setButtonIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.q
            if (r0 != r2) goto L5
            return
        L5:
            r1.q = r2
            r1.b()
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
            r1.b()
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportButtonTintMode(r1)
            r0.b()
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
            if (r0 == r4) goto L66
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
            goto L66
        L29:
            r3.t = r1
            java.util.LinkedHashSet<a.La$b> r4 = r3.f
            if (r4 == 0) goto L43
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r4.next()
            a.La$b r1 = (a.La.b) r1
            r1.a()
            goto L33
        L43:
            int r4 = r3.r
            r1 = 2
            if (r4 == r1) goto L53
            android.widget.CompoundButton$OnCheckedChangeListener r4 = r3.v
            if (r4 == 0) goto L53
            boolean r1 = r3.isChecked()
            r4.onCheckedChanged(r3, r1)
        L53:
            android.content.Context r4 = r3.getContext()
            java.lang.Class<android.view.autofill.AutofillManager> r1 = android.view.autofill.AutofillManager.class
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            if (r4 == 0) goto L64
            r4.notifyValueChanged(r3)
        L64:
            r3.t = r0
        L66:
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
            goto L20
        L5:
            r1.j = r2
            r1.refreshDrawableState()
            java.util.LinkedHashSet<a.La$c> r2 = r1.e
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            a.La$c r0 = (a.La.c) r0
            r0.a()
            goto L10
        L20:
            return
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
            a.F3.c(r0, r1)
            return
        Lc:
            r1 = 0
            a.F3.c(r0, r1)
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
