package p025bc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bc.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0251a {

    /* JADX INFO: renamed from: g */
    public static final EnumC0251a f696g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0251a f697h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0251a f698i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0251a f699j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0251a f700k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0251a f701l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ EnumC0251a[] f702m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0251a enumC0251a = new EnumC0251a("NONE", 0);
        f696g = enumC0251a;
        EnumC0251a enumC0251a2 = new EnumC0251a("USER_ONLY", 1);
        f697h = enumC0251a2;
        EnumC0251a enumC0251a3 = new EnumC0251a("ERROR", 2);
        f698i = enumC0251a3;
        EnumC0251a enumC0251a4 = new EnumC0251a("WARN", 3);
        f699j = enumC0251a4;
        EnumC0251a enumC0251a5 = new EnumC0251a("INFO", 4);
        f700k = enumC0251a5;
        EnumC0251a enumC0251a6 = new EnumC0251a("DEBUG", 5);
        f701l = enumC0251a6;
        f702m = new EnumC0251a[]{enumC0251a, enumC0251a2, enumC0251a3, enumC0251a4, enumC0251a5, enumC0251a6};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0251a valueOf(String str) {
        return (EnumC0251a) Enum.valueOf(EnumC0251a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0251a[] values() {
        return (EnumC0251a[]) f702m.clone();
    }
}
