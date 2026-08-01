package p181j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j0.f */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2371f {

    /* JADX INFO: renamed from: d */
    public static final EnumC2371f f7700d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2371f f7701e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC2371f[] f7702f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2371f enumC2371f = new EnumC2371f("VIEW_APPEAR", 0);
        f7700d = enumC2371f;
        EnumC2371f enumC2371f2 = new EnumC2371f("VIEW_DISAPPEAR", 1);
        f7701e = enumC2371f2;
        f7702f = new EnumC2371f[]{enumC2371f, enumC2371f2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2371f valueOf(String str) {
        return (EnumC2371f) Enum.valueOf(EnumC2371f.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2371f[] values() {
        return (EnumC2371f[]) f7702f.clone();
    }
}
