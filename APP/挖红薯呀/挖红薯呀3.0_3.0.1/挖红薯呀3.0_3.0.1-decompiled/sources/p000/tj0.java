package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class tj0 {

    /* JADX INFO: renamed from: d */
    public static final tj0 f6006d;

    /* JADX INFO: renamed from: e */
    public static final tj0 f6007e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ tj0[] f6008f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        tj0 tj0Var = new tj0("Min", 0);
        f6006d = tj0Var;
        tj0 tj0Var2 = new tj0("Max", 1);
        f6007e = tj0Var2;
        f6008f = new tj0[]{tj0Var, tj0Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static tj0 valueOf(String str) {
        return (tj0) Enum.valueOf(tj0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static tj0[] values() {
        return (tj0[]) f6008f.clone();
    }
}
