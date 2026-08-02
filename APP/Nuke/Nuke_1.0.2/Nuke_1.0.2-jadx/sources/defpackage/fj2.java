package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 {
    public static final fj2 h;
    public static final fj2 i;
    public static final fj2 j;
    public static final fj2 k;
    public static final /* synthetic */ fj2[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        fj2 fj2Var = new fj2("ALREADY_RUNNING", 0);
        h = fj2Var;
        fj2 fj2Var2 = new fj2("SCRIPT_NOT_FOUND", 1);
        i = fj2Var2;
        fj2 fj2Var3 = new fj2("DUPLICATE_ID", 2);
        j = fj2Var3;
        fj2 fj2Var4 = new fj2("SCRIPT_CHANGED", 3);
        k = fj2Var4;
        l = new fj2[]{fj2Var, fj2Var2, fj2Var3, fj2Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fj2 valueOf(String str) {
        return (fj2) Enum.valueOf(fj2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fj2[] values() {
        return (fj2[]) l.clone();
    }
}
