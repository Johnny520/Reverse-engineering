package p243q9;

import gg.AbstractC1416l;
import java.util.List;

/* JADX INFO: renamed from: q9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3469e {

    /* JADX INFO: renamed from: a */
    public final String f11243a;

    /* JADX INFO: renamed from: b */
    public final List f11244b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3469e(String str, List list) {
        str.getClass();
        this.f11243a = str;
        this.f11244b = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3469e)) {
            return false;
        }
        C3469e c3469e = (C3469e) obj;
        return AbstractC1416l.m3825a(this.f11243a, c3469e.f11243a) && this.f11244b.equals(c3469e.f11244b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11244b.hashCode() + (this.f11243a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ParsedAtContent(content=" + this.f11243a + ", atList=" + this.f11244b + ")";
    }
}
