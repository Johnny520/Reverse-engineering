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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2621vC(Context context) {
        super(context);
        AbstractC0295Gu.m625r(-509353056532533L);
        Paint paint = new Paint(1);
        paint.setColor(-16268960);
        paint.setStrokeWidth(AbstractC0295Gu.m616i(Float.valueOf(3.0f)));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f9102c = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(856146272);
        paint2.setStyle(style);
        this.f9103d = paint2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        CharSequence text;
        String string;
        String strM625r;
        AbstractC0295Gu.m625r(-509387416270901L);
        if (this.f9101b) {
            CharSequence text2 = getText();
            if (text2 == null || (strM625r = text2.toString()) == null) {
                strM625r = AbstractC0295Gu.m625r(-509417481041973L);
            }
            float fMeasureText = getPaint().measureText(strM625r);
            Context context = getContext();
            AbstractC0295Gu.m625r(-509421776009269L);
            float fM617j = AbstractC0295Gu.m617j(8, context);
            Context context2 = getContext();
            AbstractC0295Gu.m625r(-509490495486005L);
            float fM617j2 = AbstractC0295Gu.m617j(2, context2);
            float f = (fM617j * 2.0f) + fMeasureText;
            float width = (getWidth() - f) / 2.0f;
            Context context3 = getContext();
            AbstractC0295Gu.m625r(-509559214962741L);
            float fM617j3 = AbstractC0295Gu.m617j(20, context3);
            canvas.drawRoundRect(new RectF(width, fM617j2, f + width, getHeight() - fM617j2), fM617j3, fM617j3, this.f9103d);
        }
        super.onDraw(canvas);
        if (!this.f9100a || (text = getText()) == null || (string = text.toString()) == null) {
            return;
        }
        float fMeasureText2 = getPaint().measureText(string);
        float width2 = (getWidth() - fMeasureText2) / 2.0f;
        float height = getHeight() - AbstractC0295Gu.m616i(Float.valueOf(2.0f));
        canvas.drawLine(width2, height, width2 + fMeasureText2, height, this.f9102c);
    }
}
