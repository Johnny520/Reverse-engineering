package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(19)
public abstract class AbstractC4622 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final C8033 f1018;

    /* JADX INFO: renamed from: ۥ */
    public final Paint.FontMetricsInt f1017 = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public short f9929 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public short f9930 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f9931 = 1.0f;

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public AbstractC4622(@InterfaceC6391 C8033 c8033) {
        C6740.m21416(c8033, "rasterizer cannot be null");
        this.f1018 = c8033;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@InterfaceC6391 Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @InterfaceC6490 Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f1017);
        Paint.FontMetricsInt fontMetricsInt2 = this.f1017;
        this.f9931 = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f1018.m25399();
        this.f9930 = (short) (this.f1018.m25399() * this.f9931);
        short sM25404 = (short) (this.f1018.m25404() * this.f9931);
        this.f9929 = sM25404;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f1017;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sM25404;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.TESTS})
    /* JADX INFO: renamed from: ۥ */
    public final int m1578() {
        return this.f9930;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.TESTS})
    /* JADX INFO: renamed from: ۥ۟ */
    public final int m1579() {
        return m13894().m25400();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float m13893() {
        return this.f9931;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C8033 m13894() {
        return this.f1018;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m13895() {
        return this.f9929;
    }
}
