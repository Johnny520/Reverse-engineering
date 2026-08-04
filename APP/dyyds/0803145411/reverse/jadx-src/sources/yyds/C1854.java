package yyds;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: yyds.ᛸᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1854 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Bitmap f9328;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f9329;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f9330;

    public C1854(Bitmap bitmap, boolean z, boolean z2) {
        AbstractC2328.m4341(-1735823490450286L);
        this.f9328 = bitmap;
        this.f9329 = z;
        this.f9330 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1854)) {
            return false;
        }
        C1854 c1854 = (C1854) obj;
        return this.f9328.equals(c1854.f9328) && this.f9329 == c1854.f9329 && this.f9330 == c1854.f9330;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9330) + AbstractC2104.m4021(this.f9328.hashCode() * 31, 31, this.f9329);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1735883619992430L));
        sb.append(this.f9328);
        sb.append(AbstractC2328.m4341(-1735973814305646L));
        AbstractC2104.m4017(sb, this.f9329, -1736064008618862L);
        return AbstractC0897.m1986(sb, this.f9330, ')');
    }
}
