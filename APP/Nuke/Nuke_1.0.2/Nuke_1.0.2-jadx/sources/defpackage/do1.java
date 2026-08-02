package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class do1 {
    public static final do1 h;
    public static final do1 i;
    public static final /* synthetic */ do1[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        do1 do1Var = new do1("Width", 0);
        h = do1Var;
        do1 do1Var2 = new do1("Height", 1);
        i = do1Var2;
        j = new do1[]{do1Var, do1Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static do1 valueOf(String str) {
        return (do1) Enum.valueOf(do1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static do1[] values() {
        return (do1[]) j.clone();
    }
}
