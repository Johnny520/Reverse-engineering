package Yue;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7182 extends Drawable {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f21664 = 3;

    /* JADX INFO: renamed from: ۥ */
    public final Bitmap f2719;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f2720;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final BitmapShader f21667;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float f21669;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f21673;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f21674;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f21675;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f21665 = 119;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Paint f21666 = new Paint(3);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Matrix f21668 = new Matrix();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Rect f21670 = new Rect();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final RectF f21671 = new RectF();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f21672 = true;

    public AbstractC7182(Resources resources, Bitmap bitmap) {
        this.f2720 = 160;
        if (resources != null) {
            this.f2720 = resources.getDisplayMetrics().densityDpi;
        }
        this.f2719 = bitmap;
        if (bitmap != null) {
            m3464();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f21667 = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f21675 = -1;
            this.f21674 = -1;
            this.f21667 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m22487(float f) {
        return f > 0.05f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC6391 Canvas canvas) {
        Bitmap bitmap = this.f2719;
        if (bitmap == null) {
            return;
        }
        m22501();
        if (this.f21666.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f21670, this.f21666);
            return;
        }
        RectF rectF = this.f21671;
        float f = this.f21669;
        canvas.drawRoundRect(rectF, f, f, this.f21666);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21666.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f21666.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f21675;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f21674;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f21665 != 119 || this.f21673 || (bitmap = this.f2719) == null || bitmap.hasAlpha() || this.f21666.getAlpha() < 255 || m22487(this.f21669)) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@InterfaceC6391 Rect rect) {
        super.onBoundsChange(rect);
        if (this.f21673) {
            m22500();
        }
        this.f21672 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f21666.getAlpha()) {
            this.f21666.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21666.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f21666.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f21666.setFilterBitmap(z);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3464() {
        this.f21674 = this.f2719.getScaledWidth(this.f2720);
        this.f21675 = this.f2719.getScaledHeight(this.f2720);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public final Bitmap m3465() {
        return this.f2719;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m22488() {
        return this.f21669;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m22489() {
        return this.f21665;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Paint m22490() {
        return this.f21666;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo22484(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m22491() {
        return this.f21666.isAntiAlias();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo22485() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m22492() {
        return this.f21673;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m22493(boolean z) {
        this.f21666.setAntiAlias(z);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m22494(boolean z) {
        this.f21673 = z;
        this.f21672 = true;
        if (!z) {
            m22495(0.0f);
            return;
        }
        m22500();
        this.f21666.setShader(this.f21667);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m22495(float f) {
        if (this.f21669 == f) {
            return;
        }
        this.f21673 = false;
        if (m22487(f)) {
            this.f21666.setShader(this.f21667);
        } else {
            this.f21666.setShader(null);
        }
        this.f21669 = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m22496(int i) {
        if (this.f21665 != i) {
            this.f21665 = i;
            this.f21672 = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo22486(boolean z) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m22497(int i) {
        if (this.f2720 != i) {
            if (i == 0) {
                i = 160;
            }
            this.f2720 = i;
            if (this.f2719 != null) {
                m3464();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m22498(@InterfaceC6391 Canvas canvas) {
        m22497(canvas.getDensity());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m22499(@InterfaceC6391 DisplayMetrics displayMetrics) {
        m22497(displayMetrics.densityDpi);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m22500() {
        this.f21669 = Math.min(this.f21675, this.f21674) / 2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m22501() {
        if (this.f21672) {
            if (this.f21673) {
                int iMin = Math.min(this.f21674, this.f21675);
                mo22484(this.f21665, iMin, iMin, getBounds(), this.f21670);
                int iMin2 = Math.min(this.f21670.width(), this.f21670.height());
                this.f21670.inset(Math.max(0, (this.f21670.width() - iMin2) / 2), Math.max(0, (this.f21670.height() - iMin2) / 2));
                this.f21669 = iMin2 * 0.5f;
            } else {
                mo22484(this.f21665, this.f21674, this.f21675, getBounds(), this.f21670);
            }
            this.f21671.set(this.f21670);
            if (this.f21667 != null) {
                Matrix matrix = this.f21668;
                RectF rectF = this.f21671;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f21668.preScale(this.f21671.width() / this.f2719.getWidth(), this.f21671.height() / this.f2719.getHeight());
                this.f21667.setLocalMatrix(this.f21668);
                this.f21666.setShader(this.f21667);
            }
            this.f21672 = false;
        }
    }
}
