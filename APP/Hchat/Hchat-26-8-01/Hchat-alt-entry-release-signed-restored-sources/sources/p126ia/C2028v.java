package p126ia;

import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: ia.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2028v {

    /* JADX INFO: renamed from: a */
    public final String f6855a;

    /* JADX INFO: renamed from: b */
    public final int f6856b;

    /* JADX INFO: renamed from: c */
    public final int f6857c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2028v(String str, int i9, int i10) {
        this.f6855a = str;
        this.f6856b = i9;
        this.f6857c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2028v)) {
            return false;
        }
        C2028v c2028v = (C2028v) obj;
        return this.f6855a.equals(c2028v.f6855a) && this.f6856b == c2028v.f6856b && this.f6857c == c2028v.f6857c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f6857c) + AbstractC0921a.m2242e(this.f6856b, this.f6855a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2091b.m5163j(AbstractC0921a.m2258u(this.f6856b, "Node(username=", this.f6855a, ", type=", ", commentId="), this.f6857c, ")");
    }
}
