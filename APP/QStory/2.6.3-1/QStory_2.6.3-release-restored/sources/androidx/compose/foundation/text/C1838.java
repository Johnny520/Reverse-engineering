package androidx.compose.foundation.text;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import io.ktor.util.C5043;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/text/飘花落叶言子苏兰哲楪世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/飘花落叶言子苏兰哲世楪;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1838 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2865 f3279;

    public C1838(C2865 c2865) {
        this.f3279 = c2865;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1838)) {
            return false;
        }
        return AbstractC5227.m9466(this.f3279, ((C1838) obj).f3279);
    }

    public final int hashCode() {
        return this.f3279.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1837 c1837 = (C1837) abstractC2961;
        c1837.getClass();
        C2865 c2865M4332 = AbstractC2882.m4332(this.f3279, AbstractC2620.m3906(c1837).f5445);
        c1837.m2480(c2865M4332, (InterfaceC2830) AbstractC2620.m3916(c1837, AbstractC2737.f5935));
        C1835 c1835 = c1837.f3277;
        if (c1835 != null) {
            C1835.m2477(c1835, null, null, c2865M4332, 23);
            AbstractC2620.m3910(c1837);
        } else {
            AbstractC8570.m13655("Min size state is not set.");
            C5043.m9161();
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1837(this.f3279);
    }
}
