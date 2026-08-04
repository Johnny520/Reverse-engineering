package yyds;

/* JADX INFO: renamed from: yyds.ᲈᲀᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2739 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final float f13445;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final float f13446;

    public C2739(float f, float f2) {
        this.f13445 = f;
        this.f13446 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2739)) {
            return false;
        }
        C2739 c2739 = (C2739) obj;
        return Float.compare(this.f13445, c2739.f13445) == 0 && Float.compare(this.f13446, c2739.f13446) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13446) + (Float.hashCode(this.f13445) * 31);
    }

    public final String toString() {
        return AbstractC2328.m4341(-779377223304046L) + this.f13445 + AbstractC2328.m4341(-779467417617262L) + this.f13446 + ')';
    }
}
