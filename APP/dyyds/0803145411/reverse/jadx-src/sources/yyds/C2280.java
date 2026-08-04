package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛷᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2280 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final long f11219;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long f11220;

    public C2280(long j, long j2) {
        this.f11219 = j;
        this.f11220 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2280)) {
            return false;
        }
        C2280 c2280 = (C2280) obj;
        return this.f11219 == c2280.f11219 && this.f11220 == c2280.f11220;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11220) + (Long.hashCode(this.f11219) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-774064348758894L));
        AbstractC0897.m1994(sb, this.f11219, -774210377646958L);
        sb.append(this.f11220);
        sb.append(')');
        return sb.toString();
    }
}
