package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hf2 {

    /* JADX INFO: renamed from: h */
    public static final hf2 f3993h;

    /* JADX INFO: renamed from: i */
    public static final hf2 f3994i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ hf2[] f3995j;

    static {
        hf2 hf2Var = new hf2("WARNING", 0);
        f3993h = hf2Var;
        hf2 hf2Var2 = new hf2("ERROR", 1);
        f3994i = hf2Var2;
        f3995j = new hf2[]{hf2Var, hf2Var2};
    }

    public static hf2 valueOf(String str) {
        return (hf2) Enum.valueOf(hf2.class, str);
    }

    public static hf2[] values() {
        return (hf2[]) f3995j.clone();
    }
}
