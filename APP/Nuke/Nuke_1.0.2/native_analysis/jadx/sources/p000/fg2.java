package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fg2 {

    /* JADX INFO: renamed from: h */
    public static final fg2 f2985h;

    /* JADX INFO: renamed from: i */
    public static final fg2 f2986i;

    /* JADX INFO: renamed from: j */
    public static final fg2 f2987j;

    /* JADX INFO: renamed from: k */
    public static final fg2 f2988k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ fg2[] f2989l;

    static {
        fg2 fg2Var = new fg2("PACKAGE", 0);
        f2985h = fg2Var;
        fg2 fg2Var2 = new fg2("DATA", 1);
        f2986i = fg2Var2;
        fg2 fg2Var3 = new fg2("CACHE", 2);
        f2987j = fg2Var3;
        fg2 fg2Var4 = new fg2("EXTERNAL", 3);
        f2988k = fg2Var4;
        f2989l = new fg2[]{fg2Var, fg2Var2, fg2Var3, fg2Var4};
    }

    public static fg2 valueOf(String str) {
        return (fg2) Enum.valueOf(fg2.class, str);
    }

    public static fg2[] values() {
        return (fg2[]) f2989l.clone();
    }
}
