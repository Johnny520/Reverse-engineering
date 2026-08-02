package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f62 {
    public static final f62 h;
    public static final f62 i;
    public static final f62 j;
    public static final f62 k;
    public static final f62 l;
    public static final f62 m;
    public static final /* synthetic */ f62[] n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f62 f62Var = new f62("ShutDown", 0);
        h = f62Var;
        f62 f62Var2 = new f62("ShuttingDown", 1);
        i = f62Var2;
        f62 f62Var3 = new f62("Inactive", 2);
        j = f62Var3;
        f62 f62Var4 = new f62("InactivePendingWork", 3);
        k = f62Var4;
        f62 f62Var5 = new f62("Idle", 4);
        l = f62Var5;
        f62 f62Var6 = new f62("PendingWork", 5);
        m = f62Var6;
        n = new f62[]{f62Var, f62Var2, f62Var3, f62Var4, f62Var5, f62Var6};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static f62 valueOf(String str) {
        return (f62) Enum.valueOf(f62.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static f62[] values() {
        return (f62[]) n.clone();
    }
}
