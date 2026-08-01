package p196;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.AbstractC4395;
import p195.AbstractC7834;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7844 extends ReplacementSpan {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f21398;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21400;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Paint.FontMetricsInt f21401;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f21398 = true;
        paint.getTextSize();
        this.f21401 = paint.getFontMetricsInt();
        if (m13201().descent <= m13201().ascent) {
            AbstractC7834.m13198("Invalid fontMetrics: line height can not be negative.");
        }
        this.f21399 = (int) Math.ceil(0.0d);
        this.f21400 = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m13201().ascent;
            fontMetricsInt.descent = m13201().descent;
            fontMetricsInt.leading = m13201().leading;
            if (fontMetricsInt.ascent > (-m13200())) {
                fontMetricsInt.ascent = -m13200();
            }
            fontMetricsInt.top = Math.min(m13201().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m13201().bottom, fontMetricsInt.descent);
        }
        return m13199();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13199() {
        if (!this.f21398) {
            AbstractC7834.m13197("PlaceholderSpan is not laid out yet.");
        }
        return this.f21399;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m13200() {
        if (!this.f21398) {
            AbstractC7834.m13197("PlaceholderSpan is not laid out yet.");
        }
        return this.f21400;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Paint.FontMetricsInt m13201() {
        Paint.FontMetricsInt fontMetricsInt = this.f21401;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC4395.m8908("fontMetrics");
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
