package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hb0 {

    /* JADX INFO: renamed from: h */
    public static final hb0 f3939h;

    /* JADX INFO: renamed from: i */
    public static final hb0 f3940i;

    /* JADX INFO: renamed from: j */
    public static final hb0 f3941j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ hb0[] f3942k;

    static {
        hb0 hb0Var = new hb0("Yes", 0);
        f3939h = hb0Var;
        hb0 hb0Var2 = new hb0("No", 1);
        f3940i = hb0Var2;
        hb0 hb0Var3 = new hb0("NotInitialized", 2);
        f3941j = hb0Var3;
        f3942k = new hb0[]{hb0Var, hb0Var2, hb0Var3};
    }

    public static hb0 valueOf(String str) {
        return (hb0) Enum.valueOf(hb0.class, str);
    }

    public static hb0[] values() {
        return (hb0[]) f3942k.clone();
    }
}
