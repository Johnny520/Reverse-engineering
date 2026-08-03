package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: Xz */
/* JADX INFO: loaded from: classes.dex */
public final class C1030Xz extends View {

    /* JADX INFO: renamed from: a */
    public boolean f3294a;

    /* JADX INFO: renamed from: b */
    public float f3295b;

    /* JADX INFO: renamed from: c */
    public float f3296c;

    /* JADX INFO: renamed from: d */
    public float f3297d;

    /* JADX INFO: renamed from: e */
    public final Paint f3298e;

    /* JADX INFO: renamed from: f */
    public final Paint f3299f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1416fj f3300g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1030Xz(Context context) {
        super(context, null, 0);
        AbstractC0295Gu.m625r(-493100900284469L);
        Paint paint = new Paint(1);
        this.f3298e = paint;
        Paint paint2 = new Paint(1);
        this.f3299f = paint2;
        paint.setColor(-1);
        paint2.setColor(-3355444);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC0295Gu.m625r(-492585504208949L);
        this.f3297d = this.f3294a ? getWidth() - this.f3295b : this.f3295b;
        float f = this.f3295b;
        float f2 = 2;
        RectF rectF = new RectF(0.0f, 0.0f, f * f2 * f2, f * f2);
        float f3 = this.f3295b;
        canvas.drawRoundRect(rectF, f3, f3, this.f3299f);
        canvas.drawCircle(this.f3297d, this.f3295b, this.f3296c, this.f3298e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(View.MeasureSpec.getSize(i), Math.min(View.MeasureSpec.getSize(i2), AbstractC0295Gu.m616i(25)));
        setMeasuredDimension(iMin * 2, iMin);
        float f = iMin / 2.0f;
        this.f3295b = f;
        this.f3296c = 0.8f * f;
        if (this.f3294a) {
            f *= 2;
        }
        this.f3297d = f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC0295Gu.m625r(-492615568980021L);
        int action = motionEvent.getAction();
        if (action == 0) {
            return true;
        }
        if (action == 1) {
            boolean z = this.f3294a;
            this.f3294a = !z;
            this.f3299f.setColor(!z ? Color.parseColor(AbstractC0295Gu.m625r(-492641338783797L)) : -3355444);
            InterfaceC1416fj interfaceC1416fj = this.f3300g;
            if (interfaceC1416fj != null) {
                interfaceC1416fj.mo90g(Boolean.valueOf(this.f3294a));
            }
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setChecked(boolean z) {
        this.f3294a = z;
        this.f3299f.setColor(z ? Color.parseColor(AbstractC0295Gu.m625r(-492714353227829L)) : -3355444);
        invalidate();
    }

    public final void setOnCheckedChangeListener(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-492675698522165L);
        this.f3300g = interfaceC1416fj;
    }
}
