package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tr0 {
    public static final tr0 h;
    public static final tr0 i;
    public static final tr0 j;
    public static final /* synthetic */ tr0[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        tr0 tr0Var = new tr0("None", 0);
        h = tr0Var;
        tr0 tr0Var2 = new tr0("Selection", 1);
        i = tr0Var2;
        tr0 tr0Var3 = new tr0("Cursor", 2);
        j = tr0Var3;
        k = new tr0[]{tr0Var, tr0Var2, tr0Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static tr0 valueOf(String str) {
        return (tr0) Enum.valueOf(tr0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static tr0[] values() {
        return (tr0[]) k.clone();
    }
}
