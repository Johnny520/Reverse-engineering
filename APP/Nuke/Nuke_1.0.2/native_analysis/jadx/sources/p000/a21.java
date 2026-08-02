package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a21 {

    /* JADX INFO: renamed from: h */
    public static final a21 f36h;

    /* JADX INFO: renamed from: i */
    public static final a21 f37i;

    /* JADX INFO: renamed from: j */
    public static final a21 f38j;

    /* JADX INFO: renamed from: k */
    public static final a21 f39k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ a21[] f40l;

    static {
        a21 a21Var = new a21("LookaheadMeasurement", 0);
        f36h = a21Var;
        a21 a21Var2 = new a21("LookaheadPlacement", 1);
        f37i = a21Var2;
        a21 a21Var3 = new a21("Measurement", 2);
        f38j = a21Var3;
        a21 a21Var4 = new a21("Placement", 3);
        f39k = a21Var4;
        f40l = new a21[]{a21Var, a21Var2, a21Var3, a21Var4};
    }

    public static a21 valueOf(String str) {
        return (a21) Enum.valueOf(a21.class, str);
    }

    public static a21[] values() {
        return (a21[]) f40l.clone();
    }
}
