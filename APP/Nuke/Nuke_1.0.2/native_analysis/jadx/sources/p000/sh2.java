package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sh2 {

    /* JADX INFO: renamed from: h */
    public static final sh2 f10145h;

    /* JADX INFO: renamed from: i */
    public static final sh2 f10146i;

    /* JADX INFO: renamed from: j */
    public static final sh2 f10147j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ sh2[] f10148k;

    static {
        sh2 sh2Var = new sh2("ENGINE", 0);
        f10145h = sh2Var;
        sh2 sh2Var2 = new sh2("RUNTIME", 1);
        f10146i = sh2Var2;
        sh2 sh2Var3 = new sh2("SCRIPT", 2);
        f10147j = sh2Var3;
        f10148k = new sh2[]{sh2Var, sh2Var2, sh2Var3};
    }

    public static sh2 valueOf(String str) {
        return (sh2) Enum.valueOf(sh2.class, str);
    }

    public static sh2[] values() {
        return (sh2[]) f10148k.clone();
    }
}
