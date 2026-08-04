package yyds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: yyds.ᲈᛸᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2721 implements Serializable {

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static final C2721 f13356 = new C2721(AbstractC2328.m4341(-1475372378653550L), AbstractC2328.m4341(-1475406738391918L), Collections.singletonList(AbstractC2328.m4341(-1475428213228398L)), AbstractC2328.m4341(-1475458277999470L), EnumC2472.f12214, 32256);

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    @InterfaceC0770("startTime")
    private final String f13357;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("useHitokoto")
    private final Boolean f13358;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    @InterfaceC0770("scheduledSendTime")
    private final String f13359;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    @InterfaceC0770("hitokotoCategories")
    private final List<String> f13360;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    @InterfaceC0770("delayStart")
    private final long f13361;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    @InterfaceC0770("endTime")
    private final String f13362;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    @InterfaceC0770("emojiMessages")
    private final List<C1132> f13363;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    @InterfaceC0770("randomMessages")
    private final List<String> f13364;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    @InterfaceC0770("hitokotoFailStrategy")
    private final EnumC2472 f13365;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    @InterfaceC0770("scheduledSendEnabled")
    private final Boolean f13366;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("hitokotoTemplate")
    private final String f13367;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    @InterfaceC0770(Name.MARK)
    private final String f13368;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    @InterfaceC0770("contentMode")
    private final String f13369;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    @InterfaceC0770("delayEnd")
    private final long f13370;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    @InterfaceC0770("name")
    private final String f13371;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2721(String str, String str2, List list, String str3, EnumC2472 enumC2472, int i) {
        Boolean bool = Boolean.FALSE;
        String strM4341 = (i & 1) != 0 ? AbstractC2328.m4341(-1474217032450926L) : str;
        String strM43412 = (i & 2) != 0 ? AbstractC2328.m4341(-1474221327418222L) : str2;
        int i2 = i & 16;
        C1860 c1860 = C1860.f9345;
        this(strM4341, strM43412, 2000L, 4000L, i2 != 0 ? c1860 : list, bool, c1860, (i & 128) != 0 ? AbstractC2328.m4341(-1474225622385518L) : str3, (i & 256) != 0 ? EnumC2472.f12214 : enumC2472, bool, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2721 m4829(C2721 c2721, String str, long j, long j2, ArrayList arrayList, Boolean bool, List list, String str2, EnumC2472 enumC2472, Boolean bool2, String str3, String str4, String str5, String str6, List list2) {
        String str7 = c2721.f13368;
        c2721.getClass();
        AbstractC2328.m4341(-1474272867025774L);
        AbstractC2328.m4341(-1474285751927662L);
        return new C2721(str7, str, j, j2, arrayList, bool, list, str2, enumC2472, bool2, str3, str4, str5, str6, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2721)) {
            return false;
        }
        C2721 c2721 = (C2721) obj;
        return AbstractC1544.m3188(this.f13368, c2721.f13368) && AbstractC1544.m3188(this.f13371, c2721.f13371) && this.f13361 == c2721.f13361 && this.f13370 == c2721.f13370 && AbstractC1544.m3188(this.f13364, c2721.f13364) && AbstractC1544.m3188(this.f13358, c2721.f13358) && AbstractC1544.m3188(this.f13360, c2721.f13360) && AbstractC1544.m3188(this.f13367, c2721.f13367) && this.f13365 == c2721.f13365 && AbstractC1544.m3188(this.f13366, c2721.f13366) && AbstractC1544.m3188(this.f13359, c2721.f13359) && AbstractC1544.m3188(this.f13357, c2721.f13357) && AbstractC1544.m3188(this.f13362, c2721.f13362) && AbstractC1544.m3188(this.f13369, c2721.f13369) && AbstractC1544.m3188(this.f13363, c2721.f13363);
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.f13370) + ((Long.hashCode(this.f13361) + AbstractC0897.m1997(this.f13371, this.f13368.hashCode() * 31, 31)) * 31)) * 31;
        List<String> list = this.f13364;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f13358;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list2 = this.f13360;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f13367;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC2472 enumC2472 = this.f13365;
        int iHashCode6 = (iHashCode5 + (enumC2472 == null ? 0 : enumC2472.hashCode())) * 31;
        Boolean bool2 = this.f13366;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f13359;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13357;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13362;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f13369;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<C1132> list3 = this.f13363;
        return iHashCode11 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1474307226764142L));
        AbstractC0897.m2002(sb, this.f13368, -1474367356306286L);
        AbstractC0897.m2002(sb, this.f13371, -1474401716044654L);
        AbstractC0897.m1994(sb, this.f13361, -1474461845586798L);
        AbstractC0897.m1994(sb, this.f13370, -1474513385194350L);
        sb.append(this.f13364);
        sb.append(AbstractC2328.m4341(-1474590694605678L));
        sb.append(this.f13358);
        sb.append(AbstractC2328.m4341(-1474655119115118L));
        sb.append(this.f13360);
        sb.append(AbstractC2328.m4341(-1474749608395630L));
        AbstractC0897.m2002(sb, this.f13367, -1474835507741550L);
        sb.append(this.f13365);
        sb.append(AbstractC2328.m4341(-1474938586956654L));
        sb.append(this.f13366);
        sb.append(AbstractC2328.m4341(-1475041666171758L));
        AbstractC0897.m2002(sb, this.f13359, -1475131860484974L);
        AbstractC0897.m2002(sb, this.f13357, -1475187695059822L);
        AbstractC0897.m2002(sb, this.f13362, -1475234939700078L);
        AbstractC0897.m2002(sb, this.f13369, -1475299364209518L);
        sb.append(this.f13363);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final String m4830() {
        return this.f13359;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final EnumC2472 m4831() {
        return this.f13365;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final Boolean m4832() {
        return this.f13366;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final String m4833() {
        return this.f13367;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final List m4834() {
        return this.f13363;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final String m4835() {
        return this.f13357;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m4836() {
        return this.f13369;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final List m4837() {
        return this.f13360;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final String m4838() {
        return this.f13371;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final List m4839() {
        return this.f13364;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final String m4840() {
        return this.f13368;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long m4841() {
        return this.f13370;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final Boolean m4842() {
        return this.f13358;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String m4843() {
        return this.f13362;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final long m4844() {
        return this.f13361;
    }

    public C2721(String str, String str2, long j, long j2, List list, Boolean bool, List list2, String str3, EnumC2472 enumC2472, Boolean bool2, String str4, String str5, String str6, String str7, List list3) {
        AbstractC2328.m4341(-1474182672712558L);
        AbstractC2328.m4341(-1474195557614446L);
        this.f13368 = str;
        this.f13371 = str2;
        this.f13361 = j;
        this.f13370 = j2;
        this.f13364 = list;
        this.f13358 = bool;
        this.f13360 = list2;
        this.f13367 = str3;
        this.f13365 = enumC2472;
        this.f13366 = bool2;
        this.f13359 = str4;
        this.f13357 = str5;
        this.f13362 = str6;
        this.f13369 = str7;
        this.f13363 = list3;
    }

    public C2721() {
        this(null, null, null, null, null, 32767);
    }
}
