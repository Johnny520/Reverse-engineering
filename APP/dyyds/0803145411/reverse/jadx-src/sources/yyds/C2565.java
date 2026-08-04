package yyds;

/* JADX INFO: renamed from: yyds.ᲇᲈᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2565 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final long f12648;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f12649;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final EnumC1841 f12650;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f12651;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f12652;

    public C2565(String str, EnumC1841 enumC1841, String str2, boolean z, long j) {
        AbstractC2328.m4341(-628310338601838L);
        AbstractC2328.m4341(-628327518471022L);
        AbstractC2328.m4341(-628348993307502L);
        this.f12649 = str;
        this.f12650 = enumC1841;
        this.f12651 = str2;
        this.f12652 = z;
        this.f12648 = j;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2565 m4642(C2565 c2565, String str, boolean z, long j, int i) {
        if ((i & 1) != 0) {
            str = c2565.f12649;
        }
        String str2 = str;
        EnumC1841 enumC1841 = c2565.f12650;
        String str3 = c2565.f12651;
        if ((i & 8) != 0) {
            z = c2565.f12652;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            j = c2565.f12648;
        }
        AbstractC2328.m4341(-628374763111278L);
        AbstractC2328.m4341(-628391942980462L);
        AbstractC2328.m4341(-628413417816942L);
        return new C2565(str2, enumC1841, str3, z2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2565)) {
            return false;
        }
        C2565 c2565 = (C2565) obj;
        return this.f12649.equals(c2565.f12649) && this.f12650 == c2565.f12650 && this.f12651.equals(c2565.f12651) && this.f12652 == c2565.f12652 && this.f12648 == c2565.f12648;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12648) + AbstractC2104.m4021(AbstractC0897.m1997(this.f12651, (this.f12650.hashCode() + (this.f12649.hashCode() * 31)) * 31, 31), 31, this.f12652);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-628439187620718L));
        AbstractC0897.m2002(sb, this.f12649, -628525086966638L);
        sb.append(this.f12650);
        sb.append(AbstractC2328.m4341(-628559446705006L));
        AbstractC0897.m2002(sb, this.f12651, -628598101410670L);
        AbstractC2104.m4017(sb, this.f12652, -628645346050926L);
        sb.append(this.f12648);
        sb.append(')');
        return sb.toString();
    }
}
