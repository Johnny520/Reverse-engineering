package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;

/* JADX INFO: renamed from: vC */
/* JADX INFO: loaded from: classes.dex */
public final class C2621vC extends TextView {

    /* JADX INFO: renamed from: a */
    public boolean f9100a;

    /* JADX INFO: renamed from: b */
    public boolean f9101b;

    /* JADX INFO: renamed from: c */
    public final Paint f9102c;

    /* JADX INFO: renamed from: d */
    public final Paint f9103d;

    public C2621vC(Context r3) {
        AbstractC0295Gu.m625r(-509353056532533L);
        super(r3);
        Paint r32 = new Paint(1);
        r32.setColor(-16268960);
        r32.setStrokeWidth(AbstractC0295Gu.m616i(Float.valueOf(3.0f)));
        Paint.Style r1 = Paint.Style.FILL;
        r32.setStyle(r1);
        this.f9102c = r32;
        Paint r33 = new Paint(1);
        r33.setColor(856146272);
        r33.setStyle(r1);
        this.f9103d = r33;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas r10) {
        AbstractC0295Gu.m625r(-509387416270901L);
        if (this.f9101b == false) goto L10;
        CharSequence r0 = getText();
        if (r0 == null) goto L8;
        String r02 = r0.toString();
        if (r02 == null) goto L8;
    L9:
        float r03 = getPaint().measureText(r02);
        Context r3 = getContext();
        AbstractC0295Gu.m625r(-509421776009269L);
        float r2 = AbstractC0295Gu.m617j(8, r3);
        Context r4 = getContext();
        AbstractC0295Gu.m625r(-509490495486005L);
        float r32 = AbstractC0295Gu.m617j(2, r4);
        float r22 = (r2 * 2.0f) + r03;
        float r42 = (getWidth() - r22) / 2.0f;
        Context r6 = getContext();
        AbstractC0295Gu.m625r(-509559214962741L);
        float r04 = AbstractC0295Gu.m617j(20, r6);
        r10.drawRoundRect(new RectF(r42, r32, r22 + r42, getHeight() - r32), r04, r04, this.f9103d);
    L8:
        r02 = AbstractC0295Gu.m625r(-509417481041973L);
    L10:
        super.onDraw(r10);
        if (this.f9100a == false) goto L19;
        CharSequence r05 = getText();
        if (r05 == null) goto L20;
        String r06 = r05.toString();
        if (r06 == null) goto L21;
        float r07 = getPaint().measureText(r06);
        float r43 = (getWidth() - r07) / 2.0f;
        float r5 = getHeight() - AbstractC0295Gu.m616i(Float.valueOf(2.0f));
        r10.drawLine(r43, r5, r43 + r07, r5, this.f9102c);
        return;
    L21:
        return;
    L20:
        return;
    }
}
