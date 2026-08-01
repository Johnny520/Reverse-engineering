package io.ktor.server.routing;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.AbstractC5139;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4137 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f12537;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC4139 f12538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4154 f12540;

    public C4137(C4154 c4154, int i, C4141 c4141) {
        this.f12540 = c4154;
        this.f12539 = i;
        this.f12538 = c4141;
    }

    public final String toString() {
        return this.f12540 + ", segment:" + this.f12539 + " -> " + this.f12538;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8527(StringBuilder sb, int i) {
        sb.append(AbstractC5139.m10128(i, "  ") + this);
        sb.append('\n');
        ArrayList arrayList = this.f12537;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4137) it.next()).m8527(sb, i + 1);
            }
        }
    }
}
