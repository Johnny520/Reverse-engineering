package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ag2 {
    public static final ag2 h;
    public static final ag2 i;
    public static final /* synthetic */ ag2[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ag2 ag2Var = new ag2("INVALID_SCRIPT", 0);
        h = ag2Var;
        ag2 ag2Var2 = new ag2("DUPLICATE_ID", 1);
        i = ag2Var2;
        j = new ag2[]{ag2Var, ag2Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ag2 valueOf(String str) {
        return (ag2) Enum.valueOf(ag2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ag2[] values() {
        return (ag2[]) j.clone();
    }
}
