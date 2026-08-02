package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f62 {

    /* JADX INFO: renamed from: h */
    public static final f62 f2816h;

    /* JADX INFO: renamed from: i */
    public static final f62 f2817i;

    /* JADX INFO: renamed from: j */
    public static final f62 f2818j;

    /* JADX INFO: renamed from: k */
    public static final f62 f2819k;

    /* JADX INFO: renamed from: l */
    public static final f62 f2820l;

    /* JADX INFO: renamed from: m */
    public static final f62 f2821m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ f62[] f2822n;

    static {
        f62 f62Var = new f62("ShutDown", 0);
        f2816h = f62Var;
        f62 f62Var2 = new f62("ShuttingDown", 1);
        f2817i = f62Var2;
        f62 f62Var3 = new f62("Inactive", 2);
        f2818j = f62Var3;
        f62 f62Var4 = new f62("InactivePendingWork", 3);
        f2819k = f62Var4;
        f62 f62Var5 = new f62("Idle", 4);
        f2820l = f62Var5;
        f62 f62Var6 = new f62("PendingWork", 5);
        f2821m = f62Var6;
        f2822n = new f62[]{f62Var, f62Var2, f62Var3, f62Var4, f62Var5, f62Var6};
    }

    public static f62 valueOf(String str) {
        return (f62) Enum.valueOf(f62.class, str);
    }

    public static f62[] values() {
        return (f62[]) f2822n.clone();
    }
}
