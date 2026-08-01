package defpackage;

/* JADX INFO: renamed from: ᛳᲇᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0571 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.graphics.Bitmap f2837;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Paint f2838;

    public C0571(android.graphics.Bitmap r3) {
            r2 = this;
            r0 = -411913418087982(0xfffe895def0961d2, double:NaN)
            r2.<init>()
            r2.f2837 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r0 = 3
            r3.<init>(r0)
            r2.f2838 = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r4) {
            r3 = this;
            r0 = -411943482859054(0xfffe8956ef0961d2, double:NaN)
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.Rect r1 = r3.getBounds()
            r0.<init>(r1)
            android.graphics.Paint r1 = r3.f2838
            android.graphics.Bitmap r3 = r3.f2837
            r2 = 0
            r4.drawBitmap(r3, r2, r0, r1)
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
            android.graphics.Paint r0 = r0.f2838
            r0.setAlpha(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            android.graphics.Paint r0 = r0.f2838
            r0.setColorFilter(r1)
            return
    }
}
