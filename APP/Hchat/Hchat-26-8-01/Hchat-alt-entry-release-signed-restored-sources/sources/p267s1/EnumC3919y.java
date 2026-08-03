package p267s1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s1.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3919y {

    /* JADX INFO: renamed from: g */
    public static final EnumC3919y f12867g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3919y f12868h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3919y f12869i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3919y[] f12870j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3919y enumC3919y = new EnumC3919y("Unknown", 0);
        f12867g = enumC3919y;
        EnumC3919y enumC3919y2 = new EnumC3919y("Dispatching", 1);
        f12868h = enumC3919y2;
        EnumC3919y enumC3919y3 = new EnumC3919y("NotDispatching", 2);
        f12869i = enumC3919y3;
        f12870j = new EnumC3919y[]{enumC3919y, enumC3919y2, enumC3919y3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3919y valueOf(String str) {
        return (EnumC3919y) Enum.valueOf(EnumC3919y.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3919y[] values() {
        return (EnumC3919y[]) f12870j.clone();
    }
}
