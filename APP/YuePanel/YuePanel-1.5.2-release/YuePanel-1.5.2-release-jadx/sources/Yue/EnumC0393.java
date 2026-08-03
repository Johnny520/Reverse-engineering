package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥ۠ */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0393 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC0393 f8970 = new EnumC0393("WARNING", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC0393 f8971 = new EnumC0393("ERROR", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC0393 f8972 = new EnumC0393("HIDDEN", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0393[] f8973;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f8974;

    static {
        EnumC0393[] enumC0393ArrM1331 = m1331();
        f8973 = enumC0393ArrM1331;
        f8974 = C4655.m1607(enumC0393ArrM1331);
    }

    public EnumC0393(String str, int i) {
    }

    public static EnumC0393 valueOf(String str) {
        return (EnumC0393) Enum.valueOf(EnumC0393.class, str);
    }

    public static EnumC0393[] values() {
        return (EnumC0393[]) f8973.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC0393[] m1331() {
        return new EnumC0393[]{f8970, f8971, f8972};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC0393> m12661() {
        return f8974;
    }
}
