package p339x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x1.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5642s {

    /* JADX INFO: renamed from: g */
    public static final EnumC5642s f22975g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5642s f22976h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5642s f22977i;

    /* JADX INFO: renamed from: j */
    public static final EnumC5642s f22978j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC5642s[] f22979k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5642s enumC5642s = new EnumC5642s("LookaheadMeasurement", 0);
        f22975g = enumC5642s;
        EnumC5642s enumC5642s2 = new EnumC5642s("LookaheadPlacement", 1);
        f22976h = enumC5642s2;
        EnumC5642s enumC5642s3 = new EnumC5642s("Measurement", 2);
        f22977i = enumC5642s3;
        EnumC5642s enumC5642s4 = new EnumC5642s("Placement", 3);
        f22978j = enumC5642s4;
        f22979k = new EnumC5642s[]{enumC5642s, enumC5642s2, enumC5642s3, enumC5642s4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5642s valueOf(String str) {
        return (EnumC5642s) Enum.valueOf(EnumC5642s.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5642s[] values() {
        return (EnumC5642s[]) f22979k.clone();
    }
}
