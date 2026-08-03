package p222p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3239n0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC3239n0 f10329g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3239n0 f10330h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC3239n0[] f10331i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3239n0 enumC3239n0 = new EnumC3239n0("Min", 0);
        f10329g = enumC3239n0;
        EnumC3239n0 enumC3239n02 = new EnumC3239n0("Max", 1);
        f10330h = enumC3239n02;
        f10331i = new EnumC3239n0[]{enumC3239n0, enumC3239n02};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3239n0 valueOf(String str) {
        return (EnumC3239n0) Enum.valueOf(EnumC3239n0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3239n0[] values() {
        return (EnumC3239n0[]) f10331i.clone();
    }
}
