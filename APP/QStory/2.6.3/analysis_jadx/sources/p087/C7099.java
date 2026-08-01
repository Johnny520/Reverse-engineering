package p087;

import java.util.Arrays;
import kotlin.C5180;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7099 extends AbstractC7128 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long[] f19023;

    @Override // p087.AbstractC7128
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12394() {
        return this.f19022;
    }

    @Override // p087.AbstractC7128
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12395(int i) {
        long[] jArr = this.f19023;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f19023 = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p087.AbstractC7128
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12396() {
        return new C5180(Arrays.copyOf(this.f19023, this.f19022));
    }
}
