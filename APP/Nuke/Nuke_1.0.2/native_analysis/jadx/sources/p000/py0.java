package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class py0 {

    /* JADX INFO: renamed from: h */
    public static final py0 f8643h;

    /* JADX INFO: renamed from: i */
    public static final py0 f8644i;

    /* JADX INFO: renamed from: j */
    public static final py0 f8645j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ py0[] f8646k;

    static {
        py0 py0Var = new py0("Yes", 0);
        f8643h = py0Var;
        py0 py0Var2 = new py0("No", 1);
        f8644i = py0Var2;
        py0 py0Var3 = new py0("NotInitialized", 2);
        f8645j = py0Var3;
        f8646k = new py0[]{py0Var, py0Var2, py0Var3};
    }

    public static py0 valueOf(String str) {
        return (py0) Enum.valueOf(py0.class, str);
    }

    public static py0[] values() {
        return (py0[]) f8646k.clone();
    }
}
