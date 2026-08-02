package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p61 {
    public static final p61 h;
    public static final p61 i;
    public static final p61 j;
    public static final /* synthetic */ p61[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        p61 p61Var = new p61("InMeasureBlock", 0);
        h = p61Var;
        p61 p61Var2 = new p61("InLayoutBlock", 1);
        i = p61Var2;
        p61 p61Var3 = new p61("NotUsed", 2);
        j = p61Var3;
        k = new p61[]{p61Var, p61Var2, p61Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static p61 valueOf(String str) {
        return (p61) Enum.valueOf(p61.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static p61[] values() {
        return (p61[]) k.clone();
    }
}
