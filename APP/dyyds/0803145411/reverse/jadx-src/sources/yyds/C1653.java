package yyds;

import java.util.List;

/* JADX INFO: renamed from: yyds.ᛷᲁᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1653 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f8445;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final List f8446;

    public C1653(String str, List list) {
        AbstractC2328.m4341(-172137567126382L);
        AbstractC2328.m4341(-172163336930158L);
        this.f8445 = str;
        this.f8446 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1653)) {
            return false;
        }
        C1653 c1653 = (C1653) obj;
        return this.f8445.equals(c1653.f8445) && this.f8446.equals(c1653.f8446);
    }

    public final int hashCode() {
        return this.f8446.hashCode() + (this.f8445.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-172232056406894L));
        AbstractC0897.m2002(sb, this.f8445, -172348020523886L);
        sb.append(this.f8446);
        sb.append(')');
        return sb.toString();
    }
}
