package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fp1 {

    /* JADX INFO: renamed from: h */
    public static final fp1 f3103h;

    /* JADX INFO: renamed from: i */
    public static final fp1 f3104i;

    /* JADX INFO: renamed from: j */
    public static final fp1 f3105j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ fp1[] f3106k;

    static {
        fp1 fp1Var = new fp1("Revealing", 0);
        f3103h = fp1Var;
        fp1 fp1Var2 = new fp1("Concealing", 1);
        f3104i = fp1Var2;
        fp1 fp1Var3 = new fp1("PredictiveConcealing", 2);
        f3105j = fp1Var3;
        f3106k = new fp1[]{fp1Var, fp1Var2, fp1Var3};
    }

    public static fp1 valueOf(String str) {
        return (fp1) Enum.valueOf(fp1.class, str);
    }

    public static fp1[] values() {
        return (fp1[]) f3106k.clone();
    }
}
