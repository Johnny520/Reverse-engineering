package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s7 {
    public static final s7 h;
    public static final s7 i;
    public static final /* synthetic */ s7[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        s7 s7Var = new s7("SHOW_ORIGINAL", 0);
        h = s7Var;
        s7 s7Var2 = new s7("SHOW_TRANSLATED", 1);
        i = s7Var2;
        j = new s7[]{s7Var, s7Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static s7 valueOf(String str) {
        return (s7) Enum.valueOf(s7.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static s7[] values() {
        return (s7[]) j.clone();
    }
}
