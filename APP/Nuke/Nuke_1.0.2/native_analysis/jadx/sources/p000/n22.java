package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n22 {

    /* JADX INFO: renamed from: h */
    public static final n22 f6971h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ n22[] f6972i;

    /* JADX INFO: Fake field, exist only in values array */
    n22 EF0;

    static {
        n22 n22Var = new n22("SRGB", 0);
        n22 n22Var2 = new n22("DISPLAY_P3", 1);
        f6971h = n22Var2;
        f6972i = new n22[]{n22Var, n22Var2};
    }

    public static n22 valueOf(String str) {
        return (n22) Enum.valueOf(n22.class, str);
    }

    public static n22[] values() {
        return (n22[]) f6972i.clone();
    }
}
