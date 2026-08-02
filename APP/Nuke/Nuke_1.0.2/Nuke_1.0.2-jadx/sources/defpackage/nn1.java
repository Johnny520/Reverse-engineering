package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 {
    public static final nn1 h;
    public static final nn1 i;
    public static final nn1 j;
    public static final /* synthetic */ nn1[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        nn1 nn1Var = new nn1("ANY", 0);
        h = nn1Var;
        nn1 nn1Var2 = new nn1("EXACT", 1);
        i = nn1Var2;
        nn1 nn1Var3 = new nn1("SUBDOMAIN", 2);
        j = nn1Var3;
        k = new nn1[]{nn1Var, nn1Var2, nn1Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static nn1 valueOf(String str) {
        return (nn1) Enum.valueOf(nn1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static nn1[] values() {
        return (nn1[]) k.clone();
    }
}
