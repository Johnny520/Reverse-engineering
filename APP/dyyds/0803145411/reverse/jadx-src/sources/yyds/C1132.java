package yyds;

import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᛵᛷᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1132 implements Serializable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    @InterfaceC0770("previewUrl")
    private final String f5200;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    @InterfaceC0770("ownerUserId")
    private final String f5201;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    @InterfaceC0770("key")
    private final String f5202;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    @InterfaceC0770("emojiJson")
    private final String f5203;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    @InterfaceC0770("displayName")
    private final String f5204;

    public C1132(String str, String str2, String str3, String str4, String str5) {
        AbstractC2328.m4341(-1478679503471470L);
        AbstractC2328.m4341(-1478696683340654L);
        AbstractC2328.m4341(-1478748222948206L);
        AbstractC2328.m4341(-1478795467588462L);
        this.f5202 = str;
        this.f5204 = str2;
        this.f5200 = str3;
        this.f5203 = str4;
        this.f5201 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132)) {
            return false;
        }
        C1132 c1132 = (C1132) obj;
        return AbstractC1544.m3188(this.f5202, c1132.f5202) && AbstractC1544.m3188(this.f5204, c1132.f5204) && AbstractC1544.m3188(this.f5200, c1132.f5200) && AbstractC1544.m3188(this.f5203, c1132.f5203) && AbstractC1544.m3188(this.f5201, c1132.f5201);
    }

    public final int hashCode() {
        int iM1997 = AbstractC0897.m1997(this.f5203, AbstractC0897.m1997(this.f5200, AbstractC0897.m1997(this.f5204, this.f5202.hashCode() * 31, 31), 31), 31);
        String str = this.f5201;
        return iM1997 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1479014510920558L));
        AbstractC0897.m2002(sb, this.f5202, -1479109000201070L);
        AbstractC0897.m2002(sb, this.f5204, -1479173424710510L);
        AbstractC0897.m2002(sb, this.f5200, -1479233554252654L);
        AbstractC0897.m2002(sb, this.f5203, -1479289388827502L);
        return AbstractC0897.m2000(sb, this.f5201, ')');
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String m2317() {
        return this.f5200;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String m2318() {
        return this.f5204;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m2319() {
        return this.f5203;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String m2320() {
        return this.f5202;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String m2321() {
        return this.f5201;
    }

    public C1132() {
        this(AbstractC2328.m4341(-1478838417261422L), AbstractC2328.m4341(-1478842712228718L), AbstractC2328.m4341(-1478847007196014L), AbstractC2328.m4341(-1478851302163310L), null);
    }
}
