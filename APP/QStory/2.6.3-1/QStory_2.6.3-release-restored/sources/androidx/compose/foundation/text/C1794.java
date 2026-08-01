package androidx.compose.foundation.text;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/text/飘花落叶言子世苏兰哲楪;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/飘花落叶言子世哲苏楪兰;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1794 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f3074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2865 f3075;

    public C1794(int i, int i2, C2865 c2865) {
        this.f3075 = c2865;
        this.f3073 = i;
        this.f3074 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1794)) {
            return false;
        }
        C1794 c1794 = (C1794) obj;
        return AbstractC5227.m9466(this.f3075, c1794.f3075) && this.f3073 == c1794.f3073 && this.f3074 == c1794.f3074;
    }

    public final int hashCode() {
        return (((this.f3075.hashCode() * 31) + this.f3073) * 31) + this.f3074;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1787 c1787 = (C1787) abstractC2961;
        C2865 c2865 = c1787.f3047;
        C2865 c28652 = this.f3075;
        boolean zM9466 = AbstractC5227.m9466(c2865, c28652);
        int i = this.f3073;
        int i2 = this.f3074;
        if (zM9466 && c1787.f3053 == i && c1787.f3052 == i2) {
            return;
        }
        c1787.f3047 = c28652;
        c1787.f3053 = i;
        c1787.f3052 = i2;
        c1787.f3048 = AbstractC2882.m4332(c28652, AbstractC2620.m3906(c1787).f5445);
        c1787.f3051 = true;
        AbstractC2620.m3910(c1787);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1787 c1787 = new C1787();
        c1787.f3047 = this.f3075;
        c1787.f3053 = this.f3073;
        c1787.f3052 = this.f3074;
        c1787.f3050 = -1;
        c1787.f3049 = -1;
        return c1787;
    }
}
