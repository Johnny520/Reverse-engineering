package yyds;

/* JADX INFO: renamed from: yyds.ᛷᲇᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1672 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f8529;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f8530;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f8531;

    public C1672(String str, int i, String str2) {
        AbstractC2328.m4341(-796119005823854L);
        AbstractC2328.m4341(-796131890725742L);
        this.f8529 = str;
        this.f8530 = str2;
        this.f8531 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672)) {
            return false;
        }
        C1672 c1672 = (C1672) obj;
        return this.f8529.equals(c1672.f8529) && this.f8530.equals(c1672.f8530) && this.f8531 == c1672.f8531;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8531) + AbstractC0897.m1997(this.f8530, this.f8529.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-796196315235182L));
        AbstractC0897.m2002(sb, this.f8529, -796234969940846L);
        AbstractC0897.m2002(sb, this.f8530, -796273624646510L);
        return AbstractC0897.m1999(sb, this.f8531, ')');
    }
}
