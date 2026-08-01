package androidx.compose.ui.node;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.C1956;
import net.bytebuddy.asm.Advice;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1809 implements InterfaceC1810 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static long m3414(int i, int i2, int i3, int i4) {
        return (((long) (i2 & Advice.MethodSizeHandler.UNDEFINED_SIZE)) << 15) | ((long) (i & Advice.MethodSizeHandler.UNDEFINED_SIZE)) | (((long) (i3 & Advice.MethodSizeHandler.UNDEFINED_SIZE)) << 30) | (((long) (i4 & Advice.MethodSizeHandler.UNDEFINED_SIZE)) << 45) | Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m3415(int i, long j) {
        int i2 = AbstractC1763.f5179;
        return ((int) (j >> (i * 15))) & Advice.MethodSizeHandler.UNDEFINED_SIZE;
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean mo3416(AbstractC2128 abstractC2128) {
        return AbstractC1957.m3679(AbstractC1957.m3678(AbstractC1785.m3346(abstractC2128), false));
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean mo3417(C1748 c1748) {
        C1956 c1956M3254 = c1748.m3254();
        boolean z = false;
        if (c1956M3254 != null && c1956M3254.f5776) {
            z = true;
        }
        return !z;
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean mo3418(AbstractC2128 abstractC2128) {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo3419(C1748 c1748, long j, C1780 c1780, int i, boolean z) {
        C1811 c1811 = c1748.f5094;
        AbstractC1794 abstractC1794 = c1811.f5285;
        InterfaceC6558 interfaceC6558 = AbstractC1794.f5239;
        c1811.f5285.m3392(AbstractC1794.f5241, abstractC1794.m3401(j), c1780, 1, z);
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo3420() {
        return 8;
    }

    @Override // androidx.compose.ui.node.InterfaceC1810
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo3421(C1780 c1780, C1748 c1748) {
        return false;
    }
}
