package p000a;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a.R5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0313R5 extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final C0359Tf f1120b;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f1119a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f1121c = -1;

    /* JADX INFO: renamed from: d */
    public float f1122d = 1.0f;

    public AbstractC0313R5(C0359Tf c0359Tf) {
        C0726n9.m1665h(c0359Tf, "rasterizer cannot be null");
        this.f1120b = c0359Tf;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1119a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0359Tf c0359Tf = this.f1120b;
        this.f1122d = fAbs / (c0359Tf.m972b().m849a(14) != 0 ? ((ByteBuffer) r8.f1105d).getShort(r1 + r8.f1102a) : (short) 0);
        C0633ib c0633ibM972b = c0359Tf.m972b();
        int iM849a = c0633ibM972b.m849a(14);
        if (iM849a != 0) {
            ((ByteBuffer) c0633ibM972b.f1105d).getShort(iM849a + c0633ibM972b.f1102a);
        }
        short s = (short) ((c0359Tf.m972b().m849a(12) != 0 ? ((ByteBuffer) r5.f1105d).getShort(r7 + r5.f1102a) : (short) 0) * this.f1122d);
        this.f1121c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
