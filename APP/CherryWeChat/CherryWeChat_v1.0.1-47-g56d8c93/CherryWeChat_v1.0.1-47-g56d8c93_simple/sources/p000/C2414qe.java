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

    public C2414qe(Context r6) {
        AbstractC0295Gu.m625r(-493852519561269L);
        super(r6, null, 0);
        Paint r1 = new Paint();
        r1.setColor(r6.getColor(R.color.buttonPrimary));
        Paint.Style r3 = Paint.Style.FILL;
        r1.setStyle(r3);
        r1.setAntiAlias(true);
        this.f8468c = r1;
        Paint r12 = new Paint();
        r12.setColor(r6.getColor(R.color.buttonPrimary));
        r12.setStyle(r3);
        r12.setAntiAlias(true);
        this.f8469d = r12;
        this.f8470e = new RectF();
        this.f8471f = new RectF();
        this.f8472g = AbstractC0295Gu.m616i(8);
        setTextSize(13.0f);
        setText(AbstractC0295Gu.m625r(-493886879299637L));
        setTextColor(r6.getColor(R.color.buttonTextPrimary));
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
    public final void m4857b(int r3) {
        AbstractC1208bA.m2328a(new RunnableC2371pe(r3, 0, this));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas r6) {
        AbstractC0295Gu.m625r(-493899764201525L);
        float r0 = getWidth();
        float r1 = getHeight();
        RectF r2 = this.f8471f;
        r2.set(0.0f, 0.0f, r0, r1);
        boolean r02 = this.f8467b;
        Paint r12 = this.f8469d;
        if (r02 == false) goto L5;
        r12.setAlpha(128);
    L6:
        float r03 = this.f8472g;
        r6.drawRoundRect(r2, r03, r03, r12);
        if (this.f8467b == false) goto L9;
        float r22 = getHeight();
        RectF r4 = this.f8470e;
        r4.set(0.0f, 0.0f, (getWidth() * this.f8466a) / 100.0f, r22);
        r6.drawRoundRect(r4, r03, r03, this.f8468c);
    L9:
        setTextColor(getContext().getColor(R.color.buttonTextPrimary));
        super.onDraw(r6);
        return;
    L5:
        r12.setAlpha(255);
        goto L6
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r12 = AbstractC0295Gu.m616i(32);
        if (getMeasuredHeight() >= r12) goto L6;
        setMeasuredDimension(getMeasuredWidth(), r12);
        return;
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
        this.f8469d.setColor(r2);
        invalidate();
    }
}
