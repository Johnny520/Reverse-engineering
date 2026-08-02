package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qv1 {
    public static final qv1 h;
    public static final qv1 i;
    public static final /* synthetic */ qv1[] j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        qv1 qv1Var = new qv1("Vertical", 0);
        h = qv1Var;
        qv1 qv1Var2 = new qv1("Horizontal", 1);
        i = qv1Var2;
        j = new qv1[]{qv1Var, qv1Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static qv1 valueOf(String str) {
        return (qv1) Enum.valueOf(qv1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static qv1[] values() {
        return (qv1[]) j.clone();
    }
}
