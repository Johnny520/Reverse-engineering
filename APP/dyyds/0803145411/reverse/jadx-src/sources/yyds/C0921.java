package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛸᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0921 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f4222;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f4223;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0993 f4224;

    public C0921(boolean z, boolean z2, C0993 c0993) {
        AbstractC2328.m4341(-1083130195379054L);
        this.f4222 = z;
        this.f4223 = z2;
        this.f4224 = c0993;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0921)) {
            return false;
        }
        C0921 c0921 = (C0921) obj;
        return this.f4222 == c0921.f4222 && this.f4223 == c0921.f4223 && this.f4224.equals(c0921.f4224);
    }

    public final int hashCode() {
        return this.f4224.hashCode() + AbstractC2104.m4021(Boolean.hashCode(this.f4222) * 31, 31, this.f4223);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1083250454463342L));
        AbstractC2104.m4017(sb, this.f4222, -1083353533678446L);
        AbstractC2104.m4017(sb, this.f4223, -1083409368253294L);
        sb.append(this.f4224);
        sb.append(')');
        return sb.toString();
    }
}
