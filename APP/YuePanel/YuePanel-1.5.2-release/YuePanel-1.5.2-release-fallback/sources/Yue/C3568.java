package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3568 extends androidx.constraintlayout.widget.AbstractC7457 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final java.lang.String f11360 = "Layer";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float f11361;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float f11362;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f11363;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public androidx.constraintlayout.widget.ConstraintLayout f11364;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float f11365;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float f11366;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public float f11367;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public float f11368;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f11369;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public float f11370;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public float f11371;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public float f11372;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean f11373;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public android.view.View[] f11374;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public float f11375;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public float f11376;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public boolean f11377;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public boolean f11378;

    public C3568(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 2143289344(0x7fc00000, float:NaN)
            r1.f11361 = r2
            r1.f11362 = r2
            r1.f11363 = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f11365 = r0
            r1.f11366 = r0
            r1.f11367 = r2
            r1.f11368 = r2
            r1.f11369 = r2
            r1.f11370 = r2
            r1.f11371 = r2
            r1.f11372 = r2
            r2 = 1
            r1.f11373 = r2
            r2 = 0
            r1.f11374 = r2
            r2 = 0
            r1.f11375 = r2
            r1.f11376 = r2
            return
    }

    public C3568(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.f11361 = r1
            r0.f11362 = r1
            r0.f11363 = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.f11365 = r2
            r0.f11366 = r2
            r0.f11367 = r1
            r0.f11368 = r1
            r0.f11369 = r1
            r0.f11370 = r1
            r0.f11371 = r1
            r0.f11372 = r1
            r1 = 1
            r0.f11373 = r1
            r1 = 0
            r0.f11374 = r1
            r1 = 0
            r0.f11375 = r1
            r0.f11376 = r1
            return
    }

    public C3568(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.f11361 = r1
            r0.f11362 = r1
            r0.f11363 = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.f11365 = r2
            r0.f11366 = r2
            r0.f11367 = r1
            r0.f11368 = r1
            r0.f11369 = r1
            r0.f11370 = r1
            r0.f11371 = r1
            r0.f11372 = r1
            r1 = 1
            r0.f11373 = r1
            r1 = 0
            r0.f11374 = r1
            r1 = 0
            r0.f11375 = r1
            r0.f11376 = r1
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457, android.view.View
    public void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r5.f11364 = r0
            boolean r0 = r5.f11377
            if (r0 != 0) goto L13
            boolean r0 = r5.f11378
            if (r0 == 0) goto L47
        L13:
            int r0 = r5.getVisibility()
            float r1 = r5.getElevation()
            r2 = 0
        L1c:
            int r3 = r5.f26078
            if (r2 >= r3) goto L47
            int[] r3 = r5.f26077
            r3 = r3[r2]
            androidx.constraintlayout.widget.ConstraintLayout r4 = r5.f11364
            android.view.View r3 = r4.getViewById(r3)
            if (r3 == 0) goto L44
            boolean r4 = r5.f11377
            if (r4 == 0) goto L33
            r3.setVisibility(r0)
        L33:
            boolean r4 = r5.f11378
            if (r4 == 0) goto L44
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r4 = r3.getTranslationZ()
            float r4 = r4 + r1
            r3.setTranslationZ(r4)
        L44:
            int r2 = r2 + 1
            goto L1c
        L47:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            r0.m28531()
            return
    }

    @Override // android.view.View
    public void setPivotX(float r1) {
            r0 = this;
            r0.f11361 = r1
            r0.m14496()
            return
    }

    @Override // android.view.View
    public void setPivotY(float r1) {
            r0 = this;
            r0.f11362 = r1
            r0.m14496()
            return
    }

    @Override // android.view.View
    public void setRotation(float r1) {
            r0 = this;
            r0.f11363 = r1
            r0.m14496()
            return
    }

    @Override // android.view.View
    public void setScaleX(float r1) {
            r0 = this;
            r0.f11365 = r1
            r0.m14496()
            return
    }

    @Override // android.view.View
    public void setScaleY(float r1) {
            r0 = this;
            r0.f11366 = r1
            r0.m14496()
            return
    }

    @Override // android.view.View
    public void setTranslationX(float r1) {
            r0 = this;
            r0.f11375 = r1
            r0.m14496()
            return
    }

    @Override // android.view.View
    public void setTranslationY(float r1) {
            r0 = this;
            r0.f11376 = r1
            r0.m14496()
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            r0.m28531()
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo14491(android.util.AttributeSet r6) {
            r5 = this;
            super.mo14491(r6)
            r0 = 0
            r5.f26081 = r0
            if (r6 == 0) goto L30
            android.content.Context r1 = r5.getContext()
            int[] r2 = androidx.constraintlayout.widget.C7473.C7486.f28216
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r6, r2)
            int r1 = r6.getIndexCount()
        L16:
            if (r0 >= r1) goto L2d
            int r2 = r6.getIndex(r0)
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28223
            r4 = 1
            if (r2 != r3) goto L24
            r5.f11377 = r4
            goto L2a
        L24:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28230
            if (r2 != r3) goto L2a
            r5.f11378 = r4
        L2a:
            int r0 = r0 + 1
            goto L16
        L2d:
            r6.recycle()
        L30:
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo14492(androidx.constraintlayout.widget.ConstraintLayout r5) {
            r4 = this;
            r4.m14495()
            r5 = 2143289344(0x7fc00000, float:NaN)
            r4.f11367 = r5
            r4.f11368 = r5
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r5 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r5
            Yue.ۥ۟ۧ۟ۢ r5 = r5.m28503()
            r0 = 0
            r5.m7618(r0)
            r5.m7588(r0)
            r4.m14494()
            float r5 = r4.f11371
            int r5 = (int) r5
            int r0 = r4.getPaddingLeft()
            int r5 = r5 - r0
            float r0 = r4.f11372
            int r0 = (int) r0
            int r1 = r4.getPaddingTop()
            int r0 = r0 - r1
            float r1 = r4.f11369
            int r1 = (int) r1
            int r2 = r4.getPaddingRight()
            int r1 = r1 + r2
            float r2 = r4.f11370
            int r2 = (int) r2
            int r3 = r4.getPaddingBottom()
            int r2 = r2 + r3
            r4.layout(r5, r0, r1, r2)
            r4.m14496()
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void mo14493(androidx.constraintlayout.widget.ConstraintLayout r2) {
            r1 = this;
            r1.f11364 = r2
            float r2 = r1.getRotation()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L16
            float r0 = r1.f11363
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L18
            r1.f11363 = r2
            goto L18
        L16:
            r1.f11363 = r2
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m14494() {
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.f11364
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r8.f11373
            if (r0 != 0) goto L1a
            float r0 = r8.f11367
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            float r0 = r8.f11368
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            return
        L1a:
            float r0 = r8.f11361
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L35
            float r0 = r8.f11362
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L2b
            goto L35
        L2b:
            float r0 = r8.f11362
            r8.f11368 = r0
            float r0 = r8.f11361
            r8.f11367 = r0
            goto Laf
        L35:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.f11364
            android.view.View[] r0 = r8.m28536(r0)
            r1 = 0
            r2 = r0[r1]
            int r2 = r2.getLeft()
            r3 = r0[r1]
            int r3 = r3.getTop()
            r4 = r0[r1]
            int r4 = r4.getRight()
            r5 = r0[r1]
            int r5 = r5.getBottom()
        L54:
            int r6 = r8.f26078
            if (r1 >= r6) goto L7d
            r6 = r0[r1]
            int r7 = r6.getLeft()
            int r2 = java.lang.Math.min(r2, r7)
            int r7 = r6.getTop()
            int r3 = java.lang.Math.min(r3, r7)
            int r7 = r6.getRight()
            int r4 = java.lang.Math.max(r4, r7)
            int r6 = r6.getBottom()
            int r5 = java.lang.Math.max(r5, r6)
            int r1 = r1 + 1
            goto L54
        L7d:
            float r0 = (float) r4
            r8.f11369 = r0
            float r0 = (float) r5
            r8.f11370 = r0
            float r0 = (float) r2
            r8.f11371 = r0
            float r0 = (float) r3
            r8.f11372 = r0
            float r0 = r8.f11361
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L98
            int r2 = r2 + r4
            int r2 = r2 / 2
            float r0 = (float) r2
            r8.f11367 = r0
            goto L9c
        L98:
            float r0 = r8.f11361
            r8.f11367 = r0
        L9c:
            float r0 = r8.f11362
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto Lab
            int r3 = r3 + r5
            int r3 = r3 / 2
            float r0 = (float) r3
            r8.f11368 = r0
            goto Laf
        Lab:
            float r0 = r8.f11362
            r8.f11368 = r0
        Laf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m14495() {
            r4 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.f11364
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r4.f26078
            if (r0 != 0) goto La
            return
        La:
            android.view.View[] r1 = r4.f11374
            if (r1 == 0) goto L11
            int r1 = r1.length
            if (r1 == r0) goto L15
        L11:
            android.view.View[] r0 = new android.view.View[r0]
            r4.f11374 = r0
        L15:
            r0 = 0
        L16:
            int r1 = r4.f26078
            if (r0 >= r1) goto L2b
            int[] r1 = r4.f26077
            r1 = r1[r0]
            android.view.View[] r2 = r4.f11374
            androidx.constraintlayout.widget.ConstraintLayout r3 = r4.f11364
            android.view.View r1 = r3.getViewById(r1)
            r2[r0] = r1
            int r0 = r0 + 1
            goto L16
        L2b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m14496() {
            r10 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.f11364
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View[] r0 = r10.f11374
            if (r0 != 0) goto Lc
            r10.m14495()
        Lc:
            r10.m14494()
            float r0 = r10.f11363
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L1a
            r0 = 0
            goto L21
        L1a:
            float r0 = r10.f11363
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
        L21:
            double r2 = java.lang.Math.sin(r0)
            float r2 = (float) r2
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            float r1 = r10.f11365
            float r3 = r1 * r0
            float r4 = r10.f11366
            float r5 = -r4
            float r5 = r5 * r2
            float r1 = r1 * r2
            float r4 = r4 * r0
            r0 = 0
        L36:
            int r2 = r10.f26078
            if (r0 >= r2) goto L8d
            android.view.View[] r2 = r10.f11374
            r2 = r2[r0]
            int r6 = r2.getLeft()
            int r7 = r2.getRight()
            int r6 = r6 + r7
            int r6 = r6 / 2
            int r7 = r2.getTop()
            int r8 = r2.getBottom()
            int r7 = r7 + r8
            int r7 = r7 / 2
            float r6 = (float) r6
            float r8 = r10.f11367
            float r6 = r6 - r8
            float r7 = (float) r7
            float r8 = r10.f11368
            float r7 = r7 - r8
            float r8 = r3 * r6
            float r9 = r5 * r7
            float r8 = r8 + r9
            float r8 = r8 - r6
            float r9 = r10.f11375
            float r8 = r8 + r9
            float r6 = r6 * r1
            float r9 = r4 * r7
            float r6 = r6 + r9
            float r6 = r6 - r7
            float r7 = r10.f11376
            float r6 = r6 + r7
            r2.setTranslationX(r8)
            r2.setTranslationY(r6)
            float r6 = r10.f11366
            r2.setScaleY(r6)
            float r6 = r10.f11365
            r2.setScaleX(r6)
            float r6 = r10.f11363
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L8a
            float r6 = r10.f11363
            r2.setRotation(r6)
        L8a:
            int r0 = r0 + 1
            goto L36
        L8d:
            return
    }
}
