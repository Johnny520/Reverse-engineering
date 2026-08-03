package p352xf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5799a {

    /* JADX INFO: renamed from: g */
    public static final EnumC5799a f23547g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5799a f23548h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5799a f23549i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC5799a[] f23550j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5799a enumC5799a = new EnumC5799a("COROUTINE_SUSPENDED", 0);
        f23547g = enumC5799a;
        EnumC5799a enumC5799a2 = new EnumC5799a("UNDECIDED", 1);
        f23548h = enumC5799a2;
        EnumC5799a enumC5799a3 = new EnumC5799a("RESUMED", 2);
        f23549i = enumC5799a3;
        f23550j = new EnumC5799a[]{enumC5799a, enumC5799a2, enumC5799a3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5799a valueOf(String str) {
        return (EnumC5799a) Enum.valueOf(EnumC5799a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5799a[] values() {
        return (EnumC5799a[]) f23550j.clone();
    }
}
