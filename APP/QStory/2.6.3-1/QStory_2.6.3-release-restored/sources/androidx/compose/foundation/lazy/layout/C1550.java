package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2616;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1550 extends AbstractC2961 implements InterfaceC2616 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1553 f2343;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1550) && AbstractC5227.m9466(this.f2343, ((C1550) obj).f2343);
    }

    public final int hashCode() {
        return this.f2343.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f2343 + ')';
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        C1553 c1553 = this.f2343;
        c1553.m2070();
        c1553.f2356 = null;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        this.f2343.getClass();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        ArrayList arrayList = this.f2343.f2358;
        if (arrayList.size() <= 0) {
            ((C2593) interfaceC2341).m3871();
        } else {
            AbstractC0900.m697(arrayList.get(0));
            throw null;
        }
    }
}
