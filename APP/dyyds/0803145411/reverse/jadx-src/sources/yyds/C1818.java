package yyds;

import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛸᛷᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1818 implements InterfaceC1410 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f9142;

    public C1818(Object obj) {
        AbstractC0319.m992(obj, "Argument must not be null");
        this.f9142 = obj;
    }

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        if (obj instanceof C1818) {
            return this.f9142.equals(((C1818) obj).f9142);
        }
        return false;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return this.f9142.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f9142 + '}';
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        messageDigest.update(this.f9142.toString().getBytes(InterfaceC1410.f6680));
    }
}
