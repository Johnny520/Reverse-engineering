package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fp1 {
    public static final fp1 h;
    public static final fp1 i;
    public static final fp1 j;
    public static final /* synthetic */ fp1[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        fp1 fp1Var = new fp1("Revealing", 0);
        h = fp1Var;
        fp1 fp1Var2 = new fp1("Concealing", 1);
        i = fp1Var2;
        fp1 fp1Var3 = new fp1("PredictiveConcealing", 2);
        j = fp1Var3;
        k = new fp1[]{fp1Var, fp1Var2, fp1Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fp1 valueOf(String str) {
        return (fp1) Enum.valueOf(fp1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fp1[] values() {
        return (fp1[]) k.clone();
    }
}
