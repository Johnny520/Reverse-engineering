package p103;

import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7931 extends AbstractC7957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19372;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean[] f19373;

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12953() {
        return this.f19372;
    }

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12954(int i) {
        boolean[] zArr = this.f19373;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f19373 = Arrays.copyOf(zArr, i);
        }
    }

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12955() {
        return Arrays.copyOf(this.f19373, this.f19372);
    }
}
