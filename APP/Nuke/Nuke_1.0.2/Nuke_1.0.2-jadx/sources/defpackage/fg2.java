package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fg2 {
    public static final fg2 h;
    public static final fg2 i;
    public static final fg2 j;
    public static final fg2 k;
    public static final /* synthetic */ fg2[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        fg2 fg2Var = new fg2("PACKAGE", 0);
        h = fg2Var;
        fg2 fg2Var2 = new fg2("DATA", 1);
        i = fg2Var2;
        fg2 fg2Var3 = new fg2("CACHE", 2);
        j = fg2Var3;
        fg2 fg2Var4 = new fg2("EXTERNAL", 3);
        k = fg2Var4;
        l = new fg2[]{fg2Var, fg2Var2, fg2Var3, fg2Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fg2 valueOf(String str) {
        return (fg2) Enum.valueOf(fg2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fg2[] values() {
        return (fg2[]) l.clone();
    }
}
