package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends android.widget.LinearLayout implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public static final int C0 = 0;
    public static final int[][] D0 = null;
    public android.content.res.ColorStateList A;
    public boolean A0;
    public android.content.res.ColorStateList B;
    public boolean B0;
    public boolean C;
    public java.lang.CharSequence D;
    public boolean E;
    public a.Ta F;
    public a.Ta G;
    public android.graphics.drawable.StateListDrawable H;
    public boolean I;
    public a.Ta J;
    public a.Ta K;
    public a.Vd L;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final android.graphics.Rect V;
    public final android.graphics.Rect W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f1092a;
    public final android.graphics.RectF a0;
    public final a.C0376se b;
    public android.graphics.Typeface b0;
    public final com.google.android.material.textfield.a c;
    public android.graphics.drawable.ColorDrawable c0;
    public android.widget.EditText d;
    public int d0;
    public java.lang.CharSequence e;
    public final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.f> e0;
    public int f;
    public android.graphics.drawable.ColorDrawable f0;
    public int g;
    public int g0;
    public int h;
    public android.graphics.drawable.Drawable h0;
    public int i;
    public android.content.res.ColorStateList i0;
    public final a.T8 j;
    public android.content.res.ColorStateList j0;
    public boolean k;
    public int k0;
    public int l;
    public int l0;
    public boolean m;
    public int m0;
    public com.google.android.material.textfield.TextInputLayout.e n;
    public android.content.res.ColorStateList n0;
    public a.C0345r1 o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public java.lang.CharSequence r;
    public int r0;
    public boolean s;
    public int s0;
    public a.C0345r1 t;
    public int t0;
    public android.content.res.ColorStateList u;
    public boolean u0;
    public int v;
    public final a.C0276n3 v0;
    public androidx.transition.c w;
    public boolean w0;
    public androidx.transition.c x;
    public boolean x0;
    public android.content.res.ColorStateList y;
    public android.animation.ValueAnimator y0;
    public android.content.res.ColorStateList z;
    public boolean z0;

    public class a implements android.text.TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1093a;
        public final /* synthetic */ android.widget.EditText b;
        public final /* synthetic */ com.google.android.material.textfield.TextInputLayout c;

        public a(com.google.android.material.textfield.TextInputLayout r1, android.widget.EditText r2) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r0.b = r2
                int r1 = r2.getLineCount()
                r0.f1093a = r1
                return
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(android.text.Editable r4) {
                r3 = this;
                com.google.android.material.textfield.TextInputLayout r0 = r3.c
                boolean r1 = r0.A0
                r1 = r1 ^ 1
                r2 = 0
                r0.u(r1, r2)
                boolean r1 = r0.k
                if (r1 == 0) goto L11
                r0.n(r4)
            L11:
                boolean r1 = r0.s
                if (r1 == 0) goto L18
                r0.v(r4)
            L18:
                android.widget.EditText r4 = r3.b
                int r1 = r4.getLineCount()
                int r2 = r3.f1093a
                if (r1 == r2) goto L33
                if (r1 >= r2) goto L31
                java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
                int r2 = r4.getMinimumHeight()
                int r0 = r0.t0
                if (r2 == r0) goto L31
                r4.setMinimumHeight(r0)
            L31:
                r3.f1093a = r1
            L33:
                return
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.textfield.TextInputLayout f1094a;

        public b(com.google.android.material.textfield.TextInputLayout r1) {
                r0 = this;
                r0.<init>()
                r0.f1094a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                com.google.android.material.textfield.TextInputLayout r0 = r1.f1094a
                com.google.android.material.textfield.a r0 = r0.c
                com.google.android.material.internal.CheckableImageButton r0 = r0.g
                r0.performClick()
                r0.jumpDrawablesToCurrentState()
                return
        }
    }

    public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.textfield.TextInputLayout f1095a;

        public c(com.google.android.material.textfield.TextInputLayout r1) {
                r0 = this;
                r0.<init>()
                r0.f1095a = r1
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.google.android.material.textfield.TextInputLayout r0 = r1.f1095a
                a.n3 r0 = r0.v0
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r0.k(r2)
                return
        }
    }

    public static class d extends a.C {
        public final com.google.android.material.textfield.TextInputLayout d;

        public d(com.google.android.material.textfield.TextInputLayout r1) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                return
        }

        @Override // a.C
        public final void d(android.view.View r18, a.I r19) {
                r17 = this;
                r0 = r17
                r1 = r19
                android.view.View$AccessibilityDelegate r2 = r0.f36a
                android.view.accessibility.AccessibilityNodeInfo r3 = r1.f118a
                r4 = r18
                r2.onInitializeAccessibilityNodeInfo(r4, r3)
                com.google.android.material.textfield.TextInputLayout r2 = r0.d
                android.widget.EditText r4 = r2.getEditText()
                if (r4 == 0) goto L1a
                android.text.Editable r4 = r4.getText()
                goto L1b
            L1a:
                r4 = 0
            L1b:
                java.lang.CharSequence r5 = r2.getHint()
                java.lang.CharSequence r6 = r2.getError()
                java.lang.CharSequence r7 = r2.getPlaceholderText()
                int r8 = r2.getCounterMaxLength()
                java.lang.CharSequence r9 = r2.getCounterOverflowDescription()
                boolean r10 = android.text.TextUtils.isEmpty(r4)
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                boolean r12 = r2.u0
                boolean r13 = android.text.TextUtils.isEmpty(r6)
                if (r13 == 0) goto L48
                boolean r14 = android.text.TextUtils.isEmpty(r9)
                if (r14 != 0) goto L46
                goto L48
            L46:
                r14 = 0
                goto L49
            L48:
                r14 = 1
            L49:
                if (r11 != 0) goto L50
                java.lang.String r5 = r5.toString()
                goto L52
            L50:
                java.lang.String r5 = ""
            L52:
                a.se r11 = r2.b
                a.r1 r15 = r11.b
                int r16 = r15.getVisibility()
                if (r16 != 0) goto L63
                r3.setLabelFor(r15)
                r3.setTraversalAfter(r15)
                goto L68
            L63:
                com.google.android.material.internal.CheckableImageButton r11 = r11.d
                r3.setTraversalAfter(r11)
            L68:
                if (r10 != 0) goto L6e
                r3.setText(r4)
                goto L98
            L6e:
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L93
                r3.setText(r5)
                if (r12 != 0) goto L98
                if (r7 == 0) goto L98
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r5)
                java.lang.String r12 = ", "
                r11.append(r12)
                r11.append(r7)
                java.lang.String r7 = r11.toString()
                r3.setText(r7)
                goto L98
            L93:
                if (r7 == 0) goto L98
                r3.setText(r7)
            L98:
                boolean r7 = android.text.TextUtils.isEmpty(r5)
                if (r7 != 0) goto La4
                r3.setHintText(r5)
                r3.setShowingHintText(r10)
            La4:
                if (r4 == 0) goto Lad
                int r4 = r4.length()
                if (r4 != r8) goto Lad
                goto Lae
            Lad:
                r8 = -1
            Lae:
                r3.setMaxTextLength(r8)
                if (r14 == 0) goto Lba
                if (r13 != 0) goto Lb6
                goto Lb7
            Lb6:
                r6 = r9
            Lb7:
                r3.setError(r6)
            Lba:
                a.T8 r4 = r2.j
                a.r1 r4 = r4.y
                if (r4 == 0) goto Lc3
                r3.setLabelFor(r4)
            Lc3:
                com.google.android.material.textfield.a r2 = r2.c
                a.c6 r2 = r2.b()
                r2.n(r1)
                return
        }

        @Override // a.C
        public final void e(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                super.e(r1, r2)
                com.google.android.material.textfield.TextInputLayout r1 = r0.d
                com.google.android.material.textfield.a r1 = r1.c
                a.c6 r1 = r1.b()
                r1.o(r2)
                return
        }
    }

    public interface e {
    }

    public interface f {
        void a(com.google.android.material.textfield.TextInputLayout r1);
    }

    public interface g {
        void a();
    }

    public static class h extends a.r {
        public static final android.os.Parcelable.Creator<com.google.android.material.textfield.TextInputLayout.h> CREATOR = null;
        public java.lang.CharSequence c;
        public boolean d;

        public class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.textfield.TextInputLayout.h> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.textfield.TextInputLayout$h r0 = new com.google.android.material.textfield.TextInputLayout$h
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final com.google.android.material.textfield.TextInputLayout.h createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.textfield.TextInputLayout$h r0 = new com.google.android.material.textfield.TextInputLayout$h
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.textfield.TextInputLayout$h[] r1 = new com.google.android.material.textfield.TextInputLayout.h[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.textfield.TextInputLayout$h$a r0 = new com.google.android.material.textfield.TextInputLayout$h$a
                r0.<init>()
                com.google.android.material.textfield.TextInputLayout.h.CREATOR = r0
                return
        }

        public h(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.os.Parcelable$Creator r2 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r2 = r2.createFromParcel(r1)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r0.c = r2
                int r1 = r1.readInt()
                r2 = 1
                if (r1 != r2) goto L15
                goto L16
            L15:
                r2 = 0
            L16:
                r0.d = r2
                return
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "TextInputLayout.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " error="
                r0.append(r1)
                java.lang.CharSequence r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                java.lang.CharSequence r0 = r1.c
                android.text.TextUtils.writeToParcel(r0, r2, r3)
                boolean r3 = r1.d
                r2.writeInt(r3)
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Design_TextInputLayout
            com.google.android.material.textfield.TextInputLayout.C0 = r0
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            r1 = 0
            int[] r1 = new int[r1]
            int[][] r0 = new int[][]{r0, r1}
            com.google.android.material.textfield.TextInputLayout.D0 = r0
            return
    }

    public TextInputLayout(android.content.Context r18, android.util.AttributeSet r19) {
            r17 = this;
            r0 = r17
            r2 = r19
            int r4 = com.google.android.material.R.attr.textInputStyle
            int r5 = com.google.android.material.textfield.TextInputLayout.C0
            r1 = r18
            android.content.Context r1 = a.Wa.a(r1, r2, r4, r5)
            r0.<init>(r1, r2, r4)
            r7 = -1
            r0.f = r7
            r0.g = r7
            r0.h = r7
            r0.i = r7
            a.T8 r1 = new a.T8
            r1.<init>(r0)
            r0.j = r1
            a.z r1 = new a.z
            r3 = 14
            r1.<init>(r3)
            r0.n = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.V = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.W = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.a0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.e0 = r1
            a.n3 r1 = new a.n3
            r1.<init>(r0)
            r0.v0 = r1
            r8 = 0
            r0.B0 = r8
            android.content.Context r3 = r0.getContext()
            r9 = 1
            r0.setOrientation(r9)
            r0.setWillNotDraw(r8)
            r0.setAddStatesFromChildren(r9)
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r3)
            r0.f1092a = r10
            r10.setAddStatesFromChildren(r9)
            android.view.animation.LinearInterpolator r6 = a.C0434w0.f744a
            r1.Q = r6
            r1.h(r8)
            r1.P = r6
            r1.h(r8)
            int r6 = r1.g
            r11 = 8388659(0x800033, float:1.1755015E-38)
            if (r6 == r11) goto L80
            r1.g = r11
            r1.h(r8)
        L80:
            int[] r1 = com.google.android.material.R.styleable.TextInputLayout
            int r6 = com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance
            int r11 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance
            int r12 = com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance
            int r13 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance
            int r14 = com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance
            int[] r6 = new int[]{r6, r11, r12, r13, r14}
            a.C0091cf.a(r3, r2, r4, r5)
            r16 = r3
            r3 = r1
            r1 = r16
            a.C0091cf.b(r1, r2, r3, r4, r5, r6)
            a.of r6 = new a.of
            android.content.res.TypedArray r3 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6.<init>(r1, r3)
            a.se r11 = new a.se
            r11.<init>(r0, r6)
            r0.b = r11
            int r12 = com.google.android.material.R.styleable.TextInputLayout_hintEnabled
            boolean r12 = r3.getBoolean(r12, r9)
            r0.C = r12
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_hint
            java.lang.CharSequence r12 = r3.getText(r12)
            r0.setHint(r12)
            int r12 = com.google.android.material.R.styleable.TextInputLayout_hintAnimationEnabled
            boolean r12 = r3.getBoolean(r12, r9)
            r0.x0 = r12
            int r12 = com.google.android.material.R.styleable.TextInputLayout_expandedHintEnabled
            boolean r12 = r3.getBoolean(r12, r9)
            r0.w0 = r12
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_minEms
            boolean r12 = r3.hasValue(r12)
            if (r12 == 0) goto Lde
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_minEms
            int r12 = r3.getInt(r12, r7)
            r0.setMinEms(r12)
            goto Lef
        Lde:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_minWidth
            boolean r12 = r3.hasValue(r12)
            if (r12 == 0) goto Lef
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_minWidth
            int r12 = r3.getDimensionPixelSize(r12, r7)
            r0.setMinWidth(r12)
        Lef:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_maxEms
            boolean r12 = r3.hasValue(r12)
            if (r12 == 0) goto L101
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_maxEms
            int r12 = r3.getInt(r12, r7)
            r0.setMaxEms(r12)
            goto L112
        L101:
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_maxWidth
            boolean r12 = r3.hasValue(r12)
            if (r12 == 0) goto L112
            int r12 = com.google.android.material.R.styleable.TextInputLayout_android_maxWidth
            int r12 = r3.getDimensionPixelSize(r12, r7)
            r0.setMaxWidth(r12)
        L112:
            a.Vd$a r2 = a.Vd.b(r1, r2, r4, r5)
            a.Vd r2 = r2.a()
            r0.L = r2
            android.content.res.Resources r2 = r1.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r4)
            r0.N = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r3.getDimensionPixelOffset(r2, r8)
            r0.P = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r4 = r1.getResources()
            int r5 = com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r2 = r3.getDimensionPixelSize(r2, r4)
            r0.R = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r4 = r1.getResources()
            int r5 = com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r2 = r3.getDimensionPixelSize(r2, r4)
            r0.S = r2
            int r2 = r0.R
            r0.Q = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopStart
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r3.getDimension(r2, r4)
            int r5 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopEnd
            float r5 = r3.getDimension(r5, r4)
            int r12 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomEnd
            float r12 = r3.getDimension(r12, r4)
            int r13 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomStart
            float r4 = r3.getDimension(r13, r4)
            a.Vd r13 = r0.L
            a.Vd$a r13 = r13.e()
            r14 = 0
            int r15 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r15 < 0) goto L184
            a.s r15 = new a.s
            r15.<init>(r2)
            r13.e = r15
        L184:
            int r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r2 < 0) goto L18f
            a.s r2 = new a.s
            r2.<init>(r5)
            r13.f = r2
        L18f:
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L19a
            a.s r2 = new a.s
            r2.<init>(r12)
            r13.g = r2
        L19a:
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 < 0) goto L1a5
            a.s r2 = new a.s
            r2.<init>(r4)
            r13.h = r2
        L1a5:
            a.Vd r2 = r13.a()
            r0.L = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = a.Sa.a(r1, r6, r2)
            if (r2 == 0) goto L20b
            int r4 = r2.getDefaultColor()
            r0.o0 = r4
            r0.U = r4
            boolean r4 = r2.isStateful()
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r12 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L1ec
            int[] r4 = new int[]{r12}
            int r4 = r2.getColorForState(r4, r7)
            r0.p0 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r12 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r12}
            int r4 = r2.getColorForState(r4, r7)
            r0.q0 = r4
            int[] r4 = new int[]{r5, r12}
            int r2 = r2.getColorForState(r4, r7)
            r0.r0 = r2
            goto L215
        L1ec:
            int r2 = r0.o0
            r0.q0 = r2
            int r2 = com.google.android.material.R.color.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = a.Y3.a(r1, r2)
            int[] r4 = new int[]{r12}
            int r4 = r2.getColorForState(r4, r7)
            r0.p0 = r4
            int[] r4 = new int[]{r5}
            int r2 = r2.getColorForState(r4, r7)
            r0.r0 = r2
            goto L215
        L20b:
            r0.U = r8
            r0.o0 = r8
            r0.p0 = r8
            r0.q0 = r8
            r0.r0 = r8
        L215:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_textColorHint
            boolean r2 = r3.hasValue(r2)
            if (r2 == 0) goto L227
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r2 = r6.a(r2)
            r0.j0 = r2
            r0.i0 = r2
        L227:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r2 = a.Sa.a(r1, r6, r2)
            int r4 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor
            int r4 = r3.getColor(r4, r8)
            r0.m0 = r4
            int r4 = com.google.android.material.R.color.mtrl_textinput_default_box_stroke_color
            int r4 = a.Y3.b.a(r1, r4)
            r0.k0 = r4
            int r4 = com.google.android.material.R.color.mtrl_textinput_disabled_color
            int r4 = a.Y3.b.a(r1, r4)
            r0.s0 = r4
            int r4 = com.google.android.material.R.color.mtrl_textinput_hovered_box_stroke_color
            int r4 = a.Y3.b.a(r1, r4)
            r0.l0 = r4
            if (r2 == 0) goto L252
            r0.setBoxStrokeColorStateList(r2)
        L252:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeErrorColor
            boolean r2 = r3.hasValue(r2)
            if (r2 == 0) goto L263
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r1 = a.Sa.a(r1, r6, r2)
            r0.setBoxStrokeErrorColor(r1)
        L263:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance
            int r1 = r3.getResourceId(r1, r7)
            if (r1 == r7) goto L274
            int r1 = com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance
            int r1 = r3.getResourceId(r1, r8)
            r0.setHintTextAppearance(r1)
        L274:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_cursorColor
            android.content.res.ColorStateList r1 = r6.a(r1)
            r0.A = r1
            int r1 = com.google.android.material.R.styleable.TextInputLayout_cursorErrorColor
            android.content.res.ColorStateList r1 = r6.a(r1)
            r0.B = r1
            int r1 = com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance
            int r1 = r3.getResourceId(r1, r8)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_errorContentDescription
            java.lang.CharSequence r2 = r3.getText(r2)
            int r4 = com.google.android.material.R.styleable.TextInputLayout_errorAccessibilityLiveRegion
            int r4 = r3.getInt(r4, r9)
            int r5 = com.google.android.material.R.styleable.TextInputLayout_errorEnabled
            boolean r5 = r3.getBoolean(r5, r8)
            int r12 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance
            int r12 = r3.getResourceId(r12, r8)
            int r13 = com.google.android.material.R.styleable.TextInputLayout_helperTextEnabled
            boolean r13 = r3.getBoolean(r13, r8)
            int r14 = com.google.android.material.R.styleable.TextInputLayout_helperText
            java.lang.CharSequence r14 = r3.getText(r14)
            int r15 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextAppearance
            int r15 = r3.getResourceId(r15, r8)
            int r9 = com.google.android.material.R.styleable.TextInputLayout_placeholderText
            java.lang.CharSequence r9 = r3.getText(r9)
            int r7 = com.google.android.material.R.styleable.TextInputLayout_counterEnabled
            boolean r7 = r3.getBoolean(r7, r8)
            int r8 = com.google.android.material.R.styleable.TextInputLayout_counterMaxLength
            r19 = r14
            r14 = -1
            int r8 = r3.getInt(r8, r14)
            r0.setCounterMaxLength(r8)
            int r8 = com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance
            r14 = 0
            int r8 = r3.getResourceId(r8, r14)
            r0.q = r8
            int r8 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance
            int r8 = r3.getResourceId(r8, r14)
            r0.p = r8
            int r8 = com.google.android.material.R.styleable.TextInputLayout_boxBackgroundMode
            int r8 = r3.getInt(r8, r14)
            r0.setBoxBackgroundMode(r8)
            r0.setErrorContentDescription(r2)
            r0.setErrorAccessibilityLiveRegion(r4)
            int r2 = r0.p
            r0.setCounterOverflowTextAppearance(r2)
            r0.setHelperTextTextAppearance(r12)
            r0.setErrorTextAppearance(r1)
            int r1 = r0.q
            r0.setCounterTextAppearance(r1)
            r0.setPlaceholderText(r9)
            r0.setPlaceholderTextAppearance(r15)
            int r1 = com.google.android.material.R.styleable.TextInputLayout_errorTextColor
            boolean r1 = r3.hasValue(r1)
            if (r1 == 0) goto L313
            int r1 = com.google.android.material.R.styleable.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r1 = r6.a(r1)
            r0.setErrorTextColor(r1)
        L313:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor
            boolean r1 = r3.hasValue(r1)
            if (r1 == 0) goto L324
            int r1 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r1 = r6.a(r1)
            r0.setHelperTextColor(r1)
        L324:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_hintTextColor
            boolean r1 = r3.hasValue(r1)
            if (r1 == 0) goto L335
            int r1 = com.google.android.material.R.styleable.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r1 = r6.a(r1)
            r0.setHintTextColor(r1)
        L335:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_counterTextColor
            boolean r1 = r3.hasValue(r1)
            if (r1 == 0) goto L346
            int r1 = com.google.android.material.R.styleable.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r1 = r6.a(r1)
            r0.setCounterTextColor(r1)
        L346:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor
            boolean r1 = r3.hasValue(r1)
            if (r1 == 0) goto L357
            int r1 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r1 = r6.a(r1)
            r0.setCounterOverflowTextColor(r1)
        L357:
            int r1 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextColor
            boolean r1 = r3.hasValue(r1)
            if (r1 == 0) goto L368
            int r1 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r1 = r6.a(r1)
            r0.setPlaceholderTextColor(r1)
        L368:
            com.google.android.material.textfield.a r1 = new com.google.android.material.textfield.a
            r1.<init>(r0, r6)
            r0.c = r1
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_enabled
            r4 = 1
            boolean r2 = r3.getBoolean(r2, r4)
            r6.f()
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            r3 = 2
            r0.setImportantForAccessibility(r3)
            a.C0414ug.f.m(r0, r4)
            r10.addView(r11)
            r10.addView(r1)
            r0.addView(r10)
            r0.setEnabled(r2)
            r0.setHelperTextEnabled(r13)
            r0.setErrorEnabled(r5)
            r0.setCounterEnabled(r7)
            r1 = r19
            r0.setHelperText(r1)
            return
    }

    private android.graphics.drawable.Drawable getEditTextBoxBackground() {
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            android.widget.EditText r3 = r10.d
            boolean r4 = r3 instanceof android.widget.AutoCompleteTextView
            if (r4 == 0) goto L99
            boolean r3 = a.C0435w1.G(r3)
            if (r3 == 0) goto L11
            goto L99
        L11:
            android.widget.EditText r3 = r10.d
            int r4 = com.google.android.material.R.attr.colorControlHighlight
            int r3 = a.Na.b(r3, r4)
            int r4 = r10.O
            int[][] r5 = com.google.android.material.textfield.TextInputLayout.D0
            r6 = 1036831949(0x3dcccccd, float:0.1)
            if (r4 != r2) goto L7e
            android.content.Context r4 = r10.getContext()
            a.Ta r7 = r10.F
            int r8 = com.google.android.material.R.attr.colorSurface
            java.lang.String r9 = "TextInputLayout"
            android.util.TypedValue r8 = a.C0498za.c(r4, r8, r9)
            int r9 = r8.resourceId
            if (r9 == 0) goto L39
            int r4 = a.Y3.b.a(r4, r9)
            goto L3b
        L39:
            int r4 = r8.data
        L3b:
            a.Ta r8 = new a.Ta
            a.Ta$b r9 = r7.f278a
            a.Vd r9 = r9.f280a
            r8.<init>(r9)
            int r3 = a.Na.d(r3, r4, r6)
            int[] r6 = new int[]{r3, r1}
            android.content.res.ColorStateList r9 = new android.content.res.ColorStateList
            r9.<init>(r5, r6)
            r8.k(r9)
            r8.setTint(r4)
            int[] r3 = new int[]{r3, r4}
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
            r4.<init>(r5, r3)
            a.Ta r3 = new a.Ta
            a.Ta$b r5 = r7.f278a
            a.Vd r5 = r5.f280a
            r3.<init>(r5)
            r5 = -1
            r3.setTint(r5)
            android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
            r5.<init>(r4, r8, r3)
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            r2[r1] = r5
            r2[r0] = r7
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r0.<init>(r2)
            return r0
        L7e:
            if (r4 != r0) goto L97
            a.Ta r0 = r10.F
            int r1 = r10.U
            int r2 = a.Na.d(r3, r1, r6)
            int[] r1 = new int[]{r2, r1}
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r5, r1)
            android.graphics.drawable.RippleDrawable r1 = new android.graphics.drawable.RippleDrawable
            r1.<init>(r2, r0, r0)
            return r1
        L97:
            r0 = 0
            return r0
        L99:
            a.Ta r0 = r10.F
            return r0
    }

    private android.graphics.drawable.Drawable getOrCreateFilledDropDownMenuBackground() {
            r3 = this;
            android.graphics.drawable.StateListDrawable r0 = r3.H
            if (r0 != 0) goto L25
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            r3.H = r0
            r1 = 16842922(0x10100aa, float:2.3694034E-38)
            int[] r1 = new int[]{r1}
            android.graphics.drawable.Drawable r2 = r3.getOrCreateOutlinedDropDownMenuBackground()
            r0.addState(r1, r2)
            android.graphics.drawable.StateListDrawable r0 = r3.H
            r1 = 0
            int[] r2 = new int[r1]
            a.Ta r1 = r3.f(r1)
            r0.addState(r2, r1)
        L25:
            android.graphics.drawable.StateListDrawable r0 = r3.H
            return r0
    }

    private android.graphics.drawable.Drawable getOrCreateOutlinedDropDownMenuBackground() {
            r1 = this;
            a.Ta r0 = r1.G
            if (r0 != 0) goto Lb
            r0 = 1
            a.Ta r0 = r1.f(r0)
            r1.G = r0
        Lb:
            a.Ta r0 = r1.G
            return r0
    }

    public static void k(android.view.ViewGroup r4, boolean r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            android.view.View r2 = r4.getChildAt(r1)
            r2.setEnabled(r5)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L17
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            k(r2, r5)
        L17:
            int r1 = r1 + 1
            goto L5
        L1a:
            return
    }

    private void setEditText(android.widget.EditText r7) {
            r6 = this;
            android.widget.EditText r0 = r6.d
            if (r0 != 0) goto L116
            int r0 = r6.getEndIconMode()
            r1 = 3
            if (r0 == r1) goto L16
            boolean r0 = r7 instanceof com.google.android.material.textfield.TextInputEditText
            if (r0 != 0) goto L16
            java.lang.String r0 = "TextInputLayout"
            java.lang.String r1 = "EditText added is not a TextInputEditText. Please switch to using that class instead."
            android.util.Log.i(r0, r1)
        L16:
            r6.d = r7
            int r0 = r6.f
            r1 = -1
            if (r0 == r1) goto L21
            r6.setMinEms(r0)
            goto L26
        L21:
            int r0 = r6.h
            r6.setMinWidth(r0)
        L26:
            int r0 = r6.g
            if (r0 == r1) goto L2e
            r6.setMaxEms(r0)
            goto L33
        L2e:
            int r0 = r6.i
            r6.setMaxWidth(r0)
        L33:
            r0 = 0
            r6.I = r0
            r6.i()
            com.google.android.material.textfield.TextInputLayout$d r1 = new com.google.android.material.textfield.TextInputLayout$d
            r1.<init>(r6)
            r6.setTextInputAccessibilityDelegate(r1)
            android.widget.EditText r1 = r6.d
            android.graphics.Typeface r1 = r1.getTypeface()
            a.n3 r2 = r6.v0
            r2.m(r1)
            android.widget.EditText r1 = r6.d
            float r1 = r1.getTextSize()
            float r3 = r2.h
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L5d
            r2.h = r1
            r2.h(r0)
        L5d:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.widget.EditText r3 = r6.d
            float r3 = r3.getLetterSpacing()
            float r4 = r2.W
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L70
            r2.W = r3
            r2.h(r0)
        L70:
            android.widget.EditText r3 = r6.d
            int r3 = r3.getGravity()
            r4 = r3 & (-113(0xffffffffffffff8f, float:NaN))
            r4 = r4 | 48
            int r5 = r2.g
            if (r5 == r4) goto L83
            r2.g = r4
            r2.h(r0)
        L83:
            int r4 = r2.f
            if (r4 == r3) goto L8c
            r2.f = r3
            r2.h(r0)
        L8c:
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            int r2 = r7.getMinimumHeight()
            r6.t0 = r2
            android.widget.EditText r2 = r6.d
            com.google.android.material.textfield.TextInputLayout$a r3 = new com.google.android.material.textfield.TextInputLayout$a
            r3.<init>(r6, r7)
            r2.addTextChangedListener(r3)
            android.content.res.ColorStateList r2 = r6.i0
            if (r2 != 0) goto Laa
            android.widget.EditText r2 = r6.d
            android.content.res.ColorStateList r2 = r2.getHintTextColors()
            r6.i0 = r2
        Laa:
            boolean r2 = r6.C
            r3 = 1
            if (r2 == 0) goto Lca
            java.lang.CharSequence r2 = r6.D
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto Lc8
            android.widget.EditText r2 = r6.d
            java.lang.CharSequence r2 = r2.getHint()
            r6.e = r2
            r6.setHint(r2)
            android.widget.EditText r2 = r6.d
            r4 = 0
            r2.setHint(r4)
        Lc8:
            r6.E = r3
        Lca:
            r2 = 29
            if (r1 < r2) goto Ld1
            r6.p()
        Ld1:
            a.r1 r1 = r6.o
            if (r1 == 0) goto Lde
            android.widget.EditText r1 = r6.d
            android.text.Editable r1 = r1.getText()
            r6.n(r1)
        Lde:
            r6.r()
            a.T8 r1 = r6.j
            r1.b()
            a.se r1 = r6.b
            r1.bringToFront()
            com.google.android.material.textfield.a r1 = r6.c
            r1.bringToFront()
            java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout$f> r2 = r6.e0
            java.util.Iterator r2 = r2.iterator()
        Lf6:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L106
            java.lang.Object r4 = r2.next()
            com.google.android.material.textfield.TextInputLayout$f r4 = (com.google.android.material.textfield.TextInputLayout.f) r4
            r4.a(r6)
            goto Lf6
        L106:
            r1.m()
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L112
            r7.setEnabled(r0)
        L112:
            r6.u(r0, r3)
            return
        L116:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "We already have an EditText, can only have one"
            r7.<init>(r0)
            throw r7
    }

    private void setHintInternal(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.CharSequence r0 = r2.D
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L2f
            r2.D = r3
            a.n3 r0 = r2.v0
            if (r3 == 0) goto L16
            java.lang.CharSequence r1 = r0.A
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L28
        L16:
            r0.A = r3
            r3 = 0
            r0.B = r3
            android.graphics.Bitmap r1 = r0.E
            if (r1 == 0) goto L24
            r1.recycle()
            r0.E = r3
        L24:
            r3 = 0
            r0.h(r3)
        L28:
            boolean r3 = r2.u0
            if (r3 != 0) goto L2f
            r2.j()
        L2f:
            return
    }

    private void setPlaceholderTextEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.s
            if (r0 != r3) goto L5
            return
        L5:
            if (r3 == 0) goto L17
            a.r1 r0 = r2.t
            if (r0 == 0) goto L23
            android.widget.FrameLayout r1 = r2.f1092a
            r1.addView(r0)
            a.r1 r0 = r2.t
            r1 = 0
            r0.setVisibility(r1)
            goto L23
        L17:
            a.r1 r0 = r2.t
            if (r0 == 0) goto L20
            r1 = 8
            r0.setVisibility(r1)
        L20:
            r0 = 0
            r2.t = r0
        L23:
            r2.s = r3
            return
    }

    public final void a(float r6) {
            r5 = this;
            a.n3 r0 = r5.v0
            float r1 = r0.b
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L9
            return
        L9:
            android.animation.ValueAnimator r1 = r5.y0
            if (r1 != 0) goto L3f
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.y0 = r1
            android.content.Context r2 = r5.getContext()
            int r3 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            a.l6 r4 = a.C0434w0.b
            android.animation.TimeInterpolator r2 = a.C0445wb.d(r2, r3, r4)
            r1.setInterpolator(r2)
            android.animation.ValueAnimator r1 = r5.y0
            android.content.Context r2 = r5.getContext()
            int r3 = com.google.android.material.R.attr.motionDurationMedium4
            r4 = 167(0xa7, float:2.34E-43)
            int r2 = a.C0445wb.c(r2, r3, r4)
            long r2 = (long) r2
            r1.setDuration(r2)
            android.animation.ValueAnimator r1 = r5.y0
            com.google.android.material.textfield.TextInputLayout$c r2 = new com.google.android.material.textfield.TextInputLayout$c
            r2.<init>(r5)
            r1.addUpdateListener(r2)
        L3f:
            android.animation.ValueAnimator r1 = r5.y0
            float r0 = r0.b
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r6
            r1.setFloatValues(r2)
            android.animation.ValueAnimator r6 = r5.y0
            r6.start()
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.EditText
            if (r0 == 0) goto L22
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r4)
            int r0 = r3.gravity
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r0 = r0 | 16
            r3.gravity = r0
            android.widget.FrameLayout r0 = r1.f1092a
            r0.addView(r2, r3)
            r0.setLayoutParams(r4)
            r1.t()
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.setEditText(r2)
            return
        L22:
            super.addView(r2, r3, r4)
            return
    }

    public final void b() {
            r5 = this;
            a.Ta r0 = r5.F
            if (r0 != 0) goto L5
            return
        L5:
            a.Ta$b r1 = r0.f278a
            a.Vd r1 = r1.f280a
            a.Vd r2 = r5.L
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r5.O
            r1 = 2
            r2 = -1
            if (r0 != r1) goto L3b
            int r0 = r5.Q
            if (r0 <= r2) goto L3b
            int r1 = r5.T
            if (r1 == 0) goto L3b
            a.Ta r3 = r5.F
            float r0 = (float) r0
            a.Ta$b r4 = r3.f278a
            r4.j = r0
            r3.invalidateSelf()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            a.Ta$b r1 = r3.f278a
            android.content.res.ColorStateList r4 = r1.d
            if (r4 == r0) goto L3b
            r1.d = r0
            int[] r0 = r3.getState()
            r3.onStateChange(r0)
        L3b:
            int r0 = r5.U
            int r1 = r5.O
            r3 = 1
            if (r1 != r3) goto L53
            int r0 = com.google.android.material.R.attr.colorSurface
            android.content.Context r1 = r5.getContext()
            r3 = 0
            int r0 = a.Na.a(r1, r0, r3)
            int r1 = r5.U
            int r0 = a.C0419v3.b(r1, r0)
        L53:
            r5.U = r0
            a.Ta r1 = r5.F
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.k(r0)
            a.Ta r0 = r5.J
            if (r0 == 0) goto L95
            a.Ta r1 = r5.K
            if (r1 != 0) goto L67
            goto L95
        L67:
            int r1 = r5.Q
            if (r1 <= r2) goto L92
            int r1 = r5.T
            if (r1 == 0) goto L92
            android.widget.EditText r1 = r5.d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L7e
            int r1 = r5.k0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L84
        L7e:
            int r1 = r5.T
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L84:
            r0.k(r1)
            a.Ta r0 = r5.K
            int r1 = r5.T
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.k(r1)
        L92:
            r5.invalidate()
        L95:
            r5.s()
            return
    }

    public final int c() {
            r4 = this;
            boolean r0 = r4.C
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r4.O
            a.n3 r2 = r4.v0
            if (r0 == 0) goto L19
            r3 = 2
            if (r0 == r3) goto L10
            return r1
        L10:
            float r0 = r2.d()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
        L17:
            int r0 = (int) r0
            return r0
        L19:
            float r0 = r2.d()
            goto L17
    }

    public final androidx.transition.c d() {
            r4 = this;
            androidx.transition.c r0 = new androidx.transition.c
            r0.<init>()
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.R.attr.motionDurationShort2
            r3 = 87
            int r1 = a.C0445wb.c(r1, r2, r3)
            long r1 = (long) r1
            r0.c = r1
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.view.animation.LinearInterpolator r3 = a.C0434w0.f744a
            android.animation.TimeInterpolator r1 = a.C0445wb.d(r1, r2, r3)
            r0.d = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    @android.annotation.TargetApi(26)
    public final void dispatchProvideAutofillStructure(android.view.ViewStructure r6, int r7) {
            r5 = this;
            android.widget.EditText r0 = r5.d
            if (r0 != 0) goto L8
            super.dispatchProvideAutofillStructure(r6, r7)
            return
        L8:
            java.lang.CharSequence r1 = r5.e
            r2 = 0
            if (r1 == 0) goto L30
            boolean r1 = r5.E
            r5.E = r2
            java.lang.CharSequence r0 = r0.getHint()
            android.widget.EditText r2 = r5.d
            java.lang.CharSequence r3 = r5.e
            r2.setHint(r3)
            super.dispatchProvideAutofillStructure(r6, r7)     // Catch: java.lang.Throwable -> L27
            android.widget.EditText r6 = r5.d
            r6.setHint(r0)
            r5.E = r1
            return
        L27:
            r6 = move-exception
            android.widget.EditText r7 = r5.d
            r7.setHint(r0)
            r5.E = r1
            throw r6
        L30:
            android.view.autofill.AutofillId r0 = r5.getAutofillId()
            r6.setAutofillId(r0)
            r5.onProvideAutofillStructure(r6, r7)
            r5.onProvideAutofillVirtualStructure(r6, r7)
            android.widget.FrameLayout r0 = r5.f1092a
            int r1 = r0.getChildCount()
            r6.setChildCount(r1)
        L46:
            int r1 = r0.getChildCount()
            if (r2 >= r1) goto L65
            android.view.View r1 = r0.getChildAt(r2)
            android.view.ViewStructure r3 = r6.newChild(r2)
            r1.dispatchProvideAutofillStructure(r3, r7)
            android.widget.EditText r4 = r5.d
            if (r1 != r4) goto L62
            java.lang.CharSequence r1 = r5.getHint()
            r3.setHint(r1)
        L62:
            int r2 = r2 + 1
            goto L46
        L65:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r0 = 1
            r1.A0 = r0
            super.dispatchRestoreInstanceState(r2)
            r2 = 0
            r1.A0 = r2
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            super.draw(r18)
            boolean r2 = r0.C
            a.n3 r8 = r0.v0
            if (r2 == 0) goto L10f
            r8.getClass()
            int r9 = r1.save()
            java.lang.CharSequence r2 = r8.B
            if (r2 == 0) goto L10f
            android.graphics.RectF r2 = r8.e
            float r3 = r2.width()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L10f
            float r2 = r2.height()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L10f
            android.text.TextPaint r7 = r8.N
            float r2 = r8.G
            r7.setTextSize(r2)
            float r2 = r8.p
            float r3 = r8.q
            float r4 = r8.F
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L41
            r1.scale(r4, r4, r2, r3)
        L41:
            int r4 = r8.d0
            r10 = 1
            if (r4 <= r10) goto L104
            boolean r4 = r8.C
            if (r4 == 0) goto L4c
            goto L104
        L4c:
            float r2 = r8.p
            android.text.StaticLayout r4 = r8.Y
            r11 = 0
            int r4 = r4.getLineStart(r11)
            float r4 = (float) r4
            float r2 = r2 - r4
            int r12 = r7.getAlpha()
            r1.translate(r2, r3)
            float r2 = r8.b0
            float r3 = (float) r12
            float r2 = r2 * r3
            int r2 = (int) r2
            r7.setAlpha(r2)
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 31
            if (r13 < r14) goto L87
            float r2 = r8.H
            float r4 = r8.I
            float r5 = r8.J
            int r6 = r8.K
            int r15 = r7.getAlpha()
            int r16 = android.graphics.Color.alpha(r6)
            int r15 = r15 * r16
            int r15 = r15 / 255
            int r6 = a.C0419v3.d(r6, r15)
            r7.setShadowLayer(r2, r4, r5, r6)
        L87:
            android.text.StaticLayout r2 = r8.Y
            r2.draw(r1)
            float r2 = r8.a0
            float r2 = r2 * r3
            int r2 = (int) r2
            r7.setAlpha(r2)
            if (r13 < r14) goto Laf
            float r2 = r8.H
            float r3 = r8.I
            float r4 = r8.J
            int r5 = r8.K
            int r6 = r7.getAlpha()
            int r15 = android.graphics.Color.alpha(r5)
            int r15 = r15 * r6
            int r15 = r15 / 255
            int r5 = a.C0419v3.d(r5, r15)
            r7.setShadowLayer(r2, r3, r4, r5)
        Laf:
            android.text.StaticLayout r2 = r8.Y
            int r2 = r2.getLineBaseline(r11)
            java.lang.CharSequence r3 = r8.c0
            int r4 = r3.length()
            float r6 = (float) r2
            r2 = r3
            r3 = 0
            r5 = 0
            r1.drawText(r2, r3, r4, r5, r6, r7)
            if (r13 < r14) goto Lcf
            float r1 = r8.H
            float r2 = r8.I
            float r3 = r8.J
            int r4 = r8.K
            r7.setShadowLayer(r1, r2, r3, r4)
        Lcf:
            java.lang.CharSequence r1 = r8.c0
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            java.lang.String r2 = "…"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto Lea
            int r2 = r1.length()
            int r2 = r2 - r10
            java.lang.String r1 = r1.substring(r11, r2)
        Lea:
            r2 = r1
            r7.setAlpha(r12)
            android.text.StaticLayout r1 = r8.Y
            int r1 = r1.getLineEnd(r11)
            int r3 = r2.length()
            int r4 = java.lang.Math.min(r1, r3)
            r5 = 0
            r3 = 0
            r1 = r18
            r1.drawText(r2, r3, r4, r5, r6, r7)
            goto L10c
        L104:
            r1.translate(r2, r3)
            android.text.StaticLayout r2 = r8.Y
            r2.draw(r1)
        L10c:
            r1.restoreToCount(r9)
        L10f:
            a.Ta r2 = r0.K
            if (r2 == 0) goto L149
            a.Ta r2 = r0.J
            if (r2 == 0) goto L149
            r2.draw(r1)
            android.widget.EditText r2 = r0.d
            boolean r2 = r2.isFocused()
            if (r2 == 0) goto L149
            a.Ta r2 = r0.K
            android.graphics.Rect r2 = r2.getBounds()
            a.Ta r3 = r0.J
            android.graphics.Rect r3 = r3.getBounds()
            float r4 = r8.b
            int r5 = r3.centerX()
            int r6 = r3.left
            int r6 = a.C0434w0.c(r5, r6, r4)
            r2.left = r6
            int r3 = r3.right
            int r3 = a.C0434w0.c(r5, r3, r4)
            r2.right = r3
            a.Ta r2 = r0.K
            r2.draw(r1)
        L149:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            boolean r0 = r4.z0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.z0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            a.n3 r3 = r4.v0
            if (r3 == 0) goto L2f
            r3.L = r1
            android.content.res.ColorStateList r1 = r3.k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.d
            if (r3 == 0) goto L47
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.z0 = r2
            return
    }

    public final boolean e() {
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L14
            java.lang.CharSequence r0 = r1.D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            a.Ta r0 = r1.F
            boolean r0 = r0 instanceof a.F4
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final a.Ta f(boolean r15) {
            r14 = this;
            android.content.res.Resources r0 = r14.getResources()
            int r1 = com.google.android.material.R.dimen.mtrl_shape_corner_size_small_component
            int r0 = r0.getDimensionPixelOffset(r1)
            float r0 = (float) r0
            if (r15 == 0) goto Lf
            r15 = r0
            goto L10
        Lf:
            r15 = 0
        L10:
            android.widget.EditText r1 = r14.d
            boolean r2 = r1 instanceof a.Ba
            if (r2 == 0) goto L1d
            a.Ba r1 = (a.Ba) r1
            float r1 = r1.getPopupElevation()
            goto L28
        L1d:
            android.content.res.Resources r1 = r14.getResources()
            int r2 = com.google.android.material.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation
            int r1 = r1.getDimensionPixelOffset(r2)
            float r1 = (float) r1
        L28:
            android.content.res.Resources r2 = r14.getResources()
            int r3 = com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            a.Ad r3 = new a.Ad
            r3.<init>()
            a.Ad r4 = new a.Ad
            r4.<init>()
            a.Ad r5 = new a.Ad
            r5.<init>()
            a.Ad r6 = new a.Ad
            r6.<init>()
            a.H5 r7 = new a.H5
            r7.<init>()
            a.H5 r8 = new a.H5
            r8.<init>()
            a.H5 r9 = new a.H5
            r9.<init>()
            a.H5 r10 = new a.H5
            r10.<init>()
            a.s r11 = new a.s
            r11.<init>(r15)
            a.s r12 = new a.s
            r12.<init>(r15)
            a.s r15 = new a.s
            r15.<init>(r0)
            a.s r13 = new a.s
            r13.<init>(r0)
            a.Vd r0 = new a.Vd
            r0.<init>()
            r0.f307a = r3
            r0.b = r4
            r0.c = r5
            r0.d = r6
            r0.e = r11
            r0.f = r12
            r0.g = r13
            r0.h = r15
            r0.i = r7
            r0.j = r8
            r0.k = r9
            r0.l = r10
            android.widget.EditText r15 = r14.d
            boolean r3 = r15 instanceof a.Ba
            if (r3 == 0) goto L98
            a.Ba r15 = (a.Ba) r15
            android.content.res.ColorStateList r15 = r15.getDropDownBackgroundTintList()
            goto L99
        L98:
            r15 = 0
        L99:
            android.content.Context r3 = r14.getContext()
            if (r15 != 0) goto Lbc
            android.graphics.Paint r15 = a.Ta.x
            int r15 = com.google.android.material.R.attr.colorSurface
            java.lang.Class<a.Ta> r4 = a.Ta.class
            java.lang.String r4 = r4.getSimpleName()
            android.util.TypedValue r15 = a.C0498za.c(r3, r15, r4)
            int r4 = r15.resourceId
            if (r4 == 0) goto Lb6
            int r15 = a.Y3.b.a(r3, r4)
            goto Lb8
        Lb6:
            int r15 = r15.data
        Lb8:
            android.content.res.ColorStateList r15 = android.content.res.ColorStateList.valueOf(r15)
        Lbc:
            a.Ta r4 = new a.Ta
            r4.<init>()
            r4.i(r3)
            r4.k(r15)
            r4.j(r1)
            r4.setShapeAppearanceModel(r0)
            a.Ta$b r15 = r4.f278a
            android.graphics.Rect r0 = r15.g
            if (r0 != 0) goto Lda
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r15.g = r0
        Lda:
            a.Ta$b r15 = r4.f278a
            android.graphics.Rect r15 = r15.g
            r0 = 0
            r15.set(r0, r2, r0, r2)
            r4.invalidateSelf()
            return r4
    }

    public final int g(int r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L10
            java.lang.CharSequence r0 = r1.getPrefixText()
            if (r0 == 0) goto L10
            a.se r3 = r1.b
            int r3 = r3.a()
        Le:
            int r3 = r3 + r2
            return r3
        L10:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r3 = r1.getSuffixText()
            if (r3 == 0) goto L1f
            com.google.android.material.textfield.a r3 = r1.c
            int r3 = r3.c()
            goto Le
        L1f:
            android.widget.EditText r3 = r1.d
            int r3 = r3.getCompoundPaddingLeft()
            goto Le
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
            r2 = this;
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto L13
            int r0 = r0.getBaseline()
            int r1 = r2.getPaddingTop()
            int r1 = r1 + r0
            int r0 = r2.c()
            int r0 = r0 + r1
            return r0
        L13:
            int r0 = super.getBaseline()
            return r0
    }

    public a.Ta getBoxBackground() {
            r2 = this;
            int r0 = r2.O
            r1 = 1
            if (r0 == r1) goto Lf
            r1 = 2
            if (r0 != r1) goto L9
            goto Lf
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Lf:
            a.Ta r0 = r2.F
            return r0
    }

    public int getBoxBackgroundColor() {
            r1 = this;
            int r0 = r1.U
            return r0
    }

    public int getBoxBackgroundMode() {
            r1 = this;
            int r0 = r1.O
            return r0
    }

    public int getBoxCollapsedPaddingTop() {
            r1 = this;
            int r0 = r1.P
            return r0
    }

    public float getBoxCornerRadiusBottomEnd() {
            r2 = this;
            boolean r0 = a.Rg.a(r2)
            android.graphics.RectF r1 = r2.a0
            if (r0 == 0) goto L11
            a.Vd r0 = r2.L
            a.w4 r0 = r0.h
            float r0 = r0.a(r1)
            return r0
        L11:
            a.Vd r0 = r2.L
            a.w4 r0 = r0.g
            float r0 = r0.a(r1)
            return r0
    }

    public float getBoxCornerRadiusBottomStart() {
            r2 = this;
            boolean r0 = a.Rg.a(r2)
            android.graphics.RectF r1 = r2.a0
            if (r0 == 0) goto L11
            a.Vd r0 = r2.L
            a.w4 r0 = r0.g
            float r0 = r0.a(r1)
            return r0
        L11:
            a.Vd r0 = r2.L
            a.w4 r0 = r0.h
            float r0 = r0.a(r1)
            return r0
    }

    public float getBoxCornerRadiusTopEnd() {
            r2 = this;
            boolean r0 = a.Rg.a(r2)
            android.graphics.RectF r1 = r2.a0
            if (r0 == 0) goto L11
            a.Vd r0 = r2.L
            a.w4 r0 = r0.e
            float r0 = r0.a(r1)
            return r0
        L11:
            a.Vd r0 = r2.L
            a.w4 r0 = r0.f
            float r0 = r0.a(r1)
            return r0
    }

    public float getBoxCornerRadiusTopStart() {
            r2 = this;
            boolean r0 = a.Rg.a(r2)
            android.graphics.RectF r1 = r2.a0
            if (r0 == 0) goto L11
            a.Vd r0 = r2.L
            a.w4 r0 = r0.f
            float r0 = r0.a(r1)
            return r0
        L11:
            a.Vd r0 = r2.L
            a.w4 r0 = r0.e
            float r0 = r0.a(r1)
            return r0
    }

    public int getBoxStrokeColor() {
            r1 = this;
            int r0 = r1.m0
            return r0
    }

    public android.content.res.ColorStateList getBoxStrokeErrorColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.n0
            return r0
    }

    public int getBoxStrokeWidth() {
            r1 = this;
            int r0 = r1.R
            return r0
    }

    public int getBoxStrokeWidthFocused() {
            r1 = this;
            int r0 = r1.S
            return r0
    }

    public int getCounterMaxLength() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public java.lang.CharSequence getCounterOverflowDescription() {
            r1 = this;
            boolean r0 = r1.k
            if (r0 == 0) goto L11
            boolean r0 = r1.m
            if (r0 == 0) goto L11
            a.r1 r0 = r1.o
            if (r0 == 0) goto L11
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L11:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getCounterOverflowTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.z
            return r0
    }

    public android.content.res.ColorStateList getCounterTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.y
            return r0
    }

    public android.content.res.ColorStateList getCursorColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.A
            return r0
    }

    public android.content.res.ColorStateList getCursorErrorColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.B
            return r0
    }

    public android.content.res.ColorStateList getDefaultHintTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.i0
            return r0
    }

    public android.widget.EditText getEditText() {
            r1 = this;
            android.widget.EditText r0 = r1.d
            return r0
    }

    public java.lang.CharSequence getEndIconContentDescription() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public android.graphics.drawable.Drawable getEndIconDrawable() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public int getEndIconMinSize() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            int r0 = r0.m
            return r0
    }

    public int getEndIconMode() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            int r0 = r0.i
            return r0
    }

    public android.widget.ImageView.ScaleType getEndIconScaleType() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            android.widget.ImageView$ScaleType r0 = r0.n
            return r0
    }

    public com.google.android.material.internal.CheckableImageButton getEndIconView() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            return r0
    }

    public java.lang.CharSequence getError() {
            r2 = this;
            a.T8 r0 = r2.j
            boolean r1 = r0.q
            if (r1 == 0) goto L9
            java.lang.CharSequence r0 = r0.p
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getErrorAccessibilityLiveRegion() {
            r1 = this;
            a.T8 r0 = r1.j
            int r0 = r0.t
            return r0
    }

    public java.lang.CharSequence getErrorContentDescription() {
            r1 = this;
            a.T8 r0 = r1.j
            java.lang.CharSequence r0 = r0.s
            return r0
    }

    public int getErrorCurrentTextColors() {
            r1 = this;
            a.T8 r0 = r1.j
            a.r1 r0 = r0.r
            if (r0 == 0) goto Lb
            int r0 = r0.getCurrentTextColor()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public android.graphics.drawable.Drawable getErrorIconDrawable() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public java.lang.CharSequence getHelperText() {
            r2 = this;
            a.T8 r0 = r2.j
            boolean r1 = r0.x
            if (r1 == 0) goto L9
            java.lang.CharSequence r0 = r0.w
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getHelperTextCurrentTextColor() {
            r1 = this;
            a.T8 r0 = r1.j
            a.r1 r0 = r0.y
            if (r0 == 0) goto Lb
            int r0 = r0.getCurrentTextColor()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public java.lang.CharSequence getHint() {
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r1.D
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final float getHintCollapsedTextHeight() {
            r1 = this;
            a.n3 r0 = r1.v0
            float r0 = r0.d()
            return r0
    }

    public final int getHintCurrentCollapsedTextColor() {
            r2 = this;
            a.n3 r0 = r2.v0
            android.content.res.ColorStateList r1 = r0.k
            int r0 = r0.e(r1)
            return r0
    }

    public android.content.res.ColorStateList getHintTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.j0
            return r0
    }

    public com.google.android.material.textfield.TextInputLayout.e getLengthCounter() {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout$e r0 = r1.n
            return r0
    }

    public int getMaxEms() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public int getMinEms() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public java.lang.CharSequence getPlaceholderText() {
            r1 = this;
            boolean r0 = r1.s
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r1.r
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getPlaceholderTextAppearance() {
            r1 = this;
            int r0 = r1.v
            return r0
    }

    public android.content.res.ColorStateList getPlaceholderTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.u
            return r0
    }

    public java.lang.CharSequence getPrefixText() {
            r1 = this;
            a.se r0 = r1.b
            java.lang.CharSequence r0 = r0.c
            return r0
    }

    public android.content.res.ColorStateList getPrefixTextColor() {
            r1 = this;
            a.se r0 = r1.b
            a.r1 r0 = r0.b
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    public android.widget.TextView getPrefixTextView() {
            r1 = this;
            a.se r0 = r1.b
            a.r1 r0 = r0.b
            return r0
    }

    public a.Vd getShapeAppearanceModel() {
            r1 = this;
            a.Vd r0 = r1.L
            return r0
    }

    public java.lang.CharSequence getStartIconContentDescription() {
            r1 = this;
            a.se r0 = r1.b
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public android.graphics.drawable.Drawable getStartIconDrawable() {
            r1 = this;
            a.se r0 = r1.b
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public int getStartIconMinSize() {
            r1 = this;
            a.se r0 = r1.b
            int r0 = r0.g
            return r0
    }

    public android.widget.ImageView.ScaleType getStartIconScaleType() {
            r1 = this;
            a.se r0 = r1.b
            android.widget.ImageView$ScaleType r0 = r0.h
            return r0
    }

    public java.lang.CharSequence getSuffixText() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            java.lang.CharSequence r0 = r0.p
            return r0
    }

    public android.content.res.ColorStateList getSuffixTextColor() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            a.r1 r0 = r0.q
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    public android.widget.TextView getSuffixTextView() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            a.r1 r0 = r0.q
            return r0
    }

    public android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.b0
            return r0
    }

    public final int h(int r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L10
            java.lang.CharSequence r0 = r1.getSuffixText()
            if (r0 == 0) goto L10
            com.google.android.material.textfield.a r3 = r1.c
            int r3 = r3.c()
        Le:
            int r2 = r2 - r3
            return r2
        L10:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r3 = r1.getPrefixText()
            if (r3 == 0) goto L1f
            a.se r3 = r1.b
            int r3 = r3.a()
            goto Le
        L1f:
            android.widget.EditText r3 = r1.d
            int r3 = r3.getCompoundPaddingRight()
            goto Le
    }

    public final void i() {
            r8 = this;
            int r0 = r8.O
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L74
            if (r0 == r2) goto L5c
            if (r0 != r1) goto L43
            boolean r0 = r8.C
            if (r0 == 0) goto L35
            a.Ta r0 = r8.F
            boolean r0 = r0 instanceof a.F4
            if (r0 != 0) goto L35
            a.Vd r0 = r8.L
            int r4 = a.F4.z
            a.F4$a r4 = new a.F4$a
            if (r0 == 0) goto L1e
            goto L23
        L1e:
            a.Vd r0 = new a.Vd
            r0.<init>()
        L23:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.<init>(r0, r5)
            a.F4$b r0 = new a.F4$b
            r0.<init>(r4)
            r0.y = r4
            r8.F = r0
            goto L3e
        L35:
            a.Ta r0 = new a.Ta
            a.Vd r4 = r8.L
            r0.<init>(r4)
            r8.F = r0
        L3e:
            r8.J = r3
            r8.K = r3
            goto L7a
        L43:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.O
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5c:
            a.Ta r0 = new a.Ta
            a.Vd r3 = r8.L
            r0.<init>(r3)
            r8.F = r0
            a.Ta r0 = new a.Ta
            r0.<init>()
            r8.J = r0
            a.Ta r0 = new a.Ta
            r0.<init>()
            r8.K = r0
            goto L7a
        L74:
            r8.F = r3
            r8.J = r3
            r8.K = r3
        L7a:
            r8.s()
            r8.x()
            int r0 = r8.O
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto Lbb
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto La5
            android.content.res.Resources r0 = r8.getResources()
            int r4 = com.google.android.material.R.dimen.material_font_2_0_box_collapsed_padding_top
            int r0 = r0.getDimensionPixelSize(r4)
            r8.P = r0
            goto Lbb
        La5:
            android.content.Context r0 = r8.getContext()
            boolean r0 = a.Sa.d(r0)
            if (r0 == 0) goto Lbb
            android.content.res.Resources r0 = r8.getResources()
            int r4 = com.google.android.material.R.dimen.material_font_1_3_box_collapsed_padding_top
            int r0 = r0.getDimensionPixelSize(r4)
            r8.P = r0
        Lbb:
            android.widget.EditText r0 = r8.d
            if (r0 == 0) goto L12b
            int r0 = r8.O
            if (r0 == r2) goto Lc4
            goto L12b
        Lc4:
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto Lfc
            android.widget.EditText r0 = r8.d
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            int r3 = r0.getPaddingStart()
            android.content.res.Resources r4 = r8.getResources()
            int r5 = com.google.android.material.R.dimen.material_filled_edittext_font_2_0_padding_top
            int r4 = r4.getDimensionPixelSize(r5)
            android.widget.EditText r5 = r8.d
            int r5 = r5.getPaddingEnd()
            android.content.res.Resources r6 = r8.getResources()
            int r7 = com.google.android.material.R.dimen.material_filled_edittext_font_2_0_padding_bottom
            int r6 = r6.getDimensionPixelSize(r7)
            r0.setPaddingRelative(r3, r4, r5, r6)
            goto L12b
        Lfc:
            android.content.Context r0 = r8.getContext()
            boolean r0 = a.Sa.d(r0)
            if (r0 == 0) goto L12b
            android.widget.EditText r0 = r8.d
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            int r3 = r0.getPaddingStart()
            android.content.res.Resources r4 = r8.getResources()
            int r5 = com.google.android.material.R.dimen.material_filled_edittext_font_1_3_padding_top
            int r4 = r4.getDimensionPixelSize(r5)
            android.widget.EditText r5 = r8.d
            int r5 = r5.getPaddingEnd()
            android.content.res.Resources r6 = r8.getResources()
            int r7 = com.google.android.material.R.dimen.material_filled_edittext_font_1_3_padding_bottom
            int r6 = r6.getDimensionPixelSize(r7)
            r0.setPaddingRelative(r3, r4, r5, r6)
        L12b:
            int r0 = r8.O
            if (r0 == 0) goto L132
            r8.t()
        L132:
            android.widget.EditText r0 = r8.d
            boolean r3 = r0 instanceof android.widget.AutoCompleteTextView
            if (r3 != 0) goto L139
            goto L156
        L139:
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            android.graphics.drawable.Drawable r3 = r0.getDropDownBackground()
            if (r3 != 0) goto L156
            int r3 = r8.O
            if (r3 != r1) goto L14d
            android.graphics.drawable.Drawable r1 = r8.getOrCreateOutlinedDropDownMenuBackground()
            r0.setDropDownBackgroundDrawable(r1)
            return
        L14d:
            if (r3 != r2) goto L156
            android.graphics.drawable.Drawable r1 = r8.getOrCreateFilledDropDownMenuBackground()
            r0.setDropDownBackgroundDrawable(r1)
        L156:
            return
    }

    public final void j() {
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L8
            goto Lf0
        L8:
            android.widget.EditText r0 = r12.d
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.d
            int r1 = r1.getGravity()
            a.n3 r2 = r12.v0
            java.lang.CharSequence r3 = r2.A
            boolean r3 = r2.b(r3)
            r2.C = r3
            r4 = 5
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.d
            if (r1 == r8) goto L51
            r10 = r1 & 7
            if (r10 != r7) goto L30
            goto L51
        L30:
            r10 = r1 & r6
            if (r10 == r6) goto L46
            r10 = r1 & 5
            if (r10 != r4) goto L39
            goto L46
        L39:
            if (r3 == 0) goto L42
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.Z
        L40:
            float r3 = r3 - r10
            goto L57
        L42:
            int r3 = r9.left
        L44:
            float r3 = (float) r3
            goto L57
        L46:
            if (r3 == 0) goto L4b
            int r3 = r9.left
            goto L44
        L4b:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.Z
            goto L40
        L51:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.Z
            float r10 = r10 / r5
            goto L40
        L57:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.a0
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L8d
            r8 = r1 & 7
            if (r8 != r7) goto L6e
            goto L8d
        L6e:
            r0 = r1 & r6
            if (r0 == r6) goto L83
            r0 = r1 & 5
            if (r0 != r4) goto L77
            goto L83
        L77:
            boolean r0 = r2.C
            if (r0 == 0) goto L7f
            int r0 = r9.right
        L7d:
            float r0 = (float) r0
            goto L93
        L7f:
            float r0 = r2.Z
        L81:
            float r0 = r0 + r3
            goto L93
        L83:
            boolean r0 = r2.C
            if (r0 == 0) goto L8a
            float r0 = r2.Z
            goto L81
        L8a:
            int r0 = r9.right
            goto L7d
        L8d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.Z
            float r1 = r1 / r5
            float r0 = r0 + r1
        L93:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.d()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lf0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb8
            goto Lf0
        Lb8:
            float r0 = r10.left
            int r1 = r12.N
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.Q
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            a.Ta r0 = r12.F
            a.F4 r0 = (a.F4) r0
            r0.getClass()
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.right
            float r4 = r10.bottom
            r0.o(r1, r2, r3, r4)
        Lf0:
            return
    }

    public final void l(a.C0345r1 r2, int r3) {
            r1 = this;
            r2.setTextAppearance(r3)     // Catch: java.lang.Exception -> L10
            android.content.res.ColorStateList r3 = r2.getTextColors()     // Catch: java.lang.Exception -> L10
            int r3 = r3.getDefaultColor()     // Catch: java.lang.Exception -> L10
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            if (r3 != r0) goto L22
        L10:
            int r3 = com.google.android.material.R.style.TextAppearance_AppCompat_Caption
            r2.setTextAppearance(r3)
            android.content.Context r3 = r1.getContext()
            int r0 = com.google.android.material.R.color.design_error
            int r3 = a.Y3.b.a(r3, r0)
            r2.setTextColor(r3)
        L22:
            return
    }

    public final boolean m() {
            r3 = this;
            a.T8 r0 = r3.j
            int r1 = r0.o
            r2 = 1
            if (r1 != r2) goto L14
            a.r1 r1 = r0.r
            if (r1 == 0) goto L14
            java.lang.CharSequence r0 = r0.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            return r2
        L14:
            r0 = 0
            return r0
    }

    public final void n(android.text.Editable r10) {
            r9 = this;
            com.google.android.material.textfield.TextInputLayout$e r0 = r9.n
            a.z r0 = (a.C0487z) r0
            r0.getClass()
            r0 = 0
            if (r10 == 0) goto Lf
            int r10 = r10.length()
            goto L10
        Lf:
            r10 = r0
        L10:
            boolean r1 = r9.m
            int r2 = r9.l
            r3 = -1
            r4 = 0
            if (r2 != r3) goto L2a
            a.r1 r2 = r9.o
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.setText(r10)
            a.r1 r10 = r9.o
            r10.setContentDescription(r4)
            r9.m = r0
            goto L9e
        L2a:
            r3 = 1
            if (r10 <= r2) goto L2f
            r2 = r3
            goto L30
        L2f:
            r2 = r0
        L30:
            r9.m = r2
            android.content.Context r2 = r9.getContext()
            a.r1 r5 = r9.o
            int r6 = r9.l
            boolean r7 = r9.m
            if (r7 == 0) goto L41
            int r7 = com.google.android.material.R.string.character_counter_overflowed_content_description
            goto L43
        L41:
            int r7 = com.google.android.material.R.string.character_counter_content_description
        L43:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6}
            java.lang.String r2 = r2.getString(r7, r6)
            r5.setContentDescription(r2)
            boolean r2 = r9.m
            if (r1 == r2) goto L5d
            r9.o()
        L5d:
            java.lang.String r2 = a.C0132f2.b
            java.util.Locale r2 = java.util.Locale.getDefault()
            int r2 = android.text.TextUtils.getLayoutDirectionFromLocale(r2)
            if (r2 != r3) goto L6c
            a.f2 r2 = a.C0132f2.e
            goto L6e
        L6c:
            a.f2 r2 = a.C0132f2.d
        L6e:
            a.r1 r3 = r9.o
            android.content.Context r5 = r9.getContext()
            int r6 = com.google.android.material.R.string.character_counter_pattern
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r7 = r9.l
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r7}
            java.lang.String r10 = r5.getString(r6, r10)
            if (r10 != 0) goto L8e
            r2.getClass()
            goto L9b
        L8e:
            r2.getClass()
            a.Xe$c r4 = a.Xe.f341a
            android.text.SpannableStringBuilder r10 = r2.c(r10)
            java.lang.String r4 = r10.toString()
        L9b:
            r3.setText(r4)
        L9e:
            android.widget.EditText r10 = r9.d
            if (r10 == 0) goto Laf
            boolean r10 = r9.m
            if (r1 == r10) goto Laf
            r9.u(r0, r0)
            r9.x()
            r9.r()
        Laf:
            return
    }

    public final void o() {
            r2 = this;
            a.r1 r0 = r2.o
            if (r0 == 0) goto L2a
            boolean r1 = r2.m
            if (r1 == 0) goto Lb
            int r1 = r2.p
            goto Ld
        Lb:
            int r1 = r2.q
        Ld:
            r2.l(r0, r1)
            boolean r0 = r2.m
            if (r0 != 0) goto L1d
            android.content.res.ColorStateList r0 = r2.y
            if (r0 == 0) goto L1d
            a.r1 r1 = r2.o
            r1.setTextColor(r0)
        L1d:
            boolean r0 = r2.m
            if (r0 == 0) goto L2a
            android.content.res.ColorStateList r0 = r2.z
            if (r0 == 0) goto L2a
            a.r1 r1 = r2.o
            r1.setTextColor(r0)
        L2a:
            return
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            a.n3 r0 = r1.v0
            r0.g(r2)
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r3 = this;
            com.google.android.material.textfield.a r0 = r3.c
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r3)
            r1 = 0
            r3.B0 = r1
            android.widget.EditText r2 = r3.d
            if (r2 != 0) goto L11
            goto L2d
        L11:
            int r0 = r0.getMeasuredHeight()
            a.se r2 = r3.b
            int r2 = r2.getMeasuredHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.widget.EditText r2 = r3.d
            int r2 = r2.getMeasuredHeight()
            if (r2 >= r0) goto L2d
            android.widget.EditText r1 = r3.d
            r1.setMinimumHeight(r0)
            r1 = 1
        L2d:
            boolean r0 = r3.q()
            if (r1 != 0) goto L37
            if (r0 == 0) goto L36
            goto L37
        L36:
            return
        L37:
            android.widget.EditText r0 = r3.d
            a.M2 r1 = new a.M2
            r2 = 17
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            r8 = r7
            android.widget.EditText r9 = r8.d
            if (r9 == 0) goto L192
            android.graphics.Rect r10 = r8.V
            a.W4.a(r7, r9, r10)
            a.Ta r9 = r8.J
            if (r9 == 0) goto L1e
            int r11 = r10.bottom
            int r12 = r8.R
            int r12 = r11 - r12
            int r0 = r10.left
            int r1 = r10.right
            r9.setBounds(r0, r12, r1, r11)
        L1e:
            a.Ta r9 = r8.K
            if (r9 == 0) goto L2f
            int r11 = r10.bottom
            int r12 = r8.S
            int r12 = r11 - r12
            int r0 = r10.left
            int r1 = r10.right
            r9.setBounds(r0, r12, r1, r11)
        L2f:
            boolean r9 = r8.C
            if (r9 == 0) goto L192
            android.widget.EditText r9 = r8.d
            float r9 = r9.getTextSize()
            a.n3 r11 = r8.v0
            float r12 = r11.h
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            r0 = 0
            if (r12 == 0) goto L47
            r11.h = r9
            r11.h(r0)
        L47:
            android.widget.EditText r9 = r8.d
            int r9 = r9.getGravity()
            r12 = r9 & (-113(0xffffffffffffff8f, float:NaN))
            r12 = r12 | 48
            int r1 = r11.g
            if (r1 == r12) goto L5a
            r11.g = r12
            r11.h(r0)
        L5a:
            int r12 = r11.f
            if (r12 == r9) goto L63
            r11.f = r9
            r11.h(r0)
        L63:
            android.widget.EditText r9 = r8.d
            if (r9 == 0) goto L18c
            boolean r9 = a.Rg.a(r7)
            int r12 = r10.bottom
            android.graphics.Rect r1 = r8.W
            r1.bottom = r12
            int r12 = r8.O
            r2 = 1
            if (r12 == r2) goto Lb0
            r3 = 2
            if (r12 == r3) goto L90
            int r12 = r10.left
            int r12 = r7.g(r12, r9)
            r1.left = r12
            int r12 = r7.getPaddingTop()
            r1.top = r12
            int r12 = r10.right
            int r9 = r7.h(r12, r9)
            r1.right = r9
            goto Lc7
        L90:
            int r9 = r10.left
            android.widget.EditText r12 = r8.d
            int r12 = r12.getPaddingLeft()
            int r12 = r12 + r9
            r1.left = r12
            int r9 = r10.top
            int r12 = r7.c()
            int r9 = r9 - r12
            r1.top = r9
            int r9 = r10.right
            android.widget.EditText r12 = r8.d
            int r12 = r12.getPaddingRight()
            int r9 = r9 - r12
            r1.right = r9
            goto Lc7
        Lb0:
            int r12 = r10.left
            int r12 = r7.g(r12, r9)
            r1.left = r12
            int r12 = r10.top
            int r3 = r8.P
            int r12 = r12 + r3
            r1.top = r12
            int r12 = r10.right
            int r9 = r7.h(r12, r9)
            r1.right = r9
        Lc7:
            int r9 = r1.left
            int r12 = r1.top
            int r3 = r1.right
            int r4 = r1.bottom
            android.graphics.Rect r5 = r11.d
            int r6 = r5.left
            if (r6 != r9) goto Le2
            int r6 = r5.top
            if (r6 != r12) goto Le2
            int r6 = r5.right
            if (r6 != r3) goto Le2
            int r6 = r5.bottom
            if (r6 != r4) goto Le2
            goto Le7
        Le2:
            r5.set(r9, r12, r3, r4)
            r11.M = r2
        Le7:
            android.widget.EditText r9 = r8.d
            if (r9 == 0) goto L186
            android.text.TextPaint r9 = r11.O
            float r12 = r11.h
            r9.setTextSize(r12)
            android.graphics.Typeface r12 = r11.u
            r9.setTypeface(r12)
            float r12 = r11.W
            r9.setLetterSpacing(r12)
            float r9 = r9.ascent()
            float r9 = -r9
            int r12 = r10.left
            android.widget.EditText r3 = r8.d
            int r3 = r3.getCompoundPaddingLeft()
            int r3 = r3 + r12
            r1.left = r3
            int r12 = r8.O
            if (r12 != r2) goto L124
            android.widget.EditText r12 = r8.d
            int r12 = r12.getMinLines()
            if (r12 > r2) goto L124
            int r12 = r10.centerY()
            float r12 = (float) r12
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r9 / r3
            float r12 = r12 - r3
            int r12 = (int) r12
            goto L12d
        L124:
            int r12 = r10.top
            android.widget.EditText r3 = r8.d
            int r3 = r3.getCompoundPaddingTop()
            int r12 = r12 + r3
        L12d:
            r1.top = r12
            int r12 = r10.right
            android.widget.EditText r3 = r8.d
            int r3 = r3.getCompoundPaddingRight()
            int r12 = r12 - r3
            r1.right = r12
            int r12 = r8.O
            if (r12 != r2) goto L14c
            android.widget.EditText r12 = r8.d
            int r12 = r12.getMinLines()
            if (r12 > r2) goto L14c
            int r10 = r1.top
            float r10 = (float) r10
            float r10 = r10 + r9
            int r9 = (int) r10
            goto L155
        L14c:
            int r9 = r10.bottom
            android.widget.EditText r10 = r8.d
            int r10 = r10.getCompoundPaddingBottom()
            int r9 = r9 - r10
        L155:
            r1.bottom = r9
            int r10 = r1.left
            int r12 = r1.top
            int r1 = r1.right
            android.graphics.Rect r3 = r11.c
            int r4 = r3.left
            if (r4 != r10) goto L170
            int r4 = r3.top
            if (r4 != r12) goto L170
            int r4 = r3.right
            if (r4 != r1) goto L170
            int r4 = r3.bottom
            if (r4 != r9) goto L170
            goto L175
        L170:
            r3.set(r10, r12, r1, r9)
            r11.M = r2
        L175:
            r11.h(r0)
            boolean r9 = r7.e()
            if (r9 == 0) goto L192
            boolean r9 = r8.u0
            if (r9 != 0) goto L192
            r7.j()
            return
        L186:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L18c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L192:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r5 = r4.B0
            com.google.android.material.textfield.a r6 = r4.c
            if (r5 != 0) goto L13
            android.view.ViewTreeObserver r5 = r6.getViewTreeObserver()
            r5.addOnGlobalLayoutListener(r4)
            r5 = 1
            r4.B0 = r5
        L13:
            a.r1 r5 = r4.t
            if (r5 == 0) goto L41
            android.widget.EditText r5 = r4.d
            if (r5 == 0) goto L41
            int r5 = r5.getGravity()
            a.r1 r0 = r4.t
            r0.setGravity(r5)
            a.r1 r5 = r4.t
            android.widget.EditText r0 = r4.d
            int r0 = r0.getCompoundPaddingLeft()
            android.widget.EditText r1 = r4.d
            int r1 = r1.getCompoundPaddingTop()
            android.widget.EditText r2 = r4.d
            int r2 = r2.getCompoundPaddingRight()
            android.widget.EditText r3 = r4.d
            int r3 = r3.getCompoundPaddingBottom()
            r5.setPadding(r0, r1, r2, r3)
        L41:
            r6.m()
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.textfield.TextInputLayout.h
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.textfield.TextInputLayout$h r2 = (com.google.android.material.textfield.TextInputLayout.h) r2
            android.os.Parcelable r0 = r2.f661a
            super.onRestoreInstanceState(r0)
            java.lang.CharSequence r0 = r2.c
            r1.setError(r0)
            boolean r2 = r2.d
            if (r2 == 0) goto L20
            com.google.android.material.textfield.TextInputLayout$b r2 = new com.google.android.material.textfield.TextInputLayout$b
            r2.<init>(r1)
            r1.post(r2)
        L20:
            r1.requestLayout()
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int r14) {
            r13 = this;
            super.onRtlPropertiesChanged(r14)
            r0 = 1
            if (r14 != r0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            boolean r14 = r13.M
            if (r0 == r14) goto La2
            a.Vd r14 = r13.L
            a.w4 r14 = r14.e
            android.graphics.RectF r1 = r13.a0
            float r14 = r14.a(r1)
            a.Vd r2 = r13.L
            a.w4 r2 = r2.f
            float r2 = r2.a(r1)
            a.Vd r3 = r13.L
            a.w4 r3 = r3.h
            float r3 = r3.a(r1)
            a.Vd r4 = r13.L
            a.w4 r4 = r4.g
            float r1 = r4.a(r1)
            a.Vd r4 = r13.L
            a.w1 r5 = r4.f307a
            a.w1 r6 = r4.b
            a.w1 r7 = r4.d
            a.w1 r4 = r4.c
            a.Ad r8 = new a.Ad
            r8.<init>()
            a.Ad r8 = new a.Ad
            r8.<init>()
            a.Ad r8 = new a.Ad
            r8.<init>()
            a.Ad r8 = new a.Ad
            r8.<init>()
            a.H5 r8 = new a.H5
            r8.<init>()
            a.H5 r9 = new a.H5
            r9.<init>()
            a.H5 r10 = new a.H5
            r10.<init>()
            a.H5 r11 = new a.H5
            r11.<init>()
            a.Vd.a.b(r6)
            a.Vd.a.b(r5)
            a.Vd.a.b(r4)
            a.Vd.a.b(r7)
            a.s r12 = new a.s
            r12.<init>(r2)
            a.s r2 = new a.s
            r2.<init>(r14)
            a.s r14 = new a.s
            r14.<init>(r1)
            a.s r1 = new a.s
            r1.<init>(r3)
            a.Vd r3 = new a.Vd
            r3.<init>()
            r3.f307a = r6
            r3.b = r5
            r3.c = r7
            r3.d = r4
            r3.e = r12
            r3.f = r2
            r3.g = r1
            r3.h = r14
            r3.i = r8
            r3.j = r9
            r3.k = r10
            r3.l = r11
            r13.M = r0
            r13.setShapeAppearanceModel(r3)
        La2:
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.textfield.TextInputLayout$h r1 = new com.google.android.material.textfield.TextInputLayout$h
            r1.<init>(r0)
            boolean r0 = r3.m()
            if (r0 == 0) goto L15
            java.lang.CharSequence r0 = r3.getError()
            r1.c = r0
        L15:
            com.google.android.material.textfield.a r0 = r3.c
            int r2 = r0.i
            if (r2 == 0) goto L23
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            boolean r0 = r0.d
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            r1.d = r0
            return r1
    }

    public final void p() {
            r4 = this;
            android.content.res.ColorStateList r0 = r4.A
            if (r0 == 0) goto L5
            goto L25
        L5:
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.colorControlActivated
            android.util.TypedValue r1 = a.C0498za.a(r0, r1)
            r2 = 0
            if (r1 != 0) goto L14
        L12:
            r0 = r2
            goto L25
        L14:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1d
            android.content.res.ColorStateList r0 = a.Y3.a(r0, r3)
            goto L25
        L1d:
            int r0 = r1.data
            if (r0 == 0) goto L12
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L25:
            android.widget.EditText r1 = r4.d
            if (r1 == 0) goto L50
            android.graphics.drawable.Drawable r1 = a.E.e(r1)
            if (r1 != 0) goto L30
            goto L50
        L30:
            android.widget.EditText r1 = r4.d
            android.graphics.drawable.Drawable r1 = a.E.e(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m()
            if (r2 != 0) goto L48
            a.r1 r2 = r4.o
            if (r2 == 0) goto L4d
            boolean r2 = r4.m
            if (r2 == 0) goto L4d
        L48:
            android.content.res.ColorStateList r2 = r4.B
            if (r2 == 0) goto L4d
            r0 = r2
        L4d:
            a.C0439w5.a.h(r1, r0)
        L50:
            return
    }

    public final boolean q() {
            r10 = this;
            android.widget.EditText r0 = r10.d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L20
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L5f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L5f
        L20:
            a.se r0 = r10.b
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L5f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.d
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.c0
            if (r6 == 0) goto L3b
            int r6 = r10.d0
            if (r6 == r0) goto L47
        L3b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.c0 = r6
            r10.d0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L47:
            android.widget.EditText r0 = r10.d
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.c0
            if (r6 == r7) goto L78
            android.widget.EditText r6 = r10.d
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L76
        L5f:
            android.graphics.drawable.ColorDrawable r0 = r10.c0
            if (r0 == 0) goto L78
            android.widget.EditText r0 = r10.d
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.d
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.c0 = r2
        L76:
            r0 = r5
            goto L79
        L78:
            r0 = r1
        L79:
            com.google.android.material.textfield.a r6 = r10.c
            boolean r7 = r6.e()
            if (r7 != 0) goto L8f
            int r7 = r6.i
            if (r7 == 0) goto L8b
            boolean r7 = r6.d()
            if (r7 != 0) goto L8f
        L8b:
            java.lang.CharSequence r7 = r6.p
            if (r7 == 0) goto L10d
        L8f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L10d
            a.r1 r7 = r6.q
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.d
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto Lab
            com.google.android.material.internal.CheckableImageButton r2 = r6.c
            goto Lb7
        Lab:
            int r8 = r6.i
            if (r8 == 0) goto Lb7
            boolean r8 = r6.d()
            if (r8 == 0) goto Lb7
            com.google.android.material.internal.CheckableImageButton r2 = r6.g
        Lb7:
            if (r2 == 0) goto Lca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        Lca:
            android.widget.EditText r2 = r10.d
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.f0
            if (r6 == 0) goto Leb
            int r8 = r10.g0
            if (r8 == r7) goto Leb
            r10.g0 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.d
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r6 = r10.f0
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            return r5
        Leb:
            if (r6 != 0) goto Lf9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f0 = r6
            r10.g0 = r7
            r6.setBounds(r1, r1, r7, r5)
        Lf9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.f0
            if (r3 == r6) goto L12f
            r10.h0 = r3
            android.widget.EditText r0 = r10.d
            r1 = r2[r1]
            r3 = r2[r5]
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            return r5
        L10d:
            android.graphics.drawable.ColorDrawable r6 = r10.f0
            if (r6 == 0) goto L12f
            android.widget.EditText r6 = r10.d
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.f0
            if (r3 != r7) goto L12b
            android.widget.EditText r0 = r10.d
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.h0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L12c
        L12b:
            r5 = r0
        L12c:
            r10.f0 = r2
            return r5
        L12f:
            return r0
    }

    public final void r() {
            r3 = this;
            android.widget.EditText r0 = r3.d
            if (r0 == 0) goto L48
            int r1 = r3.O
            if (r1 == 0) goto L9
            goto L48
        L9:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L10
            goto L48
        L10:
            int[] r1 = a.C0457x5.f758a
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r3.m()
            if (r1 == 0) goto L2a
            int r1 = r3.getErrorCurrentTextColors()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r1 = a.Y0.c(r1, r2)
            r0.setColorFilter(r1)
            return
        L2a:
            boolean r1 = r3.m
            if (r1 == 0) goto L40
            a.r1 r1 = r3.o
            if (r1 == 0) goto L40
            int r1 = r1.getCurrentTextColor()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r1 = a.Y0.c(r1, r2)
            r0.setColorFilter(r1)
            return
        L40:
            r0.clearColorFilter()
            android.widget.EditText r0 = r3.d
            r0.refreshDrawableState()
        L48:
            return
    }

    public final void s() {
            r3 = this;
            android.widget.EditText r0 = r3.d
            if (r0 == 0) goto L25
            a.Ta r1 = r3.F
            if (r1 == 0) goto L25
            boolean r1 = r3.I
            if (r1 != 0) goto L12
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L25
        L12:
            int r0 = r3.O
            if (r0 != 0) goto L17
            goto L25
        L17:
            android.graphics.drawable.Drawable r0 = r3.getEditTextBoxBackground()
            android.widget.EditText r1 = r3.d
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            r1.setBackground(r0)
            r0 = 1
            r3.I = r0
        L25:
            return
    }

    public void setBoxBackgroundColor(int r2) {
            r1 = this;
            int r0 = r1.U
            if (r0 == r2) goto Lf
            r1.U = r2
            r1.o0 = r2
            r1.q0 = r2
            r1.r0 = r2
            r1.b()
        Lf:
            return
    }

    public void setBoxBackgroundColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = a.Y3.b.a(r0, r2)
            r1.setBoxBackgroundColor(r2)
            return
    }

    public void setBoxBackgroundColorStateList(android.content.res.ColorStateList r4) {
            r3 = this;
            int r0 = r4.getDefaultColor()
            r3.o0 = r0
            r3.U = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.p0 = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            r2 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0, r2}
            int r0 = r4.getColorForState(r0, r1)
            r3.q0 = r0
            r0 = 16843623(0x1010367, float:2.3696E-38)
            int[] r0 = new int[]{r0, r2}
            int r4 = r4.getColorForState(r0, r1)
            r3.r0 = r4
            r3.b()
            return
    }

    public void setBoxBackgroundMode(int r2) {
            r1 = this;
            int r0 = r1.O
            if (r2 != r0) goto L5
            goto Le
        L5:
            r1.O = r2
            android.widget.EditText r2 = r1.d
            if (r2 == 0) goto Le
            r1.i()
        Le:
            return
    }

    public void setBoxCollapsedPaddingTop(int r1) {
            r0 = this;
            r0.P = r1
            return
    }

    public void setBoxCornerFamily(int r4) {
            r3 = this;
            a.Vd r0 = r3.L
            a.Vd$a r0 = r0.e()
            a.Vd r1 = r3.L
            a.w4 r1 = r1.e
            a.w1 r2 = a.C0282n9.l(r4)
            r0.f308a = r2
            a.Vd.a.b(r2)
            r0.e = r1
            a.Vd r1 = r3.L
            a.w4 r1 = r1.f
            a.w1 r2 = a.C0282n9.l(r4)
            r0.b = r2
            a.Vd.a.b(r2)
            r0.f = r1
            a.Vd r1 = r3.L
            a.w4 r1 = r1.h
            a.w1 r2 = a.C0282n9.l(r4)
            r0.d = r2
            a.Vd.a.b(r2)
            r0.h = r1
            a.Vd r1 = r3.L
            a.w4 r1 = r1.g
            a.w1 r4 = a.C0282n9.l(r4)
            r0.c = r4
            a.Vd.a.b(r4)
            r0.g = r1
            a.Vd r4 = r0.a()
            r3.L = r4
            r3.b()
            return
    }

    public void setBoxStrokeColor(int r2) {
            r1 = this;
            int r0 = r1.m0
            if (r0 == r2) goto L9
            r1.m0 = r2
            r1.x()
        L9:
            return
    }

    public void setBoxStrokeColorStateList(android.content.res.ColorStateList r4) {
            r3 = this;
            boolean r0 = r4.isStateful()
            if (r0 == 0) goto L38
            int r0 = r4.getDefaultColor()
            r3.k0 = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.s0 = r0
            r0 = 16843623(0x1010367, float:2.3696E-38)
            r2 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0, r2}
            int r0 = r4.getColorForState(r0, r1)
            r3.l0 = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r0 = new int[]{r0, r2}
            int r4 = r4.getColorForState(r0, r1)
            r3.m0 = r4
            goto L46
        L38:
            int r0 = r3.m0
            int r1 = r4.getDefaultColor()
            if (r0 == r1) goto L46
            int r4 = r4.getDefaultColor()
            r3.m0 = r4
        L46:
            r3.x()
            return
    }

    public void setBoxStrokeErrorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.n0
            if (r0 == r2) goto L9
            r1.n0 = r2
            r1.x()
        L9:
            return
    }

    public void setBoxStrokeWidth(int r1) {
            r0 = this;
            r0.R = r1
            r0.x()
            return
    }

    public void setBoxStrokeWidthFocused(int r1) {
            r0 = this;
            r0.S = r1
            r0.x()
            return
    }

    public void setBoxStrokeWidthFocusedResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidthFocused(r2)
            return
    }

    public void setBoxStrokeWidthResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidth(r2)
            return
    }

    public void setCounterEnabled(boolean r6) {
            r5 = this;
            boolean r0 = r5.k
            if (r0 == r6) goto L60
            r0 = 0
            r1 = 2
            a.T8 r2 = r5.j
            if (r6 == 0) goto L57
            a.r1 r3 = new a.r1
            android.content.Context r4 = r5.getContext()
            r3.<init>(r4, r0)
            r5.o = r3
            int r4 = com.google.android.material.R.id.textinput_counter
            r3.setId(r4)
            android.graphics.Typeface r3 = r5.b0
            if (r3 == 0) goto L23
            a.r1 r4 = r5.o
            r4.setTypeface(r3)
        L23:
            a.r1 r3 = r5.o
            r4 = 1
            r3.setMaxLines(r4)
            a.r1 r3 = r5.o
            r2.a(r3, r1)
            a.r1 r1 = r5.o
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.content.res.Resources r2 = r5.getResources()
            int r3 = com.google.android.material.R.dimen.mtrl_textinput_counter_margin_start
            int r2 = r2.getDimensionPixelOffset(r3)
            r1.setMarginStart(r2)
            r5.o()
            a.r1 r1 = r5.o
            if (r1 == 0) goto L5e
            android.widget.EditText r1 = r5.d
            if (r1 != 0) goto L4f
            goto L53
        L4f:
            android.text.Editable r0 = r1.getText()
        L53:
            r5.n(r0)
            goto L5e
        L57:
            a.r1 r3 = r5.o
            r2.g(r3, r1)
            r5.o = r0
        L5e:
            r5.k = r6
        L60:
            return
    }

    public void setCounterMaxLength(int r2) {
            r1 = this;
            int r0 = r1.l
            if (r0 == r2) goto L21
            if (r2 <= 0) goto L9
            r1.l = r2
            goto Lc
        L9:
            r2 = -1
            r1.l = r2
        Lc:
            boolean r2 = r1.k
            if (r2 == 0) goto L21
            a.r1 r2 = r1.o
            if (r2 == 0) goto L21
            android.widget.EditText r2 = r1.d
            if (r2 != 0) goto L1a
            r2 = 0
            goto L1e
        L1a:
            android.text.Editable r2 = r2.getText()
        L1e:
            r1.n(r2)
        L21:
            return
    }

    public void setCounterOverflowTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.p
            if (r0 == r2) goto L9
            r1.p = r2
            r1.o()
        L9:
            return
    }

    public void setCounterOverflowTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.z
            if (r0 == r2) goto L9
            r1.z = r2
            r1.o()
        L9:
            return
    }

    public void setCounterTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.q
            if (r0 == r2) goto L9
            r1.q = r2
            r1.o()
        L9:
            return
    }

    public void setCounterTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.y
            if (r0 == r2) goto L9
            r1.y = r2
            r1.o()
        L9:
            return
    }

    public void setCursorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.A
            if (r0 == r2) goto L9
            r1.A = r2
            r1.p()
        L9:
            return
    }

    public void setCursorErrorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.B
            if (r0 == r2) goto L19
            r1.B = r2
            boolean r2 = r1.m()
            if (r2 != 0) goto L16
            a.r1 r2 = r1.o
            if (r2 == 0) goto L15
            boolean r2 = r1.m
            if (r2 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            r1.p()
        L19:
            return
    }

    public void setDefaultHintTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.i0 = r1
            r0.j0 = r1
            android.widget.EditText r1 = r0.d
            if (r1 == 0) goto Lc
            r1 = 0
            r0.u(r1, r1)
        Lc:
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            k(r0, r1)
            super.setEnabled(r1)
            return
    }

    public void setEndIconActivated(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setActivated(r2)
            return
    }

    public void setEndIconCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setCheckable(r2)
            return
    }

    public void setEndIconContentDescription(int r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            if (r3 == 0) goto Ld
            android.content.res.Resources r1 = r0.getResources()
            java.lang.CharSequence r3 = r1.getText(r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            java.lang.CharSequence r1 = r0.getContentDescription()
            if (r1 == r3) goto L19
            r0.setContentDescription(r3)
        L19:
            return
    }

    public void setEndIconContentDescription(java.lang.CharSequence r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            java.lang.CharSequence r1 = r0.getContentDescription()
            if (r1 == r3) goto Ld
            r0.setContentDescription(r3)
        Ld:
            return
    }

    public void setEndIconDrawable(int r5) {
            r4 = this;
            com.google.android.material.textfield.a r0 = r4.c
            if (r5 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r5 = a.C0435w1.A(r1, r5)
            goto Le
        Ld:
            r5 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r1 = r0.g
            r1.setImageDrawable(r5)
            if (r5 == 0) goto L23
            android.content.res.ColorStateList r5 = r0.k
            android.graphics.PorterDuff$Mode r2 = r0.l
            com.google.android.material.textfield.TextInputLayout r3 = r0.f1096a
            a.M8.a(r3, r1, r5, r2)
            android.content.res.ColorStateList r5 = r0.k
            a.M8.c(r3, r1, r5)
        L23:
            return
    }

    public void setEndIconDrawable(android.graphics.drawable.Drawable r5) {
            r4 = this;
            com.google.android.material.textfield.a r0 = r4.c
            com.google.android.material.internal.CheckableImageButton r1 = r0.g
            r1.setImageDrawable(r5)
            if (r5 == 0) goto L17
            android.content.res.ColorStateList r5 = r0.k
            android.graphics.PorterDuff$Mode r2 = r0.l
            com.google.android.material.textfield.TextInputLayout r3 = r0.f1096a
            a.M8.a(r3, r1, r5, r2)
            android.content.res.ColorStateList r5 = r0.k
            a.M8.c(r3, r1, r5)
        L17:
            return
    }

    public void setEndIconMinSize(int r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            if (r3 < 0) goto L1b
            int r1 = r0.m
            if (r3 == r1) goto L1a
            r0.m = r3
            com.google.android.material.internal.CheckableImageButton r1 = r0.g
            r1.setMinimumWidth(r3)
            r1.setMinimumHeight(r3)
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            r0.setMinimumWidth(r3)
            r0.setMinimumHeight(r3)
        L1a:
            return
        L1b:
            r0.getClass()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "endIconSize cannot be less than 0"
            r3.<init>(r0)
            throw r3
    }

    public void setEndIconMode(int r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            r0.g(r2)
            return
    }

    public void setEndIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            android.view.View$OnLongClickListener r1 = r0.o
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setOnClickListener(r3)
            a.M8.d(r0, r1)
            return
    }

    public void setEndIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            r0.o = r2
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setOnLongClickListener(r2)
            a.M8.d(r0, r2)
            return
    }

    public void setEndIconScaleType(android.widget.ImageView.ScaleType r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            r0.n = r3
            com.google.android.material.internal.CheckableImageButton r1 = r0.g
            r1.setScaleType(r3)
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            r0.setScaleType(r3)
            return
    }

    public void setEndIconTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            com.google.android.material.textfield.a r0 = r3.c
            android.content.res.ColorStateList r1 = r0.k
            if (r1 == r4) goto L11
            r0.k = r4
            android.graphics.PorterDuff$Mode r1 = r0.l
            com.google.android.material.textfield.TextInputLayout r2 = r0.f1096a
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            a.M8.a(r2, r0, r4, r1)
        L11:
            return
    }

    public void setEndIconTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            com.google.android.material.textfield.a r0 = r3.c
            android.graphics.PorterDuff$Mode r1 = r0.l
            if (r1 == r4) goto L11
            r0.l = r4
            android.content.res.ColorStateList r1 = r0.k
            com.google.android.material.textfield.TextInputLayout r2 = r0.f1096a
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            a.M8.a(r2, r0, r1, r4)
        L11:
            return
    }

    public void setEndIconVisible(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            r0.h(r2)
            return
    }

    public void setError(java.lang.CharSequence r5) {
            r4 = this;
            a.T8 r0 = r4.j
            boolean r1 = r0.q
            r2 = 1
            if (r1 != 0) goto L11
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto Le
            return
        Le:
            r4.setErrorEnabled(r2)
        L11:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L33
            r0.c()
            r0.p = r5
            a.r1 r1 = r0.r
            r1.setText(r5)
            int r1 = r0.n
            if (r1 == r2) goto L27
            r0.o = r2
        L27:
            int r2 = r0.o
            a.r1 r3 = r0.r
            boolean r5 = r0.h(r3, r5)
            r0.i(r1, r2, r5)
            return
        L33:
            r0.f()
            return
    }

    public void setErrorAccessibilityLiveRegion(int r3) {
            r2 = this;
            a.T8 r0 = r2.j
            r0.t = r3
            a.r1 r0 = r0.r
            if (r0 == 0) goto Ld
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            r0.setAccessibilityLiveRegion(r3)
        Ld:
            return
    }

    public void setErrorContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            a.T8 r0 = r1.j
            r0.s = r2
            a.r1 r0 = r0.r
            if (r0 == 0) goto Lb
            r0.setContentDescription(r2)
        Lb:
            return
    }

    public void setErrorEnabled(boolean r7) {
            r6 = this;
            a.T8 r0 = r6.j
            boolean r1 = r0.q
            if (r1 != r7) goto L7
            return
        L7:
            r0.c()
            com.google.android.material.textfield.TextInputLayout r1 = r0.h
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L69
            a.r1 r4 = new a.r1
            android.content.Context r5 = r0.g
            r4.<init>(r5, r3)
            r0.r = r4
            int r3 = com.google.android.material.R.id.textinput_error
            r4.setId(r3)
            a.r1 r3 = r0.r
            r4 = 5
            r3.setTextAlignment(r4)
            android.graphics.Typeface r3 = r0.B
            if (r3 == 0) goto L2d
            a.r1 r4 = r0.r
            r4.setTypeface(r3)
        L2d:
            int r3 = r0.u
            r0.u = r3
            a.r1 r4 = r0.r
            if (r4 == 0) goto L38
            r1.l(r4, r3)
        L38:
            android.content.res.ColorStateList r1 = r0.v
            r0.v = r1
            a.r1 r3 = r0.r
            if (r3 == 0) goto L45
            if (r1 == 0) goto L45
            r3.setTextColor(r1)
        L45:
            java.lang.CharSequence r1 = r0.s
            r0.s = r1
            a.r1 r3 = r0.r
            if (r3 == 0) goto L50
            r3.setContentDescription(r1)
        L50:
            int r1 = r0.t
            r0.t = r1
            a.r1 r3 = r0.r
            if (r3 == 0) goto L5d
            java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
            r3.setAccessibilityLiveRegion(r1)
        L5d:
            a.r1 r1 = r0.r
            r3 = 4
            r1.setVisibility(r3)
            a.r1 r1 = r0.r
            r0.a(r1, r2)
            goto L79
        L69:
            r0.f()
            a.r1 r4 = r0.r
            r0.g(r4, r2)
            r0.r = r3
            r1.r()
            r1.x()
        L79:
            r0.q = r7
            return
    }

    public void setErrorIconDrawable(int r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            if (r3 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r1, r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            r0.i(r3)
            android.content.res.ColorStateList r3 = r0.d
            com.google.android.material.textfield.TextInputLayout r1 = r0.f1096a
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            a.M8.c(r1, r0, r3)
            return
    }

    public void setErrorIconDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            r0.i(r2)
            return
    }

    public void setErrorIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            com.google.android.material.internal.CheckableImageButton r1 = r0.c
            android.view.View$OnLongClickListener r0 = r0.f
            r1.setOnClickListener(r3)
            a.M8.d(r1, r0)
            return
    }

    public void setErrorIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            r0.f = r2
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            r0.setOnLongClickListener(r2)
            a.M8.d(r0, r2)
            return
    }

    public void setErrorIconTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            com.google.android.material.textfield.a r0 = r3.c
            android.content.res.ColorStateList r1 = r0.d
            if (r1 == r4) goto L11
            r0.d = r4
            android.graphics.PorterDuff$Mode r1 = r0.e
            com.google.android.material.textfield.TextInputLayout r2 = r0.f1096a
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            a.M8.a(r2, r0, r4, r1)
        L11:
            return
    }

    public void setErrorIconTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            com.google.android.material.textfield.a r0 = r3.c
            android.graphics.PorterDuff$Mode r1 = r0.e
            if (r1 == r4) goto L11
            r0.e = r4
            android.content.res.ColorStateList r1 = r0.d
            com.google.android.material.textfield.TextInputLayout r2 = r0.f1096a
            com.google.android.material.internal.CheckableImageButton r0 = r0.c
            a.M8.a(r2, r0, r1, r4)
        L11:
            return
    }

    public void setErrorTextAppearance(int r3) {
            r2 = this;
            a.T8 r0 = r2.j
            r0.u = r3
            a.r1 r1 = r0.r
            if (r1 == 0) goto Ld
            com.google.android.material.textfield.TextInputLayout r0 = r0.h
            r0.l(r1, r3)
        Ld:
            return
    }

    public void setErrorTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            a.T8 r0 = r1.j
            r0.v = r2
            a.r1 r0 = r0.r
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            r0.setTextColor(r2)
        Ld:
            return
    }

    public void setExpandedHintEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.w0
            if (r0 == r2) goto La
            r1.w0 = r2
            r2 = 0
            r1.u(r2, r2)
        La:
            return
    }

    public void setHelperText(java.lang.CharSequence r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            a.T8 r1 = r4.j
            if (r0 == 0) goto L11
            boolean r5 = r1.x
            if (r5 == 0) goto L10
            r5 = 0
            r4.setHelperTextEnabled(r5)
        L10:
            return
        L11:
            boolean r0 = r1.x
            if (r0 != 0) goto L19
            r0 = 1
            r4.setHelperTextEnabled(r0)
        L19:
            r1.c()
            r1.w = r5
            a.r1 r0 = r1.y
            r0.setText(r5)
            int r0 = r1.n
            r2 = 2
            if (r0 == r2) goto L2a
            r1.o = r2
        L2a:
            int r2 = r1.o
            a.r1 r3 = r1.y
            boolean r5 = r1.h(r3, r5)
            r1.i(r0, r2, r5)
            return
    }

    public void setHelperTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            a.T8 r0 = r1.j
            r0.A = r2
            a.r1 r0 = r0.y
            if (r0 == 0) goto Ld
            if (r2 == 0) goto Ld
            r0.setTextColor(r2)
        Ld:
            return
    }

    public void setHelperTextEnabled(boolean r8) {
            r7 = this;
            a.T8 r0 = r7.j
            boolean r1 = r0.x
            if (r1 != r8) goto L7
            return
        L7:
            r0.c()
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L60
            a.r1 r3 = new a.r1
            android.content.Context r4 = r0.g
            r3.<init>(r4, r1)
            r0.y = r3
            int r1 = com.google.android.material.R.id.textinput_helper_text
            r3.setId(r1)
            a.r1 r1 = r0.y
            r3 = 5
            r1.setTextAlignment(r3)
            android.graphics.Typeface r1 = r0.B
            if (r1 == 0) goto L2b
            a.r1 r3 = r0.y
            r3.setTypeface(r1)
        L2b:
            a.r1 r1 = r0.y
            r3 = 4
            r1.setVisibility(r3)
            a.r1 r1 = r0.y
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            r1.setAccessibilityLiveRegion(r2)
            int r1 = r0.z
            r0.z = r1
            a.r1 r3 = r0.y
            if (r3 == 0) goto L43
            r3.setTextAppearance(r1)
        L43:
            android.content.res.ColorStateList r1 = r0.A
            r0.A = r1
            a.r1 r3 = r0.y
            if (r3 == 0) goto L50
            if (r1 == 0) goto L50
            r3.setTextColor(r1)
        L50:
            a.r1 r1 = r0.y
            r0.a(r1, r2)
            a.r1 r1 = r0.y
            a.U8 r2 = new a.U8
            r2.<init>(r0)
            r1.setAccessibilityDelegate(r2)
            goto L87
        L60:
            r0.c()
            int r3 = r0.n
            r4 = 2
            if (r3 != r4) goto L6b
            r4 = 0
            r0.o = r4
        L6b:
            int r4 = r0.o
            a.r1 r5 = r0.y
            java.lang.String r6 = ""
            boolean r5 = r0.h(r5, r6)
            r0.i(r3, r4, r5)
            a.r1 r3 = r0.y
            r0.g(r3, r2)
            r0.y = r1
            com.google.android.material.textfield.TextInputLayout r1 = r0.h
            r1.r()
            r1.x()
        L87:
            r0.x = r8
            return
    }

    public void setHelperTextTextAppearance(int r2) {
            r1 = this;
            a.T8 r0 = r1.j
            r0.z = r2
            a.r1 r0 = r0.y
            if (r0 == 0) goto Lb
            r0.setTextAppearance(r2)
        Lb:
            return
    }

    public void setHint(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setHint(r2)
            return
    }

    public void setHint(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto Lc
            r1.setHintInternal(r2)
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        Lc:
            return
    }

    public void setHintAnimationEnabled(boolean r1) {
            r0 = this;
            r0.x0 = r1
            return
    }

    public void setHintEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.C
            if (r3 == r0) goto L51
            r2.C = r3
            r0 = 0
            if (r3 != 0) goto L2b
            r3 = 0
            r2.E = r3
            java.lang.CharSequence r3 = r2.D
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L27
            android.widget.EditText r3 = r2.d
            java.lang.CharSequence r3 = r3.getHint()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L27
            android.widget.EditText r3 = r2.d
            java.lang.CharSequence r1 = r2.D
            r3.setHint(r1)
        L27:
            r2.setHintInternal(r0)
            goto L4a
        L2b:
            android.widget.EditText r3 = r2.d
            java.lang.CharSequence r3 = r3.getHint()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L47
            java.lang.CharSequence r1 = r2.D
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L42
            r2.setHint(r3)
        L42:
            android.widget.EditText r3 = r2.d
            r3.setHint(r0)
        L47:
            r3 = 1
            r2.E = r3
        L4a:
            android.widget.EditText r3 = r2.d
            if (r3 == 0) goto L51
            r2.t()
        L51:
            return
    }

    public void setHintTextAppearance(int r6) {
            r5 = this;
            a.Ve r0 = new a.Ve
            a.n3 r1 = r5.v0
            com.google.android.material.textfield.TextInputLayout r2 = r1.f592a
            android.content.Context r3 = r2.getContext()
            r0.<init>(r3, r6)
            android.content.res.ColorStateList r6 = r0.j
            if (r6 == 0) goto L13
            r1.k = r6
        L13:
            float r6 = r0.k
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L1c
            r1.i = r6
        L1c:
            android.content.res.ColorStateList r6 = r0.f309a
            if (r6 == 0) goto L22
            r1.U = r6
        L22:
            float r6 = r0.e
            r1.S = r6
            float r6 = r0.f
            r1.T = r6
            float r6 = r0.g
            r1.R = r6
            float r6 = r0.i
            r1.V = r6
            a.J2 r6 = r1.y
            if (r6 == 0) goto L39
            r3 = 1
            r6.c = r3
        L39:
            a.J2 r6 = new a.J2
            a.R0 r3 = new a.R0
            r3.<init>(r1)
            r0.a()
            android.graphics.Typeface r4 = r0.n
            r6.<init>(r3, r4)
            r1.y = r6
            android.content.Context r6 = r2.getContext()
            a.J2 r2 = r1.y
            r0.c(r6, r2)
            r6 = 0
            r1.h(r6)
            android.content.res.ColorStateList r0 = r1.k
            r5.j0 = r0
            android.widget.EditText r0 = r5.d
            if (r0 == 0) goto L65
            r5.u(r6, r6)
            r5.t()
        L65:
            return
    }

    public void setHintTextColor(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.j0
            if (r0 == r4) goto L1d
            android.content.res.ColorStateList r0 = r3.i0
            r1 = 0
            if (r0 != 0) goto L14
            a.n3 r0 = r3.v0
            android.content.res.ColorStateList r2 = r0.k
            if (r2 == r4) goto L14
            r0.k = r4
            r0.h(r1)
        L14:
            r3.j0 = r4
            android.widget.EditText r4 = r3.d
            if (r4 == 0) goto L1d
            r3.u(r1, r1)
        L1d:
            return
    }

    public void setLengthCounter(com.google.android.material.textfield.TextInputLayout.e r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setMaxEms(int r3) {
            r2 = this;
            r2.g = r3
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMaxEms(r3)
        Lc:
            return
    }

    public void setMaxWidth(int r3) {
            r2 = this;
            r2.i = r3
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMaxWidth(r3)
        Lc:
            return
    }

    public void setMaxWidthResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setMaxWidth(r2)
            return
    }

    public void setMinEms(int r3) {
            r2 = this;
            r2.f = r3
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMinEms(r3)
        Lc:
            return
    }

    public void setMinWidth(int r3) {
            r2 = this;
            r2.h = r3
            android.widget.EditText r0 = r2.d
            if (r0 == 0) goto Lc
            r1 = -1
            if (r3 == r1) goto Lc
            r0.setMinWidth(r3)
        Lc:
            return
    }

    public void setMinWidthResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setMinWidth(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(int r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            if (r3 == 0) goto Ld
            android.content.res.Resources r1 = r0.getResources()
            java.lang.CharSequence r3 = r1.getText(r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setContentDescription(r3)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setContentDescription(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(int r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            if (r3 == 0) goto Ld
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r1, r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setImageDrawable(r3)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setImageDrawable(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean r4) {
            r3 = this;
            com.google.android.material.textfield.a r0 = r3.c
            if (r4 == 0) goto Ld
            int r1 = r0.i
            r2 = 1
            if (r1 == r2) goto Ld
            r0.g(r2)
            return
        Ld:
            if (r4 != 0) goto L14
            r4 = 0
            r0.g(r4)
            return
        L14:
            r0.getClass()
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            com.google.android.material.textfield.a r0 = r3.c
            r0.k = r4
            android.graphics.PorterDuff$Mode r1 = r0.l
            com.google.android.material.textfield.TextInputLayout r2 = r0.f1096a
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            a.M8.a(r2, r0, r4, r1)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            com.google.android.material.textfield.a r0 = r3.c
            r0.l = r4
            android.content.res.ColorStateList r1 = r0.k
            com.google.android.material.textfield.TextInputLayout r2 = r0.f1096a
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            a.M8.a(r2, r0, r1, r4)
            return
    }

    public void setPlaceholderText(java.lang.CharSequence r5) {
            r4 = this;
            a.r1 r0 = r4.t
            r1 = 0
            if (r0 != 0) goto L37
            a.r1 r0 = new a.r1
            android.content.Context r2 = r4.getContext()
            r0.<init>(r2, r1)
            r4.t = r0
            int r2 = com.google.android.material.R.id.textinput_placeholder
            r0.setId(r2)
            a.r1 r0 = r4.t
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            r2 = 2
            r0.setImportantForAccessibility(r2)
            androidx.transition.c r0 = r4.d()
            r4.w = r0
            r2 = 67
            r0.b = r2
            androidx.transition.c r0 = r4.d()
            r4.x = r0
            int r0 = r4.v
            r4.setPlaceholderTextAppearance(r0)
            android.content.res.ColorStateList r0 = r4.u
            r4.setPlaceholderTextColor(r0)
        L37:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L42
            r5 = 0
            r4.setPlaceholderTextEnabled(r5)
            goto L4c
        L42:
            boolean r0 = r4.s
            if (r0 != 0) goto L4a
            r0 = 1
            r4.setPlaceholderTextEnabled(r0)
        L4a:
            r4.r = r5
        L4c:
            android.widget.EditText r5 = r4.d
            if (r5 != 0) goto L51
            goto L55
        L51:
            android.text.Editable r1 = r5.getText()
        L55:
            r4.v(r1)
            return
    }

    public void setPlaceholderTextAppearance(int r2) {
            r1 = this;
            r1.v = r2
            a.r1 r0 = r1.t
            if (r0 == 0) goto L9
            r0.setTextAppearance(r2)
        L9:
            return
    }

    public void setPlaceholderTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.u
            if (r0 == r2) goto Lf
            r1.u = r2
            a.r1 r0 = r1.t
            if (r0 == 0) goto Lf
            if (r2 == 0) goto Lf
            r0.setTextColor(r2)
        Lf:
            return
    }

    public void setPrefixText(java.lang.CharSequence r3) {
            r2 = this;
            a.se r0 = r2.b
            r0.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Ld
            r1 = 0
            goto Le
        Ld:
            r1 = r3
        Le:
            r0.c = r1
            a.r1 r1 = r0.b
            r1.setText(r3)
            r0.e()
            return
    }

    public void setPrefixTextAppearance(int r2) {
            r1 = this;
            a.se r0 = r1.b
            a.r1 r0 = r0.b
            r0.setTextAppearance(r2)
            return
    }

    public void setPrefixTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            a.se r0 = r1.b
            a.r1 r0 = r0.b
            r0.setTextColor(r2)
            return
    }

    public void setShapeAppearanceModel(a.Vd r2) {
            r1 = this;
            a.Ta r0 = r1.F
            if (r0 == 0) goto Lf
            a.Ta$b r0 = r0.f278a
            a.Vd r0 = r0.f280a
            if (r0 == r2) goto Lf
            r1.L = r2
            r1.b()
        Lf:
            return
    }

    public void setStartIconCheckable(boolean r2) {
            r1 = this;
            a.se r0 = r1.b
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setCheckable(r2)
            return
    }

    public void setStartIconContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconContentDescription(r2)
            return
    }

    public void setStartIconContentDescription(java.lang.CharSequence r3) {
            r2 = this;
            a.se r0 = r2.b
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            java.lang.CharSequence r1 = r0.getContentDescription()
            if (r1 == r3) goto Ld
            r0.setContentDescription(r3)
        Ld:
            return
    }

    public void setStartIconDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconDrawable(r2)
            return
    }

    public void setStartIconDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.se r0 = r1.b
            r0.b(r2)
            return
    }

    public void setStartIconMinSize(int r3) {
            r2 = this;
            a.se r0 = r2.b
            if (r3 < 0) goto L13
            int r1 = r0.g
            if (r3 == r1) goto L12
            r0.g = r3
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setMinimumWidth(r3)
            r0.setMinimumHeight(r3)
        L12:
            return
        L13:
            r0.getClass()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "startIconSize cannot be less than 0"
            r3.<init>(r0)
            throw r3
    }

    public void setStartIconOnClickListener(android.view.View.OnClickListener r3) {
            r2 = this;
            a.se r0 = r2.b
            android.view.View$OnLongClickListener r1 = r0.i
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setOnClickListener(r3)
            a.M8.d(r0, r1)
            return
    }

    public void setStartIconOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            a.se r0 = r1.b
            r0.i = r2
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setOnLongClickListener(r2)
            a.M8.d(r0, r2)
            return
    }

    public void setStartIconScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            a.se r0 = r1.b
            r0.h = r2
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setScaleType(r2)
            return
    }

    public void setStartIconTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            a.se r0 = r3.b
            android.content.res.ColorStateList r1 = r0.e
            if (r1 == r4) goto L11
            r0.e = r4
            android.graphics.PorterDuff$Mode r1 = r0.f
            com.google.android.material.textfield.TextInputLayout r2 = r0.f689a
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            a.M8.a(r2, r0, r4, r1)
        L11:
            return
    }

    public void setStartIconTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            a.se r0 = r3.b
            android.graphics.PorterDuff$Mode r1 = r0.f
            if (r1 == r4) goto L11
            r0.f = r4
            android.content.res.ColorStateList r1 = r0.e
            com.google.android.material.textfield.TextInputLayout r2 = r0.f689a
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            a.M8.a(r2, r0, r1, r4)
        L11:
            return
    }

    public void setStartIconVisible(boolean r2) {
            r1 = this;
            a.se r0 = r1.b
            r0.c(r2)
            return
    }

    public void setSuffixText(java.lang.CharSequence r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.c
            r0.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Ld
            r1 = 0
            goto Le
        Ld:
            r1 = r3
        Le:
            r0.p = r1
            a.r1 r1 = r0.q
            r1.setText(r3)
            r0.n()
            return
    }

    public void setSuffixTextAppearance(int r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            a.r1 r0 = r0.q
            r0.setTextAppearance(r2)
            return
    }

    public void setSuffixTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.c
            a.r1 r0 = r0.q
            r0.setTextColor(r2)
            return
    }

    public void setTextInputAccessibilityDelegate(com.google.android.material.textfield.TextInputLayout.d r2) {
            r1 = this;
            android.widget.EditText r0 = r1.d
            if (r0 == 0) goto L7
            a.C0414ug.j(r0, r2)
        L7:
            return
    }

    public void setTypeface(android.graphics.Typeface r3) {
            r2 = this;
            android.graphics.Typeface r0 = r2.b0
            if (r3 == r0) goto L28
            r2.b0 = r3
            a.n3 r0 = r2.v0
            r0.m(r3)
            a.T8 r0 = r2.j
            android.graphics.Typeface r1 = r0.B
            if (r3 == r1) goto L21
            r0.B = r3
            a.r1 r1 = r0.r
            if (r1 == 0) goto L1a
            r1.setTypeface(r3)
        L1a:
            a.r1 r0 = r0.y
            if (r0 == 0) goto L21
            r0.setTypeface(r3)
        L21:
            a.r1 r0 = r2.o
            if (r0 == 0) goto L28
            r0.setTypeface(r3)
        L28:
            return
    }

    public final void t() {
            r4 = this;
            int r0 = r4.O
            r1 = 1
            if (r0 == r1) goto L1a
            android.widget.FrameLayout r0 = r4.f1092a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r2 = r4.c()
            int r3 = r1.topMargin
            if (r2 == r3) goto L1a
            r1.topMargin = r2
            r0.requestLayout()
        L1a:
            return
    }

    public final void u(boolean r10, boolean r11) {
            r9 = this;
            boolean r0 = r9.isEnabled()
            android.widget.EditText r1 = r9.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = r2
        L17:
            android.widget.EditText r4 = r9.d
            if (r4 == 0) goto L23
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L23
            r4 = r3
            goto L24
        L23:
            r4 = r2
        L24:
            android.content.res.ColorStateList r5 = r9.i0
            a.n3 r6 = r9.v0
            if (r5 == 0) goto L2d
            r6.i(r5)
        L2d:
            r5 = 0
            if (r0 != 0) goto L4c
            android.content.res.ColorStateList r0 = r9.i0
            if (r0 == 0) goto L42
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r7 = new int[]{r7}
            int r8 = r9.s0
            int r0 = r0.getColorForState(r7, r8)
            goto L44
        L42:
            int r0 = r9.s0
        L44:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r6.i(r0)
            goto L81
        L4c:
            boolean r0 = r9.m()
            if (r0 == 0) goto L62
            a.T8 r0 = r9.j
            a.r1 r0 = r0.r
            if (r0 == 0) goto L5d
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L5e
        L5d:
            r0 = r5
        L5e:
            r6.i(r0)
            goto L81
        L62:
            boolean r0 = r9.m
            if (r0 == 0) goto L72
            a.r1 r0 = r9.o
            if (r0 == 0) goto L72
            android.content.res.ColorStateList r0 = r0.getTextColors()
            r6.i(r0)
            goto L81
        L72:
            if (r4 == 0) goto L81
            android.content.res.ColorStateList r0 = r9.j0
            if (r0 == 0) goto L81
            android.content.res.ColorStateList r7 = r6.k
            if (r7 == r0) goto L81
            r6.k = r0
            r6.h(r2)
        L81:
            com.google.android.material.textfield.a r0 = r9.c
            a.se r7 = r9.b
            if (r1 != 0) goto Lfd
            boolean r1 = r9.w0
            if (r1 == 0) goto Lfd
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto L94
            if (r4 == 0) goto L94
            goto Lfd
        L94:
            if (r11 != 0) goto L9a
            boolean r11 = r9.u0
            if (r11 != 0) goto L104
        L9a:
            android.animation.ValueAnimator r11 = r9.y0
            if (r11 == 0) goto La9
            boolean r11 = r11.isRunning()
            if (r11 == 0) goto La9
            android.animation.ValueAnimator r11 = r9.y0
            r11.cancel()
        La9:
            r11 = 0
            if (r10 == 0) goto Lb4
            boolean r10 = r9.x0
            if (r10 == 0) goto Lb4
            r9.a(r11)
            goto Lb7
        Lb4:
            r6.k(r11)
        Lb7:
            boolean r10 = r9.e()
            if (r10 == 0) goto Ld8
            a.Ta r10 = r9.F
            a.F4 r10 = (a.F4) r10
            a.F4$a r10 = r10.y
            android.graphics.RectF r10 = r10.q
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Ld8
            boolean r10 = r9.e()
            if (r10 == 0) goto Ld8
            a.Ta r10 = r9.F
            a.F4 r10 = (a.F4) r10
            r10.o(r11, r11, r11, r11)
        Ld8:
            r9.u0 = r3
            a.r1 r10 = r9.t
            if (r10 == 0) goto Lf2
            boolean r11 = r9.s
            if (r11 == 0) goto Lf2
            r10.setText(r5)
            android.widget.FrameLayout r10 = r9.f1092a
            androidx.transition.c r11 = r9.x
            androidx.transition.g.a(r10, r11)
            a.r1 r10 = r9.t
            r11 = 4
            r10.setVisibility(r11)
        Lf2:
            r7.j = r3
            r7.e()
            r0.r = r3
            r0.n()
            return
        Lfd:
            if (r11 != 0) goto L105
            boolean r11 = r9.u0
            if (r11 == 0) goto L104
            goto L105
        L104:
            return
        L105:
            android.animation.ValueAnimator r11 = r9.y0
            if (r11 == 0) goto L114
            boolean r11 = r11.isRunning()
            if (r11 == 0) goto L114
            android.animation.ValueAnimator r11 = r9.y0
            r11.cancel()
        L114:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L120
            boolean r10 = r9.x0
            if (r10 == 0) goto L120
            r9.a(r11)
            goto L123
        L120:
            r6.k(r11)
        L123:
            r9.u0 = r2
            boolean r10 = r9.e()
            if (r10 == 0) goto L12e
            r9.j()
        L12e:
            android.widget.EditText r10 = r9.d
            if (r10 != 0) goto L133
            goto L137
        L133:
            android.text.Editable r5 = r10.getText()
        L137:
            r9.v(r5)
            r7.j = r2
            r7.e()
            r0.r = r2
            r0.n()
            return
    }

    public final void v(android.text.Editable r4) {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout$e r0 = r3.n
            a.z r0 = (a.C0487z) r0
            r0.getClass()
            r0 = 0
            if (r4 == 0) goto Lf
            int r4 = r4.length()
            goto L10
        Lf:
            r4 = r0
        L10:
            android.widget.FrameLayout r1 = r3.f1092a
            if (r4 != 0) goto L44
            boolean r4 = r3.u0
            if (r4 != 0) goto L44
            a.r1 r4 = r3.t
            if (r4 == 0) goto L5b
            boolean r4 = r3.s
            if (r4 == 0) goto L5b
            java.lang.CharSequence r4 = r3.r
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L5b
            a.r1 r4 = r3.t
            java.lang.CharSequence r2 = r3.r
            r4.setText(r2)
            androidx.transition.c r4 = r3.w
            androidx.transition.g.a(r1, r4)
            a.r1 r4 = r3.t
            r4.setVisibility(r0)
            a.r1 r4 = r3.t
            r4.bringToFront()
            java.lang.CharSequence r4 = r3.r
            r3.announceForAccessibility(r4)
            return
        L44:
            a.r1 r4 = r3.t
            if (r4 == 0) goto L5b
            boolean r0 = r3.s
            if (r0 == 0) goto L5b
            r0 = 0
            r4.setText(r0)
            androidx.transition.c r4 = r3.x
            androidx.transition.g.a(r1, r4)
            a.r1 r4 = r3.t
            r0 = 4
            r4.setVisibility(r0)
        L5b:
            return
    }

    public final void w(boolean r6, boolean r7) {
            r5 = this;
            android.content.res.ColorStateList r0 = r5.n0
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r1 = r5.n0
            r2 = 16843623(0x1010367, float:2.3696E-38)
            r3 = 16842910(0x101009e, float:2.3694E-38)
            int[] r2 = new int[]{r2, r3}
            int r1 = r1.getColorForState(r2, r0)
            android.content.res.ColorStateList r2 = r5.n0
            r4 = 16843518(0x10102fe, float:2.3695705E-38)
            int[] r3 = new int[]{r4, r3}
            int r2 = r2.getColorForState(r3, r0)
            if (r6 == 0) goto L28
            r5.T = r2
            return
        L28:
            if (r7 == 0) goto L2d
            r5.T = r1
            return
        L2d:
            r5.T = r0
            return
    }

    public final void x() {
            r7 = this;
            a.Ta r0 = r7.F
            if (r0 == 0) goto L12e
            int r0 = r7.O
            if (r0 != 0) goto La
            goto L12e
        La:
            boolean r0 = r7.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            android.widget.EditText r0 = r7.d
            if (r0 == 0) goto L1d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            boolean r3 = r7.isHovered()
            if (r3 != 0) goto L30
            android.widget.EditText r3 = r7.d
            if (r3 == 0) goto L31
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L31
        L30:
            r1 = r2
        L31:
            boolean r3 = r7.isEnabled()
            if (r3 != 0) goto L3c
            int r3 = r7.s0
            r7.T = r3
            goto L7a
        L3c:
            boolean r3 = r7.m()
            if (r3 == 0) goto L51
            android.content.res.ColorStateList r3 = r7.n0
            if (r3 == 0) goto L4a
            r7.w(r0, r1)
            goto L7a
        L4a:
            int r3 = r7.getErrorCurrentTextColors()
            r7.T = r3
            goto L7a
        L51:
            boolean r3 = r7.m
            if (r3 == 0) goto L68
            a.r1 r3 = r7.o
            if (r3 == 0) goto L68
            android.content.res.ColorStateList r4 = r7.n0
            if (r4 == 0) goto L61
            r7.w(r0, r1)
            goto L7a
        L61:
            int r3 = r3.getCurrentTextColor()
            r7.T = r3
            goto L7a
        L68:
            if (r0 == 0) goto L6f
            int r3 = r7.m0
            r7.T = r3
            goto L7a
        L6f:
            if (r1 == 0) goto L76
            int r3 = r7.l0
            r7.T = r3
            goto L7a
        L76:
            int r3 = r7.k0
            r7.T = r3
        L7a:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L83
            r7.p()
        L83:
            com.google.android.material.textfield.a r3 = r7.c
            r3.l()
            com.google.android.material.internal.CheckableImageButton r4 = r3.c
            android.content.res.ColorStateList r5 = r3.d
            com.google.android.material.textfield.TextInputLayout r6 = r3.f1096a
            a.M8.c(r6, r4, r5)
            android.content.res.ColorStateList r4 = r3.k
            com.google.android.material.internal.CheckableImageButton r5 = r3.g
            a.M8.c(r6, r5, r4)
            a.c6 r4 = r3.b()
            boolean r4 = r4 instanceof a.F5
            if (r4 == 0) goto Lc6
            boolean r4 = r6.m()
            if (r4 == 0) goto Lbf
            android.graphics.drawable.Drawable r4 = r5.getDrawable()
            if (r4 == 0) goto Lbf
            android.graphics.drawable.Drawable r3 = r5.getDrawable()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            int r4 = r6.getErrorCurrentTextColors()
            a.C0439w5.a.g(r3, r4)
            r5.setImageDrawable(r3)
            goto Lc6
        Lbf:
            android.content.res.ColorStateList r4 = r3.k
            android.graphics.PorterDuff$Mode r3 = r3.l
            a.M8.a(r6, r5, r4, r3)
        Lc6:
            a.se r3 = r7.b
            com.google.android.material.internal.CheckableImageButton r4 = r3.d
            android.content.res.ColorStateList r5 = r3.e
            com.google.android.material.textfield.TextInputLayout r3 = r3.f689a
            a.M8.c(r3, r4, r5)
            int r3 = r7.O
            r4 = 2
            if (r3 != r4) goto L108
            int r3 = r7.Q
            if (r0 == 0) goto Le5
            boolean r4 = r7.isEnabled()
            if (r4 == 0) goto Le5
            int r4 = r7.S
            r7.Q = r4
            goto Le9
        Le5:
            int r4 = r7.R
            r7.Q = r4
        Le9:
            int r4 = r7.Q
            if (r4 == r3) goto L108
            boolean r3 = r7.e()
            if (r3 == 0) goto L108
            boolean r3 = r7.u0
            if (r3 != 0) goto L108
            boolean r3 = r7.e()
            if (r3 == 0) goto L105
            a.Ta r3 = r7.F
            a.F4 r3 = (a.F4) r3
            r4 = 0
            r3.o(r4, r4, r4, r4)
        L105:
            r7.j()
        L108:
            int r3 = r7.O
            if (r3 != r2) goto L12b
            boolean r2 = r7.isEnabled()
            if (r2 != 0) goto L117
            int r0 = r7.p0
            r7.U = r0
            goto L12b
        L117:
            if (r1 == 0) goto L120
            if (r0 != 0) goto L120
            int r0 = r7.r0
            r7.U = r0
            goto L12b
        L120:
            if (r0 == 0) goto L127
            int r0 = r7.q0
            r7.U = r0
            goto L12b
        L127:
            int r0 = r7.o0
            r7.U = r0
        L12b:
            r7.b()
        L12e:
            return
    }
}
