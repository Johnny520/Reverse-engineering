package p317;

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
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.C3987;
import com.google.android.material.internal.C3988;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p180.AbstractC8496;
import p321.C9467;
import p321.C9469;
import p321.C9470;
import p321.C9471;
import p321.C9472;
import p323.AbstractC9479;
import p326.C9483;
import p333.C9500;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9434 extends C9472 implements Drawable.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public static final int[] f24423 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public static final ShapeDrawable f24424 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public ColorStateList f24425;

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public boolean f24426;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public TextUtils.TruncateAt f24427;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public WeakReference f24428;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public int f24429;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public boolean f24430;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public PorterDuffColorFilter f24431;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public ColorFilter f24432;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public int[] f24433;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public ColorStateList f24434;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public ColorStateList f24435;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public PorterDuff.Mode f24436;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final Paint.FontMetrics f24437;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final RectF f24438;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public float f24439;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public float f24440;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final Paint f24441;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final Context f24442;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public int f24443;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public boolean f24444;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public int f24445;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public int f24446;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public int f24447;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public int f24448;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public float f24449;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public float f24450;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public float f24451;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public float f24452;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public float f24453;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public float f24454;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public int f24455;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final C3987 f24456;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public int f24457;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public int f24458;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final PointF f24459;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final Path f24460;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean f24461;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public float f24462;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public ColorStateList f24463;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public Drawable f24464;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f24465;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public CharSequence f24466;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public ColorStateList f24467;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public Drawable f24468;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public C9500 f24469;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public C9500 f24470;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public boolean f24471;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f24472;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public ColorStateList f24473;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public RippleDrawable f24474;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public SpannableStringBuilder f24475;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public float f24476;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public boolean f24477;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public Drawable f24478;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public float f24479;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public ColorStateList f24480;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public float f24481;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public ColorStateList f24482;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public float f24483;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public ColorStateList f24484;

    public C9434(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0328R.attr.chipStyle, C0328R.style.Widget_MaterialComponents_Chip_Action);
        this.f24483 = -1.0f;
        this.f24441 = new Paint(1);
        this.f24437 = new Paint.FontMetrics();
        this.f24438 = new RectF();
        this.f24459 = new PointF();
        this.f24460 = new Path();
        this.f24447 = Opcodes.CONST_METHOD_TYPE;
        this.f24436 = PorterDuff.Mode.SRC_IN;
        this.f24428 = new WeakReference(null);
        m14897(context);
        this.f24442 = context;
        C3987 c3987 = new C3987(this);
        this.f24456 = c3987;
        this.f24466 = "";
        c3987.f10852.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f24423;
        setState(iArr);
        m14827(iArr);
        this.f24430 = true;
        f24424.setTint(-1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m14798(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m14799(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static void m14800(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f24447) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f24426;
        Paint paint = this.f24441;
        RectF rectF = this.f24438;
        if (!z) {
            paint.setColor(this.f24455);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m14813(), m14813(), paint);
        }
        if (!this.f24426) {
            paint.setColor(this.f24458);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f24432;
            if (colorFilter == null) {
                colorFilter = this.f24431;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m14813(), m14813(), paint);
        }
        if (this.f24426) {
            super.draw(canvas);
        }
        if (this.f24481 > 0.0f && !this.f24426) {
            paint.setColor(this.f24445);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f24426) {
                ColorFilter colorFilter2 = this.f24432;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f24431;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f24481 / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f24483 - (this.f24481 / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.f24446);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f24426) {
            RectF rectF2 = new RectF(bounds);
            C9469 c9469Mo14851 = this.f24669.f24628.mo14851();
            float[] fArr = this.f24643;
            float f5 = this.f24669.f24637;
            C9471 c9471 = this.f24660;
            C9467 c9467 = this.f24659;
            f = 2.0f;
            Path path = this.f24460;
            c9467.m14876(c9469Mo14851, fArr, f5, rectF2, c9471, path);
            m14886(canvas2, paint, path, this.f24669.f24628.mo14851(), this.f24643, m14904());
        } else {
            canvas2.drawRoundRect(rectF, m14813(), m14813(), paint);
            f = 2.0f;
        }
        if (m14823()) {
            m14816(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f24464.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24464.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (m14824()) {
            m14816(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.f24468.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24468.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.f24430 && this.f24466 != null) {
            PointF pointF = this.f24459;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f24466;
            C3987 c3987 = this.f24456;
            if (charSequence != null) {
                float fM14815 = m14815() + this.f24450 + this.f24454;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM14815;
                } else {
                    pointF.x = bounds.right - fM14815;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c3987.f10852;
                Paint.FontMetrics fontMetrics = this.f24437;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.f24466 != null) {
                float fM148152 = m14815() + this.f24450 + this.f24454;
                float fM14814 = m14814() + this.f24439 + this.f24451;
                int layoutDirection = getLayoutDirection();
                int i3 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i3 + fM148152;
                    rectF.right = bounds.right - fM14814;
                } else {
                    rectF.left = i3 + fM14814;
                    rectF.right = bounds.right - fM148152;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C9483 c9483 = c3987.f10847;
            TextPaint textPaint2 = c3987.f10852;
            if (c9483 != null) {
                textPaint2.drawableState = getState();
                c3987.f10847.m14913(this.f24442, textPaint2, c3987.f10851);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c3987.m7736(this.f24466.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f24466;
            if (z2 && this.f24427 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f24427);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m14822()) {
            rectF.setEmpty();
            if (m14822()) {
                float f10 = this.f24439 + this.f24440;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.f24476;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.f24476;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.f24476;
                float f14 = fExactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f24478.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f24474.setBounds(this.f24478.getBounds());
            this.f24474.jumpToCurrentState();
            this.f24474.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.f24447 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f24447;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f24432;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f24479;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m14814() + this.f24456.m7736(this.f24466.toString()) + m14815() + this.f24450 + this.f24454 + this.f24451 + this.f24439), this.f24429);
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f24426) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f24479, this.f24483);
        } else {
            outline.setRoundRect(bounds, this.f24483);
            outline2 = outline;
        }
        outline2.setAlpha(this.f24447 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m14799(this.f24425) || m14799(this.f24480) || m14799(this.f24484)) {
            return true;
        }
        C9483 c9483 = this.f24456.f10847;
        if (c9483 == null || (colorStateList = c9483.f24734) == null || !colorStateList.isStateful()) {
            return (this.f24472 && this.f24468 != null && this.f24471) || m14798(this.f24464) || m14798(this.f24468) || m14799(this.f24435);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m14823()) {
            zOnLayoutDirectionChanged |= this.f24464.setLayoutDirection(i);
        }
        if (m14824()) {
            zOnLayoutDirectionChanged |= this.f24468.setLayoutDirection(i);
        }
        if (m14822()) {
            zOnLayoutDirectionChanged |= this.f24478.setLayoutDirection(i);
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
        if (m14823()) {
            zOnLevelChange |= this.f24464.setLevel(i);
        }
        if (m14824()) {
            zOnLevelChange |= this.f24468.setLevel(i);
        }
        if (m14822()) {
            zOnLevelChange |= this.f24478.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f24426) {
            super.onStateChange(iArr);
        }
        return m14820(iArr, this.f24433);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f24447 != i) {
            this.f24447 = i;
            invalidateSelf();
        }
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f24432 != colorFilter) {
            this.f24432 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f24435 != colorStateList) {
            this.f24435 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f24436 != mode) {
            this.f24436 = mode;
            ColorStateList colorStateList = this.f24435;
            this.f24431 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m14823()) {
            visible |= this.f24464.setVisible(z, z2);
        }
        if (m14824()) {
            visible |= this.f24468.setVisible(z, z2);
        }
        if (m14822()) {
            visible |= this.f24478.setVisible(z, z2);
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
    public final void m14801(float f) {
        if (this.f24440 != f) {
            this.f24440 = f;
            invalidateSelf();
            if (m14822()) {
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m14802(float f) {
        if (this.f24476 != f) {
            this.f24476 = f;
            invalidateSelf();
            if (m14822()) {
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m14803(ColorStateList colorStateList) {
        if (this.f24484 != colorStateList) {
            this.f24484 = colorStateList;
            if (this.f24426) {
                C9470 c9470 = this.f24669;
                if (c9470.f24625 != colorStateList) {
                    c9470.f24625 = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14804(boolean z) {
        if (this.f24465 != z) {
            boolean zM14823 = m14823();
            this.f24465 = z;
            boolean zM148232 = m14823();
            if (zM14823 != zM148232) {
                Drawable drawable = this.f24464;
                if (zM148232) {
                    m14817(drawable);
                } else {
                    m14800(drawable);
                }
                invalidateSelf();
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m14805(Drawable drawable) {
        Drawable drawable2 = this.f24478;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM14814 = m14814();
            this.f24478 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC9479.m14909(this.f24482), this.f24478, f24424);
            FocusRingDrawable.m7708(this.f24442, rippleDrawable, null);
            this.f24474 = rippleDrawable;
            float fM148142 = m14814();
            m14800(drawable2);
            if (m14822()) {
                m14817(this.f24478);
            }
            invalidateSelf();
            if (fM14814 != fM148142) {
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m14806(float f) {
        if (this.f24481 != f) {
            this.f24481 = f;
            this.f24441.setStrokeWidth(f);
            if (this.f24426) {
                this.f24669.f24638 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m14807(float f) {
        if (this.f24462 != f) {
            float fM14815 = m14815();
            this.f24462 = f;
            float fM148152 = m14815();
            invalidateSelf();
            if (fM14815 != fM148152) {
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m14808(ColorStateList colorStateList) {
        this.f24461 = true;
        if (this.f24463 != colorStateList) {
            this.f24463 = colorStateList;
            if (m14823()) {
                this.f24464.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m14809(boolean z) {
        if (this.f24472 != z) {
            boolean zM14824 = m14824();
            this.f24472 = z;
            boolean zM148242 = m14824();
            if (zM14824 != zM148242) {
                Drawable drawable = this.f24468;
                if (zM148242) {
                    m14817(drawable);
                } else {
                    m14800(drawable);
                }
                invalidateSelf();
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m14810(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f24467 != colorStateList) {
            this.f24467 = colorStateList;
            if (this.f24472 && (drawable = this.f24468) != null && this.f24471) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m14811(Drawable drawable) {
        Drawable drawable2 = this.f24464;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM14815 = m14815();
            this.f24464 = drawable != null ? drawable.mutate() : null;
            float fM148152 = m14815();
            m14800(drawable2);
            if (m14823()) {
                m14817(this.f24464);
            }
            invalidateSelf();
            if (fM14815 != fM148152) {
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14812(float f) {
        if (this.f24483 != f) {
            this.f24483 = f;
            setShapeAppearanceModel(m14907().mo14854(f));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final float m14813() {
        return this.f24426 ? m14905() : this.f24483;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final float m14814() {
        if (m14822()) {
            return this.f24452 + this.f24476 + this.f24440;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final float m14815() {
        if (!m14823() && !m14824()) {
            return 0.0f;
        }
        float f = this.f24449;
        Drawable drawable = this.f24444 ? this.f24468 : this.f24464;
        float intrinsicWidth = this.f24462;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f24453;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14816(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m14823() || m14824()) {
            float f = this.f24450 + this.f24449;
            Drawable drawable = this.f24444 ? this.f24468 : this.f24464;
            float intrinsicWidth = this.f24462;
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
            Drawable drawable2 = this.f24444 ? this.f24468 : this.f24464;
            float fCeil = this.f24462;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.f24442.getResources().getDisplayMetrics()));
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
    public final void m14817(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f24478) {
            drawable.setTintList(this.f24473);
            if (drawable.isStateful()) {
                drawable.setState(this.f24433);
                return;
            }
            return;
        }
        Drawable drawable2 = this.f24464;
        if (drawable == drawable2 && this.f24461) {
            drawable2.setTintList(this.f24463);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m14818(Drawable drawable) {
        if (this.f24468 != drawable) {
            float fM14815 = m14815();
            this.f24468 = drawable;
            float fM148152 = m14815();
            m14800(this.f24468);
            m14817(this.f24468);
            invalidateSelf();
            if (fM14815 != fM148152) {
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m14819(boolean z) {
        if (this.f24471 != z) {
            this.f24471 = z;
            float fM14815 = m14815();
            if (!z && this.f24444) {
                this.f24444 = false;
            }
            float fM148152 = m14815();
            invalidateSelf();
            if (fM14815 != fM148152) {
                m14821();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m14820(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f24425;
        int iM14888 = m14888(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f24455) : 0);
        boolean state = true;
        if (this.f24455 != iM14888) {
            this.f24455 = iM14888;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f24480;
        int iM148882 = m14888(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f24458) : 0);
        if (this.f24458 != iM148882) {
            this.f24458 = iM148882;
            zOnStateChange = true;
        }
        int iM13534 = AbstractC8496.m13534(iM148882, iM14888);
        if ((this.f24457 != iM13534) | (this.f24669.f24626 == null)) {
            this.f24457 = iM13534;
            m14900(ColorStateList.valueOf(iM13534));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f24484;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f24445) : 0;
        if (this.f24445 != colorForState2) {
            this.f24445 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f24434 != null) {
            int[] iArr3 = AbstractC9479.f24685;
            boolean z3 = false;
            boolean z4 = false;
            for (int i : iArr) {
                if (i == 16842910) {
                    z3 = true;
                } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                    z4 = true;
                }
            }
            colorForState = (z3 && z4) ? this.f24434.getColorForState(iArr, this.f24446) : 0;
        }
        if (this.f24446 != colorForState) {
            this.f24446 = colorForState;
        }
        C9483 c9483 = this.f24456.f10847;
        int colorForState3 = (c9483 == null || (colorStateList = c9483.f24734) == null) ? 0 : colorStateList.getColorForState(iArr, this.f24443);
        if (this.f24443 != colorForState3) {
            this.f24443 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (state2[i2] != 16842912) {
                    i2++;
                } else if (this.f24471) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.f24444 == z || this.f24468 == null) {
            z2 = false;
        } else {
            float fM14815 = m14815();
            this.f24444 = z;
            if (fM14815 != m14815()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f24435;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f24448) : 0;
        if (this.f24448 != colorForState4) {
            this.f24448 = colorForState4;
            ColorStateList colorStateList6 = this.f24435;
            PorterDuff.Mode mode = this.f24436;
            this.f24431 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m14798(this.f24464)) {
            state |= this.f24464.setState(iArr);
        }
        if (m14798(this.f24468)) {
            state |= this.f24468.setState(iArr);
        }
        if (m14798(this.f24478)) {
            int[] iArr4 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
            state |= this.f24478.setState(iArr4);
        }
        if (m14798(this.f24474)) {
            state |= this.f24474.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m14821();
        }
        return state;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m14821() {
        Chip chip = (Chip) this.f24428.get();
        if (chip != null) {
            chip.m7648(chip.f10572);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m14822() {
        return this.f24477 && this.f24478 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final boolean m14823() {
        return this.f24465 && this.f24464 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final boolean m14824() {
        return this.f24472 && this.f24468 != null && this.f24444;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m14825(C9483 c9483) {
        C3987 c3987 = this.f24456;
        C3988 c3988 = c3987.f10851;
        TextPaint textPaint = c3987.f10852;
        if (c3987.f10847 != c9483) {
            c3987.f10847 = c9483;
            if (c9483 != null) {
                Context context = this.f24442;
                c9483.m14912(context, textPaint, c3988);
                C9434 c9434 = (C9434) c3987.f10848.get();
                if (c9434 != null) {
                    textPaint.drawableState = c9434.getState();
                }
                c9483.m14913(context, textPaint, c3988);
                c3987.f10849 = true;
            }
            C9434 c94342 = (C9434) c3987.f10848.get();
            if (c94342 != null) {
                c94342.m14821();
                c94342.invalidateSelf();
                c94342.onStateChange(c94342.getState());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m14826(ColorStateList colorStateList) {
        if (this.f24482 != colorStateList) {
            this.f24482 = colorStateList;
            this.f24434 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final boolean m14827(int[] iArr) {
        if (Arrays.equals(this.f24433, iArr)) {
            return false;
        }
        this.f24433 = iArr;
        if (m14822()) {
            return m14820(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m14828(float f) {
        if (this.f24452 != f) {
            this.f24452 = f;
            invalidateSelf();
            if (m14822()) {
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m14829(float f) {
        if (this.f24453 != f) {
            float fM14815 = m14815();
            this.f24453 = f;
            float fM148152 = m14815();
            invalidateSelf();
            if (fM14815 != fM148152) {
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m14830(float f) {
        if (this.f24449 != f) {
            float fM14815 = m14815();
            this.f24449 = f;
            float fM148152 = m14815();
            invalidateSelf();
            if (fM14815 != fM148152) {
                m14821();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m14831(ColorStateList colorStateList) {
        if (this.f24473 != colorStateList) {
            this.f24473 = colorStateList;
            if (m14822()) {
                this.f24478.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m14832(boolean z) {
        if (this.f24477 != z) {
            boolean zM14822 = m14822();
            this.f24477 = z;
            boolean zM148222 = m14822();
            if (zM14822 != zM148222) {
                Drawable drawable = this.f24478;
                if (zM148222) {
                    m14817(drawable);
                } else {
                    m14800(drawable);
                }
                invalidateSelf();
                m14821();
            }
        }
    }
}
