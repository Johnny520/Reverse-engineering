package p000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ma0 implements LineHeightSpan {

    /* JADX INFO: renamed from: d */
    public final float f3894d;

    /* JADX INFO: renamed from: e */
    public final int f3895e;

    /* JADX INFO: renamed from: f */
    public final boolean f3896f;

    /* JADX INFO: renamed from: g */
    public final boolean f3897g;

    /* JADX INFO: renamed from: h */
    public final float f3898h;

    /* JADX INFO: renamed from: i */
    public final int f3899i;

    /* JADX INFO: renamed from: j */
    public int f3900j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k */
    public int f3901k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f3902l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f3903m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n */
    public int f3904n;

    /* JADX INFO: renamed from: o */
    public int f3905o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ma0(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.f3894d = f;
        this.f3895e = i;
        this.f3896f = z;
        this.f3897g = z2;
        this.f3898h = f2;
        this.f3899i = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            x10.m5083b("topRatio should be in [0..1] range or -1");
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
        boolean z2 = i2 == this.f3895e;
        int i7 = this.f3899i;
        boolean z3 = this.f3897g;
        boolean z4 = this.f3896f;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.f3900j == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f3894d);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.f3898h;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i9 <= 0 ? Math.ceil(i9 * fAbs) : Math.ceil((1.0f - fAbs) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = iCeil2 + i10;
                this.f3902l = i11;
                int i12 = i11 - iCeil;
                this.f3901k = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.f3900j = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.f3903m = i11;
                    this.f3904n = fontMetricsInt.ascent - i12;
                    this.f3905o = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.f3900j = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.f3902l;
                    this.f3903m = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.f3904n = 0;
                    this.f3905o = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.f3901k = i16;
                int i17 = fontMetricsInt.descent;
                this.f3902l = i17;
                this.f3900j = i16;
                this.f3903m = i17;
                this.f3904n = 0;
                this.f3905o = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.f3900j : this.f3901k;
        fontMetricsInt.descent = z2 ? this.f3903m : this.f3902l;
    }
}
