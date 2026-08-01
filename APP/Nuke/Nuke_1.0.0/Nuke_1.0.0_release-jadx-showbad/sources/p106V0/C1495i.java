package p106V0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p117X2.AbstractC1665j;
import p120Y0.AbstractC1732a;

/* JADX INFO: renamed from: V0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1495i extends ReplacementSpan {

    /* JADX INFO: renamed from: d */
    public Paint.FontMetricsInt f5216d;

    /* JADX INFO: renamed from: e */
    public int f5217e;

    /* JADX INFO: renamed from: f */
    public int f5218f;

    /* JADX INFO: renamed from: g */
    public boolean f5219g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m2771a() {
        Paint.FontMetricsInt fontMetricsInt = this.f5216d;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC1665j.m2991k("fontMetrics");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m2772b() {
        if (!this.f5219g) {
            AbstractC1732a.m3086b("PlaceholderSpan is not laid out yet.");
        }
        return this.f5218f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        this.f5219g = true;
        paint.getTextSize();
        this.f5216d = paint.getFontMetricsInt();
        if (m2771a().descent <= m2771a().ascent) {
            AbstractC1732a.m3085a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f5217e = (int) Math.ceil(0.0f);
        this.f5218f = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m2771a().ascent;
            fontMetricsInt.descent = m2771a().descent;
            fontMetricsInt.leading = m2771a().leading;
            if (fontMetricsInt.ascent > (-m2772b())) {
                fontMetricsInt.ascent = -m2772b();
            }
            fontMetricsInt.top = Math.min(m2771a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m2771a().bottom, fontMetricsInt.descent);
        }
        if (!this.f5219g) {
            AbstractC1732a.m3086b("PlaceholderSpan is not laid out yet.");
        }
        return this.f5217e;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f2, int i7, int i8, int i9, Paint paint) {
    }
}
