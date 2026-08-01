package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g80 extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final C0523ni f2039b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f2038a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public float f2040c = 1.0f;

    public g80(C0523ni c0523ni) {
        AbstractC0979zt.m2825f("metadata cannot be null", c0523ni);
        this.f2039b = c0523ni;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C0188ei.m1029a().getClass();
        C0523ni c0523ni = this.f2039b;
        C0009a8 c0009a8 = c0523ni.f3416b;
        Typeface typeface = (Typeface) c0009a8.f67d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) c0009a8.f65b, c0523ni.f3415a * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f2038a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0523ni c0523ni = this.f2039b;
        this.f2040c = fAbs / (c0523ni.m1946b().m2359a(14) != 0 ? ((ByteBuffer) r8.f4513d).getShort(r1 + r8.f4510a) : (short) 0);
        C0833vv c0833vvM1946b = c0523ni.m1946b();
        int iM2359a = c0833vvM1946b.m2359a(14);
        if (iM2359a != 0) {
            ((ByteBuffer) c0833vvM1946b.f4513d).getShort(iM2359a + c0833vvM1946b.f4510a);
        }
        short s = (short) ((c0523ni.m1946b().m2359a(12) != 0 ? ((ByteBuffer) r5.f4513d).getShort(r7 + r5.f4510a) : (short) 0) * this.f2040c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
