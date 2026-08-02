package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tr0 {

    /* JADX INFO: renamed from: h */
    public static final tr0 f10906h;

    /* JADX INFO: renamed from: i */
    public static final tr0 f10907i;

    /* JADX INFO: renamed from: j */
    public static final tr0 f10908j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ tr0[] f10909k;

    static {
        tr0 tr0Var = new tr0("None", 0);
        f10906h = tr0Var;
        tr0 tr0Var2 = new tr0("Selection", 1);
        f10907i = tr0Var2;
        tr0 tr0Var3 = new tr0("Cursor", 2);
        f10908j = tr0Var3;
        f10909k = new tr0[]{tr0Var, tr0Var2, tr0Var3};
    }

    public static tr0 valueOf(String str) {
        return (tr0) Enum.valueOf(tr0.class, str);
    }

    public static tr0[] values() {
        return (tr0[]) f10909k.clone();
    }
}
