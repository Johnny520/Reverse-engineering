package p382zc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zc.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6135a {

    /* JADX INFO: renamed from: g */
    public static final EnumC6135a f24716g;

    /* JADX INFO: renamed from: h */
    public static final EnumC6135a f24717h;

    /* JADX INFO: renamed from: i */
    public static final EnumC6135a f24718i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC6135a[] f24719j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC6135a enumC6135a = new EnumC6135a("VERIFY_APP_PACKAGE", 0);
        f24716g = enumC6135a;
        EnumC6135a enumC6135a2 = new EnumC6135a("SECURE_XML_PARSER", 1);
        f24717h = enumC6135a2;
        EnumC6135a enumC6135a3 = new EnumC6135a("SECURE_ZIP_READER", 2);
        f24718i = enumC6135a3;
        f24719j = new EnumC6135a[]{enumC6135a, enumC6135a2, enumC6135a3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC6135a valueOf(String str) {
        return (EnumC6135a) Enum.valueOf(EnumC6135a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC6135a[] values() {
        return (EnumC6135a[]) f24719j.clone();
    }
}
