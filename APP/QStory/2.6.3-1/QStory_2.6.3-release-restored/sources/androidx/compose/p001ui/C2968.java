package androidx.compose.p001ui;

import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.runtime.InterfaceC2201;
import androidx.compose.runtime.internal.C2088;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/飘花落叶言子楪苏哲兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/飘花落叶言子楪苏兰世哲;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class C2968 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2201 f6645;

    public C2968(C2088 c2088) {
        this.f6645 = c2088;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2968) && AbstractC5227.m9466(((C2968) obj).f6645, this.f6645);
    }

    public final int hashCode() {
        return this.f6645.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C2965 c2965 = (C2965) abstractC2961;
        InterfaceC2201 interfaceC2201 = this.f6645;
        c2965.f6642 = interfaceC2201;
        AbstractC2620.m3906(c2965).m3834(interfaceC2201);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C2965 c2965 = new C2965();
        c2965.f6642 = this.f6645;
        return c2965;
    }
}
