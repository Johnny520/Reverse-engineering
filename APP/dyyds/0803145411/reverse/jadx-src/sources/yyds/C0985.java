package yyds;

/* JADX INFO: renamed from: yyds.ᛴᲇᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0985 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f4490;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long f4491;

    public C0985(long j, String str) {
        AbstractC2328.m4341(-1037457513153390L);
        this.f4490 = str;
        this.f4491 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0985)) {
            return false;
        }
        C0985 c0985 = (C0985) obj;
        return AbstractC1544.m3188(this.f4490, c0985.f4490) && this.f4491 == c0985.f4491;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4491) + (this.f4490.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1037517642695534L));
        AbstractC0897.m2002(sb, this.f4490, -1037612131976046L);
        sb.append(this.f4491);
        sb.append(')');
        return sb.toString();
    }
}
