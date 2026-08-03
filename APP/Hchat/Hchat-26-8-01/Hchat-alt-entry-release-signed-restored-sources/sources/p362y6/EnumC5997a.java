package p362y6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5997a {

    /* JADX INFO: renamed from: g */
    public static final EnumC5997a f24362g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC5997a[] f24363h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5997a EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5997a enumC5997a = new EnumC5997a("DEBUG", 0);
        EnumC5997a enumC5997a2 = new EnumC5997a("INFO", 1);
        EnumC5997a enumC5997a3 = new EnumC5997a("WARN", 2);
        f24362g = enumC5997a3;
        f24363h = new EnumC5997a[]{enumC5997a, enumC5997a2, enumC5997a3, new EnumC5997a("ERROR", 3), new EnumC5997a("OFF", 4)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5997a valueOf(String str) {
        return (EnumC5997a) Enum.valueOf(EnumC5997a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5997a[] values() {
        return (EnumC5997a[]) f24363h.clone();
    }
}
