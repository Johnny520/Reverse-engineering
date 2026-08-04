package yyds;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: yyds.ᲈᛴᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2647 extends Drawable {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Bitmap f13042;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Paint f13043;

    public C2647(Bitmap bitmap) {
        AbstractC2328.m4341(-618346014475118L);
        this.f13042 = bitmap;
        this.f13043 = new Paint(3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC2328.m4341(-618376079246190L);
        canvas.drawBitmap(this.f13042, (Rect) null, new RectF(getBounds()), this.f13043);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f13043.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13043.setColorFilter(colorFilter);
    }
}
