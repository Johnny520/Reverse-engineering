package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥ۠ۦۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
public final class EnumC5613 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC5613 f13572 = new EnumC5613("INVARIANT", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC5613 f13573 = new EnumC5613("IN", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC5613 f13574 = new EnumC5613("OUT", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5613[] f13575;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f13576;

    static {
        EnumC5613[] enumC5613ArrM2323 = m2323();
        f13575 = enumC5613ArrM2323;
        f13576 = C4655.m1607(enumC5613ArrM2323);
    }

    public EnumC5613(String str, int i) {
    }

    public static EnumC5613 valueOf(String str) {
        return (EnumC5613) Enum.valueOf(EnumC5613.class, str);
    }

    public static EnumC5613[] values() {
        return (EnumC5613[]) f13575.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC5613[] m2323() {
        return new EnumC5613[]{f13572, f13573, f13574};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC5613> m17404() {
        return f13576;
    }
}
