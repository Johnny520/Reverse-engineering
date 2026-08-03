package p339x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x1.k1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5620k1 {

    /* JADX INFO: renamed from: g */
    public static final EnumC5620k1 f22899g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5620k1 f22900h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC5620k1[] f22901i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5620k1 enumC5620k1 = new EnumC5620k1("Min", 0);
        f22899g = enumC5620k1;
        EnumC5620k1 enumC5620k12 = new EnumC5620k1("Max", 1);
        f22900h = enumC5620k12;
        f22901i = new EnumC5620k1[]{enumC5620k1, enumC5620k12};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5620k1 valueOf(String str) {
        return (EnumC5620k1) Enum.valueOf(EnumC5620k1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5620k1[] values() {
        return (EnumC5620k1[]) f22901i.clone();
    }
}
