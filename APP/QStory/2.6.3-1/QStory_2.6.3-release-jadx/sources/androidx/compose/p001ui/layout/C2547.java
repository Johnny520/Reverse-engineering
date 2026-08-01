package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.InterfaceC2575;
import p068.InterfaceC7387;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2547 extends AbstractC2961 implements InterfaceC2575 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC7387 f5327;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public long f5328;

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return true;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2575
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1881(long j) {
        if (C8735.m13916(this.f5328, j)) {
            return;
        }
        this.f5327.invoke(new C8735(j));
        this.f5328 = j;
    }
}
