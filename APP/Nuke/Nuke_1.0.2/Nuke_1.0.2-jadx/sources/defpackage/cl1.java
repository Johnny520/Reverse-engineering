package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cl1 {
    public static final cl1 h;
    public static final /* synthetic */ cl1[] i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        cl1 cl1Var = new cl1("Default", 0);
        h = cl1Var;
        i = new cl1[]{cl1Var, new cl1("UserInput", 1), new cl1("PreventUserInput", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cl1 valueOf(String str) {
        return (cl1) Enum.valueOf(cl1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cl1[] values() {
        return (cl1[]) i.clone();
    }
}
