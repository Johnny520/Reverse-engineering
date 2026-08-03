package p100h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1527j {

    /* JADX INFO: renamed from: g */
    public static final EnumC1527j f5095g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1527j f5096h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1527j f5097i;

    /* JADX INFO: renamed from: j */
    public static final EnumC1527j f5098j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC1527j[] f5099k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1527j enumC1527j = new EnumC1527j("Up", 0);
        f5095g = enumC1527j;
        EnumC1527j enumC1527j2 = new EnumC1527j("Drag", 1);
        f5096h = enumC1527j2;
        EnumC1527j enumC1527j3 = new EnumC1527j("Timeout", 2);
        f5097i = enumC1527j3;
        EnumC1527j enumC1527j4 = new EnumC1527j("Cancel", 3);
        f5098j = enumC1527j4;
        f5099k = new EnumC1527j[]{enumC1527j, enumC1527j2, enumC1527j3, enumC1527j4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1527j valueOf(String str) {
        return (EnumC1527j) Enum.valueOf(EnumC1527j.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1527j[] values() {
        return (EnumC1527j[]) f5099k.clone();
    }
}
