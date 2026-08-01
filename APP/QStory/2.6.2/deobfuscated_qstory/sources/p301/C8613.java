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
import com.google.android.material.internal.C3154;
import com.google.android.material.internal.C3155;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p305.C8646;
import p305.C8648;
import p305.C8649;
import p305.C8650;
import p305.C8651;
import p307.AbstractC8658;
import p310.C8662;
import p317.C8679;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8613 extends C8651 implements Drawable.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public static final int[] f24087 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public static final ShapeDrawable f24088 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public ColorStateList f24089;

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public boolean f24090;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public TextUtils.TruncateAt f24091;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public WeakReference f24092;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public int f24093;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public boolean f24094;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public PorterDuffColorFilter f24095;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public ColorFilter f24096;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public int[] f24097;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public ColorStateList f24098;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public ColorStateList f24099;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public PorterDuff.Mode f24100;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final Paint.FontMetrics f24101;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final RectF f24102;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public float f24103;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public float f24104;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final Paint f24105;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final Context f24106;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public int f24107;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public boolean f24108;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public int f24109;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public int f24110;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public int f24111;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public int f24112;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public float f24113;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public float f24114;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public float f24115;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public float f24116;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public float f24117;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public float f24118;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public int f24119;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final C3154 f24120;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public int f24121;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public int f24122;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final PointF f24123;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final Path f24124;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean f24125;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public float f24126;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public ColorStateList f24127;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public Drawable f24128;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f24129;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public CharSequence f24130;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public ColorStateList f24131;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public Drawable f24132;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public C8679 f24133;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public C8679 f24134;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public boolean f24135;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f24136;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public ColorStateList f24137;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public RippleDrawable f24138;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public SpannableStringBuilder f24139;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public float f24140;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public boolean f24141;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public Drawable f24142;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public float f24143;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public ColorStateList f24144;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public float f24145;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public ColorStateList f24146;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public float f24147;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public ColorStateList f24148;

    public C8613(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.chipStyle, com.davemorrissey.labs.subscaleview.R.style.Widget_MaterialComponents_Chip_Action);
        this.f24147 = -1.0f;
        this.f24105 = new Paint(1);
        this.f24101 = new Paint.FontMetrics();
        this.f24102 = new RectF();
        this.f24123 = new PointF();
        this.f24124 = new Path();
        this.f24111 = Opcodes.CONST_METHOD_TYPE;
        this.f24100 = PorterDuff.Mode.SRC_IN;
        this.f24092 = new WeakReference(null);
        m14320(context);
        this.f24106 = context;
        C3154 c3154 = new C3154(this);
        this.f24120 = c3154;
        this.f24130 = "";
        c3154.f10502.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f24087;
        setState(iArr);
        m14249(iArr);
        this.f24094 = true;
        f24088.setTint(-1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m14220(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m14221(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static void m14222(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f24111) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f24090;
        Paint paint = this.f24105;
        RectF rectF = this.f24102;
        if (!z) {
            paint.setColor(this.f24119);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m14235(), m14235(), paint);
        }
        if (!this.f24090) {
            paint.setColor(this.f24122);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f24096;
            if (colorFilter == null) {
                colorFilter = this.f24095;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m14235(), m14235(), paint);
        }
        if (this.f24090) {
            super.draw(canvas);
        }
        if (this.f24145 > 0.0f && !this.f24090) {
            paint.setColor(this.f24109);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f24090) {
                ColorFilter colorFilter2 = this.f24096;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f24095;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f24145 / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f24147 - (this.f24145 / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.f24110);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f24090) {
            RectF rectF2 = new RectF(bounds);
            C8648 c8648Mo14273 = this.f24333.f24292.mo14273();
            float[] fArr = this.f24307;
            float f5 = this.f24333.f24301;
            C8650 c8650 = this.f24324;
            C8646 c8646 = this.f24323;
            f = 2.0f;
            Path path = this.f24124;
            c8646.m14299(c8648Mo14273, fArr, f5, rectF2, c8650, path);
            m14309(canvas2, paint, path, this.f24333.f24292.mo14273(), this.f24307, m14327());
        } else {
            canvas2.drawRoundRect(rectF, m14235(), m14235(), paint);
            f = 2.0f;
        }
        if (m14245()) {
            m14238(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f24128.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24128.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (m14246()) {
            m14238(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.f24132.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24132.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.f24094 && this.f24130 != null) {
            PointF pointF = this.f24123;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f24130;
            C3154 c3154 = this.f24120;
            if (charSequence != null) {
                float fM14237 = m14237() + this.f24114 + this.f24118;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM14237;
                } else {
                    pointF.x = bounds.right - fM14237;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c3154.f10502;
                Paint.FontMetrics fontMetrics = this.f24101;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.f24130 != null) {
                float fM142372 = m14237() + this.f24114 + this.f24118;
                float fM14236 = m14236() + this.f24103 + this.f24115;
                int layoutDirection = getLayoutDirection();
                int i3 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i3 + fM142372;
                    rectF.right = bounds.right - fM14236;
                } else {
                    rectF.left = i3 + fM14236;
                    rectF.right = bounds.right - fM142372;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C8662 c8662 = c3154.f10497;
            TextPaint textPaint2 = c3154.f10502;
            if (c8662 != null) {
                textPaint2.drawableState = getState();
                c3154.f10497.m14336(this.f24106, textPaint2, c3154.f10501);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c3154.m7190(this.f24130.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f24130;
            if (z2 && this.f24091 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f24091);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m14244()) {
            rectF.setEmpty();
            if (m14244()) {
                float f10 = this.f24103 + this.f24104;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.f24140;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.f24140;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.f24140;
                float f14 = fExactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f24142.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24138.setBounds(this.f24142.getBounds());
            this.f24138.jumpToCurrentState();
            this.f24138.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.f24111 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f24111;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f24096;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f24143;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m14236() + this.f24120.m7190(this.f24130.toString()) + m14237() + this.f24114 + this.f24118 + this.f24115 + this.f24103), this.f24093);
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f24090) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f24143, this.f24147);
        } else {
            outline.setRoundRect(bounds, this.f24147);
            outline2 = outline;
        }
        outline2.setAlpha(this.f24111 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m14221(this.f24089) || m14221(this.f24144) || m14221(this.f24148)) {
            return true;
        }
        C8662 c8662 = this.f24120.f10497;
        if (c8662 == null || (colorStateList = c8662.f24398) == null || !colorStateList.isStateful()) {
            return (this.f24136 && this.f24132 != null && this.f24135) || m14220(this.f24128) || m14220(this.f24132) || m14221(this.f24099);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m14245()) {
            zOnLayoutDirectionChanged |= this.f24128.setLayoutDirection(i);
        }
        if (m14246()) {
            zOnLayoutDirectionChanged |= this.f24132.setLayoutDirection(i);
        }
        if (m14244()) {
            zOnLayoutDirectionChanged |= this.f24142.setLayoutDirection(i);
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
        if (m14245()) {
            zOnLevelChange |= this.f24128.setLevel(i);
        }
        if (m14246()) {
            zOnLevelChange |= this.f24132.setLevel(i);
        }
        if (m14244()) {
            zOnLevelChange |= this.f24142.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f24090) {
            super.onStateChange(iArr);
        }
        return m14242(iArr, this.f24097);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f24111 != i) {
            this.f24111 = i;
            invalidateSelf();
        }
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f24096 != colorFilter) {
            this.f24096 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f24099 != colorStateList) {
            this.f24099 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f24100 != mode) {
            this.f24100 = mode;
            ColorStateList colorStateList = this.f24099;
            this.f24095 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m14245()) {
            visible |= this.f24128.setVisible(z, z2);
        }
        if (m14246()) {
            visible |= this.f24132.setVisible(z, z2);
        }
        if (m14244()) {
            visible |= this.f24142.setVisible(z, z2);
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
    public final void m14223(float f) {
        if (this.f24104 != f) {
            this.f24104 = f;
            invalidateSelf();
            if (m14244()) {
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m14224(float f) {
        if (this.f24140 != f) {
            this.f24140 = f;
            invalidateSelf();
            if (m14244()) {
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m14225(ColorStateList colorStateList) {
        if (this.f24148 != colorStateList) {
            this.f24148 = colorStateList;
            if (this.f24090) {
                C8649 c8649 = this.f24333;
                if (c8649.f24289 != colorStateList) {
                    c8649.f24289 = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14226(boolean z) {
        if (this.f24129 != z) {
            boolean zM14245 = m14245();
            this.f24129 = z;
            boolean zM142452 = m14245();
            if (zM14245 != zM142452) {
                Drawable drawable = this.f24128;
                if (zM142452) {
                    m14239(drawable);
                } else {
                    m14222(drawable);
                }
                invalidateSelf();
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m14227(Drawable drawable) {
        Drawable drawable2 = this.f24142;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM14236 = m14236();
            this.f24142 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC8658.m14332(this.f24146), this.f24142, f24088);
            FocusRingDrawable.m7162(this.f24106, rippleDrawable, null);
            this.f24138 = rippleDrawable;
            float fM142362 = m14236();
            m14222(drawable2);
            if (m14244()) {
                m14239(this.f24142);
            }
            invalidateSelf();
            if (fM14236 != fM142362) {
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m14228(float f) {
        if (this.f24145 != f) {
            this.f24145 = f;
            this.f24105.setStrokeWidth(f);
            if (this.f24090) {
                this.f24333.f24302 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m14229(float f) {
        if (this.f24126 != f) {
            float fM14237 = m14237();
            this.f24126 = f;
            float fM142372 = m14237();
            invalidateSelf();
            if (fM14237 != fM142372) {
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m14230(ColorStateList colorStateList) {
        this.f24125 = true;
        if (this.f24127 != colorStateList) {
            this.f24127 = colorStateList;
            if (m14245()) {
                this.f24128.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m14231(boolean z) {
        if (this.f24136 != z) {
            boolean zM14246 = m14246();
            this.f24136 = z;
            boolean zM142462 = m14246();
            if (zM14246 != zM142462) {
                Drawable drawable = this.f24132;
                if (zM142462) {
                    m14239(drawable);
                } else {
                    m14222(drawable);
                }
                invalidateSelf();
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m14232(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f24131 != colorStateList) {
            this.f24131 = colorStateList;
            if (this.f24136 && (drawable = this.f24132) != null && this.f24135) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m14233(Drawable drawable) {
        Drawable drawable2 = this.f24128;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM14237 = m14237();
            this.f24128 = drawable != null ? drawable.mutate() : null;
            float fM142372 = m14237();
            m14222(drawable2);
            if (m14245()) {
                m14239(this.f24128);
            }
            invalidateSelf();
            if (fM14237 != fM142372) {
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14234(float f) {
        if (this.f24147 != f) {
            this.f24147 = f;
            setShapeAppearanceModel(m14330().mo14276(f));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final float m14235() {
        return this.f24090 ? m14328() : this.f24147;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final float m14236() {
        if (m14244()) {
            return this.f24116 + this.f24140 + this.f24104;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final float m14237() {
        if (!m14245() && !m14246()) {
            return 0.0f;
        }
        float f = this.f24113;
        Drawable drawable = this.f24108 ? this.f24132 : this.f24128;
        float intrinsicWidth = this.f24126;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f24117;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14238(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m14245() || m14246()) {
            float f = this.f24114 + this.f24113;
            Drawable drawable = this.f24108 ? this.f24132 : this.f24128;
            float intrinsicWidth = this.f24126;
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
            Drawable drawable2 = this.f24108 ? this.f24132 : this.f24128;
            float fCeil = this.f24126;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.f24106.getResources().getDisplayMetrics()));
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
    public final void m14239(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f24142) {
            drawable.setTintList(this.f24137);
            if (drawable.isStateful()) {
                drawable.setState(this.f24097);
                return;
            }
            return;
        }
        Drawable drawable2 = this.f24128;
        if (drawable == drawable2 && this.f24125) {
            drawable2.setTintList(this.f24127);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m14240(Drawable drawable) {
        if (this.f24132 != drawable) {
            float fM14237 = m14237();
            this.f24132 = drawable;
            float fM142372 = m14237();
            m14222(this.f24132);
            m14239(this.f24132);
            invalidateSelf();
            if (fM14237 != fM142372) {
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m14241(boolean z) {
        if (this.f24135 != z) {
            this.f24135 = z;
            float fM14237 = m14237();
            if (!z && this.f24108) {
                this.f24108 = false;
            }
            float fM142372 = m14237();
            invalidateSelf();
            if (fM14237 != fM142372) {
                m14243();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m14242(int[] r10, int[] r11) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p301.C8613.m14242(int[], int[]):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m14243() {
        Chip chip = (Chip) this.f24092.get();
        if (chip != null) {
            chip.m7102(chip.f10222);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m14244() {
        return this.f24141 && this.f24142 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final boolean m14245() {
        return this.f24129 && this.f24128 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final boolean m14246() {
        return this.f24136 && this.f24132 != null && this.f24108;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m14247(C8662 c8662) {
        C3154 c3154 = this.f24120;
        C3155 c3155 = c3154.f10501;
        TextPaint textPaint = c3154.f10502;
        if (c3154.f10497 != c8662) {
            c3154.f10497 = c8662;
            if (c8662 != null) {
                Context context = this.f24106;
                c8662.m14335(context, textPaint, c3155);
                C8613 c8613 = (C8613) c3154.f10498.get();
                if (c8613 != null) {
                    textPaint.drawableState = c8613.getState();
                }
                c8662.m14336(context, textPaint, c3155);
                c3154.f10499 = true;
            }
            C8613 c86132 = (C8613) c3154.f10498.get();
            if (c86132 != null) {
                c86132.m14243();
                c86132.invalidateSelf();
                c86132.onStateChange(c86132.getState());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m14248(ColorStateList colorStateList) {
        if (this.f24146 != colorStateList) {
            this.f24146 = colorStateList;
            this.f24098 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final boolean m14249(int[] iArr) {
        if (Arrays.equals(this.f24097, iArr)) {
            return false;
        }
        this.f24097 = iArr;
        if (m14244()) {
            return m14242(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m14250(float f) {
        if (this.f24116 != f) {
            this.f24116 = f;
            invalidateSelf();
            if (m14244()) {
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m14251(float f) {
        if (this.f24117 != f) {
            float fM14237 = m14237();
            this.f24117 = f;
            float fM142372 = m14237();
            invalidateSelf();
            if (fM14237 != fM142372) {
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m14252(float f) {
        if (this.f24113 != f) {
            float fM14237 = m14237();
            this.f24113 = f;
            float fM142372 = m14237();
            invalidateSelf();
            if (fM14237 != fM142372) {
                m14243();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m14253(ColorStateList colorStateList) {
        if (this.f24137 != colorStateList) {
            this.f24137 = colorStateList;
            if (m14244()) {
                this.f24142.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m14254(boolean z) {
        if (this.f24141 != z) {
            boolean zM14244 = m14244();
            this.f24141 = z;
            boolean zM142442 = m14244();
            if (zM14244 != zM142442) {
                Drawable drawable = this.f24142;
                if (zM142442) {
                    m14239(drawable);
                } else {
                    m14222(drawable);
                }
                invalidateSelf();
                m14243();
            }
        }
    }
}
