package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class za1 implements LineHeightSpan {
    public final float h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final float l;
    public final int m;
    public int n = Integer.MIN_VALUE;
    public int o = Integer.MIN_VALUE;
    public int p = Integer.MIN_VALUE;
    public int q = Integer.MIN_VALUE;
    public int r;
    public int s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public za1(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.h = f;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = f2;
        this.m = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            lz0.b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.i;
        int i7 = this.m;
        boolean z3 = this.k;
        boolean z4 = this.j;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.n == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.h);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.l;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i9 <= 0 ? Math.ceil(i9 * fAbs) : Math.ceil((1.0f - fAbs) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = iCeil2 + i10;
                this.p = i11;
                int i12 = i11 - iCeil;
                this.o = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.n = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.q = i11;
                    this.r = fontMetricsInt.ascent - i12;
                    this.s = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.n = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.p;
                    this.q = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.r = 0;
                    this.s = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.o = i16;
                int i17 = fontMetricsInt.descent;
                this.p = i17;
                this.n = i16;
                this.q = i17;
                this.r = 0;
                this.s = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.n : this.o;
        fontMetricsInt.descent = z2 ? this.q : this.p;
    }
}
