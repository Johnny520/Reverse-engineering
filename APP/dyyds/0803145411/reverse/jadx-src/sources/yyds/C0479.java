package yyds;

/* JADX INFO: renamed from: yyds.ᛲᲇᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0479 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object f2387;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f2388;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f2389;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f2390;

    public C0479(Object obj, String str, int i, boolean z) {
        AbstractC2328.m4341(-1071658337731438L);
        AbstractC2328.m4341(-1071696992437102L);
        this.f2387 = obj;
        this.f2388 = str;
        this.f2389 = i;
        this.f2390 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0479)) {
            return false;
        }
        C0479 c0479 = (C0479) obj;
        return AbstractC1544.m3188(this.f2387, c0479.f2387) && this.f2388.equals(c0479.f2388) && this.f2389 == c0479.f2389 && this.f2390 == c0479.f2390;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2390) + AbstractC2104.m4018(this.f2389, AbstractC0897.m1997(this.f2388, this.f2387.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1071778596815726L));
        sb.append(this.f2387);
        sb.append(AbstractC2328.m4341(-1071873086096238L));
        AbstractC0897.m2002(sb, this.f2388, -1071907445834606L);
        AbstractC2104.m4007(sb, this.f2389, -1071946100540270L);
        return AbstractC0897.m1986(sb, this.f2390, ')');
    }
}
