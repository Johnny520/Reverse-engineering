package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p03 {
    public static final p03 h;
    public static final p03 i;
    public static final p03 j;
    public static final p03 k;
    public static final /* synthetic */ p03[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        p03 p03Var = new p03("StartInput", 0);
        h = p03Var;
        p03 p03Var2 = new p03("StopInput", 1);
        i = p03Var2;
        p03 p03Var3 = new p03("ShowKeyboard", 2);
        j = p03Var3;
        p03 p03Var4 = new p03("HideKeyboard", 3);
        k = p03Var4;
        l = new p03[]{p03Var, p03Var2, p03Var3, p03Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static p03 valueOf(String str) {
        return (p03) Enum.valueOf(p03.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static p03[] values() {
        return (p03[]) l.clone();
    }
}
