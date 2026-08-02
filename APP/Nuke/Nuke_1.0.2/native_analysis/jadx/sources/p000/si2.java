package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class si2 {

    /* JADX INFO: renamed from: h */
    public static final si2 f10152h;

    /* JADX INFO: renamed from: i */
    public static final si2 f10153i;

    /* JADX INFO: renamed from: j */
    public static final si2 f10154j;

    /* JADX INFO: renamed from: k */
    public static final si2 f10155k;

    /* JADX INFO: renamed from: l */
    public static final si2 f10156l;

    /* JADX INFO: renamed from: m */
    public static final si2 f10157m;

    /* JADX INFO: renamed from: n */
    public static final si2 f10158n;

    /* JADX INFO: renamed from: o */
    public static final si2 f10159o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ si2[] f10160p;

    static {
        si2 si2Var = new si2("DISCOVER", 0);
        f10152h = si2Var;
        si2 si2Var2 = new si2("READ", 1);
        f10153i = si2Var2;
        si2 si2Var3 = new si2("VALIDATE", 2);
        f10154j = si2Var3;
        si2 si2Var4 = new si2("RUNTIME_CREATE", 3);
        f10155k = si2Var4;
        si2 si2Var5 = new si2("MODULE_REGISTER", 4);
        f10156l = si2Var5;
        si2 si2Var6 = new si2("BOOTSTRAP", 5);
        f10157m = si2Var6;
        si2 si2Var7 = new si2("EVALUATE", 6);
        si2 si2Var8 = new si2("EVENT_DISPATCH", 7);
        f10158n = si2Var8;
        si2 si2Var9 = new si2("SHUTDOWN", 8);
        f10159o = si2Var9;
        f10160p = new si2[]{si2Var, si2Var2, si2Var3, si2Var4, si2Var5, si2Var6, si2Var7, si2Var8, si2Var9};
    }

    public static si2 valueOf(String str) {
        return (si2) Enum.valueOf(si2.class, str);
    }

    public static si2[] values() {
        return (si2[]) f10160p.clone();
    }
}
