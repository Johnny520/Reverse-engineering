package androidx.compose.ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1659 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    InterfaceC1695 mo1120(AbstractC1708 abstractC1708);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    InterfaceC1695 mo1121(InterfaceC1695 interfaceC1695);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default long mo1123(InterfaceC1695 interfaceC1695, InterfaceC1695 interfaceC16952) {
        int i = AbstractC1656.f4856;
        InterfaceC1695 interfaceC1695Mo1121 = mo1121(interfaceC1695);
        InterfaceC1695 interfaceC1695Mo11212 = mo1121(interfaceC16952);
        return interfaceC1695Mo1121 instanceof C1663 ? ((C1663) interfaceC1695Mo1121).mo3075(interfaceC1695Mo11212, 0L) : interfaceC1695Mo11212 instanceof C1663 ? ((C1663) interfaceC1695Mo11212).mo3075(interfaceC1695Mo1121, 0L) ^ (-9223372034707292160L) : interfaceC1695Mo1121.mo3075(interfaceC1695Mo1121, 0L);
    }
}
