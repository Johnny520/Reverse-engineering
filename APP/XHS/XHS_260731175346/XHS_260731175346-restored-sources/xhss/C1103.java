package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲈᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1103 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f3551;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final android.graphics.Paint f3552;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final android.graphics.Matrix f3553;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.graphics.Bitmap f3554;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public boolean f3555;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final android.graphics.RectF f3556;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final int f3557;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final android.graphics.Rect f3558;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final android.graphics.BitmapShader f3559;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public float f3560;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final int f3561;

    public C1103(android.content.res.Resources r3, android.graphics.Bitmap r4) {
            r2 = this;
            r2.<init>()
            r0 = 119(0x77, float:1.67E-43)
            r2.f3551 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 3
            r0.<init>(r1)
            r2.f3552 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f3553 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f3558 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.f3556 = r0
            r0 = 1
            r2.f3555 = r0
            if (r3 == 0) goto L30
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.densityDpi
            goto L32
        L30:
            r3 = 160(0xa0, float:2.24E-43)
        L32:
            r2.f3554 = r4
            if (r4 == 0) goto L4c
            int r0 = r4.getScaledWidth(r3)
            r2.f3557 = r0
            int r3 = r4.getScaledHeight(r3)
            r2.f3561 = r3
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r4, r0, r0)
            r2.f3559 = r3
            return
        L4c:
            r3 = -1
            r2.f3561 = r3
            r2.f3557 = r3
            r3 = 0
            r2.f3559 = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r4) {
            r3 = this;
            android.graphics.Bitmap r0 = r3.f3554
            if (r0 != 0) goto L5
            return
        L5:
            r3.m1792()
            android.graphics.Paint r1 = r3.f3552
            android.graphics.Shader r2 = r1.getShader()
            if (r2 != 0) goto L17
            r2 = 0
            android.graphics.Rect r3 = r3.f3558
            r4.drawBitmap(r0, r2, r3, r1)
            return
        L17:
            android.graphics.RectF r0 = r3.f3556
            float r3 = r3.f3560
            r4.drawRoundRect(r0, r3, r3, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r0 = this;
            android.graphics.Paint r0 = r0.f3552
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r0 = this;
            android.graphics.Paint r0 = r0.f3552
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r0 = this;
            int r0 = r0.f3561
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r0 = this;
            int r0 = r0.f3557
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r3 = this;
            int r0 = r3.f3551
            r1 = 119(0x77, float:1.67E-43)
            r2 = -3
            if (r0 != r1) goto L27
            android.graphics.Bitmap r0 = r3.f3554
            if (r0 == 0) goto L27
            boolean r0 = r0.hasAlpha()
            if (r0 != 0) goto L27
            android.graphics.Paint r0 = r3.f3552
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 < r1) goto L27
            float r3 = r3.f3560
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L25
            return r2
        L25:
            r3 = -1
            return r3
        L27:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline r2) {
            r1 = this;
            r1.m1792()
            android.graphics.Rect r0 = r1.f3558
            float r1 = r1.f3560
            r2.setRoundRect(r0, r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r1 = 1
            r0.f3555 = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.f3552
            int r1 = r0.getAlpha()
            if (r3 == r1) goto Le
            r0.setAlpha(r3)
            r2.invalidateSelf()
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f3552
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f3552
            r0.setDither(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f3552
            r0.setFilterBitmap(r2)
            r1.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1792() {
            r7 = this;
            boolean r0 = r7.f3555
            if (r0 == 0) goto L4a
            android.graphics.Rect r4 = r7.getBounds()
            r6 = 0
            int r1 = r7.f3551
            int r2 = r7.f3557
            int r3 = r7.f3561
            android.graphics.Rect r5 = r7.f3558
            android.view.Gravity.apply(r1, r2, r3, r4, r5, r6)
            android.graphics.RectF r0 = r7.f3556
            r0.set(r5)
            android.graphics.BitmapShader r1 = r7.f3559
            if (r1 == 0) goto L47
            float r2 = r0.left
            float r3 = r0.top
            android.graphics.Matrix r4 = r7.f3553
            r4.setTranslate(r2, r3)
            float r2 = r0.width()
            android.graphics.Bitmap r3 = r7.f3554
            int r5 = r3.getWidth()
            float r5 = (float) r5
            float r2 = r2 / r5
            float r0 = r0.height()
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            r4.preScale(r2, r0)
            r1.setLocalMatrix(r4)
            android.graphics.Paint r0 = r7.f3552
            r0.setShader(r1)
        L47:
            r0 = 0
            r7.f3555 = r0
        L4a:
            return
    }
}
