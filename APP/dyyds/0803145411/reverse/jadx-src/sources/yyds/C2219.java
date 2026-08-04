package yyds;

import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲁᛴᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2219 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Set f10977;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f10978;

    public C2219(Set set, boolean z) {
        AbstractC2328.m4341(-618406144017262L);
        this.f10977 = set;
        this.f10978 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2219)) {
            return false;
        }
        C2219 c2219 = (C2219) obj;
        return this.f10977.equals(c2219.f10977) && this.f10978 == c2219.f10978;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10978) + (this.f10977.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-618449093690222L));
        sb.append(this.f10977);
        sb.append(AbstractC2328.m4341(-618539288003438L));
        return AbstractC0897.m1986(sb, this.f10978, ')');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m4209() {
        return !this.f10977.isEmpty() || this.f10978;
    }
}
