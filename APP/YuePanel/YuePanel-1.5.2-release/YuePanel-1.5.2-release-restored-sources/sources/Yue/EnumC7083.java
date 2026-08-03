package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥۡۦۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC7083 implements InterfaceC4865 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC7083 f21390;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final EnumC7083 f21391;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final EnumC7083 f21392;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final EnumC7083 f21393;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final EnumC7083 f21394;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final EnumC7083 f21395;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final EnumC7083 f21396;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7083[] f21397;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f21398;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f21399;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f21400;

    static {
        int i = 2;
        f21390 = new EnumC7083("IGNORE_CASE", 0, i, 0, 2, null);
        int i2 = 2;
        C4335 c4335 = null;
        int i3 = 0;
        f21391 = new EnumC7083("MULTILINE", 1, 8, i3, i2, c4335);
        int i4 = 2;
        C4335 c43352 = null;
        int i5 = 0;
        f21392 = new EnumC7083("LITERAL", i, 16, i5, i4, c43352);
        f21393 = new EnumC7083("UNIX_LINES", 3, 1, i3, i2, c4335);
        f21394 = new EnumC7083("COMMENTS", 4, 4, i5, i4, c43352);
        f21395 = new EnumC7083("DOT_MATCHES_ALL", 5, 32, i3, i2, c4335);
        f21396 = new EnumC7083("CANON_EQ", 6, 128, i5, i4, c43352);
        EnumC7083[] enumC7083ArrM3367 = m3367();
        f21397 = enumC7083ArrM3367;
        f21398 = C4655.m1607(enumC7083ArrM3367);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC7083(String str, int i, int i2, int i3) {
        this.f21399 = i2;
        this.f21400 = i3;
    }

    public static EnumC7083 valueOf(String str) {
        return (EnumC7083) Enum.valueOf(EnumC7083.class, str);
    }

    public static EnumC7083[] values() {
        return (EnumC7083[]) f21397.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC7083[] m3367() {
        return new EnumC7083[]{f21390, f21391, f21392, f21393, f21394, f21395, f21396};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC7083> m22082() {
        return f21398;
    }

    @Override // Yue.InterfaceC4865
    public int getMask() {
        return this.f21400;
    }

    @Override // Yue.InterfaceC4865
    public int getValue() {
        return this.f21399;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (r3v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (r3v0 int) : (r4v0 int))
 A[MD:(java.lang.String, int, int, int):void (m)] (LINE:2) call: Yue.ۥۡۦۣۥ.<init>(java.lang.String, int, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ EnumC7083(String str, int i, int i2, int i3, int i4, C4335 c4335) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }
}
