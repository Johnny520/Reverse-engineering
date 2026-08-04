package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛲᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2174 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f10656;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f10657;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f10658;

    public C2174(String str, String str2, String str3) {
        AbstractC2328.m4341(-773536067781486L);
        AbstractC2328.m4341(-773557542617966L);
        AbstractC2328.m4341(-773596197323630L);
        this.f10656 = str;
        this.f10657 = str2;
        this.f10658 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2174)) {
            return false;
        }
        C2174 c2174 = (C2174) obj;
        return AbstractC1544.m3188(this.f10656, c2174.f10656) && AbstractC1544.m3188(this.f10657, c2174.f10657) && AbstractC1544.m3188(this.f10658, c2174.f10658);
    }

    public final int hashCode() {
        return this.f10658.hashCode() + AbstractC0897.m1997(this.f10657, this.f10656.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-773905434968942L));
        AbstractC0897.m2002(sb, this.f10656, -773961269543790L);
        AbstractC0897.m2002(sb, this.f10657, -774012809151342L);
        return AbstractC0897.m2000(sb, this.f10658, ')');
    }
}
