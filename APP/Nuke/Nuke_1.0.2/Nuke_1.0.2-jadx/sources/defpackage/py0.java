package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class py0 {
    public static final py0 h;
    public static final py0 i;
    public static final py0 j;
    public static final /* synthetic */ py0[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        py0 py0Var = new py0("Yes", 0);
        h = py0Var;
        py0 py0Var2 = new py0("No", 1);
        i = py0Var2;
        py0 py0Var3 = new py0("NotInitialized", 2);
        j = py0Var3;
        k = new py0[]{py0Var, py0Var2, py0Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static py0 valueOf(String str) {
        return (py0) Enum.valueOf(py0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static py0[] values() {
        return (py0[]) k.clone();
    }
}
