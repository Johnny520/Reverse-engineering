package p293u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u2.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4243m {

    /* JADX INFO: renamed from: g */
    public static final EnumC4243m f13919g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4243m f13920h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC4243m[] f13921i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4243m enumC4243m = new EnumC4243m("Ltr", 0);
        f13919g = enumC4243m;
        EnumC4243m enumC4243m2 = new EnumC4243m("Rtl", 1);
        f13920h = enumC4243m2;
        f13921i = new EnumC4243m[]{enumC4243m, enumC4243m2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4243m valueOf(String str) {
        return (EnumC4243m) Enum.valueOf(EnumC4243m.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4243m[] values() {
        return (EnumC4243m[]) f13921i.clone();
    }
}
