package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x62 {

    /* JADX INFO: renamed from: h */
    public static final j51 f12850h;

    /* JADX INFO: renamed from: i */
    public static final x62 f12851i;

    /* JADX INFO: renamed from: j */
    public static final x62 f12852j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ x62[] f12853k;

    static {
        x62 x62Var = new x62("FOLLOW", 0);
        f12851i = x62Var;
        x62 x62Var2 = new x62("ERROR", 1);
        f12852j = x62Var2;
        f12853k = new x62[]{x62Var, x62Var2};
        f12850h = new j51(16);
    }

    public static x62 valueOf(String str) {
        return (x62) Enum.valueOf(x62.class, str);
    }

    public static x62[] values() {
        return (x62[]) f12853k.clone();
    }
}
