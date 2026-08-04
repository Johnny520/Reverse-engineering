package yyds;

import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛸᲁᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1876 implements InterfaceC1410 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0410 f9431;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0822 f9432;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Class f9433;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f9434;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC1410 f9435;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f9436;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f9437;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Class f9438;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f9439;

    public C1876(Object obj, InterfaceC1410 interfaceC1410, int i, int i2, C0410 c0410, Class cls, Class cls2, C0822 c0822) {
        AbstractC0319.m992(obj, "Argument must not be null");
        this.f9434 = obj;
        this.f9435 = interfaceC1410;
        this.f9437 = i;
        this.f9439 = i2;
        this.f9431 = c0410;
        this.f9433 = cls;
        AbstractC0319.m992(cls2, "Transcode class must not be null");
        this.f9438 = cls2;
        this.f9432 = c0822;
    }

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1876)) {
            return false;
        }
        C1876 c1876 = (C1876) obj;
        return this.f9434.equals(c1876.f9434) && this.f9435.equals(c1876.f9435) && this.f9439 == c1876.f9439 && this.f9437 == c1876.f9437 && this.f9431.equals(c1876.f9431) && this.f9433.equals(c1876.f9433) && this.f9438.equals(c1876.f9438) && this.f9432.equals(c1876.f9432);
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        int i = this.f9436;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f9434.hashCode();
        this.f9436 = iHashCode;
        int iHashCode2 = ((((this.f9435.hashCode() + (iHashCode * 31)) * 31) + this.f9437) * 31) + this.f9439;
        this.f9436 = iHashCode2;
        int iHashCode3 = this.f9431.hashCode() + (iHashCode2 * 31);
        this.f9436 = iHashCode3;
        int iHashCode4 = this.f9433.hashCode() + (iHashCode3 * 31);
        this.f9436 = iHashCode4;
        int iHashCode5 = this.f9438.hashCode() + (iHashCode4 * 31);
        this.f9436 = iHashCode5;
        int iHashCode6 = this.f9432.f3758.hashCode() + (iHashCode5 * 31);
        this.f9436 = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f9434 + ", width=" + this.f9437 + ", height=" + this.f9439 + ", resourceClass=" + this.f9433 + ", transcodeClass=" + this.f9438 + ", signature=" + this.f9435 + ", hashCode=" + this.f9436 + ", transformations=" + this.f9431 + ", options=" + this.f9432 + '}';
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
