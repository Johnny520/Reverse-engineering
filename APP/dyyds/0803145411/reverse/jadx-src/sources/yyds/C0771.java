package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛱᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0771 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f3559;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f3560;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f3561;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f3562;

    public C0771(String str, String str2, String str3, String str4) {
        AbstractC2328.m4341(-629422735131502L);
        AbstractC2328.m4341(-629444209967982L);
        AbstractC2328.m4341(-629482864673646L);
        AbstractC2328.m4341(-629521519379310L);
        this.f3559 = str;
        this.f3560 = str2;
        this.f3561 = str3;
        this.f3562 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0771)) {
            return false;
        }
        C0771 c0771 = (C0771) obj;
        return this.f3559.equals(c0771.f3559) && this.f3560.equals(c0771.f3560) && AbstractC1544.m3188(this.f3561, c0771.f3561) && AbstractC1544.m3188(this.f3562, c0771.f3562);
    }

    public final int hashCode() {
        return this.f3562.hashCode() + AbstractC0897.m1997(this.f3561, AbstractC0897.m1997(this.f3560, this.f3559.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-629714792907630L));
        AbstractC0897.m2002(sb, this.f3559, -629800692253550L);
        AbstractC0897.m2002(sb, this.f3560, -629852231861102L);
        AbstractC0897.m2002(sb, this.f3561, -629903771468654L);
        return AbstractC0897.m2000(sb, this.f3562, ')');
    }
}
