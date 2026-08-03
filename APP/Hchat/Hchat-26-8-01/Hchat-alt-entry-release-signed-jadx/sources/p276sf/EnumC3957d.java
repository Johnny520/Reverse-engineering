package p276sf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sf.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3957d {

    /* JADX INFO: renamed from: g */
    public static final EnumC3957d f12958g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3957d f12959h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC3957d[] f12960i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3957d enumC3957d = new EnumC3957d("SYNCHRONIZED", 0);
        f12958g = enumC3957d;
        EnumC3957d enumC3957d2 = new EnumC3957d("PUBLICATION", 1);
        EnumC3957d enumC3957d3 = new EnumC3957d("NONE", 2);
        f12959h = enumC3957d3;
        f12960i = new EnumC3957d[]{enumC3957d, enumC3957d2, enumC3957d3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3957d valueOf(String str) {
        return (EnumC3957d) Enum.valueOf(EnumC3957d.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3957d[] values() {
        return (EnumC3957d[]) f12960i.clone();
    }
}
