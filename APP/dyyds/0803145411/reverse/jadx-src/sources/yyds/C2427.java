package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2427 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f11977;

    public C2427(String str) {
        this.f11977 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2427) {
            return this.f11977.equals(((C2427) obj).f11977);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11977.hashCode();
    }

    public final String toString() {
        return AbstractC2104.m4015(new StringBuilder("StringHeaderFactory{value='"), this.f11977, "'}");
    }
}
