package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥۣۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.8")
@InterfaceC4771
public final class EnumC6553 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC6553 f16817 = new EnumC6553("SKIP_SUBTREE", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC6553 f16818 = new EnumC6553("TERMINATE", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6553[] f16819;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f16820;

    static {
        EnumC6553[] enumC6553ArrM3018 = m3018();
        f16819 = enumC6553ArrM3018;
        f16820 = C4655.m1607(enumC6553ArrM3018);
    }

    public EnumC6553(String str, int i) {
    }

    public static EnumC6553 valueOf(String str) {
        return (EnumC6553) Enum.valueOf(EnumC6553.class, str);
    }

    public static EnumC6553[] values() {
        return (EnumC6553[]) f16819.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC6553[] m3018() {
        return new EnumC6553[]{f16817, f16818};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC6553> m20873() {
        return f16820;
    }
}
