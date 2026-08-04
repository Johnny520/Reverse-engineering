package yyds;

import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛲᲀᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0440 implements InterfaceC1410 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC1410 f2255;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1410 f2256;

    public C0440(InterfaceC1410 interfaceC1410, InterfaceC1410 interfaceC14102) {
        this.f2255 = interfaceC1410;
        this.f2256 = interfaceC14102;
    }

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        if (obj instanceof C0440) {
            C0440 c0440 = (C0440) obj;
            if (this.f2255.equals(c0440.f2255) && this.f2256.equals(c0440.f2256)) {
                return true;
            }
        }
        return false;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return this.f2256.hashCode() + (this.f2255.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f2255 + ", signature=" + this.f2256 + '}';
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo1227(MessageDigest messageDigest) {
        this.f2255.mo1227(messageDigest);
        this.f2256.mo1227(messageDigest);
    }
}
