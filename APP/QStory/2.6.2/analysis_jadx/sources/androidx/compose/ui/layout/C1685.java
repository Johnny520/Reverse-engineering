package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC1754;
import java.util.Map;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1685 implements InterfaceC1657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f4943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6557 f4944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map f4945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f4946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f4947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4948;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1653 f4949;

    public /* synthetic */ C1685(int i, int i2, Map map, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, InterfaceC1653 interfaceC1653, int i3) {
        this.f4948 = i3;
        this.f4943 = interfaceC65572;
        this.f4949 = interfaceC1653;
        this.f4947 = i;
        this.f4946 = i2;
        this.f4945 = map;
        this.f4944 = interfaceC6557;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6557 mo1460() {
        switch (this.f4948) {
        }
        return this.f4944;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1461() {
        int i = this.f4948;
        InterfaceC1653 interfaceC1653 = this.f4949;
        InterfaceC6557 interfaceC6557 = this.f4943;
        switch (i) {
            case 0:
                interfaceC6557.invoke(((C1684) interfaceC1653).f4942.f5145);
                break;
            default:
                interfaceC6557.invoke(((AbstractC1754) interfaceC1653).f5145);
                break;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo1462() {
        switch (this.f4948) {
        }
        return this.f4945;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1463() {
        switch (this.f4948) {
        }
        return this.f4947;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1464() {
        switch (this.f4948) {
        }
        return this.f4946;
    }
}
