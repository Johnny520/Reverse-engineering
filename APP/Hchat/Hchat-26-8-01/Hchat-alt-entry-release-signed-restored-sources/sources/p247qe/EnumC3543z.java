package p247qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qe.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3543z {

    /* JADX INFO: renamed from: g */
    public static final EnumC3543z f11524g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3543z f11525h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3543z f11526i;

    /* JADX INFO: renamed from: j */
    public static final EnumC3543z f11527j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC3543z[] f11528k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3543z enumC3543z = new EnumC3543z("ALLOW_WIDER", 0);
        f11524g = enumC3543z;
        EnumC3543z enumC3543z2 = new EnumC3543z("IGNORE_SAME", 1);
        f11525h = enumC3543z2;
        EnumC3543z enumC3543z3 = new EnumC3543z("IGNORE_UNKNOWN", 2);
        f11526i = enumC3543z3;
        EnumC3543z enumC3543z4 = new EnumC3543z("KEEP_GENERICS", 3);
        f11527j = enumC3543z4;
        f11528k = new EnumC3543z[]{enumC3543z, enumC3543z2, enumC3543z3, enumC3543z4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3543z valueOf(String str) {
        return (EnumC3543z) Enum.valueOf(EnumC3543z.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3543z[] values() {
        return (EnumC3543z[]) f11528k.clone();
    }
}
