package androidx.compose.material3;

import androidx.appcompat.app.C0960;
import androidx.compose.animation.core.C1208;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.material.ripple.AbstractC1947;
import androidx.compose.material.ripple.C1941;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.C6008;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2025 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2026 f3738;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3739;

    public /* synthetic */ C2025(C2026 c2026, int i) {
        this.f3739 = i;
        this.f3738 = c2026;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f3739;
        C2026 c2026 = this.f3738;
        switch (i) {
            case 0:
                C1975 c1975 = (C1975) AbstractC2620.m3916(c2026, AbstractC1977.f3627);
                C1941 c1941 = c2026.f3740;
                if (c1975 == null) {
                    if (c1941 != null) {
                        c2026.m3928(c1941);
                    }
                    c2026.f3740 = null;
                } else if (c1941 == null) {
                    C0960 c0960 = new C0960(c2026, 15);
                    C2025 c2025 = new C2025(c2026, 1);
                    InterfaceC1420 interfaceC1420 = c2026.f3744;
                    boolean z = c2026.f3743;
                    float f = c2026.f3742;
                    C1208 c1208 = AbstractC1947.f3601;
                    C1941 c19412 = new C1941(interfaceC1420, z, f, c0960, c2025);
                    c2026.m3924(c19412);
                    c2026.f3740 = c19412;
                }
                return C6008.f15084;
            default:
                return AbstractC1978.f3628;
        }
    }
}
