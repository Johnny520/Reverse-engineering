package yyds;

/* JADX INFO: renamed from: yyds.ᛴᲀᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0934 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f4288;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f4289;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f4290;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f4291;

    public C0934(String str, int i, int i2, String str2, boolean z) {
        str = (i2 & 2) != 0 ? null : str;
        i = (i2 & 4) != 0 ? 0 : i;
        str2 = (i2 & 8) != 0 ? null : str2;
        this.f4288 = z;
        this.f4289 = str;
        this.f4290 = i;
        this.f4291 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0934)) {
            return false;
        }
        C0934 c0934 = (C0934) obj;
        return this.f4288 == c0934.f4288 && AbstractC1544.m3188(this.f4289, c0934.f4289) && this.f4290 == c0934.f4290 && AbstractC1544.m3188(this.f4291, c0934.f4291);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4288) * 31;
        String str = this.f4289;
        int iM4018 = AbstractC2104.m4018(this.f4290, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f4291;
        return iM4018 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1737434103186286L));
        AbstractC2104.m4017(sb, this.f4288, -1737532887434094L);
        AbstractC0897.m2002(sb, this.f4289, -1737593016976238L);
        AbstractC2104.m4007(sb, this.f4290, -1737653146518382L);
        return AbstractC0897.m2000(sb, this.f4291, ')');
    }
}
