package p103;

import java.util.Arrays;
import kotlin.C6009;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7959 extends AbstractC7957 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f19422;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public byte[] f19423;

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12953() {
        return this.f19422;
    }

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12954(int i) {
        byte[] bArr = this.f19423;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f19423 = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p103.AbstractC7957
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12955() {
        return new C6009(Arrays.copyOf(this.f19423, this.f19422));
    }
}
