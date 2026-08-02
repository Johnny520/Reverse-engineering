package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: nt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0512nt {
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
    private final k31 extra;
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

    public /* synthetic */ C0512nt(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, k31 k31Var, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & AIChatConfig.DefaultMaxTokens) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : bool, (i & AIChatConfig.MaxOutputTokens) != 0 ? null : bool2, (i & 65536) != 0 ? null : str14, (i & 131072) != 0 ? null : str15, (i & 262144) != 0 ? null : str16, (i & 524288) != 0 ? null : str17, (i & 1048576) != 0 ? null : k31Var);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C0512nt m3361w(C0512nt c0512nt, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, k31 k31Var, int i, Object obj) {
        k31 k31Var2;
        String str18;
        String str19 = (i & 1) != 0 ? c0512nt.androidVersion : str;
        Integer num2 = (i & 2) != 0 ? c0512nt.androidSdkInt : num;
        String str20 = (i & 4) != 0 ? c0512nt.deviceBrand : str2;
        String str21 = (i & 8) != 0 ? c0512nt.deviceManufacturer : str3;
        String str22 = (i & 16) != 0 ? c0512nt.deviceModel : str4;
        String str23 = (i & 32) != 0 ? c0512nt.deviceName : str5;
        String str24 = (i & 64) != 0 ? c0512nt.appVersion : str6;
        String str25 = (i & 128) != 0 ? c0512nt.appBuild : str7;
        String str26 = (i & 256) != 0 ? c0512nt.packageName : str8;
        String str27 = (i & AIChatConfig.DefaultMaxTokens) != 0 ? c0512nt.architecture : str9;
        String str28 = (i & 1024) != 0 ? c0512nt.abi : str10;
        String str29 = (i & 2048) != 0 ? c0512nt.xposedFramework : str11;
        String str30 = (i & 4096) != 0 ? c0512nt.xposedVersion : str12;
        String str31 = (i & 8192) != 0 ? c0512nt.xposedInjectionMode : str13;
        String str32 = str19;
        Boolean bool3 = (i & 16384) != 0 ? c0512nt.isRooted : bool;
        Boolean bool4 = (i & AIChatConfig.MaxOutputTokens) != 0 ? c0512nt.isEmulator : bool2;
        String str33 = (i & 65536) != 0 ? c0512nt.installerPackage : str14;
        String str34 = (i & 131072) != 0 ? c0512nt.locale : str15;
        String str35 = (i & 262144) != 0 ? c0512nt.timezone : str16;
        String str36 = (i & 524288) != 0 ? c0512nt.networkType : str17;
        if ((i & 1048576) != 0) {
            str18 = str36;
            k31Var2 = c0512nt.extra;
        } else {
            k31Var2 = k31Var;
            str18 = str36;
        }
        return c0512nt.m3401v(str32, num2, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, bool3, bool4, str33, str34, str35, str18, k31Var2);
    }

    /* JADX INFO: renamed from: A */
    public final String m3362A() {
        return this.appBuild;
    }

    /* JADX INFO: renamed from: B */
    public final String m3363B() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: C */
    public final String m3364C() {
        return this.architecture;
    }

    /* JADX INFO: renamed from: D */
    public final String m3365D() {
        return this.deviceBrand;
    }

    /* JADX INFO: renamed from: E */
    public final String m3366E() {
        return this.deviceManufacturer;
    }

    /* JADX INFO: renamed from: F */
    public final String m3367F() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: G */
    public final String m3368G() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: H */
    public final k31 m3369H() {
        return this.extra;
    }

    /* JADX INFO: renamed from: I */
    public final String m3370I() {
        return this.installerPackage;
    }

    /* JADX INFO: renamed from: J */
    public final String m3371J() {
        return this.locale;
    }

    /* JADX INFO: renamed from: K */
    public final String m3372K() {
        return this.networkType;
    }

    /* JADX INFO: renamed from: L */
    public final String m3373L() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: M */
    public final String m3374M() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: N */
    public final String m3375N() {
        return this.xposedFramework;
    }

    /* JADX INFO: renamed from: O */
    public final String m3376O() {
        return this.xposedInjectionMode;
    }

    /* JADX INFO: renamed from: P */
    public final String m3377P() {
        return this.xposedVersion;
    }

    /* JADX INFO: renamed from: Q */
    public final Boolean m3378Q() {
        return this.isEmulator;
    }

    /* JADX INFO: renamed from: R */
    public final Boolean m3379R() {
        return this.isRooted;
    }

    /* JADX INFO: renamed from: a */
    public final String m3380a() {
        return this.androidVersion;
    }

    /* JADX INFO: renamed from: b */
    public final String m3381b() {
        return this.architecture;
    }

    /* JADX INFO: renamed from: c */
    public final String m3382c() {
        return this.abi;
    }

    /* JADX INFO: renamed from: d */
    public final String m3383d() {
        return this.xposedFramework;
    }

    /* JADX INFO: renamed from: e */
    public final String m3384e() {
        return this.xposedVersion;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0512nt)) {
            return false;
        }
        C0512nt c0512nt = (C0512nt) obj;
        return t11.m5086l(this.androidVersion, c0512nt.androidVersion) && t11.m5086l(this.androidSdkInt, c0512nt.androidSdkInt) && t11.m5086l(this.deviceBrand, c0512nt.deviceBrand) && t11.m5086l(this.deviceManufacturer, c0512nt.deviceManufacturer) && t11.m5086l(this.deviceModel, c0512nt.deviceModel) && t11.m5086l(this.deviceName, c0512nt.deviceName) && t11.m5086l(this.appVersion, c0512nt.appVersion) && t11.m5086l(this.appBuild, c0512nt.appBuild) && t11.m5086l(this.packageName, c0512nt.packageName) && t11.m5086l(this.architecture, c0512nt.architecture) && t11.m5086l(this.abi, c0512nt.abi) && t11.m5086l(this.xposedFramework, c0512nt.xposedFramework) && t11.m5086l(this.xposedVersion, c0512nt.xposedVersion) && t11.m5086l(this.xposedInjectionMode, c0512nt.xposedInjectionMode) && t11.m5086l(this.isRooted, c0512nt.isRooted) && t11.m5086l(this.isEmulator, c0512nt.isEmulator) && t11.m5086l(this.installerPackage, c0512nt.installerPackage) && t11.m5086l(this.locale, c0512nt.locale) && t11.m5086l(this.timezone, c0512nt.timezone) && t11.m5086l(this.networkType, c0512nt.networkType) && t11.m5086l(this.extra, c0512nt.extra);
    }

    /* JADX INFO: renamed from: f */
    public final String m3385f() {
        return this.xposedInjectionMode;
    }

    /* JADX INFO: renamed from: g */
    public final Boolean m3386g() {
        return this.isRooted;
    }

    /* JADX INFO: renamed from: h */
    public final Boolean m3387h() {
        return this.isEmulator;
    }

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
        k31 k31Var = this.extra;
        return iHashCode20 + (k31Var != null ? k31Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m3388i() {
        return this.installerPackage;
    }

    /* JADX INFO: renamed from: j */
    public final String m3389j() {
        return this.locale;
    }

    /* JADX INFO: renamed from: k */
    public final String m3390k() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: l */
    public final Integer m3391l() {
        return this.androidSdkInt;
    }

    /* JADX INFO: renamed from: m */
    public final String m3392m() {
        return this.networkType;
    }

    /* JADX INFO: renamed from: n */
    public final k31 m3393n() {
        return this.extra;
    }

    /* JADX INFO: renamed from: o */
    public final String m3394o() {
        return this.deviceBrand;
    }

    /* JADX INFO: renamed from: p */
    public final String m3395p() {
        return this.deviceManufacturer;
    }

    /* JADX INFO: renamed from: q */
    public final String m3396q() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: r */
    public final String m3397r() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: s */
    public final String m3398s() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: t */
    public final String m3399t() {
        return this.appBuild;
    }

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
        k31 k31Var = this.extra;
        StringBuilder sb = new StringBuilder("ClientEnvironmentPayload(androidVersion=");
        sb.append(str);
        sb.append(", androidSdkInt=");
        sb.append(num);
        sb.append(", deviceBrand=");
        hk1.m2216o(sb, str2, ", deviceManufacturer=", str3, ", deviceModel=");
        hk1.m2216o(sb, str4, ", deviceName=", str5, ", appVersion=");
        hk1.m2216o(sb, str6, ", appBuild=", str7, ", packageName=");
        hk1.m2216o(sb, str8, ", architecture=", str9, ", abi=");
        hk1.m2216o(sb, str10, ", xposedFramework=", str11, ", xposedVersion=");
        hk1.m2216o(sb, str12, ", xposedInjectionMode=", str13, ", isRooted=");
        sb.append(bool);
        sb.append(", isEmulator=");
        sb.append(bool2);
        sb.append(", installerPackage=");
        hk1.m2216o(sb, str14, ", locale=", str15, ", timezone=");
        hk1.m2216o(sb, str16, ", networkType=", str17, ", extra=");
        sb.append(k31Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final String m3400u() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: v */
    public final C0512nt m3401v(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, k31 k31Var) {
        return new C0512nt(str, num, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, bool, bool2, str14, str15, str16, str17, k31Var);
    }

    /* JADX INFO: renamed from: x */
    public final String m3402x() {
        return this.abi;
    }

    /* JADX INFO: renamed from: y */
    public final Integer m3403y() {
        return this.androidSdkInt;
    }

    /* JADX INFO: renamed from: z */
    public final String m3404z() {
        return this.androidVersion;
    }

    public C0512nt(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, k31 k31Var) {
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
        this.extra = k31Var;
    }

    public C0512nt() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }
}
