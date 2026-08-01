package p022;

import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6262 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f17241 = new int[10];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f17242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11746(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f17241;
            if (i >= iArr.length) {
                return;
            }
            this.f17242 = (1 << i) | this.f17242;
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m11747() {
        return (this.f17242 & 16) != 0 ? this.f17241[4] : Opcodes.MAX_VALUE;
    }
}
