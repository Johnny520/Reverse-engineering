package androidx.compose.ui.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.InterfaceC1740;
import p052.InterfaceC6558;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1712 extends AbstractC2128 implements InterfaceC1740 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6558 f4982;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public long f4983;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1740
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1321(long j) {
        if (C7906.m13357(this.f4983, j)) {
            return;
        }
        this.f4982.invoke(new C7906(j));
        this.f4983 = j;
    }
}
