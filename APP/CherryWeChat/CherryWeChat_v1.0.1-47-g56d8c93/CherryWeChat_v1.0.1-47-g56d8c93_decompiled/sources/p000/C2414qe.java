package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: qe */
/* JADX INFO: loaded from: classes.dex */
public final class C2414qe extends TextView {

    /* JADX INFO: renamed from: a */
    public int f8466a;

    /* JADX INFO: renamed from: b */
    public boolean f8467b;

    /* JADX INFO: renamed from: c */
    public final Paint f8468c;

    /* JADX INFO: renamed from: d */
    public final Paint f8469d;

    /* JADX INFO: renamed from: e */
    public final RectF f8470e;

    /* JADX INFO: renamed from: f */
    public final RectF f8471f;

    /* JADX INFO: renamed from: g */
    public final float f8472g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2414qe(Context context) {
        super(context, null, 0);
        AbstractC0295Gu.m625r(-493852519561269L);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.buttonPrimary));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.f8468c = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.buttonPrimary));
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        this.f8469d = paint2;
        this.f8470e = new RectF();
        this.f8471f = new RectF();
        this.f8472g = AbstractC0295Gu.m616i(8);
        setTextSize(13.0f);
        setText(AbstractC0295Gu.m625r(-493886879299637L));
        setTextColor(context.getColor(R.color.buttonTextPrimary));
        setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6));
        setGravity(17);
        setMinWidth(AbstractC0295Gu.m616i(50));
        setBackground(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m4856a() {
        AbstractC1208bA.m2328a(new RunnableC2320oe(this, 2));
    }

    /* JADX INFO: renamed from: b */
    public final void m4857b(int i) {
        AbstractC1208bA.m2328a(new RunnableC2371pe(i, 0, this));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC0295Gu.m625r(-493899764201525L);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f8471f;
        rectF.set(0.0f, 0.0f, width, height);
        boolean z = this.f8467b;
        Paint paint = this.f8469d;
        if (z) {
            paint.setAlpha(128);
        } else {
            paint.setAlpha(255);
        }
        float f = this.f8472g;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (this.f8467b) {
            float height2 = getHeight();
            RectF rectF2 = this.f8470e;
            rectF2.set(0.0f, 0.0f, (getWidth() * this.f8466a) / 100.0f, height2);
            canvas.drawRoundRect(rectF2, f, f, this.f8468c);
        }
        setTextColor(getContext().getColor(R.color.buttonTextPrimary));
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iM616i = AbstractC0295Gu.m616i(32);
        if (getMeasuredHeight() < iM616i) {
            setMeasuredDimension(getMeasuredWidth(), iM616i);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f8469d.setColor(i);
        invalidate();
    }
}
