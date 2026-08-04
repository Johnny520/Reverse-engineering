package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛵᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0591 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f2805;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f2806;

    public C0591(Object obj, boolean z) {
        this.f2805 = z;
        this.f2806 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0591)) {
            return false;
        }
        C0591 c0591 = (C0591) obj;
        return this.f2805 == c0591.f2805 && AbstractC1544.m3188(this.f2806, c0591.f2806);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2805) * 31;
        Object obj = this.f2806;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-564860786738030L));
        AbstractC2104.m4017(sb, this.f2805, -564972455887726L);
        sb.append(this.f2806);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C0591() {
        this(null, false);
    }
}
