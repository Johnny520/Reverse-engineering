package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends android.widget.ImageView {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public p000.s7 f1243;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.widget.ImageView.ScaleType f1244;

    public z2(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r1, r0)
            ۟.s7 r3 = new ۟.s7
            r3.<init>(r2)
            r2.f1243 = r3
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.MATRIX
            super.setScaleType(r3)
            android.widget.ImageView$ScaleType r3 = r2.f1244
            if (r3 == 0) goto L1a
            r2.setScaleType(r3)
            r2.f1244 = r1
        L1a:
            return
    }

    public p000.s7 getAttacher() {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            return r0
    }

    public android.graphics.RectF getDisplayRect() {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            android.graphics.RectF r0 = r0.m398()
            return r0
    }

    @Override // android.widget.ImageView
    public android.graphics.Matrix getImageMatrix() {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            android.graphics.Matrix r0 = r0.f986
            return r0
    }

    public float getMaximumScale() {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            float r0 = r0.f979
            return r0
    }

    public float getMediumScale() {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            float r0 = r0.f978
            return r0
    }

    public float getMinimumScale() {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            float r0 = r0.f977
            return r0
    }

    public float getScale() {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            float r0 = r0.m401()
            return r0
    }

    @Override // android.widget.ImageView
    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            android.widget.ImageView$ScaleType r0 = r0.f997
            return r0
    }

    public void setAllowParentInterceptOnEdge(boolean r2) {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            r0.f980 = r2
            return
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int r1, int r2, int r3, int r4) {
            r0 = this;
            boolean r1 = super.setFrame(r1, r2, r3, r4)
            if (r1 == 0) goto Lb
            ۟.s7 r2 = r0.f1243
            r2.m403()
        Lb:
            return r1
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setImageDrawable(r1)
            ۟.s7 r1 = r0.f1243
            if (r1 == 0) goto La
            r1.m403()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r1) {
            r0 = this;
            super.setImageResource(r1)
            ۟.s7 r1 = r0.f1243
            if (r1 == 0) goto La
            r1.m403()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            ۟.s7 r1 = r0.f1243
            if (r1 == 0) goto La
            r1.m403()
        La:
            return
    }

    public void setMaximumScale(float r4) {
            r3 = this;
            ۟.s7 r0 = r3.f1243
            float r1 = r0.f977
            float r2 = r0.f978
            p000.gc.m176(r1, r2, r4)
            r0.f979 = r4
            return
    }

    public void setMediumScale(float r4) {
            r3 = this;
            ۟.s7 r0 = r3.f1243
            float r1 = r0.f977
            float r2 = r0.f979
            p000.gc.m176(r1, r4, r2)
            r0.f978 = r4
            return
    }

    public void setMinimumScale(float r4) {
            r3 = this;
            ۟.s7 r0 = r3.f1243
            float r1 = r0.f978
            float r2 = r0.f979
            p000.gc.m176(r4, r1, r2)
            r0.f977 = r4
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            r0.f991 = r2
            return
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r2) {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            android.view.GestureDetector r0 = r0.f983
            r0.setOnDoubleTapListener(r2)
            return
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            r0.f992 = r2
            return
    }

    public void setOnMatrixChangeListener(p000.z6 r1) {
            r0 = this;
            ۟.s7 r1 = r0.f1243
            r1.getClass()
            return
    }

    public void setOnOutsidePhotoTapListener(p000.a7 r1) {
            r0 = this;
            ۟.s7 r1 = r0.f1243
            r1.getClass()
            return
    }

    public void setOnPhotoTapListener(p000.b7 r1) {
            r0 = this;
            ۟.s7 r1 = r0.f1243
            r1.getClass()
            return
    }

    public void setOnScaleChangeListener(p000.c7 r1) {
            r0 = this;
            ۟.s7 r1 = r0.f1243
            r1.getClass()
            return
    }

    public void setOnSingleFlingListener(p000.d7 r1) {
            r0 = this;
            ۟.s7 r1 = r0.f1243
            r1.getClass()
            return
    }

    public void setOnViewDragListener(p000.e7 r1) {
            r0 = this;
            ۟.s7 r1 = r0.f1243
            r1.getClass()
            return
    }

    public void setOnViewTapListener(p000.f7 r2) {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            r0.f990 = r2
            return
    }

    public void setRotationBy(float r4) {
            r3 = this;
            ۟.s7 r0 = r3.f1243
            android.graphics.Matrix r1 = r0.f987
            r2 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 % r2
            r1.postRotate(r4)
            r0.m396()
            return
    }

    public void setRotationTo(float r4) {
            r3 = this;
            ۟.s7 r0 = r3.f1243
            android.graphics.Matrix r1 = r0.f987
            r2 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 % r2
            r1.setRotate(r4)
            r0.m396()
            return
    }

    public void setScale(float r5) {
            r4 = this;
            ۟.s7 r0 = r4.f1243
            android.widget.ImageView r1 = r0.f982
            int r1 = r1.getRight()
            int r1 = r1 / 2
            float r1 = (float) r1
            android.widget.ImageView r2 = r0.f982
            int r2 = r2.getBottom()
            int r2 = r2 / 2
            float r2 = (float) r2
            r3 = 0
            r0.m402(r5, r1, r2, r3)
            return
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType r4) {
            r3 = this;
            ۟.s7 r0 = r3.f1243
            if (r0 != 0) goto L7
            r3.f1244 = r4
            goto L25
        L7:
            r0.getClass()
            if (r4 != 0) goto Le
            r1 = 0
            goto L1a
        Le:
            int[] r1 = ۟.gc.a.f422
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L26
            r1 = r2
        L1a:
            if (r1 == 0) goto L25
            android.widget.ImageView$ScaleType r1 = r0.f997
            if (r4 == r1) goto L25
            r0.f997 = r4
            r0.m403()
        L25:
            return
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Matrix scale type is not supported"
            r4.<init>(r0)
            throw r4
    }

    public void setZoomTransitionDuration(int r2) {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            r0.f976 = r2
            return
    }

    public void setZoomable(boolean r2) {
            r1 = this;
            ۟.s7 r0 = r1.f1243
            r0.f996 = r2
            r0.m403()
            return
    }
}
