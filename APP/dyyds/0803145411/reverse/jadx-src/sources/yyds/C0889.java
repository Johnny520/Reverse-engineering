package yyds;

import android.view.View;

/* JADX INFO: renamed from: yyds.ᛴᛷᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0889 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final View f4072;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f4073;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f4074;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f4075;

    public C0889(View view, int i, boolean z, String str) {
        AbstractC2328.m4341(-203340504531822L);
        AbstractC2328.m4341(-203361979368302L);
        this.f4072 = view;
        this.f4073 = i;
        this.f4074 = z;
        this.f4075 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0889)) {
            return false;
        }
        C0889 c0889 = (C0889) obj;
        return this.f4072.equals(c0889.f4072) && this.f4073 == c0889.f4073 && this.f4074 == c0889.f4074 && this.f4075.equals(c0889.f4075);
    }

    public final int hashCode() {
        return this.f4075.hashCode() + AbstractC2104.m4021(AbstractC2104.m4018(this.f4073, this.f4072.hashCode() * 31, 31), 31, this.f4074);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-203434993812334L));
        sb.append(this.f4072);
        sb.append(AbstractC2328.m4341(-203503713289070L));
        AbstractC2104.m4007(sb, this.f4073, -203598202569582L);
        AbstractC2104.m4017(sb, this.f4074, -203654037144430L);
        return AbstractC0897.m2000(sb, this.f4075, ')');
    }
}
