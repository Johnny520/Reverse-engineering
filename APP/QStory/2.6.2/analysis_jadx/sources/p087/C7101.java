package p087;

import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7101 extends AbstractC7127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean[] f19033;

    @Override // p087.AbstractC7127
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12367() {
        return this.f19032;
    }

    @Override // p087.AbstractC7127
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12368(int i) {
        boolean[] zArr = this.f19033;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f19033 = Arrays.copyOf(zArr, i);
        }
    }

    @Override // p087.AbstractC7127
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12369() {
        return Arrays.copyOf(this.f19033, this.f19032);
    }
}
