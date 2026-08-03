package p211o9;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: o9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3089b {

    /* JADX INFO: renamed from: a */
    public final String f9980a;

    /* JADX INFO: renamed from: b */
    public final int f9981b;

    /* JADX INFO: renamed from: c */
    public final int f9982c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3089b(String str, int i9, int i10) {
        str.getClass();
        this.f9980a = str;
        this.f9981b = i9;
        this.f9982c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3089b)) {
            return false;
        }
        C3089b c3089b = (C3089b) obj;
        return AbstractC1416l.m3825a(this.f9980a, c3089b.f9980a) && this.f9981b == c3089b.f9981b && this.f9982c == c3089b.f9982c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f9982c) + AbstractC0921a.m2242e(this.f9981b, this.f9980a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2091b.m5163j(AbstractC0921a.m2258u(this.f9981b, "LeaveNotice(wxid=", this.f9980a, ", wxidStart=", ", wxidEnd="), this.f9982c, ")");
    }
}
