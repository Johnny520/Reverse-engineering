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

    public C1030Xz(Context r3) {
        AbstractC0295Gu.m625r(-493100900284469L);
        super(r3, null, 0);
        Paint r32 = new Paint(1);
        this.f3298e = r32;
        Paint r1 = new Paint(1);
        this.f3299f = r1;
        r32.setColor(-1);
        r1.setColor(-3355444);
    }

    @Override // android.view.View
    public final void onDraw(Canvas r5) {
        AbstractC0295Gu.m625r(-492585504208949L);
        if (this.f3294a == false) goto L5;
        float r0 = getWidth() - this.f3295b;
    L6:
        this.f3297d = r0;
        float r1 = this.f3295b;
        float r2 = 2;
        RectF r02 = new RectF(0.0f, 0.0f, (r1 * r2) * r2, r1 * r2);
        float r12 = this.f3295b;
        r5.drawRoundRect(r02, r12, r12, this.f3299f);
        r5.drawCircle(this.f3297d, this.f3295b, this.f3296c, this.f3298e);
        return;
    L5:
        r0 = this.f3295b;
        goto L6
    }

    @Override // android.view.View
    public final void onMeasure(int r2, int r3) {
        int r22 = Math.min(View.MeasureSpec.getSize(r2), Math.min(View.MeasureSpec.getSize(r3), AbstractC0295Gu.m616i(25)));
        setMeasuredDimension(r22 * 2, r22);
        float r23 = r22 / 2.0f;
        this.f3295b = r23;
        this.f3296c = 0.8f * r23;
        if (this.f3294a == false) goto L5;
        r23 = r23 * 2;
    L5:
        this.f3297d = r23;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r3) {
        AbstractC0295Gu.m625r(-492615568980021L);
        int r0 = r3.getAction();
        if (r0 == 0) goto L16;
        if (r0 != 1) goto L15;
        boolean r02 = this.f3294a;
        this.f3294a = !r02;
        if (r02 == true) goto L9;
        int r03 = Color.parseColor(AbstractC0295Gu.m625r(-492641338783797L));
    L10:
        this.f3299f.setColor(r03);
        InterfaceC1416fj r04 = this.f3300g;
        if (r04 == null) goto L13;
        r04.mo90g(Boolean.valueOf(this.f3294a));
    L13:
        invalidate();
        goto L15
    L9:
        r03 = -3355444;
    L15:
        return super.onTouchEvent(r3);
    L16:
        return true;
    }

    public final void setChecked(boolean r3) {
        this.f3294a = r3;
        if (r3 == false) goto L5;
        int r32 = Color.parseColor(AbstractC0295Gu.m625r(-492714353227829L));
    L6:
        this.f3299f.setColor(r32);
        invalidate();
        return;
    L5:
        r32 = -3355444;
        goto L6
    }

    public final void setOnCheckedChangeListener(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-492675698522165L);
        this.f3300g = r3;
    }
}
