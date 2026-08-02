package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n22 {
    public static final n22 h;
    public static final /* synthetic */ n22[] i;

    /* JADX INFO: Fake field, exist only in values array */
    n22 EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        n22 n22Var = new n22("SRGB", 0);
        n22 n22Var2 = new n22("DISPLAY_P3", 1);
        h = n22Var2;
        i = new n22[]{n22Var, n22Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n22 valueOf(String str) {
        return (n22) Enum.valueOf(n22.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n22[] values() {
        return (n22[]) i.clone();
    }
}
