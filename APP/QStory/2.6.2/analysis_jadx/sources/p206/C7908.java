package p206;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7908 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f21887;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public SolverVariable$Type f21890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f21895;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21893 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f21894 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f21888 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f21891 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float[] f21892 = new float[9];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float[] f21889 = new float[9];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C7911[] f21886 = new C7911[16];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f21885 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f21884 = 0;

    public C7908(SolverVariable$Type solverVariable$Type) {
        this.f21890 = solverVariable$Type;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21893 - ((C7908) obj).f21893;
    }

    public final String toString() {
        return "" + this.f21893;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13337(C7910 c7910, C7911 c7911) {
        int i = this.f21885;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21886[i2].mo13345(c7910, c7911, false);
        }
        this.f21885 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13338(C7910 c7910, float f) {
        this.f21887 = f;
        this.f21891 = true;
        int i = this.f21885;
        this.f21894 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21886[i2].m13371(c7910, this, false);
        }
        this.f21885 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13339() {
        this.f21890 = SolverVariable$Type.UNKNOWN;
        this.f21888 = 0;
        this.f21893 = -1;
        this.f21894 = -1;
        this.f21887 = 0.0f;
        this.f21891 = false;
        int i = this.f21885;
        for (int i2 = 0; i2 < i; i2++) {
            this.f21886[i2] = null;
        }
        this.f21885 = 0;
        this.f21884 = 0;
        this.f21895 = false;
        Arrays.fill(this.f21889, 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13340(C7911 c7911) {
        int i = this.f21885;
        int i2 = 0;
        while (i2 < i) {
            if (this.f21886[i2] == c7911) {
                while (i2 < i - 1) {
                    C7911[] c7911Arr = this.f21886;
                    int i3 = i2 + 1;
                    c7911Arr[i2] = c7911Arr[i3];
                    i2 = i3;
                }
                this.f21885--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13341(C7911 c7911) {
        int i = 0;
        while (true) {
            int i2 = this.f21885;
            C7911[] c7911Arr = this.f21886;
            if (i >= i2) {
                if (i2 >= c7911Arr.length) {
                    this.f21886 = (C7911[]) Arrays.copyOf(c7911Arr, c7911Arr.length * 2);
                }
                C7911[] c7911Arr2 = this.f21886;
                int i3 = this.f21885;
                c7911Arr2[i3] = c7911;
                this.f21885 = i3 + 1;
                return;
            }
            if (c7911Arr[i] == c7911) {
                return;
            } else {
                i++;
            }
        }
    }
}
