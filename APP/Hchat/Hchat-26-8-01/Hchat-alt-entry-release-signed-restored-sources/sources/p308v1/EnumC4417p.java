package p308v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v1.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4417p {

    /* JADX INFO: renamed from: g */
    public static final EnumC4417p f14702g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4417p f14703h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC4417p[] f14704i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4417p enumC4417p = new EnumC4417p("Min", 0);
        f14702g = enumC4417p;
        EnumC4417p enumC4417p2 = new EnumC4417p("Max", 1);
        f14703h = enumC4417p2;
        f14704i = new EnumC4417p[]{enumC4417p, enumC4417p2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4417p valueOf(String str) {
        return (EnumC4417p) Enum.valueOf(EnumC4417p.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4417p[] values() {
        return (EnumC4417p[]) f14704i.clone();
    }
}
