package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛲᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0794 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final long f3648;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f3649;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long f3650;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long f3651;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final long f3652;

    public C0794(String str, long j, long j2, long j3, long j4) {
        AbstractC2328.m4341(-1733800560853870L);
        this.f3649 = str;
        this.f3650 = j;
        this.f3651 = j2;
        this.f3652 = j3;
        this.f3648 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0794)) {
            return false;
        }
        C0794 c0794 = (C0794) obj;
        return this.f3649.equals(c0794.f3649) && this.f3650 == c0794.f3650 && this.f3651 == c0794.f3651 && this.f3652 == c0794.f3652 && this.f3648 == c0794.f3648;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3648) + ((Long.hashCode(this.f3652) + ((Long.hashCode(this.f3651) + ((Long.hashCode(this.f3650) + (this.f3649.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1733843510526830L));
        AbstractC0897.m2002(sb, this.f3649, -1733886460199790L);
        AbstractC0897.m1994(sb, this.f3650, -1733925114905454L);
        AbstractC0897.m1994(sb, this.f3651, -1733959474643822L);
        AbstractC0897.m1994(sb, this.f3652, -1734015309218670L);
        sb.append(this.f3648);
        sb.append(')');
        return sb.toString();
    }
}
