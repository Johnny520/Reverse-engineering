package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.C8812;

/* JADX INFO: renamed from: Yue.ۥۢۢۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
@InterfaceC7113(19)
public final class C8034 extends AbstractC4622 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6490
    public static Paint f23870;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6490
    public TextPaint f23871;

    public C8034(@InterfaceC6391 C8033 c8033) {
        super(c8033);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Paint m25410() {
        if (f23870 == null) {
            TextPaint textPaint = new TextPaint();
            f23870 = textPaint;
            textPaint.setColor(C8812.m29617().m29630());
            f23870.setStyle(Paint.Style.FILL);
        }
        return f23870;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@InterfaceC6391 Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, float f, int i3, int i4, int i5, @InterfaceC6391 Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaintM25411 = m25411(charSequence, i, i2, paint2);
        if (textPaintM25411 != null && textPaintM25411.bgColor != 0) {
            m25412(canvas, textPaintM25411, f, f + m13895(), i3, i5);
        }
        if (C8812.m29617().m29635()) {
            canvas.drawRect(f, i3, f + m13895(), i5, m25410());
        }
        C8033 c8033M13894 = m13894();
        float f2 = i4;
        if (textPaintM25411 != null) {
            paint2 = textPaintM25411;
        }
        c8033M13894.m4050(canvas, f, f2, paint2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final TextPaint m25411(@InterfaceC6490 CharSequence charSequence, int i, int i2, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f23871;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f23871 = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m25412(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
