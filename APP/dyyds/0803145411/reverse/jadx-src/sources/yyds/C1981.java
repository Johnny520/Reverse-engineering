package yyds;

import java.io.Serializable;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: yyds.ᲀᛳᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1981 implements Serializable {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("continuousDays")
    private final int f9919;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    @InterfaceC0770("lastFireTime")
    private final long f9920;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    @InterfaceC0770("nickname")
    private final String f9921;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    @InterfaceC0770("addTime")
    private final long f9922;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    @InterfaceC0770("groupId")
    private final String f9923;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    @InterfaceC0770("loginUserId")
    private String f9924;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    @InterfaceC0770("type")
    private final EnumC0521 f9925;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    @InterfaceC0770(Name.MARK)
    private final String f9926;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    @InterfaceC0770("uid")
    private final String f9927;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    @InterfaceC0770("avatar")
    private final String f9928;

    public /* synthetic */ C1981(String str, String str2, String str3, String str4, long j, EnumC0521 enumC0521, String str5, int i) {
        this((i & 1) != 0 ? AbstractC2328.m4341(-1476252846949230L) : str, (i & 2) != 0 ? AbstractC2328.m4341(-1476257141916526L) : str2, (i & 4) != 0 ? AbstractC2328.m4341(-1476261436883822L) : str3, (i & 8) != 0 ? AbstractC2328.m4341(-1476265731851118L) : str4, (i & 16) != 0 ? 0L : j, 0, 0L, (i & 128) != 0 ? EnumC0521.f2504 : enumC0521, (i & 256) != 0 ? AbstractC2328.m4341(-1476270026818414L) : str5, AbstractC2328.m4341(-1476304386556782L));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C1981 m3809(C1981 c1981, int i, long j, String str, int i2) {
        String str2 = c1981.f9926;
        String str3 = c1981.f9928;
        String str4 = c1981.f9921;
        String str5 = c1981.f9927;
        long j2 = c1981.f9922;
        int i3 = (i2 & 32) != 0 ? c1981.f9919 : i;
        long j3 = (i2 & 64) != 0 ? c1981.f9920 : j;
        EnumC0521 enumC0521 = c1981.f9925;
        String str6 = (i2 & 256) != 0 ? c1981.f9923 : str;
        String str7 = c1981.f9924;
        AbstractC2328.m4341(-1476308681524078L);
        AbstractC2328.m4341(-1476321566425966L);
        AbstractC2328.m4341(-1476351631197038L);
        AbstractC2328.m4341(-1476390285902702L);
        AbstractC2328.m4341(-1476407465771886L);
        AbstractC2328.m4341(-1476428940608366L);
        return new C1981(str2, str3, str4, str5, j2, i3, j3, enumC0521, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1981)) {
            return false;
        }
        C1981 c1981 = (C1981) obj;
        return AbstractC1544.m3188(this.f9926, c1981.f9926) && AbstractC1544.m3188(this.f9928, c1981.f9928) && AbstractC1544.m3188(this.f9921, c1981.f9921) && AbstractC1544.m3188(this.f9927, c1981.f9927) && this.f9922 == c1981.f9922 && this.f9919 == c1981.f9919 && this.f9920 == c1981.f9920 && this.f9925 == c1981.f9925 && AbstractC1544.m3188(this.f9923, c1981.f9923) && AbstractC1544.m3188(this.f9924, c1981.f9924);
    }

    public final int hashCode() {
        int iM1997 = AbstractC0897.m1997(this.f9923, (this.f9925.hashCode() + ((Long.hashCode(this.f9920) + AbstractC2104.m4018(this.f9919, (Long.hashCode(this.f9922) + AbstractC0897.m1997(this.f9927, AbstractC0897.m1997(this.f9921, AbstractC0897.m1997(this.f9928, this.f9926.hashCode() * 31, 31), 31), 31)) * 31, 31)) * 31)) * 31, 31);
        String str = this.f9924;
        return iM1997 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1476463300346734L));
        AbstractC0897.m2002(sb, this.f9926, -1476519134921582L);
        AbstractC0897.m2002(sb, this.f9928, -1476562084594542L);
        AbstractC0897.m2002(sb, this.f9921, -1476613624202094L);
        AbstractC0897.m2002(sb, this.f9927, -1476643688973166L);
        AbstractC0897.m1994(sb, this.f9922, -1476690933613422L);
        AbstractC2104.m4007(sb, this.f9919, -1476768243024750L);
        AbstractC0897.m1994(sb, this.f9920, -1476836962501486L);
        sb.append(this.f9925);
        sb.append(AbstractC2328.m4341(-1476871322239854L));
        AbstractC0897.m2002(sb, this.f9923, -1476918566880110L);
        return AbstractC0897.m2000(sb, this.f9924, ')');
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final String m3810() {
        return this.f9924;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final String m3811() {
        return this.f9921;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String m3812() {
        return this.f9923;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long m3813() {
        return this.f9922;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final long m3814() {
        return this.f9920;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final String m3815() {
        return this.f9927;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m3816(String str) {
        this.f9924 = str;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final EnumC0521 m3817() {
        return this.f9925;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String m3818() {
        return this.f9928;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String m3819() {
        return this.f9926;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m3820() {
        return this.f9919;
    }

    public C1981(String str, String str2, String str3, String str4, long j, int i, long j2, EnumC0521 enumC0521, String str5, String str6) {
        AbstractC2328.m4341(-1476098228126574L);
        AbstractC2328.m4341(-1476111113028462L);
        AbstractC2328.m4341(-1476141177799534L);
        AbstractC2328.m4341(-1476179832505198L);
        AbstractC2328.m4341(-1476197012374382L);
        AbstractC2328.m4341(-1476218487210862L);
        this.f9926 = str;
        this.f9928 = str2;
        this.f9921 = str3;
        this.f9927 = str4;
        this.f9922 = j;
        this.f9919 = i;
        this.f9920 = j2;
        this.f9925 = enumC0521;
        this.f9923 = str5;
        this.f9924 = str6;
    }

    public C1981() {
        this(null, null, null, null, 0L, null, null, 1023);
    }
}
