package yyds;

/* JADX INFO: renamed from: yyds.ᛷᲇᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1661 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f8463;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f8464;

    public C1661(int i, Object obj) {
        this.f8463 = i;
        this.f8464 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1661)) {
            return false;
        }
        C1661 c1661 = (C1661) obj;
        return this.f8463 == c1661.f8463 && AbstractC1544.m3188(this.f8464, c1661.f8464);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f8463) * 31;
        Object obj = this.f8464;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f8463 + ", value=" + this.f8464 + ')';
    }
}
