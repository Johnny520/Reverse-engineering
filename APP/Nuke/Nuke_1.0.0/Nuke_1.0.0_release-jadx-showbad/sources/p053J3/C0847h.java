package p053J3;

import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p213o2.AbstractC2788q;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: J3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0847h {
    public static final int $stable = 8;
    private final String abi;
    private final Integer androidSdkInt;
    private final String androidVersion;
    private final String appBuild;
    private final String appVersion;
    private final String architecture;
    private final String deviceBrand;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceName;
    private final AbstractC2788q extra;
    private final String installerPackage;
    private final Boolean isEmulator;
    private final Boolean isRooted;
    private final String locale;
    private final String networkType;
    private final String packageName;
    private final String timezone;
    private final String xposedFramework;
    private final String xposedInjectionMode;
    private final String xposedVersion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0847h() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C0847h m1657w(C0847h c0847h, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, AbstractC2788q abstractC2788q, int i5, Object obj) {
        AbstractC2788q abstractC2788q2;
        String str18;
        String str19 = (i5 & 1) != 0 ? c0847h.androidVersion : str;
        Integer num2 = (i5 & 2) != 0 ? c0847h.androidSdkInt : num;
        String str20 = (i5 & 4) != 0 ? c0847h.deviceBrand : str2;
        String str21 = (i5 & 8) != 0 ? c0847h.deviceManufacturer : str3;
        String str22 = (i5 & 16) != 0 ? c0847h.deviceModel : str4;
        String str23 = (i5 & 32) != 0 ? c0847h.deviceName : str5;
        String str24 = (i5 & 64) != 0 ? c0847h.appVersion : str6;
        String str25 = (i5 & 128) != 0 ? c0847h.appBuild : str7;
        String str26 = (i5 & 256) != 0 ? c0847h.packageName : str8;
        String str27 = (i5 & 512) != 0 ? c0847h.architecture : str9;
        String str28 = (i5 & 1024) != 0 ? c0847h.abi : str10;
        String str29 = (i5 & 2048) != 0 ? c0847h.xposedFramework : str11;
        String str30 = (i5 & 4096) != 0 ? c0847h.xposedVersion : str12;
        String str31 = (i5 & 8192) != 0 ? c0847h.xposedInjectionMode : str13;
        String str32 = str19;
        Boolean bool3 = (i5 & 16384) != 0 ? c0847h.isRooted : bool;
        Boolean bool4 = (i5 & 32768) != 0 ? c0847h.isEmulator : bool2;
        String str33 = (i5 & 65536) != 0 ? c0847h.installerPackage : str14;
        String str34 = (i5 & 131072) != 0 ? c0847h.locale : str15;
        String str35 = (i5 & 262144) != 0 ? c0847h.timezone : str16;
        String str36 = (i5 & 524288) != 0 ? c0847h.networkType : str17;
        if ((i5 & 1048576) != 0) {
            str18 = str36;
            abstractC2788q2 = c0847h.extra;
        } else {
            abstractC2788q2 = abstractC2788q;
            str18 = str36;
        }
        return c0847h.m1697v(str32, num2, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, bool3, bool4, str33, str34, str35, str18, abstractC2788q2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final String m1658A() {
        return this.appBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final String m1659B() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final String m1660C() {
        return this.architecture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final String m1661D() {
        return this.deviceBrand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final String m1662E() {
        return this.deviceManufacturer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final String m1663F() {
        return this.deviceModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final String m1664G() {
        return this.deviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final AbstractC2788q m1665H() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final String m1666I() {
        return this.installerPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final String m1667J() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final String m1668K() {
        return this.networkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final String m1669L() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final String m1670M() {
        return this.timezone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final String m1671N() {
        return this.xposedFramework;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final String m1672O() {
        return this.xposedInjectionMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final String m1673P() {
        return this.xposedVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final Boolean m1674Q() {
        return this.isEmulator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final Boolean m1675R() {
        return this.isRooted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1676a() {
        return this.androidVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1677b() {
        return this.architecture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m1678c() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m1679d() {
        return this.xposedFramework;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m1680e() {
        return this.xposedVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0847h)) {
            return false;
        }
        C0847h c0847h = (C0847h) obj;
        return AbstractC1665j.m2981a(this.androidVersion, c0847h.androidVersion) && AbstractC1665j.m2981a(this.androidSdkInt, c0847h.androidSdkInt) && AbstractC1665j.m2981a(this.deviceBrand, c0847h.deviceBrand) && AbstractC1665j.m2981a(this.deviceManufacturer, c0847h.deviceManufacturer) && AbstractC1665j.m2981a(this.deviceModel, c0847h.deviceModel) && AbstractC1665j.m2981a(this.deviceName, c0847h.deviceName) && AbstractC1665j.m2981a(this.appVersion, c0847h.appVersion) && AbstractC1665j.m2981a(this.appBuild, c0847h.appBuild) && AbstractC1665j.m2981a(this.packageName, c0847h.packageName) && AbstractC1665j.m2981a(this.architecture, c0847h.architecture) && AbstractC1665j.m2981a(this.abi, c0847h.abi) && AbstractC1665j.m2981a(this.xposedFramework, c0847h.xposedFramework) && AbstractC1665j.m2981a(this.xposedVersion, c0847h.xposedVersion) && AbstractC1665j.m2981a(this.xposedInjectionMode, c0847h.xposedInjectionMode) && AbstractC1665j.m2981a(this.isRooted, c0847h.isRooted) && AbstractC1665j.m2981a(this.isEmulator, c0847h.isEmulator) && AbstractC1665j.m2981a(this.installerPackage, c0847h.installerPackage) && AbstractC1665j.m2981a(this.locale, c0847h.locale) && AbstractC1665j.m2981a(this.timezone, c0847h.timezone) && AbstractC1665j.m2981a(this.networkType, c0847h.networkType) && AbstractC1665j.m2981a(this.extra, c0847h.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m1681f() {
        return this.xposedInjectionMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Boolean m1682g() {
        return this.isRooted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Boolean m1683h() {
        return this.isEmulator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        String str = this.androidVersion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
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
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        AbstractC2788q abstractC2788q = this.extra;
        return iHashCode20 + (abstractC2788q != null ? abstractC2788q.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m1684i() {
        return this.installerPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m1685j() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m1686k() {
        return this.timezone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Integer m1687l() {
        return this.androidSdkInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m1688m() {
        return this.networkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final AbstractC2788q m1689n() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final String m1690o() {
        return this.deviceBrand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final String m1691p() {
        return this.deviceManufacturer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final String m1692q() {
        return this.deviceModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final String m1693r() {
        return this.deviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final String m1694s() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final String m1695t() {
        return this.appBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.androidVersion;
        Integer num = this.androidSdkInt;
        String str2 = this.deviceBrand;
        String str3 = this.deviceManufacturer;
        String str4 = this.deviceModel;
        String str5 = this.deviceName;
        String str6 = this.appVersion;
        String str7 = this.appBuild;
        String str8 = this.packageName;
        String str9 = this.architecture;
        String str10 = this.abi;
        String str11 = this.xposedFramework;
        String str12 = this.xposedVersion;
        String str13 = this.xposedInjectionMode;
        Boolean bool = this.isRooted;
        Boolean bool2 = this.isEmulator;
        String str14 = this.installerPackage;
        String str15 = this.locale;
        String str16 = this.timezone;
        String str17 = this.networkType;
        AbstractC2788q abstractC2788q = this.extra;
        StringBuilder sb = new StringBuilder("ClientEnvironmentPayload(androidVersion=");
        sb.append(str);
        sb.append(", androidSdkInt=");
        sb.append(num);
        sb.append(", deviceBrand=");
        AbstractC3202a.m5468c(sb, str2, ", deviceManufacturer=", str3, ", deviceModel=");
        AbstractC3202a.m5468c(sb, str4, ", deviceName=", str5, ", appVersion=");
        AbstractC3202a.m5468c(sb, str6, ", appBuild=", str7, ", packageName=");
        AbstractC3202a.m5468c(sb, str8, ", architecture=", str9, ", abi=");
        AbstractC3202a.m5468c(sb, str10, ", xposedFramework=", str11, ", xposedVersion=");
        AbstractC3202a.m5468c(sb, str12, ", xposedInjectionMode=", str13, ", isRooted=");
        sb.append(bool);
        sb.append(", isEmulator=");
        sb.append(bool2);
        sb.append(", installerPackage=");
        AbstractC3202a.m5468c(sb, str14, ", locale=", str15, ", timezone=");
        AbstractC3202a.m5468c(sb, str16, ", networkType=", str17, ", extra=");
        sb.append(abstractC2788q);
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final String m1696u() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final C0847h m1697v(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, AbstractC2788q abstractC2788q) {
        return new C0847h(str, num, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, bool, bool2, str14, str15, str16, str17, abstractC2788q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final String m1698x() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final Integer m1699y() {
        return this.androidSdkInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final String m1700z() {
        return this.androidVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0847h(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, AbstractC2788q abstractC2788q) {
        this.androidVersion = str;
        this.androidSdkInt = num;
        this.deviceBrand = str2;
        this.deviceManufacturer = str3;
        this.deviceModel = str4;
        this.deviceName = str5;
        this.appVersion = str6;
        this.appBuild = str7;
        this.packageName = str8;
        this.architecture = str9;
        this.abi = str10;
        this.xposedFramework = str11;
        this.xposedVersion = str12;
        this.xposedInjectionMode = str13;
        this.isRooted = bool;
        this.isEmulator = bool2;
        this.installerPackage = str14;
        this.locale = str15;
        this.timezone = str16;
        this.networkType = str17;
        this.extra = abstractC2788q;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:o2.q:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null o2.q) : (r43v0 o2.q))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o2.q):void (m)] (LINE:24) call: J3.h.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o2.q):void type: THIS */
    public /* synthetic */ C0847h(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, AbstractC2788q abstractC2788q, int i5, AbstractC1661f abstractC1661f) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? null : str2, (i5 & 8) != 0 ? null : str3, (i5 & 16) != 0 ? null : str4, (i5 & 32) != 0 ? null : str5, (i5 & 64) != 0 ? null : str6, (i5 & 128) != 0 ? null : str7, (i5 & 256) != 0 ? null : str8, (i5 & 512) != 0 ? null : str9, (i5 & 1024) != 0 ? null : str10, (i5 & 2048) != 0 ? null : str11, (i5 & 4096) != 0 ? null : str12, (i5 & 8192) != 0 ? null : str13, (i5 & 16384) != 0 ? null : bool, (i5 & 32768) != 0 ? null : bool2, (i5 & 65536) != 0 ? null : str14, (i5 & 131072) != 0 ? null : str15, (i5 & 262144) != 0 ? null : str16, (i5 & 524288) != 0 ? null : str17, (i5 & 1048576) != 0 ? null : abstractC2788q);
    }
}
