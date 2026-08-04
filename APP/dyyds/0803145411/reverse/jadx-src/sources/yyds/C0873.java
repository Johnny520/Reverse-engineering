package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛶᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0873 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f3991;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f3992;

    public C0873(String str, boolean z) {
        AbstractC2328.m4341(-779531842126702L);
        this.f3991 = str;
        this.f3992 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0873)) {
            return false;
        }
        C0873 c0873 = (C0873) obj;
        return AbstractC1544.m3188(this.f3991, c0873.f3991) && this.f3992 == c0873.f3992;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3992) + (this.f3991.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-779566201865070L));
        AbstractC0897.m2002(sb, this.f3991, -779712230753134L);
        return AbstractC0897.m1986(sb, this.f3992, ')');
    }
}
