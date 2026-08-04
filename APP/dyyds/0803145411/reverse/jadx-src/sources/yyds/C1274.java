package yyds;

/* JADX INFO: renamed from: yyds.ᛶᛱᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1274 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f5861;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f5862;

    public C1274(String str, String str2) {
        AbstractC2328.m4341(-228182595371886L);
        AbstractC2328.m4341(-228216955110254L);
        this.f5861 = str;
        this.f5862 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1274)) {
            return false;
        }
        C1274 c1274 = (C1274) obj;
        return AbstractC1544.m3188(this.f5861, c1274.f5861) && AbstractC1544.m3188(this.f5862, c1274.f5862);
    }

    public final int hashCode() {
        return this.f5862.hashCode() + (this.f5861.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-228328624259950L));
        AbstractC0897.m2002(sb, this.f5861, -228448883344238L);
        return AbstractC0897.m2000(sb, this.f5862, ')');
    }
}
