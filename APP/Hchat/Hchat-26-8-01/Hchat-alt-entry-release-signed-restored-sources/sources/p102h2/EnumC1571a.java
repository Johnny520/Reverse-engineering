package p102h2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1571a {

    /* JADX INFO: renamed from: g */
    public static final EnumC1571a f5230g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1571a f5231h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1571a f5232i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1571a[] f5233j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1571a enumC1571a = new EnumC1571a("On", 0);
        f5230g = enumC1571a;
        EnumC1571a enumC1571a2 = new EnumC1571a("Off", 1);
        f5231h = enumC1571a2;
        EnumC1571a enumC1571a3 = new EnumC1571a("Indeterminate", 2);
        f5232i = enumC1571a3;
        f5233j = new EnumC1571a[]{enumC1571a, enumC1571a2, enumC1571a3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1571a valueOf(String str) {
        return (EnumC1571a) Enum.valueOf(EnumC1571a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1571a[] values() {
        return (EnumC1571a[]) f5233j.clone();
    }
}
