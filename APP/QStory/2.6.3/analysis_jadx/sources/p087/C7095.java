package p087;

import java.util.Arrays;
import kotlin.C5182;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7095 extends AbstractC7128 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19015;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int[] f19016;

    @Override // p087.AbstractC7128
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12394() {
        return this.f19015;
    }

    @Override // p087.AbstractC7128
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12395(int i) {
        int[] iArr = this.f19016;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f19016 = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p087.AbstractC7128
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12396() {
        return new C5182(Arrays.copyOf(this.f19016, this.f19015));
    }
}
