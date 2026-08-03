package p116i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1764k0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC1764k0 f5887g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC1764k0[] f5888h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1764k0 enumC1764k0 = new EnumC1764k0("Default", 0);
        f5887g = enumC1764k0;
        f5888h = new EnumC1764k0[]{enumC1764k0, new EnumC1764k0("UserInput", 1), new EnumC1764k0("PreventUserInput", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1764k0 valueOf(String str) {
        return (EnumC1764k0) Enum.valueOf(EnumC1764k0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1764k0[] values() {
        return (EnumC1764k0[]) f5888h.clone();
    }
}
