package io.ktor.server.routing;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.AbstractC5971;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f12882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC4971 f12883;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12884;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4986 f12885;

    public C4969(C4986 c4986, int i, C4973 c4973) {
        this.f12885 = c4986;
        this.f12884 = i;
        this.f12883 = c4973;
    }

    public final String toString() {
        return this.f12885 + ", segment:" + this.f12884 + " -> " + this.f12883;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9086(StringBuilder sb, int i) {
        sb.append(AbstractC5971.m10687(i, "  ") + this);
        sb.append('\n');
        ArrayList arrayList = this.f12882;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4969) it.next()).m9086(sb, i + 1);
            }
        }
    }
}
