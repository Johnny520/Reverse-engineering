package androidx.compose.p001ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2494 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    InterfaceC2530 mo1681(AbstractC2543 abstractC2543);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    InterfaceC2530 mo1682(InterfaceC2530 interfaceC2530);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default long mo1684(InterfaceC2530 interfaceC2530, InterfaceC2530 interfaceC25302) {
        int i = AbstractC2491.f5202;
        InterfaceC2530 interfaceC2530Mo1682 = mo1682(interfaceC2530);
        InterfaceC2530 interfaceC2530Mo16822 = mo1682(interfaceC25302);
        return interfaceC2530Mo1682 instanceof C2498 ? ((C2498) interfaceC2530Mo1682).mo3645(interfaceC2530Mo16822, 0L) : interfaceC2530Mo16822 instanceof C2498 ? ((C2498) interfaceC2530Mo16822).mo3645(interfaceC2530Mo1682, 0L) ^ (-9223372034707292160L) : interfaceC2530Mo1682.mo3645(interfaceC2530Mo1682, 0L);
    }
}
