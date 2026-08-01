package androidx.compose.ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1659 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    InterfaceC1695 mo1121(AbstractC1708 abstractC1708);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    InterfaceC1695 mo1122(InterfaceC1695 interfaceC1695);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default long mo1124(InterfaceC1695 interfaceC1695, InterfaceC1695 interfaceC16952) {
        int i = AbstractC1656.f4857;
        InterfaceC1695 interfaceC1695Mo1122 = mo1122(interfaceC1695);
        InterfaceC1695 interfaceC1695Mo11222 = mo1122(interfaceC16952);
        return interfaceC1695Mo1122 instanceof C1663 ? ((C1663) interfaceC1695Mo1122).mo3085(interfaceC1695Mo11222, 0L) : interfaceC1695Mo11222 instanceof C1663 ? ((C1663) interfaceC1695Mo11222).mo3085(interfaceC1695Mo1122, 0L) ^ (-9223372034707292160L) : interfaceC1695Mo1122.mo3085(interfaceC1695Mo1122, 0L);
    }
}
