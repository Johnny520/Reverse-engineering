package Yue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥ۠ۥۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4762
@InterfaceC4213
@InterfaceC7470(version = "1.3")
public final class EnumC5513 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC4213
    public static final EnumC5513 f13487 = new EnumC5513("AT_MOST_ONCE", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC4213
    public static final EnumC5513 f13488 = new EnumC5513("AT_LEAST_ONCE", 1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC4213
    public static final EnumC5513 f13489 = new EnumC5513("EXACTLY_ONCE", 2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC4213
    public static final EnumC5513 f13490 = new EnumC5513("UNKNOWN", 3);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5513[] f13491;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC4654 f13492;

    static {
        EnumC5513[] enumC5513ArrM2261 = m2261();
        f13491 = enumC5513ArrM2261;
        f13492 = C4655.m1607(enumC5513ArrM2261);
    }

    public EnumC5513(String str, int i) {
    }

    public static EnumC5513 valueOf(String str) {
        return (EnumC5513) Enum.valueOf(EnumC5513.class, str);
    }

    public static EnumC5513[] values() {
        return (EnumC5513[]) f13491.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ EnumC5513[] m2261() {
        return new EnumC5513[]{f13487, f13488, f13489, f13490};
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4654<EnumC5513> m17145() {
        return f13492;
    }
}
