package p174m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m.p1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2640p1 {

    /* JADX INFO: renamed from: g */
    public static final EnumC2640p1 f8622g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2640p1 f8623h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC2640p1[] f8624i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2640p1 enumC2640p1 = new EnumC2640p1("Vertical", 0);
        f8622g = enumC2640p1;
        EnumC2640p1 enumC2640p12 = new EnumC2640p1("Horizontal", 1);
        f8623h = enumC2640p12;
        f8624i = new EnumC2640p1[]{enumC2640p1, enumC2640p12};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2640p1 valueOf(String str) {
        return (EnumC2640p1) Enum.valueOf(EnumC2640p1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2640p1[] values() {
        return (EnumC2640p1[]) f8624i.clone();
    }
}
