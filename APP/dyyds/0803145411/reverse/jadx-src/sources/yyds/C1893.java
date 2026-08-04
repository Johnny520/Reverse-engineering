package yyds;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᛸᲇᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1893 extends ReplacementSpan {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0758 f9535;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Paint.FontMetricsInt f9534 = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public float f9533 = 1.0f;

    public C1893(C0758 c0758) {
        AbstractC2217.m4200(c0758, "metadata cannot be null");
        this.f9535 = c0758;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C0331.m1001().getClass();
        C0758 c0758 = this.f9535;
        C0299 c0299 = c0758.f3508;
        Typeface typeface = (Typeface) c0299.f1574;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) c0299.f1573, c0758.f3507 * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f9534;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0758 c0758 = this.f9535;
        this.f9533 = fAbs / (c0758.m1706().m3645(14) != 0 ? ((ByteBuffer) r8.f9366).getShort(r1 + r8.f9365) : (short) 0);
        C0960 c0960M1706 = c0758.m1706();
        int iM3645 = c0960M1706.m3645(14);
        if (iM3645 != 0) {
            ((ByteBuffer) c0960M1706.f9366).getShort(iM3645 + c0960M1706.f9365);
        }
        short s = (short) ((c0758.m1706().m3645(12) != 0 ? ((ByteBuffer) r5.f9366).getShort(r7 + r5.f9365) : (short) 0) * this.f9533);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
