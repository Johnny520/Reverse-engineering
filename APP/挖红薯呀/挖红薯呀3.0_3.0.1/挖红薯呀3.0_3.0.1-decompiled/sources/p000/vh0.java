package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class vh0 {

    /* JADX INFO: renamed from: d */
    public static final vh0 f6718d;

    /* JADX INFO: renamed from: e */
    public static final vh0 f6719e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ vh0[] f6720f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        vh0 vh0Var = new vh0("Default", 0);
        f6718d = vh0Var;
        vh0 vh0Var2 = new vh0("UserInput", 1);
        f6719e = vh0Var2;
        f6720f = new vh0[]{vh0Var, vh0Var2, new vh0("PreventUserInput", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vh0 valueOf(String str) {
        return (vh0) Enum.valueOf(vh0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vh0[] values() {
        return (vh0[]) f6720f.clone();
    }
}
