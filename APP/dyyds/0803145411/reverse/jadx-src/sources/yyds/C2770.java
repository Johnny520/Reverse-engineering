package yyds;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᲈᲁᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2770 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final long f13507;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final String f13508;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f13509;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f13510;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f13511;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final long f13512;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final String f13513;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final String f13514;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final String f13515;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f13516;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String f13517;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f13518;

    public C2770(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, String str8, String str9, String str10) {
        AbstractC2328.m4341(-320532982170478L);
        AbstractC2328.m4341(-320545867072366L);
        AbstractC2328.m4341(-320584521778030L);
        AbstractC2328.m4341(-320614586549102L);
        AbstractC2328.m4341(-320648946287470L);
        AbstractC2328.m4341(-320666126156654L);
        this.f13510 = str;
        this.f13511 = str2;
        this.f13516 = str3;
        this.f13518 = str4;
        this.f13509 = str5;
        this.f13517 = str6;
        this.f13512 = j;
        this.f13507 = j2;
        this.f13508 = str7;
        this.f13515 = str8;
        this.f13513 = str9;
        this.f13514 = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2770)) {
            return false;
        }
        C2770 c2770 = (C2770) obj;
        return AbstractC1544.m3188(this.f13510, c2770.f13510) && AbstractC1544.m3188(this.f13511, c2770.f13511) && AbstractC1544.m3188(this.f13516, c2770.f13516) && AbstractC1544.m3188(this.f13518, c2770.f13518) && AbstractC1544.m3188(this.f13509, c2770.f13509) && AbstractC1544.m3188(this.f13517, c2770.f13517) && this.f13512 == c2770.f13512 && this.f13507 == c2770.f13507 && AbstractC1544.m3188(this.f13508, c2770.f13508) && AbstractC1544.m3188(this.f13515, c2770.f13515) && AbstractC1544.m3188(this.f13513, c2770.f13513) && AbstractC1544.m3188(this.f13514, c2770.f13514);
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.f13507) + ((Long.hashCode(this.f13512) + AbstractC0897.m1997(this.f13517, AbstractC0897.m1997(this.f13509, AbstractC0897.m1997(this.f13518, AbstractC0897.m1997(this.f13516, AbstractC0897.m1997(this.f13511, this.f13510.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31;
        String str = this.f13508;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13515;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13513;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13514;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-321250241708910L));
        AbstractC0897.m2002(sb, this.f13510, -321306076283758L);
        AbstractC0897.m2002(sb, this.f13511, -321357615891310L);
        AbstractC0897.m2002(sb, this.f13516, -321400565564270L);
        AbstractC0897.m2002(sb, this.f13518, -321447810204526L);
        AbstractC0897.m2002(sb, this.f13509, -321477874975598L);
        AbstractC0897.m2002(sb, this.f13517, -321512234713966L);
        AbstractC0897.m1994(sb, this.f13512, -321572364256110L);
        AbstractC0897.m1994(sb, this.f13507, -321623903863662L);
        AbstractC0897.m2002(sb, this.f13508, -321684033405806L);
        AbstractC0897.m2002(sb, this.f13515, -321752752882542L);
        AbstractC0897.m2002(sb, this.f13513, -321808587457390L);
        return AbstractC0897.m2000(sb, this.f13514, ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject m4888() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC2328.m4341(-320687600993134L), this.f13510);
        jSONObject.put(AbstractC2328.m4341(-320700485895022L), this.f13511);
        jSONObject.put(AbstractC2328.m4341(-320739140600686L), this.f13516);
        String strM4341 = AbstractC2328.m4341(-320769205371758L);
        String str = this.f13518;
        jSONObject.put(strM4341, str);
        String strM43412 = AbstractC2328.m4341(-320803565110126L);
        String str2 = this.f13509;
        jSONObject.put(strM43412, str2);
        jSONObject.put(AbstractC2328.m4341(-320820744979310L), this.f13517);
        jSONObject.put(AbstractC2328.m4341(-320842219815790L), this.f13512);
        jSONObject.put(AbstractC2328.m4341(-320889464456046L), this.f13507);
        String str3 = this.f13508;
        if (str3 != null) {
            jSONObject.put(AbstractC2328.m4341(-320928119161710L), str3);
        }
        String str4 = this.f13515;
        if (str4 != null) {
            jSONObject.put(AbstractC2328.m4341(-320975363801966L), str4);
        }
        String str5 = this.f13513;
        if (str5 != null) {
            jSONObject.put(AbstractC2328.m4341(-321031198376814L), str5);
        }
        String strM43413 = AbstractC2328.m4341(-321074148049774L);
        String strM43414 = this.f13514;
        if (strM43414 == null) {
            strM43414 = (AbstractC1544.m3188(str2, AbstractC2328.m4341(-1495704753832814L)) && AbstractC1544.m3188(str, AbstractC2328.m4341(-1495717638734702L))) ? AbstractC2328.m4341(-1495730523636590L) : AbstractC1544.m3188(str2, AbstractC2328.m4341(-1495751998473070L)) ? AbstractC2328.m4341(-1495764883374958L) : AbstractC2328.m4341(-1495790653178734L);
        } else {
            if (AbstractC0473.m1313(strM43414)) {
                strM43414 = null;
            }
            if (strM43414 == null) {
            }
        }
        jSONObject.put(strM43413, strM43414);
        return jSONObject;
    }
}
