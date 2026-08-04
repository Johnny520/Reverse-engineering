package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0099 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f714;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f715;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f716;

    public C0099(Object obj, String str, boolean z) {
        this.f714 = z;
        this.f715 = obj;
        this.f716 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0099)) {
            return false;
        }
        C0099 c0099 = (C0099) obj;
        return this.f714 == c0099.f714 && AbstractC1544.m3188(this.f715, c0099.f715) && AbstractC1544.m3188(this.f716, c0099.f716);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f714) * 31;
        Object obj = this.f715;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f716;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-592619160372078L));
        AbstractC2104.m4017(sb, this.f714, -592709354685294L);
        sb.append(this.f715);
        sb.append(AbstractC2328.m4341(-592748009390958L));
        return AbstractC0897.m2000(sb, this.f716, ')');
    }
}
