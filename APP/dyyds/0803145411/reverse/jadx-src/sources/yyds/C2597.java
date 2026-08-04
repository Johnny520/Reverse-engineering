package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛱᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2597 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final long f12791;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Long f12792;

    public C2597(long j, Long l) {
        this.f12791 = j;
        this.f12792 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2597)) {
            return false;
        }
        C2597 c2597 = (C2597) obj;
        return this.f12791 == c2597.f12791 && AbstractC1544.m3188(this.f12792, c2597.f12792);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f12791) * 31;
        Long l = this.f12792;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-519398557909870L));
        AbstractC0897.m1994(sb, this.f12791, -519561766667118L);
        sb.append(this.f12792);
        sb.append(')');
        return sb.toString();
    }
}
