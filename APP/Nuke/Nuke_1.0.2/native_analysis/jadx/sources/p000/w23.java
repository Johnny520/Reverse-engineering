package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w23 {

    /* JADX INFO: renamed from: h */
    public static final w23 f12277h;

    /* JADX INFO: renamed from: i */
    public static final w23 f12278i;

    /* JADX INFO: renamed from: j */
    public static final w23 f12279j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ w23[] f12280k;

    static {
        w23 w23Var = new w23("Uninitialized", 0);
        f12277h = w23Var;
        w23 w23Var2 = new w23("Detached", 1);
        f12278i = w23Var2;
        w23 w23Var3 = new w23("Attached", 2);
        f12279j = w23Var3;
        f12280k = new w23[]{w23Var, w23Var2, w23Var3};
    }

    public static w23 valueOf(String str) {
        return (w23) Enum.valueOf(w23.class, str);
    }

    public static w23[] values() {
        return (w23[]) f12280k.clone();
    }
}
