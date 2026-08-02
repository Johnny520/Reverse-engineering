package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a21 {
    public static final a21 h;
    public static final a21 i;
    public static final a21 j;
    public static final a21 k;
    public static final /* synthetic */ a21[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        a21 a21Var = new a21("LookaheadMeasurement", 0);
        h = a21Var;
        a21 a21Var2 = new a21("LookaheadPlacement", 1);
        i = a21Var2;
        a21 a21Var3 = new a21("Measurement", 2);
        j = a21Var3;
        a21 a21Var4 = new a21("Placement", 3);
        k = a21Var4;
        l = new a21[]{a21Var, a21Var2, a21Var3, a21Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a21 valueOf(String str) {
        return (a21) Enum.valueOf(a21.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a21[] values() {
        return (a21[]) l.clone();
    }
}
