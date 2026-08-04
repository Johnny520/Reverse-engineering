package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛶᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
final class C2268 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("packageName")
    private final String f11184;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    @InterfaceC0770(alternate = {"versionCode"}, value = "updateVersionCode")
    private final String f11185;

    public C2268() {
        String strM4341 = AbstractC2328.m4341(-852000825312110L);
        String strM43412 = AbstractC2328.m4341(-852005120279406L);
        AbstractC2328.m4341(-851871976293230L);
        AbstractC2328.m4341(-851923515900782L);
        this.f11184 = strM4341;
        this.f11185 = strM43412;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2268)) {
            return false;
        }
        C2268 c2268 = (C2268) obj;
        return AbstractC1544.m3188(this.f11184, c2268.f11184) && AbstractC1544.m3188(this.f11185, c2268.f11185);
    }

    public final int hashCode() {
        return this.f11185.hashCode() + (this.f11184.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-852138264265582L));
        AbstractC0897.m2002(sb, this.f11184, -852258523349870L);
        return AbstractC0897.m2000(sb, this.f11185, ')');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String m4275() {
        return this.f11184;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m4276() {
        return this.f11185;
    }
}
