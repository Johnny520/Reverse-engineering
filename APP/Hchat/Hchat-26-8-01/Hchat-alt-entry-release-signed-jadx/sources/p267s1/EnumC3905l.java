package p267s1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s1.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3905l {

    /* JADX INFO: renamed from: g */
    public static final EnumC3905l f12812g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3905l f12813h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3905l f12814i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC3905l[] f12815j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3905l enumC3905l = new EnumC3905l("Initial", 0);
        f12812g = enumC3905l;
        EnumC3905l enumC3905l2 = new EnumC3905l("Main", 1);
        f12813h = enumC3905l2;
        EnumC3905l enumC3905l3 = new EnumC3905l("Final", 2);
        f12814i = enumC3905l3;
        f12815j = new EnumC3905l[]{enumC3905l, enumC3905l2, enumC3905l3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3905l valueOf(String str) {
        return (EnumC3905l) Enum.valueOf(EnumC3905l.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3905l[] values() {
        return (EnumC3905l[]) f12815j.clone();
    }
}
