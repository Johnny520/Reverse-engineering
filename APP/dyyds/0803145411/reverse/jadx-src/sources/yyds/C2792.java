package yyds;

/* JADX INFO: renamed from: yyds.ᲈᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2792 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f13651;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long f13652;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f13653;

    public C2792(int i, long j, int i2) {
        this.f13651 = i;
        this.f13652 = j;
        this.f13653 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2792)) {
            return false;
        }
        C2792 c2792 = (C2792) obj;
        return this.f13651 == c2792.f13651 && this.f13652 == c2792.f13652 && this.f13653 == c2792.f13653;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13653) + ((Long.hashCode(this.f13652) + (Integer.hashCode(this.f13651) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1729582902969198L));
        AbstractC2104.m4007(sb, this.f13651, -1729703162053486L);
        AbstractC0897.m1994(sb, this.f13652, -1729746111726446L);
        return AbstractC0897.m1999(sb, this.f13653, ')');
    }
}
