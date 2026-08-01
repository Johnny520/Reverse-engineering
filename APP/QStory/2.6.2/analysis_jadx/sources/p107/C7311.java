package p107;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy;
import com.bumptech.glide.AbstractC3065;
import io.ktor.util.C4210;
import p210.AbstractC7935;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float[] f19500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f19501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7313[] f19502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f19503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final VelocityTracker1D$Strategy f19504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f19505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float[] f19506;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float[] f19507;

    public C7311(boolean z, VelocityTracker1D$Strategy velocityTracker1D$Strategy) {
        this.f19505 = z;
        this.f19504 = velocityTracker1D$Strategy;
        if (z && velocityTracker1D$Strategy.equals(VelocityTracker1D$Strategy.Lsq2)) {
            C5919.m11250("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i = AbstractC7312.f19508[velocityTracker1D$Strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                C4210.m8621();
                throw null;
            }
            i2 = 3;
        }
        this.f19503 = i2;
        this.f19502 = new C7313[20];
        this.f19500 = new float[20];
        this.f19507 = new float[20];
        this.f19506 = new float[3];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m12480(float f) {
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
            AbstractC7935.m13395("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.f19501;
        C7313[] c7313Arr = this.f19502;
        C7313 c7313 = c7313Arr[i2];
        if (c7313 == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            C7313 c73132 = c7313;
            while (true) {
                C7313 c73133 = c7313Arr[i2];
                boolean z2 = this.f19505;
                velocityTracker1D$Strategy = this.f19504;
                fArr = this.f19500;
                fArr2 = this.f19507;
                if (c73133 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = c7313.f19510;
                f2 = f4;
                int i4 = i2;
                long j2 = c73133.f19510;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - c73132.f19510);
                c73132 = (velocityTracker1D$Strategy == VelocityTracker1D$Strategy.Lsq2 || z) ? c73133 : c7313;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = c73133.f19509;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.f19503) {
                int i5 = AbstractC7312.f19508[velocityTracker1D$Strategy.ordinal()];
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
                        C4210.m8621();
                        return f2;
                    }
                    try {
                        float[] fArr3 = this.f19506;
                        AbstractC3065.m6843(fArr2, fArr, i3, fArr3);
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
    public final void m12481(float f, long j) {
        int i = (this.f19501 + 1) % 20;
        this.f19501 = i;
        C7313[] c7313Arr = this.f19502;
        C7313 c7313 = c7313Arr[i];
        if (c7313 != null) {
            c7313.f19510 = j;
            c7313.f19509 = f;
        } else {
            C7313 c73132 = new C7313();
            c73132.f19510 = j;
            c73132.f19509 = f;
            c7313Arr[i] = c73132;
        }
    }

    public C7311() {
        this(true, VelocityTracker1D$Strategy.Impulse);
    }
}
