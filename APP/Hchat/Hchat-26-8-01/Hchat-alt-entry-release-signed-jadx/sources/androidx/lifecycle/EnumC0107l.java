package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0107l {

    /* JADX INFO: renamed from: g */
    public static final EnumC0107l f289g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0107l f290h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0107l f291i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0107l f292j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0107l f293k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC0107l[] f294l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0107l enumC0107l = new EnumC0107l("DESTROYED", 0);
        f289g = enumC0107l;
        EnumC0107l enumC0107l2 = new EnumC0107l("INITIALIZED", 1);
        f290h = enumC0107l2;
        EnumC0107l enumC0107l3 = new EnumC0107l("CREATED", 2);
        f291i = enumC0107l3;
        EnumC0107l enumC0107l4 = new EnumC0107l("STARTED", 3);
        f292j = enumC0107l4;
        EnumC0107l enumC0107l5 = new EnumC0107l("RESUMED", 4);
        f293k = enumC0107l5;
        f294l = new EnumC0107l[]{enumC0107l, enumC0107l2, enumC0107l3, enumC0107l4, enumC0107l5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0107l valueOf(String str) {
        return (EnumC0107l) Enum.valueOf(EnumC0107l.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0107l[] values() {
        return (EnumC0107l[]) f294l.clone();
    }
}
