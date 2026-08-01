package androidx.compose.p001ui.node;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.C2791;
import net.bytebuddy.asm.Advice;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2644 implements InterfaceC2645 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static long m3974(int i, int i2, int i3, int i4) {
        return (((long) (i2 & Advice.MethodSizeHandler.UNDEFINED_SIZE)) << 15) | ((long) (i & Advice.MethodSizeHandler.UNDEFINED_SIZE)) | (((long) (i3 & Advice.MethodSizeHandler.UNDEFINED_SIZE)) << 30) | (((long) (i4 & Advice.MethodSizeHandler.UNDEFINED_SIZE)) << 45) | Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int m3975(int i, long j) {
        int i2 = AbstractC2598.f5524;
        return ((int) (j >> (i * 15))) & Advice.MethodSizeHandler.UNDEFINED_SIZE;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean mo3976(AbstractC2961 abstractC2961) {
        return AbstractC2792.m4239(AbstractC2792.m4238(AbstractC2620.m3906(abstractC2961), false));
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean mo3977(C2583 c2583) {
        C2791 c2791M3814 = c2583.m3814();
        boolean z = false;
        if (c2791M3814 != null && c2791M3814.f6121) {
            z = true;
        }
        return !z;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean mo3978(AbstractC2961 abstractC2961) {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo3979(C2583 c2583, long j, C2615 c2615, int i, boolean z) {
        C2646 c2646 = c2583.f5439;
        AbstractC2629 abstractC2629 = c2646.f5630;
        InterfaceC7387 interfaceC7387 = AbstractC2629.f5584;
        c2646.f5630.m3952(AbstractC2629.f5586, abstractC2629.m3961(j), c2615, 1, z);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo3980() {
        return 8;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2645
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo3981(C2615 c2615, C2583 c2583) {
        return false;
    }
}
