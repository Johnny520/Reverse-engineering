package nf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: nf.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3002d {

    /* JADX INFO: renamed from: g */
    public static final EnumC3002d f9781g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3002d f9782h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3002d f9783i;

    /* JADX INFO: renamed from: j */
    public static final EnumC3002d f9784j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC3002d[] f9785k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3002d enumC3002d = new EnumC3002d("IGNORE_CENTRAL_DIR_ENTRIES", 0);
        f9781g = enumC3002d;
        EnumC3002d enumC3002d2 = new EnumC3002d("REPORT_TAMPERING", 1);
        f9782h = enumC3002d2;
        EnumC3002d enumC3002d3 = new EnumC3002d("FALLBACK_AS_DEFAULT", 2);
        f9783i = enumC3002d3;
        EnumC3002d enumC3002d4 = new EnumC3002d("DONT_USE_FALLBACK", 3);
        f9784j = enumC3002d4;
        f9785k = new EnumC3002d[]{enumC3002d, enumC3002d2, enumC3002d3, enumC3002d4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3002d valueOf(String str) {
        return (EnumC3002d) Enum.valueOf(EnumC3002d.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3002d[] values() {
        return (EnumC3002d[]) f9785k.clone();
    }
}
