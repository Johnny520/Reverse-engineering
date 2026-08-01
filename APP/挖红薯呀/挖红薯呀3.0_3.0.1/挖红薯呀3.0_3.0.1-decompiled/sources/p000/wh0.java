package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class wh0 {

    /* JADX INFO: renamed from: d */
    public static final wh0 f7131d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ wh0[] f7132e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        wh0 wh0Var = new wh0("Default", 0);
        f7131d = wh0Var;
        f7132e = new wh0[]{wh0Var, new wh0("UserInput", 1), new wh0("PreventUserInput", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wh0 valueOf(String str) {
        return (wh0) Enum.valueOf(wh0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wh0[] values() {
        return (wh0[]) f7132e.clone();
    }
}
