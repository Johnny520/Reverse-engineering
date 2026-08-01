package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class q90 {
    private static final /* synthetic */ InterfaceC0974ys $ENTRIES;
    private static final /* synthetic */ q90[] $VALUES;
    public static final o90 Companion;
    public static final q90 ON_ANY;
    public static final q90 ON_CREATE;
    public static final q90 ON_DESTROY;
    public static final q90 ON_PAUSE;
    public static final q90 ON_RESUME;
    public static final q90 ON_START;
    public static final q90 ON_STOP;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        q90 q90Var = new q90("ON_CREATE", 0);
        ON_CREATE = q90Var;
        q90 q90Var2 = new q90("ON_START", 1);
        ON_START = q90Var2;
        q90 q90Var3 = new q90("ON_RESUME", 2);
        ON_RESUME = q90Var3;
        q90 q90Var4 = new q90("ON_PAUSE", 3);
        ON_PAUSE = q90Var4;
        q90 q90Var5 = new q90("ON_STOP", 4);
        ON_STOP = q90Var5;
        q90 q90Var6 = new q90("ON_DESTROY", 5);
        ON_DESTROY = q90Var6;
        q90 q90Var7 = new q90("ON_ANY", 6);
        ON_ANY = q90Var7;
        q90[] q90VarArr = {q90Var, q90Var2, q90Var3, q90Var4, q90Var5, q90Var6, q90Var7};
        $VALUES = q90VarArr;
        $ENTRIES = new C1015zs(q90VarArr);
        Companion = new o90();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q90 valueOf(String str) {
        return (q90) Enum.valueOf(q90.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static q90[] values() {
        return (q90[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final r90 m3210a() {
        switch (p90.f4786a[ordinal()]) {
            case 1:
            case 2:
                return r90.f5334f;
            case 3:
            case 4:
                return r90.f5335g;
            case 5:
                return r90.f5336h;
            case 6:
                return r90.f5332d;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                C0921xc.m5129j();
                return null;
        }
    }
}
