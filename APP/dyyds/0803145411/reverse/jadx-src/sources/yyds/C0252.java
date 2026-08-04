package yyds;

import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: yyds.ᛱᲈᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0252 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("reviewer")
    private final Integer f1387;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    @InterfaceC0770("commit_from")
    private final String f1388;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    @InterfaceC0770("from_who")
    private final String f1389;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("uuid")
    private final String f1390;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    @InterfaceC0770("hitokoto")
    private final String f1391;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    @InterfaceC0770("creator_uid")
    private final Integer f1392;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    @InterfaceC0770(Name.LENGTH)
    private final Integer f1393;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("created_at")
    private final String f1394;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    @InterfaceC0770("type")
    private final String f1395;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    @InterfaceC0770("creator")
    private final String f1396;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    @InterfaceC0770("from")
    private final String f1397;

    public C0252() {
        String strM4341 = AbstractC2328.m4341(-565157139481454L);
        String strM43412 = AbstractC2328.m4341(-565161434448750L);
        String strM43413 = AbstractC2328.m4341(-565165729416046L);
        String strM43414 = AbstractC2328.m4341(-565170024383342L);
        String strM43415 = AbstractC2328.m4341(-565174319350638L);
        String strM43416 = AbstractC2328.m4341(-565178614317934L);
        String strM43417 = AbstractC2328.m4341(-565182909285230L);
        String strM43418 = AbstractC2328.m4341(-565187204252526L);
        this.f1390 = strM4341;
        this.f1391 = strM43412;
        this.f1395 = strM43413;
        this.f1397 = strM43414;
        this.f1389 = strM43415;
        this.f1396 = strM43416;
        this.f1392 = 0;
        this.f1387 = 0;
        this.f1388 = strM43417;
        this.f1394 = strM43418;
        this.f1393 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0252)) {
            return false;
        }
        C0252 c0252 = (C0252) obj;
        return AbstractC1544.m3188(this.f1390, c0252.f1390) && AbstractC1544.m3188(this.f1391, c0252.f1391) && AbstractC1544.m3188(this.f1395, c0252.f1395) && AbstractC1544.m3188(this.f1397, c0252.f1397) && AbstractC1544.m3188(this.f1389, c0252.f1389) && AbstractC1544.m3188(this.f1396, c0252.f1396) && AbstractC1544.m3188(this.f1392, c0252.f1392) && AbstractC1544.m3188(this.f1387, c0252.f1387) && AbstractC1544.m3188(this.f1388, c0252.f1388) && AbstractC1544.m3188(this.f1394, c0252.f1394) && AbstractC1544.m3188(this.f1393, c0252.f1393);
    }

    public final int hashCode() {
        String str = this.f1390;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1391;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1395;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1397;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1389;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f1396;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f1392;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f1387;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.f1388;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f1394;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.f1393;
        return iHashCode10 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-565191499219822L));
        AbstractC0897.m2002(sb, this.f1390, -565290283467630L);
        AbstractC0897.m2002(sb, this.f1391, -565341823075182L);
        AbstractC0897.m2002(sb, this.f1395, -565376182813550L);
        AbstractC0897.m2002(sb, this.f1397, -565410542551918L);
        AbstractC0897.m2002(sb, this.f1389, -565457787192174L);
        AbstractC0897.m2002(sb, this.f1396, -565505031832430L);
        sb.append(this.f1392);
        sb.append(AbstractC2328.m4341(-565565161374574L));
        sb.append(this.f1387);
        sb.append(AbstractC2328.m4341(-565616700982126L));
        AbstractC0897.m2002(sb, this.f1388, -565676830524270L);
        AbstractC0897.m2002(sb, this.f1394, -565732665099118L);
        sb.append(this.f1393);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String m902() {
        return this.f1395;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String m903() {
        return this.f1396;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m904() {
        return this.f1397;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String m905() {
        return this.f1389;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String m906() {
        return this.f1390;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String m907() {
        return this.f1391;
    }
}
