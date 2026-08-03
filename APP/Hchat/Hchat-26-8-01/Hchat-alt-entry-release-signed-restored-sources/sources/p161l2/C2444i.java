package p161l2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import gg.AbstractC1416l;
import p204o2.AbstractC3042a;

/* JADX INFO: renamed from: l2.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2444i extends ReplacementSpan {

    /* JADX INFO: renamed from: g */
    public Paint.FontMetricsInt f8041g;

    /* JADX INFO: renamed from: h */
    public int f8042h;

    /* JADX INFO: renamed from: i */
    public int f8043i;

    /* JADX INFO: renamed from: j */
    public boolean f8044j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m5841a() {
        Paint.FontMetricsInt fontMetricsInt = this.f8041g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC1416l.m3831g("fontMetrics");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m5842b() {
        if (!this.f8044j) {
            AbstractC3042a.m6487b("PlaceholderSpan is not laid out yet.");
        }
        return this.f8043i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m5843c() {
        if (!this.f8044j) {
            AbstractC3042a.m6487b("PlaceholderSpan is not laid out yet.");
        }
        return this.f8042h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        this.f8044j = true;
        paint.getTextSize();
        this.f8041g = paint.getFontMetricsInt();
        if (m5841a().descent <= m5841a().ascent) {
            AbstractC3042a.m6486a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f8042h = (int) Math.ceil(0.0f);
        this.f8043i = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m5841a().ascent;
            fontMetricsInt.descent = m5841a().descent;
            fontMetricsInt.leading = m5841a().leading;
            if (fontMetricsInt.ascent > (-m5842b())) {
                fontMetricsInt.ascent = -m5842b();
            }
            fontMetricsInt.top = Math.min(m5841a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m5841a().bottom, fontMetricsInt.descent);
        }
        return m5843c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f3, int i11, int i12, int i13, Paint paint) {
    }
}
