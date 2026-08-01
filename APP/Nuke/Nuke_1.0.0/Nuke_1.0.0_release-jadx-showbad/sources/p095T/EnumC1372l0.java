package p095T;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: T.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1372l0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC1372l0 f4834d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1372l0 f4835e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1372l0 f4836f;

    /* JADX INFO: renamed from: g */
    public static final EnumC1372l0 f4837g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1372l0 f4838h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1372l0 f4839i;

    /* JADX INFO: renamed from: j */
    public static final EnumC1372l0 f4840j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC1372l0[] f4841k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1372l0 enumC1372l0 = new EnumC1372l0("Invalid", 0);
        f4834d = enumC1372l0;
        EnumC1372l0 enumC1372l02 = new EnumC1372l0("Cancelled", 1);
        f4835e = enumC1372l02;
        EnumC1372l0 enumC1372l03 = new EnumC1372l0("InitialPending", 2);
        f4836f = enumC1372l03;
        EnumC1372l0 enumC1372l04 = new EnumC1372l0("RecomposePending", 3);
        f4837g = enumC1372l04;
        EnumC1372l0 enumC1372l05 = new EnumC1372l0("Recomposing", 4);
        f4838h = enumC1372l05;
        EnumC1372l0 enumC1372l06 = new EnumC1372l0("ApplyPending", 5);
        f4839i = enumC1372l06;
        EnumC1372l0 enumC1372l07 = new EnumC1372l0("Applied", 6);
        f4840j = enumC1372l07;
        f4841k = new EnumC1372l0[]{enumC1372l0, enumC1372l02, enumC1372l03, enumC1372l04, enumC1372l05, enumC1372l06, enumC1372l07};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1372l0 valueOf(String str) {
        return (EnumC1372l0) Enum.valueOf(EnumC1372l0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1372l0[] values() {
        return (EnumC1372l0[]) f4841k.clone();
    }
}
