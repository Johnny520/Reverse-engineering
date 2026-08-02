package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xj2 {

    /* JADX INFO: renamed from: h */
    public static final xj2 f13059h;

    /* JADX INFO: renamed from: i */
    public static final xj2 f13060i;

    /* JADX INFO: renamed from: j */
    public static final xj2 f13061j;

    /* JADX INFO: renamed from: k */
    public static final xj2 f13062k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ xj2[] f13063l;

    static {
        xj2 xj2Var = new xj2("START", 0);
        f13059h = xj2Var;
        xj2 xj2Var2 = new xj2("STOP", 1);
        f13060i = xj2Var2;
        xj2 xj2Var3 = new xj2("RESTART", 2);
        f13061j = xj2Var3;
        xj2 xj2Var4 = new xj2("STOP_ALL", 3);
        f13062k = xj2Var4;
        f13063l = new xj2[]{xj2Var, xj2Var2, xj2Var3, xj2Var4};
    }

    public static xj2 valueOf(String str) {
        return (xj2) Enum.valueOf(xj2.class, str);
    }

    public static xj2[] values() {
        return (xj2[]) f13063l.clone();
    }
}
