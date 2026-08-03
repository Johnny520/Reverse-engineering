package p025bc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bc.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0252b {

    /* JADX INFO: renamed from: g */
    public static final EnumC0252b f703g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0252b f704h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0252b f705i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0252b[] f706j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0252b enumC0252b = new EnumC0252b("AUTO", 0);
        f703g = enumC0252b;
        EnumC0252b enumC0252b2 = new EnumC0252b("RESTRUCTURE", 1);
        EnumC0252b enumC0252b3 = new EnumC0252b("SIMPLE", 2);
        f704h = enumC0252b3;
        EnumC0252b enumC0252b4 = new EnumC0252b("FALLBACK", 3);
        f705i = enumC0252b4;
        f706j = new EnumC0252b[]{enumC0252b, enumC0252b2, enumC0252b3, enumC0252b4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0252b valueOf(String str) {
        return (EnumC0252b) Enum.valueOf(EnumC0252b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0252b[] values() {
        return (EnumC0252b[]) f706j.clone();
    }
}
