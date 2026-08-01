package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 extends ReplacementSpan {

    /* JADX INFO: renamed from: d */
    public Paint.FontMetricsInt f244d;

    /* JADX INFO: renamed from: e */
    public int f245e;

    /* JADX INFO: renamed from: f */
    public int f246f;

    /* JADX INFO: renamed from: g */
    public boolean f247g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m197a() {
        Paint.FontMetricsInt fontMetricsInt = this.f244d;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        p30.m2986V("fontMetrics");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m198b() {
        if (!this.f247g) {
            x10.m5083b("PlaceholderSpan is not laid out yet.");
        }
        return this.f246f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f247g = true;
        paint.getTextSize();
        this.f244d = paint.getFontMetricsInt();
        if (m197a().descent <= m197a().ascent) {
            x10.m5082a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f245e = (int) Math.ceil(0.0d);
        this.f246f = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m197a().ascent;
            fontMetricsInt.descent = m197a().descent;
            fontMetricsInt.leading = m197a().leading;
            if (fontMetricsInt.ascent > (-m198b())) {
                fontMetricsInt.ascent = -m198b();
            }
            fontMetricsInt.top = Math.min(m197a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m197a().bottom, fontMetricsInt.descent);
        }
        if (!this.f247g) {
            x10.m5083b("PlaceholderSpan is not laid out yet.");
        }
        return this.f245e;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
