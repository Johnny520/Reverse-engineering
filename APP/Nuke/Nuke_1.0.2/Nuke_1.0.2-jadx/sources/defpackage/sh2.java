package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sh2 {
    public static final sh2 h;
    public static final sh2 i;
    public static final sh2 j;
    public static final /* synthetic */ sh2[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        sh2 sh2Var = new sh2("ENGINE", 0);
        h = sh2Var;
        sh2 sh2Var2 = new sh2("RUNTIME", 1);
        i = sh2Var2;
        sh2 sh2Var3 = new sh2("SCRIPT", 2);
        j = sh2Var3;
        k = new sh2[]{sh2Var, sh2Var2, sh2Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sh2 valueOf(String str) {
        return (sh2) Enum.valueOf(sh2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sh2[] values() {
        return (sh2[]) k.clone();
    }
}
