package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class h11 {

    /* JADX INFO: renamed from: d */
    public static final h11 f2123d;

    /* JADX INFO: renamed from: e */
    public static final h11 f2124e;

    /* JADX INFO: renamed from: f */
    public static final h11 f2125f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ h11[] f2126g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        h11 h11Var = new h11("START", 0);
        f2123d = h11Var;
        h11 h11Var2 = new h11("STOP", 1);
        f2124e = h11Var2;
        h11 h11Var3 = new h11("STOP_AND_RESET_REPLAY_CACHE", 2);
        f2125f = h11Var3;
        f2126g = new h11[]{h11Var, h11Var2, h11Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h11 valueOf(String str) {
        return (h11) Enum.valueOf(h11.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h11[] values() {
        return (h11[]) f2126g.clone();
    }
}
