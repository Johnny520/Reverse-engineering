package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w30 {
    public static final w30 h;
    public static final w30 i;
    public static final w30 j;
    public static final /* synthetic */ w30[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        w30 w30Var = new w30("None", 0);
        h = w30Var;
        w30 w30Var2 = new w30("Cancelled", 1);
        i = w30Var2;
        w30 w30Var3 = new w30("Redirected", 2);
        j = w30Var3;
        k = new w30[]{w30Var, w30Var2, w30Var3, new w30("RedirectCancelled", 3)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w30 valueOf(String str) {
        return (w30) Enum.valueOf(w30.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w30[] values() {
        return (w30[]) k.clone();
    }
}
