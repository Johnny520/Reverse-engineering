package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class AppCompatImageHelper {
    private androidx.appcompat.widget.TintInfo mImageTint;
    private androidx.appcompat.widget.TintInfo mInternalImageTint;
    private int mLevel;
    private androidx.appcompat.widget.TintInfo mTmpInfo;
    private final android.widget.ImageView mView;

    public AppCompatImageHelper(android.widget.ImageView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLevel = r0
            r1.mView = r2
            return
    }

    private boolean applyFrameworkTintUsingColorFilter(android.graphics.drawable.Drawable r6) {
            r5 = this;
            androidx.appcompat.widget.TintInfo r0 = r5.mTmpInfo
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r5.mTmpInfo = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r5.mTmpInfo
            r0.clear()
            android.widget.ImageView r1 = r5.mView
            android.content.res.ColorStateList r1 = androidx.core.widget.ImageViewCompat.getImageTintList(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.mHasTintList = r2
            r0.mTintList = r1
        L1d:
            android.widget.ImageView r3 = r5.mView
            android.graphics.PorterDuff$Mode r3 = androidx.core.widget.ImageViewCompat.getImageTintMode(r3)
            if (r3 == 0) goto L29
            r0.mHasTintMode = r2
            r0.mTintMode = r3
        L29:
            boolean r4 = r0.mHasTintList
            if (r4 != 0) goto L34
            boolean r4 = r0.mHasTintMode
            if (r4 == 0) goto L32
            goto L34
        L32:
            r2 = 0
            return r2
        L34:
            android.widget.ImageView r4 = r5.mView
            int[] r4 = r4.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r6, r0, r4)
            return r2
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.appcompat.widget.TintInfo r1 = r2.mInternalImageTint
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    void applyImageLevel() {
            r2 = this;
            android.widget.ImageView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L13
            android.widget.ImageView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            int r1 = r2.mLevel
            r0.setLevel(r1)
        L13:
            return
    }

    void applySupportImageTint() {
            r3 = this;
            android.widget.ImageView r0 = r3.mView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r0)
        Lb:
            if (r0 == 0) goto L39
            boolean r1 = r3.shouldApplyFrameworkTintUsingColorFilter()
            if (r1 == 0) goto L1a
            boolean r1 = r3.applyFrameworkTintUsingColorFilter(r0)
            if (r1 == 0) goto L1a
            return
        L1a:
            androidx.appcompat.widget.TintInfo r1 = r3.mImageTint
            if (r1 == 0) goto L2a
            androidx.appcompat.widget.TintInfo r1 = r3.mImageTint
            android.widget.ImageView r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
            goto L39
        L2a:
            androidx.appcompat.widget.TintInfo r1 = r3.mInternalImageTint
            if (r1 == 0) goto L39
            androidx.appcompat.widget.TintInfo r1 = r3.mInternalImageTint
            android.widget.ImageView r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
        L39:
            return
    }

    android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 == 0) goto L9
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            android.content.res.ColorStateList r0 = r0.mTintList
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            if (r0 == 0) goto L9
            androidx.appcompat.widget.TintInfo r0 = r1.mImageTint
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    boolean hasOverlappingRendering() {
            r2 = this;
            android.widget.ImageView r0 = r2.mView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto Lc
            r1 = 0
            return r1
        Lc:
            r1 = 1
            return r1
    }

    public void loadFromAttributes(android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.widget.ImageView r0 = r8.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.C0015R.styleable.AppCompatImageView
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r9, r1, r10, r2)
            android.widget.ImageView r1 = r8.mView
            android.widget.ImageView r2 = r8.mView
            android.content.Context r2 = r2.getContext()
            int[] r3 = androidx.appcompat.C0015R.styleable.AppCompatImageView
            android.content.res.TypedArray r5 = r0.getWrappedTypeArray()
            r7 = 0
            r4 = r9
            r6 = r10
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            android.widget.ImageView r1 = r8.mView     // Catch: java.lang.Throwable -> L79
            android.graphics.drawable.Drawable r1 = r1.getDrawable()     // Catch: java.lang.Throwable -> L79
            r2 = -1
            if (r1 != 0) goto L44
            int r3 = androidx.appcompat.C0015R.styleable.AppCompatImageView_srcCompat     // Catch: java.lang.Throwable -> L79
            int r3 = r0.getResourceId(r3, r2)     // Catch: java.lang.Throwable -> L79
            if (r3 == r2) goto L44
            android.widget.ImageView r4 = r8.mView     // Catch: java.lang.Throwable -> L79
            android.content.Context r4 = r4.getContext()     // Catch: java.lang.Throwable -> L79
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r4, r3)     // Catch: java.lang.Throwable -> L79
            r1 = r4
            if (r1 == 0) goto L44
            android.widget.ImageView r4 = r8.mView     // Catch: java.lang.Throwable -> L79
            r4.setImageDrawable(r1)     // Catch: java.lang.Throwable -> L79
        L44:
            if (r1 == 0) goto L49
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r1)     // Catch: java.lang.Throwable -> L79
        L49:
            int r3 = androidx.appcompat.C0015R.styleable.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L79
            boolean r3 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L5c
            android.widget.ImageView r3 = r8.mView     // Catch: java.lang.Throwable -> L79
            int r4 = androidx.appcompat.C0015R.styleable.AppCompatImageView_tint     // Catch: java.lang.Throwable -> L79
            android.content.res.ColorStateList r4 = r0.getColorStateList(r4)     // Catch: java.lang.Throwable -> L79
            androidx.core.widget.ImageViewCompat.setImageTintList(r3, r4)     // Catch: java.lang.Throwable -> L79
        L5c:
            int r3 = androidx.appcompat.C0015R.styleable.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L79
            boolean r3 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L74
            android.widget.ImageView r3 = r8.mView     // Catch: java.lang.Throwable -> L79
            int r4 = androidx.appcompat.C0015R.styleable.AppCompatImageView_tintMode     // Catch: java.lang.Throwable -> L79
            int r2 = r0.getInt(r4, r2)     // Catch: java.lang.Throwable -> L79
            r4 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r2, r4)     // Catch: java.lang.Throwable -> L79
            androidx.core.widget.ImageViewCompat.setImageTintMode(r3, r2)     // Catch: java.lang.Throwable -> L79
        L74:
            r0.recycle()
            return
        L79:
            r1 = move-exception
            r0.recycle()
            throw r1
    }

    void obtainLevelFromDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            int r0 = r2.getLevel()
            r1.mLevel = r0
            return
    }

    public void setImageResource(int r3) {
            r2 = this;
            if (r3 == 0) goto L17
            android.widget.ImageView r0 = r2.mView
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r3)
            if (r0 == 0) goto L11
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r0)
        L11:
            android.widget.ImageView r1 = r2.mView
            r1.setImageDrawable(r0)
            goto L1d
        L17:
            android.widget.ImageView r0 = r2.mView
            r1 = 0
            r0.setImageDrawable(r1)
        L1d:
            r2.applySupportImageTint()
            return
    }

    void setInternalImageTint(android.content.res.ColorStateList r3) {
            r2 = this;
            if (r3 == 0) goto L17
            androidx.appcompat.widget.TintInfo r0 = r2.mInternalImageTint
            if (r0 != 0) goto Ld
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mInternalImageTint = r0
        Ld:
            androidx.appcompat.widget.TintInfo r0 = r2.mInternalImageTint
            r0.mTintList = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mInternalImageTint
            r1 = 1
            r0.mHasTintList = r1
            goto L1a
        L17:
            r0 = 0
            r2.mInternalImageTint = r0
        L1a:
            r2.applySupportImageTint()
            return
    }

    void setSupportImageTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            androidx.appcompat.widget.TintInfo r0 = r2.mImageTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mImageTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r2.mImageTint
            r0.mTintList = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mImageTint
            r1 = 1
            r0.mHasTintList = r1
            r2.applySupportImageTint()
            return
    }

    void setSupportImageTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            androidx.appcompat.widget.TintInfo r0 = r2.mImageTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mImageTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r2.mImageTint
            r0.mTintMode = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mImageTint
            r1 = 1
            r0.mHasTintMode = r1
            r2.applySupportImageTint()
            return
    }
}
