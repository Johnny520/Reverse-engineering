package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yc3 {

    /* JADX INFO: renamed from: h */
    public static final yc3 f13408h;

    /* JADX INFO: renamed from: i */
    public static final yc3 f13409i;

    /* JADX INFO: renamed from: j */
    public static final yc3 f13410j;

    /* JADX INFO: renamed from: k */
    public static final yc3 f13411k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ yc3[] f13412l;

    static {
        yc3 yc3Var = new yc3("GET_FRIENDS", 0);
        f13408h = yc3Var;
        yc3 yc3Var2 = new yc3("GET_GROUPS", 1);
        f13409i = yc3Var2;
        yc3 yc3Var3 = new yc3("GET_OFFICIAL_ACCOUNTS", 2);
        f13410j = yc3Var3;
        yc3 yc3Var4 = new yc3("GET_MESSAGE_BY_SERVER_ID", 3);
        f13411k = yc3Var4;
        f13412l = new yc3[]{yc3Var, yc3Var2, yc3Var3, yc3Var4};
    }

    public static yc3 valueOf(String str) {
        return (yc3) Enum.valueOf(yc3.class, str);
    }

    public static yc3[] values() {
        return (yc3[]) f13412l.clone();
    }
}
