package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i91 {
    public static final i91 h;
    public static final i91 i;
    public static final /* synthetic */ i91[] j;

    /* JADX INFO: Fake field, exist only in values array */
    i91 EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        i91 i91Var = new i91("SYNCHRONIZED", 0);
        i91 i91Var2 = new i91("PUBLICATION", 1);
        h = i91Var2;
        i91 i91Var3 = new i91("NONE", 2);
        i = i91Var3;
        j = new i91[]{i91Var, i91Var2, i91Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i91 valueOf(String str) {
        return (i91) Enum.valueOf(i91.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i91[] values() {
        return (i91[]) j.clone();
    }
}
