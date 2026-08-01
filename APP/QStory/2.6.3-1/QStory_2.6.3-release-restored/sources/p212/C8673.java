package p212;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.AbstractC5227;
import p211.AbstractC8663;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8673 extends ReplacementSpan {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f21743;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21744;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Paint.FontMetricsInt f21746;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f21743 = true;
        paint.getTextSize();
        this.f21746 = paint.getFontMetricsInt();
        if (m13760().descent <= m13760().ascent) {
            AbstractC8663.m13757("Invalid fontMetrics: line height can not be negative.");
        }
        this.f21744 = (int) Math.ceil(0.0d);
        this.f21745 = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m13760().ascent;
            fontMetricsInt.descent = m13760().descent;
            fontMetricsInt.leading = m13760().leading;
            if (fontMetricsInt.ascent > (-m13759())) {
                fontMetricsInt.ascent = -m13759();
            }
            fontMetricsInt.top = Math.min(m13760().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m13760().bottom, fontMetricsInt.descent);
        }
        return m13758();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13758() {
        if (!this.f21743) {
            AbstractC8663.m13756("PlaceholderSpan is not laid out yet.");
        }
        return this.f21744;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m13759() {
        if (!this.f21743) {
            AbstractC8663.m13756("PlaceholderSpan is not laid out yet.");
        }
        return this.f21745;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Paint.FontMetricsInt m13760() {
        Paint.FontMetricsInt fontMetricsInt = this.f21746;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC5227.m9467("fontMetrics");
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
