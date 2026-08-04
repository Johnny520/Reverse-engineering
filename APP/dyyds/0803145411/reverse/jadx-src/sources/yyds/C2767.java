package yyds;

/* JADX INFO: renamed from: yyds.ᲈᲁᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2767 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f13501;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f13502;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f13503;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f13504;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f13505;

    public C2767(int i, String str, String str2, String str3, boolean z) {
        this.f13502 = i;
        this.f13503 = str;
        this.f13504 = str2;
        this.f13505 = str3;
        this.f13501 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2767)) {
            return false;
        }
        C2767 c2767 = (C2767) obj;
        return this.f13502 == c2767.f13502 && this.f13501 == c2767.f13501 && this.f13503.equals(c2767.f13503) && this.f13504.equals(c2767.f13504) && this.f13505.equals(c2767.f13505);
    }

    public final int hashCode() {
        return (this.f13505.hashCode() * this.f13504.hashCode() * this.f13503.hashCode()) + this.f13502 + (this.f13501 ? 64 : 0);
    }

    public final String toString() {
        return this.f13503 + "." + this.f13504 + this.f13505 + " (" + this.f13502 + (this.f13501 ? " itf" : "") + ")";
    }
}
