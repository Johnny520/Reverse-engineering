package a;

/* JADX INFO: renamed from: a.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0310p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f630a;
    public a.C0270mf b;
    public a.C0270mf c;
    public a.C0270mf d;
    public a.C0270mf e;
    public a.C0270mf f;
    public a.C0270mf g;
    public a.C0270mf h;
    public final a.C0363s1 i;
    public int j;
    public int k;
    public android.graphics.Typeface l;
    public boolean m;

    /* JADX INFO: renamed from: a.p1$a */
    public class a extends a.C0340qd.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f631a;
        public final /* synthetic */ int b;
        public final /* synthetic */ java.lang.ref.WeakReference c;
        public final /* synthetic */ a.C0310p1 d;

        public a(a.C0310p1 r1, int r2, int r3, java.lang.ref.WeakReference r4) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                r0.f631a = r2
                r0.b = r3
                r0.c = r4
                return
        }

        @Override // a.C0340qd.e
        public final void b(int r1) {
                r0 = this;
                return
        }

        @Override // a.C0340qd.e
        public final void c(android.graphics.Typeface r4) {
                r3 = this;
                r0 = -1
                int r1 = r3.f631a
                if (r1 == r0) goto L12
                int r0 = r3.b
                r0 = r0 & 2
                if (r0 == 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                android.graphics.Typeface r4 = a.C0310p1.d.a(r4, r1, r0)
            L12:
                a.p1 r0 = r3.d
                boolean r1 = r0.m
                if (r1 == 0) goto L3a
                r0.l = r4
                java.lang.ref.WeakReference r1 = r3.c
                java.lang.Object r1 = r1.get()
                android.widget.TextView r1 = (android.widget.TextView) r1
                if (r1 == 0) goto L3a
                boolean r2 = r1.isAttachedToWindow()
                if (r2 == 0) goto L35
                int r0 = r0.j
                a.q1 r2 = new a.q1
                r2.<init>(r1, r4, r0)
                r1.post(r2)
                return
            L35:
                int r0 = r0.j
                r1.setTypeface(r4, r0)
            L3a:
                return
        }
    }

    /* JADX INFO: renamed from: a.p1$b */
    public static class b {
        public static android.os.LocaleList a(java.lang.String r0) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                return r0
        }

        public static void b(android.widget.TextView r0, android.os.LocaleList r1) {
                r0.setTextLocales(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.p1$c */
    public static class c {
        public static int a(android.widget.TextView r0) {
                int r0 = r0.getAutoSizeStepGranularity()
                return r0
        }

        public static void b(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
                r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
                return
        }

        public static void c(android.widget.TextView r0, int[] r1, int r2) {
                r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
                return
        }

        public static boolean d(android.widget.TextView r0, java.lang.String r1) {
                boolean r0 = r0.setFontVariationSettings(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.p1$d */
    public static class d {
        public static android.graphics.Typeface a(android.graphics.Typeface r0, int r1, boolean r2) {
                android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1, r2)
                return r0
        }
    }

    public C0310p1(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.j = r0
            r0 = -1
            r1.k = r0
            r1.f630a = r2
            a.s1 r0 = new a.s1
            r0.<init>(r2)
            r1.i = r0
            return
    }

    public static a.C0270mf c(android.content.Context r1, a.Y0 r2, int r3) {
            monitor-enter(r2)
            a.pd r0 = r2.f347a     // Catch: java.lang.Throwable -> L17
            android.content.res.ColorStateList r1 = r0.f(r1, r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            if (r1 == 0) goto L15
            a.mf r2 = new a.mf
            r2.<init>()
            r3 = 1
            r2.d = r3
            r2.f580a = r1
            return r2
        L15:
            r1 = 0
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public static void h(android.view.inputmethod.EditorInfo r11, android.view.inputmethod.InputConnection r12, android.widget.TextView r13) {
            r0 = 2048(0x800, float:2.87E-42)
            r1 = 0
            r2 = 1
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 >= r4) goto Lbc
            if (r12 == 0) goto Lbc
            java.lang.CharSequence r12 = r13.getText()
            if (r3 < r4) goto L16
            a.I5.a.a(r11, r12)
            return
        L16:
            r12.getClass()
            if (r3 < r4) goto L1f
            a.I5.a.a(r11, r12)
            return
        L1f:
            int r13 = r11.initialSelStart
            int r3 = r11.initialSelEnd
            if (r13 <= r3) goto L27
            r4 = r3
            goto L28
        L27:
            r4 = r13
        L28:
            if (r13 <= r3) goto L2b
            goto L2c
        L2b:
            r13 = r3
        L2c:
            int r3 = r12.length()
            r5 = 0
            if (r4 < 0) goto Lb9
            if (r13 <= r3) goto L37
            goto Lb9
        L37:
            int r6 = r11.inputType
            r6 = r6 & 4095(0xfff, float:5.738E-42)
            r7 = 129(0x81, float:1.81E-43)
            if (r6 == r7) goto Lb5
            r7 = 225(0xe1, float:3.15E-43)
            if (r6 == r7) goto Lb5
            r7 = 18
            if (r6 != r7) goto L48
            goto Lb5
        L48:
            if (r3 > r0) goto L4e
            a.I5.a(r11, r12, r4, r13)
            return
        L4e:
            int r3 = r13 - r4
            r5 = 1024(0x400, float:1.435E-42)
            if (r3 <= r5) goto L56
            r5 = r1
            goto L57
        L56:
            r5 = r3
        L57:
            int r6 = r12.length()
            int r6 = r6 - r13
            int r0 = r0 - r5
            r7 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r9 = (double) r0
            double r9 = r9 * r7
            int r7 = (int) r9
            int r7 = java.lang.Math.min(r4, r7)
            int r7 = r0 - r7
            int r6 = java.lang.Math.min(r6, r7)
            int r0 = r0 - r6
            int r0 = java.lang.Math.min(r4, r0)
            int r4 = r4 - r0
            char r7 = r12.charAt(r4)
            boolean r7 = java.lang.Character.isLowSurrogate(r7)
            if (r7 == 0) goto L81
            int r4 = r4 + r2
            int r0 = r0 - r2
        L81:
            int r7 = r13 + r6
            int r7 = r7 - r2
            char r7 = r12.charAt(r7)
            boolean r7 = java.lang.Character.isHighSurrogate(r7)
            if (r7 == 0) goto L8f
            int r6 = r6 - r2
        L8f:
            int r7 = r0 + r5
            int r8 = r7 + r6
            if (r5 == r3) goto Lac
            int r3 = r4 + r0
            java.lang.CharSequence r3 = r12.subSequence(r4, r3)
            int r6 = r6 + r13
            java.lang.CharSequence r12 = r12.subSequence(r13, r6)
            r13 = 2
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r13]
            r13[r1] = r3
            r13[r2] = r12
            java.lang.CharSequence r12 = android.text.TextUtils.concat(r13)
            goto Lb1
        Lac:
            int r8 = r8 + r4
            java.lang.CharSequence r12 = r12.subSequence(r4, r8)
        Lb1:
            a.I5.a(r11, r12, r0, r7)
            return
        Lb5:
            a.I5.a(r11, r5, r1, r1)
            return
        Lb9:
            a.I5.a(r11, r5, r1, r1)
        Lbc:
            return
    }

    public final void a(android.graphics.drawable.Drawable r2, a.C0270mf r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            android.widget.TextView r0 = r1.f630a
            int[] r0 = r0.getDrawableState()
            a.Y0.e(r2, r3, r0)
        Ld:
            return
    }

    public final void b() {
            r6 = this;
            a.mf r0 = r6.b
            r1 = 2
            r2 = 0
            android.widget.TextView r3 = r6.f630a
            if (r0 != 0) goto L14
            a.mf r0 = r6.c
            if (r0 != 0) goto L14
            a.mf r0 = r6.d
            if (r0 != 0) goto L14
            a.mf r0 = r6.e
            if (r0 == 0) goto L36
        L14:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawables()
            r4 = r0[r2]
            a.mf r5 = r6.b
            r6.a(r4, r5)
            r4 = 1
            r4 = r0[r4]
            a.mf r5 = r6.c
            r6.a(r4, r5)
            r4 = r0[r1]
            a.mf r5 = r6.d
            r6.a(r4, r5)
            r4 = 3
            r0 = r0[r4]
            a.mf r4 = r6.e
            r6.a(r0, r4)
        L36:
            a.mf r0 = r6.f
            if (r0 != 0) goto L40
            a.mf r0 = r6.g
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawablesRelative()
            r2 = r0[r2]
            a.mf r3 = r6.f
            r6.a(r2, r3)
            r0 = r0[r1]
            a.mf r1 = r6.g
            r6.a(r0, r1)
            return
    }

    public final android.content.res.ColorStateList d() {
            r1 = this;
            a.mf r0 = r1.h
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f580a
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final android.graphics.PorterDuff.Mode e() {
            r1 = this;
            a.mf r0 = r1.h
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public final void f(android.util.AttributeSet r21, int r22) {
            r20 = this;
            r0 = r20
            r4 = r21
            r6 = r22
            android.widget.TextView r1 = r0.f630a
            android.content.Context r7 = r1.getContext()
            a.Y0 r8 = a.Y0.a()
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTextHelper
            a.of r9 = a.C0306of.e(r7, r4, r2, r6)
            android.content.Context r2 = r1.getContext()
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTextHelper
            android.content.res.TypedArray r5 = r9.b
            a.C0414ug.i(r1, r2, r3, r4, r5, r6)
            r10 = r1
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance
            android.content.res.TypedArray r2 = r9.b
            r11 = -1
            int r1 = r2.getResourceId(r1, r11)
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r3 = r2.hasValue(r3)
            r12 = 0
            if (r3 == 0) goto L40
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            int r3 = r2.getResourceId(r3, r12)
            a.mf r3 = c(r7, r8, r3)
            r0.b = r3
        L40:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L54
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            int r3 = r2.getResourceId(r3, r12)
            a.mf r3 = c(r7, r8, r3)
            r0.c = r3
        L54:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L68
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            int r3 = r2.getResourceId(r3, r12)
            a.mf r3 = c(r7, r8, r3)
            r0.d = r3
        L68:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L7c
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            int r3 = r2.getResourceId(r3, r12)
            a.mf r3 = c(r7, r8, r3)
            r0.e = r3
        L7c:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L90
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            int r3 = r2.getResourceId(r3, r12)
            a.mf r3 = c(r7, r8, r3)
            r0.f = r3
        L90:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto La4
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            int r2 = r2.getResourceId(r3, r12)
            a.mf r2 = c(r7, r8, r2)
            r0.g = r2
        La4:
            r9.f()
            android.text.method.TransformationMethod r2 = r10.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            if (r1 == r11) goto Lf5
            int[] r3 = androidx.appcompat.R.styleable.TextAppearance
            a.of r5 = new a.of
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r1, r3)
            r5.<init>(r7, r1)
            if (r2 != 0) goto Lcc
            int r3 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r3 = r1.hasValue(r3)
            if (r3 == 0) goto Lcc
            int r3 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r3 = r1.getBoolean(r3, r12)
            r14 = 1
            goto Lce
        Lcc:
            r3 = r12
            r14 = r3
        Lce:
            r0.k(r7, r5)
            int r15 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r15 = r1.hasValue(r15)
            if (r15 == 0) goto Le0
            int r15 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            java.lang.String r15 = r1.getString(r15)
            goto Le1
        Le0:
            r15 = 0
        Le1:
            int r13 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r13 = r1.hasValue(r13)
            if (r13 == 0) goto Lf0
            int r13 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r1 = r1.getString(r13)
            goto Lf1
        Lf0:
            r1 = 0
        Lf1:
            r5.f()
            goto Lf9
        Lf5:
            r3 = r12
            r14 = r3
            r1 = 0
            r15 = 0
        Lf9:
            int[] r5 = androidx.appcompat.R.styleable.TextAppearance
            a.of r13 = new a.of
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r4, r5, r6, r12)
            r13.<init>(r7, r5)
            if (r2 != 0) goto L115
            int r9 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r9 = r5.hasValue(r9)
            if (r9 == 0) goto L115
            int r3 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r3 = r5.getBoolean(r3, r12)
            r14 = 1
        L115:
            int r9 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r9 = r5.hasValue(r9)
            if (r9 == 0) goto L123
            int r9 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            java.lang.String r15 = r5.getString(r9)
        L123:
            int r9 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r9 = r5.hasValue(r9)
            if (r9 == 0) goto L131
            int r1 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r1 = r5.getString(r1)
        L131:
            int r9 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r9 = r5.hasValue(r9)
            r12 = 0
            if (r9 == 0) goto L146
            int r9 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            int r5 = r5.getDimensionPixelSize(r9, r11)
            if (r5 != 0) goto L146
            r5 = 0
            r10.setTextSize(r5, r12)
        L146:
            r0.k(r7, r13)
            r13.f()
            if (r2 != 0) goto L153
            if (r14 == 0) goto L153
            r10.setAllCaps(r3)
        L153:
            android.graphics.Typeface r2 = r0.l
            if (r2 == 0) goto L164
            int r3 = r0.k
            if (r3 != r11) goto L161
            int r3 = r0.j
            r10.setTypeface(r2, r3)
            goto L164
        L161:
            r10.setTypeface(r2)
        L164:
            if (r1 == 0) goto L169
            a.C0310p1.c.d(r10, r1)
        L169:
            if (r15 == 0) goto L172
            android.os.LocaleList r1 = a.C0310p1.b.a(r15)
            a.C0310p1.b.b(r10, r1)
        L172:
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            a.s1 r9 = r0.i
            android.content.Context r13 = r9.h
            r14 = 0
            android.content.res.TypedArray r5 = r13.obtainStyledAttributes(r4, r1, r6, r14)
            android.widget.TextView r1 = r9.g
            android.content.Context r2 = r1.getContext()
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTextView
            a.C0414ug.i(r1, r2, r3, r4, r5, r6)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType
            boolean r1 = r5.hasValue(r1)
            if (r1 == 0) goto L198
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType
            int r1 = r5.getInt(r1, r14)
            r9.f676a = r1
        L198:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity
            boolean r1 = r5.hasValue(r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L1a9
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity
            float r1 = r5.getDimension(r1, r2)
            goto L1aa
        L1a9:
            r1 = r2
        L1aa:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize
            boolean r3 = r5.hasValue(r3)
            if (r3 == 0) goto L1b9
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize
            float r3 = r5.getDimension(r3, r2)
            goto L1ba
        L1b9:
            r3 = r2
        L1ba:
            int r6 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize
            boolean r6 = r5.hasValue(r6)
            if (r6 == 0) goto L1c9
            int r6 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize
            float r6 = r5.getDimension(r6, r2)
            goto L1ca
        L1c9:
            r6 = r2
        L1ca:
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes
            boolean r14 = r5.hasValue(r14)
            if (r14 == 0) goto L224
            int r14 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes
            r15 = 0
            int r14 = r5.getResourceId(r14, r15)
            if (r14 <= 0) goto L224
            android.content.res.Resources r15 = r5.getResources()
            android.content.res.TypedArray r14 = r15.obtainTypedArray(r14)
            int r15 = r14.length()
            r18 = r12
            int[] r12 = new int[r15]
            if (r15 <= 0) goto L220
            r2 = 0
        L1ee:
            if (r2 >= r15) goto L1f9
            int r19 = r14.getDimensionPixelSize(r2, r11)
            r12[r2] = r19
            int r2 = r2 + 1
            goto L1ee
        L1f9:
            int[] r2 = a.C0363s1.a(r12)
            r9.e = r2
            int r12 = r2.length
            if (r12 <= 0) goto L204
            r15 = 1
            goto L205
        L204:
            r15 = 0
        L205:
            r9.f = r15
            if (r15 == 0) goto L220
            r15 = 1
            r9.f676a = r15
            r16 = r15
            r17 = 0
            r15 = r2[r17]
            float r15 = (float) r15
            r9.c = r15
            int r12 = r12 + (-1)
            r2 = r2[r12]
            float r2 = (float) r2
            r9.d = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.b = r2
        L220:
            r14.recycle()
            goto L226
        L224:
            r18 = r12
        L226:
            r5.recycle()
            boolean r2 = r9.b()
            r5 = 2
            if (r2 == 0) goto L309
            int r2 = r9.f676a
            r15 = 1
            if (r2 != r15) goto L30c
            boolean r2 = r9.f
            if (r2 != 0) goto L2c7
            android.content.res.Resources r2 = r13.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r13 != 0) goto L24d
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r2)
        L24d:
            int r13 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r13 != 0) goto L257
            r6 = 1121976320(0x42e00000, float:112.0)
            float r6 = android.util.TypedValue.applyDimension(r5, r6, r2)
        L257:
            int r2 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r2 != 0) goto L25d
            r1 = 1065353216(0x3f800000, float:1.0)
        L25d:
            int r2 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            java.lang.String r12 = "px) is less or equal to (0px)"
            if (r2 <= 0) goto L2b0
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L28f
            int r2 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r2 <= 0) goto L278
            r15 = 1
            r9.f676a = r15
            r9.c = r3
            r9.d = r6
            r9.b = r1
            r14 = 0
            r9.f = r14
            goto L2c7
        L278:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The auto-size step granularity ("
            r3.<init>(r4)
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L28f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Maximum auto-size text size ("
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r4 = "px) is less or equal to minimum auto-size text size ("
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = "px)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L2b0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Minimum auto-size text size ("
            r2.<init>(r4)
            r2.append(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L2c7:
            boolean r1 = r9.b()
            if (r1 == 0) goto L30c
            int r1 = r9.f676a
            r15 = 1
            if (r1 != r15) goto L30c
            boolean r1 = r9.f
            if (r1 == 0) goto L2db
            int[] r1 = r9.e
            int r1 = r1.length
            if (r1 != 0) goto L30c
        L2db:
            float r1 = r9.d
            float r2 = r9.c
            float r1 = r1 - r2
            float r2 = r9.b
            float r1 = r1 / r2
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            int r1 = (int) r1
            r16 = 1
            int r1 = r1 + 1
            int[] r2 = new int[r1]
            r3 = 0
        L2f0:
            if (r3 >= r1) goto L302
            float r6 = r9.c
            float r12 = (float) r3
            float r13 = r9.b
            float r12 = r12 * r13
            float r12 = r12 + r6
            int r6 = java.lang.Math.round(r12)
            r2[r3] = r6
            int r3 = r3 + 1
            goto L2f0
        L302:
            int[] r1 = a.C0363s1.a(r2)
            r9.e = r1
            goto L30c
        L309:
            r14 = 0
            r9.f676a = r14
        L30c:
            int r1 = r9.f676a
            if (r1 == 0) goto L33b
            int[] r1 = r9.e
            int r2 = r1.length
            if (r2 <= 0) goto L33b
            int r2 = a.C0310p1.c.a(r10)
            float r2 = (float) r2
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L337
            float r1 = r9.c
            int r1 = java.lang.Math.round(r1)
            float r2 = r9.d
            int r2 = java.lang.Math.round(r2)
            float r3 = r9.b
            int r3 = java.lang.Math.round(r3)
            r14 = 0
            a.C0310p1.c.b(r10, r1, r2, r3, r14)
            goto L33b
        L337:
            r14 = 0
            a.C0310p1.c.c(r10, r1, r14)
        L33b:
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r4, r1)
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat
            int r2 = r1.getResourceId(r2, r11)
            if (r2 == r11) goto L34e
            android.graphics.drawable.Drawable r2 = r8.b(r7, r2)
            goto L34f
        L34e:
            r2 = 0
        L34f:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat
            int r3 = r1.getResourceId(r3, r11)
            if (r3 == r11) goto L35c
            android.graphics.drawable.Drawable r3 = r8.b(r7, r3)
            goto L35d
        L35c:
            r3 = 0
        L35d:
            int r4 = androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat
            int r4 = r1.getResourceId(r4, r11)
            if (r4 == r11) goto L36a
            android.graphics.drawable.Drawable r4 = r8.b(r7, r4)
            goto L36b
        L36a:
            r4 = 0
        L36b:
            int r6 = androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat
            int r6 = r1.getResourceId(r6, r11)
            if (r6 == r11) goto L378
            android.graphics.drawable.Drawable r6 = r8.b(r7, r6)
            goto L379
        L378:
            r6 = 0
        L379:
            int r9 = androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat
            int r9 = r1.getResourceId(r9, r11)
            if (r9 == r11) goto L386
            android.graphics.drawable.Drawable r9 = r8.b(r7, r9)
            goto L387
        L386:
            r9 = 0
        L387:
            int r12 = androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat
            int r12 = r1.getResourceId(r12, r11)
            if (r12 == r11) goto L394
            android.graphics.drawable.Drawable r8 = r8.b(r7, r12)
            goto L395
        L394:
            r8 = 0
        L395:
            r12 = 3
            if (r9 != 0) goto L3e2
            if (r8 == 0) goto L39b
            goto L3e2
        L39b:
            if (r2 != 0) goto L3a3
            if (r3 != 0) goto L3a3
            if (r4 != 0) goto L3a3
            if (r6 == 0) goto L401
        L3a3:
            android.graphics.drawable.Drawable[] r8 = r10.getCompoundDrawablesRelative()
            r17 = 0
            r9 = r8[r17]
            if (r9 != 0) goto L3d0
            r13 = r8[r5]
            if (r13 == 0) goto L3b2
            goto L3d0
        L3b2:
            android.graphics.drawable.Drawable[] r8 = r10.getCompoundDrawables()
            if (r2 == 0) goto L3b9
            goto L3bb
        L3b9:
            r2 = r8[r17]
        L3bb:
            if (r3 == 0) goto L3be
            goto L3c2
        L3be:
            r16 = 1
            r3 = r8[r16]
        L3c2:
            if (r4 == 0) goto L3c5
            goto L3c7
        L3c5:
            r4 = r8[r5]
        L3c7:
            if (r6 == 0) goto L3ca
            goto L3cc
        L3ca:
            r6 = r8[r12]
        L3cc:
            r10.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r6)
            goto L401
        L3d0:
            if (r3 == 0) goto L3d3
            goto L3d7
        L3d3:
            r16 = 1
            r3 = r8[r16]
        L3d7:
            if (r6 == 0) goto L3da
            goto L3dc
        L3da:
            r6 = r8[r12]
        L3dc:
            r2 = r8[r5]
            r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r9, r3, r2, r6)
            goto L401
        L3e2:
            android.graphics.drawable.Drawable[] r2 = r10.getCompoundDrawablesRelative()
            if (r9 == 0) goto L3e9
            goto L3ed
        L3e9:
            r17 = 0
            r9 = r2[r17]
        L3ed:
            if (r3 == 0) goto L3f0
            goto L3f4
        L3f0:
            r16 = 1
            r3 = r2[r16]
        L3f4:
            if (r8 == 0) goto L3f7
            goto L3f9
        L3f7:
            r8 = r2[r5]
        L3f9:
            if (r6 == 0) goto L3fc
            goto L3fe
        L3fc:
            r6 = r2[r12]
        L3fe:
            r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r9, r3, r8, r6)
        L401:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L426
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L41f
            r14 = 0
            int r3 = r1.getResourceId(r2, r14)
            if (r3 == 0) goto L41f
            android.content.res.ColorStateList r3 = a.Y3.a(r7, r3)
            if (r3 == 0) goto L41f
            goto L423
        L41f:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L423:
            a.Ze.a.f(r10, r3)
        L426:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L43c
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            int r2 = r1.getInt(r2, r11)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = a.C0457x5.c(r2, r3)
            a.Ze.a.g(r10, r2)
        L43c:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight
            int r2 = r1.getDimensionPixelSize(r2, r11)
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r3 = r1.getDimensionPixelSize(r3, r11)
            int r4 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            boolean r4 = r1.hasValue(r4)
            if (r4 == 0) goto L46f
            int r4 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            android.util.TypedValue r4 = r1.peekValue(r4)
            if (r4 == 0) goto L466
            int r5 = r4.type
            r6 = 5
            if (r5 != r6) goto L466
            int r4 = r4.data
            r5 = r4 & 15
            float r4 = android.util.TypedValue.complexToFloat(r4)
            goto L472
        L466:
            int r4 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            int r4 = r1.getDimensionPixelSize(r4, r11)
            float r4 = (float) r4
            r5 = r11
            goto L472
        L46f:
            r5 = r11
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L472:
            r1.recycle()
            if (r2 == r11) goto L47d
            a.C0282n9.g(r2)
            a.Ze.b.d(r10, r2)
        L47d:
            if (r3 == r11) goto L4ab
            a.C0282n9.g(r3)
            android.text.TextPaint r1 = r10.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            boolean r2 = r10.getIncludeFontPadding()
            if (r2 == 0) goto L493
            int r1 = r1.bottom
            goto L495
        L493:
            int r1 = r1.descent
        L495:
            int r2 = java.lang.Math.abs(r1)
            if (r3 <= r2) goto L4ab
            int r3 = r3 - r1
            int r1 = r10.getPaddingLeft()
            int r2 = r10.getPaddingTop()
            int r6 = r10.getPaddingRight()
            r10.setPadding(r1, r2, r6, r3)
        L4ab:
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 == 0) goto L4d5
            if (r5 != r11) goto L4b8
            int r1 = (int) r4
            a.Ze.a(r10, r1)
            return
        L4b8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L4c2
            a.Ze.c.a(r10, r5, r4)
            return
        L4c2:
            android.content.res.Resources r1 = r10.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r5, r4, r1)
            int r1 = java.lang.Math.round(r1)
            a.Ze.a(r10, r1)
        L4d5:
            return
    }

    public final void g(android.content.Context r6, int r7) {
            r5 = this;
            int[] r0 = androidx.appcompat.R.styleable.TextAppearance
            a.of r1 = new a.of
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
            r1.<init>(r6, r7)
            int r0 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r0 = r7.hasValue(r0)
            android.widget.TextView r2 = r5.f630a
            r3 = 0
            if (r0 == 0) goto L1f
            int r0 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r0 = r7.getBoolean(r0, r3)
            r2.setAllCaps(r0)
        L1f:
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r0 = r7.hasValue(r0)
            if (r0 == 0) goto L34
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            r4 = -1
            int r0 = r7.getDimensionPixelSize(r0, r4)
            if (r0 != 0) goto L34
            r0 = 0
            r2.setTextSize(r3, r0)
        L34:
            r5.k(r6, r1)
            int r6 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r6 = r7.hasValue(r6)
            if (r6 == 0) goto L4a
            int r6 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r6 = r7.getString(r6)
            if (r6 == 0) goto L4a
            a.C0310p1.c.d(r2, r6)
        L4a:
            r1.f()
            android.graphics.Typeface r6 = r5.l
            if (r6 == 0) goto L56
            int r7 = r5.j
            r2.setTypeface(r6, r7)
        L56:
            return
    }

    public final void i(android.content.res.ColorStateList r2) {
            r1 = this;
            a.mf r0 = r1.h
            if (r0 != 0) goto Lb
            a.mf r0 = new a.mf
            r0.<init>()
            r1.h = r0
        Lb:
            a.mf r0 = r1.h
            r0.f580a = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.d = r2
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            return
    }

    public final void j(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.mf r0 = r1.h
            if (r0 != 0) goto Lb
            a.mf r0 = new a.mf
            r0.<init>()
            r1.h = r0
        Lb:
            a.mf r0 = r1.h
            r0.b = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.c = r2
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            return
    }

    public final void k(android.content.Context r10, a.C0306of r11) {
            r9 = this;
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textStyle
            int r1 = r9.j
            android.content.res.TypedArray r2 = r11.b
            int r0 = r2.getInt(r0, r1)
            r9.j = r0
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textFontWeight
            r1 = -1
            int r0 = r2.getInt(r0, r1)
            r9.k = r0
            r3 = 2
            if (r0 == r1) goto L1d
            int r0 = r9.j
            r0 = r0 & r3
            r9.j = r0
        L1d:
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily
            boolean r0 = r2.hasValue(r0)
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L58
            int r0 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L30
            goto L58
        L30:
            int r10 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            boolean r10 = r2.hasValue(r10)
            if (r10 == 0) goto Ld4
            r9.m = r5
            int r10 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            int r10 = r2.getInt(r10, r4)
            if (r10 == r4) goto L53
            if (r10 == r3) goto L4e
            r11 = 3
            if (r10 == r11) goto L49
            goto Ld4
        L49:
            android.graphics.Typeface r10 = android.graphics.Typeface.MONOSPACE
            r9.l = r10
            return
        L4e:
            android.graphics.Typeface r10 = android.graphics.Typeface.SERIF
            r9.l = r10
            return
        L53:
            android.graphics.Typeface r10 = android.graphics.Typeface.SANS_SERIF
            r9.l = r10
            return
        L58:
            r0 = 0
            r9.l = r0
            int r0 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L66
            int r0 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            goto L68
        L66:
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily
        L68:
            int r6 = r9.k
            int r7 = r9.j
            boolean r10 = r10.isRestricted()
            if (r10 != 0) goto Laa
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            android.widget.TextView r8 = r9.f630a
            r10.<init>(r8)
            a.p1$a r8 = new a.p1$a
            r8.<init>(r9, r6, r7, r10)
            int r10 = r9.j     // Catch: java.lang.Throwable -> Laa
            android.graphics.Typeface r10 = r11.d(r0, r10, r8)     // Catch: java.lang.Throwable -> Laa
            if (r10 == 0) goto La1
            int r11 = r9.k     // Catch: java.lang.Throwable -> Laa
            if (r11 == r1) goto L9f
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r5)     // Catch: java.lang.Throwable -> Laa
            int r11 = r9.k     // Catch: java.lang.Throwable -> Laa
            int r6 = r9.j     // Catch: java.lang.Throwable -> Laa
            r6 = r6 & r3
            if (r6 == 0) goto L97
            r6 = r4
            goto L98
        L97:
            r6 = r5
        L98:
            android.graphics.Typeface r10 = a.C0310p1.d.a(r10, r11, r6)     // Catch: java.lang.Throwable -> Laa
            r9.l = r10     // Catch: java.lang.Throwable -> Laa
            goto La1
        L9f:
            r9.l = r10     // Catch: java.lang.Throwable -> Laa
        La1:
            android.graphics.Typeface r10 = r9.l     // Catch: java.lang.Throwable -> Laa
            if (r10 != 0) goto La7
            r10 = r4
            goto La8
        La7:
            r10 = r5
        La8:
            r9.m = r10     // Catch: java.lang.Throwable -> Laa
        Laa:
            android.graphics.Typeface r10 = r9.l
            if (r10 != 0) goto Ld4
            java.lang.String r10 = r2.getString(r0)
            if (r10 == 0) goto Ld4
            int r11 = r9.k
            if (r11 == r1) goto Lcc
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r5)
            int r11 = r9.k
            int r0 = r9.j
            r0 = r0 & r3
            if (r0 == 0) goto Lc4
            goto Lc5
        Lc4:
            r4 = r5
        Lc5:
            android.graphics.Typeface r10 = a.C0310p1.d.a(r10, r11, r4)
            r9.l = r10
            goto Ld4
        Lcc:
            int r11 = r9.j
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r11)
            r9.l = r10
        Ld4:
            return
    }
}
