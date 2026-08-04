package yyds;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: yyds.ᲈᛸᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2726 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f13391;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Bitmap f13392;

    public C2726(Bitmap bitmap, String str) {
        AbstractC2328.m4341(-765392809788270L);
        this.f13391 = str;
        this.f13392 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2726)) {
            return false;
        }
        C2726 c2726 = (C2726) obj;
        return AbstractC1544.m3188(this.f13391, c2726.f13391) && AbstractC1544.m3188(this.f13392, c2726.f13392);
    }

    public final int hashCode() {
        int iHashCode = this.f13391.hashCode() * 31;
        Bitmap bitmap = this.f13392;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-765470119199598L));
        AbstractC0897.m2002(sb, this.f13391, -765560313512814L);
        sb.append(this.f13392);
        sb.append(')');
        return sb.toString();
    }
}
