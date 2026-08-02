package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i12 {

    /* JADX INFO: renamed from: h */
    public static final i12 f4216h;

    /* JADX INFO: renamed from: i */
    public static final i12 f4217i;

    /* JADX INFO: renamed from: j */
    public static final i12 f4218j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ i12[] f4219k;

    static {
        i12 i12Var = new i12("Initial", 0);
        f4216h = i12Var;
        i12 i12Var2 = new i12("Main", 1);
        f4217i = i12Var2;
        i12 i12Var3 = new i12("Final", 2);
        f4218j = i12Var3;
        f4219k = new i12[]{i12Var, i12Var2, i12Var3};
    }

    public static i12 valueOf(String str) {
        return (i12) Enum.valueOf(i12.class, str);
    }

    public static i12[] values() {
        return (i12[]) f4219k.clone();
    }
}
