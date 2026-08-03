package qa;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: qa.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3475c {

    /* JADX INFO: renamed from: a */
    public final EnumC3474b f11273a;

    /* JADX INFO: renamed from: b */
    public final String f11274b;

    /* JADX INFO: renamed from: c */
    public final String f11275c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3475c(EnumC3474b enumC3474b, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f11273a = enumC3474b;
        this.f11274b = str;
        this.f11275c = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3475c)) {
            return false;
        }
        C3475c c3475c = (C3475c) obj;
        return this.f11273a == c3475c.f11273a && AbstractC1416l.m3825a(this.f11274b, c3475c.f11274b) && AbstractC1416l.m3825a(this.f11275c, c3475c.f11275c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11275c.hashCode() + AbstractC0921a.m2244g(this.f11273a.hashCode() * 31, 31, this.f11274b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AmountTextState(target=");
        sb2.append(this.f11273a);
        sb2.append(", original=");
        sb2.append(this.f11274b);
        sb2.append(", rendered=");
        return AbstractC0921a.m2255r(sb2, this.f11275c, ")");
    }
}
