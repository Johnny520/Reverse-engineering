package sg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3969a {

    /* JADX INFO: renamed from: g */
    public static final EnumC3969a f12979g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3969a f12980h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3969a f12981i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3969a[] f12982j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3969a enumC3969a = new EnumC3969a("SUSPEND", 0);
        f12979g = enumC3969a;
        EnumC3969a enumC3969a2 = new EnumC3969a("DROP_OLDEST", 1);
        f12980h = enumC3969a2;
        EnumC3969a enumC3969a3 = new EnumC3969a("DROP_LATEST", 2);
        f12981i = enumC3969a3;
        f12982j = new EnumC3969a[]{enumC3969a, enumC3969a2, enumC3969a3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3969a valueOf(String str) {
        return (EnumC3969a) Enum.valueOf(EnumC3969a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3969a[] values() {
        return (EnumC3969a[]) f12982j.clone();
    }
}
