package androidx.compose.ui.layout;

import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1772;
import java.util.Map;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1676 implements InterfaceC1657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4909;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C1675 f4910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f4911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Map f4912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f4913;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4914;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f4915;

    public C1676(int i, int i2, Map map, InterfaceC6558 interfaceC6558, C1675 c1675, C1661 c1661, InterfaceC6558 interfaceC65582) {
        this.f4914 = i;
        this.f4913 = i2;
        this.f4912 = map;
        this.f4911 = interfaceC6558;
        this.f4910 = c1675;
        this.f4909 = c1661;
        this.f4915 = interfaceC65582;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6558 mo1470() {
        return this.f4911;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1471() {
        C1772 c1772;
        C1748 c1748 = this.f4909.f4874;
        boolean zMo1497 = this.f4910.mo1497();
        InterfaceC6558 interfaceC6558 = this.f4915;
        if (!zMo1497 || (c1772 = c1748.f5094.f5286.f5202) == null) {
            interfaceC6558.invoke(c1748.f5094.f5286.f5146);
        } else {
            interfaceC6558.invoke(c1772.f5146);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo1472() {
        return this.f4912;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1473() {
        return this.f4914;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1474() {
        return this.f4913;
    }
}
