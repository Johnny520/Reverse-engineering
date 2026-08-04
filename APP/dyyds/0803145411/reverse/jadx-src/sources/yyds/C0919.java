package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛸᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0919 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f4218;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f4219;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f4220;

    public C0919(boolean z, boolean z2, boolean z3) {
        this.f4218 = z;
        this.f4219 = z2;
        this.f4220 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0919)) {
            return false;
        }
        C0919 c0919 = (C0919) obj;
        return this.f4218 == c0919.f4218 && this.f4219 == c0919.f4219 && this.f4220 == c0919.f4220;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4220) + AbstractC2104.m4021(Boolean.hashCode(this.f4218) * 31, 31, this.f4219);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-618144151012206L));
        AbstractC2104.m4017(sb, this.f4218, -618242935260014L);
        AbstractC2104.m4017(sb, this.f4219, -618298769834862L);
        return AbstractC0897.m1986(sb, this.f4220, ')');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m2037() {
        return (this.f4218 || this.f4219 || this.f4220) ? false : true;
    }
}
