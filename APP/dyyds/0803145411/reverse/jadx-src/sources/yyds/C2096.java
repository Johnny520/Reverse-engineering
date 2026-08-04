package yyds;

/* JADX INFO: renamed from: yyds.ᲀᲁᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2096 implements InterfaceC2786 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class f10384;

    public C2096(Class cls) {
        this.f10384 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2096) {
            return this.f10384.equals(((C2096) obj).f10384);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10384.hashCode();
    }

    public final String toString() {
        return this.f10384.toString() + " (Kotlin reflection is not available)";
    }

    @Override // yyds.InterfaceC2786
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class mo3993() {
        return this.f10384;
    }
}
