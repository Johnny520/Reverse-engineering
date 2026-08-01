package p031c4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.emoji2.text.C0644c;

/* JADX INFO: renamed from: c4.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1324j extends AbstractC1320f {

    /* JADX INFO: renamed from: w */
    public static Paint f3963w;

    /* JADX INFO: renamed from: v */
    public TextPaint f3964v;

    public C1324j(C1323i c1323i) {
        super(c1323i);
    }

    /* JADX INFO: renamed from: e */
    public static Paint m5326e() {
        if (f3963w == null) {
            TextPaint textPaint = new TextPaint();
            f3963w = textPaint;
            textPaint.setColor(C0644c.m2516c().m2520e());
            f3963w.setStyle(Paint.Style.FILL);
        }
        return f3963w;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m5327c(CharSequence charSequence, int i10, int i11, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f3964v;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f3964v = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m5328d(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaintM5327c = m5327c(charSequence, i10, i11, paint);
        if (textPaintM5327c != null && textPaintM5327c.bgColor != 0) {
            m5328d(canvas, textPaintM5327c, f10, f10 + m5304b(), i12, i14);
        }
        Paint paint2 = textPaintM5327c;
        if (C0644c.m2516c().m2523j()) {
            canvas.drawRect(f10, i12, f10 + m5304b(), i14, m5326e());
        }
        C1323i c1323iM5303a = m5303a();
        float f11 = i13;
        if (paint2 == null) {
            paint2 = paint;
        }
        c1323iM5303a.m5313a(canvas, f10, f11, paint2);
    }
}
