package p000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class za1 implements LineHeightSpan {

    /* JADX INFO: renamed from: h */
    public final float f13799h;

    /* JADX INFO: renamed from: i */
    public final int f13800i;

    /* JADX INFO: renamed from: j */
    public final boolean f13801j;

    /* JADX INFO: renamed from: k */
    public final boolean f13802k;

    /* JADX INFO: renamed from: l */
    public final float f13803l;

    /* JADX INFO: renamed from: m */
    public final int f13804m;

    /* JADX INFO: renamed from: n */
    public int f13805n = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: o */
    public int f13806o = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    public int f13807p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q */
    public int f13808q = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: r */
    public int f13809r;

    /* JADX INFO: renamed from: s */
    public int f13810s;

    public za1(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.f13799h = f;
        this.f13800i = i;
        this.f13801j = z;
        this.f13802k = z2;
        this.f13803l = f2;
        this.f13804m = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            lz0.m2989b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.f13800i;
        int i7 = this.f13804m;
        boolean z3 = this.f13802k;
        boolean z4 = this.f13801j;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.f13805n == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f13799h);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.f13803l;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i9 <= 0 ? Math.ceil(i9 * fAbs) : Math.ceil((1.0f - fAbs) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = iCeil2 + i10;
                this.f13807p = i11;
                int i12 = i11 - iCeil;
                this.f13806o = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.f13805n = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.f13808q = i11;
                    this.f13809r = fontMetricsInt.ascent - i12;
                    this.f13810s = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.f13805n = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.f13807p;
                    this.f13808q = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.f13809r = 0;
                    this.f13810s = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.f13806o = i16;
                int i17 = fontMetricsInt.descent;
                this.f13807p = i17;
                this.f13805n = i16;
                this.f13808q = i17;
                this.f13809r = 0;
                this.f13810s = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.f13805n : this.f13806o;
        fontMetricsInt.descent = z2 ? this.f13808q : this.f13807p;
    }
}
