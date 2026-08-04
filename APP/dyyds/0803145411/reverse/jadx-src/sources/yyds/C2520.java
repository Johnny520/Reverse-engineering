package yyds;

/* JADX INFO: renamed from: yyds.ᲇᲀᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2520 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("province")
    private final String f12428;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    @InterfaceC0770("city")
    private final String f12429;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    @InterfaceC0770("adminCode")
    private final String f12430;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    @InterfaceC0770("cityCode")
    private final String f12431;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2520)) {
            return false;
        }
        C2520 c2520 = (C2520) obj;
        return AbstractC1544.m3188(this.f12428, c2520.f12428) && AbstractC1544.m3188(this.f12429, c2520.f12429) && AbstractC1544.m3188(this.f12430, c2520.f12430) && AbstractC1544.m3188(this.f12431, c2520.f12431);
    }

    public final int hashCode() {
        return this.f12431.hashCode() + AbstractC0897.m1997(this.f12430, AbstractC0897.m1997(this.f12429, this.f12428.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1475788990481262L));
        AbstractC0897.m2002(sb, this.f12428, -1475870594859886L);
        AbstractC0897.m2002(sb, this.f12429, -1475904954598254L);
        AbstractC0897.m2002(sb, this.f12430, -1475960789173102L);
        return AbstractC0897.m2000(sb, this.f12431, ')');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String m4562() {
        return this.f12430;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m4563() {
        return this.f12429;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String m4564() {
        return this.f12428;
    }
}
