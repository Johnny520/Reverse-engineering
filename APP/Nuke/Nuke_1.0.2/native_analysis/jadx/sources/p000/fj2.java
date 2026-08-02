package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 {

    /* JADX INFO: renamed from: h */
    public static final fj2 f3017h;

    /* JADX INFO: renamed from: i */
    public static final fj2 f3018i;

    /* JADX INFO: renamed from: j */
    public static final fj2 f3019j;

    /* JADX INFO: renamed from: k */
    public static final fj2 f3020k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ fj2[] f3021l;

    static {
        fj2 fj2Var = new fj2("ALREADY_RUNNING", 0);
        f3017h = fj2Var;
        fj2 fj2Var2 = new fj2("SCRIPT_NOT_FOUND", 1);
        f3018i = fj2Var2;
        fj2 fj2Var3 = new fj2("DUPLICATE_ID", 2);
        f3019j = fj2Var3;
        fj2 fj2Var4 = new fj2("SCRIPT_CHANGED", 3);
        f3020k = fj2Var4;
        f3021l = new fj2[]{fj2Var, fj2Var2, fj2Var3, fj2Var4};
    }

    public static fj2 valueOf(String str) {
        return (fj2) Enum.valueOf(fj2.class, str);
    }

    public static fj2[] values() {
        return (fj2[]) f3021l.clone();
    }
}
