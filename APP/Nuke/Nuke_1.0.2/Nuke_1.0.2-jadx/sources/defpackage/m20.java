package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m20 {
    public static final m20 h;
    public static final m20 i;
    public static final m20 j;
    public static final m20 k;
    public static final /* synthetic */ m20[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        m20 m20Var = new m20("DEFAULT", 0);
        h = m20Var;
        m20 m20Var2 = new m20("LAZY", 1);
        i = m20Var2;
        m20 m20Var3 = new m20("ATOMIC", 2);
        j = m20Var3;
        m20 m20Var4 = new m20("UNDISPATCHED", 3);
        k = m20Var4;
        l = new m20[]{m20Var, m20Var2, m20Var3, m20Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m20 valueOf(String str) {
        return (m20) Enum.valueOf(m20.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m20[] values() {
        return (m20[]) l.clone();
    }
}
