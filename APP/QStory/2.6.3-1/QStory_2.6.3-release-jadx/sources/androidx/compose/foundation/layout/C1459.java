package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子哲楪兰苏世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子哲世楪苏兰;", "foundation-layout"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1459 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f2065;

    public C1459(InterfaceC7387 interfaceC7387) {
        this.f2065 = interfaceC7387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1459) {
            return this.f2065 == ((C1459) obj).f2065;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2065.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1451 c1451 = (C1451) abstractC2961;
        InterfaceC7387 interfaceC7387 = c1451.f2049;
        InterfaceC7387 interfaceC73872 = this.f2065;
        if (interfaceC7387 != interfaceC73872) {
            c1451.f2049 = interfaceC73872;
            C1466 c1466 = c1451.f2048;
            if (c1466 != null) {
                InterfaceC1449 interfaceC1449 = (InterfaceC1449) interfaceC73872.invoke(c1466);
                if (AbstractC5227.m9466(interfaceC1449, c1451.f2219)) {
                    return;
                }
                c1451.f2219 = interfaceC1449;
                c1451.mo1918();
            }
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1451 c1451 = new C1451(AbstractC1469.f2117);
        c1451.f2049 = this.f2065;
        return c1451;
    }
}
