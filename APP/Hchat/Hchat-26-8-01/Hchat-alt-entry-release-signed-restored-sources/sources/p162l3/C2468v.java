package p162l3;

import ac.AbstractC0063p;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p109hb.C1671c;
import p178m3.C2775a;

/* JADX INFO: renamed from: l3.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2468v extends ReplacementSpan {

    /* JADX INFO: renamed from: h */
    public final C2467u f8099h;

    /* JADX INFO: renamed from: k */
    public TextPaint f8102k;

    /* JADX INFO: renamed from: g */
    public final Paint.FontMetricsInt f8098g = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: i */
    public short f8100i = -1;

    /* JADX INFO: renamed from: j */
    public float f8101j = 1.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2468v(C2467u c2467u) {
        AbstractC0063p.m418k(c2467u, "rasterizer cannot be null");
        this.f8099h = c2467u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f3, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i9, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f8102k;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f8102k = textPaint2;
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
            canvas.drawRect(f3, i11, f3 + this.f8100i, i13, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C2455i.m5846a().getClass();
        float f10 = i12;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C2467u c2467u = this.f8099h;
        C1671c c1671c = c2467u.f8096b;
        Typeface typeface = (Typeface) c1671c.f5523j;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c1671c.f5521h, c2467u.f8095a * 2, 2, f3, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f8098g;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C2467u c2467u = this.f8099h;
        this.f8101j = fAbs / (c2467u.m5863b().m6155a(14) != 0 ? ((ByteBuffer) r8.f9018j).getShort(r1 + r8.f9015g) : (short) 0);
        C2775a c2775aM5863b = c2467u.m5863b();
        int iM6155a = c2775aM5863b.m6155a(14);
        if (iM6155a != 0) {
            ((ByteBuffer) c2775aM5863b.f9018j).getShort(iM6155a + c2775aM5863b.f9015g);
        }
        short s10 = (short) ((c2467u.m5863b().m6155a(12) != 0 ? ((ByteBuffer) r5.f9018j).getShort(r7 + r5.f9015g) : (short) 0) * this.f8101j);
        this.f8100i = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
