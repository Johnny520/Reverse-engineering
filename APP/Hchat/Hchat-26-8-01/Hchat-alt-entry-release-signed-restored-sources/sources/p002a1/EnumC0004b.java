package p002a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0004b {

    /* JADX INFO: renamed from: g */
    public static final EnumC0004b f12g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0004b f13h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC0004b[] f14i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0004b enumC0004b = new EnumC0004b("SHOW_ORIGINAL", 0);
        f12g = enumC0004b;
        EnumC0004b enumC0004b2 = new EnumC0004b("SHOW_TRANSLATED", 1);
        f13h = enumC0004b2;
        f14i = new EnumC0004b[]{enumC0004b, enumC0004b2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0004b valueOf(String str) {
        return (EnumC0004b) Enum.valueOf(EnumC0004b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0004b[] values() {
        return (EnumC0004b[]) f14i.clone();
    }
}
