package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛳᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0305 implements InterfaceC1490 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1075 f1607;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f1608;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Class f1609;

    public C0305(C1075 c1075) {
        this.f1607 = c1075;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0305) {
            C0305 c0305 = (C0305) obj;
            if (this.f1608 == c0305.f1608 && this.f1609 == c0305.f1609) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f1608 * 31;
        Class cls = this.f1609;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f1608 + "array=" + this.f1609 + '}';
    }

    @Override // yyds.InterfaceC1490
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo968() {
        this.f1607.m1677(this);
    }
}
