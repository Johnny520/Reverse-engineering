package yyds;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: yyds.ᛸᛷᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1816 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f9138;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Bitmap f9139;

    public C1816(Bitmap bitmap, String str) {
        AbstractC2328.m4341(-692395545625454L);
        this.f9138 = str;
        this.f9139 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1816)) {
            return false;
        }
        C1816 c1816 = (C1816) obj;
        return AbstractC1544.m3188(this.f9138, c1816.f9138) && AbstractC1544.m3188(this.f9139, c1816.f9139);
    }

    public final int hashCode() {
        int iHashCode = this.f9138.hashCode() * 31;
        Bitmap bitmap = this.f9139;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-692472855036782L));
        AbstractC0897.m2002(sb, this.f9138, -692563049349998L);
        sb.append(this.f9139);
        sb.append(')');
        return sb.toString();
    }
}
