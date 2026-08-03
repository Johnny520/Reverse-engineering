package p174m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2663v0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC2663v0 f8700g;

    /* JADX INFO: renamed from: h */
    public static final EnumC2663v0 f8701h;

    /* JADX INFO: renamed from: i */
    public static final EnumC2663v0 f8702i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC2663v0[] f8703j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2663v0 enumC2663v0 = new EnumC2663v0("Yes", 0);
        f8700g = enumC2663v0;
        EnumC2663v0 enumC2663v02 = new EnumC2663v0("No", 1);
        f8701h = enumC2663v02;
        EnumC2663v0 enumC2663v03 = new EnumC2663v0("NotInitialized", 2);
        f8702i = enumC2663v03;
        f8703j = new EnumC2663v0[]{enumC2663v0, enumC2663v02, enumC2663v03};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2663v0 valueOf(String str) {
        return (EnumC2663v0) Enum.valueOf(EnumC2663v0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2663v0[] values() {
        return (EnumC2663v0[]) f8703j.clone();
    }
}
