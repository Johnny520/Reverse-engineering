package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p213o2.AbstractC2788q;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: J3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0846g {
    public static final int $stable = 8;
    private final String abi;
    private final int accessCount;
    private final Integer androidSdkInt;
    private final String androidVersion;
    private final String appBuild;
    private final String appVersion;
    private final String architecture;
    private final String clientUserId;
    private final String createdAt;
    private final String deviceBrand;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final AbstractC2788q extra;
    private final String firstSeenAt;

    /* JADX INFO: renamed from: id */
    private final String f2694id;
    private final String installerPackage;
    private final Boolean isEmulator;
    private final Boolean isRooted;
    private final String lastReportedAt;
    private final String locale;
    private final String networkType;
    private final String packageName;
    private final String timezone;
    private final String updatedAt;
    private final String xposedFramework;
    private final String xposedInjectionMode;
    private final String xposedVersion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0846g(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, Boolean bool2, String str16, String str17, String str18, String str19, int i5, String str20, String str21, AbstractC2788q abstractC2788q, String str22, String str23) {
        AbstractC1665j.m2985e(str, "id");
        AbstractC1665j.m2985e(str2, "clientUserId");
        AbstractC1665j.m2985e(str22, "createdAt");
        AbstractC1665j.m2985e(str23, "updatedAt");
        this.f2694id = str;
        this.clientUserId = str2;
        this.androidVersion = str3;
        this.androidSdkInt = num;
        this.deviceBrand = str4;
        this.deviceManufacturer = str5;
        this.deviceModel = str6;
        this.deviceName = str7;
        this.appVersion = str8;
        this.appBuild = str9;
        this.packageName = str10;
        this.architecture = str11;
        this.abi = str12;
        this.xposedFramework = str13;
        this.xposedVersion = str14;
        this.xposedInjectionMode = str15;
        this.isRooted = bool;
        this.isEmulator = bool2;
        this.installerPackage = str16;
        this.locale = str17;
        this.timezone = str18;
        this.networkType = str19;
        this.accessCount = i5;
        this.firstSeenAt = str20;
        this.lastReportedAt = str21;
        this.extra = abstractC2788q;
        this.createdAt = str22;
        this.updatedAt = str23;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static /* synthetic */ C0846g m1599D(C0846g c0846g, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, Boolean bool2, String str16, String str17, String str18, String str19, int i5, String str20, String str21, AbstractC2788q abstractC2788q, String str22, String str23, int i6, Object obj) {
        String str24;
        String str25;
        String str26 = (i6 & 1) != 0 ? c0846g.f2694id : str;
        String str27 = (i6 & 2) != 0 ? c0846g.clientUserId : str2;
        String str28 = (i6 & 4) != 0 ? c0846g.androidVersion : str3;
        Integer num2 = (i6 & 8) != 0 ? c0846g.androidSdkInt : num;
        String str29 = (i6 & 16) != 0 ? c0846g.deviceBrand : str4;
        String str30 = (i6 & 32) != 0 ? c0846g.deviceManufacturer : str5;
        String str31 = (i6 & 64) != 0 ? c0846g.deviceModel : str6;
        String str32 = (i6 & 128) != 0 ? c0846g.deviceName : str7;
        String str33 = (i6 & 256) != 0 ? c0846g.appVersion : str8;
        String str34 = (i6 & 512) != 0 ? c0846g.appBuild : str9;
        String str35 = (i6 & 1024) != 0 ? c0846g.packageName : str10;
        String str36 = (i6 & 2048) != 0 ? c0846g.architecture : str11;
        String str37 = (i6 & 4096) != 0 ? c0846g.abi : str12;
        String str38 = (i6 & 8192) != 0 ? c0846g.xposedFramework : str13;
        String str39 = str26;
        String str40 = (i6 & 16384) != 0 ? c0846g.xposedVersion : str14;
        String str41 = (i6 & 32768) != 0 ? c0846g.xposedInjectionMode : str15;
        Boolean bool3 = (i6 & 65536) != 0 ? c0846g.isRooted : bool;
        Boolean bool4 = (i6 & 131072) != 0 ? c0846g.isEmulator : bool2;
        String str42 = (i6 & 262144) != 0 ? c0846g.installerPackage : str16;
        String str43 = (i6 & 524288) != 0 ? c0846g.locale : str17;
        String str44 = (i6 & 1048576) != 0 ? c0846g.timezone : str18;
        String str45 = (i6 & 2097152) != 0 ? c0846g.networkType : str19;
        int i7 = (i6 & 4194304) != 0 ? c0846g.accessCount : i5;
        String str46 = (i6 & 8388608) != 0 ? c0846g.firstSeenAt : str20;
        String str47 = (i6 & 16777216) != 0 ? c0846g.lastReportedAt : str21;
        AbstractC2788q abstractC2788q2 = (i6 & 33554432) != 0 ? c0846g.extra : abstractC2788q;
        String str48 = (i6 & 67108864) != 0 ? c0846g.createdAt : str22;
        if ((i6 & 134217728) != 0) {
            str25 = str48;
            str24 = c0846g.updatedAt;
        } else {
            str24 = str23;
            str25 = str48;
        }
        return c0846g.m1602C(str39, str27, str28, num2, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str40, str41, bool3, bool4, str42, str43, str44, str45, i7, str46, str47, abstractC2788q2, str25, str24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final String m1600A() {
        return this.deviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final String m1601B() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final C0846g m1602C(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, Boolean bool2, String str16, String str17, String str18, String str19, int i5, String str20, String str21, AbstractC2788q abstractC2788q, String str22, String str23) {
        AbstractC1665j.m2985e(str, "id");
        AbstractC1665j.m2985e(str2, "clientUserId");
        AbstractC1665j.m2985e(str22, "createdAt");
        AbstractC1665j.m2985e(str23, "updatedAt");
        return new C0846g(str, str2, str3, num, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, bool, bool2, str16, str17, str18, str19, i5, str20, str21, abstractC2788q, str22, str23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final String m1603E() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final int m1604F() {
        return this.accessCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final Integer m1605G() {
        return this.androidSdkInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final String m1606H() {
        return this.androidVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final String m1607I() {
        return this.appBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final String m1608J() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final String m1609K() {
        return this.architecture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final String m1610L() {
        return this.clientUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final String m1611M() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final String m1612N() {
        return this.deviceBrand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final String m1613O() {
        return this.deviceManufacturer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final String m1614P() {
        return this.deviceModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final String m1615Q() {
        return this.deviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final AbstractC2788q m1616R() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final String m1617S() {
        return this.firstSeenAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final String m1618T() {
        return this.f2694id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final String m1619U() {
        return this.installerPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final String m1620V() {
        return this.lastReportedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final String m1621W() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final String m1622X() {
        return this.networkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final String m1623Y() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final String m1624Z() {
        return this.timezone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1625a() {
        return this.f2694id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final String m1626a0() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1627b() {
        return this.appBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final String m1628b0() {
        return this.xposedFramework;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m1629c() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final String m1630c0() {
        return this.xposedInjectionMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m1631d() {
        return this.architecture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final String m1632d0() {
        return this.xposedVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m1633e() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final Boolean m1634e0() {
        return this.isEmulator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0846g)) {
            return false;
        }
        C0846g c0846g = (C0846g) obj;
        return AbstractC1665j.m2981a(this.f2694id, c0846g.f2694id) && AbstractC1665j.m2981a(this.clientUserId, c0846g.clientUserId) && AbstractC1665j.m2981a(this.androidVersion, c0846g.androidVersion) && AbstractC1665j.m2981a(this.androidSdkInt, c0846g.androidSdkInt) && AbstractC1665j.m2981a(this.deviceBrand, c0846g.deviceBrand) && AbstractC1665j.m2981a(this.deviceManufacturer, c0846g.deviceManufacturer) && AbstractC1665j.m2981a(this.deviceModel, c0846g.deviceModel) && AbstractC1665j.m2981a(this.deviceName, c0846g.deviceName) && AbstractC1665j.m2981a(this.appVersion, c0846g.appVersion) && AbstractC1665j.m2981a(this.appBuild, c0846g.appBuild) && AbstractC1665j.m2981a(this.packageName, c0846g.packageName) && AbstractC1665j.m2981a(this.architecture, c0846g.architecture) && AbstractC1665j.m2981a(this.abi, c0846g.abi) && AbstractC1665j.m2981a(this.xposedFramework, c0846g.xposedFramework) && AbstractC1665j.m2981a(this.xposedVersion, c0846g.xposedVersion) && AbstractC1665j.m2981a(this.xposedInjectionMode, c0846g.xposedInjectionMode) && AbstractC1665j.m2981a(this.isRooted, c0846g.isRooted) && AbstractC1665j.m2981a(this.isEmulator, c0846g.isEmulator) && AbstractC1665j.m2981a(this.installerPackage, c0846g.installerPackage) && AbstractC1665j.m2981a(this.locale, c0846g.locale) && AbstractC1665j.m2981a(this.timezone, c0846g.timezone) && AbstractC1665j.m2981a(this.networkType, c0846g.networkType) && this.accessCount == c0846g.accessCount && AbstractC1665j.m2981a(this.firstSeenAt, c0846g.firstSeenAt) && AbstractC1665j.m2981a(this.lastReportedAt, c0846g.lastReportedAt) && AbstractC1665j.m2981a(this.extra, c0846g.extra) && AbstractC1665j.m2981a(this.createdAt, c0846g.createdAt) && AbstractC1665j.m2981a(this.updatedAt, c0846g.updatedAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m1635f() {
        return this.xposedFramework;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final Boolean m1636f0() {
        return this.isRooted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m1637g() {
        return this.xposedVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m1638h() {
        return this.xposedInjectionMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iM394e = AbstractC0231b.m394e(this.f2694id.hashCode() * 31, 31, this.clientUserId);
        String str = this.androidVersion;
        int iHashCode = (iM394e + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.androidSdkInt;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.deviceBrand;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceManufacturer;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceModel;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appVersion;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appBuild;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.packageName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.architecture;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.abi;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.xposedFramework;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.xposedVersion;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.xposedInjectionMode;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.isRooted;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEmulator;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str14 = this.installerPackage;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.locale;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.timezone;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.networkType;
        int iM391b = AbstractC0231b.m391b(this.accessCount, (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31, 31);
        String str18 = this.firstSeenAt;
        int iHashCode20 = (iM391b + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.lastReportedAt;
        int iHashCode21 = (iHashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        AbstractC2788q abstractC2788q = this.extra;
        return this.updatedAt.hashCode() + AbstractC0231b.m394e((iHashCode21 + (abstractC2788q != null ? abstractC2788q.hashCode() : 0)) * 31, 31, this.createdAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Boolean m1639i() {
        return this.isRooted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Boolean m1640j() {
        return this.isEmulator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m1641k() {
        return this.installerPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final String m1642l() {
        return this.clientUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m1643m() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final String m1644n() {
        return this.timezone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final String m1645o() {
        return this.networkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m1646p() {
        return this.accessCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final String m1647q() {
        return this.firstSeenAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final String m1648r() {
        return this.lastReportedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final AbstractC2788q m1649s() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final String m1650t() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.f2694id;
        String str2 = this.clientUserId;
        String str3 = this.androidVersion;
        Integer num = this.androidSdkInt;
        String str4 = this.deviceBrand;
        String str5 = this.deviceManufacturer;
        String str6 = this.deviceModel;
        String str7 = this.deviceName;
        String str8 = this.appVersion;
        String str9 = this.appBuild;
        String str10 = this.packageName;
        String str11 = this.architecture;
        String str12 = this.abi;
        String str13 = this.xposedFramework;
        String str14 = this.xposedVersion;
        String str15 = this.xposedInjectionMode;
        Boolean bool = this.isRooted;
        Boolean bool2 = this.isEmulator;
        String str16 = this.installerPackage;
        String str17 = this.locale;
        String str18 = this.timezone;
        String str19 = this.networkType;
        int i5 = this.accessCount;
        String str20 = this.firstSeenAt;
        String str21 = this.lastReportedAt;
        AbstractC2788q abstractC2788q = this.extra;
        String str22 = this.createdAt;
        String str23 = this.updatedAt;
        StringBuilder sbM405p = AbstractC0231b.m405p("ClientEnvironment(id=", str, ", clientUserId=", str2, ", androidVersion=");
        sbM405p.append(str3);
        sbM405p.append(", androidSdkInt=");
        sbM405p.append(num);
        sbM405p.append(", deviceBrand=");
        AbstractC3202a.m5468c(sbM405p, str4, ", deviceManufacturer=", str5, ", deviceModel=");
        AbstractC3202a.m5468c(sbM405p, str6, ", deviceName=", str7, ", appVersion=");
        AbstractC3202a.m5468c(sbM405p, str8, ", appBuild=", str9, ", packageName=");
        AbstractC3202a.m5468c(sbM405p, str10, ", architecture=", str11, ", abi=");
        AbstractC3202a.m5468c(sbM405p, str12, ", xposedFramework=", str13, ", xposedVersion=");
        AbstractC3202a.m5468c(sbM405p, str14, ", xposedInjectionMode=", str15, ", isRooted=");
        sbM405p.append(bool);
        sbM405p.append(", isEmulator=");
        sbM405p.append(bool2);
        sbM405p.append(", installerPackage=");
        AbstractC3202a.m5468c(sbM405p, str16, ", locale=", str17, ", timezone=");
        AbstractC3202a.m5468c(sbM405p, str18, ", networkType=", str19, ", accessCount=");
        sbM405p.append(i5);
        sbM405p.append(", firstSeenAt=");
        sbM405p.append(str20);
        sbM405p.append(", lastReportedAt=");
        sbM405p.append(str21);
        sbM405p.append(", extra=");
        sbM405p.append(abstractC2788q);
        sbM405p.append(", createdAt=");
        sbM405p.append(str22);
        sbM405p.append(", updatedAt=");
        sbM405p.append(str23);
        sbM405p.append(")");
        return sbM405p.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final String m1651u() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final String m1652v() {
        return this.androidVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final Integer m1653w() {
        return this.androidSdkInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final String m1654x() {
        return this.deviceBrand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final String m1655y() {
        return this.deviceManufacturer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final String m1656z() {
        return this.deviceModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e0: CONSTRUCTOR 
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r61v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r61v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r36v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r61v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r61v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r61v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r61v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r61v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r61v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r61v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r61v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r61v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r61v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r61v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (32768 int) & (r61v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007b: ARITH (65536 int) & (r61v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r49v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0085: ARITH (131072 int) & (r61v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r50v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (262144 int) & (r61v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (524288 int) & (r61v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (1048576 int) & (r61v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ad: ARITH (2097152 int) & (r61v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (r55v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b7: ARITH (8388608 int) & (r61v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c1: ARITH (16777216 int) & (r61v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:o2.q:?: TERNARY null = ((wrap:int:0x00cb: ARITH (r61v0 int) & (33554432 int) A[WRAPPED]) != (0 int)) ? (null o2.q) : (r58v0 o2.q))
  (r59v0 java.lang.String)
  (r60v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, o2.q, java.lang.String, java.lang.String):void (m)] (LINE:30) call: J3.g.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, o2.q, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C0846g(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, Boolean bool2, String str16, String str17, String str18, String str19, int i5, String str20, String str21, AbstractC2788q abstractC2788q, String str22, String str23, int i6, AbstractC1661f abstractC1661f) {
        this(str, str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : num, (i6 & 16) != 0 ? null : str4, (i6 & 32) != 0 ? null : str5, (i6 & 64) != 0 ? null : str6, (i6 & 128) != 0 ? null : str7, (i6 & 256) != 0 ? null : str8, (i6 & 512) != 0 ? null : str9, (i6 & 1024) != 0 ? null : str10, (i6 & 2048) != 0 ? null : str11, (i6 & 4096) != 0 ? null : str12, (i6 & 8192) != 0 ? null : str13, (i6 & 16384) != 0 ? null : str14, (32768 & i6) != 0 ? null : str15, (65536 & i6) != 0 ? null : bool, (131072 & i6) != 0 ? null : bool2, (262144 & i6) != 0 ? null : str16, (524288 & i6) != 0 ? null : str17, (1048576 & i6) != 0 ? null : str18, (2097152 & i6) != 0 ? null : str19, i5, (8388608 & i6) != 0 ? null : str20, (16777216 & i6) != 0 ? null : str21, (i6 & 33554432) != 0 ? null : abstractC2788q, str22, str23);
    }
}
