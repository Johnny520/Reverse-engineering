package p144k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: k.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2164d1 {

    /* JADX INFO: renamed from: g */
    public static final EnumC2164d1 f7173g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2164d1 f7174h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC2164d1[] f7175i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2164d1 enumC2164d1 = new EnumC2164d1("Default", 0);
        f7173g = enumC2164d1;
        EnumC2164d1 enumC2164d12 = new EnumC2164d1("UserInput", 1);
        f7174h = enumC2164d12;
        f7175i = new EnumC2164d1[]{enumC2164d1, enumC2164d12, new EnumC2164d1("PreventUserInput", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2164d1 valueOf(String str) {
        return (EnumC2164d1) Enum.valueOf(EnumC2164d1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2164d1[] values() {
        return (EnumC2164d1[]) f7175i.clone();
    }
}
