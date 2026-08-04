package yyds;

/* JADX INFO: renamed from: yyds.ᛳᲈᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0753 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public String f3463;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public String f3464;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public long f3465;

    public C0753(long j, String str, String str2) {
        AbstractC2328.m4341(-1016446533141358L);
        AbstractC2328.m4341(-1016493777781614L);
        this.f3463 = str;
        this.f3464 = str2;
        this.f3465 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0753)) {
            return false;
        }
        C0753 c0753 = (C0753) obj;
        return AbstractC1544.m3188(this.f3463, c0753.f3463) && AbstractC1544.m3188(this.f3464, c0753.f3464) && this.f3465 == c0753.f3465;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3465) + AbstractC0897.m1997(this.f3464, this.f3463.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1016678461375342L));
        AbstractC0897.m2002(sb, this.f3463, -1016790130525038L);
        AbstractC0897.m2002(sb, this.f3464, -1016833080197998L);
        sb.append(this.f3465);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C0753() {
        this(0L, AbstractC2328.m4341(-1016523842552686L), AbstractC2328.m4341(-1016528137519982L));
    }
}
