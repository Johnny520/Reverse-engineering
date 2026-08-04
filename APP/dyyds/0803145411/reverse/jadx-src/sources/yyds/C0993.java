package yyds;

/* JADX INFO: renamed from: yyds.ᛴᲈᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0993 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f4508;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f4509;

    public C0993(int i, String str) {
        this.f4508 = i;
        this.f4509 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0993)) {
            return false;
        }
        C0993 c0993 = (C0993) obj;
        return this.f4508 == c0993.f4508 && AbstractC1544.m3188(this.f4509, c0993.f4509);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f4508) * 31;
        String str = this.f4509;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-832888220844910L));
        AbstractC2104.m4007(sb, this.f4508, -833012774896494L);
        return AbstractC0897.m2000(sb, this.f4509, ')');
    }
}
