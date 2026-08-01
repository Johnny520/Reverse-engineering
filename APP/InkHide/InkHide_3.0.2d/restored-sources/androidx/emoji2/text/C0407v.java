package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p012G.C0137a;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: androidx.emoji2.text.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0407v extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final C0399n f1218b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f1217a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public float f1219c = 1.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0407v(C0399n c0399n) {
        AbstractC0503h.m979g(c0399n, "metadata cannot be null");
        this.f1218b = c0399n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
        C0396k.m761a().getClass();
        C0399n c0399n = this.f1218b;
        C0404s c0404s = c0399n.f1187b;
        Typeface typeface = (Typeface) c0404s.f1212d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) c0404s.f1210b, c0399n.f1186a * 2, 2, f, i5, paint);
        paint.setTypeface(typeface2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1217a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0399n c0399n = this.f1218b;
        this.f1219c = fAbs / (c0399n.m768b().m303a(14) != 0 ? ((ByteBuffer) r8.f437d).getShort(r1 + r8.f434a) : (short) 0);
        C0137a c0137aM768b = c0399n.m768b();
        int iM303a = c0137aM768b.m303a(14);
        if (iM303a != 0) {
            ((ByteBuffer) c0137aM768b.f437d).getShort(iM303a + c0137aM768b.f434a);
        }
        short s2 = (short) ((c0399n.m768b().m303a(12) != 0 ? ((ByteBuffer) r5.f437d).getShort(r7 + r5.f434a) : (short) 0) * this.f1219c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
