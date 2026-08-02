package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w23 {
    public static final w23 h;
    public static final w23 i;
    public static final w23 j;
    public static final /* synthetic */ w23[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        w23 w23Var = new w23("Uninitialized", 0);
        h = w23Var;
        w23 w23Var2 = new w23("Detached", 1);
        i = w23Var2;
        w23 w23Var3 = new w23("Attached", 2);
        j = w23Var3;
        k = new w23[]{w23Var, w23Var2, w23Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w23 valueOf(String str) {
        return (w23) Enum.valueOf(w23.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w23[] values() {
        return (w23[]) k.clone();
    }
}
