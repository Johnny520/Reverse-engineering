package p249qg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qg.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3601u {

    /* JADX INFO: renamed from: g */
    public static final EnumC3601u f11613g;

    /* JADX INFO: renamed from: h */
    public static final EnumC3601u f11614h;

    /* JADX INFO: renamed from: i */
    public static final EnumC3601u f11615i;

    /* JADX INFO: renamed from: j */
    public static final EnumC3601u f11616j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC3601u[] f11617k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3601u enumC3601u = new EnumC3601u("DEFAULT", 0);
        f11613g = enumC3601u;
        EnumC3601u enumC3601u2 = new EnumC3601u("LAZY", 1);
        f11614h = enumC3601u2;
        EnumC3601u enumC3601u3 = new EnumC3601u("ATOMIC", 2);
        f11615i = enumC3601u3;
        EnumC3601u enumC3601u4 = new EnumC3601u("UNDISPATCHED", 3);
        f11616j = enumC3601u4;
        f11617k = new EnumC3601u[]{enumC3601u, enumC3601u2, enumC3601u3, enumC3601u4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3601u valueOf(String str) {
        return (EnumC3601u) Enum.valueOf(EnumC3601u.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3601u[] values() {
        return (EnumC3601u[]) f11617k.clone();
    }
}
