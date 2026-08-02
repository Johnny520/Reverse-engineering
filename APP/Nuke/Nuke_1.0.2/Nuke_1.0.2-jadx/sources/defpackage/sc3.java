package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sc3 {
    public static final sc3 h;
    public static final sc3 i;
    public static final sc3 j;
    public static final /* synthetic */ sc3[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        sc3 sc3Var = new sc3("FRIEND", 0);
        h = sc3Var;
        sc3 sc3Var2 = new sc3("GROUP", 1);
        i = sc3Var2;
        sc3 sc3Var3 = new sc3("OFFICIAL_ACCOUNT", 2);
        j = sc3Var3;
        k = new sc3[]{sc3Var, sc3Var2, sc3Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sc3 valueOf(String str) {
        return (sc3) Enum.valueOf(sc3.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sc3[] values() {
        return (sc3[]) k.clone();
    }
}
