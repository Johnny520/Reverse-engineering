package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.AbstractC2589;
import java.util.Map;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2520 implements InterfaceC2492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f5289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7387 f5290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map f5291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f5292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5293;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5294;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2488 f5295;

    public /* synthetic */ C2520(int i, int i2, Map map, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC2488 interfaceC2488, int i3) {
        this.f5294 = i3;
        this.f5289 = interfaceC73872;
        this.f5295 = interfaceC2488;
        this.f5293 = i;
        this.f5292 = i2;
        this.f5291 = map;
        this.f5290 = interfaceC7387;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7387 mo2030() {
        switch (this.f5294) {
        }
        return this.f5290;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2031() {
        int i = this.f5294;
        InterfaceC2488 interfaceC2488 = this.f5295;
        InterfaceC7387 interfaceC7387 = this.f5289;
        switch (i) {
            case 0:
                interfaceC7387.invoke(((C2519) interfaceC2488).f5288.f5491);
                break;
            default:
                interfaceC7387.invoke(((AbstractC2589) interfaceC2488).f5491);
                break;
        }
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Map mo2032() {
        switch (this.f5294) {
        }
        return this.f5291;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo2033() {
        switch (this.f5294) {
        }
        return this.f5293;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2492
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo2034() {
        switch (this.f5294) {
        }
        return this.f5292;
    }
}
