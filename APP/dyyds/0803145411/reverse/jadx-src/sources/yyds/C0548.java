package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛳᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0548 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f2623;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f2624;

    public C0548(String str, String str2) {
        AbstractC2328.m4341(-304216401412974L);
        AbstractC2328.m4341(-304242171216750L);
        this.f2623 = str;
        this.f2624 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0548)) {
            return false;
        }
        C0548 c0548 = (C0548) obj;
        return this.f2623.equals(c0548.f2623) && this.f2624.equals(c0548.f2624);
    }

    public final int hashCode() {
        return this.f2624.hashCode() + (this.f2623.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-304328070562670L));
        AbstractC0897.m2002(sb, this.f2623, -304444034679662L);
        return AbstractC0897.m2000(sb, this.f2624, ')');
    }
}
