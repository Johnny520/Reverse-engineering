package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class od1 {

    /* JADX INFO: renamed from: h */
    public static final od1 f7634h;

    /* JADX INFO: renamed from: i */
    public static final od1 f7635i;

    /* JADX INFO: renamed from: j */
    public static final od1 f7636j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ od1[] f7637k;

    static {
        od1 od1Var = new od1("IsPlacedInLookahead", 0);
        f7634h = od1Var;
        od1 od1Var2 = new od1("IsPlacedInApproach", 1);
        f7635i = od1Var2;
        od1 od1Var3 = new od1("IsNotPlaced", 2);
        f7636j = od1Var3;
        f7637k = new od1[]{od1Var, od1Var2, od1Var3};
    }

    public static od1 valueOf(String str) {
        return (od1) Enum.valueOf(od1.class, str);
    }

    public static od1[] values() {
        return (od1[]) f7637k.clone();
    }
}
