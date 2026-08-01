package androidx.compose.ui.layout;

import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1772;
import java.util.Map;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1676 implements InterfaceC1657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4908;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C1675 f4909;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f4910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Map f4911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f4912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4913;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f4914;

    public C1676(int i, int i2, Map map, InterfaceC6557 interfaceC6557, C1675 c1675, C1661 c1661, InterfaceC6557 interfaceC65572) {
        this.f4913 = i;
        this.f4912 = i2;
        this.f4911 = map;
        this.f4910 = interfaceC6557;
        this.f4909 = c1675;
        this.f4908 = c1661;
        this.f4914 = interfaceC65572;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6557 mo1460() {
        return this.f4910;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1461() {
        C1772 c1772;
        C1748 c1748 = this.f4908.f4873;
        boolean zMo1487 = this.f4909.mo1487();
        InterfaceC6557 interfaceC6557 = this.f4914;
        if (!zMo1487 || (c1772 = c1748.f5093.f5285.f5201) == null) {
            interfaceC6557.invoke(c1748.f5093.f5285.f5145);
        } else {
            interfaceC6557.invoke(c1772.f5145);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo1462() {
        return this.f4911;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1463() {
        return this.f4913;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1464() {
        return this.f4912;
    }
}
