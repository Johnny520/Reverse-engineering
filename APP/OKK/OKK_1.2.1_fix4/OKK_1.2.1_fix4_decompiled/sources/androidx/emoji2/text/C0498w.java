package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p001A0.AbstractC0040p;
import p023M.C0247a;
import p043Y.C0463v;

/* JADX INFO: renamed from: androidx.emoji2.text.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0498w extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final C0497v f1402b;

    /* JADX INFO: renamed from: e */
    public TextPaint f1405e;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f1401a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f1403c = -1;

    /* JADX INFO: renamed from: d */
    public float f1404d = 1.0f;

    public C0498w(C0497v c0497v) {
        AbstractC0040p.m106i(c0497v, "rasterizer cannot be null");
        this.f1402b = c0497v;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i2, i3, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f1405e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f1405e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint2 instanceof TextPaint) {
                    textPaint = (TextPaint) paint2;
                }
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f2, i4, f2 + this.f1403c, i6, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        C0485j.m1199a().getClass();
        float f3 = i5;
        Paint paint3 = paint2;
        if (textPaint != null) {
            paint3 = textPaint;
        }
        C0497v c0497v = this.f1402b;
        C0463v c0463v = c0497v.f1399b;
        Typeface typeface = (Typeface) c0463v.f1047d;
        Typeface typeface2 = paint3.getTypeface();
        paint3.setTypeface(typeface);
        canvas.drawText((char[]) c0463v.f1045b, c0497v.f1398a * 2, 2, f2, f3, paint3);
        paint3.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1401a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0497v c0497v = this.f1402b;
        this.f1404d = fAbs / (c0497v.m1220c().m205a(14) != 0 ? ((ByteBuffer) r8.f214d).getShort(r1 + r8.f211a) : (short) 0);
        C0247a c0247aM1220c = c0497v.m1220c();
        int iM205a = c0247aM1220c.m205a(14);
        if (iM205a != 0) {
            ((ByteBuffer) c0247aM1220c.f214d).getShort(iM205a + c0247aM1220c.f211a);
        }
        short s2 = (short) ((c0497v.m1220c().m205a(12) != 0 ? ((ByteBuffer) r5.f214d).getShort(r7 + r5.f211a) : (short) 0) * this.f1404d);
        this.f1403c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
