package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class do1 {

    /* JADX INFO: renamed from: h */
    public static final do1 f2128h;

    /* JADX INFO: renamed from: i */
    public static final do1 f2129i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ do1[] f2130j;

    static {
        do1 do1Var = new do1("Width", 0);
        f2128h = do1Var;
        do1 do1Var2 = new do1("Height", 1);
        f2129i = do1Var2;
        f2130j = new do1[]{do1Var, do1Var2};
    }

    public static do1 valueOf(String str) {
        return (do1) Enum.valueOf(do1.class, str);
    }

    public static do1[] values() {
        return (do1[]) f2130j.clone();
    }
}
