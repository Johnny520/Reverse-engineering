package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 extends ReplacementSpan {

    /* JADX INFO: renamed from: h */
    public Paint.FontMetricsInt f12231h;

    /* JADX INFO: renamed from: i */
    public int f12232i;

    /* JADX INFO: renamed from: j */
    public int f12233j;

    /* JADX INFO: renamed from: k */
    public boolean f12234k;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m5811a() {
        Paint.FontMetricsInt fontMetricsInt = this.f12231h;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        t11.m5067S("fontMetrics");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final int m5812b() {
        if (!this.f12234k) {
            lz0.m2989b("PlaceholderSpan is not laid out yet.");
        }
        return this.f12233j;
    }

    /* JADX INFO: renamed from: c */
    public final int m5813c() {
        if (!this.f12234k) {
            lz0.m2989b("PlaceholderSpan is not laid out yet.");
        }
        return this.f12232i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f12234k = true;
        paint.getTextSize();
        this.f12231h = paint.getFontMetricsInt();
        if (m5811a().descent <= m5811a().ascent) {
            lz0.m2988a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f12232i = (int) Math.ceil(0.0d);
        this.f12233j = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m5811a().ascent;
            fontMetricsInt.descent = m5811a().descent;
            fontMetricsInt.leading = m5811a().leading;
            if (fontMetricsInt.ascent > (-m5812b())) {
                fontMetricsInt.ascent = -m5812b();
            }
            fontMetricsInt.top = Math.min(m5811a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m5811a().bottom, fontMetricsInt.descent);
        }
        return m5813c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
