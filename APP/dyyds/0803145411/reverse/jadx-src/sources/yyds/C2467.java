package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛶᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2467 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f12182;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final long f12183;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f12184;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final long f12185;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f12186;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final long f12187;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f12188;

    public C2467(long j, String str, String str2, String str3, String str4, long j2, long j3) {
        AbstractC2328.m4341(-1477064595768174L);
        AbstractC2328.m4341(-1477086070604654L);
        AbstractC2328.m4341(-1477120430343022L);
        AbstractC2328.m4341(-1477163380015982L);
        this.f12183 = j;
        this.f12184 = str;
        this.f12186 = str2;
        this.f12188 = str3;
        this.f12182 = str4;
        this.f12187 = j2;
        this.f12185 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2467)) {
            return false;
        }
        C2467 c2467 = (C2467) obj;
        return this.f12183 == c2467.f12183 && AbstractC1544.m3188(this.f12184, c2467.f12184) && AbstractC1544.m3188(this.f12186, c2467.f12186) && AbstractC1544.m3188(this.f12188, c2467.f12188) && this.f12182.equals(c2467.f12182) && this.f12187 == c2467.f12187 && this.f12185 == c2467.f12185;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12185) + ((Long.hashCode(this.f12187) + AbstractC0897.m1997(this.f12182, AbstractC0897.m1997(this.f12188, AbstractC0897.m1997(this.f12186, AbstractC0897.m1997(this.f12184, Long.hashCode(this.f12183) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1477382423348078L));
        AbstractC0897.m1994(sb, this.f12183, -1477464027726702L);
        AbstractC0897.m2002(sb, this.f12184, -1477498387465070L);
        AbstractC0897.m2002(sb, this.f12186, -1477545632105326L);
        AbstractC0897.m2002(sb, this.f12188, -1477601466680174L);
        AbstractC0897.m2002(sb, this.f12182, -1477674481124206L);
        AbstractC0897.m1994(sb, this.f12187, -1477726020731758L);
        sb.append(this.f12185);
        sb.append(')');
        return sb.toString();
    }
}
