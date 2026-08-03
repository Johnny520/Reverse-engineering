package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥ۟ۧۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.8")
@InterfaceC4771
public final class EnumC4222 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC4222 f8576 = new EnumC4222("CONTINUE", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC4222 f8577 = new EnumC4222("SKIP_SUBTREE", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC4222 f8578 = new EnumC4222("TERMINATE", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4222[] f8579;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f8580;

    static {
        EnumC4222[] enumC4222ArrM1186 = m1186();
        f8579 = enumC4222ArrM1186;
        f8580 = C4655.m1607(enumC4222ArrM1186);
    }

    public EnumC4222(String str, int i) {
    }

    public static EnumC4222 valueOf(String str) {
        return (EnumC4222) Enum.valueOf(EnumC4222.class, str);
    }

    public static EnumC4222[] values() {
        return (EnumC4222[]) f8579.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC4222[] m1186() {
        return new EnumC4222[]{f8576, f8577, f8578};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC4222> m12155() {
        return f8580;
    }
}
