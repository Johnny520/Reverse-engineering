package p106V0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import p120Y0.AbstractC1732a;

/* JADX INFO: renamed from: V0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1494h implements LineHeightSpan {

    /* JADX INFO: renamed from: d */
    public final float f5204d;

    /* JADX INFO: renamed from: e */
    public final int f5205e;

    /* JADX INFO: renamed from: f */
    public final boolean f5206f;

    /* JADX INFO: renamed from: g */
    public final boolean f5207g;

    /* JADX INFO: renamed from: h */
    public final float f5208h;

    /* JADX INFO: renamed from: i */
    public final int f5209i;

    /* JADX INFO: renamed from: j */
    public int f5210j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k */
    public int f5211k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f5212l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f5213m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n */
    public int f5214n;

    /* JADX INFO: renamed from: o */
    public int f5215o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1494h(float f2, int i5, boolean z5, boolean z6, float f5, int i6) {
        this.f5204d = f2;
        this.f5205e = i5;
        this.f5206f = z5;
        this.f5207g = z6;
        this.f5208h = f5;
        this.f5209i = i6;
        if ((0.0f > f5 || f5 > 1.0f) && f5 != -1.0f) {
            AbstractC1732a.m3086b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i5, int i6, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        int i9 = fontMetricsInt.descent;
        int i10 = fontMetricsInt.ascent;
        if (i9 - i10 <= 0) {
            return;
        }
        boolean z5 = i5 == 0;
        boolean z6 = i6 == this.f5205e;
        int i11 = this.f5209i;
        boolean z7 = this.f5207g;
        boolean z8 = this.f5206f;
        if (z5 && z6 && z8 && z7 && i11 != 2) {
            return;
        }
        if (this.f5210j == Integer.MIN_VALUE) {
            int i12 = i9 - i10;
            int iCeil = (int) Math.ceil(this.f5204d);
            int i13 = iCeil - i12;
            if (i11 != 1 || i13 > 0) {
                float fAbs = this.f5208h;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i13 <= 0 ? Math.ceil(i13 * fAbs) : Math.ceil((1.0f - fAbs) * i13));
                int i14 = fontMetricsInt.descent;
                int i15 = iCeil2 + i14;
                this.f5212l = i15;
                int i16 = i15 - iCeil;
                this.f5211k = i16;
                if (i11 == 0 || i13 >= 0) {
                    if (z8) {
                        i16 = fontMetricsInt.ascent;
                    }
                    this.f5210j = i16;
                    if (z7) {
                        i15 = i14;
                    }
                    this.f5213m = i15;
                    this.f5214n = fontMetricsInt.ascent - i16;
                    this.f5215o = i15 - i14;
                } else if (i11 == 2) {
                    this.f5210j = z8 ? Math.max(fontMetricsInt.ascent, i16) : Math.min(fontMetricsInt.ascent, i16);
                    this.f5213m = z7 ? Math.min(fontMetricsInt.descent, this.f5212l) : Math.max(fontMetricsInt.descent, this.f5212l);
                    this.f5214n = 0;
                    this.f5215o = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.f5211k = i17;
                int i18 = fontMetricsInt.descent;
                this.f5212l = i18;
                this.f5210j = i17;
                this.f5213m = i18;
                this.f5214n = 0;
                this.f5215o = 0;
            }
        }
        fontMetricsInt.ascent = z5 ? this.f5210j : this.f5211k;
        fontMetricsInt.descent = z6 ? this.f5213m : this.f5212l;
    }
}
