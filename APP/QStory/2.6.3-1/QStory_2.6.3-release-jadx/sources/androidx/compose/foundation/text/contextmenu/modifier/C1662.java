package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.AbstractC2182;
import io.ktor.util.C5043;
import p128.C8157;
import p137.C8217;
import p191.AbstractC8568;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1662 implements InterfaceC1667 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1661 f2683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f2684;

    public C1662(C1661 c1661, long j) {
        this.f2683 = c1661;
        this.f2684 = j;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C8217 mo2199() {
        return AbstractC1665.m2205(this.f2683);
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final long mo2200(InterfaceC2530 interfaceC2530) {
        InterfaceC2530 interfaceC25302 = (InterfaceC2530) ((AbstractC2182) this.f2683.f2681).getValue();
        if (interfaceC25302 != null) {
            return interfaceC2530.mo3641(interfaceC25302, this.f2684);
        }
        AbstractC8570.m13653("Tried to open context menu before the anchor was placed.");
        C5043.m9161();
        return 0L;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final C8157 mo2201(InterfaceC2530 interfaceC2530) {
        return AbstractC8568.m13629(mo2200(interfaceC2530), 0L);
    }
}
