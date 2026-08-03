package p280t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4094j {

    /* JADX INFO: renamed from: g */
    public static final EnumC4094j f13554g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4094j f13555h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC4094j[] f13556i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4094j enumC4094j = new EnumC4094j("Ltr", 0);
        f13554g = enumC4094j;
        EnumC4094j enumC4094j2 = new EnumC4094j("Rtl", 1);
        f13555h = enumC4094j2;
        f13556i = new EnumC4094j[]{enumC4094j, enumC4094j2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4094j valueOf(String str) {
        return (EnumC4094j) Enum.valueOf(EnumC4094j.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4094j[] values() {
        return (EnumC4094j[]) f13556i.clone();
    }
}
