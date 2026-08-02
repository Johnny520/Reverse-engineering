package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ig2 {

    /* JADX INFO: renamed from: h */
    public static final ig2 f4607h;

    /* JADX INFO: renamed from: i */
    public static final ig2 f4608i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ ig2[] f4609j;

    static {
        ig2 ig2Var = new ig2("FILE", 0);
        f4607h = ig2Var;
        ig2 ig2Var2 = new ig2("DIRECTORY", 1);
        f4608i = ig2Var2;
        f4609j = new ig2[]{ig2Var, ig2Var2};
    }

    public static ig2 valueOf(String str) {
        return (ig2) Enum.valueOf(ig2.class, str);
    }

    public static ig2[] values() {
        return (ig2[]) f4609j.clone();
    }
}
