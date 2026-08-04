package yyds;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: yyds.ᛸᛸᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1843 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2534 f9270;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2534 f9271;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f9272;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C2534 f9269 = AbstractC1917.m3705(":");

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C2534 f9266 = AbstractC1917.m3705(":status");

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2534 f9268 = AbstractC1917.m3705(":method");

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C2534 f9267 = AbstractC1917.m3705(":path");

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C2534 f9264 = AbstractC1917.m3705(":scheme");

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final C2534 f9265 = AbstractC1917.m3705(":authority");

    public C1843(String str, String str2) {
        Charset charset = AbstractC0347.f1806;
        C2534 c2534 = new C2534(str.getBytes(charset));
        c2534.f12476 = str;
        C2534 c25342 = new C2534(str2.getBytes(charset));
        c25342.f12476 = str2;
        this(c2534, c25342);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1843)) {
            return false;
        }
        C1843 c1843 = (C1843) obj;
        return AbstractC1544.m3188(this.f9270, c1843.f9270) && AbstractC1544.m3188(this.f9271, c1843.f9271);
    }

    public final int hashCode() {
        return this.f9271.hashCode() + (this.f9270.hashCode() * 31);
    }

    public final String toString() {
        return this.f9270.m4576() + ": " + this.f9271.m4576();
    }

    public C1843(C2534 c2534, C2534 c25342) {
        this.f9270 = c2534;
        this.f9271 = c25342;
        this.f9272 = c25342.mo4261() + c2534.mo4261() + 32;
    }

    public C1843(C2534 c2534, String str) {
        C2534 c25342 = new C2534(str.getBytes(AbstractC0347.f1806));
        c25342.f12476 = str;
        this(c2534, c25342);
    }
}
