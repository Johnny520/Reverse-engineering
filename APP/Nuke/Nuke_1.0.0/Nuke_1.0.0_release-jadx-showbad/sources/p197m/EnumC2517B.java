package p197m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m.B */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2517B {

    /* JADX INFO: renamed from: d */
    public static final EnumC2517B f8039d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2517B f8040e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2517B f8041f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC2517B[] f8042g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2517B enumC2517B = new EnumC2517B("PreEnter", 0);
        f8039d = enumC2517B;
        EnumC2517B enumC2517B2 = new EnumC2517B("Visible", 1);
        f8040e = enumC2517B2;
        EnumC2517B enumC2517B3 = new EnumC2517B("PostExit", 2);
        f8041f = enumC2517B3;
        f8042g = new EnumC2517B[]{enumC2517B, enumC2517B2, enumC2517B3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2517B valueOf(String str) {
        return (EnumC2517B) Enum.valueOf(EnumC2517B.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2517B[] values() {
        return (EnumC2517B[]) f8042g.clone();
    }
}
