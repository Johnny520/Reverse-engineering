package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥۡۦۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.2")
public final class EnumC7112 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC7112 f21468 = new EnumC7112("LANGUAGE_VERSION", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC7112 f21469 = new EnumC7112("COMPILER_VERSION", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC7112 f21470 = new EnumC7112("API_VERSION", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7112[] f21471;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f21472;

    static {
        EnumC7112[] enumC7112ArrM3403 = m3403();
        f21471 = enumC7112ArrM3403;
        f21472 = C4655.m1607(enumC7112ArrM3403);
    }

    public EnumC7112(String str, int i) {
    }

    public static EnumC7112 valueOf(String str) {
        return (EnumC7112) Enum.valueOf(EnumC7112.class, str);
    }

    public static EnumC7112[] values() {
        return (EnumC7112[]) f21471.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC7112[] m3403() {
        return new EnumC7112[]{f21468, f21469, f21470};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC7112> m22227() {
        return f21472;
    }
}
