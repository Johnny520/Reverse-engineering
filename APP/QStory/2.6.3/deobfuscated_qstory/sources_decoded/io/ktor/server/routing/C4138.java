package io.ktor.server.routing;

import androidx.compose.ui.graphics.vector.C1562;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4138 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f12541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC4139 f12542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4137 f12543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1562 f12544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f12545;

    public C4138(InterfaceC4065 interfaceC4065, List list) {
        interfaceC4065.getClass();
        list.getClass();
        this.f12545 = list;
        this.f12544 = new C1562(2, false);
        this.f12541 = new ArrayList();
    }

    public final String toString() {
        return "Trace for " + this.f12545;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8528(C4137 c4137) {
        C1562 c1562 = this.f12544;
        if (c1562.f4600.isEmpty()) {
            this.f12543 = c4137;
            return;
        }
        ArrayList arrayList = c1562.f4600;
        if (arrayList.isEmpty()) {
            C4211.m8617("Unable to peek an element into empty stack");
            return;
        }
        C4137 c41372 = (C4137) AbstractC4344.m8808(arrayList);
        c41372.getClass();
        ArrayList arrayList2 = c41372.f12537;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c41372.f12537 = arrayList2;
        }
        arrayList2.add(c4137);
    }
}
