package yyds;

import java.util.List;

/* JADX INFO: renamed from: yyds.ᲁᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2235 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final List f11036;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f11037;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f11038;

    public C2235(List list, boolean z, boolean z2) {
        AbstractC2328.m4341(-1045360252978030L);
        this.f11036 = list;
        this.f11037 = z;
        this.f11038 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2235)) {
            return false;
        }
        C2235 c2235 = (C2235) obj;
        return AbstractC1544.m3188(this.f11036, c2235.f11036) && this.f11037 == c2235.f11037 && this.f11038 == c2235.f11038;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11038) + AbstractC2104.m4021(this.f11036.hashCode() * 31, 31, this.f11037);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1045411792585582L));
        sb.append(this.f11036);
        sb.append(AbstractC2328.m4341(-1045501986898798L));
        AbstractC2104.m4017(sb, this.f11037, -1045549231539054L);
        return AbstractC0897.m1986(sb, this.f11038, ')');
    }
}
