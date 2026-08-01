package io.ktor.server.routing;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.AbstractC5138;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4136 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f12533;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC4138 f12534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4153 f12536;

    public C4136(C4153 c4153, int i, C4140 c4140) {
        this.f12536 = c4153;
        this.f12535 = i;
        this.f12534 = c4140;
    }

    public final String toString() {
        return this.f12536 + ", segment:" + this.f12535 + " -> " + this.f12534;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8537(StringBuilder sb, int i) {
        sb.append(AbstractC5138.m10126(i, "  ") + this);
        sb.append('\n');
        ArrayList arrayList = this.f12533;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4136) it.next()).m8537(sb, i + 1);
            }
        }
    }
}
