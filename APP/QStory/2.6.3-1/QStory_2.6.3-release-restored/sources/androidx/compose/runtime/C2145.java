package androidx.compose.runtime;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f4147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f4148 = new int[10];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2867(int i) {
        int[] iArrCopyOf = this.f4148;
        if (this.f4147 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f4148 = iArrCopyOf;
        }
        int i2 = this.f4147;
        this.f4147 = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m2868() {
        int[] iArr = this.f4148;
        int i = this.f4147 - 1;
        this.f4147 = i;
        return iArr[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m2869(int i) {
        int i2 = this.f4147 - 1;
        return i2 >= 0 ? this.f4148[i2] : i;
    }
}
