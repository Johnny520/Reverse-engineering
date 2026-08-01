package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m80 extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final C0597pi f3107b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f3106a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public float f3108c = 1.0f;

    public m80(C0597pi c0597pi) {
        AbstractC0498mu.m1887d("metadata cannot be null", c0597pi);
        this.f3107b = c0597pi;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C0262gi.m1277a().getClass();
        C0597pi c0597pi = this.f3107b;
        C0402k8 c0402k8 = c0597pi.f3713b;
        Typeface typeface = (Typeface) c0402k8.f2797d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) c0402k8.f2795b, c0597pi.f3712a * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f3106a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0597pi c0597pi = this.f3107b;
        this.f3108c = fAbs / (c0597pi.m2091b().m2795a(14) != 0 ? ((ByteBuffer) r8.f5550d).getShort(r1 + r8.f5547a) : (short) 0);
        C0129cw c0129cwM2091b = c0597pi.m2091b();
        int iM2795a = c0129cwM2091b.m2795a(14);
        if (iM2795a != 0) {
            ((ByteBuffer) c0129cwM2091b.f5550d).getShort(iM2795a + c0129cwM2091b.f5547a);
        }
        short s = (short) ((c0597pi.m2091b().m2795a(12) != 0 ? ((ByteBuffer) r5.f5550d).getShort(r7 + r5.f5547a) : (short) 0) * this.f3108c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
