package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 {

    /* JADX INFO: renamed from: h */
    public static final bl1 f932h;

    /* JADX INFO: renamed from: i */
    public static final bl1 f933i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ bl1[] f934j;

    static {
        bl1 bl1Var = new bl1("Default", 0);
        f932h = bl1Var;
        bl1 bl1Var2 = new bl1("UserInput", 1);
        f933i = bl1Var2;
        f934j = new bl1[]{bl1Var, bl1Var2, new bl1("PreventUserInput", 2)};
    }

    public static bl1 valueOf(String str) {
        return (bl1) Enum.valueOf(bl1.class, str);
    }

    public static bl1[] values() {
        return (bl1[]) f934j.clone();
    }
}
