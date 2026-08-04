package yyds;

import java.util.List;

/* JADX INFO: renamed from: yyds.ᛶᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1323 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f6082;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f6083;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final List f6084;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f6085;

    public C1323(String str, String str2, List list, String str3) {
        AbstractC2328.m4341(-113489788699502L);
        AbstractC2328.m4341(-113515558503278L);
        AbstractC2328.m4341(-113554213208942L);
        AbstractC2328.m4341(-113592867914606L);
        this.f6082 = str;
        this.f6083 = str2;
        this.f6084 = list;
        this.f6085 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1323)) {
            return false;
        }
        C1323 c1323 = (C1323) obj;
        return this.f6082.equals(c1323.f6082) && this.f6083.equals(c1323.f6083) && this.f6084.equals(c1323.f6084) && this.f6085.equals(c1323.f6085);
    }

    public final int hashCode() {
        return this.f6085.hashCode() + ((this.f6084.hashCode() + AbstractC0897.m1997(this.f6083, this.f6082.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-113803321312110L));
        AbstractC0897.m2002(sb, this.f6082, -113923580396398L);
        AbstractC0897.m2002(sb, this.f6083, -113975120003950L);
        sb.append(this.f6084);
        sb.append(AbstractC2328.m4341(-114026659611502L));
        return AbstractC0897.m2000(sb, this.f6085, ')');
    }
}
