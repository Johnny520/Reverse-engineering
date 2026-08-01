package p123;

import androidx.compose.p001ui.input.pointer.util.VelocityTracker1D$Strategy;
import io.ktor.util.C5043;
import p050.AbstractC7173;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8141 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float[] f19840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f19841;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8143[] f19842;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f19843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final VelocityTracker1D$Strategy f19844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f19845;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float[] f19846;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float[] f19847;

    public C8141(boolean z, VelocityTracker1D$Strategy velocityTracker1D$Strategy) {
        this.f19845 = z;
        this.f19844 = velocityTracker1D$Strategy;
        if (z && velocityTracker1D$Strategy.equals(VelocityTracker1D$Strategy.Lsq2)) {
            C6755.m11870("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i = AbstractC8142.f19848[velocityTracker1D$Strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                C5043.m9170();
                throw null;
            }
            i2 = 3;
        }
        this.f19843 = i2;
        this.f19842 = new C8143[20];
        this.f19840 = new float[20];
        this.f19847 = new float[20];
        this.f19846 = new float[3];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m13066(float f) {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            AbstractC8765.m13982("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.f19841;
        C8143[] c8143Arr = this.f19842;
        C8143 c8143 = c8143Arr[i2];
        if (c8143 == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            C8143 c81432 = c8143;
            while (true) {
                C8143 c81433 = c8143Arr[i2];
                boolean z2 = this.f19845;
                velocityTracker1D$Strategy = this.f19844;
                fArr = this.f19840;
                fArr2 = this.f19847;
                if (c81433 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = c8143.f19850;
                f2 = f4;
                int i4 = i2;
                long j2 = c81433.f19850;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - c81432.f19850);
                c81432 = (velocityTracker1D$Strategy == VelocityTracker1D$Strategy.Lsq2 || z) ? c81433 : c8143;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = c81433.f19849;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.f19843) {
                int i5 = AbstractC8142.f19848[velocityTracker1D$Strategy.ordinal()];
                if (i5 == i) {
                    int i6 = i3 - i;
                    float f6 = fArr2[i6];
                    int i7 = i6;
                    float fAbs2 = f2;
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        float f7 = fArr2[i8];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i8] : fArr[i7] - fArr[i8]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i7 == i6) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i7--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                } else {
                    if (i5 != 2) {
                        C5043.m9170();
                        return f2;
                    }
                    try {
                        float[] fArr3 = this.f19846;
                        AbstractC7173.m12438(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[i];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13067(float f, long j) {
        int i = (this.f19841 + 1) % 20;
        this.f19841 = i;
        C8143[] c8143Arr = this.f19842;
        C8143 c8143 = c8143Arr[i];
        if (c8143 != null) {
            c8143.f19850 = j;
            c8143.f19849 = f;
        } else {
            C8143 c81432 = new C8143();
            c81432.f19850 = j;
            c81432.f19849 = f;
            c8143Arr[i] = c81432;
        }
    }

    public C8141() {
        this(true, VelocityTracker1D$Strategy.Impulse);
    }
}
