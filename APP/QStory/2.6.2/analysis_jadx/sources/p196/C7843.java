package p196;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.AbstractC4394;
import p195.AbstractC7833;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7843 extends ReplacementSpan {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f21401;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21402;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Paint.FontMetricsInt f21404;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f21401 = true;
        paint.getTextSize();
        this.f21404 = paint.getFontMetricsInt();
        if (m13173().descent <= m13173().ascent) {
            AbstractC7833.m13170("Invalid fontMetrics: line height can not be negative.");
        }
        this.f21402 = (int) Math.ceil(0.0d);
        this.f21403 = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m13173().ascent;
            fontMetricsInt.descent = m13173().descent;
            fontMetricsInt.leading = m13173().leading;
            if (fontMetricsInt.ascent > (-m13172())) {
                fontMetricsInt.ascent = -m13172();
            }
            fontMetricsInt.top = Math.min(m13173().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m13173().bottom, fontMetricsInt.descent);
        }
        return m13171();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13171() {
        if (!this.f21401) {
            AbstractC7833.m13169("PlaceholderSpan is not laid out yet.");
        }
        return this.f21402;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m13172() {
        if (!this.f21401) {
            AbstractC7833.m13169("PlaceholderSpan is not laid out yet.");
        }
        return this.f21403;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Paint.FontMetricsInt m13173() {
        Paint.FontMetricsInt fontMetricsInt = this.f21404;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC4394.m8918("fontMetrics");
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
