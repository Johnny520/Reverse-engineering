package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛵᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0350 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f1817;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f1818;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1524 f1819;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2001 f1820;

    public C0350(String str, Object obj, C1524 c1524, C2001 c2001) {
        AbstractC2328.m4341(-764959018091374L);
        AbstractC2328.m4341(-764976197960558L);
        AbstractC2328.m4341(-765014852666222L);
        this.f1817 = str;
        this.f1818 = obj;
        this.f1819 = c1524;
        this.f1820 = c2001;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0350) {
            C0350 c0350 = (C0350) obj;
            return this.f1817.equals(c0350.f1817) && this.f1818.equals(c0350.f1818) && this.f1819 == c0350.f1819 && this.f1820 == c0350.f1820;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1820.hashCode() + ((this.f1819.hashCode() + ((this.f1818.hashCode() + (this.f1817.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-765147996652398L));
        AbstractC0897.m2002(sb, this.f1817, -765221011096430L);
        sb.append(this.f1818);
        sb.append(AbstractC2328.m4341(-765289730573166L));
        sb.append(this.f1819);
        sb.append(AbstractC2328.m4341(-765341270180718L));
        sb.append(this.f1820);
        sb.append(')');
        return sb.toString();
    }
}
