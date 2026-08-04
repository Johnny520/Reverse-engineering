package yyds;

import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛱᲀᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0206 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Set f1185;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Set f1186;

    public C0206(Set set, Set set2) {
        AbstractC2328.m4341(-1729097571664750L);
        AbstractC2328.m4341(-1729136226370414L);
        this.f1185 = set;
        this.f1186 = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0206)) {
            return false;
        }
        C0206 c0206 = (C0206) obj;
        return this.f1185.equals(c0206.f1185) && this.f1186.equals(c0206.f1186);
    }

    public final int hashCode() {
        return this.f1186.hashCode() + (this.f1185.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2328.m4341(-1729320909964142L) + this.f1185 + AbstractC2328.m4341(-1729445464015726L) + this.f1186 + ')';
    }
}
