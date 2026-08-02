package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 {

    /* JADX INFO: renamed from: h */
    public static final nn1 f7261h;

    /* JADX INFO: renamed from: i */
    public static final nn1 f7262i;

    /* JADX INFO: renamed from: j */
    public static final nn1 f7263j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ nn1[] f7264k;

    static {
        nn1 nn1Var = new nn1("ANY", 0);
        f7261h = nn1Var;
        nn1 nn1Var2 = new nn1("EXACT", 1);
        f7262i = nn1Var2;
        nn1 nn1Var3 = new nn1("SUBDOMAIN", 2);
        f7263j = nn1Var3;
        f7264k = new nn1[]{nn1Var, nn1Var2, nn1Var3};
    }

    public static nn1 valueOf(String str) {
        return (nn1) Enum.valueOf(nn1.class, str);
    }

    public static nn1[] values() {
        return (nn1[]) f7264k.clone();
    }
}
