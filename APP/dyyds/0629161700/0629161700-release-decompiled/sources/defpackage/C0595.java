package defpackage;

/* JADX INFO: renamed from: ᛳᲈᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0595 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Paint f2971;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.graphics.Bitmap f2972;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f2973;

    public C0595(android.graphics.Bitmap r3, int r4) {
            r2 = this;
            r0 = -439238000025134(0xfffe7083ef0961d2, double:NaN)
            r2.<init>()
            r2.f2972 = r3
            r2.f2973 = r4
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 3
            r3.<init>(r4)
            r2.f2971 = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r10) {
            r9 = this;
            r0 = -439268064796206(0xfffe707cef0961d2, double:NaN)
            android.graphics.Rect r0 = r9.getBounds()
            r1 = -439298129567278(0xfffe7075ef0961d2, double:NaN)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r0)
            int r2 = r10.save()
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r4 = 8
            float[] r4 = new float[r4]
            r4 = {x00ec: FILL_ARRAY_DATA , data: [1110704128, 1110704128, 1110704128, 1110704128, 0, 0, 0, 0} // fill-array
            android.graphics.Path$Direction r5 = android.graphics.Path.Direction.CW
            r3.addRoundRect(r1, r4, r5)
            r10.clipPath(r3)
            r3 = 1
            r4 = 0
            android.graphics.Paint r5 = r9.f2971
            android.graphics.Bitmap r6 = r9.f2972
            int r9 = r9.f2973
            if (r9 == r3) goto Le2
            r3 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r9 == r3) goto L9b
            r3 = 3
            if (r9 == r3) goto L8a
            int r9 = r0.width()
            float r9 = (float) r9
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r9 = r9 / r1
            int r1 = r0.height()
            float r1 = (float) r1
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r9 = java.lang.Math.max(r9, r1)
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r9
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r3 * r9
            int r9 = r0.left
            float r9 = (float) r9
            int r8 = r0.width()
            float r8 = (float) r8
            float r8 = r8 - r1
            float r8 = r8 / r7
            float r8 = r8 + r9
            int r9 = r0.top
            float r9 = (float) r9
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 - r3
            float r0 = r0 / r7
            float r0 = r0 + r9
            android.graphics.RectF r9 = new android.graphics.RectF
            float r1 = r1 + r8
            float r3 = r3 + r0
            r9.<init>(r8, r0, r1, r3)
            r10.drawBitmap(r6, r4, r9, r5)
            goto Le5
        L8a:
            android.graphics.BitmapShader r9 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
            r9.<init>(r6, r0, r0)
            r5.setShader(r9)
            r10.drawRect(r1, r5)
            r5.setShader(r4)
            goto Le5
        L9b:
            int r9 = r0.width()
            float r9 = (float) r9
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r9 = r9 / r1
            int r1 = r0.height()
            float r1 = (float) r1
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r9 = java.lang.Math.min(r9, r1)
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r9
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r3 * r9
            int r9 = r0.left
            float r9 = (float) r9
            int r8 = r0.width()
            float r8 = (float) r8
            float r8 = r8 - r1
            float r8 = r8 / r7
            float r8 = r8 + r9
            int r9 = r0.top
            float r9 = (float) r9
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 - r3
            float r0 = r0 / r7
            float r0 = r0 + r9
            android.graphics.RectF r9 = new android.graphics.RectF
            float r1 = r1 + r8
            float r3 = r3 + r0
            r9.<init>(r8, r0, r1, r3)
            r10.drawBitmap(r6, r4, r9, r5)
            goto Le5
        Le2:
            r10.drawBitmap(r6, r4, r0, r5)
        Le5:
            if (r2 < 0) goto Lea
            r10.restoreToCount(r2)
        Lea:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            android.graphics.Paint r0 = r0.f2971
            r0.setAlpha(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            android.graphics.Paint r0 = r0.f2971
            r0.setColorFilter(r1)
            return
    }
}
