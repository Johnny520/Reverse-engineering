package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛲᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1725 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f8723;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f8724;

    public C1725(String str, String str2) {
        AbstractC2328.m4341(-687838585324398L);
        AbstractC2328.m4341(-687851470226286L);
        this.f8723 = str;
        this.f8724 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1725)) {
            return false;
        }
        C1725 c1725 = (C1725) obj;
        return this.f8723.equals(c1725.f8723) && this.f8724.equals(c1725.f8724);
    }

    public final int hashCode() {
        return this.f8724.hashCode() + (this.f8723.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-687907304801134L));
        AbstractC0897.m2002(sb, this.f8723, -687967434343278L);
        return AbstractC0897.m2000(sb, this.f8724, ')');
    }
}
