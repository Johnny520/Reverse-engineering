package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
class AppCompatCheckedTextViewHelper {
    private android.content.res.ColorStateList mCheckMarkTintList;
    private android.graphics.PorterDuff.Mode mCheckMarkTintMode;
    private boolean mHasCheckMarkTint;
    private boolean mHasCheckMarkTintMode;
    private boolean mSkipNextApply;
    private final android.widget.CheckedTextView mView;

    AppCompatCheckedTextViewHelper(android.widget.CheckedTextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCheckMarkTintList = r0
            r1.mCheckMarkTintMode = r0
            r0 = 0
            r1.mHasCheckMarkTint = r0
            r1.mHasCheckMarkTintMode = r0
            r1.mView = r2
            return
    }

    void applyCheckMarkTint() {
            r2 = this;
            android.widget.CheckedTextView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CheckedTextViewCompat.getCheckMarkDrawable(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.mHasCheckMarkTint
            if (r1 != 0) goto L10
            boolean r1 = r2.mHasCheckMarkTintMode
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.mHasCheckMarkTint
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.mCheckMarkTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L21:
            boolean r1 = r2.mHasCheckMarkTintMode
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.mCheckMarkTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CheckedTextView r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CheckedTextView r1 = r2.mView
            r1.setCheckMarkDrawable(r0)
        L3e:
            return
    }

    android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mCheckMarkTintList
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mCheckMarkTintMode
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r11, int r12) {
            r10 = this;
            android.widget.CheckedTextView r0 = r10.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.C0015R.styleable.CheckedTextView
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.mView
            android.widget.CheckedTextView r1 = r10.mView
            android.content.Context r4 = r1.getContext()
            int[] r5 = androidx.appcompat.C0015R.styleable.CheckedTextView
            android.content.res.TypedArray r7 = r0.getWrappedTypeArray()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            int r3 = androidx.appcompat.C0015R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L96
            boolean r3 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L96
            if (r3 == 0) goto L44
            int r3 = androidx.appcompat.C0015R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L96
            int r3 = r0.getResourceId(r3, r2)     // Catch: java.lang.Throwable -> L96
            if (r3 == 0) goto L44
            android.widget.CheckedTextView r4 = r10.mView     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            android.widget.CheckedTextView r5 = r10.mView     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            android.content.Context r5 = r5.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            android.graphics.drawable.Drawable r5 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r5, r3)     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            r4.setCheckMarkDrawable(r5)     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            r1 = 1
            goto L44
        L43:
            r4 = move-exception
        L44:
            if (r1 != 0) goto L65
            int r3 = androidx.appcompat.C0015R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L96
            boolean r3 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L96
            if (r3 == 0) goto L65
            int r3 = androidx.appcompat.C0015R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L96
            int r2 = r0.getResourceId(r3, r2)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L65
            android.widget.CheckedTextView r3 = r10.mView     // Catch: java.lang.Throwable -> L96
            android.widget.CheckedTextView r4 = r10.mView     // Catch: java.lang.Throwable -> L96
            android.content.Context r4 = r4.getContext()     // Catch: java.lang.Throwable -> L96
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r4, r2)     // Catch: java.lang.Throwable -> L96
            r3.setCheckMarkDrawable(r4)     // Catch: java.lang.Throwable -> L96
        L65:
            int r2 = androidx.appcompat.C0015R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L96
            boolean r2 = r0.hasValue(r2)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L78
            android.widget.CheckedTextView r2 = r10.mView     // Catch: java.lang.Throwable -> L96
            int r3 = androidx.appcompat.C0015R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L96
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)     // Catch: java.lang.Throwable -> L96
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintList(r2, r3)     // Catch: java.lang.Throwable -> L96
        L78:
            int r2 = androidx.appcompat.C0015R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L96
            boolean r2 = r0.hasValue(r2)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L91
            android.widget.CheckedTextView r2 = r10.mView     // Catch: java.lang.Throwable -> L96
            int r3 = androidx.appcompat.C0015R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L96
            r4 = -1
            int r3 = r0.getInt(r3, r4)     // Catch: java.lang.Throwable -> L96
            r4 = 0
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r3, r4)     // Catch: java.lang.Throwable -> L96
            androidx.core.widget.CheckedTextViewCompat.setCheckMarkTintMode(r2, r3)     // Catch: java.lang.Throwable -> L96
        L91:
            r0.recycle()
            return
        L96:
            r1 = move-exception
            r0.recycle()
            throw r1
    }

    void onSetCheckMarkDrawable() {
            r1 = this;
            boolean r0 = r1.mSkipNextApply
            if (r0 == 0) goto L8
            r0 = 0
            r1.mSkipNextApply = r0
            return
        L8:
            r0 = 1
            r1.mSkipNextApply = r0
            r1.applyCheckMarkTint()
            return
    }

    void setSupportCheckMarkTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mCheckMarkTintList = r2
            r0 = 1
            r1.mHasCheckMarkTint = r0
            r1.applyCheckMarkTint()
            return
    }

    void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.mCheckMarkTintMode = r2
            r0 = 1
            r1.mHasCheckMarkTintMode = r0
            r1.applyCheckMarkTint()
            return
    }
}
