package p247qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qe.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3529l {

    /* JADX INFO: renamed from: g */
    public static final EnumC3529l f11481g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3529l f11482h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3529l f11483i;

    /* JADX INFO: renamed from: j */
    public static final EnumC3529l f11484j;

    /* JADX INFO: renamed from: k */
    public static final EnumC3529l f11485k;

    /* JADX INFO: renamed from: l */
    public static final EnumC3529l f11486l;

    /* JADX INFO: renamed from: m */
    public static final EnumC3529l f11487m;

    /* JADX INFO: renamed from: n */
    public static final EnumC3529l f11488n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ EnumC3529l[] f11489o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3529l enumC3529l = new EnumC3529l("EQUAL", 0);
        f11481g = enumC3529l;
        EnumC3529l enumC3529l2 = new EnumC3529l("NARROW", 1);
        f11482h = enumC3529l2;
        EnumC3529l enumC3529l3 = new EnumC3529l("NARROW_BY_GENERIC", 2);
        f11483i = enumC3529l3;
        EnumC3529l enumC3529l4 = new EnumC3529l("WIDER", 3);
        f11484j = enumC3529l4;
        EnumC3529l enumC3529l5 = new EnumC3529l("WIDER_BY_GENERIC", 4);
        f11485k = enumC3529l5;
        EnumC3529l enumC3529l6 = new EnumC3529l("CONFLICT", 5);
        f11486l = enumC3529l6;
        EnumC3529l enumC3529l7 = new EnumC3529l("CONFLICT_BY_GENERIC", 6);
        f11487m = enumC3529l7;
        EnumC3529l enumC3529l8 = new EnumC3529l("UNKNOWN", 7);
        f11488n = enumC3529l8;
        f11489o = new EnumC3529l[]{enumC3529l, enumC3529l2, enumC3529l3, enumC3529l4, enumC3529l5, enumC3529l6, enumC3529l7, enumC3529l8};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3529l valueOf(String str) {
        return (EnumC3529l) Enum.valueOf(EnumC3529l.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3529l[] values() {
        return (EnumC3529l[]) f11489o.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final EnumC3529l m7433a() {
        int iOrdinal = ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? this : f11483i : f11482h : f11485k : f11484j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m7434b() {
        return this == f11481g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m7435c() {
        return this == f11482h || this == f11483i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m7436d() {
        return this == f11484j || this == f11485k;
    }
}
