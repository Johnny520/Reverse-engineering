package p301;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.android.dx.io.Opcodes;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.C3155;
import com.google.android.material.internal.C3156;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p305.C8638;
import p305.C8640;
import p305.C8641;
import p305.C8642;
import p305.C8643;
import p307.AbstractC8650;
import p310.C8654;
import p317.C8671;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8605 extends C8643 implements Drawable.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public static final int[] f24078 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public static final ShapeDrawable f24079 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public ColorStateList f24080;

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public boolean f24081;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public TextUtils.TruncateAt f24082;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public WeakReference f24083;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public int f24084;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public boolean f24085;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public PorterDuffColorFilter f24086;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public ColorFilter f24087;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public int[] f24088;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public ColorStateList f24089;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public ColorStateList f24090;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public PorterDuff.Mode f24091;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final Paint.FontMetrics f24092;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final RectF f24093;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public float f24094;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public float f24095;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final Paint f24096;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final Context f24097;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public int f24098;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public boolean f24099;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public int f24100;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public int f24101;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public int f24102;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public int f24103;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public float f24104;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public float f24105;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public float f24106;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public float f24107;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public float f24108;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public float f24109;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public int f24110;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final C3155 f24111;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public int f24112;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public int f24113;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final PointF f24114;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final Path f24115;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean f24116;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public float f24117;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public ColorStateList f24118;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public Drawable f24119;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f24120;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public CharSequence f24121;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public ColorStateList f24122;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public Drawable f24123;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public C8671 f24124;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public C8671 f24125;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public boolean f24126;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f24127;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public ColorStateList f24128;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public RippleDrawable f24129;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public SpannableStringBuilder f24130;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public float f24131;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public boolean f24132;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public Drawable f24133;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public float f24134;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public ColorStateList f24135;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public float f24136;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public ColorStateList f24137;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public float f24138;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public ColorStateList f24139;

    public C8605(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        this.f24138 = -1.0f;
        this.f24096 = new Paint(1);
        this.f24092 = new Paint.FontMetrics();
        this.f24093 = new RectF();
        this.f24114 = new PointF();
        this.f24115 = new Path();
        this.f24102 = Opcodes.CONST_METHOD_TYPE;
        this.f24091 = PorterDuff.Mode.SRC_IN;
        this.f24083 = new WeakReference(null);
        m14338(context);
        this.f24097 = context;
        C3155 c3155 = new C3155(this);
        this.f24111 = c3155;
        this.f24121 = "";
        c3155.f10507.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f24078;
        setState(iArr);
        m14268(iArr);
        this.f24085 = true;
        f24079.setTint(-1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m14239(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m14240(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static void m14241(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f24102) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f24081;
        Paint paint = this.f24096;
        RectF rectF = this.f24093;
        if (!z) {
            paint.setColor(this.f24110);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m14254(), m14254(), paint);
        }
        if (!this.f24081) {
            paint.setColor(this.f24113);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f24087;
            if (colorFilter == null) {
                colorFilter = this.f24086;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m14254(), m14254(), paint);
        }
        if (this.f24081) {
            super.draw(canvas);
        }
        if (this.f24136 > 0.0f && !this.f24081) {
            paint.setColor(this.f24100);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f24081) {
                ColorFilter colorFilter2 = this.f24087;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f24086;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f24136 / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f24138 - (this.f24136 / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.f24101);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f24081) {
            RectF rectF2 = new RectF(bounds);
            C8640 c8640Mo14292 = this.f24324.f24283.mo14292();
            float[] fArr = this.f24298;
            float f5 = this.f24324.f24292;
            C8642 c8642 = this.f24315;
            C8638 c8638 = this.f24314;
            f = 2.0f;
            Path path = this.f24115;
            c8638.m14317(c8640Mo14292, fArr, f5, rectF2, c8642, path);
            m14327(canvas2, paint, path, this.f24324.f24283.mo14292(), this.f24298, m14345());
        } else {
            canvas2.drawRoundRect(rectF, m14254(), m14254(), paint);
            f = 2.0f;
        }
        if (m14264()) {
            m14257(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f24119.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24119.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (m14265()) {
            m14257(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.f24123.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24123.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.f24085 && this.f24121 != null) {
            PointF pointF = this.f24114;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f24121;
            C3155 c3155 = this.f24111;
            if (charSequence != null) {
                float fM14256 = m14256() + this.f24105 + this.f24109;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM14256;
                } else {
                    pointF.x = bounds.right - fM14256;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c3155.f10507;
                Paint.FontMetrics fontMetrics = this.f24092;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.f24121 != null) {
                float fM142562 = m14256() + this.f24105 + this.f24109;
                float fM14255 = m14255() + this.f24094 + this.f24106;
                int layoutDirection = getLayoutDirection();
                int i3 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i3 + fM142562;
                    rectF.right = bounds.right - fM14255;
                } else {
                    rectF.left = i3 + fM14255;
                    rectF.right = bounds.right - fM142562;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C8654 c8654 = c3155.f10502;
            TextPaint textPaint2 = c3155.f10507;
            if (c8654 != null) {
                textPaint2.drawableState = getState();
                c3155.f10502.m14354(this.f24097, textPaint2, c3155.f10506);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c3155.m7177(this.f24121.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f24121;
            if (z2 && this.f24082 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f24082);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m14263()) {
            rectF.setEmpty();
            if (m14263()) {
                float f10 = this.f24094 + this.f24095;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.f24131;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.f24131;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.f24131;
                float f14 = fExactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f24133.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24129.setBounds(this.f24133.getBounds());
            this.f24129.jumpToCurrentState();
            this.f24129.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.f24102 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f24102;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f24087;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f24134;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m14255() + this.f24111.m7177(this.f24121.toString()) + m14256() + this.f24105 + this.f24109 + this.f24106 + this.f24094), this.f24084);
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f24081) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f24134, this.f24138);
        } else {
            outline.setRoundRect(bounds, this.f24138);
            outline2 = outline;
        }
        outline2.setAlpha(this.f24102 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m14240(this.f24080) || m14240(this.f24135) || m14240(this.f24139)) {
            return true;
        }
        C8654 c8654 = this.f24111.f10502;
        if (c8654 == null || (colorStateList = c8654.f24389) == null || !colorStateList.isStateful()) {
            return (this.f24127 && this.f24123 != null && this.f24126) || m14239(this.f24119) || m14239(this.f24123) || m14240(this.f24090);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m14264()) {
            zOnLayoutDirectionChanged |= this.f24119.setLayoutDirection(i);
        }
        if (m14265()) {
            zOnLayoutDirectionChanged |= this.f24123.setLayoutDirection(i);
        }
        if (m14263()) {
            zOnLayoutDirectionChanged |= this.f24133.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m14264()) {
            zOnLevelChange |= this.f24119.setLevel(i);
        }
        if (m14265()) {
            zOnLevelChange |= this.f24123.setLevel(i);
        }
        if (m14263()) {
            zOnLevelChange |= this.f24133.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f24081) {
            super.onStateChange(iArr);
        }
        return m14261(iArr, this.f24088);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f24102 != i) {
            this.f24102 = i;
            invalidateSelf();
        }
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f24087 != colorFilter) {
            this.f24087 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f24090 != colorStateList) {
            this.f24090 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p305.C8643, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f24091 != mode) {
            this.f24091 = mode;
            ColorStateList colorStateList = this.f24090;
            this.f24086 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m14264()) {
            visible |= this.f24119.setVisible(z, z2);
        }
        if (m14265()) {
            visible |= this.f24123.setVisible(z, z2);
        }
        if (m14263()) {
            visible |= this.f24133.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m14242(float f) {
        if (this.f24095 != f) {
            this.f24095 = f;
            invalidateSelf();
            if (m14263()) {
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m14243(float f) {
        if (this.f24131 != f) {
            this.f24131 = f;
            invalidateSelf();
            if (m14263()) {
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m14244(ColorStateList colorStateList) {
        if (this.f24139 != colorStateList) {
            this.f24139 = colorStateList;
            if (this.f24081) {
                C8641 c8641 = this.f24324;
                if (c8641.f24280 != colorStateList) {
                    c8641.f24280 = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14245(boolean z) {
        if (this.f24120 != z) {
            boolean zM14264 = m14264();
            this.f24120 = z;
            boolean zM142642 = m14264();
            if (zM14264 != zM142642) {
                Drawable drawable = this.f24119;
                if (zM142642) {
                    m14258(drawable);
                } else {
                    m14241(drawable);
                }
                invalidateSelf();
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m14246(Drawable drawable) {
        Drawable drawable2 = this.f24133;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM14255 = m14255();
            this.f24133 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC8650.m14350(this.f24137), this.f24133, f24079);
            FocusRingDrawable.m7149(this.f24097, rippleDrawable, null);
            this.f24129 = rippleDrawable;
            float fM142552 = m14255();
            m14241(drawable2);
            if (m14263()) {
                m14258(this.f24133);
            }
            invalidateSelf();
            if (fM14255 != fM142552) {
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m14247(float f) {
        if (this.f24136 != f) {
            this.f24136 = f;
            this.f24096.setStrokeWidth(f);
            if (this.f24081) {
                this.f24324.f24293 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m14248(float f) {
        if (this.f24117 != f) {
            float fM14256 = m14256();
            this.f24117 = f;
            float fM142562 = m14256();
            invalidateSelf();
            if (fM14256 != fM142562) {
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m14249(ColorStateList colorStateList) {
        this.f24116 = true;
        if (this.f24118 != colorStateList) {
            this.f24118 = colorStateList;
            if (m14264()) {
                this.f24119.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m14250(boolean z) {
        if (this.f24127 != z) {
            boolean zM14265 = m14265();
            this.f24127 = z;
            boolean zM142652 = m14265();
            if (zM14265 != zM142652) {
                Drawable drawable = this.f24123;
                if (zM142652) {
                    m14258(drawable);
                } else {
                    m14241(drawable);
                }
                invalidateSelf();
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m14251(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f24122 != colorStateList) {
            this.f24122 = colorStateList;
            if (this.f24127 && (drawable = this.f24123) != null && this.f24126) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m14252(Drawable drawable) {
        Drawable drawable2 = this.f24119;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM14256 = m14256();
            this.f24119 = drawable != null ? drawable.mutate() : null;
            float fM142562 = m14256();
            m14241(drawable2);
            if (m14264()) {
                m14258(this.f24119);
            }
            invalidateSelf();
            if (fM14256 != fM142562) {
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14253(float f) {
        if (this.f24138 != f) {
            this.f24138 = f;
            setShapeAppearanceModel(m14348().mo14295(f));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final float m14254() {
        return this.f24081 ? m14346() : this.f24138;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final float m14255() {
        if (m14263()) {
            return this.f24107 + this.f24131 + this.f24095;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final float m14256() {
        if (!m14264() && !m14265()) {
            return 0.0f;
        }
        float f = this.f24104;
        Drawable drawable = this.f24099 ? this.f24123 : this.f24119;
        float intrinsicWidth = this.f24117;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f24108;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14257(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m14264() || m14265()) {
            float f = this.f24105 + this.f24104;
            Drawable drawable = this.f24099 ? this.f24123 : this.f24119;
            float intrinsicWidth = this.f24117;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f24099 ? this.f24123 : this.f24119;
            float fCeil = this.f24117;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.f24097.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14258(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f24133) {
            drawable.setTintList(this.f24128);
            if (drawable.isStateful()) {
                drawable.setState(this.f24088);
                return;
            }
            return;
        }
        Drawable drawable2 = this.f24119;
        if (drawable == drawable2 && this.f24116) {
            drawable2.setTintList(this.f24118);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m14259(Drawable drawable) {
        if (this.f24123 != drawable) {
            float fM14256 = m14256();
            this.f24123 = drawable;
            float fM142562 = m14256();
            m14241(this.f24123);
            m14258(this.f24123);
            invalidateSelf();
            if (fM14256 != fM142562) {
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m14260(boolean z) {
        if (this.f24126 != z) {
            this.f24126 = z;
            float fM14256 = m14256();
            if (!z && this.f24099) {
                this.f24099 = false;
            }
            float fM142562 = m14256();
            invalidateSelf();
            if (fM14256 != fM142562) {
                m14262();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m14261(int[] r10, int[] r11) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p301.C8605.m14261(int[], int[]):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m14262() {
        Chip chip = (Chip) this.f24083.get();
        if (chip != null) {
            chip.m7089(chip.f10227);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m14263() {
        return this.f24132 && this.f24133 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final boolean m14264() {
        return this.f24120 && this.f24119 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final boolean m14265() {
        return this.f24127 && this.f24123 != null && this.f24099;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m14266(C8654 c8654) {
        C3155 c3155 = this.f24111;
        C3156 c3156 = c3155.f10506;
        TextPaint textPaint = c3155.f10507;
        if (c3155.f10502 != c8654) {
            c3155.f10502 = c8654;
            if (c8654 != null) {
                Context context = this.f24097;
                c8654.m14353(context, textPaint, c3156);
                C8605 c8605 = (C8605) c3155.f10503.get();
                if (c8605 != null) {
                    textPaint.drawableState = c8605.getState();
                }
                c8654.m14354(context, textPaint, c3156);
                c3155.f10504 = true;
            }
            C8605 c86052 = (C8605) c3155.f10503.get();
            if (c86052 != null) {
                c86052.m14262();
                c86052.invalidateSelf();
                c86052.onStateChange(c86052.getState());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m14267(ColorStateList colorStateList) {
        if (this.f24137 != colorStateList) {
            this.f24137 = colorStateList;
            this.f24089 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final boolean m14268(int[] iArr) {
        if (Arrays.equals(this.f24088, iArr)) {
            return false;
        }
        this.f24088 = iArr;
        if (m14263()) {
            return m14261(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m14269(float f) {
        if (this.f24107 != f) {
            this.f24107 = f;
            invalidateSelf();
            if (m14263()) {
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m14270(float f) {
        if (this.f24108 != f) {
            float fM14256 = m14256();
            this.f24108 = f;
            float fM142562 = m14256();
            invalidateSelf();
            if (fM14256 != fM142562) {
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m14271(float f) {
        if (this.f24104 != f) {
            float fM14256 = m14256();
            this.f24104 = f;
            float fM142562 = m14256();
            invalidateSelf();
            if (fM14256 != fM142562) {
                m14262();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m14272(ColorStateList colorStateList) {
        if (this.f24128 != colorStateList) {
            this.f24128 = colorStateList;
            if (m14263()) {
                this.f24133.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m14273(boolean z) {
        if (this.f24132 != z) {
            boolean zM14263 = m14263();
            this.f24132 = z;
            boolean zM142632 = m14263();
            if (zM14263 != zM142632) {
                Drawable drawable = this.f24133;
                if (zM142632) {
                    m14258(drawable);
                } else {
                    m14241(drawable);
                }
                invalidateSelf();
                m14262();
            }
        }
    }
}
