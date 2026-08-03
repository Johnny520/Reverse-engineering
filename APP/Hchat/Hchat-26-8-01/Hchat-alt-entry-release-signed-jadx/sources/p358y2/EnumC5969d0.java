package p358y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y2.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5969d0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC5969d0 f24261g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5969d0 f24262h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC5969d0[] f24263i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5969d0 enumC5969d0 = new EnumC5969d0("Inherit", 0);
        f24261g = enumC5969d0;
        EnumC5969d0 enumC5969d02 = new EnumC5969d0("SecureOn", 1);
        f24262h = enumC5969d02;
        f24263i = new EnumC5969d0[]{enumC5969d0, enumC5969d02, new EnumC5969d0("SecureOff", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5969d0 valueOf(String str) {
        return (EnumC5969d0) Enum.valueOf(EnumC5969d0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5969d0[] values() {
        return (EnumC5969d0[]) f24263i.clone();
    }
}
