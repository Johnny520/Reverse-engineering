package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2607;
import java.util.Map;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2511 implements InterfaceC2492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C2496 f5254;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C2510 f5255;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f5256;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Map f5257;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f5258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5259;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f5260;

    public C2511(int i, int i2, Map map, InterfaceC7387 interfaceC7387, C2510 c2510, C2496 c2496, InterfaceC7387 interfaceC73872) {
        this.f5259 = i;
        this.f5258 = i2;
        this.f5257 = map;
        this.f5256 = interfaceC7387;
        this.f5255 = c2510;
        this.f5254 = c2496;
        this.f5260 = interfaceC73872;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7387 mo2030() {
        return this.f5256;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2031() {
        C2607 c2607;
        C2583 c2583 = this.f5254.f5219;
        boolean zMo2057 = this.f5255.mo2057();
        InterfaceC7387 interfaceC7387 = this.f5260;
        if (!zMo2057 || (c2607 = c2583.f5439.f5631.f5547) == null) {
            interfaceC7387.invoke(c2583.f5439.f5631.f5491);
        } else {
            interfaceC7387.invoke(c2607.f5491);
        }
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo2032() {
        return this.f5257;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo2033() {
        return this.f5259;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo2034() {
        return this.f5258;
    }
}
