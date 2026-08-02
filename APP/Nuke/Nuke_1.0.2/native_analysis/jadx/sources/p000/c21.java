package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c21 {

    /* JADX INFO: renamed from: h */
    public static final c21 f1110h;

    /* JADX INFO: renamed from: i */
    public static final c21 f1111i;

    /* JADX INFO: renamed from: j */
    public static final c21 f1112j;

    /* JADX INFO: renamed from: k */
    public static final c21 f1113k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ c21[] f1114l;

    static {
        c21 c21Var = new c21("IGNORED", 0);
        f1110h = c21Var;
        c21 c21Var2 = new c21("SCHEDULED", 1);
        f1111i = c21Var2;
        c21 c21Var3 = new c21("DEFERRED", 2);
        f1112j = c21Var3;
        c21 c21Var4 = new c21("IMMINENT", 3);
        f1113k = c21Var4;
        f1114l = new c21[]{c21Var, c21Var2, c21Var3, c21Var4};
    }

    public static c21 valueOf(String str) {
        return (c21) Enum.valueOf(c21.class, str);
    }

    public static c21[] values() {
        return (c21[]) f1114l.clone();
    }
}
