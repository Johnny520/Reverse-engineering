package p103;

import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7968 extends AbstractC7957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public short[] f19437;

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12953() {
        return this.f19436;
    }

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12954(int i) {
        short[] sArr = this.f19437;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f19437 = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12955() {
        return Arrays.copyOf(this.f19437, this.f19436);
    }
}
