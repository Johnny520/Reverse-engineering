package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class en2 {

    /* JADX INFO: renamed from: h */
    public static final en2 f2517h;

    /* JADX INFO: renamed from: i */
    public static final en2 f2518i;

    /* JADX INFO: renamed from: j */
    public static final en2 f2519j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ en2[] f2520k;

    static {
        en2 en2Var = new en2("Left", 0);
        f2517h = en2Var;
        en2 en2Var2 = new en2("Middle", 1);
        f2518i = en2Var2;
        en2 en2Var3 = new en2("Right", 2);
        f2519j = en2Var3;
        f2520k = new en2[]{en2Var, en2Var2, en2Var3};
    }

    public static en2 valueOf(String str) {
        return (en2) Enum.valueOf(en2.class, str);
    }

    public static en2[] values() {
        return (en2[]) f2520k.clone();
    }
}
