package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ua0 {

    /* JADX INFO: renamed from: h */
    public static final ua0 f11190h;

    /* JADX INFO: renamed from: i */
    public static final ua0 f11191i;

    /* JADX INFO: renamed from: j */
    public static final ua0 f11192j;

    /* JADX INFO: renamed from: k */
    public static final ua0 f11193k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ ua0[] f11194l;

    static {
        ua0 ua0Var = new ua0("Up", 0);
        f11190h = ua0Var;
        ua0 ua0Var2 = new ua0("Drag", 1);
        f11191i = ua0Var2;
        ua0 ua0Var3 = new ua0("Timeout", 2);
        f11192j = ua0Var3;
        ua0 ua0Var4 = new ua0("Cancel", 3);
        f11193k = ua0Var4;
        f11194l = new ua0[]{ua0Var, ua0Var2, ua0Var3, ua0Var4};
    }

    public static ua0 valueOf(String str) {
        return (ua0) Enum.valueOf(ua0.class, str);
    }

    public static ua0[] values() {
        return (ua0[]) f11194l.clone();
    }
}
