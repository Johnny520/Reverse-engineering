package p332wb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.bp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4759bp {

    /* JADX INFO: renamed from: a */
    public final String f16108a;

    /* JADX INFO: renamed from: b */
    public final int f16109b;

    /* JADX INFO: renamed from: c */
    public final String f16110c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4759bp(String str, int i9, String str2) {
        str.getClass();
        str2.getClass();
        this.f16108a = str;
        this.f16109b = i9;
        this.f16110c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4759bp)) {
            return false;
        }
        C4759bp c4759bp = (C4759bp) obj;
        return AbstractC1416l.m3825a(this.f16108a, c4759bp.f16108a) && this.f16109b == c4759bp.f16109b && AbstractC1416l.m3825a(this.f16110c, c4759bp.f16110c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16110c.hashCode() + AbstractC0921a.m2242e(this.f16109b, this.f16108a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2255r(AbstractC0921a.m2258u(this.f16109b, "OptionItem(label=", this.f16108a, ", value=", ", summary="), this.f16110c, ")");
    }
}
