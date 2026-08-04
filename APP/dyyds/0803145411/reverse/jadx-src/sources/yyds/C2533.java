package yyds;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᲇᲁᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2533 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f12472;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f12473;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final WeakReference f12474;

    public C2533(String str, int i, WeakReference weakReference) {
        AbstractC2328.m4341(-579158732866414L);
        AbstractC2328.m4341(-579188797637486L);
        this.f12472 = str;
        this.f12473 = i;
        this.f12474 = weakReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2533)) {
            return false;
        }
        C2533 c2533 = (C2533) obj;
        return this.f12472.equals(c2533.f12472) && this.f12473 == c2533.f12473 && this.f12474.equals(c2533.f12474);
    }

    public final int hashCode() {
        return this.f12474.hashCode() + AbstractC2104.m4018(this.f12473, this.f12472.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-579304761754478L));
        AbstractC0897.m2002(sb, this.f12472, -579416430904174L);
        AbstractC2104.m4007(sb, this.f12473, -579489445348206L);
        sb.append(this.f12474);
        sb.append(')');
        return sb.toString();
    }
}
