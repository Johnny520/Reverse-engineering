package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private androidx.appcompat.widget.TintInfo mDrawableBottomTint;
    private androidx.appcompat.widget.TintInfo mDrawableEndTint;
    private androidx.appcompat.widget.TintInfo mDrawableLeftTint;
    private androidx.appcompat.widget.TintInfo mDrawableRightTint;
    private androidx.appcompat.widget.TintInfo mDrawableStartTint;
    private androidx.appcompat.widget.TintInfo mDrawableTint;
    private androidx.appcompat.widget.TintInfo mDrawableTopTint;
    private android.graphics.Typeface mFontTypeface;
    private int mFontWeight;
    private int mStyle;
    private final android.widget.TextView mView;



    static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.drawable.Drawable[] getCompoundDrawablesRelative(android.widget.TextView r1) {
                android.graphics.drawable.Drawable[] r0 = r1.getCompoundDrawablesRelative()
                return r0
        }

        static void setCompoundDrawablesRelativeWithIntrinsicBounds(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
                r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
                return
        }

        static void setTextLocale(android.widget.TextView r0, java.util.Locale r1) {
                r0.setTextLocale(r1)
                return
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.Locale forLanguageTag(java.lang.String r1) {
                java.util.Locale r0 = java.util.Locale.forLanguageTag(r1)
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.LocaleList forLanguageTags(java.lang.String r1) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r1)
                return r0
        }

        static void setTextLocales(android.widget.TextView r0, android.os.LocaleList r1) {
                r0.setTextLocales(r1)
                return
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getAutoSizeStepGranularity(android.widget.TextView r1) {
                int r0 = r1.getAutoSizeStepGranularity()
                return r0
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
                r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
                return
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView r0, int[] r1, int r2) {
                r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
                return
        }

        static boolean setFontVariationSettings(android.widget.TextView r1, java.lang.String r2) {
                boolean r0 = r1.setFontVariationSettings(r2)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Typeface create(android.graphics.Typeface r1, int r2, boolean r3) {
                android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r2, r3)
                return r0
        }
    }

    AppCompatTextHelper(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mStyle = r0
            r0 = -1
            r2.mFontWeight = r0
            r2.mView = r3
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper
            android.widget.TextView r1 = r2.mView
            r0.<init>(r1)
            r2.mAutoSizeTextHelper = r0
            return
    }

    private void applyCompoundDrawableTint(android.graphics.drawable.Drawable r2, androidx.appcompat.widget.TintInfo r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            android.widget.TextView r0 = r1.mView
            int[] r0 = r0.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r2, r3, r0)
        Ld:
            return
    }

    private static androidx.appcompat.widget.TintInfo createTintInfo(android.content.Context r3, androidx.appcompat.widget.AppCompatDrawableManager r4, int r5) {
            android.content.res.ColorStateList r0 = r4.getTintList(r3, r5)
            if (r0 == 0) goto L11
            androidx.appcompat.widget.TintInfo r1 = new androidx.appcompat.widget.TintInfo
            r1.<init>()
            r2 = 1
            r1.mHasTintList = r2
            r1.mTintList = r0
            return r1
        L11:
            r1 = 0
            return r1
    }

    private void setCompoundDrawables(android.graphics.drawable.Drawable r7, android.graphics.drawable.Drawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.Drawable r10, android.graphics.drawable.Drawable r11, android.graphics.drawable.Drawable r12) {
            r6 = this;
            r0 = 3
            r1 = 1
            r2 = 2
            r3 = 0
            if (r11 != 0) goto L5f
            if (r12 == 0) goto La
            goto L5f
        La:
            if (r7 != 0) goto L15
            if (r8 != 0) goto L15
            if (r9 != 0) goto L15
            if (r10 == 0) goto L13
            goto L15
        L13:
            goto L83
        L15:
            android.widget.TextView r4 = r6.mView
            android.graphics.drawable.Drawable[] r4 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(r4)
            r5 = r4[r3]
            if (r5 != 0) goto L49
            r5 = r4[r2]
            if (r5 == 0) goto L25
            goto L49
        L25:
            android.widget.TextView r4 = r6.mView
            android.graphics.drawable.Drawable[] r4 = r4.getCompoundDrawables()
            android.widget.TextView r5 = r6.mView
            if (r7 == 0) goto L31
            r3 = r7
            goto L33
        L31:
            r3 = r4[r3]
        L33:
            if (r8 == 0) goto L37
            r1 = r8
            goto L39
        L37:
            r1 = r4[r1]
        L39:
            if (r9 == 0) goto L3d
            r2 = r9
            goto L3f
        L3d:
            r2 = r4[r2]
        L3f:
            if (r10 == 0) goto L43
            r0 = r10
            goto L45
        L43:
            r0 = r4[r0]
        L45:
            r5.setCompoundDrawablesWithIntrinsicBounds(r3, r1, r2, r0)
            goto L83
        L49:
            android.widget.TextView r5 = r6.mView
            r3 = r4[r3]
            if (r8 == 0) goto L51
            r1 = r8
            goto L53
        L51:
            r1 = r4[r1]
        L53:
            r2 = r4[r2]
            if (r10 == 0) goto L59
            r0 = r10
            goto L5b
        L59:
            r0 = r4[r0]
        L5b:
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r3, r1, r2, r0)
            return
        L5f:
            android.widget.TextView r4 = r6.mView
            android.graphics.drawable.Drawable[] r4 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(r4)
            android.widget.TextView r5 = r6.mView
            if (r11 == 0) goto L6b
            r3 = r11
            goto L6d
        L6b:
            r3 = r4[r3]
        L6d:
            if (r8 == 0) goto L71
            r1 = r8
            goto L73
        L71:
            r1 = r4[r1]
        L73:
            if (r12 == 0) goto L77
            r2 = r12
            goto L79
        L77:
            r2 = r4[r2]
        L79:
            if (r10 == 0) goto L7d
            r0 = r10
            goto L7f
        L7d:
            r0 = r4[r0]
        L7f:
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r3, r1, r2, r0)
            goto L13
        L83:
            return
    }

    private void setCompoundTints() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableLeftTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableTopTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableRightTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableBottomTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableStartTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableEndTint = r0
            return
    }

    private void setTextSizeInternal(int r2, float r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setTextSizeInternal(r2, r3)
            return
    }

    private void updateTypefaceAndStyle(android.content.Context r14, androidx.appcompat.widget.TintTypedArray r15) {
            r13 = this;
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textStyle
            int r1 = r13.mStyle
            int r0 = r15.getInt(r0, r1)
            r13.mStyle = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r2 = 0
            r3 = 28
            if (r0 < r3) goto L25
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textFontWeight
            int r0 = r15.getInt(r0, r1)
            r13.mFontWeight = r0
            int r0 = r13.mFontWeight
            if (r0 == r1) goto L25
            int r0 = r13.mStyle
            r0 = r0 & 2
            r0 = r0 | r2
            r13.mStyle = r0
        L25:
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_fontFamily
            boolean r0 = r15.hasValue(r0)
            r4 = 1
            if (r0 != 0) goto L5b
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_fontFamily
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L37
            goto L5b
        L37:
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_typeface
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L5a
            r13.mAsyncFontPending = r2
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_typeface
            int r0 = r15.getInt(r0, r4)
            switch(r0) {
                case 1: goto L55;
                case 2: goto L50;
                case 3: goto L4b;
                default: goto L4a;
            }
        L4a:
            goto L5a
        L4b:
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r13.mFontTypeface = r1
            goto L5a
        L50:
            android.graphics.Typeface r1 = android.graphics.Typeface.SERIF
            r13.mFontTypeface = r1
            goto L5a
        L55:
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            r13.mFontTypeface = r1
        L5a:
            return
        L5b:
            r0 = 0
            r13.mFontTypeface = r0
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_fontFamily
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L69
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_fontFamily
            goto L6b
        L69:
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_fontFamily
        L6b:
            int r5 = r13.mFontWeight
            int r6 = r13.mStyle
            boolean r7 = r14.isRestricted()
            if (r7 != 0) goto Lb8
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            android.widget.TextView r8 = r13.mView
            r7.<init>(r8)
            androidx.appcompat.widget.AppCompatTextHelper$1 r8 = new androidx.appcompat.widget.AppCompatTextHelper$1
            r8.<init>(r13, r5, r6, r7)
            int r9 = r13.mStyle     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            android.graphics.Typeface r9 = r15.getFont(r0, r9, r8)     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            if (r9 == 0) goto Lab
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            if (r10 < r3) goto La9
            int r10 = r13.mFontWeight     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            if (r10 == r1) goto La9
        L93:
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r9, r2)     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            int r11 = r13.mFontWeight     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            int r12 = r13.mStyle     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            r12 = r12 & 2
            if (r12 == 0) goto La1
            r12 = r4
            goto La2
        La1:
            r12 = r2
        La2:
            android.graphics.Typeface r10 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r10, r11, r12)     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            r13.mFontTypeface = r10     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            goto Lab
        La9:
            r13.mFontTypeface = r9     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
        Lab:
            android.graphics.Typeface r10 = r13.mFontTypeface     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            if (r10 != 0) goto Lb1
            r10 = r4
            goto Lb2
        Lb1:
            r10 = r2
        Lb2:
            r13.mAsyncFontPending = r10     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            goto Lb8
        Lb5:
            r9 = move-exception
            goto Lb8
        Lb7:
            r9 = move-exception
        Lb8:
            android.graphics.Typeface r7 = r13.mFontTypeface
            if (r7 != 0) goto Le7
            java.lang.String r7 = r15.getString(r0)
            if (r7 == 0) goto Le7
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r3) goto Ldf
            int r3 = r13.mFontWeight
            if (r3 == r1) goto Ldf
        Lcb:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r7, r2)
            int r3 = r13.mFontWeight
            int r8 = r13.mStyle
            r8 = r8 & 2
            if (r8 == 0) goto Ld8
            r2 = r4
        Ld8:
            android.graphics.Typeface r1 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r1, r3, r2)
            r13.mFontTypeface = r1
            goto Le7
        Ldf:
            int r1 = r13.mStyle
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r7, r1)
            r13.mFontTypeface = r1
        Le7:
            return
    }

    void applyCompoundDrawablesTints() {
            r5 = this;
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableLeftTint
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableTopTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableRightTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableBottomTint
            if (r0 == 0) goto L36
        L12:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r2]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableLeftTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 1
            r3 = r0[r3]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableTopTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = r0[r1]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableRightTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 3
            r3 = r0[r3]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableBottomTint
            r5.applyCompoundDrawableTint(r3, r4)
        L36:
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableStartTint
            if (r0 != 0) goto L3f
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableEndTint
            if (r0 == 0) goto L53
        L3f:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.getCompoundDrawablesRelative(r0)
            r2 = r0[r2]
            androidx.appcompat.widget.TintInfo r3 = r5.mDrawableStartTint
            r5.applyCompoundDrawableTint(r2, r3)
            r1 = r0[r1]
            androidx.appcompat.widget.TintInfo r2 = r5.mDrawableEndTint
            r5.applyCompoundDrawableTint(r1, r2)
        L53:
            return
    }

    void autoSizeText() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.autoSizeText()
            return
    }

    int getAutoSizeMaxTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
    }

    int getAutoSizeMinTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
    }

    int getAutoSizeStepGranularity() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
    }

    int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
    }

    int getAutoSizeTextType() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            return r0
    }

    android.content.res.ColorStateList getCompoundDrawableTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L9
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            android.content.res.ColorStateList r0 = r0.mTintList
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L9
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    boolean isAutoSizeEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            boolean r0 = r0.isAutoSizeEnabled()
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r36, int r37) {
            r35 = this;
            r7 = r35
            r8 = r36
            r9 = r37
            android.widget.TextView r0 = r7.mView
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.AppCompatDrawableManager r11 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            int[] r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper
            r12 = 0
            androidx.appcompat.widget.TintTypedArray r13 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r0, r9, r12)
            android.widget.TextView r0 = r7.mView
            android.widget.TextView r1 = r7.mView
            android.content.Context r1 = r1.getContext()
            int[] r2 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper
            android.content.res.TypedArray r4 = r13.getWrappedTypeArray()
            r6 = 0
            r3 = r36
            r5 = r37
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r15 = r13.getResourceId(r0, r14)
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L48
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableLeft
            int r0 = r13.getResourceId(r0, r12)
            androidx.appcompat.widget.TintInfo r0 = createTintInfo(r10, r11, r0)
            r7.mDrawableLeftTint = r0
        L48:
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L5c
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableTop
            int r0 = r13.getResourceId(r0, r12)
            androidx.appcompat.widget.TintInfo r0 = createTintInfo(r10, r11, r0)
            r7.mDrawableTopTint = r0
        L5c:
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L70
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableRight
            int r0 = r13.getResourceId(r0, r12)
            androidx.appcompat.widget.TintInfo r0 = createTintInfo(r10, r11, r0)
            r7.mDrawableRightTint = r0
        L70:
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L84
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableBottom
            int r0 = r13.getResourceId(r0, r12)
            androidx.appcompat.widget.TintInfo r0 = createTintInfo(r10, r11, r0)
            r7.mDrawableBottomTint = r0
        L84:
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L99
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableStart
            int r0 = r13.getResourceId(r0, r12)
            androidx.appcompat.widget.TintInfo r0 = createTintInfo(r10, r11, r0)
            r7.mDrawableStartTint = r0
        L99:
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto Lad
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextHelper_android_drawableEnd
            int r0 = r13.getResourceId(r0, r12)
            androidx.appcompat.widget.TintInfo r0 = createTintInfo(r10, r11, r0)
            r7.mDrawableEndTint = r0
        Lad:
            r13.recycle()
            android.widget.TextView r0 = r7.mView
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r6 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 0
            r1 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
            r16 = 0
            if (r15 == r14) goto Lfe
            int[] r14 = androidx.appcompat.C0015R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r13 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r15, r14)
            if (r6 != 0) goto Ld9
            int r14 = androidx.appcompat.C0015R.styleable.TextAppearance_textAllCaps
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto Ld9
            r1 = 1
            int r14 = androidx.appcompat.C0015R.styleable.TextAppearance_textAllCaps
            boolean r0 = r13.getBoolean(r14, r12)
        Ld9:
            r7.updateTypefaceAndStyle(r10, r13)
            int r14 = androidx.appcompat.C0015R.styleable.TextAppearance_textLocale
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto Led
            int r14 = androidx.appcompat.C0015R.styleable.TextAppearance_textLocale
            java.lang.String r14 = r13.getString(r14)
            r16 = r14
        Led:
            int r14 = androidx.appcompat.C0015R.styleable.TextAppearance_fontVariationSettings
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto Lfb
            int r14 = androidx.appcompat.C0015R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r2 = r13.getString(r14)
        Lfb:
            r13.recycle()
        Lfe:
            int[] r14 = androidx.appcompat.C0015R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r13 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r14, r9, r12)
            if (r6 != 0) goto L119
            int r14 = androidx.appcompat.C0015R.styleable.TextAppearance_textAllCaps
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L119
            r1 = 1
            int r14 = androidx.appcompat.C0015R.styleable.TextAppearance_textAllCaps
            boolean r0 = r13.getBoolean(r14, r12)
            r14 = r0
            r18 = r1
            goto L11c
        L119:
            r14 = r0
            r18 = r1
        L11c:
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_textLocale
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L12b
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_textLocale
            java.lang.String r16 = r13.getString(r0)
        L12b:
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_fontVariationSettings
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L139
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r2 = r13.getString(r0)
        L139:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L156
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textSize
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L156
            int r0 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textSize
            r1 = -1
            int r0 = r13.getDimensionPixelSize(r0, r1)
            if (r0 != 0) goto L156
            android.widget.TextView r0 = r7.mView
            r1 = 0
            r0.setTextSize(r12, r1)
        L156:
            r7.updateTypefaceAndStyle(r10, r13)
            r13.recycle()
            if (r5 == 0) goto L163
            android.widget.TextView r0 = r7.mView
            r0.setTextColor(r5)
        L163:
            if (r4 == 0) goto L16a
            android.widget.TextView r0 = r7.mView
            r0.setHintTextColor(r4)
        L16a:
            if (r3 == 0) goto L171
            android.widget.TextView r0 = r7.mView
            r0.setLinkTextColor(r3)
        L171:
            if (r6 != 0) goto L178
            if (r18 == 0) goto L178
            r7.setAllCaps(r14)
        L178:
            android.graphics.Typeface r0 = r7.mFontTypeface
            if (r0 == 0) goto L192
            int r0 = r7.mFontWeight
            r1 = -1
            if (r0 != r1) goto L18b
            android.widget.TextView r0 = r7.mView
            android.graphics.Typeface r1 = r7.mFontTypeface
            int r12 = r7.mStyle
            r0.setTypeface(r1, r12)
            goto L192
        L18b:
            android.widget.TextView r0 = r7.mView
            android.graphics.Typeface r1 = r7.mFontTypeface
            r0.setTypeface(r1)
        L192:
            if (r2 == 0) goto L199
            android.widget.TextView r0 = r7.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r0, r2)
        L199:
            if (r16 == 0) goto L1a5
        L19c:
            android.widget.TextView r0 = r7.mView
            android.os.LocaleList r1 = androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.forLanguageTags(r16)
            androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.setTextLocales(r0, r1)
        L1a5:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            r0.loadFromAttributes(r8, r9)
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L206
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            if (r0 == 0) goto L1ff
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            int r1 = r0.length
            if (r1 <= 0) goto L1f8
            android.widget.TextView r1 = r7.mView
            int r1 = androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getAutoSizeStepGranularity(r1)
            float r1 = (float) r1
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L1eb
            android.widget.TextView r1 = r7.mView
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r12 = r7.mAutoSizeTextHelper
            int r12 = r12.getAutoSizeMinTextSize()
            r20 = r2
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r2 = r7.mAutoSizeTextHelper
            int r2 = r2.getAutoSizeMaxTextSize()
            r21 = r3
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r3 = r7.mAutoSizeTextHelper
            int r3 = r3.getAutoSizeStepGranularity()
            r22 = r4
            r4 = 0
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(r1, r12, r2, r3, r4)
            goto L20c
        L1eb:
            r20 = r2
            r21 = r3
            r22 = r4
            r4 = 0
            android.widget.TextView r1 = r7.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(r1, r0, r4)
            goto L20c
        L1f8:
            r20 = r2
            r21 = r3
            r22 = r4
            goto L20c
        L1ff:
            r20 = r2
            r21 = r3
            r22 = r4
            goto L20c
        L206:
            r20 = r2
            r21 = r3
            r22 = r4
        L20c:
            int[] r0 = androidx.appcompat.C0015R.styleable.AppCompatTextView
            androidx.appcompat.widget.TintTypedArray r12 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r0)
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r13 = 0
            r19 = r0
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableLeftCompat
            r23 = r1
            r1 = -1
            int r0 = r12.getResourceId(r0, r1)
            if (r0 == r1) goto L22b
            android.graphics.drawable.Drawable r17 = r11.getDrawable(r10, r0)
            r19 = r17
        L22b:
            r24 = r0
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableTopCompat
            int r0 = r12.getResourceId(r0, r1)
            if (r0 == r1) goto L23b
            android.graphics.drawable.Drawable r17 = r11.getDrawable(r10, r0)
            r23 = r17
        L23b:
            r25 = r0
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableRightCompat
            int r0 = r12.getResourceId(r0, r1)
            if (r0 == r1) goto L24c
            android.graphics.drawable.Drawable r2 = r11.getDrawable(r10, r0)
            r26 = r2
            goto L24e
        L24c:
            r26 = r2
        L24e:
            int r2 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableBottomCompat
            int r2 = r12.getResourceId(r2, r1)
            if (r2 == r1) goto L25d
            android.graphics.drawable.Drawable r3 = r11.getDrawable(r10, r2)
            r27 = r3
            goto L25f
        L25d:
            r27 = r3
        L25f:
            int r3 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableStartCompat
            int r3 = r12.getResourceId(r3, r1)
            if (r3 == r1) goto L26e
            android.graphics.drawable.Drawable r4 = r11.getDrawable(r10, r3)
            r28 = r4
            goto L270
        L26e:
            r28 = r4
        L270:
            int r4 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableEndCompat
            int r4 = r12.getResourceId(r4, r1)
            if (r4 == r1) goto L27c
            android.graphics.drawable.Drawable r13 = r11.getDrawable(r10, r4)
        L27c:
            r29 = r0
            r0 = r35
            r1 = r19
            r30 = r2
            r2 = r23
            r31 = r3
            r3 = r26
            r32 = r4
            r4 = r27
            r33 = r5
            r5 = r28
            r34 = r6
            r6 = r13
            r0.setCompoundDrawables(r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableTint
            boolean r0 = r12.hasValue(r0)
            if (r0 == 0) goto L2ab
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableTint
            android.content.res.ColorStateList r0 = r12.getColorStateList(r0)
            android.widget.TextView r1 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintList(r1, r0)
        L2ab:
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableTintMode
            boolean r0 = r12.hasValue(r0)
            if (r0 == 0) goto L2c4
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextView_drawableTintMode
            r1 = -1
            int r0 = r12.getInt(r0, r1)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r0, r1)
            android.widget.TextView r1 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintMode(r1, r0)
        L2c4:
            int r0 = androidx.appcompat.C0015R.styleable.AppCompatTextView_firstBaselineToTopHeight
            r1 = -1
            int r0 = r12.getDimensionPixelSize(r0, r1)
            int r2 = androidx.appcompat.C0015R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r12.getDimensionPixelSize(r2, r1)
            int r3 = androidx.appcompat.C0015R.styleable.AppCompatTextView_lineHeight
            int r3 = r12.getDimensionPixelSize(r3, r1)
            r12.recycle()
            if (r0 == r1) goto L2e1
            android.widget.TextView r4 = r7.mView
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r4, r0)
        L2e1:
            if (r2 == r1) goto L2e8
            android.widget.TextView r4 = r7.mView
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r4, r2)
        L2e8:
            if (r3 == r1) goto L2ef
            android.widget.TextView r1 = r7.mView
            androidx.core.widget.TextViewCompat.setLineHeight(r1, r3)
        L2ef:
            return
    }

    void onAsyncTypefaceReceived(java.lang.ref.WeakReference<android.widget.TextView> r4, android.graphics.Typeface r5) {
            r3 = this;
            boolean r0 = r3.mAsyncFontPending
            if (r0 == 0) goto L24
            r3.mFontTypeface = r5
            java.lang.Object r0 = r4.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L24
            boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            if (r1 == 0) goto L1f
            int r1 = r3.mStyle
            androidx.appcompat.widget.AppCompatTextHelper$2 r2 = new androidx.appcompat.widget.AppCompatTextHelper$2
            r2.<init>(r3, r0, r5, r1)
            r0.post(r2)
            goto L24
        L1f:
            int r1 = r3.mStyle
            r0.setTypeface(r5, r1)
        L24:
            return
    }

    void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 != 0) goto L7
            r1.autoSizeText()
        L7:
            return
    }

    void onSetCompoundDrawables() {
            r0 = this;
            r0.applyCompoundDrawablesTints()
            return
    }

    void onSetTextAppearance(android.content.Context r5, int r6) {
            r4 = this;
            int[] r0 = androidx.appcompat.C0015R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r5, r6, r0)
            int r1 = androidx.appcompat.C0015R.styleable.TextAppearance_textAllCaps
            boolean r1 = r0.hasValue(r1)
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = androidx.appcompat.C0015R.styleable.TextAppearance_textAllCaps
            boolean r1 = r0.getBoolean(r1, r2)
            r4.setAllCaps(r1)
        L18:
            int r1 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textSize
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L30
            int r1 = androidx.appcompat.C0015R.styleable.TextAppearance_android_textSize
            r3 = -1
            int r1 = r0.getDimensionPixelSize(r1, r3)
            if (r1 != 0) goto L30
            android.widget.TextView r1 = r4.mView
            r3 = 0
            r1.setTextSize(r2, r3)
        L30:
            r4.updateTypefaceAndStyle(r5, r0)
            int r1 = androidx.appcompat.C0015R.styleable.TextAppearance_fontVariationSettings
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L48
            int r1 = androidx.appcompat.C0015R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r1 = r0.getString(r1)
            if (r1 == 0) goto L48
            android.widget.TextView r2 = r4.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r2, r1)
        L48:
            r0.recycle()
            android.graphics.Typeface r1 = r4.mFontTypeface
            if (r1 == 0) goto L58
            android.widget.TextView r1 = r4.mView
            android.graphics.Typeface r2 = r4.mFontTypeface
            int r3 = r4.mStyle
            r1.setTypeface(r2, r3)
        L58:
            return
    }

    void populateSurroundingTextIfNeeded(android.widget.TextView r3, android.view.inputmethod.InputConnection r4, android.view.inputmethod.EditorInfo r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Lf
            if (r4 == 0) goto Lf
            java.lang.CharSequence r0 = r3.getText()
            androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(r5, r0)
        Lf:
            return
    }

    void setAllCaps(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.mView
            r0.setAllCaps(r2)
            return
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
    }

    void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeWithDefaults(r2)
            return
    }

    void setCompoundDrawableTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            r0.mTintList = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            if (r3 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.mHasTintList = r1
            r2.setCompoundTints()
            return
    }

    void setCompoundDrawableTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            r0.mTintMode = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            if (r3 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.mHasTintMode = r1
            r2.setCompoundTints()
            return
    }

    void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 != 0) goto Ld
            boolean r0 = r1.isAutoSizeEnabled()
            if (r0 != 0) goto Ld
            r1.setTextSizeInternal(r2, r3)
        Ld:
            return
    }
}
