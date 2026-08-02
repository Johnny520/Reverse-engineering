package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class od1 {
    public static final od1 h;
    public static final od1 i;
    public static final od1 j;
    public static final /* synthetic */ od1[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        od1 od1Var = new od1("IsPlacedInLookahead", 0);
        h = od1Var;
        od1 od1Var2 = new od1("IsPlacedInApproach", 1);
        i = od1Var2;
        od1 od1Var3 = new od1("IsNotPlaced", 2);
        j = od1Var3;
        k = new od1[]{od1Var, od1Var2, od1Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static od1 valueOf(String str) {
        return (od1) Enum.valueOf(od1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static od1[] values() {
        return (od1[]) k.clone();
    }
}
