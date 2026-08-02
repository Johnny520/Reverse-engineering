package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w30 {

    /* JADX INFO: renamed from: h */
    public static final w30 f12288h;

    /* JADX INFO: renamed from: i */
    public static final w30 f12289i;

    /* JADX INFO: renamed from: j */
    public static final w30 f12290j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ w30[] f12291k;

    static {
        w30 w30Var = new w30("None", 0);
        f12288h = w30Var;
        w30 w30Var2 = new w30("Cancelled", 1);
        f12289i = w30Var2;
        w30 w30Var3 = new w30("Redirected", 2);
        f12290j = w30Var3;
        f12291k = new w30[]{w30Var, w30Var2, w30Var3, new w30("RedirectCancelled", 3)};
    }

    public static w30 valueOf(String str) {
        return (w30) Enum.valueOf(w30.class, str);
    }

    public static w30[] values() {
        return (w30[]) f12291k.clone();
    }
}
