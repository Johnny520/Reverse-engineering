package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y41 {
    public static final y41 h;
    public static final /* synthetic */ y41[] i;

    /* JADX INFO: Fake field, exist only in values array */
    y41 EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        y41 y41Var = new y41("DEBUG", 0);
        y41 y41Var2 = new y41("INFO", 1);
        y41 y41Var3 = new y41("WARN", 2);
        h = y41Var3;
        i = new y41[]{y41Var, y41Var2, y41Var3, new y41("ERROR", 3), new y41("OFF", 4)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static y41 valueOf(String str) {
        return (y41) Enum.valueOf(y41.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static y41[] values() {
        return (y41[]) i.clone();
    }
}
