package p222;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8738 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f22229;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public SolverVariable$Type f22232;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f22237;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f22235 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f22236 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f22230 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f22233 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float[] f22234 = new float[9];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float[] f22231 = new float[9];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C8741[] f22228 = new C8741[16];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f22227 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f22226 = 0;

    public C8738(SolverVariable$Type solverVariable$Type) {
        this.f22232 = solverVariable$Type;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f22235 - ((C8738) obj).f22235;
    }

    public final String toString() {
        return "" + this.f22235;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13924(C8740 c8740, C8741 c8741) {
        int i = this.f22227;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22228[i2].mo13932(c8740, c8741, false);
        }
        this.f22227 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13925(C8740 c8740, float f) {
        this.f22229 = f;
        this.f22233 = true;
        int i = this.f22227;
        this.f22236 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22228[i2].m13958(c8740, this, false);
        }
        this.f22227 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13926() {
        this.f22232 = SolverVariable$Type.UNKNOWN;
        this.f22230 = 0;
        this.f22235 = -1;
        this.f22236 = -1;
        this.f22229 = 0.0f;
        this.f22233 = false;
        int i = this.f22227;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22228[i2] = null;
        }
        this.f22227 = 0;
        this.f22226 = 0;
        this.f22237 = false;
        Arrays.fill(this.f22231, 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13927(C8741 c8741) {
        int i = this.f22227;
        int i2 = 0;
        while (i2 < i) {
            if (this.f22228[i2] == c8741) {
                while (i2 < i - 1) {
                    C8741[] c8741Arr = this.f22228;
                    int i3 = i2 + 1;
                    c8741Arr[i2] = c8741Arr[i3];
                    i2 = i3;
                }
                this.f22227--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13928(C8741 c8741) {
        int i = 0;
        while (true) {
            int i2 = this.f22227;
            C8741[] c8741Arr = this.f22228;
            if (i >= i2) {
                if (i2 >= c8741Arr.length) {
                    this.f22228 = (C8741[]) Arrays.copyOf(c8741Arr, c8741Arr.length * 2);
                }
                C8741[] c8741Arr2 = this.f22228;
                int i3 = this.f22227;
                c8741Arr2[i3] = c8741;
                this.f22227 = i3 + 1;
                return;
            }
            if (c8741Arr[i] == c8741) {
                return;
            } else {
                i++;
            }
        }
    }
}
