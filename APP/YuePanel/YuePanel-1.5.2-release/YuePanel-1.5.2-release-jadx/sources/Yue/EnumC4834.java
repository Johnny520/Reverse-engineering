package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4834 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC4834 f10897 = new EnumC4834("TOP_DOWN", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC4834 f10898 = new EnumC4834("BOTTOM_UP", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4834[] f10899;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f10900;

    static {
        EnumC4834[] enumC4834ArrM1744 = m1744();
        f10899 = enumC4834ArrM1744;
        f10900 = C4655.m1607(enumC4834ArrM1744);
    }

    public EnumC4834(String str, int i) {
    }

    public static EnumC4834 valueOf(String str) {
        return (EnumC4834) Enum.valueOf(EnumC4834.class, str);
    }

    public static EnumC4834[] values() {
        return (EnumC4834[]) f10899.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC4834[] m1744() {
        return new EnumC4834[]{f10897, f10898};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC4834> m14707() {
        return f10900;
    }
}
