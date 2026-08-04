package yyds;

import android.net.Uri;

/* JADX INFO: renamed from: yyds.ᛶᛷ */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0023 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Uri f6396;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f6397;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f6398;

    public C0023(Uri uri, int i, int i2) {
        AbstractC2328.m4341(-777977063965550L);
        this.f6396 = uri;
        this.f6397 = i;
        this.f6398 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0023)) {
            return false;
        }
        C0023 c0023 = (C0023) obj;
        return AbstractC1544.m3188(this.f6396, c0023.f6396) && this.f6397 == c0023.f6397 && this.f6398 == c0023.f6398;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6398) + AbstractC2104.m4018(this.f6397, this.f6396.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-778011423703918L));
        sb.append(this.f6396);
        sb.append(AbstractC2328.m4341(-778088733115246L));
        AbstractC2104.m4007(sb, this.f6397, -778144567690094L);
        return AbstractC0897.m1999(sb, this.f6398, ')');
    }
}
