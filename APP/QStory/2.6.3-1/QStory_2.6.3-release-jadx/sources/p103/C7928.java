package p103;

import java.util.Arrays;
import kotlin.C6012;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7928 extends AbstractC7957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long[] f19368;

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12953() {
        return this.f19367;
    }

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12954(int i) {
        long[] jArr = this.f19368;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f19368 = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12955() {
        return new C6012(Arrays.copyOf(this.f19368, this.f19367));
    }
}
