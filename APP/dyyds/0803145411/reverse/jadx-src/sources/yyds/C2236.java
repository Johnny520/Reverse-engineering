package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2236 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f11039;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f11040;

    public C2236(String str, int i) {
        AbstractC2328.m4341(-1545887151719278L);
        this.f11039 = str;
        this.f11040 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2236)) {
            return false;
        }
        C2236 c2236 = (C2236) obj;
        return AbstractC1544.m3188(this.f11039, c2236.f11039) && this.f11040 == c2236.f11040;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11040) + (this.f11039.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1545964461130606L));
        AbstractC0897.m2002(sb, this.f11039, -1546067540345710L);
        return AbstractC0897.m1999(sb, this.f11040, ')');
    }
}
