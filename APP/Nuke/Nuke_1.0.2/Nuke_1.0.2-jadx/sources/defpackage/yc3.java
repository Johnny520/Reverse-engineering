package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yc3 {
    public static final yc3 h;
    public static final yc3 i;
    public static final yc3 j;
    public static final yc3 k;
    public static final /* synthetic */ yc3[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        yc3 yc3Var = new yc3("GET_FRIENDS", 0);
        h = yc3Var;
        yc3 yc3Var2 = new yc3("GET_GROUPS", 1);
        i = yc3Var2;
        yc3 yc3Var3 = new yc3("GET_OFFICIAL_ACCOUNTS", 2);
        j = yc3Var3;
        yc3 yc3Var4 = new yc3("GET_MESSAGE_BY_SERVER_ID", 3);
        k = yc3Var4;
        l = new yc3[]{yc3Var, yc3Var2, yc3Var3, yc3Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static yc3 valueOf(String str) {
        return (yc3) Enum.valueOf(yc3.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static yc3[] values() {
        return (yc3[]) l.clone();
    }
}
