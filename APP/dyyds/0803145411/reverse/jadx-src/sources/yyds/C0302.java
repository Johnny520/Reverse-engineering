package yyds;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.ImageView;

/* JADX INFO: renamed from: yyds.ᛲᛳᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0302 extends ImageView {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final int f1594 = Color.rgb(61, 196, 106);

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final int f1595 = Color.rgb(255, 77, 79);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f1596;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final RunnableC0309 f1597;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final Paint f1598;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final RectF f1599;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Path f1600;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public EnumC0676 f1601;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public long f1602;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Paint f1603;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final float f1604;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final RectF f1605;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final float f1606;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0302(Context context) {
        super(context, null, 0);
        AbstractC2328.m4341(-967415186490222L);
        float f = getResources().getDisplayMetrics().density;
        this.f1604 = f;
        float f2 = f * 1.5f;
        this.f1606 = f2;
        this.f1599 = new RectF();
        this.f1605 = new RectF();
        this.f1600 = new Path();
        TypedValue typedValue = new TypedValue();
        int color = getContext().getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true) ? typedValue.resourceId != 0 ? getContext().getColor(typedValue.resourceId) : typedValue.data : -1;
        this.f1596 = color;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setColor(color);
        this.f1598 = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(color);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        this.f1603 = paint2;
        EnumC0676 enumC0676 = EnumC0676.f3220;
        this.f1601 = enumC0676;
        this.f1597 = new RunnableC0309(16, this);
        setContentDescription(m964(enumC0676));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m964(EnumC0676 enumC0676) {
        int iOrdinal = enumC0676.ordinal();
        if (iOrdinal == 0) {
            return AbstractC2328.m4341(-967505380803438L);
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return AbstractC2328.m4341(-967544035509102L);
        }
        if (iOrdinal == 3) {
            return AbstractC2328.m4341(-967565510345582L);
        }
        if (iOrdinal == 4) {
            return AbstractC2328.m4341(-967595575116654L);
        }
        C0188.m801();
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static boolean m965(EnumC0676 enumC0676) {
        return enumC0676 == EnumC0676.f3222 || enumC0676 == EnumC0676.f3218;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1597);
        EnumC0676 enumC0676 = EnumC0676.f3220;
        this.f1601 = enumC0676;
        this.f1602 = 0L;
        setContentDescription(m964(enumC0676));
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC2328.m4341(-967475316032366L);
        float f = this.f1606 / 2.0f;
        float f2 = this.f1604;
        float f3 = f + f2;
        RectF rectF = this.f1599;
        rectF.set(f3, f3, getWidth() - f3, getHeight() - f3);
        Paint paint = this.f1598;
        int i = this.f1596;
        paint.setColor(i);
        paint.setAlpha(m965(this.f1601) ? 38 : 26);
        canvas.drawOval(rectF, paint);
        int iOrdinal = this.f1601.ordinal();
        if (iOrdinal == 0) {
            int iSave = canvas.save();
            canvas.rotate(180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
        } else if (iOrdinal == 1) {
            paint.setColor(i);
            paint.setAlpha(230);
            canvas.drawArc(rectF, ((((SystemClock.uptimeMillis() - this.f1602) % 760) * 360.0f) / 760.0f) - 90.0f, 92.0f, false, paint);
            m966(canvas);
        } else if (iOrdinal != 2) {
            Paint paint2 = this.f1603;
            if (iOrdinal == 3) {
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                Path path = this.f1600;
                path.reset();
                path.moveTo(width - (5.0f * f2), height);
                path.lineTo(width - (1.3f * f2), (3.6f * f2) + height);
                path.lineTo((5.5f * f2) + width, height - (4.2f * f2));
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeWidth(f2 * 2.0f);
                paint2.setColor(f1594);
                paint2.setAlpha(235);
                canvas.drawPath(path, paint2);
            } else {
                if (iOrdinal != 4) {
                    C0188.m801();
                    return;
                }
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeWidth(2.0f * f2);
                paint2.setColor(f1595);
                paint2.setAlpha(235);
                float f4 = 5.0f * f2;
                canvas.drawLine(width2, height2 - f4, width2, (1.5f * f2) + height2, paint2);
                paint2.setStyle(Paint.Style.FILL);
                canvas.drawCircle(width2, f4 + height2, f2 * 1.15f, paint2);
            }
        } else {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f1602;
            float fSin = (((float) ((Math.sin((((double) ((jUptimeMillis % 1100) / 1100.0f)) * 3.141592653589793d) * 2.0d) + 1.0d) / 2.0d)) * 104.0f) + 64.0f;
            paint.setColor(i);
            paint.setAlpha(230);
            canvas.drawArc(rectF, (((jUptimeMillis % 1050) * 360.0f) / 1050.0f) - 90.0f, fSin, false, paint);
            m966(canvas);
        }
        if (m965(this.f1601) && isShown()) {
            postInvalidateOnAnimation();
        }
    }

    public final void setRunning(boolean z) {
        m967(z ? EnumC0676.f3222 : EnumC0676.f3220, 0L);
    }

    public final void setState(EnumC0676 enumC0676) {
        AbstractC2328.m4341(-967685769429870L);
        m967(enumC0676, 0L);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m966(Canvas canvas) {
        float f = this.f1604;
        float f2 = (5.5f * f) / 2.0f;
        float width = (getWidth() / 2.0f) - f2;
        float height = (getHeight() / 2.0f) - f2;
        float width2 = (getWidth() / 2.0f) + f2;
        float height2 = (getHeight() / 2.0f) + f2;
        RectF rectF = this.f1605;
        rectF.set(width, height, width2, height2);
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f1603;
        paint.setStyle(style);
        paint.setColor(this.f1596);
        paint.setAlpha(235);
        float f3 = f * 1.0f;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m967(EnumC0676 enumC0676, long j) {
        AbstractC2328.m4341(-967449546228590L);
        RunnableC0309 runnableC0309 = this.f1597;
        removeCallbacks(runnableC0309);
        boolean z = this.f1601 != enumC0676;
        this.f1601 = enumC0676;
        setContentDescription(m964(enumC0676));
        if (z) {
            this.f1602 = m965(enumC0676) ? SystemClock.uptimeMillis() : 0L;
        } else if (m965(enumC0676) && this.f1602 == 0) {
            this.f1602 = SystemClock.uptimeMillis();
        }
        if (enumC0676 != EnumC0676.f3220 && j > 0) {
            postDelayed(runnableC0309, j);
        }
        invalidate();
    }
}
