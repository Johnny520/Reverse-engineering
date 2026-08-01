package io.ktor.server.routing;

import androidx.compose.ui.graphics.vector.C1562;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4137 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f12537;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC4138 f12538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4136 f12539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1562 f12540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f12541;

    public C4137(InterfaceC4064 interfaceC4064, List list) {
        interfaceC4064.getClass();
        list.getClass();
        this.f12541 = list;
        this.f12540 = new C1562(2, false);
        this.f12537 = new ArrayList();
    }

    public final String toString() {
        return "Trace for " + this.f12541;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8538(C4136 c4136) {
        C1562 c1562 = this.f12540;
        if (c1562.f4599.isEmpty()) {
            this.f12539 = c4136;
            return;
        }
        ArrayList arrayList = c1562.f4599;
        if (arrayList.isEmpty()) {
            C4210.m8627("Unable to peek an element into empty stack");
            return;
        }
        C4136 c41362 = (C4136) AbstractC4343.m8811(arrayList);
        c41362.getClass();
        ArrayList arrayList2 = c41362.f12533;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c41362.f12533 = arrayList2;
        }
        arrayList2.add(c4136);
    }
}
