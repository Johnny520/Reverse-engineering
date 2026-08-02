package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u23 {
    public static final u23 h;
    public static final u23 i;
    public static final /* synthetic */ u23[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        u23 u23Var = new u23("On", 0);
        h = u23Var;
        u23 u23Var2 = new u23("Off", 1);
        i = u23Var2;
        j = new u23[]{u23Var, u23Var2, new u23("Indeterminate", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static u23 valueOf(String str) {
        return (u23) Enum.valueOf(u23.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static u23[] values() {
        return (u23[]) j.clone();
    }
}
