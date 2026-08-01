package p167;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import androidx.emoji2.text.flatbuffer.C2302;
import java.nio.ByteBuffer;
import p034.AbstractC6344;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7700 extends ReplacementSpan {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public TextPaint f20887;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7699 f20889;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Paint.FontMetricsInt f20891 = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public short f20890 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f20888 = 1.0f;

    public C7700(C7699 c7699) {
        AbstractC6344.m11870(c7699, "rasterizer cannot be null");
        this.f20889 = c7699;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19, java.lang.CharSequence r20, int r21, int r22, float r23, int r24, int r25, int r26, android.graphics.Paint r27) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r27
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L4e
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            r5 = r21
            r6 = r22
            java.lang.Object[] r1 = r1.getSpans(r5, r6, r3)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            int r3 = r1.length
            if (r3 == 0) goto L46
            int r3 = r1.length
            r5 = 0
            r6 = 1
            if (r3 != r6) goto L26
            r3 = r1[r5]
            if (r3 != r0) goto L26
            goto L46
        L26:
            android.text.TextPaint r3 = r0.f20887
            if (r3 != 0) goto L31
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r0.f20887 = r3
        L31:
            r4 = r3
            r4.set(r2)
        L35:
            int r3 = r1.length
            if (r5 >= r3) goto L44
            r3 = r1[r5]
            boolean r6 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r6 != 0) goto L41
            r3.updateDrawState(r4)
        L41:
            int r5 = r5 + 1
            goto L35
        L44:
            r10 = r4
            goto L56
        L46:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L44
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L44
        L4e:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L44
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L44
        L56:
            if (r10 == 0) goto L86
            int r1 = r10.bgColor
            if (r1 == 0) goto L86
            short r1 = r0.f20890
            float r1 = (float) r1
            float r8 = r23 + r1
            r1 = r24
            float r7 = (float) r1
            r1 = r26
            float r9 = (float) r1
            int r1 = r10.getColor()
            android.graphics.Paint$Style r3 = r10.getStyle()
            int r4 = r10.bgColor
            r10.setColor(r4)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r10.setStyle(r4)
            r5 = r19
            r6 = r23
            r5.drawRect(r6, r7, r8, r9, r10)
            r10.setStyle(r3)
            r10.setColor(r1)
        L86:
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲世兰 r1 = p167.C7713.m13010()
            r1.getClass()
            r1 = r25
            float r1 = (float) r1
            if (r10 == 0) goto L93
            goto L94
        L93:
            r10 = r2
        L94:
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰哲世苏 r0 = r0.f20889
            androidx.compose.animation.core.飘花落叶言子哲楪苏世兰 r2 = r0.f20885
            java.lang.Object r3 = r2.f1093
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            android.graphics.Typeface r4 = r10.getTypeface()
            r10.setTypeface(r3)
            int r0 = r0.f20886
            int r13 = r0 * 2
            java.lang.Object r0 = r2.f1096
            r12 = r0
            char[] r12 = (char[]) r12
            r14 = 2
            r11 = r19
            r15 = r23
            r16 = r1
            r17 = r10
            r11.drawText(r12, r13, r14, r15, r16, r17)
            r10.setTypeface(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p167.C7700.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f20891;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C7699 c7699 = this.f20889;
        this.f20888 = fAbs / (c7699.m12995().m4001(14) != 0 ? ((ByteBuffer) r8.f6464).getShort(r1 + r8.f6467) : (short) 0);
        C2302 c2302M12995 = c7699.m12995();
        int iM4001 = c2302M12995.m4001(14);
        if (iM4001 != 0) {
            ((ByteBuffer) c2302M12995.f6464).getShort(iM4001 + c2302M12995.f6467);
        }
        short s = (short) ((c7699.m12995().m4001(12) != 0 ? ((ByteBuffer) r5.f6464).getShort(r7 + r5.f6467) : (short) 0) * this.f20888);
        this.f20890 = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
