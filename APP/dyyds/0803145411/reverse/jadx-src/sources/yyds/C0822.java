package yyds;

import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛴᛳᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0822 implements InterfaceC1410 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0410 f3758 = new C0410(0);

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        if (obj instanceof C0822) {
            return this.f3758.equals(((C0822) obj).f3758);
        }
        return false;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return this.f3758.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f3758 + '}';
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0410 c0410 = this.f3758;
            if (i >= c0410.f4500) {
                return;
            }
            C2120 c2120 = (C2120) c0410.m2173(i);
            Object objM2171 = this.f3758.m2171(i);
            InterfaceC0132 interfaceC0132 = c2120.f10468;
            if (c2120.f10470 == null) {
                c2120.f10470 = c2120.f10469.getBytes(InterfaceC1410.f6680);
            }
            interfaceC0132.mo578(c2120.f10470, objM2171, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object m1891(C2120 c2120) {
        C0410 c0410 = this.f3758;
        return c0410.containsKey(c2120) ? c0410.get(c2120) : c2120.f10467;
    }
}
