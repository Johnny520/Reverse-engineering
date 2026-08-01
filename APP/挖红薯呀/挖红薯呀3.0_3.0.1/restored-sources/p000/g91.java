package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class g91 {

    /* JADX INFO: renamed from: d */
    public static final g91 f1893d;

    /* JADX INFO: renamed from: e */
    public static final g91 f1894e;

    /* JADX INFO: renamed from: f */
    public static final g91 f1895f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ g91[] f1896g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        g91 g91Var = new g91("ContinueTraversal", 0);
        f1893d = g91Var;
        g91 g91Var2 = new g91("SkipSubtreeAndContinueTraversal", 1);
        f1894e = g91Var2;
        g91 g91Var3 = new g91("CancelTraversal", 2);
        f1895f = g91Var3;
        f1896g = new g91[]{g91Var, g91Var2, g91Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static g91 valueOf(String str) {
        return (g91) Enum.valueOf(g91.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static g91[] values() {
        return (g91[]) f1896g.clone();
    }
}
