package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛶᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2681 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    @InterfaceC0770("chineseName")
    private final String f13138;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("englishName")
    private final String f13139;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    @InterfaceC0770("code2")
    private final String f13140;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    @InterfaceC0770("code3")
    private final String f13141;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    @InterfaceC0770("phoneCode")
    private final String f13142;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    @InterfaceC0770("numericCode")
    private final String f13143;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2681)) {
            return false;
        }
        C2681 c2681 = (C2681) obj;
        return AbstractC1544.m3188(this.f13139, c2681.f13139) && AbstractC1544.m3188(this.f13140, c2681.f13140) && AbstractC1544.m3188(this.f13141, c2681.f13141) && AbstractC1544.m3188(this.f13143, c2681.f13143) && AbstractC1544.m3188(this.f13138, c2681.f13138) && AbstractC1544.m3188(this.f13142, c2681.f13142);
    }

    public final int hashCode() {
        return this.f13142.hashCode() + AbstractC0897.m1997(this.f13138, AbstractC0897.m1997(this.f13143, AbstractC0897.m1997(this.f13141, AbstractC0897.m1997(this.f13140, this.f13139.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1478327316153198L));
        AbstractC0897.m2002(sb, this.f13139, -1478417510466414L);
        AbstractC0897.m2002(sb, this.f13140, -1478456165172078L);
        AbstractC0897.m2002(sb, this.f13141, -1478494819877742L);
        AbstractC0897.m2002(sb, this.f13143, -1478559244387182L);
        AbstractC0897.m2002(sb, this.f13138, -1478623668896622L);
        return AbstractC0897.m2000(sb, this.f13142, ')');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String m4778() {
        return this.f13138;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m4779() {
        return this.f13140;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String m4780() {
        return this.f13141;
    }
}
