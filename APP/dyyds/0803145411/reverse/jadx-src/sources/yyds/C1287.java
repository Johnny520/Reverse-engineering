package yyds;

/* JADX INFO: renamed from: yyds.ᛶᛲᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1287 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f5929;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f5930;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f5931;

    public C1287(String str, int i, String str2) {
        AbstractC2328.m4341(-583518124671854L);
        AbstractC2328.m4341(-583531009573742L);
        this.f5929 = str;
        this.f5930 = str2;
        this.f5931 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1287)) {
            return false;
        }
        C1287 c1287 = (C1287) obj;
        return this.f5929.equals(c1287.f5929) && this.f5930.equals(c1287.f5930) && this.f5931 == c1287.f5931;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5931) + AbstractC0897.m1997(this.f5930, this.f5929.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-583586844148590L));
        AbstractC0897.m2002(sb, this.f5929, -583664153559918L);
        AbstractC0897.m2002(sb, this.f5930, -583698513298286L);
        return AbstractC0897.m1999(sb, this.f5931, ')');
    }
}
