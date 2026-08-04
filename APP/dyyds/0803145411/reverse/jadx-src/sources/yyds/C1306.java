package yyds;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: yyds.ᛶᛳᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1306 extends Drawable {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Bitmap f5971;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f5972;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Paint f5973;

    public C1306(Bitmap bitmap, int i) {
        AbstractC2328.m4341(-690059083416430L);
        this.f5971 = bitmap;
        this.f5972 = i;
        this.f5973 = new Paint(3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC2328.m4341(-690089148187502L);
        Rect bounds = getBounds();
        AbstractC2328.m4341(-690119212958574L);
        RectF rectF = new RectF(bounds);
        int iSave = canvas.save();
        Path path = new Path();
        path.addRoundRect(rectF, new float[]{45.0f, 45.0f, 45.0f, 45.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.clipPath(path);
        Paint paint = this.f5973;
        Bitmap bitmap = this.f5971;
        int i = this.f5972;
        if (i == 1) {
            canvas.drawBitmap(bitmap, (Rect) null, bounds, paint);
        } else if (i == 2) {
            float fMin = Math.min(bounds.width() / bitmap.getWidth(), bounds.height() / bitmap.getHeight());
            float width = bitmap.getWidth() * fMin;
            float height = bitmap.getHeight() * fMin;
            float fWidth = ((bounds.width() - width) / 2.0f) + bounds.left;
            float fHeight = ((bounds.height() - height) / 2.0f) + bounds.top;
            canvas.drawBitmap(bitmap, (Rect) null, new RectF(fWidth, fHeight, width + fWidth, height + fHeight), paint);
        } else if (i != 3) {
            float fMax = Math.max(bounds.width() / bitmap.getWidth(), bounds.height() / bitmap.getHeight());
            float width2 = bitmap.getWidth() * fMax;
            float height2 = bitmap.getHeight() * fMax;
            float fWidth2 = ((bounds.width() - width2) / 2.0f) + bounds.left;
            float fHeight2 = ((bounds.height() - height2) / 2.0f) + bounds.top;
            canvas.drawBitmap(bitmap, (Rect) null, new RectF(fWidth2, fHeight2, width2 + fWidth2, height2 + fHeight2), paint);
        } else {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            canvas.drawRect(rectF, paint);
            paint.setShader(null);
        }
        if (iSave >= 0) {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5973.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5973.setColorFilter(colorFilter);
    }
}
