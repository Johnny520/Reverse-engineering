package p054dg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: dg.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0792k {

    /* JADX INFO: renamed from: g */
    public static final EnumC0792k f2375g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0792k f2376h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC0792k[] f2377i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0792k enumC0792k = new EnumC0792k("TOP_DOWN", 0);
        f2375g = enumC0792k;
        EnumC0792k enumC0792k2 = new EnumC0792k("BOTTOM_UP", 1);
        f2376h = enumC0792k2;
        f2377i = new EnumC0792k[]{enumC0792k, enumC0792k2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0792k valueOf(String str) {
        return (EnumC0792k) Enum.valueOf(EnumC0792k.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0792k[] values() {
        return (EnumC0792k[]) f2377i.clone();
    }
}
