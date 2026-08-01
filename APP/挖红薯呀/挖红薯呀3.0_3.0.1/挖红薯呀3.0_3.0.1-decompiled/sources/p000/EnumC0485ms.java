package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ms */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0485ms {

    /* JADX INFO: renamed from: d */
    public static final EnumC0485ms f4026d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0485ms f4027e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0485ms f4028f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0485ms[] f4029g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0485ms enumC0485ms = new EnumC0485ms("PreEnter", 0);
        f4026d = enumC0485ms;
        EnumC0485ms enumC0485ms2 = new EnumC0485ms("Visible", 1);
        f4027e = enumC0485ms2;
        EnumC0485ms enumC0485ms3 = new EnumC0485ms("PostExit", 2);
        f4028f = enumC0485ms3;
        f4029g = new EnumC0485ms[]{enumC0485ms, enumC0485ms2, enumC0485ms3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0485ms valueOf(String str) {
        return (EnumC0485ms) Enum.valueOf(EnumC0485ms.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0485ms[] values() {
        return (EnumC0485ms[]) f4029g.clone();
    }
}
