package androidx.compose.runtime;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f3802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f3803 = new int[10];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2307(int i) {
        int[] iArrCopyOf = this.f3803;
        if (this.f3802 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f3803 = iArrCopyOf;
        }
        int i2 = this.f3802;
        this.f3802 = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m2308() {
        int[] iArr = this.f3803;
        int i = this.f3802 - 1;
        this.f3802 = i;
        return iArr[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m2309(int i) {
        int i2 = this.f3802 - 1;
        return i2 >= 0 ? this.f3803[i2] : i;
    }
}
