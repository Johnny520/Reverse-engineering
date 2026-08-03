package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ZB */
/* JADX INFO: loaded from: classes.dex */
public final class C1086ZB extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final C1043YB f3460b;

    /* JADX INFO: renamed from: e */
    public TextPaint f3463e;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f3459a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f3461c = -1;

    /* JADX INFO: renamed from: d */
    public float f3462d = 1.0f;

    public C1086ZB(C1043YB c1043yb) {
        AbstractC1293cr.m2548g("rasterizer cannot be null", c1043yb);
        this.f3460b = c1043yb;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
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
                    TextPaint textPaint2 = this.f3463e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f3463e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
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
            canvas.drawRect(f, i3, f + this.f3461c, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C2372pf.m4798a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C1043YB c1043yb = this.f3460b;
        C2428qs c2428qs = c1043yb.f3333b;
        Typeface typeface = (Typeface) c2428qs.f8523d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c2428qs.f8521b, c1043yb.f3332a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f3459a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C1043YB c1043yb = this.f3460b;
        this.f3462d = fAbs / (c1043yb.m1992b().m4624a(14) != 0 ? ((ByteBuffer) r8.f8037d).getShort(r1 + r8.f8034a) : (short) 0);
        C0636Or c0636OrM1992b = c1043yb.m1992b();
        int iM4624a = c0636OrM1992b.m4624a(14);
        if (iM4624a != 0) {
            ((ByteBuffer) c0636OrM1992b.f8037d).getShort(iM4624a + c0636OrM1992b.f8034a);
        }
        short s = (short) ((c1043yb.m1992b().m4624a(12) != 0 ? ((ByteBuffer) r5.f8037d).getShort(r7 + r5.f8034a) : (short) 0) * this.f3462d);
        this.f3461c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
