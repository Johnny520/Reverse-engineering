package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g82 {

    /* JADX INFO: renamed from: h */
    public static final g82 f3352h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ g82[] f3353i;

    static {
        g82 g82Var = new g82("Restart", 0);
        f3352h = g82Var;
        f3353i = new g82[]{g82Var, new g82("Reverse", 1)};
    }

    public static g82 valueOf(String str) {
        return (g82) Enum.valueOf(g82.class, str);
    }

    public static g82[] values() {
        return (g82[]) f3353i.clone();
    }
}
