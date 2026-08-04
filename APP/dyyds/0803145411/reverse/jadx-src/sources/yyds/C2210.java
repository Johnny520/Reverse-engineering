package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛳᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2210 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f10942;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f10943;

    public C2210(String str, int i) {
        AbstractC2328.m4341(-1461400850039662L);
        this.f10942 = str;
        this.f10943 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2210)) {
            return false;
        }
        C2210 c2210 = (C2210) obj;
        return AbstractC1544.m3188(this.f10942, c2210.f10942) && this.f10943 == c2210.f10943;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10943) + (this.f10942.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1461478159450990L));
        AbstractC0897.m2002(sb, this.f10942, -1461607008469870L);
        return AbstractC0897.m1999(sb, this.f10943, ')');
    }
}
