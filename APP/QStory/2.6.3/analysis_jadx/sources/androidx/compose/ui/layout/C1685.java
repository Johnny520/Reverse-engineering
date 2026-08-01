package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC1754;
import java.util.Map;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1685 implements InterfaceC1657 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f4944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6558 f4945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map f4946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f4947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f4948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4949;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1653 f4950;

    public /* synthetic */ C1685(int i, int i2, Map map, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, InterfaceC1653 interfaceC1653, int i3) {
        this.f4949 = i3;
        this.f4944 = interfaceC65582;
        this.f4950 = interfaceC1653;
        this.f4948 = i;
        this.f4947 = i2;
        this.f4946 = map;
        this.f4945 = interfaceC6558;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6558 mo1470() {
        switch (this.f4949) {
        }
        return this.f4945;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1471() {
        int i = this.f4949;
        InterfaceC1653 interfaceC1653 = this.f4950;
        InterfaceC6558 interfaceC6558 = this.f4944;
        switch (i) {
            case 0:
                interfaceC6558.invoke(((C1684) interfaceC1653).f4943.f5146);
                break;
            default:
                interfaceC6558.invoke(((AbstractC1754) interfaceC1653).f5146);
                break;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo1472() {
        switch (this.f4949) {
        }
        return this.f4946;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1473() {
        switch (this.f4949) {
        }
        return this.f4948;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1474() {
        switch (this.f4949) {
        }
        return this.f4947;
    }
}
