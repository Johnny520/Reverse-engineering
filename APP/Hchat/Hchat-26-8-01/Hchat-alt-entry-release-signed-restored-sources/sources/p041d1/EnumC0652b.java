package p041d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0652b {

    /* JADX INFO: renamed from: g */
    public static final EnumC0652b f2019g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0652b f2020h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0652b f2021i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0652b[] f2022j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0652b enumC0652b = new EnumC0652b("None", 0);
        f2019g = enumC0652b;
        EnumC0652b enumC0652b2 = new EnumC0652b("Cancelled", 1);
        f2020h = enumC0652b2;
        EnumC0652b enumC0652b3 = new EnumC0652b("Redirected", 2);
        f2021i = enumC0652b3;
        f2022j = new EnumC0652b[]{enumC0652b, enumC0652b2, enumC0652b3, new EnumC0652b("RedirectCancelled", 3)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0652b valueOf(String str) {
        return (EnumC0652b) Enum.valueOf(EnumC0652b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0652b[] values() {
        return (EnumC0652b[]) f2022j.clone();
    }
}
