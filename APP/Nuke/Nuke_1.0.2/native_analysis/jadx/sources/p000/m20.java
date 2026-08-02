package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m20 {

    /* JADX INFO: renamed from: h */
    public static final m20 f6440h;

    /* JADX INFO: renamed from: i */
    public static final m20 f6441i;

    /* JADX INFO: renamed from: j */
    public static final m20 f6442j;

    /* JADX INFO: renamed from: k */
    public static final m20 f6443k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ m20[] f6444l;

    static {
        m20 m20Var = new m20("DEFAULT", 0);
        f6440h = m20Var;
        m20 m20Var2 = new m20("LAZY", 1);
        f6441i = m20Var2;
        m20 m20Var3 = new m20("ATOMIC", 2);
        f6442j = m20Var3;
        m20 m20Var4 = new m20("UNDISPATCHED", 3);
        f6443k = m20Var4;
        f6444l = new m20[]{m20Var, m20Var2, m20Var3, m20Var4};
    }

    public static m20 valueOf(String str) {
        return (m20) Enum.valueOf(m20.class, str);
    }

    public static m20[] values() {
        return (m20[]) f6444l.clone();
    }
}
