package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c21 {
    public static final c21 h;
    public static final c21 i;
    public static final c21 j;
    public static final c21 k;
    public static final /* synthetic */ c21[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c21 c21Var = new c21("IGNORED", 0);
        h = c21Var;
        c21 c21Var2 = new c21("SCHEDULED", 1);
        i = c21Var2;
        c21 c21Var3 = new c21("DEFERRED", 2);
        j = c21Var3;
        c21 c21Var4 = new c21("IMMINENT", 3);
        k = c21Var4;
        l = new c21[]{c21Var, c21Var2, c21Var3, c21Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c21 valueOf(String str) {
        return (c21) Enum.valueOf(c21.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c21[] values() {
        return (c21[]) l.clone();
    }
}
