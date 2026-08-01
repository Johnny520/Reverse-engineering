package p034G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: G.m */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0468m {

    /* JADX INFO: renamed from: d */
    public static final EnumC0468m f1390d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0468m f1391e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0468m f1392f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0468m[] f1393g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0468m enumC0468m = new EnumC0468m("Uninitialized", 0);
        f1390d = enumC0468m;
        EnumC0468m enumC0468m2 = new EnumC0468m("Detached", 1);
        f1391e = enumC0468m2;
        EnumC0468m enumC0468m3 = new EnumC0468m("Attached", 2);
        f1392f = enumC0468m3;
        f1393g = new EnumC0468m[]{enumC0468m, enumC0468m2, enumC0468m3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0468m valueOf(String str) {
        return (EnumC0468m) Enum.valueOf(EnumC0468m.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0468m[] values() {
        return (EnumC0468m[]) f1393g.clone();
    }
}
