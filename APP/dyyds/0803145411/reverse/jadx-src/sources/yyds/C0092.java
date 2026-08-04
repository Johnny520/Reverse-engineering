package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛳᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0092 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f689;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2807 f690;

    public C0092(String str, C2807 c2807) {
        this.f689 = str;
        this.f690 = c2807;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0092)) {
            return false;
        }
        C0092 c0092 = (C0092) obj;
        return this.f689.equals(c0092.f689) && this.f690.equals(c0092.f690);
    }

    public final int hashCode() {
        return this.f690.hashCode() + (this.f689.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f689 + ", range=" + this.f690 + ')';
    }
}
