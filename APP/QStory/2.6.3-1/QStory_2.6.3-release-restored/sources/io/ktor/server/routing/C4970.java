package io.ktor.server.routing;

import androidx.compose.p001ui.graphics.vector.C2397;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4970 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f12886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC4971 f12887;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4969 f12888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2397 f12889;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f12890;

    public C4970(InterfaceC4897 interfaceC4897, List list) {
        interfaceC4897.getClass();
        list.getClass();
        this.f12890 = list;
        this.f12889 = new C2397(2, false);
        this.f12886 = new ArrayList();
    }

    public final String toString() {
        return "Trace for " + this.f12890;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9087(C4969 c4969) {
        C2397 c2397 = this.f12889;
        if (c2397.f4945.isEmpty()) {
            this.f12888 = c4969;
            return;
        }
        ArrayList arrayList = c2397.f4945;
        if (arrayList.isEmpty()) {
            C5043.m9176("Unable to peek an element into empty stack");
            return;
        }
        C4969 c49692 = (C4969) AbstractC5176.m9367(arrayList);
        c49692.getClass();
        ArrayList arrayList2 = c49692.f12882;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c49692.f12882 = arrayList2;
        }
        arrayList2.add(c4969);
    }
}
