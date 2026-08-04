package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1757 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f8829;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f8830;

    public C1757(int i, int i2) {
        this.f8829 = i;
        this.f8830 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1757)) {
            return false;
        }
        C1757 c1757 = (C1757) obj;
        return this.f8829 == c1757.f8829 && this.f8830 == c1757.f8830;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8830) + (Integer.hashCode(this.f8829) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1735698936398702L));
        AbstractC2104.m4007(sb, this.f8829, -1735784835744622L);
        return AbstractC0897.m1999(sb, this.f8830, ')');
    }
}
