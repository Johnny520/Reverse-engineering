package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥ۟ۧۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6839
@InterfaceC7470(version = "1.3")
public final class EnumC4245 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC4245 f8633 = new EnumC4245("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC4245 f8634 = new EnumC4245("UNDECIDED", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC4245 f8635 = new EnumC4245("RESUMED", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4245[] f8636;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f8637;

    static {
        EnumC4245[] enumC4245ArrM1210 = m1210();
        f8636 = enumC4245ArrM1210;
        f8637 = C4655.m1607(enumC4245ArrM1210);
    }

    public EnumC4245(String str, int i) {
    }

    public static EnumC4245 valueOf(String str) {
        return (EnumC4245) Enum.valueOf(EnumC4245.class, str);
    }

    public static EnumC4245[] values() {
        return (EnumC4245[]) f8636.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC4245[] m1210() {
        return new EnumC4245[]{f8633, f8634, f8635};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC4245> m12248() {
        return f8637;
    }
}
