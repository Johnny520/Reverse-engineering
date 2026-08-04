package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛵᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1771 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final long f8881;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long f8882;

    public C1771(long j, long j2) {
        this.f8881 = j;
        this.f8882 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1771)) {
            return false;
        }
        C1771 c1771 = (C1771) obj;
        return this.f8881 == c1771.f8881 && this.f8882 == c1771.f8882;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8882) + (Long.hashCode(this.f8881) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1726103979459438L));
        AbstractC0897.m1994(sb, this.f8881, -1726185583838062L);
        sb.append(this.f8882);
        sb.append(')');
        return sb.toString();
    }
}
