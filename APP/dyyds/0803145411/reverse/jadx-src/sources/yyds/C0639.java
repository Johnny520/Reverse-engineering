package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛷᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0639 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f3068;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f3069;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f3070;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String f3071;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f3072;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f3073;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f3074;

    public C0639(boolean z, String str, int i, int i2, int i3, boolean z2, String str2, int i4) {
        str = (i4 & 2) != 0 ? null : str;
        i = (i4 & 4) != 0 ? 0 : i;
        i2 = (i4 & 8) != 0 ? 0 : i2;
        i3 = (i4 & 16) != 0 ? 0 : i3;
        z2 = (i4 & 32) != 0 ? false : z2;
        str2 = (i4 & 64) != 0 ? null : str2;
        this.f3069 = z;
        this.f3070 = str;
        this.f3072 = i;
        this.f3074 = i2;
        this.f3068 = i3;
        this.f3073 = z2;
        this.f3071 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0639)) {
            return false;
        }
        C0639 c0639 = (C0639) obj;
        return this.f3069 == c0639.f3069 && AbstractC1544.m3188(this.f3070, c0639.f3070) && this.f3072 == c0639.f3072 && this.f3074 == c0639.f3074 && this.f3068 == c0639.f3068 && this.f3073 == c0639.f3073 && AbstractC1544.m3188(this.f3071, c0639.f3071);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f3069) * 31;
        String str = this.f3070;
        int iM4021 = AbstractC2104.m4021(AbstractC2104.m4018(this.f3068, AbstractC2104.m4018(this.f3074, AbstractC2104.m4018(this.f3072, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.f3073);
        String str2 = this.f3071;
        return iM4021 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1721972220920686L));
        AbstractC2104.m4017(sb, this.f3069, -1722071005168494L);
        AbstractC0897.m2002(sb, this.f3070, -1722131134710638L);
        AbstractC2104.m4007(sb, this.f3072, -1722191264252782L);
        AbstractC2104.m4007(sb, this.f3074, -1722229918958446L);
        AbstractC2104.m4007(sb, this.f3068, -1722272868631406L);
        AbstractC2104.m4017(sb, this.f3073, -1722354473010030L);
        return AbstractC0897.m2000(sb, this.f3071, ')');
    }
}
