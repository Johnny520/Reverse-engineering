package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᲁᲀᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2317 extends Drawable {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Paint f11363;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f11364;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f11365;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Path f11366 = new Path();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Matrix f11362 = new Matrix();

    public C2317(Context context) {
        Paint paint = new Paint();
        this.f11363 = paint;
        paint.setAntiAlias(true);
        paint.setColor(AbstractC0395.m1132(context, R.attr.colorControlActivated));
        paint.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.f11364 = resources.getDimensionPixelOffset(R.dimen.afs_md2_popup_padding_start);
        this.f11365 = resources.getDimensionPixelOffset(R.dimen.afs_md2_popup_padding_end);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m4328(Path path, float f, float f2, float f3, float f4, float f5) {
        path.arcTo(f - f3, f2 - f3, f + f3, f2 + f3, f4, f5, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f11366, this.f11363);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setConvexPath(this.f11366);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int layoutDirection = getLayoutDirection();
        int i = this.f11364;
        int i2 = this.f11365;
        if (layoutDirection == 1) {
            rect.set(i2, 0, i, 0);
        } else {
            rect.set(i, 0, i2, 0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        m4329();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        m4329();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4329() {
        Path path = this.f11366;
        path.reset();
        float fWidth = getBounds().width();
        float fHeight = r6.height() / 2.0f;
        float fSqrt = (float) Math.sqrt(2.0d);
        float f = fSqrt * fHeight;
        float fMax = Math.max(fHeight + f, fWidth);
        m4328(path, fHeight, fHeight, fHeight, 90.0f, 180.0f);
        float f2 = fMax - f;
        m4328(path, f2, fHeight, fHeight, -90.0f, 45.0f);
        float f3 = fHeight / 5.0f;
        m4328(path, fMax - (fSqrt * f3), fHeight, f3, -45.0f, 90.0f);
        m4328(path, f2, fHeight, fHeight, 45.0f, 45.0f);
        path.close();
        boolean z = getLayoutDirection() == 1;
        Matrix matrix = this.f11362;
        if (z) {
            matrix.setScale(-1.0f, 1.0f, fMax / 2.0f, 0.0f);
        } else {
            matrix.reset();
        }
        matrix.postTranslate(r6.left, r6.top);
        path.transform(matrix);
    }
}
