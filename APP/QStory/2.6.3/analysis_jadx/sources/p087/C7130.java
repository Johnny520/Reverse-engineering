package p087;

import java.util.Arrays;
import kotlin.C5177;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7130 extends AbstractC7128 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public byte[] f19078;

    @Override // p087.AbstractC7128
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12394() {
        return this.f19077;
    }

    @Override // p087.AbstractC7128
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12395(int i) {
        byte[] bArr = this.f19078;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f19078 = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p087.AbstractC7128
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12396() {
        return new C5177(Arrays.copyOf(this.f19078, this.f19077));
    }
}
