package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.AbstractC2580;
import androidx.compose.p001ui.node.AbstractC2629;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2495 implements InterfaceC2494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC7372 f5203;

    @Override // androidx.compose.p001ui.layout.InterfaceC2494
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC2530 mo1681(AbstractC2543 abstractC2543) {
        InterfaceC7372 interfaceC7372 = this.f5203;
        interfaceC7372.getClass();
        return (InterfaceC2530) interfaceC7372.invoke();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2494
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC2530 mo1682(InterfaceC2530 interfaceC2530) {
        C2498 c2498;
        C2498 c24982 = interfaceC2530 instanceof C2498 ? (C2498) interfaceC2530 : null;
        if (c24982 != null) {
            return c24982;
        }
        interfaceC2530.getClass();
        AbstractC2629 abstractC2629 = (AbstractC2629) interfaceC2530;
        AbstractC2580 abstractC2580Mo3845 = abstractC2629.mo3845();
        return (abstractC2580Mo3845 == null || (c2498 = abstractC2580Mo3845.f5405) == null) ? abstractC2629 : c2498;
    }
}
