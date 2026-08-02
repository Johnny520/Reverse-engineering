package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t80 {
    public static final t80 h;
    public static final t80 i;
    public static final t80 j;
    public static final /* synthetic */ t80[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        t80 t80Var = new t80("Vertical", 0);
        h = t80Var;
        t80 t80Var2 = new t80("Horizontal", 1);
        i = t80Var2;
        t80 t80Var3 = new t80("Both", 2);
        j = t80Var3;
        k = new t80[]{t80Var, t80Var2, t80Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t80 valueOf(String str) {
        return (t80) Enum.valueOf(t80.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static t80[] values() {
        return (t80[]) k.clone();
    }
}
