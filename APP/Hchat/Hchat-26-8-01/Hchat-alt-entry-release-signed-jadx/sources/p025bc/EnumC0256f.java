package p025bc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bc.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0256f {

    /* JADX INFO: renamed from: g */
    public static final EnumC0256f f708g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0256f f709h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0256f f710i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0256f[] f711j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0256f enumC0256f = new EnumC0256f("CASE", 0);
        f708g = enumC0256f;
        EnumC0256f enumC0256f2 = new EnumC0256f("VALID", 1);
        f709h = enumC0256f2;
        EnumC0256f enumC0256f3 = new EnumC0256f("PRINTABLE", 2);
        f710i = enumC0256f3;
        f711j = new EnumC0256f[]{enumC0256f, enumC0256f2, enumC0256f3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0256f valueOf(String str) {
        return (EnumC0256f) Enum.valueOf(EnumC0256f.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0256f[] values() {
        return (EnumC0256f[]) f711j.clone();
    }
}
