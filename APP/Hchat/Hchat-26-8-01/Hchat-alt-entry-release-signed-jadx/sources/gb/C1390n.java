package gb;

import gg.AbstractC1416l;
import java.util.List;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p304uf.C4329c;

/* JADX INFO: renamed from: gb.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1390n {

    /* JADX INFO: renamed from: a */
    public final List f4614a;

    /* JADX INFO: renamed from: b */
    public final int f4615b;

    /* JADX INFO: renamed from: c */
    public final int f4616c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1390n(C4329c c4329c, int i9, int i10) {
        c4329c.getClass();
        this.f4614a = c4329c;
        this.f4615b = i9;
        this.f4616c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1390n)) {
            return false;
        }
        C1390n c1390n = (C1390n) obj;
        return AbstractC1416l.m3825a(this.f4614a, c1390n.f4614a) && this.f4615b == c1390n.f4615b && this.f4616c == c1390n.f4616c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f4616c) + AbstractC0921a.m2242e(this.f4615b, this.f4614a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PluginMarketPage(items=");
        sb2.append(this.f4614a);
        sb2.append(", count=");
        sb2.append(this.f4615b);
        sb2.append(", limit=");
        return AbstractC2091b.m5163j(sb2, this.f4616c, ")");
    }
}
