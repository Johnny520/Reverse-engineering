package Yue;

import Yue.C6976;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7180 extends Drawable {

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final double f21647 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final float f21648 = 1.5f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static InterfaceC1199 f21649;

    /* JADX INFO: renamed from: ۥ */
    public final int f2717;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Paint f21650;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Paint f21651;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final RectF f21652;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f21653;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Path f21654;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float f21655;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float f21656;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float f21657;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public ColorStateList f21658;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int f21660;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int f21661;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f21659 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean f21662 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean f21663 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public Paint f2718 = new Paint(5);

    /* JADX INFO: renamed from: Yue.ۥۡۧ۠۟$ۥ */
    public interface InterfaceC1199 {
        /* JADX INFO: renamed from: ۥ */
        void mo748(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public C7180(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f21660 = resources.getColor(C6976.C1129.f20753);
        this.f21661 = resources.getColor(C6976.C1129.f20752);
        this.f2717 = resources.getDimensionPixelSize(C6976.C6977.f2581);
        m22477(colorStateList);
        Paint paint = new Paint(5);
        this.f21650 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f21653 = (int) (f + 0.5f);
        this.f21652 = new RectF();
        Paint paint2 = new Paint(this.f21650);
        this.f21651 = paint2;
        paint2.setAntiAlias(false);
        m22482(f2, f3);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static float m22466(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f21647) * ((double) f2))) : f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m22467(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f21647) * ((double) f2))) : f * 1.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f21659) {
            m3462(getBounds());
            this.f21659 = false;
        }
        canvas.translate(0.0f, this.f21657 / 2.0f);
        m22468(canvas);
        canvas.translate(0.0f, (-this.f21657) / 2.0f);
        f21649.mo748(canvas, this.f21652, this.f21653, this.f2718);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(m22467(this.f21655, this.f21653, this.f21662));
        int iCeil2 = (int) Math.ceil(m22466(this.f21655, this.f21653, this.f21662));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f21658;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f21659 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f21658;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2718.getColor() == colorForState) {
            return false;
        }
        this.f2718.setColor(colorForState);
        this.f21659 = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2718.setAlpha(i);
        this.f21650.setAlpha(i);
        this.f21651.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2718.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3462(Rect rect) {
        float f = this.f21655;
        float f2 = 1.5f * f;
        this.f21652.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        m3463();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3463() {
        float f = this.f21653;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f21656;
        rectF2.inset(-f2, -f2);
        Path path = this.f21654;
        if (path == null) {
            this.f21654 = new Path();
        } else {
            path.reset();
        }
        this.f21654.setFillType(Path.FillType.EVEN_ODD);
        this.f21654.moveTo(-this.f21653, 0.0f);
        this.f21654.rLineTo(-this.f21656, 0.0f);
        this.f21654.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f21654.arcTo(rectF, 270.0f, -90.0f, false);
        this.f21654.close();
        float f3 = this.f21653;
        float f4 = f3 / (this.f21656 + f3);
        Paint paint = this.f21650;
        float f5 = this.f21653 + this.f21656;
        int i = this.f21660;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f21661}, new float[]{0.0f, f4, 1.0f}, tileMode));
        Paint paint2 = this.f21651;
        float f6 = this.f21653;
        float f7 = this.f21656;
        float f8 = (-f6) + f7;
        float f9 = (-f6) - f7;
        int i2 = this.f21660;
        paint2.setShader(new LinearGradient(0.0f, f8, 0.0f, f9, new int[]{i2, i2, this.f21661}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.f21651.setAntiAlias(false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m22468(Canvas canvas) {
        float f = this.f21653;
        float f2 = (-f) - this.f21656;
        float f3 = f + this.f2717 + (this.f21657 / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f21652.width() - f4 > 0.0f;
        boolean z2 = this.f21652.height() - f4 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f21652;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f21654, this.f21650);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f21652.width() - f4, -this.f21653, this.f21651);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.f21652;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f21654, this.f21650);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f21652.width() - f4, (-this.f21653) + this.f21656, this.f21651);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.f21652;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f21654, this.f21650);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f21652.height() - f4, -this.f21653, this.f21651);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.f21652;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f21654, this.f21650);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f21652.height() - f4, -this.f21653, this.f21651);
        }
        canvas.restoreToCount(iSave4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public ColorStateList m22469() {
        return this.f21658;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m22470() {
        return this.f21653;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m22471(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float m22472() {
        return this.f21655;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float m22473() {
        float f = this.f21655;
        return (Math.max(f, this.f21653 + this.f2717 + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f21655 * 1.5f) + this.f2717) * 2.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float m22474() {
        float f = this.f21655;
        return (Math.max(f, this.f21653 + this.f2717 + (f / 2.0f)) * 2.0f) + ((this.f21655 + this.f2717) * 2.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float m22475() {
        return this.f21657;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m22476(boolean z) {
        this.f21662 = z;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m22477(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f21658 = colorStateList;
        this.f2718.setColor(colorStateList.getColorForState(getState(), this.f21658.getDefaultColor()));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m22478(@InterfaceC6490 ColorStateList colorStateList) {
        m22477(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m22479(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f21653 == f2) {
            return;
        }
        this.f21653 = f2;
        this.f21659 = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m22480(float f) {
        m22482(this.f21657, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m22481(float f) {
        m22482(f, this.f21655);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m22482(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        float fM22483 = m22483(f);
        float fM224832 = m22483(f2);
        if (fM22483 > fM224832) {
            if (!this.f21663) {
                this.f21663 = true;
            }
            fM22483 = fM224832;
        }
        if (this.f21657 == fM22483 && this.f21655 == fM224832) {
            return;
        }
        this.f21657 = fM22483;
        this.f21655 = fM224832;
        this.f21656 = (int) ((fM22483 * 1.5f) + this.f2717 + 0.5f);
        this.f21659 = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int m22483(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }
}
