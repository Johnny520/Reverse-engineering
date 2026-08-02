package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ux1 {

    /* JADX INFO: renamed from: h */
    public static final ux1 f11544h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ ux1[] f11545i;

    static {
        ux1 ux1Var = new ux1("CounterClockwise", 0);
        f11544h = ux1Var;
        f11545i = new ux1[]{ux1Var, new ux1("Clockwise", 1)};
    }

    public static ux1 valueOf(String str) {
        return (ux1) Enum.valueOf(ux1.class, str);
    }

    public static ux1[] values() {
        return (ux1[]) f11545i.clone();
    }
}
