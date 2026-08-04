package yyds;

/* JADX INFO: renamed from: yyds.ᛵᲁᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1194 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f5465;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f5466;

    public C1194(String str, String str2) {
        AbstractC2328.m4341(-566321075618670L);
        AbstractC2328.m4341(-566333960520558L);
        this.f5465 = str;
        this.f5466 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1194)) {
            return false;
        }
        C1194 c1194 = (C1194) obj;
        return this.f5465.equals(c1194.f5465) && this.f5466.equals(c1194.f5466);
    }

    public final int hashCode() {
        return this.f5466.hashCode() + (this.f5465.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-566467104506734L));
        AbstractC0897.m2002(sb, this.f5465, -566518644114286L);
        return AbstractC0897.m2000(sb, this.f5466, ')');
    }
}
