package p002a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a1.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0013k {

    /* JADX INFO: renamed from: g */
    public static final EnumC0013k f46g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0013k f47h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC0013k[] f48i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0013k enumC0013k = new EnumC0013k("VIEW_APPEAR", 0);
        f46g = enumC0013k;
        EnumC0013k enumC0013k2 = new EnumC0013k("VIEW_DISAPPEAR", 1);
        f47h = enumC0013k2;
        f48i = new EnumC0013k[]{enumC0013k, enumC0013k2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0013k valueOf(String str) {
        return (EnumC0013k) Enum.valueOf(EnumC0013k.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0013k[] values() {
        return (EnumC0013k[]) f48i.clone();
    }
}
