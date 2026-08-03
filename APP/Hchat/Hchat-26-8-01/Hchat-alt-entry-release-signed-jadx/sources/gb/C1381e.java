package gb;

import gg.AbstractC1416l;
import java.util.List;
import p068eh.AbstractC0921a;
import p304uf.C4329c;

/* JADX INFO: renamed from: gb.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1381e {

    /* JADX INFO: renamed from: a */
    public final List f4586a;

    /* JADX INFO: renamed from: b */
    public final long f4587b;

    /* JADX INFO: renamed from: c */
    public final int f4588c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1381e(C4329c c4329c, long j3, int i9) {
        c4329c.getClass();
        this.f4586a = c4329c;
        this.f4587b = j3;
        this.f4588c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1381e)) {
            return false;
        }
        C1381e c1381e = (C1381e) obj;
        return AbstractC1416l.m3825a(this.f4586a, c1381e.f4586a) && this.f4587b == c1381e.f4587b && this.f4588c == c1381e.f4588c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f4588c) + AbstractC0921a.m2243f(this.f4586a.hashCode() * 31, 31, this.f4587b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PluginMarketCommentPage(items=" + this.f4586a + ", total=" + this.f4587b + ", limit=" + this.f4588c + ")";
    }
}
