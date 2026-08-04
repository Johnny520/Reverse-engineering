package yyds;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲁᲁᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2342 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C2342 f11508 = new C2342(AbstractC1595.m3267(new ArrayList()), null);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Set f11509;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final AbstractC0181 f11510;

    public C2342(Set set, AbstractC0181 abstractC0181) {
        this.f11509 = set;
        this.f11510 = abstractC0181;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2342)) {
            return false;
        }
        C2342 c2342 = (C2342) obj;
        return c2342.f11509.equals(this.f11509) && AbstractC1544.m3188(c2342.f11510, this.f11510);
    }

    public final int hashCode() {
        int iHashCode = (this.f11509.hashCode() + 1517) * 41;
        AbstractC0181 abstractC0181 = this.f11510;
        return iHashCode + (abstractC0181 != null ? abstractC0181.hashCode() : 0);
    }
}
