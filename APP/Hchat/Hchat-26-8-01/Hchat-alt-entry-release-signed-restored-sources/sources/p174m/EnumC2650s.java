package p174m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2650s {

    /* JADX INFO: renamed from: g */
    public static final EnumC2650s f8650g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2650s f8651h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2650s f8652i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC2650s[] f8653j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2650s enumC2650s = new EnumC2650s("Yes", 0);
        f8650g = enumC2650s;
        EnumC2650s enumC2650s2 = new EnumC2650s("No", 1);
        f8651h = enumC2650s2;
        EnumC2650s enumC2650s3 = new EnumC2650s("NotInitialized", 2);
        f8652i = enumC2650s3;
        f8653j = new EnumC2650s[]{enumC2650s, enumC2650s2, enumC2650s3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2650s valueOf(String str) {
        return (EnumC2650s) Enum.valueOf(EnumC2650s.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2650s[] values() {
        return (EnumC2650s[]) f8653j.clone();
    }
}
