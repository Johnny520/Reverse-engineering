package p038ce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ce.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0563p {

    /* JADX INFO: renamed from: g */
    public static final EnumC0563p f1754g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0563p f1755h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0563p f1756i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0563p[] f1757j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0563p enumC0563p = new EnumC0563p("WHITE", 0);
        f1754g = enumC0563p;
        EnumC0563p enumC0563p2 = new EnumC0563p("GRAY", 1);
        f1755h = enumC0563p2;
        EnumC0563p enumC0563p3 = new EnumC0563p("BLACK", 2);
        f1756i = enumC0563p3;
        f1757j = new EnumC0563p[]{enumC0563p, enumC0563p2, enumC0563p3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0563p valueOf(String str) {
        return (EnumC0563p) Enum.valueOf(EnumC0563p.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0563p[] values() {
        return (EnumC0563p[]) f1757j.clone();
    }
}
