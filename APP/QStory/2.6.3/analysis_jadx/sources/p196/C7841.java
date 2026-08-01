package p196;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import p195.AbstractC7834;

/* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7841 implements LineHeightSpan {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f21383;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f21384;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f21386;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f21387;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f21390;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f21392;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f21393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f21394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f21391 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f21388 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f21389 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f21385 = Integer.MIN_VALUE;

    public C7841(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.f21394 = f;
        this.f21392 = i;
        this.f21393 = z;
        this.f21387 = z2;
        this.f21386 = f2;
        this.f21390 = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            AbstractC7834.m13197("topRatio should be in [0..1] range or -1");
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
        boolean z2 = i2 == this.f21392;
        int i7 = this.f21390;
        boolean z3 = this.f21387;
        boolean z4 = this.f21393;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.f21391 == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f21394);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.f21386;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i9 <= 0 ? Math.ceil(i9 * fAbs) : Math.ceil((1.0f - fAbs) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = iCeil2 + i10;
                this.f21389 = i11;
                int i12 = i11 - iCeil;
                this.f21388 = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.f21391 = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.f21385 = i11;
                    this.f21384 = fontMetricsInt.ascent - i12;
                    this.f21383 = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.f21391 = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.f21389;
                    this.f21385 = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.f21384 = 0;
                    this.f21383 = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.f21388 = i16;
                int i17 = fontMetricsInt.descent;
                this.f21389 = i17;
                this.f21391 = i16;
                this.f21385 = i17;
                this.f21384 = 0;
                this.f21383 = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.f21391 : this.f21388;
        fontMetricsInt.descent = z2 ? this.f21385 : this.f21389;
    }
}
