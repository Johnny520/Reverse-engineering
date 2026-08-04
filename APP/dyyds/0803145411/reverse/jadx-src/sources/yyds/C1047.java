package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛲᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1047 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f4753;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Boolean f4754;

    public C1047(boolean z, Boolean bool) {
        this.f4753 = z;
        this.f4754 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1047)) {
            return false;
        }
        C1047 c1047 = (C1047) obj;
        return this.f4753 == c1047.f4753 && AbstractC1544.m3188(this.f4754, c1047.f4754);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4753) * 31;
        Boolean bool = this.f4754;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-752658231755630L));
        AbstractC2104.m4017(sb, this.f4753, -752778490839918L);
        sb.append(this.f4754);
        sb.append(')');
        return sb.toString();
    }
}
