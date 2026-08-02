package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c43 {
    public static final c43 h;
    public static final c43 i;
    public static final c43 j;
    public static final /* synthetic */ c43[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c43 c43Var = new c43("ContinueTraversal", 0);
        h = c43Var;
        c43 c43Var2 = new c43("SkipSubtreeAndContinueTraversal", 1);
        i = c43Var2;
        c43 c43Var3 = new c43("CancelTraversal", 2);
        j = c43Var3;
        k = new c43[]{c43Var, c43Var2, c43Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c43 valueOf(String str) {
        return (c43) Enum.valueOf(c43.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c43[] values() {
        return (c43[]) k.clone();
    }
}
