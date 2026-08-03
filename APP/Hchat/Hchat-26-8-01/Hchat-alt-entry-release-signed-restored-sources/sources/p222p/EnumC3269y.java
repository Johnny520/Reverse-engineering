package p222p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3269y {

    /* JADX INFO: renamed from: g */
    public static final EnumC3269y f10410g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3269y f10411h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3269y f10412i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3269y[] f10413j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3269y enumC3269y = new EnumC3269y("Vertical", 0);
        f10410g = enumC3269y;
        EnumC3269y enumC3269y2 = new EnumC3269y("Horizontal", 1);
        f10411h = enumC3269y2;
        EnumC3269y enumC3269y3 = new EnumC3269y("Both", 2);
        f10412i = enumC3269y3;
        f10413j = new EnumC3269y[]{enumC3269y, enumC3269y2, enumC3269y3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3269y valueOf(String str) {
        return (EnumC3269y) Enum.valueOf(EnumC3269y.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3269y[] values() {
        return (EnumC3269y[]) f10413j.clone();
    }
}
