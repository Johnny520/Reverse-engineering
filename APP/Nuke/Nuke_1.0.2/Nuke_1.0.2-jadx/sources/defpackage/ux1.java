package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ux1 {
    public static final ux1 h;
    public static final /* synthetic */ ux1[] i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ux1 ux1Var = new ux1("CounterClockwise", 0);
        h = ux1Var;
        i = new ux1[]{ux1Var, new ux1("Clockwise", 1)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ux1 valueOf(String str) {
        return (ux1) Enum.valueOf(ux1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ux1[] values() {
        return (ux1[]) i.clone();
    }
}
