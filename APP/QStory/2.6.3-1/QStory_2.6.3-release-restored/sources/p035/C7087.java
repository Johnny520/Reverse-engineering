package p035;

import com.android.p002dx.p005io.Opcodes;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f17568 = new int[10];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f17569;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12322(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f17568;
            if (i >= iArr.length) {
                return;
            }
            this.f17569 = (1 << i) | this.f17569;
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12323() {
        return (this.f17569 & 16) != 0 ? this.f17568[4] : Opcodes.MAX_VALUE;
    }
}
