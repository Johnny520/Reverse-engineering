package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Nw */
/* JADX INFO: loaded from: classes.dex */
public final class C0598Nw extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f1928a;

    /* JADX INFO: renamed from: b */
    public final Paint f1929b;

    /* JADX INFO: renamed from: c */
    public final RectF f1930c;

    /* JADX INFO: renamed from: d */
    public final Rect f1931d;

    /* JADX INFO: renamed from: e */
    public float f1932e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f1935h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f1936i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f1937j;

    /* JADX INFO: renamed from: f */
    public boolean f1933f = false;

    /* JADX INFO: renamed from: g */
    public boolean f1934g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f1938k = PorterDuff.Mode.SRC_IN;

    public C0598Nw(ColorStateList colorStateList, float f) {
        this.f1928a = f;
        Paint paint = new Paint(5);
        this.f1929b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f1935h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f1935h.getDefaultColor()));
        this.f1930c = new RectF();
        this.f1931d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m1170a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m1171b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        RectF rectF = this.f1930c;
        rectF.set(f, f2, f3, f4);
        Rect rect2 = this.f1931d;
        rect2.set(rect);
        if (this.f1933f) {
            rect2.inset((int) Math.ceil(AbstractC0641Ow.m1263a(this.f1932e, this.f1928a, this.f1934g)), (int) Math.ceil(AbstractC0641Ow.m1264b(this.f1932e, this.f1928a, this.f1934g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f1936i;
        Paint paint = this.f1929b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1936i);
            z = true;
        }
        RectF rectF = this.f1930c;
        float f = this.f1928a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f1931d, this.f1928a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f1937j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f1935h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1171b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1935h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f1929b;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1937j;
        if (colorStateList2 == null || (mode = this.f1938k) == null) {
            return z;
        }
        this.f1936i = m1170a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1929b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1929b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f1937j = colorStateList;
        this.f1936i = m1170a(colorStateList, this.f1938k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f1938k = mode;
        this.f1936i = m1170a(this.f1937j, mode);
        invalidateSelf();
    }
}
