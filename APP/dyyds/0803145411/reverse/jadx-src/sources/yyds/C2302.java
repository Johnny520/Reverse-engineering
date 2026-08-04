package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛸᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2302 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f11306;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f11307;

    public C2302(String str, String str2) {
        AbstractC2328.m4341(-103284946404206L);
        AbstractC2328.m4341(-103297831306094L);
        this.f11306 = str;
        this.f11307 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2302)) {
            return false;
        }
        C2302 c2302 = (C2302) obj;
        return AbstractC1544.m3188(this.f11306, c2302.f11306) && AbstractC1544.m3188(this.f11307, c2302.f11307);
    }

    public final int hashCode() {
        return this.f11307.hashCode() + (this.f11306.hashCode() * 31);
    }

    public final String toString() {
        return this.f11307;
    }
}
