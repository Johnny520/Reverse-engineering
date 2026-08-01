package p087;

import java.util.Arrays;
import kotlin.C5179;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7098 extends AbstractC7127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long[] f19028;

    @Override // p087.AbstractC7127
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12367() {
        return this.f19027;
    }

    @Override // p087.AbstractC7127
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12368(int i) {
        long[] jArr = this.f19028;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f19028 = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p087.AbstractC7127
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12369() {
        return new C5179(Arrays.copyOf(this.f19028, this.f19027));
    }
}
