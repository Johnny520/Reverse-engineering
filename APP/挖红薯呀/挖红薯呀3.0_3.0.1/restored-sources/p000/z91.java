package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class z91 extends ReplacementSpan {

    /* JADX INFO: renamed from: e */
    public final y91 f7849e;

    /* JADX INFO: renamed from: h */
    public TextPaint f7852h;

    /* JADX INFO: renamed from: d */
    public final Paint.FontMetricsInt f7848d = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: f */
    public short f7850f = -1;

    /* JADX INFO: renamed from: g */
    public float f7851g = 1.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z91(y91 y91Var) {
        v50.m4402g(y91Var, "rasterizer cannot be null");
        this.f7849e = y91Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f7852h;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f7852h = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f7850f, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C0699rr.m3981a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        y91 y91Var = this.f7849e;
        C0948y2 c0948y2 = y91Var.f7587b;
        Typeface typeface = (Typeface) c0948y2.f7494g;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c0948y2.f7492e, y91Var.f7586a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f7848d;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        y91 y91Var = this.f7849e;
        this.f7851g = fAbs / (y91Var.m5225b().m925a(14) != 0 ? ((ByteBuffer) r8.f1423g).getShort(r1 + r8.f1420d) : (short) 0);
        fe0 fe0VarM5225b = y91Var.m5225b();
        int iM925a = fe0VarM5225b.m925a(14);
        if (iM925a != 0) {
            ((ByteBuffer) fe0VarM5225b.f1423g).getShort(iM925a + fe0VarM5225b.f1420d);
        }
        short s = (short) ((y91Var.m5225b().m925a(12) != 0 ? ((ByteBuffer) r5.f1423g).getShort(r7 + r5.f1420d) : (short) 0) * this.f7851g);
        this.f7850f = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
