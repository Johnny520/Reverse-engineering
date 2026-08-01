package p206;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7909 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f21884;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public SolverVariable$Type f21887;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f21892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21890 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21891 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f21885 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f21888 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float[] f21889 = new float[9];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float[] f21886 = new float[9];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C7912[] f21883 = new C7912[16];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f21882 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f21881 = 0;

    public C7909(SolverVariable$Type solverVariable$Type) {
        this.f21887 = solverVariable$Type;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21890 - ((C7909) obj).f21890;
    }

    public final String toString() {
        return "" + this.f21890;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13365(C7911 c7911, C7912 c7912) {
        int i = this.f21882;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21883[i2].mo13373(c7911, c7912, false);
        }
        this.f21882 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13366(C7911 c7911, float f) {
        this.f21884 = f;
        this.f21888 = true;
        int i = this.f21882;
        this.f21891 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21883[i2].m13399(c7911, this, false);
        }
        this.f21882 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13367() {
        this.f21887 = SolverVariable$Type.UNKNOWN;
        this.f21885 = 0;
        this.f21890 = -1;
        this.f21891 = -1;
        this.f21884 = 0.0f;
        this.f21888 = false;
        int i = this.f21882;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21883[i2] = null;
        }
        this.f21882 = 0;
        this.f21881 = 0;
        this.f21892 = false;
        Arrays.fill(this.f21886, 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13368(C7912 c7912) {
        int i = this.f21882;
        int i2 = 0;
        while (i2 < i) {
            if (this.f21883[i2] == c7912) {
                while (i2 < i - 1) {
                    C7912[] c7912Arr = this.f21883;
                    int i3 = i2 + 1;
                    c7912Arr[i2] = c7912Arr[i3];
                    i2 = i3;
                }
                this.f21882--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13369(C7912 c7912) {
        int i = 0;
        while (true) {
            int i2 = this.f21882;
            C7912[] c7912Arr = this.f21883;
            if (i >= i2) {
                if (i2 >= c7912Arr.length) {
                    this.f21883 = (C7912[]) Arrays.copyOf(c7912Arr, c7912Arr.length * 2);
                }
                C7912[] c7912Arr2 = this.f21883;
                int i3 = this.f21882;
                c7912Arr2[i3] = c7912;
                this.f21882 = i3 + 1;
                return;
            }
            if (c7912Arr[i] == c7912) {
                return;
            } else {
                i++;
            }
        }
    }
}
