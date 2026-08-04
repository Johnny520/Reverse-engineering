package yyds;

import android.net.Uri;

/* JADX INFO: renamed from: yyds.ᲈᛵᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2654 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Uri f13054;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f13055;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f13056;

    public C2654(Uri uri, String str, String str2) {
        AbstractC2328.m4341(-769610467672942L);
        AbstractC2328.m4341(-769644827411310L);
        AbstractC2328.m4341(-769683482116974L);
        this.f13054 = uri;
        this.f13055 = str;
        this.f13056 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2654)) {
            return false;
        }
        C2654 c2654 = (C2654) obj;
        return this.f13054.equals(c2654.f13054) && this.f13055.equals(c2654.f13055) && AbstractC1544.m3188(this.f13056, c2654.f13056);
    }

    public final int hashCode() {
        return this.f13056.hashCode() + AbstractC0897.m1997(this.f13055, this.f13054.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-769868165710702L));
        sb.append(this.f13054);
        sb.append(AbstractC2328.m4341(-769975539893102L));
        AbstractC0897.m2002(sb, this.f13055, -770027079500654L);
        return AbstractC0897.m2000(sb, this.f13056, ')');
    }
}
