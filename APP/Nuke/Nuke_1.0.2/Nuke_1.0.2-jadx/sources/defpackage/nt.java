package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nt {
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
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r44v0 int) & (wrap:??:SGET  A[WRAPPED] nuke.module.wechat.ai.AIChatConfig.DefaultMaxTokens int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r44v0 int) & (wrap:??:SGET  A[WRAPPED] nuke.module.wechat.ai.AIChatConfig.MaxOutputTokens int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:k31:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null k31) : (r43v0 k31))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, k31):void (m)] (LINE:1) call: nt.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, k31):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ nt(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, k31 k31Var, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & AIChatConfig.DefaultMaxTokens) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : bool, (i & AIChatConfig.MaxOutputTokens) != 0 ? null : bool2, (i & 65536) != 0 ? null : str14, (i & 131072) != 0 ? null : str15, (i & 262144) != 0 ? null : str16, (i & 524288) != 0 ? null : str17, (i & 1048576) != 0 ? null : k31Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ nt w(nt ntVar, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, k31 k31Var, int i, Object obj) {
        k31 k31Var2;
        String str18;
        String str19 = (i & 1) != 0 ? ntVar.androidVersion : str;
        Integer num2 = (i & 2) != 0 ? ntVar.androidSdkInt : num;
        String str20 = (i & 4) != 0 ? ntVar.deviceBrand : str2;
        String str21 = (i & 8) != 0 ? ntVar.deviceManufacturer : str3;
        String str22 = (i & 16) != 0 ? ntVar.deviceModel : str4;
        String str23 = (i & 32) != 0 ? ntVar.deviceName : str5;
        String str24 = (i & 64) != 0 ? ntVar.appVersion : str6;
        String str25 = (i & 128) != 0 ? ntVar.appBuild : str7;
        String str26 = (i & 256) != 0 ? ntVar.packageName : str8;
        String str27 = (i & AIChatConfig.DefaultMaxTokens) != 0 ? ntVar.architecture : str9;
        String str28 = (i & 1024) != 0 ? ntVar.abi : str10;
        String str29 = (i & 2048) != 0 ? ntVar.xposedFramework : str11;
        String str30 = (i & 4096) != 0 ? ntVar.xposedVersion : str12;
        String str31 = (i & 8192) != 0 ? ntVar.xposedInjectionMode : str13;
        String str32 = str19;
        Boolean bool3 = (i & 16384) != 0 ? ntVar.isRooted : bool;
        Boolean bool4 = (i & AIChatConfig.MaxOutputTokens) != 0 ? ntVar.isEmulator : bool2;
        String str33 = (i & 65536) != 0 ? ntVar.installerPackage : str14;
        String str34 = (i & 131072) != 0 ? ntVar.locale : str15;
        String str35 = (i & 262144) != 0 ? ntVar.timezone : str16;
        String str36 = (i & 524288) != 0 ? ntVar.networkType : str17;
        if ((i & 1048576) != 0) {
            str18 = str36;
            k31Var2 = ntVar.extra;
        } else {
            k31Var2 = k31Var;
            str18 = str36;
        }
        return ntVar.v(str32, num2, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, bool3, bool4, str33, str34, str35, str18, k31Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String A() {
        return this.appBuild;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String B() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String C() {
        return this.architecture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String D() {
        return this.deviceBrand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String E() {
        return this.deviceManufacturer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String F() {
        return this.deviceModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String G() {
        return this.deviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k31 H() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String I() {
        return this.installerPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String J() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String K() {
        return this.networkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String L() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String M() {
        return this.timezone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String N() {
        return this.xposedFramework;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String O() {
        return this.xposedInjectionMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String P() {
        return this.xposedVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Boolean Q() {
        return this.isEmulator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Boolean R() {
        return this.isRooted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.androidVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        return this.architecture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        return this.xposedFramework;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e() {
        return this.xposedVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt)) {
            return false;
        }
        nt ntVar = (nt) obj;
        return t11.l(this.androidVersion, ntVar.androidVersion) && t11.l(this.androidSdkInt, ntVar.androidSdkInt) && t11.l(this.deviceBrand, ntVar.deviceBrand) && t11.l(this.deviceManufacturer, ntVar.deviceManufacturer) && t11.l(this.deviceModel, ntVar.deviceModel) && t11.l(this.deviceName, ntVar.deviceName) && t11.l(this.appVersion, ntVar.appVersion) && t11.l(this.appBuild, ntVar.appBuild) && t11.l(this.packageName, ntVar.packageName) && t11.l(this.architecture, ntVar.architecture) && t11.l(this.abi, ntVar.abi) && t11.l(this.xposedFramework, ntVar.xposedFramework) && t11.l(this.xposedVersion, ntVar.xposedVersion) && t11.l(this.xposedInjectionMode, ntVar.xposedInjectionMode) && t11.l(this.isRooted, ntVar.isRooted) && t11.l(this.isEmulator, ntVar.isEmulator) && t11.l(this.installerPackage, ntVar.installerPackage) && t11.l(this.locale, ntVar.locale) && t11.l(this.timezone, ntVar.timezone) && t11.l(this.networkType, ntVar.networkType) && t11.l(this.extra, ntVar.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f() {
        return this.xposedInjectionMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Boolean g() {
        return this.isRooted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Boolean h() {
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
        k31 k31Var = this.extra;
        return iHashCode20 + (k31Var != null ? k31Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i() {
        return this.installerPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String j() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String k() {
        return this.timezone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer l() {
        return this.androidSdkInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String m() {
        return this.networkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k31 n() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String o() {
        return this.deviceBrand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String p() {
        return this.deviceManufacturer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String q() {
        return this.deviceModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String r() {
        return this.deviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String s() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String t() {
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
        k31 k31Var = this.extra;
        StringBuilder sb = new StringBuilder("ClientEnvironmentPayload(androidVersion=");
        sb.append(str);
        sb.append(", androidSdkInt=");
        sb.append(num);
        sb.append(", deviceBrand=");
        hk1.o(sb, str2, ", deviceManufacturer=", str3, ", deviceModel=");
        hk1.o(sb, str4, ", deviceName=", str5, ", appVersion=");
        hk1.o(sb, str6, ", appBuild=", str7, ", packageName=");
        hk1.o(sb, str8, ", architecture=", str9, ", abi=");
        hk1.o(sb, str10, ", xposedFramework=", str11, ", xposedVersion=");
        hk1.o(sb, str12, ", xposedInjectionMode=", str13, ", isRooted=");
        sb.append(bool);
        sb.append(", isEmulator=");
        sb.append(bool2);
        sb.append(", installerPackage=");
        hk1.o(sb, str14, ", locale=", str15, ", timezone=");
        hk1.o(sb, str16, ", networkType=", str17, ", extra=");
        sb.append(k31Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String u() {
        return this.packageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final nt v(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, k31 k31Var) {
        return new nt(str, num, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, bool, bool2, str14, str15, str16, str17, k31Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String x() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer y() {
        return this.androidSdkInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String z() {
        return this.androidVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public nt(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, k31 k31Var) {
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

    public nt() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }
}
