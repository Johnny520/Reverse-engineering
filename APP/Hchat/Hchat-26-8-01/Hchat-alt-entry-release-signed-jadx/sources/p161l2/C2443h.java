package p161l2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import p204o2.AbstractC3042a;

/* JADX INFO: renamed from: l2.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2443h implements LineHeightSpan {

    /* JADX INFO: renamed from: g */
    public final float f8029g;

    /* JADX INFO: renamed from: h */
    public final int f8030h;

    /* JADX INFO: renamed from: i */
    public final boolean f8031i;

    /* JADX INFO: renamed from: j */
    public final boolean f8032j;

    /* JADX INFO: renamed from: k */
    public final float f8033k;

    /* JADX INFO: renamed from: l */
    public final int f8034l;

    /* JADX INFO: renamed from: m */
    public int f8035m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n */
    public int f8036n = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: o */
    public int f8037o = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    public int f8038p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q */
    public int f8039q;

    /* JADX INFO: renamed from: r */
    public int f8040r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2443h(float f3, int i9, boolean z9, boolean z10, float f10, int i10) {
        this.f8029g = f3;
        this.f8030h = i9;
        this.f8031i = z9;
        this.f8032j = z10;
        this.f8033k = f10;
        this.f8034l = i10;
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            AbstractC3042a.m6487b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i9, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        if (i13 - i14 <= 0) {
            return;
        }
        boolean z9 = i9 == 0;
        boolean z10 = i10 == this.f8030h;
        int i15 = this.f8034l;
        boolean z11 = this.f8032j;
        boolean z12 = this.f8031i;
        if (z9 && z10 && z12 && z11 && i15 != 2) {
            return;
        }
        if (this.f8035m == Integer.MIN_VALUE) {
            int i16 = i13 - i14;
            int iCeil = (int) Math.ceil(this.f8029g);
            int i17 = iCeil - i16;
            if (i15 != 1 || i17 > 0) {
                float fAbs = this.f8033k;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = iCeil2 + i18;
                this.f8037o = i19;
                int i20 = i19 - iCeil;
                this.f8036n = i20;
                if (i15 == 0 || i17 >= 0) {
                    if (z12) {
                        i20 = fontMetricsInt.ascent;
                    }
                    this.f8035m = i20;
                    if (z11) {
                        i19 = i18;
                    }
                    this.f8038p = i19;
                    this.f8039q = fontMetricsInt.ascent - i20;
                    this.f8040r = i19 - i18;
                } else if (i15 == 2) {
                    int i21 = fontMetricsInt.ascent;
                    this.f8035m = z12 ? Math.max(i21, i20) : Math.min(i21, i20);
                    int i22 = fontMetricsInt.descent;
                    int i23 = this.f8037o;
                    this.f8038p = z11 ? Math.min(i22, i23) : Math.max(i22, i23);
                    this.f8039q = 0;
                    this.f8040r = 0;
                }
            } else {
                int i24 = fontMetricsInt.ascent;
                this.f8036n = i24;
                int i25 = fontMetricsInt.descent;
                this.f8037o = i25;
                this.f8035m = i24;
                this.f8038p = i25;
                this.f8039q = 0;
                this.f8040r = 0;
            }
        }
        fontMetricsInt.ascent = z9 ? this.f8035m : this.f8036n;
        fontMetricsInt.descent = z10 ? this.f8038p : this.f8037o;
    }
}
