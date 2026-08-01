package p031c4;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p320w3.AbstractC9170c;

/* JADX INFO: renamed from: c4.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1320f extends ReplacementSpan {

    /* JADX INFO: renamed from: r */
    public final C1323i f3951r;

    /* JADX INFO: renamed from: q */
    public final Paint.FontMetricsInt f3950q = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: s */
    public short f3952s = -1;

    /* JADX INFO: renamed from: t */
    public short f3953t = -1;

    /* JADX INFO: renamed from: u */
    public float f3954u = 1.0f;

    public AbstractC1320f(C1323i c1323i) {
        AbstractC9170c.m35615d(c1323i, "rasterizer cannot be null");
        this.f3951r = c1323i;
    }

    /* JADX INFO: renamed from: a */
    public final C1323i m5303a() {
        return this.f3951r;
    }

    /* JADX INFO: renamed from: b */
    public final int m5304b() {
        return this.f3952s;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3950q);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3950q;
        this.f3954u = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f3951r.m5317e();
        this.f3953t = (short) (this.f3951r.m5317e() * this.f3954u);
        short sM5321i = (short) (this.f3951r.m5321i() * this.f3954u);
        this.f3952s = sM5321i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3950q;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sM5321i;
    }
}
