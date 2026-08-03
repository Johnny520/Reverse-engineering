package p099h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1456f0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC1456f0 f4833g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1456f0 f4834h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1456f0 f4835i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1456f0[] f4836j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1456f0 enumC1456f0 = new EnumC1456f0("PreEnter", 0);
        f4833g = enumC1456f0;
        EnumC1456f0 enumC1456f02 = new EnumC1456f0("Visible", 1);
        f4834h = enumC1456f02;
        EnumC1456f0 enumC1456f03 = new EnumC1456f0("PostExit", 2);
        f4835i = enumC1456f03;
        f4836j = new EnumC1456f0[]{enumC1456f0, enumC1456f02, enumC1456f03};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1456f0 valueOf(String str) {
        return (EnumC1456f0) Enum.valueOf(EnumC1456f0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1456f0[] values() {
        return (EnumC1456f0[]) f4836j.clone();
    }
}
