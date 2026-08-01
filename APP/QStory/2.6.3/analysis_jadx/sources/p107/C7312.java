package p107;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy;
import io.ktor.util.C4211;
import p034.AbstractC6344;
import p210.AbstractC7936;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7312 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float[] f19495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f19496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7314[] f19497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f19498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final VelocityTracker1D$Strategy f19499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f19500;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float[] f19501;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float[] f19502;

    public C7312(boolean z, VelocityTracker1D$Strategy velocityTracker1D$Strategy) {
        this.f19500 = z;
        this.f19499 = velocityTracker1D$Strategy;
        if (z && velocityTracker1D$Strategy.equals(VelocityTracker1D$Strategy.Lsq2)) {
            C5925.m11311("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i = AbstractC7313.f19503[velocityTracker1D$Strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                C4211.m8611();
                throw null;
            }
            i2 = 3;
        }
        this.f19498 = i2;
        this.f19497 = new C7314[20];
        this.f19495 = new float[20];
        this.f19502 = new float[20];
        this.f19501 = new float[3];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m12507(float f) {
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
            AbstractC7936.m13423("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.f19496;
        C7314[] c7314Arr = this.f19497;
        C7314 c7314 = c7314Arr[i2];
        if (c7314 == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            C7314 c73142 = c7314;
            while (true) {
                C7314 c73143 = c7314Arr[i2];
                boolean z2 = this.f19500;
                velocityTracker1D$Strategy = this.f19499;
                fArr = this.f19495;
                fArr2 = this.f19502;
                if (c73143 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = c7314.f19505;
                f2 = f4;
                int i4 = i2;
                long j2 = c73143.f19505;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - c73142.f19505);
                c73142 = (velocityTracker1D$Strategy == VelocityTracker1D$Strategy.Lsq2 || z) ? c73143 : c7314;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = c73143.f19504;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.f19498) {
                int i5 = AbstractC7313.f19503[velocityTracker1D$Strategy.ordinal()];
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
                        C4211.m8611();
                        return f2;
                    }
                    try {
                        float[] fArr3 = this.f19501;
                        AbstractC6344.m11879(fArr2, fArr, i3, fArr3);
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
    public final void m12508(float f, long j) {
        int i = (this.f19496 + 1) % 20;
        this.f19496 = i;
        C7314[] c7314Arr = this.f19497;
        C7314 c7314 = c7314Arr[i];
        if (c7314 != null) {
            c7314.f19505 = j;
            c7314.f19504 = f;
        } else {
            C7314 c73142 = new C7314();
            c73142.f19505 = j;
            c73142.f19504 = f;
            c7314Arr[i] = c73142;
        }
    }

    public C7312() {
        this(true, VelocityTracker1D$Strategy.Impulse);
    }
}
